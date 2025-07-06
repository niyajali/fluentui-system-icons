#!/usr/bin/env python3
"""
Script to generate Kotlin code for FluentUI System Icons list
Reads icon files from the specified directory and creates organized icon lists
"""

#  MIT License
#
#  Copyright (c) 2020 Microsoft Corporation
#
#  Permission is hereby granted, free of charge, to any person obtaining a copy
#  of this software and associated documentation files (the "Software"), to deal
#  in the Software without restriction, including without limitation the rights
#  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
#  copies of the Software, and to permit persons to whom the Software is
#  furnished to do so, subject to the following conditions:
#
#  The above copyright notice and this permission notice shall be included in all
#  copies or substantial portions of the Software.
#
#  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
#  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
#  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
#  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
#  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
#  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
#  SOFTWARE.

#  MIT License
#
#
#  Permission is hereby granted, free of charge, to any person obtaining a copy
#  of this software and associated documentation files (the "Software"), to deal
#  in the Software without restriction, including without limitation the rights
#  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
#  copies of the Software, and to permit persons to whom the Software is
#  furnished to do so, subject to the following conditions:
#
#
import os
import re
from pathlib import Path
from typing import List, Dict, Set

def extract_icon_name_from_file(file_path: Path) -> str:
    """Extract icon name from file path or content"""
    # Get filename without extension
    filename = file_path.stem

    # # Check if filename is already in PascalCase (starts with uppercase and contains mixed case)
    # if filename and filename[0].isupper() and any(c.islower() for c in filename):
    #     # File is already in PascalCase, remove any numeric suffixes
    #     clean_name = re.sub(r'\d+$', '', filename)
    #     return clean_name
    #
    # # Convert snake_case or kebab-case to PascalCase
    # # Remove any numeric suffixes like _24, _20, etc.
    # clean_name = re.sub(r'_\d+$', '', filename)
    #
    # # Split by underscores/hyphens and convert to PascalCase
    # parts = re.split(r'[_-]', clean_name)
    # pascal_case = ''.join(word.capitalize() for word in parts if word)

    return filename

def scan_icon_directory(directory_path: str) -> Dict[str, List[str]]:
    """Scan directory and dynamically categorize icons by type based on folder names"""
    icons = {}

    try:
        base_path = Path(directory_path)

        if not base_path.exists():
            print(f"Directory not found: {directory_path}")
            return icons

        # Directly look for known icon category directories
        known_categories = ['color', 'filled', 'regular', 'light', 'outlined']
        detected_categories = []

        # Check what directories actually exist
        for category in known_categories:
            category_path = base_path / category
            if category_path.exists() and category_path.is_dir():
                detected_categories.append(category.capitalize())

        # If no known categories found, scan for any directories
        if not detected_categories:
            for item in base_path.iterdir():
                if item.is_dir() and item.name.lower() not in ['__pycache__', '.git']:
                    detected_categories.append(item.name.capitalize())

        # Initialize dictionaries for detected categories
        for category in detected_categories:
            icons[category] = []

        # If no categories detected, add a default
        if not icons:
            icons['Regular'] = []

        print(f"Detected icon categories: {sorted(detected_categories)}")

        # Scan each category directory
        for category in detected_categories:
            category_path = base_path / category.lower()
            if category_path.exists():
                print(f"Scanning {category} icons...")

                # Process Kotlin files in this category
                for file_path in category_path.glob("*.kt"):
                    icon_name = extract_icon_name_from_file(file_path)
                    if icon_name and icon_name not in icons[category]:
                        icons[category].append(icon_name)

        # Sort all icon lists alphabetically and remove empty categories
        icons = {k: sorted(v) for k, v in icons.items() if v}

    except Exception as e:
        print(f"Error scanning directory: {e}")

    return icons

def generate_kotlin_code(icons: Dict[str, List[str]]) -> str:
    """Generate Kotlin code for the icon lists"""

    imports = """import androidx.compose.ui.graphics.vector.ImageVector
import fluent.ui.system.icons.FluentIcons

"""

    code_parts = [imports]

    for icon_type, icon_list in icons.items():
        if not icon_list:
            continue

        variable_name = f"{icon_type.lower()}Icons"
        property_name = f"{icon_type}Icons"

        # Generate the code for each icon type
        code = f"""private var {variable_name}: List<ImageVector>? = null
public val FluentIcons.{property_name}: List<ImageVector>
    get() {{
        if ({variable_name} != null) {{
            return {variable_name}!!
        }}

        {variable_name} = listOf(
"""

        # Add icon entries
        for i, icon in enumerate(icon_list):
            comma = "," if i < len(icon_list) - 1 else ""
            code += f"            FluentIcons.{icon_type}.{icon}{comma}\n"

        code += f"""        )

        return {variable_name}!!
    }}

"""
        code_parts.append(code)

    return ''.join(code_parts)

def main():
    """Main function to generate the icon lists"""
    # Directory path - update this to match your local path
    directory_path = r"F:\fluentui-system-icons\library\src\commonMain\kotlin\fluent\ui\system\icons"

    print("Scanning FluentUI System Icons directory...")
    print(f"Directory: {directory_path}")

    # Scan the directory
    icons = scan_icon_directory(directory_path)

    # Print summary
    total_icons = sum(len(icon_list) for icon_list in icons.values())
    print(f"\nFound {total_icons} total icons:")
    for icon_type, icon_list in icons.items():
        print(f"  {icon_type}: {len(icon_list)} icons")

    if total_icons == 0:
        print("\nNo icons found. Please check the directory path and structure.")
        print("Expected structure:")
        print("  - Colored icons in directories containing 'colored'")
        print("  - Filled icons in directories containing 'filled'")
        print("  - Regular icons in directories containing 'regular'")
        return

    # Generate Kotlin code
    kotlin_code = generate_kotlin_code(icons)

    # Write to file
    output_file = "FluentIconsLists.kt"
    try:
        with open(output_file, 'w', encoding='utf-8') as f:
            f.write(kotlin_code)
        print(f"\nKotlin code generated successfully!")
        print(f"Output file: {output_file}")
    except Exception as e:
        print(f"Error writing to file: {e}")
        print("\nGenerated Kotlin code:")
        print("=" * 50)
        print(kotlin_code)

if __name__ == "__main__":
    main()