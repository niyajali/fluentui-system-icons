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

import org.gradle.internal.impldep.org.junit.Assert.assertEquals
import org.gradle.internal.impldep.org.junit.Test

class IconNameNormalizationTest {

    @Test
    fun `test normalizeIconName with various inputs`() {
        // Test cases that reproduce the WiFi1/Wifi issue
        assertEquals("wifi1", "WiFi1".normalizeIconName())
        assertEquals("wifi1", "Wifi1".normalizeIconName())
        assertEquals("wifi1", "wifi1".normalizeIconName())
        
        // Test other common cases
        assertEquals("access_time", "Access Time".normalizeIconName())
        assertEquals("access_time", "AccessTime".normalizeIconName())
        assertEquals("battery0", "Battery 0".normalizeIconName())
        assertEquals("battery0", "Battery0".normalizeIconName())
        assertEquals("xml_http_request", "XMLHttpRequest".normalizeIconName())
        assertEquals("task_list_ltr", "TaskListLtr".normalizeIconName())
    }

    @Test
    fun `test fromPascalCaseToNormalized`() {
        // Test reverse conversion for existing file detection
        assertEquals("wifi1", "WiFi1".fromPascalCaseToNormalized())
        assertEquals("wifi1", "Wifi1".fromPascalCaseToNormalized())
        assertEquals("access_time", "AccessTime".fromPascalCaseToNormalized())
        assertEquals("task_list_ltr", "TaskListLtr".fromPascalCaseToNormalized())
        assertEquals("xml_http_request", "XmlHttpRequest".fromPascalCaseToNormalized())
    }

    @Test
    fun `test round trip conversion consistency`() {
        val testCases = listOf(
            "WiFi1",
            "AccessTime", 
            "TaskListLtr",
            "XmlHttpRequest",
            "Battery0"
        )
        
        testCases.forEach { original ->
            val normalized = original.normalizeIconName()
            val pascalCase = FileUtils.toPascalCase(normalized)
            val backToNormalized = pascalCase.fromPascalCaseToNormalized()
            
            assertEquals(normalized, backToNormalized, 
                "Round trip failed for $original: $normalized -> $pascalCase -> $backToNormalized")
        }
    }

    @Test
    fun `test FileUtils toPascalCase with special cases`() {
        assertEquals("WiFi1", FileUtils.toPascalCase("wifi1"))
        assertEquals("AccessTime", FileUtils.toPascalCase("access_time"))
        assertEquals("TaskListLtr", FileUtils.toPascalCase("task_list_ltr"))
        assertEquals("XmlHttpRequest", FileUtils.toPascalCase("xml_http_request"))
        assertEquals("Battery0", FileUtils.toPascalCase("battery0"))
    }
}
