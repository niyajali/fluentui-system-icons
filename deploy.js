#!/usr/bin/env node

const fs = require('fs');
const path = require('path');
const {execSync} = require('child_process');

// Configuration
const GITHUB_PAGES_BRANCH = 'gh-pages';
const BUILD_DIR = 'dist';
const REQUIRED_FILES = ['index.html', 'fluentui-icons-data.js'];

// Color codes for console output
const colors = {
    reset: '\x1b[0m',
    bright: '\x1b[1m',
    red: '\x1b[31m',
    green: '\x1b[32m',
    yellow: '\x1b[33m',
    blue: '\x1b[34m',
    cyan: '\x1b[36m'
};

const log = {
    info: (msg) => console.log(`${colors.blue}ℹ${colors.reset} ${msg}`),
    success: (msg) => console.log(`${colors.green}✅${colors.reset} ${msg}`),
    warning: (msg) => console.log(`${colors.yellow}⚠️${colors.reset} ${msg}`),
    error: (msg) => console.log(`${colors.red}❌${colors.reset} ${msg}`),
    header: (msg) => console.log(`\n${colors.bright}${colors.cyan}${msg}${colors.reset}`)
};

function checkRequiredFiles() {
    log.header('🔍 Checking required files...');

    const missing = REQUIRED_FILES.filter(file => !fs.existsSync(file));

    if (missing.length > 0) {
        log.error(`Missing required files: ${missing.join(', ')}`);
        log.info('💡 Run "npm run generate" to create missing files');
        return false;
    }

    log.success('All required files found');
    return true;
}

function prepareBuildDirectory() {
    log.header('📁 Preparing build directory...');

    // Clean and create build directory
    if (fs.existsSync(BUILD_DIR)) {
        fs.rmSync(BUILD_DIR, {recursive: true, force: true});
    }
    fs.mkdirSync(BUILD_DIR, {recursive: true});

    // Copy required files
    REQUIRED_FILES.forEach(file => {
        const dest = path.join(BUILD_DIR, file);
        fs.copyFileSync(file, dest);
        log.info(`Copied ${file}`);
    });

    // Create CNAME file if custom domain is specified
    const customDomain = process.env.CUSTOM_DOMAIN;
    if (customDomain) {
        fs.writeFileSync(path.join(BUILD_DIR, 'CNAME'), customDomain);
        log.info(`Created CNAME for ${customDomain}`);
    }

    // Create .nojekyll file (GitHub Pages optimization)
    fs.writeFileSync(path.join(BUILD_DIR, '.nojekyll'), '');
    log.info('Created .nojekyll file');

    log.success('Build directory prepared');
}

function deployToGitHubPages() {
    log.header('🚀 Deploying to GitHub Pages...');

    try {
        // Check if git is initialized
        if (!fs.existsSync('.git')) {
            log.error('Git repository not initialized');
            log.info('💡 Run "git init" and set up your repository first');
            return false;
        }

        // Check if remote origin exists
        try {
            execSync('git remote get-url origin', {stdio: 'pipe'});
        } catch (error) {
            log.error('No git remote "origin" found');
            log.info('💡 Add your GitHub repository as origin:');
            log.info('   git remote add origin https://github.com/username/repo.git');
            return false;
        }

        // Save current branch
        const currentBranch = execSync('git branch --show-current', {encoding: 'utf8'}).trim();
        log.info(`Current branch: ${currentBranch}`);

        // Switch to gh-pages branch
        try {
            execSync(`git checkout ${GITHUB_PAGES_BRANCH}`, {stdio: 'pipe'});
            log.info(`Switched to ${GITHUB_PAGES_BRANCH} branch`);
        } catch (error) {
            // Create new gh-pages branch
            execSync(`git checkout --orphan ${GITHUB_PAGES_BRANCH}`, {stdio: 'pipe'});
            log.info(`Created new ${GITHUB_PAGES_BRANCH} branch`);
        }

        // Clear the branch (keep only deployment files)
        try {
            execSync('git rm -rf .', {stdio: 'pipe'});
        } catch (error) {
            // Branch might be empty, continue
        }

        // Copy build files to root
        const buildFiles = fs.readdirSync(BUILD_DIR);
        buildFiles.forEach(file => {
            const src = path.join(BUILD_DIR, file);
            fs.copyFileSync(src, file);
        });

        // Add and commit files
        execSync('git add .', {stdio: 'pipe'});

        const commitMessage = `Deploy FluentUI Icons Gallery - ${new Date().toISOString()}`;
        execSync(`git commit -m "${commitMessage}"`, {stdio: 'pipe'});
        log.info('Changes committed');

        // Push to GitHub
        execSync(`git push origin ${GITHUB_PAGES_BRANCH} --force`, {stdio: 'pipe'});
        log.success('Pushed to GitHub Pages');

        // Switch back to original branch
        execSync(`git checkout ${currentBranch}`, {stdio: 'pipe'});
        log.info(`Switched back to ${currentBranch} branch`);

        return true;

    } catch (error) {
        log.error(`Deployment failed: ${error.message}`);
        return false;
    }
}

function getGitHubPagesUrl() {
    try {
        const remoteUrl = execSync('git remote get-url origin', {encoding: 'utf8'}).trim();

        // Parse GitHub repository URL
        const match = remoteUrl.match(/github\.com[:/](.+?)\/(.+?)(?:\.git)?$/);
        if (match) {
            const [, owner, repo] = match;
            return `https://${owner}.github.io/${repo}`;
        }
    } catch (error) {
        // Could not determine URL
    }
    return null;
}

function main() {
    log.header('🎨 FluentUI Icons Gallery - GitHub Pages Deployment');

    // Check if we're in the right directory
    if (!fs.existsSync('generate-icons.js')) {
        log.error('This script must be run from the project root directory');
        log.info('💡 Make sure you are in the same directory as generate-icons.js');
        process.exit(1);
    }

    // Step 1: Check required files
    if (!checkRequiredFiles()) {
        process.exit(1);
    }

    // Step 2: Regenerate icons (ensure latest data)
    log.header('🔄 Regenerating icons data...');
    try {
        execSync('node generate-icons.js', {stdio: 'inherit'});
        log.success('Icons data regenerated');
    } catch (error) {
        log.error('Failed to regenerate icons data');
        process.exit(1);
    }

    // Step 3: Prepare build directory
    prepareBuildDirectory();

    // Step 4: Deploy to GitHub Pages
    if (!deployToGitHubPages()) {
        process.exit(1);
    }

    // Step 5: Show success message
    log.header('🎉 Deployment Successful!');

    const githubUrl = getGitHubPagesUrl();
    if (githubUrl) {
        log.success(`Your gallery is now live at: ${githubUrl}`);
        log.info('💡 It may take a few minutes for GitHub Pages to update');
    } else {
        log.success('Deployment completed successfully');
        log.info('💡 Check your GitHub repository settings for the Pages URL');
    }

    log.info('\n📋 Next steps:');
    log.info('1. Go to your GitHub repository');
    log.info('2. Navigate to Settings → Pages');
    log.info('3. Ensure source is set to "Deploy from branch: gh-pages"');
    log.info('4. Your gallery will be available at the GitHub Pages URL');

    // Cleanup
    if (fs.existsSync(BUILD_DIR)) {
        fs.rmSync(BUILD_DIR, {recursive: true, force: true});
        log.info('Cleaned up build directory');
    }
}

// Handle command line arguments
if (process.argv.includes('--help') || process.argv.includes('-h')) {
    console.log(`
🎨 FluentUI Icons Gallery - Deployment Script

Usage:
  node deploy.js                    Deploy to GitHub Pages
  node deploy.js --help            Show this help

Environment Variables:
  CUSTOM_DOMAIN                    Set custom domain for GitHub Pages

Examples:
  node deploy.js                                    # Deploy to GitHub Pages
  CUSTOM_DOMAIN=icons.example.com node deploy.js   # Deploy with custom domain

This script will:
1. ✅ Check required files exist
2. 🔄 Regenerate icons data  
3. 📁 Prepare deployment files
4. 🚀 Deploy to GitHub Pages
5. 🎉 Show deployment URL
`);
    process.exit(0);
}

// Run the deployment
if (require.main === module) {
    main();
}

module.exports = {main, checkRequiredFiles, deployToGitHubPages};