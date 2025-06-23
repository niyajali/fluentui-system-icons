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

public val FluentIcons.Regular.SpeakerOff: ImageVector
    get() {
        if (_SpeakerOff != null) {
            return _SpeakerOff!!
        }
        _SpeakerOff = ImageVector.Builder(
            name = "Regular.SpeakerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(6.438f, 7.499f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 7.499f, 2f, 8.506f, 2f, 9.749f)
                verticalLineTo(14.247f)
                curveTo(2f, 15.489f, 3.007f, 16.497f, 4.25f, 16.497f)
                horizontalLineTo(7.93f)
                curveTo(8.113f, 16.497f, 8.291f, 16.564f, 8.428f, 16.686f)
                lineTo(12.919f, 20.68f)
                curveTo(13.726f, 21.396f, 15f, 20.824f, 15f, 19.746f)
                verticalLineTo(16.061f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(13.5f, 14.561f)
                verticalLineTo(19.189f)
                lineTo(9.425f, 15.565f)
                curveTo(9.013f, 15.199f, 8.481f, 14.997f, 7.93f, 14.997f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 14.997f, 3.5f, 14.661f, 3.5f, 14.247f)
                verticalLineTo(9.749f)
                curveTo(3.5f, 9.334f, 3.836f, 8.999f, 4.25f, 8.999f)
                horizontalLineTo(7.93f)
                curveTo(7.932f, 8.999f, 7.935f, 8.999f, 7.938f, 8.999f)
                lineTo(13.5f, 14.561f)
                close()
                moveTo(13.5f, 4.807f)
                verticalLineTo(10.318f)
                lineTo(15f, 11.818f)
                verticalLineTo(4.25f)
                curveTo(15f, 3.171f, 13.726f, 2.599f, 12.92f, 3.316f)
                lineTo(9.52f, 6.338f)
                lineTo(10.583f, 7.401f)
                lineTo(13.5f, 4.807f)
                close()
                moveTo(17.141f, 13.959f)
                lineTo(18.279f, 15.097f)
                curveTo(18.741f, 14.163f, 19f, 13.111f, 19f, 12f)
                curveTo(19f, 10.797f, 18.696f, 9.662f, 18.16f, 8.672f)
                curveTo(17.962f, 8.308f, 17.507f, 8.172f, 17.143f, 8.369f)
                curveTo(16.779f, 8.566f, 16.643f, 9.022f, 16.84f, 9.386f)
                curveTo(17.261f, 10.163f, 17.5f, 11.052f, 17.5f, 12f)
                curveTo(17.5f, 12.691f, 17.373f, 13.351f, 17.141f, 13.959f)
                close()
                moveTo(19.388f, 16.206f)
                lineTo(20.482f, 17.3f)
                curveTo(21.444f, 15.763f, 22f, 13.946f, 22f, 12f)
                curveTo(22f, 9.774f, 21.272f, 7.716f, 20.041f, 6.054f)
                curveTo(19.794f, 5.721f, 19.324f, 5.651f, 18.992f, 5.897f)
                curveTo(18.659f, 6.144f, 18.589f, 6.614f, 18.835f, 6.946f)
                curveTo(19.882f, 8.359f, 20.5f, 10.106f, 20.5f, 12f)
                curveTo(20.5f, 13.531f, 20.096f, 14.966f, 19.388f, 16.206f)
                close()
            }
        }.build()

        return _SpeakerOff!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerOff: ImageVector? = null

@Preview
@Composable
private fun SpeakerOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SpeakerOff, contentDescription = null)
    }
}
