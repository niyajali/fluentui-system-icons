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

package services

import org.eclipse.jgit.api.CreateBranchCommand
import org.eclipse.jgit.api.Git
import org.eclipse.jgit.transport.RefSpec
import org.eclipse.jgit.transport.URIish
import java.io.Closeable
import java.io.File
import kotlin.io.path.createTempDirectory

/**
 * Service for managing repository operations
 * Follows Single Responsibility Principle - only handles repository access
 */
interface GitRepository : Closeable {
    fun getAssetsDirectory(assetsPath: String): File
    fun getRepositoryInfo(): String
}

/**
 * Implementation for shallow Git repository cloning and management
 */
class ShallowGitRepository(
    private val repositoryUrl: String,
    private val gitRef: String = "refs/heads/main"
) : GitRepository {

    private val tempDir = createTempDirectory(prefix = "fluent-icons-").toFile()
    private val git: Git

    init {
        println("🔄 Cloning FluentUI repository (shallow clone)...")
        println("📍 Repository: $repositoryUrl")
        println("🌿 Reference: $gitRef")
        
        git = Git.init()
            .setDirectory(tempDir)
            .call()
            
        git.remoteAdd()
            .setName("origin")
            .setUri(URIish(repositoryUrl))
            .call()
        
        // Configure fetch and checkout based on ref type
        when {
            gitRef.startsWith("refs/heads/") -> {
                // Branch: fetch to local tracking branch, then checkout
                val branchName = gitRef.removePrefix("refs/heads/")
                val refSpec = "$gitRef:refs/remotes/origin/$branchName"
                
                println("🌿 Fetching branch: $branchName")
                println("🔧 RefSpec: $refSpec")
                git.fetch()
                    .setRemote("origin")
                    .setRefSpecs(RefSpec(refSpec))
                    .setDepth(1)
                    .call()
                
                println("🌿 Creating local tracking branch: $branchName")
                // Create and checkout local branch tracking the remote
                git.checkout()
                    .setCreateBranch(true)
                    .setName(branchName)
                    .setUpstreamMode(CreateBranchCommand.SetupUpstreamMode.SET_UPSTREAM)
                    .setStartPoint("origin/$branchName")
                    .call()
            }
            
            gitRef.startsWith("refs/tags/") -> {
                // Tag: fetch tag and checkout directly
                val tagName = gitRef.removePrefix("refs/tags/")
                val refSpec = "+$gitRef:$gitRef"
                
                println("🏷️ Fetching tag: $tagName")
                println("🔧 RefSpec: $refSpec")
                git.fetch()
                    .setRemote("origin")
                    .setRefSpecs(RefSpec(refSpec))
                    .setDepth(1)
                    .call()
                
                println("🏷️ Checking out tag: $tagName")
                // Checkout the tag directly
                git.checkout()
                    .setName(gitRef)
                    .call()
            }
            
            else -> {
                // Fallback: try direct fetch and checkout
                println("⚠️ Unknown ref format: $gitRef, attempting direct fetch")
                println("🔧 RefSpec: $gitRef (direct)")
                git.fetch()
                    .setRemote("origin")
                    .setRefSpecs(RefSpec(gitRef))
                    .setDepth(1)
                    .call()
                
                git.checkout()
                    .setName(gitRef)
                    .call()
            }
        }
            
        println("✅ Repository cloned successfully to: ${tempDir.absolutePath}")
    }

    override fun getAssetsDirectory(assetsPath: String): File {
        val assetsDir = File(tempDir, assetsPath)
        if (!assetsDir.exists()) {
            throw IllegalStateException("Assets directory not found: ${assetsDir.absolutePath}")
        }
        return assetsDir
    }
    
    override fun getRepositoryInfo(): String {
        return "Git Clone: $repositoryUrl@$gitRef"
    }

    override fun close() {
        try {
            git.close()
            tempDir.deleteRecursively()
            println("🧹 Cleaned up temporary repository")
        } catch (e: Exception) {
            println("⚠️ Warning: Failed to cleanup repository: ${e.message}")
        }
    }
}

/**
 * Implementation for using a local directory (for development/testing)
 */
class LocalDirectoryRepository(
    private val localPath: String
) : GitRepository {

    private val localDir = File(localPath)

    init {
        println("📁 Using local FluentUI repository...")
        println("📍 Local Path: ${localDir.absolutePath}")
        
        if (!localDir.exists()) {
            throw IllegalArgumentException("Local directory does not exist: ${localDir.absolutePath}")
        }
        
        if (!localDir.isDirectory) {
            throw IllegalArgumentException("Path is not a directory: ${localDir.absolutePath}")
        }
        
        println("✅ Local repository validated successfully")
    }

    override fun getAssetsDirectory(assetsPath: String): File {
        val assetsDir = File(localDir, assetsPath)
        if (!assetsDir.exists()) {
            throw IllegalStateException("Assets directory not found: ${assetsDir.absolutePath}")
        }
        return assetsDir
    }
    
    override fun getRepositoryInfo(): String {
        return "Local Directory: ${localDir.absolutePath}"
    }

    override fun close() {
        // No cleanup needed for local directories
        println("📁 Local directory access completed")
    }
}

/**
 * Factory for creating GitRepository instances
 * Follows Factory Pattern for flexible instantiation
 */
object GitRepositoryFactory {
    
    fun createRepository(
        useLocalDirectory: Boolean,
        localDirectoryPath: String,
        repositoryUrl: String,
        gitRef: String
    ): GitRepository {
        return if (useLocalDirectory) {
            if (localDirectoryPath.isBlank()) {
                throw IllegalArgumentException("Local directory path cannot be blank when useLocalDirectory is true")
            }
            LocalDirectoryRepository(localDirectoryPath)
        } else {
            ShallowGitRepository(repositoryUrl, gitRef)
        }
    }
    
    @Deprecated("Use createRepository with useLocalDirectory parameter")
    fun createShallowRepository(repositoryUrl: String, gitRef: String): GitRepository {
        return ShallowGitRepository(repositoryUrl, gitRef)
    }
}
