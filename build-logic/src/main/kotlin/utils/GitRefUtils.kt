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

/**
 * Utility functions for Git reference formatting
 */
object GitRefUtils {
    
    /**
     * Formats a user-friendly Git reference to the full Git reference format
     * 
     * Examples:
     * - "main" → "refs/heads/main"
     * - "1.1.305" → "refs/tags/1.1.305"
     * - "refs/heads/main" → "refs/heads/main" (already formatted)
     * - "refs/tags/1.1.305" → "refs/tags/1.1.305" (already formatted)
     */
    fun formatGitRef(input: String): String {
        return when {
            // Already formatted reference
            input.startsWith("refs/") -> input
            
            // Version tag format (e.g., "1.1.305")
            input.matches(Regex("^[0-9]+\\.[0-9]+\\.[0-9]+$")) -> "refs/tags/$input"
            
            // Branch name (e.g., "main", "develop", "feature/new-icons")
            else -> "refs/heads/$input"
        }
    }
    
    /**
     * Extracts the display name from a Git reference
     * 
     * Examples:
     * - "refs/heads/main" → "main"
     * - "refs/tags/1.1.305" → "1.1.305"
     * - "main" → "main" (if not formatted)
     */
    fun getDisplayName(gitRef: String): String {
        return when {
            gitRef.startsWith("refs/heads/") -> gitRef.removePrefix("refs/heads/")
            gitRef.startsWith("refs/tags/") -> gitRef.removePrefix("refs/tags/")
            else -> gitRef
        }
    }
    
    /**
     * Determines the type of Git reference
     */
    fun getRefType(gitRef: String): String {
        return when {
            gitRef.startsWith("refs/tags/") -> "tag"
            gitRef.startsWith("refs/heads/") -> "branch"
            gitRef.matches(Regex("^[0-9]+\\.[0-9]+\\.[0-9]+$")) -> "tag"
            else -> "branch"
        }
    }
}
