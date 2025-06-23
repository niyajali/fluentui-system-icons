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
package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.TextAlignDistributedVertical: ImageVector
    get() {
        if (_TextAlignDistributedVertical != null) {
            return _TextAlignDistributedVertical!!
        }
        _TextAlignDistributedVertical = ImageVector.Builder(
            name = "Filled.TextAlignDistributedVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19f, 5.414f)
                lineTo(19f, 21f)
                curveTo(19f, 21.552f, 18.552f, 22f, 18f, 22f)
                curveTo(17.448f, 22f, 17f, 21.552f, 17f, 21f)
                lineTo(17f, 5.414f)
                lineTo(16.707f, 5.707f)
                curveTo(16.317f, 6.098f, 15.683f, 6.098f, 15.293f, 5.707f)
                curveTo(14.902f, 5.317f, 14.902f, 4.683f, 15.293f, 4.293f)
                lineTo(17.293f, 2.293f)
                curveTo(17.683f, 1.902f, 18.317f, 1.902f, 18.707f, 2.293f)
                lineTo(20.707f, 4.293f)
                curveTo(21.098f, 4.683f, 21.098f, 5.317f, 20.707f, 5.707f)
                curveTo(20.317f, 6.098f, 19.683f, 6.098f, 19.293f, 5.707f)
                lineTo(19f, 5.414f)
                close()
                moveTo(5f, 18.586f)
                lineTo(4.707f, 18.293f)
                curveTo(4.317f, 17.902f, 3.683f, 17.902f, 3.293f, 18.293f)
                curveTo(2.902f, 18.683f, 2.902f, 19.317f, 3.293f, 19.707f)
                lineTo(5.293f, 21.707f)
                curveTo(5.683f, 22.098f, 6.317f, 22.098f, 6.707f, 21.707f)
                lineTo(8.707f, 19.707f)
                curveTo(9.098f, 19.317f, 9.098f, 18.683f, 8.707f, 18.293f)
                curveTo(8.317f, 17.902f, 7.683f, 17.902f, 7.293f, 18.293f)
                lineTo(7f, 18.586f)
                lineTo(7f, 3f)
                curveTo(7f, 2.448f, 6.552f, 2f, 6f, 2f)
                curveTo(5.448f, 2f, 5f, 2.448f, 5f, 3f)
                lineTo(5f, 18.586f)
                close()
                moveTo(13f, 3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
                lineTo(11f, 21f)
                curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
                curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
                lineTo(13f, 3f)
                close()
            }
        }.build()

        return _TextAlignDistributedVertical!!
    }

@Suppress("ObjectPropertyName")
private var _TextAlignDistributedVertical: ImageVector? = null

@Preview
@Composable
private fun TextAlignDistributedVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextAlignDistributedVertical, contentDescription = null)
    }
}
