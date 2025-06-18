const fs = require('fs');
const path = require('path');

// Configuration
const ICONS_FOLDER = 'assets'; // Relative to project root
const OUTPUT_FILE = 'fluentui-icons-data.js';
const WATCH_MODE = process.argv.includes('--watch');

// Color codes for console output
const colors = {
    reset: '\x1b[0m',
    bright: '\x1b[1m',
    red: '\x1b[31m',
    green: '\x1b[32m',
    yellow: '\x1b[33m',
    blue: '\x1b[34m',
    magenta: '\x1b[35m',
    cyan: '\x1b[36m'
};

const log = {
    info: (msg) => console.log(`${colors.blue}ℹ${colors.reset} ${msg}`),
    success: (msg) => console.log(`${colors.green}✅${colors.reset} ${msg}`),
    warning: (msg) => console.log(`${colors.yellow}⚠️${colors.reset} ${msg}`),
    error: (msg) => console.log(`${colors.red}❌${colors.reset} ${msg}`),
    header: (msg) => console.log(`\n${colors.bright}${colors.cyan}${msg}${colors.reset}`),
    stat: (msg) => console.log(`${colors.magenta}📊${colors.reset} ${msg}`)
};

// Function to read SVG content and clean it
function readSvgContent(filePath) {
    try {
        let svgContent = fs.readFileSync(filePath, 'utf8');

        // Clean up the SVG content
        svgContent = svgContent.replace(/<\?xml[^>]*\?>\s*/i, ''); // Remove XML declaration
        svgContent = svgContent.replace(/<!--[\s\S]*?-->/g, ''); // Remove comments
        svgContent = svgContent.replace(/>\s+</g, '><').trim(); // Remove unnecessary whitespace

        // Ensure proper attributes for web use
        if (!svgContent.includes('viewBox')) {
            svgContent = svgContent.replace('<svg', '<svg viewBox="0 0 24 24"');
        }

        // Normalize fill colors for theming
        svgContent = svgContent.replace(/fill="#[^"]*"/g, 'fill="currentColor"');
        svgContent = svgContent.replace(/stroke="#[^"]*"/g, 'stroke="currentColor"');

        return svgContent;
    } catch (error) {
        log.error(`Error reading ${filePath}: ${error.message}`);
        return null;
    }
}

// Function to clean icon names for better display
function cleanIconName(fileName) {
    return fileName
        .replace('.svg', '')
        .replace(/_/g, ' ')
        .replace(/\b\w/g, l => l.toUpperCase());
}

// Function to automatically discover all categories
function discoverCategories() {
    const categories = [];

    try {
        if (!fs.existsSync(ICONS_FOLDER)) {
            log.error(`Icons folder not found: ${ICONS_FOLDER}`);
            return categories;
        }

        const items = fs.readdirSync(ICONS_FOLDER, { withFileTypes: true });

        for (const item of items) {
            if (item.isDirectory()) {
                const categoryPath = path.join(ICONS_FOLDER, item.name);
                const svgFiles = fs.readdirSync(categoryPath).filter(file => file.endsWith('.svg'));

                if (svgFiles.length > 0) {
                    categories.push(item.name);
                    log.info(`Discovered category: ${item.name} (${svgFiles.length} icons)`);
                }
            }
        }

        categories.sort(); // Sort alphabetically
        log.success(`Found ${categories.length} categories: ${categories.join(', ')}`);

    } catch (error) {
        log.error(`Error discovering categories: ${error.message}`);
    }

    return categories;
}

// Function to scan FluentUI directory structure
function scanFluentUIIcons() {
    const icons = [];
    const categories = discoverCategories();

    if (categories.length === 0) {
        log.warning('No categories found with SVG files');
        return icons;
    }

    try {
        log.header(`🔍 Scanning FluentUI icons in: ${ICONS_FOLDER}`);

        for (const category of categories) {
            const categoryPath = path.join(ICONS_FOLDER, category);
            log.info(`Processing category: ${category}`);

            const files = fs.readdirSync(categoryPath);
            const svgFiles = files.filter(file => file.endsWith('.svg'));

            log.info(`Found ${svgFiles.length} SVG files in ${category}`);

            let processedCount = 0;
            let errorCount = 0;
            let skippedCount = 0;

            for (const file of svgFiles) {
                const filePath = path.join(categoryPath, file);
                const svgContent = readSvgContent(filePath);

                if (svgContent) {
                    const iconName = file.replace('.svg', '');
                    const displayName = cleanIconName(file);
                    const fileStats = fs.statSync(filePath);

                    icons.push({
                        name: iconName,
                        displayName: displayName,
                        category: category,
                        svg: svgContent,
                        fileName: file,
                        size: fileStats.size,
                        lastModified: fileStats.mtime.toISOString()
                    });
                    processedCount++;
                } else if (fs.statSync(filePath).size === 0) {
                    log.warning(`Skipping empty file: ${file}`);
                    skippedCount++;
                } else {
                    errorCount++;
                }
            }

            log.success(`${category}: ${processedCount} processed`);
            if (errorCount > 0) log.warning(`${category}: ${errorCount} errors`);
            if (skippedCount > 0) log.warning(`${category}: ${skippedCount} skipped`);
        }

    } catch (error) {
        log.error(`Error scanning directory: ${error.message}`);
    }

    return icons;
}

// Function to detect changes from previous scan
function detectChanges(newIcons, oldIconsFile) {
    const changes = {
        added: [],
        removed: [],
        modified: [],
        categories: {
            added: [],
            removed: []
        }
    };

    if (!fs.existsSync(oldIconsFile)) {
        log.info('No previous icons file found - treating as initial scan');
        return changes;
    }

    try {
        // Read old icons data
        const oldContent = fs.readFileSync(oldIconsFile, 'utf8');
        const oldIconsMatch = oldContent.match(/const icons = (\[[\s\S]*?\]);/);

        if (!oldIconsMatch) {
            log.warning('Could not parse previous icons data');
            return changes;
        }

        const oldIcons = JSON.parse(oldIconsMatch[1]);
        const oldIconsMap = new Map(oldIcons.map(icon => [`${icon.category}/${icon.name}`, icon]));
        const newIconsMap = new Map(newIcons.map(icon => [`${icon.category}/${icon.name}`, icon]));

        // Detect added icons
        for (const [key, icon] of newIconsMap) {
            if (!oldIconsMap.has(key)) {
                changes.added.push(icon);
            } else {
                // Check if modified
                const oldIcon = oldIconsMap.get(key);
                if (oldIcon.size !== icon.size || oldIcon.lastModified !== icon.lastModified) {
                    changes.modified.push(icon);
                }
            }
        }

        // Detect removed icons
        for (const [key, icon] of oldIconsMap) {
            if (!newIconsMap.has(key)) {
                changes.removed.push(icon);
            }
        }

        // Detect category changes
        const oldCategories = new Set(oldIcons.map(icon => icon.category));
        const newCategories = new Set(newIcons.map(icon => icon.category));

        changes.categories.added = [...newCategories].filter(cat => !oldCategories.has(cat));
        changes.categories.removed = [...oldCategories].filter(cat => !newCategories.has(cat));

    } catch (error) {
        log.error(`Error detecting changes: ${error.message}`);
    }

    return changes;
}

// Function to generate statistics
function generateStats(icons, changes = null) {
    log.header('📊 FLUENTUI ICON STATISTICS');
    log.stat(`Total Icons: ${icons.length}`);

    const categoryStats = {};
    let totalSize = 0;

    icons.forEach(icon => {
        categoryStats[icon.category] = (categoryStats[icon.category] || 0) + 1;
        totalSize += icon.size || 0;
    });

    const categories = Object.keys(categoryStats).sort();
    log.stat(`Categories: ${categories.length} (${categories.join(', ')})`);
    log.stat(`Average file size: ${Math.round(totalSize / icons.length)} bytes`);
    log.stat(`Total size: ${Math.round(totalSize / 1024)} KB`);

    console.log('\n📁 ICONS PER CATEGORY:');
    Object.entries(categoryStats)
        .sort(([,a], [,b]) => b - a)
        .forEach(([category, count]) => {
            console.log(`  ${category}: ${count} icons`);
        });

    // Show changes if detected
    if (changes) {
        console.log('\n🔄 CHANGES DETECTED:');
        if (changes.added.length > 0) {
            log.success(`Added: ${changes.added.length} icons`);
        }
        if (changes.removed.length > 0) {
            log.warning(`Removed: ${changes.removed.length} icons`);
        }
        if (changes.modified.length > 0) {
            log.info(`Modified: ${changes.modified.length} icons`);
        }
        if (changes.categories.added.length > 0) {
            log.success(`New categories: ${changes.categories.added.join(', ')}`);
        }
        if (changes.categories.removed.length > 0) {
            log.warning(`Removed categories: ${changes.categories.removed.join(', ')}`);
        }
    }

    // Find duplicate names across categories
    const nameStats = {};
    icons.forEach(icon => {
        const baseName = icon.name;
        nameStats[baseName] = (nameStats[baseName] || 0) + 1;
    });

    const duplicates = Object.entries(nameStats).filter(([name, count]) => count > 1);
    if (duplicates.length > 0) {
        console.log('\n🔄 ICON VARIANTS (same name, different styles):');
        duplicates
            .sort(([,a], [,b]) => b - a)
            .slice(0, 10)
            .forEach(([name, count]) => {
                console.log(`  ${name}: ${count} variants`);
            });
    }
}

// Function to create the output JavaScript file
function generateOutputFile(icons) {
    const totalSize = icons.reduce((sum, icon) => sum + (icon.size || 0), 0);
    const avgSize = Math.round(totalSize / icons.length);
    const categories = [...new Set(icons.map(icon => icon.category))].sort();

    const output = `// Auto-generated FluentUI System Icons data
// Source: ${ICONS_FOLDER}
// Generated on: ${new Date().toISOString()}
// Total icons: ${icons.length}
// Categories: ${categories.length} (${categories.join(', ')})
// Average file size: ${avgSize} bytes

const icons = ${JSON.stringify(icons, null, 2)};

const categories = ${JSON.stringify(categories, null, 2)};

// Quick stats for debugging
const iconStats = {
    total: ${icons.length},
    categories: ${JSON.stringify(Object.fromEntries(
        categories.map(cat => [
            cat,
            icons.filter(i => i.category === cat).length
        ])
    ), null, 2)},
    averageSize: ${avgSize},
    totalSize: ${totalSize},
    generatedAt: '${new Date().toISOString()}'
};

// Export for use in website
if (typeof module !== 'undefined' && module.exports) {
    module.exports = { icons, categories, iconStats };
}

// Log stats when loaded in browser
if (typeof window !== 'undefined') {
    console.log('FluentUI Icons loaded:', iconStats);
}
`;

    try {
        fs.writeFileSync(OUTPUT_FILE, output, 'utf8');
        const fileSize = Math.round(fs.statSync(OUTPUT_FILE).size / 1024);
        log.success(`Generated ${OUTPUT_FILE} (${fileSize} KB) with ${icons.length} FluentUI icons`);

        // Create a backup of the previous version
        const backupFile = `${OUTPUT_FILE}.backup`;
        if (fs.existsSync(OUTPUT_FILE) && !fs.existsSync(backupFile)) {
            fs.copyFileSync(OUTPUT_FILE, backupFile);
            log.info(`Backup created: ${backupFile}`);
        }

    } catch (error) {
        log.error(`Failed to write output file: ${error.message}`);
    }
}

// Watch mode functionality
function watchIcons() {
    log.header('👀 WATCH MODE ENABLED');
    log.info('Watching for changes in icon files...');
    log.info('Press Ctrl+C to stop watching');

    const chokidar = require('chokidar');
    let timeout;

    const watcher = chokidar.watch(ICONS_FOLDER, {
        ignored: /[\/\\]\./,
        persistent: true,
        depth: 2
    });

    const processChanges = () => {
        clearTimeout(timeout);
        timeout = setTimeout(() => {
            log.info('Changes detected, regenerating...');
            main();
        }, 1000);
    };

    watcher
        .on('add', path => {
            if (path.endsWith('.svg')) {
                log.info(`File added: ${path}`);
                processChanges();
            }
        })
        .on('change', path => {
            if (path.endsWith('.svg')) {
                log.info(`File changed: ${path}`);
                processChanges();
            }
        })
        .on('unlink', path => {
            if (path.endsWith('.svg')) {
                log.info(`File removed: ${path}`);
                processChanges();
            }
        })
        .on('addDir', path => {
            log.info(`Directory added: ${path}`);
            processChanges();
        })
        .on('unlinkDir', path => {
            log.info(`Directory removed: ${path}`);
            processChanges();
        })
        .on('error', error => log.error(`Watcher error: ${error}`));
}

// Main execution function
function main() {
    log.header('🎨 FLUENTUI SYSTEM ICONS GENERATOR');

    if (WATCH_MODE) {
        log.info('Running in watch mode...');
    }

    // Check if the main folder exists
    if (!fs.existsSync(ICONS_FOLDER)) {
        log.error(`FluentUI folder not found: ${ICONS_FOLDER}`);
        log.info('💡 Make sure you are running this script from the project root');
        log.info('💡 And that the assets folder exists with SVG files');
        return;
    }

    // Scan for icons
    const icons = scanFluentUIIcons();

    if (icons.length === 0) {
        log.error('No icons found in the FluentUI directories');
        log.info('💡 Possible issues:');
        log.info('  - No SVG files in category folders');
        log.info('  - Permission issues');
        log.info('  - Folder structure changed');
        return;
    }

    // Detect changes from previous scan
    const changes = detectChanges(icons, OUTPUT_FILE);

    // Generate output file
    generateOutputFile(icons);

    // Show statistics
    generateStats(icons, changes);

    log.header('🚀 SUCCESS!');
    if (!WATCH_MODE) {
        log.success('Icon data has been generated successfully');
        log.info('💡 Your website will automatically load the new icons');
        log.info('💡 Run with --watch flag to monitor for changes');
        log.info(`💡 Total: ${icons.length} icons across ${[...new Set(icons.map(i => i.category))].length} categories`);
    }
}

// Handle graceful shutdown in watch mode
process.on('SIGINT', () => {
    if (WATCH_MODE) {
        log.info('\n👋 Stopping watch mode...');
        process.exit(0);
    }
});

// Run the script
if (require.main === module) {
    if (WATCH_MODE) {
        // Initial generation
        main();
        // Start watching
        try {
            watchIcons();
        } catch (error) {
            log.warning('Watch mode requires chokidar package. Install with: npm install chokidar');
            log.info('Running in single-run mode instead...');
            main();
        }
    } else {
        main();
    }
}

module.exports = {
    scanFluentUIIcons,
    generateOutputFile,
    main
};