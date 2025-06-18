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

public val FluentUi.Regular.SlideSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(12.81f)
            curveTo(21.556f, 12.383f, 21.051f, 12.019f, 20.5f, 11.732f)
            verticalLineTo(7.25f)
            curveTo(20.5f, 6.284f, 19.716f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 5.5f, 3.5f, 6.284f, 3.5f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(3.5f, 17.716f, 4.284f, 18.5f, 5.25f, 18.5f)
            horizontalLineTo(11.076f)
            curveTo(11.157f, 19.023f, 11.3f, 19.526f, 11.498f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(14.278f, 13.976f)
            curveTo(14.593f, 15.066f, 13.939f, 16.199f, 12.837f, 16.472f)
            lineTo(12.253f, 16.616f)
            curveTo(12.208f, 16.904f, 12.185f, 17.199f, 12.185f, 17.5f)
            curveTo(12.185f, 17.815f, 12.21f, 18.123f, 12.259f, 18.424f)
            lineTo(12.799f, 18.553f)
            curveTo(13.911f, 18.821f, 14.573f, 19.966f, 14.249f, 21.064f)
            lineTo(14.062f, 21.695f)
            curveTo(14.501f, 22.081f, 15.002f, 22.394f, 15.546f, 22.617f)
            lineTo(16.04f, 22.098f)
            curveTo(16.828f, 21.269f, 18.151f, 21.269f, 18.939f, 22.098f)
            lineTo(19.438f, 22.623f)
            curveTo(19.981f, 22.403f, 20.481f, 22.093f, 20.92f, 21.71f)
            lineTo(20.722f, 21.024f)
            curveTo(20.408f, 19.934f, 21.062f, 18.801f, 22.163f, 18.528f)
            lineTo(22.747f, 18.384f)
            curveTo(22.792f, 18.096f, 22.816f, 17.801f, 22.816f, 17.5f)
            curveTo(22.816f, 17.185f, 22.79f, 16.877f, 22.741f, 16.576f)
            lineTo(22.202f, 16.447f)
            curveTo(21.089f, 16.179f, 20.428f, 15.034f, 20.752f, 13.936f)
            lineTo(20.938f, 13.305f)
            curveTo(20.499f, 12.92f, 19.999f, 12.606f, 19.454f, 12.384f)
            lineTo(18.961f, 12.902f)
            curveTo(18.172f, 13.731f, 16.85f, 13.731f, 16.062f, 12.902f)
            lineTo(15.563f, 12.377f)
            curveTo(15.019f, 12.597f, 14.519f, 12.907f, 14.08f, 13.289f)
            lineTo(14.278f, 13.976f)
            close()
            moveTo(17.5f, 19f)
            curveTo(16.699f, 19f, 16.05f, 18.329f, 16.05f, 17.5f)
            curveTo(16.05f, 16.672f, 16.699f, 16f, 17.5f, 16f)
            curveTo(18.301f, 16f, 18.95f, 16.672f, 18.95f, 17.5f)
            curveTo(18.95f, 18.329f, 18.301f, 19f, 17.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SlideSettings, contentDescription = null)
    }
}
