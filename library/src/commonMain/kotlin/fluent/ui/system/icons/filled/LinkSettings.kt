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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.LinkSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LinkSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 6f)
            curveTo(10f, 5.448f, 9.552f, 5f, 9f, 5f)
            horizontalLineTo(7f)
            lineTo(6.783f, 5.005f)
            curveTo(4.122f, 5.118f, 2f, 7.311f, 2f, 10f)
            curveTo(2f, 12.761f, 4.239f, 15f, 7f, 15f)
            horizontalLineTo(9f)
            lineTo(9.117f, 14.993f)
            curveTo(9.614f, 14.936f, 10f, 14.513f, 10f, 14f)
            curveTo(10f, 13.448f, 9.552f, 13f, 9f, 13f)
            horizontalLineTo(7f)
            lineTo(6.824f, 12.995f)
            curveTo(5.249f, 12.904f, 4f, 11.598f, 4f, 10f)
            curveTo(4f, 8.343f, 5.343f, 7f, 7f, 7f)
            horizontalLineTo(9f)
            lineTo(9.117f, 6.993f)
            curveTo(9.614f, 6.936f, 10f, 6.513f, 10f, 6f)
            close()
            moveTo(22f, 10f)
            curveTo(22f, 7.239f, 19.761f, 5f, 17f, 5f)
            horizontalLineTo(15f)
            lineTo(14.883f, 5.007f)
            curveTo(14.386f, 5.064f, 14f, 5.487f, 14f, 6f)
            curveTo(14f, 6.552f, 14.448f, 7f, 15f, 7f)
            horizontalLineTo(17f)
            lineTo(17.176f, 7.005f)
            curveTo(18.751f, 7.096f, 20f, 8.402f, 20f, 10f)
            curveTo(20f, 10.494f, 19.881f, 10.96f, 19.669f, 11.371f)
            curveTo(20.308f, 11.597f, 20.9f, 11.92f, 21.429f, 12.322f)
            curveTo(21.794f, 11.628f, 22f, 10.838f, 22f, 10f)
            close()
            moveTo(17f, 9f)
            horizontalLineTo(7f)
            lineTo(6.883f, 9.007f)
            curveTo(6.386f, 9.064f, 6f, 9.487f, 6f, 10f)
            curveTo(6f, 10.552f, 6.448f, 11f, 7f, 11f)
            horizontalLineTo(17f)
            lineTo(17.117f, 10.993f)
            curveTo(17.614f, 10.936f, 18f, 10.513f, 18f, 10f)
            curveTo(18f, 9.448f, 17.552f, 9f, 17f, 9f)
            close()
            moveTo(12.837f, 16.472f)
            curveTo(13.939f, 16.199f, 14.593f, 15.066f, 14.278f, 13.976f)
            lineTo(14.08f, 13.289f)
            curveTo(14.519f, 12.907f, 15.019f, 12.597f, 15.563f, 12.377f)
            lineTo(16.062f, 12.902f)
            curveTo(16.85f, 13.731f, 18.172f, 13.731f, 18.961f, 12.902f)
            lineTo(19.454f, 12.384f)
            curveTo(19.999f, 12.606f, 20.499f, 12.92f, 20.938f, 13.305f)
            lineTo(20.752f, 13.936f)
            curveTo(20.428f, 15.034f, 21.089f, 16.179f, 22.202f, 16.447f)
            lineTo(22.741f, 16.576f)
            curveTo(22.79f, 16.877f, 22.816f, 17.185f, 22.816f, 17.5f)
            curveTo(22.816f, 17.801f, 22.792f, 18.096f, 22.747f, 18.384f)
            lineTo(22.163f, 18.528f)
            curveTo(21.062f, 18.801f, 20.408f, 19.934f, 20.722f, 21.024f)
            lineTo(20.92f, 21.71f)
            curveTo(20.481f, 22.093f, 19.981f, 22.403f, 19.438f, 22.623f)
            lineTo(18.939f, 22.098f)
            curveTo(18.151f, 21.269f, 16.828f, 21.269f, 16.04f, 22.098f)
            lineTo(15.546f, 22.617f)
            curveTo(15.002f, 22.394f, 14.501f, 22.081f, 14.062f, 21.695f)
            lineTo(14.249f, 21.064f)
            curveTo(14.573f, 19.966f, 13.911f, 18.821f, 12.799f, 18.553f)
            lineTo(12.259f, 18.424f)
            curveTo(12.21f, 18.123f, 12.185f, 17.815f, 12.185f, 17.5f)
            curveTo(12.185f, 17.199f, 12.208f, 16.904f, 12.253f, 16.616f)
            lineTo(12.837f, 16.472f)
            close()
            moveTo(18.95f, 17.5f)
            curveTo(18.95f, 16.672f, 18.301f, 16f, 17.5f, 16f)
            curveTo(16.699f, 16f, 16.05f, 16.672f, 16.05f, 17.5f)
            curveTo(16.05f, 18.329f, 16.699f, 19f, 17.5f, 19f)
            curveTo(18.301f, 19f, 18.95f, 18.329f, 18.95f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LinkSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LinkSettings, contentDescription = null)
    }
}
