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

public val FluentIcons.Regular.StarLineHorizontal3: ImageVector
    get() {
        if (_StarLineHorizontal3 != null) {
            return _StarLineHorizontal3!!
        }
        _StarLineHorizontal3 = ImageVector.Builder(
            name = "Regular.StarLineHorizontal3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.209f, 3.102f)
                curveTo(12.714f, 2.099f, 11.283f, 2.099f, 10.788f, 3.102f)
                lineTo(8.43f, 7.88f)
                lineTo(3.157f, 8.646f)
                curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
                lineTo(6.224f, 14.668f)
                lineTo(5.324f, 19.919f)
                curveTo(5.135f, 21.022f, 6.292f, 21.863f, 7.283f, 21.342f)
                lineTo(12.347f, 18.679f)
                curveTo(12.714f, 18.486f, 12.855f, 18.033f, 12.662f, 17.666f)
                curveTo(12.469f, 17.3f, 12.016f, 17.159f, 11.649f, 17.351f)
                lineTo(6.854f, 19.873f)
                lineTo(7.716f, 14.843f)
                curveTo(7.791f, 14.406f, 7.646f, 13.959f, 7.328f, 13.649f)
                lineTo(3.674f, 10.087f)
                lineTo(8.724f, 9.353f)
                curveTo(9.163f, 9.289f, 9.543f, 9.013f, 9.74f, 8.614f)
                lineTo(11.998f, 4.039f)
                lineTo(14.487f, 9.082f)
                curveTo(14.613f, 9.338f, 14.874f, 9.5f, 15.16f, 9.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 9.5f, 22f, 9.164f, 22f, 8.75f)
                curveTo(22f, 8.335f, 21.664f, 8f, 21.25f, 8f)
                horizontalLineTo(15.626f)
                lineTo(13.209f, 3.102f)
                close()
                moveTo(14.5f, 12.75f)
                curveTo(14.5f, 12.335f, 14.836f, 12f, 15.25f, 12f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 12f, 22f, 12.335f, 22f, 12.75f)
                curveTo(22f, 13.164f, 21.664f, 13.5f, 21.25f, 13.5f)
                horizontalLineTo(15.25f)
                curveTo(14.836f, 13.5f, 14.5f, 13.164f, 14.5f, 12.75f)
                close()
                moveTo(14.5f, 16.75f)
                curveTo(14.5f, 16.335f, 14.836f, 16f, 15.25f, 16f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 16f, 22f, 16.335f, 22f, 16.75f)
                curveTo(22f, 17.164f, 21.664f, 17.5f, 21.25f, 17.5f)
                horizontalLineTo(15.25f)
                curveTo(14.836f, 17.5f, 14.5f, 17.164f, 14.5f, 16.75f)
                close()
            }
        }.build()

        return _StarLineHorizontal3!!
    }

@Suppress("ObjectPropertyName")
private var _StarLineHorizontal3: ImageVector? = null

@Preview
@Composable
private fun StarLineHorizontal3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.StarLineHorizontal3, contentDescription = null)
    }
}
