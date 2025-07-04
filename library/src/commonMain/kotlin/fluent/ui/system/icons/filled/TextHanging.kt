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

public val FluentIcons.Filled.TextHanging: ImageVector
    get() {
        if (_TextHanging != null) {
            return _TextHanging!!
        }
        _TextHanging = ImageVector.Builder(
            name = "Filled.TextHanging",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 5f)
                curveTo(2.448f, 5f, 2f, 5.448f, 2f, 6f)
                curveTo(2f, 6.552f, 2.448f, 7f, 3f, 7f)
                horizontalLineTo(21f)
                curveTo(21.552f, 7f, 22f, 6.552f, 22f, 6f)
                curveTo(22f, 5.448f, 21.552f, 5f, 21f, 5f)
                horizontalLineTo(3f)
                close()
                moveTo(10f, 17f)
                curveTo(9.448f, 17f, 9f, 17.448f, 9f, 18f)
                curveTo(9f, 18.552f, 9.448f, 19f, 10f, 19f)
                horizontalLineTo(21f)
                curveTo(21.552f, 19f, 22f, 18.552f, 22f, 18f)
                curveTo(22f, 17.448f, 21.552f, 17f, 21f, 17f)
                horizontalLineTo(10f)
                close()
                moveTo(9f, 12f)
                curveTo(9f, 11.448f, 9.448f, 11f, 10f, 11f)
                horizontalLineTo(21f)
                curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
                curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
                horizontalLineTo(10f)
                curveTo(9.448f, 13f, 9f, 12.552f, 9f, 12f)
                close()
                moveTo(4.707f, 13.293f)
                curveTo(4.317f, 12.902f, 3.683f, 12.902f, 3.293f, 13.293f)
                curveTo(2.902f, 13.683f, 2.902f, 14.317f, 3.293f, 14.707f)
                lineTo(4.586f, 16f)
                lineTo(3.293f, 17.293f)
                curveTo(2.902f, 17.683f, 2.902f, 18.317f, 3.293f, 18.707f)
                curveTo(3.683f, 19.098f, 4.317f, 19.098f, 4.707f, 18.707f)
                lineTo(6.707f, 16.707f)
                curveTo(7.098f, 16.317f, 7.098f, 15.683f, 6.707f, 15.293f)
                lineTo(4.707f, 13.293f)
                close()
            }
        }.build()

        return _TextHanging!!
    }

@Suppress("ObjectPropertyName")
private var _TextHanging: ImageVector? = null

@Preview
@Composable
private fun TextHangingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextHanging, contentDescription = null)
    }
}
