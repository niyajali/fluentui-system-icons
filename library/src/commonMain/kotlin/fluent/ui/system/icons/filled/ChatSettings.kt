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

public val FluentIcons.Filled.ChatSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 12.263f, 21.99f, 12.523f, 21.97f, 12.781f)
            curveTo(20.805f, 11.677f, 19.232f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 19.232f, 11.677f, 20.805f, 12.781f, 21.97f)
            curveTo(12.523f, 21.99f, 12.263f, 22f, 12f, 22f)
            curveTo(10.36f, 22f, 8.775f, 21.604f, 7.356f, 20.858f)
            lineTo(3.065f, 21.975f)
            curveTo(2.611f, 22.094f, 2.147f, 21.821f, 2.029f, 21.367f)
            curveTo(1.992f, 21.227f, 1.992f, 21.079f, 2.029f, 20.939f)
            lineTo(3.145f, 16.65f)
            curveTo(2.397f, 15.229f, 2f, 13.643f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(14.278f, 13.976f)
            curveTo(14.593f, 15.066f, 13.939f, 16.199f, 12.837f, 16.472f)
            lineTo(12.253f, 16.616f)
            curveTo(12.208f, 16.904f, 12.185f, 17.199f, 12.185f, 17.5f)
            curveTo(12.185f, 17.815f, 12.21f, 18.123f, 12.259f, 18.423f)
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
            curveTo(18.172f, 13.731f, 16.85f, 13.731f, 16.062f, 12.901f)
            lineTo(15.563f, 12.377f)
            curveTo(15.019f, 12.597f, 14.519f, 12.907f, 14.08f, 13.289f)
            lineTo(14.278f, 13.976f)
            close()
            moveTo(17.5f, 16f)
            curveTo(18.301f, 16f, 18.95f, 16.672f, 18.95f, 17.5f)
            curveTo(18.95f, 18.328f, 18.301f, 19f, 17.5f, 19f)
            curveTo(16.699f, 19f, 16.05f, 18.328f, 16.05f, 17.5f)
            curveTo(16.05f, 16.672f, 16.699f, 16f, 17.5f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChatSettings, contentDescription = null)
    }
}
