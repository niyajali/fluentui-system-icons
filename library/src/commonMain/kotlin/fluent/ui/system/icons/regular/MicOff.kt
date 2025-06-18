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

public val FluentIcons.Regular.MicOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MicOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(8f, 9.061f)
            verticalLineTo(12f)
            curveTo(8f, 14.209f, 9.791f, 16f, 12f, 16f)
            curveTo(12.833f, 16f, 13.607f, 15.745f, 14.248f, 15.309f)
            lineTo(15.394f, 16.455f)
            curveTo(14.518f, 17.111f, 13.429f, 17.5f, 12.25f, 17.5f)
            horizontalLineTo(11.75f)
            lineTo(11.534f, 17.496f)
            curveTo(8.734f, 17.382f, 6.5f, 15.077f, 6.5f, 12.25f)
            verticalLineTo(11.75f)
            lineTo(6.493f, 11.648f)
            curveTo(6.443f, 11.282f, 6.13f, 11f, 5.75f, 11f)
            curveTo(5.336f, 11f, 5f, 11.336f, 5f, 11.75f)
            verticalLineTo(12.25f)
            lineTo(5.004f, 12.486f)
            curveTo(5.123f, 15.938f, 7.833f, 18.732f, 11.25f, 18.982f)
            lineTo(11.25f, 21.25f)
            lineTo(11.257f, 21.352f)
            curveTo(11.307f, 21.718f, 11.62f, 22f, 12f, 22f)
            curveTo(12.414f, 22f, 12.75f, 21.664f, 12.75f, 21.25f)
            lineTo(12.751f, 18.982f)
            curveTo(14.15f, 18.879f, 15.431f, 18.35f, 16.463f, 17.524f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(13.156f, 14.217f)
            curveTo(12.811f, 14.398f, 12.417f, 14.5f, 12f, 14.5f)
            curveTo(10.619f, 14.5f, 9.5f, 13.381f, 9.5f, 12f)
            verticalLineTo(10.561f)
            lineTo(13.156f, 14.217f)
            close()
            moveTo(14.5f, 6f)
            verticalLineTo(11.318f)
            lineTo(15.93f, 12.748f)
            curveTo(15.976f, 12.506f, 16f, 12.256f, 16f, 12f)
            verticalLineTo(6f)
            curveTo(16f, 3.791f, 14.209f, 2f, 12f, 2f)
            curveTo(10.152f, 2f, 8.597f, 3.253f, 8.138f, 4.956f)
            lineTo(9.5f, 6.318f)
            verticalLineTo(6f)
            curveTo(9.5f, 4.619f, 10.619f, 3.5f, 12f, 3.5f)
            curveTo(13.381f, 3.5f, 14.5f, 4.619f, 14.5f, 6f)
            close()
            moveTo(17.196f, 14.014f)
            lineTo(18.342f, 15.16f)
            curveTo(18.764f, 14.279f, 19f, 13.292f, 19f, 12.25f)
            verticalLineTo(11.75f)
            lineTo(18.993f, 11.648f)
            curveTo(18.944f, 11.282f, 18.63f, 11f, 18.25f, 11f)
            curveTo(17.836f, 11f, 17.5f, 11.336f, 17.5f, 11.75f)
            verticalLineTo(12.25f)
            lineTo(17.496f, 12.466f)
            curveTo(17.474f, 13.007f, 17.37f, 13.528f, 17.196f, 14.014f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MicOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MicOff, contentDescription = null)
    }
}
