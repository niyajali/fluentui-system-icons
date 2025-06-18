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

public val FluentUi.Filled.ResizeVideo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ResizeVideo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.25f, 13f)
            curveTo(21.63f, 13f, 21.944f, 13.282f, 21.993f, 13.648f)
            lineTo(22f, 13.75f)
            verticalLineTo(18.75f)
            curveTo(22f, 20.483f, 20.644f, 21.899f, 18.935f, 21.995f)
            lineTo(18.75f, 22f)
            lineTo(14.082f, 22f)
            curveTo(14.619f, 21.615f, 15.056f, 21.1f, 15.347f, 20.501f)
            lineTo(18.75f, 20.5f)
            curveTo(19.668f, 20.5f, 20.421f, 19.793f, 20.494f, 18.893f)
            lineTo(20.5f, 18.75f)
            verticalLineTo(13.75f)
            curveTo(20.5f, 13.336f, 20.836f, 13f, 21.25f, 13f)
            close()
            moveTo(11.75f, 9f)
            curveTo(13.545f, 9f, 15f, 10.455f, 15f, 12.25f)
            verticalLineTo(18.75f)
            curveTo(15f, 20.545f, 13.545f, 22f, 11.75f, 22f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 22f, 2f, 20.545f, 2f, 18.75f)
            verticalLineTo(12.25f)
            curveTo(2f, 10.455f, 3.455f, 9f, 5.25f, 9f)
            horizontalLineTo(11.75f)
            close()
            moveTo(6.061f, 13.103f)
            curveTo(6.021f, 13.176f, 6f, 13.259f, 6f, 13.342f)
            verticalLineTo(17.658f)
            curveTo(6f, 17.934f, 6.224f, 18.158f, 6.5f, 18.158f)
            curveTo(6.584f, 18.158f, 6.666f, 18.137f, 6.74f, 18.097f)
            lineTo(10.695f, 15.939f)
            curveTo(10.938f, 15.807f, 11.027f, 15.503f, 10.895f, 15.261f)
            curveTo(10.849f, 15.176f, 10.78f, 15.107f, 10.695f, 15.061f)
            lineTo(6.74f, 12.903f)
            curveTo(6.497f, 12.771f, 6.193f, 12.86f, 6.061f, 13.103f)
            close()
            moveTo(18.75f, 2f)
            curveTo(20.483f, 2f, 21.899f, 3.356f, 21.995f, 5.066f)
            lineTo(22f, 5.25f)
            verticalLineTo(10.25f)
            curveTo(22f, 10.664f, 21.664f, 11f, 21.25f, 11f)
            curveTo(20.871f, 11f, 20.557f, 10.718f, 20.507f, 10.352f)
            lineTo(20.5f, 10.25f)
            verticalLineTo(5.25f)
            curveTo(20.5f, 4.332f, 19.793f, 3.579f, 18.894f, 3.506f)
            lineTo(18.75f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 3.5f, 13f, 3.164f, 13f, 2.75f)
            curveTo(13f, 2.37f, 13.282f, 2.057f, 13.648f, 2.007f)
            lineTo(13.75f, 2f)
            horizontalLineTo(18.75f)
            close()
            moveTo(10.25f, 2f)
            curveTo(10.664f, 2f, 11f, 2.336f, 11f, 2.75f)
            curveTo(11f, 3.13f, 10.718f, 3.443f, 10.352f, 3.493f)
            lineTo(10.25f, 3.5f)
            horizontalLineTo(5.25f)
            curveTo(4.332f, 3.5f, 3.579f, 4.207f, 3.506f, 5.106f)
            lineTo(3.5f, 5.25f)
            lineTo(3.5f, 8.652f)
            curveTo(2.901f, 8.944f, 2.386f, 9.381f, 2f, 9.918f)
            lineTo(2f, 5.25f)
            curveTo(2f, 3.517f, 3.357f, 2.101f, 5.066f, 2.005f)
            lineTo(5.25f, 2f)
            horizontalLineTo(10.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ResizeVideoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ResizeVideo, contentDescription = null)
    }
}
