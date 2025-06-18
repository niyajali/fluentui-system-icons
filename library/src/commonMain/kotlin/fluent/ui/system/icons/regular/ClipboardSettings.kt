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

public val FluentUi.Regular.ClipboardSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ClipboardSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 2f)
            curveTo(14.908f, 2f, 15.862f, 2.875f, 15.986f, 4f)
            lineTo(17.75f, 4f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineTo(11.498f)
            curveTo(19.526f, 11.3f, 19.023f, 11.157f, 18.5f, 11.076f)
            verticalLineTo(6.25f)
            curveTo(18.5f, 5.836f, 18.164f, 5.5f, 17.75f, 5.5f)
            lineTo(15.621f, 5.5f)
            curveTo(15.217f, 6.103f, 14.53f, 6.5f, 13.75f, 6.5f)
            horizontalLineTo(10.25f)
            curveTo(9.47f, 6.5f, 8.783f, 6.103f, 8.379f, 5.5f)
            lineTo(6.25f, 5.5f)
            curveTo(5.836f, 5.5f, 5.5f, 5.836f, 5.5f, 6.25f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            horizontalLineTo(11.732f)
            curveTo(12.019f, 21.051f, 12.383f, 21.556f, 12.81f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            lineTo(8.014f, 3.999f)
            curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(15.99f, 4.032f)
            curveTo(15.988f, 4.021f, 15.987f, 4.01f, 15.986f, 4f)
            lineTo(15.99f, 4.032f)
            close()
            moveTo(15.995f, 4.096f)
            lineTo(16f, 4.25f)
            curveTo(16f, 4.194f, 15.998f, 4.139f, 15.994f, 4.084f)
            lineTo(15.995f, 4.096f)
            close()
            moveTo(13.75f, 3.5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
            curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            close()
            moveTo(14.278f, 13.976f)
            curveTo(14.593f, 15.066f, 13.939f, 16.199f, 12.837f, 16.472f)
            lineTo(12.253f, 16.616f)
            curveTo(12.208f, 16.904f, 12.184f, 17.199f, 12.184f, 17.5f)
            curveTo(12.184f, 17.815f, 12.21f, 18.123f, 12.259f, 18.423f)
            lineTo(12.799f, 18.553f)
            curveTo(13.911f, 18.821f, 14.572f, 19.966f, 14.249f, 21.064f)
            lineTo(14.062f, 21.695f)
            curveTo(14.501f, 22.081f, 15.002f, 22.394f, 15.546f, 22.617f)
            lineTo(16.04f, 22.098f)
            curveTo(16.828f, 21.269f, 18.15f, 21.269f, 18.939f, 22.098f)
            lineTo(19.438f, 22.623f)
            curveTo(19.981f, 22.403f, 20.481f, 22.093f, 20.92f, 21.71f)
            lineTo(20.722f, 21.024f)
            curveTo(20.407f, 19.934f, 21.062f, 18.801f, 22.163f, 18.528f)
            lineTo(22.747f, 18.384f)
            curveTo(22.792f, 18.096f, 22.816f, 17.801f, 22.816f, 17.5f)
            curveTo(22.816f, 17.185f, 22.79f, 16.877f, 22.741f, 16.576f)
            lineTo(22.202f, 16.447f)
            curveTo(21.089f, 16.179f, 20.428f, 15.034f, 20.752f, 13.936f)
            lineTo(20.938f, 13.305f)
            curveTo(20.499f, 12.92f, 19.998f, 12.606f, 19.454f, 12.384f)
            lineTo(18.961f, 12.902f)
            curveTo(18.172f, 13.731f, 16.85f, 13.731f, 16.062f, 12.901f)
            lineTo(15.563f, 12.377f)
            curveTo(15.019f, 12.597f, 14.519f, 12.907f, 14.08f, 13.289f)
            lineTo(14.278f, 13.976f)
            close()
            moveTo(17.5f, 19f)
            curveTo(16.699f, 19f, 16.05f, 18.328f, 16.05f, 17.5f)
            curveTo(16.05f, 16.672f, 16.699f, 16f, 17.5f, 16f)
            curveTo(18.301f, 16f, 18.95f, 16.672f, 18.95f, 17.5f)
            curveTo(18.95f, 18.328f, 18.301f, 19f, 17.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ClipboardSettings, contentDescription = null)
    }
}
