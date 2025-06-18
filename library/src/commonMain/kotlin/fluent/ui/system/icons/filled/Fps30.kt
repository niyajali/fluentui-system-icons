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

public val FluentIcons.Filled.Fps30: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Fps30",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.75f, 15f)
            curveTo(12.993f, 15f, 14f, 16.007f, 14f, 17.25f)
            curveTo(14f, 18.441f, 13.075f, 19.416f, 11.904f, 19.495f)
            lineTo(11.75f, 19.5f)
            horizontalLineTo(11f)
            verticalLineTo(21.25f)
            curveTo(11f, 21.63f, 10.718f, 21.944f, 10.352f, 21.993f)
            lineTo(10.25f, 22f)
            curveTo(9.87f, 22f, 9.557f, 21.718f, 9.507f, 21.352f)
            lineTo(9.5f, 21.25f)
            verticalLineTo(15.75f)
            curveTo(9.5f, 15.37f, 9.782f, 15.057f, 10.148f, 15.007f)
            lineTo(10.25f, 15f)
            horizontalLineTo(11.75f)
            close()
            moveTo(11.75f, 16.5f)
            horizontalLineTo(11f)
            verticalLineTo(18f)
            horizontalLineTo(11.75f)
            curveTo(12.164f, 18f, 12.5f, 17.664f, 12.5f, 17.25f)
            curveTo(12.5f, 16.87f, 12.218f, 16.556f, 11.852f, 16.507f)
            lineTo(11.75f, 16.5f)
            close()
            moveTo(18f, 15f)
            curveTo(19.105f, 15f, 20f, 15.895f, 20f, 17f)
            curveTo(20f, 17.414f, 19.664f, 17.75f, 19.25f, 17.75f)
            curveTo(18.87f, 17.75f, 18.556f, 17.468f, 18.507f, 17.102f)
            lineTo(18.5f, 17f)
            curveTo(18.5f, 16.754f, 18.323f, 16.55f, 18.09f, 16.508f)
            lineTo(18f, 16.5f)
            horizontalLineTo(17.375f)
            curveTo(17.03f, 16.5f, 16.75f, 16.78f, 16.75f, 17.125f)
            curveTo(16.75f, 17.439f, 16.981f, 17.699f, 17.283f, 17.743f)
            lineTo(17.375f, 17.75f)
            horizontalLineTo(17.875f)
            curveTo(19.049f, 17.75f, 20f, 18.701f, 20f, 19.875f)
            curveTo(20f, 20.998f, 19.129f, 21.917f, 18.027f, 21.995f)
            lineTo(17.875f, 22f)
            horizontalLineTo(17.25f)
            curveTo(16.145f, 22f, 15.25f, 21.105f, 15.25f, 20f)
            curveTo(15.25f, 19.586f, 15.586f, 19.25f, 16f, 19.25f)
            curveTo(16.38f, 19.25f, 16.694f, 19.532f, 16.743f, 19.898f)
            lineTo(16.75f, 20f)
            curveTo(16.75f, 20.246f, 16.927f, 20.45f, 17.16f, 20.492f)
            lineTo(17.25f, 20.5f)
            horizontalLineTo(17.875f)
            curveTo(18.22f, 20.5f, 18.5f, 20.22f, 18.5f, 19.875f)
            curveTo(18.5f, 19.561f, 18.269f, 19.301f, 17.967f, 19.257f)
            lineTo(17.875f, 19.25f)
            horizontalLineTo(17.375f)
            curveTo(16.201f, 19.25f, 15.25f, 18.299f, 15.25f, 17.125f)
            curveTo(15.25f, 16.002f, 16.121f, 15.083f, 17.223f, 15.005f)
            lineTo(17.375f, 15f)
            horizontalLineTo(18f)
            close()
            moveTo(7.75f, 15f)
            curveTo(8.164f, 15f, 8.5f, 15.336f, 8.5f, 15.75f)
            curveTo(8.5f, 16.13f, 8.218f, 16.444f, 7.852f, 16.493f)
            lineTo(7.75f, 16.5f)
            lineTo(5.5f, 16.499f)
            verticalLineTo(18.002f)
            lineTo(7.25f, 18.003f)
            curveTo(7.664f, 18.003f, 8f, 18.339f, 8f, 18.753f)
            curveTo(8f, 19.132f, 7.718f, 19.446f, 7.352f, 19.496f)
            lineTo(7.25f, 19.503f)
            lineTo(5.5f, 19.502f)
            verticalLineTo(21.231f)
            curveTo(5.5f, 21.611f, 5.218f, 21.925f, 4.852f, 21.974f)
            lineTo(4.75f, 21.981f)
            curveTo(4.37f, 21.981f, 4.057f, 21.699f, 4.007f, 21.333f)
            lineTo(4f, 21.231f)
            verticalLineTo(15.75f)
            curveTo(4f, 15.37f, 4.282f, 15.057f, 4.648f, 15.007f)
            lineTo(4.75f, 15f)
            horizontalLineTo(7.75f)
            close()
            moveTo(15f, 3f)
            curveTo(16.598f, 3f, 17.904f, 4.249f, 17.995f, 5.824f)
            lineTo(18f, 6f)
            verticalLineTo(10f)
            curveTo(18f, 11.657f, 16.657f, 13f, 15f, 13f)
            curveTo(13.402f, 13f, 12.096f, 11.751f, 12.005f, 10.176f)
            lineTo(12f, 10f)
            verticalLineTo(6f)
            curveTo(12f, 4.343f, 13.343f, 3f, 15f, 3f)
            close()
            moveTo(15f, 5f)
            curveTo(14.487f, 5f, 14.064f, 5.386f, 14.007f, 5.883f)
            lineTo(14f, 6f)
            verticalLineTo(10f)
            curveTo(14f, 10.552f, 14.448f, 11f, 15f, 11f)
            curveTo(15.513f, 11f, 15.936f, 10.614f, 15.993f, 10.117f)
            lineTo(16f, 10f)
            verticalLineTo(6f)
            curveTo(16f, 5.448f, 15.552f, 5f, 15f, 5f)
            close()
            moveTo(8f, 7f)
            curveTo(8.552f, 7f, 9f, 6.552f, 9f, 6f)
            curveTo(9f, 5.448f, 8.552f, 5f, 8f, 5f)
            curveTo(7.814f, 5f, 7.64f, 5.051f, 7.491f, 5.139f)
            curveTo(7.455f, 5.16f, 7.419f, 5.182f, 7.383f, 5.204f)
            curveTo(7.143f, 5.35f, 6.896f, 5.5f, 6.62f, 5.5f)
            curveTo(5.794f, 5.5f, 5.164f, 4.717f, 5.693f, 4.082f)
            curveTo(6.243f, 3.421f, 7.072f, 3f, 8f, 3f)
            curveTo(9.656f, 3f, 11f, 4.343f, 11f, 6f)
            curveTo(11f, 6.768f, 10.711f, 7.469f, 10.236f, 8f)
            curveTo(10.711f, 8.531f, 11f, 9.232f, 11f, 10f)
            curveTo(11f, 11.657f, 9.656f, 13f, 8f, 13f)
            curveTo(7.072f, 13f, 6.243f, 12.579f, 5.693f, 11.918f)
            curveTo(5.164f, 11.283f, 5.794f, 10.5f, 6.62f, 10.5f)
            curveTo(6.896f, 10.5f, 7.143f, 10.651f, 7.383f, 10.796f)
            curveTo(7.419f, 10.818f, 7.455f, 10.84f, 7.491f, 10.861f)
            curveTo(7.64f, 10.949f, 7.814f, 11f, 8f, 11f)
            curveTo(8.552f, 11f, 9f, 10.552f, 9f, 10f)
            curveTo(9f, 9.448f, 8.552f, 9f, 8f, 9f)
            curveTo(7.447f, 9f, 7f, 8.552f, 7f, 8f)
            curveTo(7f, 7.448f, 7.447f, 7f, 8f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Fps30Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Fps30, contentDescription = null)
    }
}
