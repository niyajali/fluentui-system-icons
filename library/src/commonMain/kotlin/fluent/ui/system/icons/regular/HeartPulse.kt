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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.HeartPulse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HeartPulse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.82f, 5.579f)
            lineTo(11.999f, 6.402f)
            lineTo(11.176f, 5.578f)
            curveTo(9.077f, 3.479f, 5.674f, 3.479f, 3.575f, 5.578f)
            curveTo(2.108f, 7.045f, 1.666f, 9.149f, 2.249f, 11f)
            horizontalLineTo(3.854f)
            curveTo(3.196f, 9.568f, 3.456f, 7.818f, 4.635f, 6.639f)
            curveTo(6.148f, 5.126f, 8.602f, 5.126f, 10.115f, 6.639f)
            lineTo(11.473f, 7.996f)
            curveTo(11.771f, 8.294f, 12.255f, 8.289f, 12.546f, 7.984f)
            lineTo(13.881f, 6.64f)
            curveTo(15.398f, 5.123f, 17.853f, 5.123f, 19.37f, 6.64f)
            curveTo(20.55f, 7.82f, 20.808f, 9.566f, 20.149f, 11f)
            horizontalLineTo(21.754f)
            curveTo(22.338f, 9.148f, 21.899f, 7.047f, 20.431f, 5.579f)
            curveTo(18.328f, 3.476f, 14.923f, 3.476f, 12.82f, 5.579f)
            close()
            moveTo(11.47f, 21.075f)
            lineTo(4.894f, 14.5f)
            horizontalLineTo(6.857f)
            curveTo(6.908f, 14.5f, 6.959f, 14.497f, 7.009f, 14.493f)
            lineTo(12f, 19.484f)
            lineTo(16.988f, 14.5f)
            horizontalLineTo(19.11f)
            lineTo(12.531f, 21.075f)
            curveTo(12.238f, 21.368f, 11.763f, 21.368f, 11.47f, 21.075f)
            close()
            moveTo(9.421f, 8.414f)
            curveTo(9.292f, 8.157f, 9.029f, 7.996f, 8.742f, 8f)
            curveTo(8.455f, 8.003f, 8.195f, 8.169f, 8.072f, 8.429f)
            lineTo(6.382f, 12f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 12f, 2f, 12.335f, 2f, 12.75f)
            curveTo(2f, 13.164f, 2.336f, 13.5f, 2.75f, 13.5f)
            horizontalLineTo(6.857f)
            curveTo(7.147f, 13.5f, 7.411f, 13.332f, 7.535f, 13.07f)
            lineTo(8.769f, 10.464f)
            lineTo(11.329f, 15.585f)
            curveTo(11.446f, 15.82f, 11.678f, 15.976f, 11.939f, 15.997f)
            curveTo(12.201f, 16.018f, 12.454f, 15.901f, 12.608f, 15.689f)
            lineTo(15.306f, 11.953f)
            lineTo(16.436f, 13.243f)
            curveTo(16.578f, 13.406f, 16.784f, 13.5f, 17f, 13.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 13.5f, 22f, 13.164f, 22f, 12.75f)
            curveTo(22f, 12.335f, 21.664f, 12f, 21.25f, 12f)
            horizontalLineTo(17.34f)
            lineTo(15.814f, 10.256f)
            curveTo(15.664f, 10.084f, 15.443f, 9.99f, 15.215f, 10f)
            curveTo(14.987f, 10.011f, 14.776f, 10.125f, 14.642f, 10.31f)
            lineTo(12.117f, 13.807f)
            lineTo(9.421f, 8.414f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeartPulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HeartPulse, contentDescription = null)
    }
}
