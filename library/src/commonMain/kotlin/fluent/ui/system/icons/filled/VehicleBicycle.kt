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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.VehicleBicycle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VehicleBicycle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 2f)
            curveTo(12.448f, 2f, 12f, 2.448f, 12f, 3f)
            curveTo(12f, 3.552f, 12.448f, 4f, 13f, 4f)
            horizontalLineTo(14.187f)
            lineTo(14.812f, 7f)
            horizontalLineTo(9f)
            verticalLineTo(6f)
            curveTo(9f, 5.448f, 8.551f, 5f, 7.999f, 5f)
            horizontalLineTo(5f)
            curveTo(4.448f, 5f, 4f, 5.448f, 4f, 6f)
            curveTo(4f, 6.552f, 4.448f, 7f, 5f, 7f)
            horizontalLineTo(7f)
            verticalLineTo(7.86f)
            lineTo(6.098f, 11.018f)
            curveTo(3.801f, 11.221f, 2f, 13.15f, 2f, 15.5f)
            curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
            curveTo(8.985f, 20f, 11f, 17.985f, 11f, 15.5f)
            curveTo(11f, 15.457f, 10.999f, 15.415f, 10.998f, 15.372f)
            lineTo(15.469f, 10.156f)
            lineTo(15.721f, 11.365f)
            curveTo(14.121f, 12.055f, 13f, 13.646f, 13f, 15.5f)
            curveTo(13f, 17.985f, 15.015f, 20f, 17.5f, 20f)
            curveTo(19.985f, 20f, 22f, 17.985f, 22f, 15.5f)
            curveTo(22f, 13.078f, 20.087f, 11.103f, 17.689f, 11.004f)
            lineTo(15.979f, 2.796f)
            curveTo(15.882f, 2.332f, 15.474f, 2f, 15f, 2f)
            horizontalLineTo(13f)
            close()
            moveTo(16.145f, 13.399f)
            lineTo(16.521f, 15.204f)
            curveTo(16.634f, 15.745f, 17.163f, 16.092f, 17.704f, 15.979f)
            curveTo(18.245f, 15.866f, 18.592f, 15.337f, 18.479f, 14.796f)
            lineTo(18.121f, 13.078f)
            curveTo(19.201f, 13.354f, 20f, 14.334f, 20f, 15.5f)
            curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
            curveTo(16.119f, 18f, 15f, 16.881f, 15f, 15.5f)
            curveTo(15f, 14.619f, 15.456f, 13.844f, 16.145f, 13.399f)
            close()
            moveTo(10.309f, 13.103f)
            curveTo(9.792f, 12.283f, 9.018f, 11.642f, 8.099f, 11.292f)
            lineTo(8.754f, 9f)
            horizontalLineTo(13.826f)
            lineTo(10.309f, 13.103f)
            close()
            moveTo(7.546f, 13.229f)
            curveTo(7.925f, 13.403f, 8.252f, 13.67f, 8.5f, 14f)
            horizontalLineTo(7.326f)
            lineTo(7.546f, 13.229f)
            close()
            moveTo(5.468f, 13.222f)
            lineTo(5.038f, 14.725f)
            curveTo(4.952f, 15.027f, 5.013f, 15.352f, 5.202f, 15.602f)
            curveTo(5.391f, 15.853f, 5.686f, 16f, 6f, 16f)
            horizontalLineTo(8.95f)
            curveTo(8.718f, 17.141f, 7.709f, 18f, 6.5f, 18f)
            curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
            curveTo(4f, 14.487f, 4.602f, 13.615f, 5.468f, 13.222f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VehicleBicyclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VehicleBicycle, contentDescription = null)
    }
}
