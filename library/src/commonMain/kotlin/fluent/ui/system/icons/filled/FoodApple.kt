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

public val FluentUi.Filled.FoodApple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FoodApple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.471f, 3.419f)
            curveTo(5.39f, 4.805f, 5.862f, 6.221f, 6.889f, 7.302f)
            curveTo(5.011f, 7.841f, 3.518f, 9.439f, 3.228f, 11.518f)
            curveTo(2.9f, 13.873f, 3.384f, 16.27f, 4.601f, 18.314f)
            lineTo(4.952f, 18.903f)
            curveTo(4.965f, 18.925f, 4.979f, 18.946f, 4.994f, 18.966f)
            lineTo(6.41f, 20.873f)
            curveTo(7.686f, 22.592f, 10.201f, 22.752f, 11.685f, 21.209f)
            curveTo(11.857f, 21.03f, 12.143f, 21.03f, 12.315f, 21.209f)
            curveTo(13.799f, 22.752f, 16.313f, 22.592f, 17.59f, 20.873f)
            lineTo(19.006f, 18.966f)
            curveTo(19.021f, 18.946f, 19.035f, 18.925f, 19.048f, 18.903f)
            lineTo(19.399f, 18.314f)
            curveTo(20.616f, 16.27f, 21.1f, 13.873f, 20.772f, 11.518f)
            curveTo(20.363f, 8.586f, 17.561f, 6.611f, 14.663f, 7.212f)
            lineTo(12.761f, 7.606f)
            lineTo(12.758f, 7.606f)
            curveTo(12.788f, 6.827f, 12.91f, 5.986f, 13.149f, 5.268f)
            curveTo(13.438f, 4.4f, 13.841f, 3.878f, 14.288f, 3.692f)
            curveTo(14.671f, 3.532f, 14.852f, 3.093f, 14.692f, 2.711f)
            curveTo(14.533f, 2.329f, 14.094f, 2.148f, 13.712f, 2.307f)
            curveTo(12.659f, 2.746f, 12.062f, 3.786f, 11.726f, 4.793f)
            curveTo(11.71f, 4.84f, 11.695f, 4.888f, 11.68f, 4.935f)
            curveTo(11.441f, 4.471f, 11.126f, 4.035f, 10.737f, 3.646f)
            curveTo(9.644f, 2.553f, 8.185f, 2.049f, 6.756f, 2.134f)
            curveTo(6.063f, 2.175f, 5.512f, 2.726f, 5.471f, 3.419f)
            close()
            moveTo(8.397f, 11.234f)
            curveTo(8.05f, 11.304f, 7.732f, 11.548f, 7.533f, 12.013f)
            curveTo(7.33f, 12.487f, 7.258f, 13.189f, 7.477f, 14.067f)
            curveTo(7.578f, 14.469f, 7.333f, 14.876f, 6.931f, 14.977f)
            curveTo(6.53f, 15.077f, 6.122f, 14.833f, 6.022f, 14.431f)
            curveTo(5.742f, 13.309f, 5.795f, 12.261f, 6.154f, 11.422f)
            curveTo(6.517f, 10.575f, 7.199f, 9.944f, 8.103f, 9.764f)
            curveTo(8.509f, 9.682f, 8.904f, 9.946f, 8.985f, 10.352f)
            curveTo(9.066f, 10.758f, 8.803f, 11.153f, 8.397f, 11.234f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FoodApplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FoodApple, contentDescription = null)
    }
}
