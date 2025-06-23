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

public val FluentIcons.Filled.SpeakerMute: ImageVector
    get() {
        if (_SpeakerMute != null) {
            return _SpeakerMute!!
        }
        _SpeakerMute = ImageVector.Builder(
            name = "Filled.SpeakerMute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15f, 4.25f)
                curveTo(15f, 3.172f, 13.726f, 2.6f, 12.92f, 3.316f)
                lineTo(8.428f, 7.31f)
                curveTo(8.291f, 7.432f, 8.113f, 7.499f, 7.93f, 7.499f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 7.499f, 2f, 8.506f, 2f, 9.749f)
                verticalLineTo(14.247f)
                curveTo(2f, 15.49f, 3.007f, 16.497f, 4.25f, 16.497f)
                horizontalLineTo(7.93f)
                curveTo(8.113f, 16.497f, 8.291f, 16.564f, 8.428f, 16.687f)
                lineTo(12.919f, 20.68f)
                curveTo(13.726f, 21.397f, 15f, 20.825f, 15f, 19.746f)
                verticalLineTo(4.25f)
                close()
                moveTo(16.22f, 9.22f)
                curveTo(16.513f, 8.927f, 16.987f, 8.927f, 17.28f, 9.22f)
                lineTo(19f, 10.94f)
                lineTo(20.72f, 9.22f)
                curveTo(21.013f, 8.927f, 21.487f, 8.927f, 21.78f, 9.22f)
                curveTo(22.073f, 9.513f, 22.073f, 9.988f, 21.78f, 10.281f)
                lineTo(20.061f, 12f)
                lineTo(21.78f, 13.72f)
                curveTo(22.073f, 14.013f, 22.073f, 14.488f, 21.78f, 14.781f)
                curveTo(21.487f, 15.074f, 21.013f, 15.074f, 20.72f, 14.781f)
                lineTo(19f, 13.061f)
                lineTo(17.28f, 14.781f)
                curveTo(16.987f, 15.074f, 16.513f, 15.074f, 16.22f, 14.781f)
                curveTo(15.927f, 14.488f, 15.927f, 14.013f, 16.22f, 13.72f)
                lineTo(17.939f, 12f)
                lineTo(16.22f, 10.281f)
                curveTo(15.927f, 9.988f, 15.927f, 9.513f, 16.22f, 9.22f)
                close()
            }
        }.build()

        return _SpeakerMute!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerMute: ImageVector? = null

@Preview
@Composable
private fun SpeakerMutePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SpeakerMute, contentDescription = null)
    }
}
