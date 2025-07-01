/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package utils

import java.io.File

object FileUtils {
    
    fun toPascalCase(input: String): String {
        if (input.isBlank()) {
            throw IllegalArgumentException("Input cannot be blank")
        }
        
        return input.split("_")
            .filter { it.isNotBlank() } // Filter out empty parts
            .joinToString("") { part -> 
                part.replaceFirstChar { char -> 
                    if (char.isLowerCase()) char.uppercase() else char.toString() 
                }
            }
    }
    
    fun createDirectoriesIfNeeded(targetDir: File, supportedStyles: List<String>) {
        if (!targetDir.mkdirs() && !targetDir.exists()) {
            throw IllegalStateException("Failed to create target directory: ${targetDir.absolutePath}")
        }
        
        supportedStyles.forEach { style ->
            val styleDir = File(targetDir, style.lowercase())
            if (!styleDir.mkdirs() && !styleDir.exists()) {
                throw IllegalStateException("Failed to create style directory: ${styleDir.absolutePath}")
            }
        }
    }
}
