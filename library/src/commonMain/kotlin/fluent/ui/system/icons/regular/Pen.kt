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

public val FluentIcons.Regular.Pen: ImageVector
    get() {
        if (_Pen != null) {
            return _Pen!!
        }
        _Pen = ImageVector.Builder(
            name = "Regular.Pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.952f, 3.047f)
                curveTo(19.554f, 1.65f, 17.288f, 1.65f, 15.891f, 3.047f)
                lineTo(3.941f, 14.999f)
                curveTo(3.535f, 15.405f, 3.249f, 15.916f, 3.116f, 16.475f)
                lineTo(2.02f, 21.077f)
                curveTo(1.96f, 21.33f, 2.036f, 21.597f, 2.22f, 21.781f)
                curveTo(2.404f, 21.965f, 2.67f, 22.04f, 2.924f, 21.98f)
                lineTo(7.525f, 20.885f)
                curveTo(8.084f, 20.751f, 8.595f, 20.466f, 9.002f, 20.059f)
                lineTo(19f, 10.06f)
                curveTo(19.678f, 10.744f, 19.676f, 11.848f, 18.994f, 12.53f)
                lineTo(17.211f, 14.314f)
                curveTo(16.918f, 14.606f, 16.918f, 15.081f, 17.211f, 15.374f)
                curveTo(17.504f, 15.667f, 17.979f, 15.667f, 18.271f, 15.374f)
                lineTo(20.055f, 13.591f)
                curveTo(21.322f, 12.323f, 21.324f, 10.269f, 20.06f, 9f)
                lineTo(20.952f, 8.108f)
                curveTo(22.349f, 6.71f, 22.349f, 4.445f, 20.952f, 3.047f)
                close()
                moveTo(16.952f, 4.108f)
                curveTo(17.763f, 3.296f, 19.08f, 3.296f, 19.891f, 4.108f)
                curveTo(20.703f, 4.919f, 20.703f, 6.235f, 19.891f, 7.047f)
                lineTo(7.941f, 18.999f)
                curveTo(7.731f, 19.209f, 7.467f, 19.356f, 7.178f, 19.425f)
                lineTo(3.762f, 20.239f)
                lineTo(4.575f, 16.823f)
                curveTo(4.644f, 16.534f, 4.792f, 16.269f, 5.002f, 16.059f)
                lineTo(16.952f, 4.108f)
                close()
            }
        }.build()

        return _Pen!!
    }

@Suppress("ObjectPropertyName")
private var _Pen: ImageVector? = null

@Preview
@Composable
private fun PenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Pen, contentDescription = null)
    }
}
