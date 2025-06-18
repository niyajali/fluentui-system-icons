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
package fluent.ui.system.icons.light

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

public val FluentUi.Light.Pin: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Pin",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22.253f, 3.161f)
            curveTo(20.594f, 1.437f, 17.733f, 1.847f, 16.627f, 3.968f)
            lineTo(12.941f, 11.033f)
            curveTo(12.756f, 11.386f, 12.439f, 11.651f, 12.058f, 11.77f)
            lineTo(6.428f, 13.53f)
            curveTo(5.352f, 13.866f, 5.018f, 15.225f, 5.815f, 16.022f)
            lineTo(10.543f, 20.75f)
            lineTo(4f, 27.293f)
            verticalLineTo(28f)
            horizontalLineTo(4.707f)
            lineTo(11.25f, 21.457f)
            lineTo(15.978f, 26.185f)
            curveTo(16.775f, 26.982f, 18.134f, 26.648f, 18.47f, 25.572f)
            lineTo(20.217f, 19.981f)
            curveTo(20.342f, 19.583f, 20.626f, 19.255f, 21.002f, 19.075f)
            lineTo(27.969f, 15.743f)
            curveTo(30.121f, 14.714f, 30.635f, 11.88f, 28.982f, 10.16f)
            lineTo(22.253f, 3.161f)
            close()
            moveTo(17.513f, 4.431f)
            curveTo(18.304f, 2.916f, 20.347f, 2.623f, 21.532f, 3.854f)
            lineTo(28.261f, 10.853f)
            curveTo(29.442f, 12.081f, 29.075f, 14.106f, 27.538f, 14.841f)
            lineTo(20.57f, 18.173f)
            curveTo(19.944f, 18.473f, 19.47f, 19.02f, 19.263f, 19.683f)
            lineTo(17.516f, 25.273f)
            curveTo(17.404f, 25.632f, 16.951f, 25.744f, 16.685f, 25.478f)
            lineTo(6.522f, 15.315f)
            curveTo(6.256f, 15.049f, 6.368f, 14.596f, 6.727f, 14.484f)
            lineTo(12.357f, 12.725f)
            curveTo(12.991f, 12.527f, 13.52f, 12.084f, 13.827f, 11.495f)
            lineTo(17.513f, 4.431f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PinPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Pin, contentDescription = null)
    }
}
