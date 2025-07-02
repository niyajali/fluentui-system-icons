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
 * Utility functions for JGit operations and debugging
 */
object JGitUtils {
    
    /**
     * Generates the appropriate RefSpec for a given Git reference
     * 
     * @param gitRef The formatted Git reference (refs/heads/... or refs/tags/...)
     * @return The RefSpec string to use with JGit fetch operations
     */
    fun generateRefSpec(gitRef: String): String {
        return when {
            gitRef.startsWith("refs/heads/") -> {
                val branchName = gitRef.removePrefix("refs/heads/")
                "$gitRef:refs/remotes/origin/$branchName"
            }
            gitRef.startsWith("refs/tags/") -> {
                "+$gitRef:$gitRef"
            }
            else -> {
                // Fallback for unknown formats
                gitRef
            }
        }
    }
    
    /**
     * Determines the checkout strategy for a Git reference
     */
    fun getCheckoutStrategy(gitRef: String): String {
        return when {
            gitRef.startsWith("refs/heads/") -> "branch"
            gitRef.startsWith("refs/tags/") -> "tag"
            else -> "direct"
        }
    }
    
    /**
     * Validates that a Git reference is properly formatted
     */
    fun isValidGitRef(gitRef: String): Boolean {
        return gitRef.startsWith("refs/heads/") || 
               gitRef.startsWith("refs/tags/") ||
               gitRef.matches(Regex("^[a-zA-Z0-9/_-]+$"))
    }
    
    /**
     * Debug information for Git reference handling
     */
    fun debugGitRef(gitRef: String): String {
        val refSpec = generateRefSpec(gitRef)
        val strategy = getCheckoutStrategy(gitRef)
        val isValid = isValidGitRef(gitRef)
        
        return """
            Git Reference Debug Info:
            - Input: $gitRef
            - RefSpec: $refSpec
            - Strategy: $strategy
            - Valid: $isValid
        """.trimIndent()
    }
}
