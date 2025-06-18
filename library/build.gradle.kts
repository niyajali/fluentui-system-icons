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
@file:OptIn(ExperimentalWasmDsl::class)

import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinMultiplatform
import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeHotReload)
    alias(libs.plugins.bcv)
    alias(libs.plugins.maven)
    alias(libs.plugins.dokka)
}

kotlin {
    applyDefaultHierarchyTemplate()

    explicitApi()

    androidTarget {
        publishLibraryVariants("release")
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_11)
                }
            }
        }
    }

    jvm {
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_11)
                }
            }
        }
    }

    js(IR) {
        browser()
        nodejs()
    }

    wasmJs {
        nodejs()
        browser()
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.ui)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }

        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
        }
    }

    targets.configureEach {
        compilations.configureEach {
            compileTaskProvider.get().compilerOptions {
                freeCompilerArgs.add("-Xexpect-actual-classes")
            }
        }
    }
}

android {
    namespace = "fluent.ui.system.icons"
    compileSdk = 35

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    defaultConfig {
        minSdk = 21
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
        buildConfig = false
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    lint {
        abortOnError = false
        warningsAsErrors = false
    }
}

apiValidation {
    @OptIn(kotlinx.validation.ExperimentalBCVApi::class)
    klib {
        enabled = true
    }
    nonPublicMarkers.add("kotlin.PublishedApi")
}

// Maven publishing configuration
val artifactId = "fluentui-system-icons"
val mavenGroup: String by project
val defaultVersion: String by project
val currentVersion = System.getenv("PACKAGE_VERSION") ?: defaultVersion
val desc: String by project
val license: String by project
val creationYear: String by project
val githubRepo: String by project

group = mavenGroup
version = currentVersion

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL, automaticRelease = true)
    signAllPublications()
    coordinates(mavenGroup, artifactId, currentVersion)

    // sources publishing is always enabled by the Kotlin Multiplatform plugin
    configure(
        KotlinMultiplatform(
            // - `JavadocJar.Dokka("dokkaHtml")` when using Kotlin with Dokka,
            // where `dokkaHtml` is the name of the Dokka task that should be used as input
            javadocJar = JavadocJar.Dokka("dokkaGenerate")
        )
    )

    pom {
        name = project.name
        description = desc
        inceptionYear = creationYear
        url = "https://github.com/$githubRepo"
        licenses {
            license {
                name = license
                url = "https://github.com/$githubRepo/blob/main/LICENSE"
            }
        }
        developers {
            developer {
                id = "niyajali"
                name = "Sk Niyaj Ali"
                url = "https://github.com/niyajali/"
            }
        }
        scm {
            url = "https://github.com/$githubRepo.git"
            connection = "scm:git:git://github.com/$githubRepo.git"
            developerConnection = "scm:git:git://github.com/$githubRepo.git"
        }
        issueManagement {
            url = "https://github.com/$githubRepo/issues"
        }
    }
}

dokka {
    dokkaPublications.html {
        outputDirectory.set(layout.buildDirectory.dir("$rootDir/docs/kdoc"))
    }
}