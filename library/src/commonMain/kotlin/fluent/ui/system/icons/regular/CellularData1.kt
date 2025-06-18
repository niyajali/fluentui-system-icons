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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.CellularData1: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CellularData1",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.75f, 17f)
            curveTo(4.13f, 17f, 4.443f, 17.282f, 4.493f, 17.648f)
            lineTo(4.5f, 17.75f)
            verticalLineTo(19.25f)
            curveTo(4.5f, 19.664f, 4.164f, 20f, 3.75f, 20f)
            curveTo(3.37f, 20f, 3.057f, 19.718f, 3.007f, 19.352f)
            lineTo(3f, 19.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 17.336f, 3.336f, 17f, 3.75f, 17f)
            close()
            moveTo(11.75f, 11f)
            curveTo(12.13f, 11f, 12.443f, 11.282f, 12.493f, 11.648f)
            lineTo(12.5f, 11.75f)
            verticalLineTo(19.25f)
            curveTo(12.5f, 19.664f, 12.164f, 20f, 11.75f, 20f)
            curveTo(11.37f, 20f, 11.057f, 19.718f, 11.007f, 19.352f)
            lineTo(11f, 19.25f)
            verticalLineTo(11.75f)
            curveTo(11f, 11.336f, 11.336f, 11f, 11.75f, 11f)
            close()
            moveTo(15.75f, 8f)
            curveTo(16.13f, 8f, 16.444f, 8.282f, 16.493f, 8.648f)
            lineTo(16.5f, 8.75f)
            verticalLineTo(19.25f)
            curveTo(16.5f, 19.664f, 16.164f, 20f, 15.75f, 20f)
            curveTo(15.37f, 20f, 15.057f, 19.718f, 15.007f, 19.352f)
            lineTo(15f, 19.25f)
            verticalLineTo(8.75f)
            curveTo(15f, 8.336f, 15.336f, 8f, 15.75f, 8f)
            close()
            moveTo(19.743f, 5f)
            curveTo(20.122f, 4.996f, 20.439f, 5.275f, 20.492f, 5.641f)
            lineTo(20.5f, 5.742f)
            verticalLineTo(19.243f)
            curveTo(20.504f, 19.657f, 20.171f, 19.996f, 19.757f, 20f)
            curveTo(19.378f, 20.003f, 19.061f, 19.725f, 19.008f, 19.359f)
            lineTo(19f, 19.258f)
            verticalLineTo(5.757f)
            curveTo(18.996f, 5.343f, 19.329f, 5.004f, 19.743f, 5f)
            close()
            moveTo(7.75f, 14f)
            curveTo(8.13f, 14f, 8.443f, 14.282f, 8.493f, 14.648f)
            lineTo(8.5f, 14.75f)
            verticalLineTo(19.249f)
            curveTo(8.5f, 19.663f, 8.164f, 19.999f, 7.75f, 19.999f)
            curveTo(7.37f, 19.999f, 7.057f, 19.717f, 7.007f, 19.351f)
            lineTo(7f, 19.249f)
            verticalLineTo(14.75f)
            curveTo(7f, 14.336f, 7.336f, 14f, 7.75f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CellularData1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CellularData1, contentDescription = null)
    }
}
