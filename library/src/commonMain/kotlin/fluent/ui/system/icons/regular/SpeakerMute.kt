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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.SpeakerMute: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SpeakerMute",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.92f, 3.315f)
            curveTo(13.726f, 2.599f, 15f, 3.171f, 15f, 4.25f)
            verticalLineTo(19.745f)
            curveTo(15f, 20.824f, 13.726f, 21.396f, 12.919f, 20.679f)
            lineTo(8.428f, 16.685f)
            curveTo(8.291f, 16.563f, 8.113f, 16.496f, 7.93f, 16.496f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 16.496f, 2f, 15.489f, 2f, 14.246f)
            verticalLineTo(9.748f)
            curveTo(2f, 8.505f, 3.007f, 7.498f, 4.25f, 7.498f)
            horizontalLineTo(7.93f)
            curveTo(8.113f, 7.498f, 8.291f, 7.431f, 8.428f, 7.309f)
            lineTo(12.92f, 3.315f)
            close()
            moveTo(13.5f, 4.806f)
            lineTo(9.425f, 8.43f)
            curveTo(9.013f, 8.796f, 8.481f, 8.998f, 7.93f, 8.998f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 8.998f, 3.5f, 9.334f, 3.5f, 9.748f)
            verticalLineTo(14.246f)
            curveTo(3.5f, 14.66f, 3.836f, 14.996f, 4.25f, 14.996f)
            horizontalLineTo(7.93f)
            curveTo(8.481f, 14.996f, 9.013f, 15.198f, 9.425f, 15.565f)
            lineTo(13.5f, 19.188f)
            verticalLineTo(4.806f)
            close()
            moveTo(16.22f, 9.219f)
            curveTo(16.513f, 8.926f, 16.987f, 8.926f, 17.28f, 9.219f)
            lineTo(19f, 10.939f)
            lineTo(20.72f, 9.219f)
            curveTo(21.013f, 8.926f, 21.487f, 8.926f, 21.78f, 9.219f)
            curveTo(22.073f, 9.512f, 22.073f, 9.987f, 21.78f, 10.28f)
            lineTo(20.061f, 12f)
            lineTo(21.78f, 13.719f)
            curveTo(22.073f, 14.012f, 22.073f, 14.487f, 21.78f, 14.78f)
            curveTo(21.487f, 15.073f, 21.013f, 15.073f, 20.72f, 14.78f)
            lineTo(19f, 13.06f)
            lineTo(17.28f, 14.78f)
            curveTo(16.987f, 15.073f, 16.513f, 15.073f, 16.22f, 14.78f)
            curveTo(15.927f, 14.487f, 15.927f, 14.012f, 16.22f, 13.719f)
            lineTo(17.939f, 12f)
            lineTo(16.22f, 10.28f)
            curveTo(15.927f, 9.987f, 15.927f, 9.512f, 16.22f, 9.219f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SpeakerMutePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SpeakerMute, contentDescription = null)
    }
}
