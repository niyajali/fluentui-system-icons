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

public val FluentIcons.Filled.TextDirectionRotate90Ltr: ImageVector
    get() {
        if (_TextDirectionRotate90Ltr != null) {
            return _TextDirectionRotate90Ltr!!
        }
        _TextDirectionRotate90Ltr = ImageVector.Builder(
            name = "Filled.TextDirectionRotate90Ltr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.385f, 8.673f)
                lineTo(11.385f, 12.423f)
                curveTo(10.875f, 12.636f, 10.289f, 12.395f, 10.077f, 11.885f)
                curveTo(9.865f, 11.375f, 10.106f, 10.79f, 10.615f, 10.577f)
                lineTo(13f, 9.584f)
                verticalLineTo(5.917f)
                lineTo(10.615f, 4.923f)
                curveTo(10.106f, 4.711f, 9.865f, 4.125f, 10.077f, 3.616f)
                curveTo(10.289f, 3.106f, 10.875f, 2.865f, 11.385f, 3.077f)
                lineTo(20.385f, 6.827f)
                curveTo(20.757f, 6.982f, 21f, 7.347f, 21f, 7.75f)
                curveTo(21f, 8.154f, 20.757f, 8.518f, 20.385f, 8.673f)
                close()
                moveTo(15f, 8.75f)
                lineTo(17.4f, 7.75f)
                lineTo(15f, 6.75f)
                verticalLineTo(8.75f)
                close()
                moveTo(8f, 4f)
                curveTo(8f, 3.448f, 7.552f, 3f, 7f, 3f)
                curveTo(6.448f, 3f, 6f, 3.448f, 6f, 4f)
                verticalLineTo(17.586f)
                lineTo(5.707f, 17.293f)
                curveTo(5.317f, 16.902f, 4.683f, 16.902f, 4.293f, 17.293f)
                curveTo(3.902f, 17.683f, 3.902f, 18.317f, 4.293f, 18.707f)
                lineTo(6.293f, 20.707f)
                curveTo(6.683f, 21.098f, 7.317f, 21.098f, 7.707f, 20.707f)
                lineTo(9.707f, 18.707f)
                curveTo(10.098f, 18.317f, 10.098f, 17.683f, 9.707f, 17.293f)
                curveTo(9.317f, 16.902f, 8.683f, 16.902f, 8.293f, 17.293f)
                lineTo(8f, 17.586f)
                verticalLineTo(4f)
                close()
                moveTo(16f, 13f)
                curveTo(15.448f, 13f, 15f, 13.448f, 15f, 14f)
                verticalLineTo(17.586f)
                lineTo(14.707f, 17.293f)
                curveTo(14.317f, 16.902f, 13.683f, 16.902f, 13.293f, 17.293f)
                curveTo(12.902f, 17.683f, 12.902f, 18.317f, 13.293f, 18.707f)
                lineTo(15.293f, 20.707f)
                curveTo(15.683f, 21.098f, 16.317f, 21.098f, 16.707f, 20.707f)
                lineTo(18.707f, 18.707f)
                curveTo(19.098f, 18.317f, 19.098f, 17.683f, 18.707f, 17.293f)
                curveTo(18.317f, 16.902f, 17.683f, 16.902f, 17.293f, 17.293f)
                lineTo(17f, 17.586f)
                verticalLineTo(14f)
                curveTo(17f, 13.448f, 16.552f, 13f, 16f, 13f)
                close()
            }
        }.build()

        return _TextDirectionRotate90Ltr!!
    }

@Suppress("ObjectPropertyName")
private var _TextDirectionRotate90Ltr: ImageVector? = null

@Preview
@Composable
private fun TextDirectionRotate90LtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextDirectionRotate90Ltr, contentDescription = null)
    }
}
