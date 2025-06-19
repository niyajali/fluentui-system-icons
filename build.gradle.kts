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
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.composeHotReload) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.maven) apply false
}

//private val ktlintVersion = "1.0.1"
//spotless {
//    kotlin {
//        target("**/*.kt")
//        targetExclude("**/build/**/*.kt")
//        targetExclude("spotless/copyright.kt")
//        ktlint(ktlintVersion).editorConfigOverride(
//            mapOf("android" to "true"),
//        )
//        licenseHeaderFile(rootProject.file("spotless/copyright.kt"))
//    }
//
//    format("kts") {
//        target("**/*.kts")
//        targetExclude("**/build/**/*.kts")
//        targetExclude("spotless/copyright.kts")
//        // Look for the first line that doesn't have a block comment (assumed to be the license)
//        licenseHeaderFile(rootProject.file("spotless/copyright.kts"), "(^(?![\\/ ]\\*).*$)")
//    }
//
//    format("xml") {
//        target("**/*.xml")
//        targetExclude("**/build/**/*.xml")
//        targetExclude("spotless/copyright.xml")
//        // Look for the first XML tag that isn't a comment (<!--) or the xml declaration (<?xml)
//        licenseHeaderFile(rootProject.file("spotless/copyright.xml"), "(<[^!?])")
//    }
//}