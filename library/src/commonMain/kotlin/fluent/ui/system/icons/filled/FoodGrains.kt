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

public val FluentUi.Filled.FoodGrains: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FoodGrains",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.611f, 2.287f)
            curveTo(12.261f, 1.982f, 11.74f, 1.982f, 11.39f, 2.287f)
            curveTo(9.78f, 3.687f, 8.951f, 5.62f, 8.903f, 7.569f)
            curveTo(8.898f, 7.759f, 9.012f, 7.93f, 9.181f, 8.018f)
            curveTo(9.766f, 8.32f, 10.333f, 8.699f, 10.882f, 9.164f)
            curveTo(11.139f, 9.383f, 11.373f, 9.612f, 11.585f, 9.845f)
            curveTo(11.805f, 10.087f, 12.196f, 10.087f, 12.416f, 9.845f)
            curveTo(12.628f, 9.612f, 12.862f, 9.383f, 13.119f, 9.164f)
            curveTo(13.668f, 8.7f, 14.234f, 8.321f, 14.82f, 8.019f)
            curveTo(14.989f, 7.932f, 15.102f, 7.761f, 15.098f, 7.57f)
            curveTo(15.05f, 5.621f, 14.221f, 3.687f, 12.611f, 2.287f)
            close()
            moveTo(12f, 18.043f)
            curveTo(13.587f, 15.235f, 16.791f, 13.532f, 20.17f, 13.982f)
            curveTo(20.659f, 14.047f, 21.023f, 14.483f, 20.985f, 14.987f)
            curveTo(20.68f, 18.944f, 17.38f, 22f, 13.411f, 22f)
            horizontalLineTo(12.039f)
            lineTo(12.018f, 22f)
            horizontalLineTo(10.59f)
            curveTo(6.621f, 22f, 3.321f, 18.944f, 3.016f, 14.987f)
            curveTo(2.978f, 14.483f, 3.343f, 14.048f, 3.831f, 13.983f)
            curveTo(7.211f, 13.532f, 10.414f, 15.235f, 12f, 18.043f)
            close()
            moveTo(19.646f, 12.93f)
            curveTo(17.799f, 12.828f, 15.992f, 13.31f, 14.52f, 14.094f)
            curveTo(13.638f, 14.565f, 12.83f, 15.17f, 12.198f, 15.866f)
            curveTo(12.093f, 15.983f, 11.908f, 15.983f, 11.802f, 15.866f)
            curveTo(11.171f, 15.17f, 10.363f, 14.565f, 9.481f, 14.094f)
            curveTo(8.012f, 13.312f, 6.211f, 12.831f, 4.369f, 12.93f)
            curveTo(3.639f, 11.781f, 3.139f, 10.46f, 3.019f, 9.13f)
            curveTo(2.97f, 8.598f, 3.367f, 8.134f, 3.893f, 8.09f)
            curveTo(6.348f, 7.885f, 8.397f, 8.37f, 10.235f, 9.927f)
            curveTo(11.064f, 10.63f, 11.622f, 11.474f, 12f, 12.193f)
            curveTo(12.38f, 11.474f, 12.937f, 10.63f, 13.766f, 9.927f)
            curveTo(15.605f, 8.369f, 17.669f, 7.885f, 20.122f, 8.09f)
            curveTo(20.648f, 8.134f, 21.045f, 8.598f, 20.997f, 9.13f)
            curveTo(20.876f, 10.46f, 20.376f, 11.781f, 19.646f, 12.93f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FoodGrainsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FoodGrains, contentDescription = null)
    }
}
