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

plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlinx.serialization)
}

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://jetbrains.bintray.com/trove4j")
}

dependencies {
    implementation(libs.generator.svgToCompose)
    implementation(libs.generator.jgit)
    implementation(libs.generator.kotlinpoet)
    implementation(libs.kotlinx.serialization.json)
    
    testImplementation(libs.kotlin.test)
}

gradlePlugin {
    plugins {
        create("fluentIconsSync") {
            id = "fluent.icons"
            implementationClass = "WeeklyIconSyncPlugin"
            displayName = "FluentUI Icons Plugin"
            description = "Automatically syncs and converts FluentUI System Icons to Jetpack Compose ImageVectors"
        }
    }
}
