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

public val FluentUi.Filled.ArrowRepeatAll: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRepeatAll",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.712f, 2.289f)
            lineTo(14.625f, 2.211f)
            curveTo(14.233f, 1.901f, 13.661f, 1.926f, 13.298f, 2.289f)
            lineTo(13.22f, 2.376f)
            curveTo(12.91f, 2.768f, 12.936f, 3.34f, 13.298f, 3.702f)
            lineTo(14.597f, 4.999f)
            lineTo(8.999f, 4.999f)
            lineTo(8.759f, 5.003f)
            curveTo(5.004f, 5.13f, 2f, 8.211f, 2f, 11.993f)
            curveTo(2f, 13.438f, 2.438f, 14.781f, 3.189f, 15.892f)
            curveTo(3.37f, 16.143f, 3.666f, 16.307f, 4f, 16.307f)
            curveTo(4.552f, 16.307f, 5f, 15.859f, 5f, 15.307f)
            curveTo(5f, 15.091f, 4.931f, 14.891f, 4.815f, 14.729f)
            lineTo(4.68f, 14.511f)
            curveTo(4.248f, 13.772f, 4f, 12.911f, 4f, 11.993f)
            curveTo(4f, 9.234f, 6.238f, 6.998f, 8.999f, 6.998f)
            lineTo(14.595f, 6.998f)
            lineTo(13.298f, 8.295f)
            lineTo(13.22f, 8.382f)
            curveTo(12.91f, 8.774f, 12.936f, 9.346f, 13.298f, 9.708f)
            curveTo(13.689f, 10.098f, 14.322f, 10.098f, 14.712f, 9.708f)
            lineTo(17.718f, 6.705f)
            lineTo(17.795f, 6.618f)
            curveTo(18.106f, 6.226f, 18.08f, 5.654f, 17.718f, 5.292f)
            lineTo(14.712f, 2.289f)
            close()
            moveTo(20.787f, 8.06f)
            curveTo(20.603f, 7.828f, 20.319f, 7.678f, 20f, 7.678f)
            curveTo(19.448f, 7.678f, 19f, 8.126f, 19f, 8.677f)
            curveTo(19f, 8.886f, 19.064f, 9.079f, 19.172f, 9.238f)
            curveTo(19.695f, 10.028f, 20f, 10.975f, 20f, 11.993f)
            curveTo(20f, 14.752f, 17.762f, 16.989f, 15.001f, 16.989f)
            lineTo(9.415f, 16.989f)
            lineTo(10.709f, 15.697f)
            lineTo(10.792f, 15.602f)
            curveTo(11.073f, 15.241f, 11.071f, 14.731f, 10.786f, 14.371f)
            lineTo(10.709f, 14.284f)
            lineTo(10.614f, 14.2f)
            curveTo(10.252f, 13.92f, 9.741f, 13.922f, 9.382f, 14.206f)
            lineTo(9.294f, 14.284f)
            lineTo(6.289f, 17.287f)
            lineTo(6.206f, 17.382f)
            curveTo(5.925f, 17.743f, 5.927f, 18.254f, 6.212f, 18.613f)
            lineTo(6.289f, 18.7f)
            lineTo(9.294f, 21.703f)
            lineTo(9.389f, 21.787f)
            curveTo(9.781f, 22.091f, 10.348f, 22.064f, 10.709f, 21.703f)
            curveTo(11.071f, 21.341f, 11.097f, 20.77f, 10.786f, 20.377f)
            lineTo(10.709f, 20.29f)
            lineTo(9.405f, 18.987f)
            lineTo(15.001f, 18.988f)
            lineTo(15.241f, 18.984f)
            curveTo(18.996f, 18.857f, 22f, 15.776f, 22f, 11.993f)
            curveTo(22f, 10.534f, 21.552f, 9.178f, 20.787f, 8.057f)
            lineTo(20.787f, 8.06f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowRepeatAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowRepeatAll, contentDescription = null)
    }
}
