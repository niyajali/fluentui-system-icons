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

public val FluentUi.Filled.BluetoothDisabled: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BluetoothDisabled",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.677f, 17.738f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(10.699f, 11.76f)
            lineTo(6.375f, 15.219f)
            curveTo(5.944f, 15.564f, 5.874f, 16.194f, 6.219f, 16.625f)
            curveTo(6.564f, 17.056f, 7.193f, 17.126f, 7.625f, 16.781f)
            lineTo(11f, 14.081f)
            verticalLineTo(21f)
            curveTo(11f, 21.404f, 11.244f, 21.769f, 11.617f, 21.924f)
            curveTo(11.991f, 22.079f, 12.421f, 21.993f, 12.707f, 21.707f)
            lineTo(16.677f, 17.738f)
            close()
            moveTo(13.099f, 14.16f)
            lineTo(15.262f, 16.323f)
            lineTo(13f, 18.586f)
            verticalLineTo(14.081f)
            lineTo(13.099f, 14.16f)
            close()
            moveTo(17.625f, 8.781f)
            lineTo(14.479f, 11.297f)
            lineTo(13.056f, 9.874f)
            lineTo(15.503f, 7.917f)
            lineTo(13f, 5.414f)
            verticalLineTo(9.818f)
            lineTo(11f, 7.818f)
            verticalLineTo(3f)
            curveTo(11f, 2.596f, 11.244f, 2.231f, 11.617f, 2.076f)
            curveTo(11.991f, 1.921f, 12.421f, 2.007f, 12.707f, 2.293f)
            lineTo(17.707f, 7.293f)
            curveTo(17.908f, 7.494f, 18.014f, 7.771f, 17.998f, 8.055f)
            curveTo(17.983f, 8.339f, 17.847f, 8.603f, 17.625f, 8.781f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BluetoothDisabledPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BluetoothDisabled, contentDescription = null)
    }
}
