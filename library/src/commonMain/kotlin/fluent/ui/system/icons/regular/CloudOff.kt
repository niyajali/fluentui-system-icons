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

public val FluentUi.Regular.CloudOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CloudOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(6.853f, 7.914f)
            curveTo(6.472f, 8.549f, 6.205f, 9.26f, 6.08f, 10.019f)
            curveTo(3.792f, 10.231f, 2f, 12.156f, 2f, 14.5f)
            curveTo(2f, 16.985f, 4.015f, 19f, 6.5f, 19f)
            horizontalLineTo(17.5f)
            curveTo(17.642f, 19f, 17.781f, 18.993f, 17.92f, 18.981f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(16.439f, 17.5f)
            horizontalLineTo(6.5f)
            curveTo(4.843f, 17.5f, 3.5f, 16.157f, 3.5f, 14.5f)
            curveTo(3.5f, 12.843f, 4.843f, 11.5f, 6.5f, 11.5f)
            horizontalLineTo(6.756f)
            curveTo(7.156f, 11.5f, 7.486f, 11.185f, 7.505f, 10.785f)
            curveTo(7.535f, 10.154f, 7.694f, 9.556f, 7.958f, 9.019f)
            lineTo(16.439f, 17.5f)
            close()
            moveTo(20.5f, 14.5f)
            curveTo(20.5f, 15.282f, 20.201f, 15.994f, 19.71f, 16.528f)
            lineTo(20.772f, 17.59f)
            curveTo(21.533f, 16.784f, 22f, 15.696f, 22f, 14.5f)
            curveTo(22f, 12.156f, 20.208f, 10.231f, 17.92f, 10.019f)
            curveTo(17.452f, 7.172f, 14.98f, 5f, 12f, 5f)
            curveTo(10.903f, 5f, 9.875f, 5.294f, 8.99f, 5.808f)
            lineTo(10.101f, 6.919f)
            curveTo(10.678f, 6.65f, 11.321f, 6.5f, 12f, 6.5f)
            curveTo(14.413f, 6.5f, 16.383f, 8.4f, 16.495f, 10.785f)
            curveTo(16.514f, 11.185f, 16.844f, 11.5f, 17.244f, 11.5f)
            horizontalLineTo(17.5f)
            curveTo(19.157f, 11.5f, 20.5f, 12.843f, 20.5f, 14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CloudOff, contentDescription = null)
    }
}
