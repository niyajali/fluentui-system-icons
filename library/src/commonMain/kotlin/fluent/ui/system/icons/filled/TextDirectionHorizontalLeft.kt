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

public val FluentIcons.Filled.TextDirectionHorizontalLeft: ImageVector
    get() {
        if (_TextDirectionHorizontalLeft != null) {
            return _TextDirectionHorizontalLeft!!
        }
        _TextDirectionHorizontalLeft = ImageVector.Builder(
            name = "Filled.TextDirectionHorizontalLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.25f, 3f)
                curveTo(15.846f, 3f, 15.482f, 3.243f, 15.327f, 3.615f)
                lineTo(11.577f, 12.615f)
                curveTo(11.364f, 13.125f, 11.605f, 13.711f, 12.115f, 13.923f)
                curveTo(12.625f, 14.135f, 13.21f, 13.894f, 13.423f, 13.385f)
                lineTo(14.416f, 11f)
                horizontalLineTo(18.083f)
                lineTo(19.077f, 13.385f)
                curveTo(19.289f, 13.894f, 19.875f, 14.135f, 20.384f, 13.923f)
                curveTo(20.894f, 13.711f, 21.135f, 13.125f, 20.923f, 12.615f)
                lineTo(17.173f, 3.615f)
                curveTo(17.017f, 3.243f, 16.653f, 3f, 16.25f, 3f)
                close()
                moveTo(16.25f, 6.6f)
                lineTo(17.25f, 9f)
                horizontalLineTo(15.25f)
                lineTo(16.25f, 6.6f)
                close()
                moveTo(6.707f, 5.293f)
                curveTo(6.316f, 4.902f, 5.683f, 4.902f, 5.293f, 5.293f)
                lineTo(3.366f, 7.227f)
                curveTo(3.143f, 7.409f, 3.001f, 7.687f, 3f, 7.997f)
                lineTo(3f, 8f)
                lineTo(3f, 8.003f)
                curveTo(3.001f, 8.313f, 3.143f, 8.591f, 3.366f, 8.773f)
                lineTo(5.293f, 10.707f)
                curveTo(5.683f, 11.098f, 6.316f, 11.098f, 6.707f, 10.707f)
                curveTo(7.097f, 10.317f, 7.097f, 9.683f, 6.707f, 9.293f)
                lineTo(6.414f, 9f)
                horizontalLineTo(11f)
                curveTo(11.552f, 9f, 12f, 8.552f, 12f, 8f)
                curveTo(12f, 7.448f, 11.552f, 7f, 11f, 7f)
                horizontalLineTo(6.414f)
                lineTo(6.707f, 6.707f)
                curveTo(7.097f, 6.317f, 7.097f, 5.683f, 6.707f, 5.293f)
                close()
                moveTo(5.293f, 14.293f)
                curveTo(5.683f, 13.902f, 6.316f, 13.902f, 6.707f, 14.293f)
                curveTo(7.097f, 14.683f, 7.097f, 15.317f, 6.707f, 15.707f)
                lineTo(6.414f, 16f)
                horizontalLineTo(20f)
                curveTo(20.552f, 16f, 21f, 16.448f, 21f, 17f)
                curveTo(21f, 17.552f, 20.552f, 18f, 20f, 18f)
                horizontalLineTo(6.414f)
                lineTo(6.707f, 18.293f)
                curveTo(7.097f, 18.683f, 7.097f, 19.317f, 6.707f, 19.707f)
                curveTo(6.316f, 20.098f, 5.683f, 20.098f, 5.293f, 19.707f)
                lineTo(3.293f, 17.707f)
                curveTo(2.902f, 17.317f, 2.902f, 16.683f, 3.293f, 16.293f)
                lineTo(5.293f, 14.293f)
                close()
            }
        }.build()

        return _TextDirectionHorizontalLeft!!
    }

@Suppress("ObjectPropertyName")
private var _TextDirectionHorizontalLeft: ImageVector? = null

@Preview
@Composable
private fun TextDirectionHorizontalLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextDirectionHorizontalLeft, contentDescription = null)
    }
}
