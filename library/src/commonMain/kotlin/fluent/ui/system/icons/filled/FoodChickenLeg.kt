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

public val FluentUi.Filled.FoodChickenLeg: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FoodChickenLeg",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 8f)
            curveTo(22f, 4.686f, 19.314f, 2f, 16f, 2f)
            curveTo(13.064f, 2f, 10.621f, 4.109f, 10.102f, 6.894f)
            curveTo(9.533f, 8.735f, 9.019f, 9.737f, 8.737f, 10.203f)
            lineTo(6.22f, 12.72f)
            curveTo(6.005f, 12.934f, 5.941f, 13.257f, 6.057f, 13.537f)
            curveTo(6.14f, 13.738f, 6.305f, 13.889f, 6.503f, 13.958f)
            lineTo(4.462f, 16f)
            curveTo(3.099f, 16.021f, 2f, 17.132f, 2f, 18.5f)
            curveTo(2f, 19.338f, 2.413f, 20.08f, 3.043f, 20.532f)
            curveTo(3.205f, 20.648f, 3.352f, 20.795f, 3.468f, 20.957f)
            curveTo(3.92f, 21.587f, 4.662f, 22f, 5.5f, 22f)
            curveTo(6.87f, 22f, 7.982f, 20.899f, 8f, 19.533f)
            lineTo(10.04f, 17.493f)
            curveTo(10.109f, 17.693f, 10.26f, 17.859f, 10.463f, 17.943f)
            curveTo(10.743f, 18.059f, 11.066f, 17.995f, 11.28f, 17.78f)
            lineTo(13.804f, 15.256f)
            curveTo(14.276f, 14.973f, 15.282f, 14.461f, 17.119f, 13.896f)
            curveTo(19.898f, 13.371f, 22f, 10.932f, 22f, 8f)
            close()
            moveTo(8.583f, 14f)
            horizontalLineTo(10f)
            verticalLineTo(15.412f)
            lineTo(6.884f, 18.527f)
            curveTo(6.59f, 18.822f, 6.5f, 19.199f, 6.5f, 19.5f)
            curveTo(6.5f, 20.052f, 6.052f, 20.5f, 5.5f, 20.5f)
            curveTo(5.166f, 20.5f, 4.869f, 20.337f, 4.687f, 20.082f)
            curveTo(4.475f, 19.787f, 4.213f, 19.525f, 3.918f, 19.313f)
            curveTo(3.663f, 19.131f, 3.5f, 18.834f, 3.5f, 18.5f)
            curveTo(3.5f, 17.948f, 3.948f, 17.5f, 4.5f, 17.5f)
            curveTo(4.799f, 17.5f, 5.173f, 17.41f, 5.465f, 17.118f)
            lineTo(8.583f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FoodChickenLegPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FoodChickenLeg, contentDescription = null)
    }
}
