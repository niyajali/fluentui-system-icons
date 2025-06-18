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

public val FluentIcons.Filled.ShieldSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShieldSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.06f, 12.902f)
            curveTo(16.849f, 13.731f, 18.171f, 13.731f, 18.96f, 12.902f)
            lineTo(19.453f, 12.383f)
            curveTo(19.998f, 12.606f, 20.498f, 12.919f, 20.938f, 13.305f)
            lineTo(20.751f, 13.936f)
            curveTo(20.427f, 15.033f, 21.089f, 16.179f, 22.201f, 16.447f)
            lineTo(22.74f, 16.577f)
            curveTo(22.789f, 16.877f, 22.815f, 17.186f, 22.815f, 17.5f)
            curveTo(22.814f, 17.801f, 22.791f, 18.096f, 22.746f, 18.383f)
            lineTo(22.162f, 18.528f)
            curveTo(21.061f, 18.8f, 20.407f, 19.934f, 20.722f, 21.024f)
            lineTo(20.919f, 21.71f)
            curveTo(20.48f, 22.093f, 19.98f, 22.403f, 19.437f, 22.623f)
            lineTo(18.938f, 22.098f)
            curveTo(18.149f, 21.269f, 16.827f, 21.269f, 16.039f, 22.098f)
            lineTo(15.546f, 22.617f)
            curveTo(15.001f, 22.394f, 14.501f, 22.08f, 14.061f, 21.695f)
            lineTo(14.248f, 21.064f)
            curveTo(14.572f, 19.966f, 13.91f, 18.821f, 12.798f, 18.553f)
            lineTo(12.258f, 18.423f)
            curveTo(12.209f, 18.123f, 12.184f, 17.815f, 12.184f, 17.5f)
            curveTo(12.184f, 17.2f, 12.207f, 16.904f, 12.252f, 16.617f)
            lineTo(12.836f, 16.472f)
            curveTo(13.937f, 16.2f, 14.592f, 15.066f, 14.277f, 13.976f)
            lineTo(14.079f, 13.29f)
            curveTo(14.518f, 12.907f, 15.018f, 12.597f, 15.561f, 12.376f)
            lineTo(16.06f, 12.902f)
            close()
            moveTo(11.55f, 2.15f)
            curveTo(11.816f, 1.95f, 12.184f, 1.95f, 12.45f, 2.15f)
            curveTo(14.992f, 4.056f, 17.587f, 5.001f, 20.25f, 5.001f)
            curveTo(20.664f, 5.001f, 21f, 5.336f, 21f, 5.751f)
            verticalLineTo(11f)
            curveTo(21f, 11.339f, 20.985f, 11.671f, 20.958f, 11.997f)
            curveTo(19.956f, 11.366f, 18.771f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.911f, 11f, 17.5f)
            curveTo(11f, 19.151f, 11.617f, 20.656f, 12.63f, 21.802f)
            curveTo(12.512f, 21.851f, 12.394f, 21.9f, 12.274f, 21.948f)
            curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.726f, 21.948f)
            curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
            verticalLineTo(5.751f)
            curveTo(3f, 5.336f, 3.336f, 5.001f, 3.75f, 5.001f)
            curveTo(6.413f, 5.001f, 9.008f, 4.056f, 11.55f, 2.15f)
            close()
            moveTo(17.499f, 16f)
            curveTo(16.698f, 16f, 16.05f, 16.672f, 16.05f, 17.5f)
            curveTo(16.05f, 18.329f, 16.699f, 19f, 17.499f, 19f)
            curveTo(18.299f, 19f, 18.949f, 18.329f, 18.949f, 17.5f)
            curveTo(18.949f, 16.672f, 18.3f, 16f, 17.499f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShieldSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShieldSettings, contentDescription = null)
    }
}
