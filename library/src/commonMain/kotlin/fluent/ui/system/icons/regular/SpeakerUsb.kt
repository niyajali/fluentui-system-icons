/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.SpeakerUsb: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SpeakerUsb",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15f, 4.248f)
            curveTo(15f, 3.952f, 14.895f, 3.666f, 14.704f, 3.441f)
            curveTo(14.258f, 2.914f, 13.469f, 2.848f, 12.943f, 3.294f)
            lineTo(7.975f, 7.498f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 7.498f, 2f, 8.505f, 2f, 9.748f)
            verticalLineTo(14.248f)
            curveTo(2f, 15.491f, 3.007f, 16.498f, 4.25f, 16.498f)
            horizontalLineTo(7.975f)
            lineTo(12.942f, 20.704f)
            curveTo(13.168f, 20.895f, 13.454f, 21f, 13.75f, 21f)
            curveTo(14.44f, 21f, 15f, 20.44f, 15f, 19.75f)
            verticalLineTo(4.248f)
            close()
            moveTo(8.525f, 8.998f)
            lineTo(13.5f, 4.787f)
            verticalLineTo(19.21f)
            lineTo(8.525f, 14.998f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 14.998f, 3.5f, 14.662f, 3.5f, 14.248f)
            verticalLineTo(9.748f)
            curveTo(3.5f, 9.334f, 3.836f, 8.998f, 4.25f, 8.998f)
            horizontalLineTo(8.525f)
            close()
            moveTo(16.163f, 13.955f)
            lineTo(17.5f, 16f)
            verticalLineTo(18f)
            curveTo(17.5f, 18.552f, 17.948f, 19f, 18.5f, 19f)
            horizontalLineTo(20.5f)
            curveTo(21.052f, 19f, 21.5f, 18.552f, 21.5f, 18f)
            verticalLineTo(16f)
            lineTo(22.833f, 13.994f)
            curveTo(22.942f, 13.83f, 23f, 13.637f, 23f, 13.44f)
            verticalLineTo(10f)
            curveTo(23f, 9.447f, 22.552f, 9f, 22f, 9f)
            verticalLineTo(7f)
            curveTo(22f, 6.447f, 21.552f, 6f, 21f, 6f)
            horizontalLineTo(18f)
            curveTo(17.448f, 6f, 17f, 6.447f, 17f, 7f)
            verticalLineTo(9f)
            curveTo(16.448f, 9f, 16f, 9.447f, 16f, 10f)
            verticalLineTo(13.408f)
            curveTo(16f, 13.602f, 16.057f, 13.792f, 16.163f, 13.955f)
            close()
            moveTo(18.5f, 7.5f)
            horizontalLineTo(20.5f)
            verticalLineTo(9f)
            horizontalLineTo(18.5f)
            verticalLineTo(7.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SpeakerUsbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SpeakerUsb, contentDescription = null)
    }
}
