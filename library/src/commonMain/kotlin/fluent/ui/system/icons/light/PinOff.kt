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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Light.PinOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PinOff",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.854f, 2.146f)
            curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
            curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
            lineTo(11.3f, 12.007f)
            lineTo(6.428f, 13.53f)
            curveTo(5.352f, 13.866f, 5.018f, 15.225f, 5.815f, 16.022f)
            lineTo(10.543f, 20.75f)
            lineTo(4f, 27.293f)
            verticalLineTo(28f)
            horizontalLineTo(4.707f)
            lineTo(11.25f, 21.457f)
            lineTo(15.978f, 26.185f)
            curveTo(16.775f, 26.982f, 18.134f, 26.648f, 18.47f, 25.572f)
            lineTo(19.993f, 20.7f)
            lineTo(29.146f, 29.854f)
            curveTo(29.342f, 30.049f, 29.658f, 30.049f, 29.854f, 29.854f)
            curveTo(30.049f, 29.658f, 30.049f, 29.342f, 29.854f, 29.146f)
            lineTo(2.854f, 2.146f)
            close()
            moveTo(19.194f, 19.902f)
            lineTo(17.516f, 25.273f)
            curveTo(17.404f, 25.632f, 16.951f, 25.744f, 16.685f, 25.478f)
            lineTo(6.522f, 15.315f)
            curveTo(6.256f, 15.049f, 6.368f, 14.596f, 6.727f, 14.484f)
            lineTo(12.099f, 12.806f)
            lineTo(19.194f, 19.902f)
            close()
            moveTo(21.002f, 19.075f)
            curveTo(20.966f, 19.092f, 20.932f, 19.11f, 20.898f, 19.13f)
            lineTo(20.176f, 18.408f)
            curveTo(20.299f, 18.319f, 20.431f, 18.24f, 20.57f, 18.173f)
            lineTo(27.538f, 14.841f)
            curveTo(29.075f, 14.106f, 29.442f, 12.081f, 28.261f, 10.853f)
            lineTo(21.532f, 3.854f)
            curveTo(20.347f, 2.623f, 18.304f, 2.916f, 17.513f, 4.431f)
            lineTo(13.827f, 11.495f)
            curveTo(13.764f, 11.617f, 13.691f, 11.733f, 13.609f, 11.841f)
            lineTo(12.89f, 11.122f)
            curveTo(12.908f, 11.093f, 12.925f, 11.063f, 12.941f, 11.033f)
            lineTo(16.627f, 3.968f)
            curveTo(17.733f, 1.847f, 20.594f, 1.437f, 22.253f, 3.161f)
            lineTo(28.982f, 10.16f)
            curveTo(30.635f, 11.88f, 30.121f, 14.714f, 27.969f, 15.743f)
            lineTo(21.002f, 19.075f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PinOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.PinOff, contentDescription = null)
    }
}
