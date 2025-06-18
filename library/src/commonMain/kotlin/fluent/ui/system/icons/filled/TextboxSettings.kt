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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.TextboxSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextboxSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 5.75f)
            curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
            curveTo(11f, 17.332f, 11.006f, 17.165f, 11.019f, 17f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 17f, 6f, 16.664f, 6f, 16.25f)
            curveTo(6f, 15.87f, 6.282f, 15.557f, 6.648f, 15.507f)
            lineTo(6.75f, 15.5f)
            horizontalLineTo(11.314f)
            curveTo(11.619f, 14.553f, 12.137f, 13.701f, 12.81f, 13f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 13f, 6f, 12.664f, 6f, 12.25f)
            curveTo(6f, 11.87f, 6.282f, 11.557f, 6.648f, 11.507f)
            lineTo(6.75f, 11.5f)
            horizontalLineTo(14.25f)
            curveTo(14.412f, 11.5f, 14.563f, 11.552f, 14.686f, 11.639f)
            curveTo(15.537f, 11.23f, 16.492f, 11f, 17.5f, 11f)
            curveTo(18.789f, 11f, 19.99f, 11.375f, 21f, 12.022f)
            verticalLineTo(5.75f)
            close()
            moveTo(17.25f, 7.5f)
            curveTo(17.664f, 7.5f, 18f, 7.836f, 18f, 8.25f)
            curveTo(18f, 8.63f, 17.718f, 8.943f, 17.352f, 8.993f)
            lineTo(17.25f, 9f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 9f, 6f, 8.664f, 6f, 8.25f)
            curveTo(6f, 7.87f, 6.282f, 7.557f, 6.648f, 7.507f)
            lineTo(6.75f, 7.5f)
            horizontalLineTo(17.25f)
            close()
            moveTo(12.5f, 15.628f)
            lineTo(12.947f, 16.059f)
            curveTo(13.765f, 16.846f, 13.765f, 18.154f, 12.947f, 18.941f)
            lineTo(12.5f, 19.372f)
            curveTo(12.701f, 19.945f, 12.991f, 20.474f, 13.353f, 20.941f)
            lineTo(13.955f, 20.763f)
            curveTo(15.052f, 20.439f, 16.198f, 21.1f, 16.466f, 22.212f)
            lineTo(16.639f, 22.928f)
            curveTo(16.919f, 22.975f, 17.207f, 23f, 17.5f, 23f)
            curveTo(17.793f, 23f, 18.081f, 22.975f, 18.361f, 22.928f)
            lineTo(18.534f, 22.212f)
            curveTo(18.802f, 21.1f, 19.948f, 20.439f, 21.045f, 20.763f)
            lineTo(21.647f, 20.941f)
            curveTo(22.009f, 20.474f, 22.299f, 19.945f, 22.5f, 19.372f)
            lineTo(22.053f, 18.941f)
            curveTo(21.235f, 18.154f, 21.235f, 16.846f, 22.053f, 16.059f)
            lineTo(22.5f, 15.628f)
            curveTo(22.299f, 15.055f, 22.009f, 14.526f, 21.647f, 14.059f)
            lineTo(21.045f, 14.237f)
            curveTo(19.948f, 14.561f, 18.802f, 13.9f, 18.534f, 12.788f)
            lineTo(18.361f, 12.072f)
            curveTo(18.081f, 12.025f, 17.793f, 12f, 17.5f, 12f)
            curveTo(17.207f, 12f, 16.919f, 12.025f, 16.639f, 12.072f)
            lineTo(16.466f, 12.788f)
            curveTo(16.198f, 13.9f, 15.052f, 14.561f, 13.955f, 14.237f)
            lineTo(13.353f, 14.059f)
            curveTo(12.991f, 14.526f, 12.701f, 15.055f, 12.5f, 15.628f)
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
private fun TextboxSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextboxSettings, contentDescription = null)
    }
}
