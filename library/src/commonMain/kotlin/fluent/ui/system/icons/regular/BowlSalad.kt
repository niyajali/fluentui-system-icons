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

public val FluentIcons.Regular.BowlSalad: ImageVector
    get() {
        if (_BowlSalad != null) {
            return _BowlSalad!!
        }
        _BowlSalad = ImageVector.Builder(
            name = "Regular.BowlSalad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.999f, 2f)
                curveTo(9.656f, 2f, 7.656f, 3.465f, 6.863f, 5.529f)
                curveTo(6.425f, 5.402f, 6f, 5.306f, 5.602f, 5.233f)
                curveTo(4.796f, 5.086f, 4.082f, 5.03f, 3.568f, 5.01f)
                curveTo(3.31f, 5f, 3.102f, 4.999f, 2.956f, 5.001f)
                curveTo(2.882f, 5.002f, 2.825f, 5.004f, 2.784f, 5.005f)
                lineTo(2.736f, 5.007f)
                curveTo(2.351f, 5.026f, 2.029f, 5.325f, 2.008f, 5.716f)
                lineTo(2.007f, 5.737f)
                lineTo(2.005f, 5.785f)
                curveTo(2.003f, 5.825f, 2.002f, 5.883f, 2.001f, 5.956f)
                curveTo(1.999f, 6.102f, 2f, 6.311f, 2.009f, 6.568f)
                curveTo(2.029f, 7.082f, 2.086f, 7.796f, 2.233f, 8.603f)
                curveTo(2.367f, 9.338f, 2.581f, 10.168f, 2.922f, 11f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 11f, 2f, 11.336f, 2f, 11.75f)
                verticalLineTo(12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                verticalLineTo(11.75f)
                curveTo(22f, 11.336f, 21.664f, 11f, 21.25f, 11f)
                horizontalLineTo(20.997f)
                curveTo(20.998f, 10.958f, 20.999f, 10.917f, 20.999f, 10.875f)
                curveTo(20.999f, 8.6f, 19.44f, 6.689f, 17.333f, 6.151f)
                curveTo(16.731f, 3.766f, 14.571f, 2f, 11.999f, 2f)
                close()
                moveTo(8.274f, 6.04f)
                curveTo(8.857f, 4.553f, 10.305f, 3.5f, 11.999f, 3.5f)
                curveTo(13.684f, 3.5f, 15.126f, 4.542f, 15.715f, 6.017f)
                curveTo(13.926f, 6.165f, 12.411f, 7.28f, 11.693f, 8.838f)
                curveTo(11.429f, 8.447f, 11.125f, 8.072f, 10.776f, 7.723f)
                curveTo(10.027f, 6.974f, 9.156f, 6.432f, 8.274f, 6.04f)
                close()
                moveTo(19.499f, 10.875f)
                curveTo(19.499f, 10.917f, 19.498f, 10.958f, 19.496f, 11f)
                horizontalLineTo(12.767f)
                lineTo(12.749f, 10.95f)
                curveTo(12.749f, 10.925f, 12.748f, 10.9f, 12.748f, 10.875f)
                curveTo(12.748f, 9.011f, 14.259f, 7.5f, 16.124f, 7.5f)
                curveTo(17.987f, 7.5f, 19.499f, 9.011f, 19.499f, 10.875f)
                close()
                moveTo(9.715f, 8.784f)
                curveTo(10.358f, 9.426f, 10.824f, 10.199f, 11.16f, 11f)
                horizontalLineTo(9.06f)
                lineTo(7.279f, 9.22f)
                curveTo(6.986f, 8.927f, 6.511f, 8.927f, 6.218f, 9.22f)
                curveTo(5.925f, 9.513f, 5.925f, 9.988f, 6.218f, 10.281f)
                lineTo(6.938f, 11f)
                horizontalLineTo(4.568f)
                curveTo(4.13f, 10.124f, 3.865f, 9.187f, 3.709f, 8.333f)
                curveTo(3.577f, 7.611f, 3.526f, 6.97f, 3.508f, 6.511f)
                lineTo(3.508f, 6.509f)
                lineTo(3.51f, 6.509f)
                curveTo(3.97f, 6.526f, 4.611f, 6.577f, 5.332f, 6.709f)
                curveTo(6.792f, 6.976f, 8.491f, 7.559f, 9.715f, 8.784f)
                close()
                moveTo(4.788f, 16.5f)
                horizontalLineTo(19.212f)
                curveTo(17.711f, 18.902f, 15.042f, 20.5f, 12f, 20.5f)
                curveTo(8.958f, 20.5f, 6.289f, 18.902f, 4.788f, 16.5f)
                close()
                moveTo(3.514f, 12.5f)
                horizontalLineTo(20.486f)
                curveTo(20.435f, 13.375f, 20.251f, 14.215f, 19.955f, 15f)
                horizontalLineTo(4.045f)
                curveTo(3.749f, 14.215f, 3.565f, 13.375f, 3.514f, 12.5f)
                close()
                moveTo(2.718f, 5.008f)
                lineTo(2.722f, 5.008f)
                lineTo(2.736f, 5.007f)
                lineTo(2.718f, 5.008f)
                close()
            }
        }.build()

        return _BowlSalad!!
    }

@Suppress("ObjectPropertyName")
private var _BowlSalad: ImageVector? = null

@Preview
@Composable
private fun BowlSaladPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BowlSalad, contentDescription = null)
    }
}
