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
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ChevronUp: ImageVector
    get() {
        if (_ChevronUp != null) {
            return _ChevronUp!!
        }
        _ChevronUp = ImageVector.Builder(
            name = "Regular.ChevronUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.22f, 15.53f)
                curveTo(4.513f, 15.823f, 4.987f, 15.823f, 5.28f, 15.53f)
                lineTo(12f, 8.811f)
                lineTo(18.72f, 15.53f)
                curveTo(19.013f, 15.823f, 19.487f, 15.823f, 19.78f, 15.53f)
                curveTo(20.073f, 15.237f, 20.073f, 14.763f, 19.78f, 14.47f)
                lineTo(12.53f, 7.22f)
                curveTo(12.237f, 6.927f, 11.763f, 6.927f, 11.47f, 7.22f)
                lineTo(4.22f, 14.47f)
                curveTo(3.927f, 14.763f, 3.927f, 15.237f, 4.22f, 15.53f)
                close()
            }
        }.build()

        return _ChevronUp!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUp: ImageVector? = null

@Preview
@Composable
private fun ChevronUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChevronUp, contentDescription = null)
    }
}
