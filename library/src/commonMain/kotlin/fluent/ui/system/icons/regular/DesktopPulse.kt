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

public val FluentUi.Regular.DesktopPulse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DesktopPulse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 22f)
            curveTo(6.336f, 22f, 6f, 21.665f, 6f, 21.25f)
            curveTo(6f, 20.871f, 6.282f, 20.557f, 6.648f, 20.507f)
            lineTo(6.75f, 20.5f)
            lineTo(8.499f, 20.5f)
            verticalLineTo(18.002f)
            lineTo(4.25f, 18.002f)
            curveTo(3.059f, 18.002f, 2.084f, 17.077f, 2.005f, 15.906f)
            lineTo(2f, 15.752f)
            verticalLineTo(13f)
            horizontalLineTo(3.5f)
            verticalLineTo(15.752f)
            curveTo(3.5f, 16.132f, 3.782f, 16.446f, 4.148f, 16.495f)
            lineTo(4.25f, 16.502f)
            horizontalLineTo(19.749f)
            curveTo(20.128f, 16.502f, 20.442f, 16.22f, 20.492f, 15.854f)
            lineTo(20.499f, 15.752f)
            verticalLineTo(13f)
            horizontalLineTo(21.999f)
            verticalLineTo(15.752f)
            curveTo(21.999f, 16.943f, 21.074f, 17.918f, 19.903f, 17.997f)
            lineTo(19.749f, 18.002f)
            lineTo(15.499f, 18.002f)
            verticalLineTo(20.5f)
            lineTo(17.25f, 20.5f)
            curveTo(17.664f, 20.5f, 18f, 20.836f, 18f, 21.25f)
            curveTo(18f, 21.63f, 17.718f, 21.944f, 17.352f, 21.994f)
            lineTo(17.25f, 22f)
            horizontalLineTo(6.75f)
            close()
            moveTo(13.998f, 18.002f)
            horizontalLineTo(9.998f)
            lineTo(9.999f, 20.5f)
            horizontalLineTo(13.999f)
            lineTo(13.998f, 18.002f)
            close()
            moveTo(3.5f, 9.5f)
            horizontalLineTo(2f)
            verticalLineTo(5.25f)
            curveTo(2f, 4.059f, 2.925f, 3.084f, 4.096f, 3.005f)
            lineTo(4.25f, 3f)
            horizontalLineTo(19.749f)
            curveTo(20.94f, 3f, 21.914f, 3.925f, 21.994f, 5.096f)
            lineTo(21.999f, 5.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(20.499f)
            verticalLineTo(5.25f)
            curveTo(20.499f, 4.87f, 20.217f, 4.557f, 19.851f, 4.507f)
            lineTo(19.749f, 4.5f)
            horizontalLineTo(4.25f)
            curveTo(3.87f, 4.5f, 3.557f, 4.782f, 3.507f, 5.148f)
            lineTo(3.5f, 5.25f)
            verticalLineTo(9.5f)
            close()
            moveTo(9.696f, 6.472f)
            curveTo(9.585f, 6.192f, 9.316f, 6.007f, 9.016f, 6.001f)
            curveTo(8.715f, 5.994f, 8.439f, 6.169f, 8.316f, 6.443f)
            lineTo(6.494f, 10.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 10.5f, 2f, 10.836f, 2f, 11.25f)
            curveTo(2f, 11.665f, 2.336f, 12f, 2.75f, 12f)
            horizontalLineTo(6.98f)
            curveTo(7.275f, 12f, 7.543f, 11.827f, 7.664f, 11.558f)
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
        Image(imageVector = FluentUi.Regular.DesktopPulse, contentDescription = null)
    }
}
