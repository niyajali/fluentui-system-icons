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

public val FluentUi.Filled.BatteryCharge: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BatteryCharge",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.75f, 6f)
            horizontalLineTo(17f)
            curveTo(18.598f, 6f, 19.904f, 7.249f, 19.995f, 8.824f)
            lineTo(20f, 9f)
            verticalLineTo(10f)
            lineTo(21.001f, 10.018f)
            curveTo(21.183f, 10.018f, 21.354f, 10.066f, 21.501f, 10.152f)
            curveTo(21.766f, 10.305f, 21.955f, 10.578f, 21.993f, 10.896f)
            lineTo(22.001f, 11.018f)
            verticalLineTo(13.018f)
            curveTo(22.001f, 13.388f, 21.799f, 13.711f, 21.501f, 13.884f)
            curveTo(21.39f, 13.948f, 21.267f, 13.991f, 21.135f, 14.009f)
            lineTo(21.001f, 14.018f)
            lineTo(20f, 14f)
            verticalLineTo(15f)
            curveTo(20f, 16.598f, 18.751f, 17.904f, 17.176f, 17.995f)
            lineTo(17f, 18f)
            horizontalLineTo(7.995f)
            curveTo(7.616f, 18f, 7.302f, 17.718f, 7.252f, 17.352f)
            lineTo(7.245f, 17.25f)
            verticalLineTo(12.75f)
            curveTo(7.245f, 12.37f, 7.527f, 12.057f, 7.893f, 12.007f)
            lineTo(7.995f, 12f)
            horizontalLineTo(8.623f)
            curveTo(9.339f, 12f, 9.927f, 11.454f, 9.994f, 10.755f)
            lineTo(10f, 10.623f)
            verticalLineTo(6.75f)
            curveTo(10f, 6.37f, 10.282f, 6.057f, 10.648f, 6.007f)
            lineTo(10.75f, 6f)
            horizontalLineTo(17f)
            horizontalLineTo(10.75f)
            close()
            moveTo(6.645f, 4.007f)
            lineTo(6.747f, 4f)
            curveTo(7.127f, 4f, 7.44f, 4.282f, 7.49f, 4.648f)
            lineTo(7.497f, 4.75f)
            lineTo(7.496f, 6f)
            horizontalLineTo(8.254f)
            curveTo(8.668f, 6f, 9.004f, 6.336f, 9.004f, 6.75f)
            verticalLineTo(9.249f)
            curveTo(9.004f, 10.215f, 8.22f, 10.999f, 7.254f, 10.999f)
            lineTo(6.251f, 10.998f)
            lineTo(6.252f, 17.243f)
            curveTo(6.252f, 17.623f, 5.97f, 17.937f, 5.604f, 17.986f)
            lineTo(5.502f, 17.993f)
            curveTo(5.122f, 17.993f, 4.808f, 17.711f, 4.759f, 17.345f)
            lineTo(4.752f, 17.243f)
            lineTo(4.752f, 10.998f)
            lineTo(3.75f, 10.999f)
            curveTo(2.783f, 10.999f, 2f, 10.215f, 2f, 9.249f)
            verticalLineTo(6.75f)
            curveTo(2f, 6.336f, 2.336f, 6f, 2.75f, 6f)
            horizontalLineTo(3.501f)
            lineTo(3.501f, 4.75f)
            curveTo(3.501f, 4.37f, 3.783f, 4.057f, 4.149f, 4.007f)
            lineTo(4.251f, 4f)
            curveTo(4.631f, 4f, 4.945f, 4.282f, 4.994f, 4.648f)
            lineTo(5.001f, 4.75f)
            lineTo(5.001f, 6f)
            horizontalLineTo(5.996f)
            lineTo(5.997f, 4.75f)
            curveTo(5.997f, 4.37f, 6.279f, 4.057f, 6.645f, 4.007f)
            lineTo(6.747f, 4f)
            lineTo(6.645f, 4.007f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BatteryChargePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BatteryCharge, contentDescription = null)
    }
}
