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

public val FluentUi.Filled.DesktopPulse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopPulse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 21.25f)
            curveTo(6f, 21.664f, 6.336f, 22f, 6.75f, 22f)
            horizontalLineTo(17.25f)
            lineTo(17.352f, 21.993f)
            curveTo(17.718f, 21.944f, 18f, 21.63f, 18f, 21.25f)
            curveTo(18f, 20.836f, 17.664f, 20.5f, 17.25f, 20.5f)
            lineTo(15.499f, 20.5f)
            verticalLineTo(18.002f)
            lineTo(19.749f, 18.002f)
            lineTo(19.903f, 17.997f)
            curveTo(21.074f, 17.918f, 21.999f, 16.943f, 21.999f, 15.752f)
            verticalLineTo(13f)
            horizontalLineTo(17f)
            curveTo(16.429f, 13f, 15.894f, 12.722f, 15.566f, 12.254f)
            lineTo(15.374f, 11.98f)
            lineTo(13.507f, 15.141f)
            curveTo(13.167f, 15.715f, 12.531f, 16.046f, 11.866f, 15.995f)
            curveTo(11.201f, 15.944f, 10.623f, 15.519f, 10.375f, 14.9f)
            lineTo(8.907f, 11.23f)
            lineTo(8.576f, 11.967f)
            curveTo(8.294f, 12.596f, 7.669f, 13f, 6.98f, 13f)
            horizontalLineTo(2f)
            verticalLineTo(15.752f)
            lineTo(2.005f, 15.906f)
            curveTo(2.084f, 17.077f, 3.059f, 18.002f, 4.25f, 18.002f)
            lineTo(8.499f, 18.002f)
            verticalLineTo(20.5f)
            lineTo(6.75f, 20.5f)
            lineTo(6.648f, 20.507f)
            curveTo(6.282f, 20.556f, 6f, 20.87f, 6f, 21.25f)
            close()
            moveTo(9.998f, 18.002f)
            horizontalLineTo(13.998f)
            lineTo(13.999f, 20.5f)
            horizontalLineTo(9.999f)
            lineTo(9.998f, 18.002f)
            close()
            moveTo(21.999f, 5.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(17.911f)
            lineTo(16.684f, 7.747f)
            curveTo(16.343f, 7.259f, 15.777f, 6.979f, 15.183f, 7.002f)
            curveTo(14.588f, 7.025f, 14.046f, 7.348f, 13.743f, 7.86f)
            lineTo(12.303f, 10.297f)
            lineTo(10.625f, 6.1f)
            curveTo(10.364f, 5.448f, 9.738f, 5.015f, 9.036f, 5.001f)
            curveTo(8.334f, 4.986f, 7.691f, 5.393f, 7.404f, 6.034f)
            lineTo(5.847f, 9.5f)
            horizontalLineTo(2f)
            verticalLineTo(5.25f)
            curveTo(2f, 4.059f, 2.925f, 3.084f, 4.096f, 3.005f)
            lineTo(4.25f, 3f)
            horizontalLineTo(19.749f)
            curveTo(20.94f, 3f, 21.914f, 3.925f, 21.994f, 5.096f)
            lineTo(21.999f, 5.25f)
            close()
            moveTo(9.696f, 6.472f)
            curveTo(9.585f, 6.192f, 9.316f, 6.007f, 9.016f, 6.001f)
            curveTo(8.715f, 5.994f, 8.439f, 6.169f, 8.316f, 6.443f)
            lineTo(6.494f, 10.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 10.5f, 2f, 10.836f, 2f, 11.25f)
            curveTo(2f, 11.665f, 2.336f, 12f, 2.75f, 12f)
            horizontalLineTo(6.98f)
            curveTo(7.275f, 12f, 7.543f, 11.827f, 7.664f, 11.557f)
            lineTo(8.96f, 8.67f)
            lineTo(11.304f, 14.529f)
            curveTo(11.41f, 14.794f, 11.658f, 14.976f, 11.943f, 14.998f)
            curveTo(12.228f, 15.02f, 12.5f, 14.878f, 12.646f, 14.632f)
            lineTo(15.303f, 10.134f)
            lineTo(16.386f, 11.681f)
            curveTo(16.526f, 11.881f, 16.755f, 12f, 17f, 12f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 12f, 22f, 11.665f, 22f, 11.25f)
            curveTo(22f, 10.836f, 21.664f, 10.5f, 21.25f, 10.5f)
            horizontalLineTo(17.39f)
            lineTo(15.864f, 8.32f)
            curveTo(15.718f, 8.111f, 15.476f, 7.991f, 15.221f, 8.001f)
            curveTo(14.966f, 8.011f, 14.734f, 8.149f, 14.604f, 8.369f)
            lineTo(12.13f, 12.556f)
            lineTo(9.696f, 6.472f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DesktopPulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DesktopPulse, contentDescription = null)
    }
}
