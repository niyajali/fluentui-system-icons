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

public val FluentIcons.Filled.Eraser: ImageVector
    get() {
        if (_Eraser != null) {
            return _Eraser!!
        }
        _Eraser = ImageVector.Builder(
            name = "Filled.Eraser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.87f, 2.669f)
                lineTo(20.838f, 7.637f)
                curveTo(21.717f, 8.516f, 21.717f, 9.941f, 20.838f, 10.819f)
                lineTo(12.156f, 19.5f)
                lineTo(18.254f, 19.5f)
                curveTo(18.634f, 19.5f, 18.948f, 19.782f, 18.997f, 20.148f)
                lineTo(19.004f, 20.25f)
                curveTo(19.004f, 20.63f, 18.722f, 20.944f, 18.356f, 20.993f)
                lineTo(18.254f, 21f)
                lineTo(9.844f, 21.001f)
                curveTo(9.228f, 21.035f, 8.601f, 20.816f, 8.13f, 20.346f)
                lineTo(3.161f, 15.377f)
                curveTo(2.283f, 14.498f, 2.283f, 13.074f, 3.161f, 12.195f)
                lineTo(12.688f, 2.669f)
                curveTo(13.566f, 1.79f, 14.991f, 1.79f, 15.87f, 2.669f)
                close()
                moveTo(11.698f, 17.758f)
                lineTo(5.743f, 11.804f)
                lineTo(4.236f, 13.27f)
                curveTo(3.944f, 13.563f, 3.944f, 14.038f, 4.236f, 14.331f)
                lineTo(9.182f, 19.276f)
                curveTo(9.48f, 19.565f, 9.955f, 19.557f, 10.243f, 19.26f)
                lineTo(11.698f, 17.758f)
                close()
            }
        }.build()

        return _Eraser!!
    }

@Suppress("ObjectPropertyName")
private var _Eraser: ImageVector? = null

@Preview
@Composable
private fun EraserPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Eraser, contentDescription = null)
    }
}
