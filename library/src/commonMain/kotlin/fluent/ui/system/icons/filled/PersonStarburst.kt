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

public val FluentUi.Filled.PersonStarburst: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonStarburst",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.84f, 2.034f)
            curveTo(9.952f, 2.072f, 10.062f, 2.118f, 10.169f, 2.17f)
            lineTo(11.452f, 2.802f)
            curveTo(11.8f, 2.973f, 12.208f, 2.973f, 12.556f, 2.802f)
            lineTo(13.839f, 2.17f)
            curveTo(15.201f, 1.499f, 16.85f, 2.06f, 17.521f, 3.423f)
            lineTo(17.594f, 3.585f)
            lineTo(17.657f, 3.752f)
            lineTo(18.117f, 5.105f)
            curveTo(18.242f, 5.473f, 18.531f, 5.761f, 18.898f, 5.886f)
            lineTo(20.252f, 6.347f)
            curveTo(21.69f, 6.836f, 22.459f, 8.398f, 21.969f, 9.836f)
            curveTo(21.931f, 9.948f, 21.886f, 10.058f, 21.833f, 10.165f)
            lineTo(21.202f, 11.448f)
            curveTo(21.03f, 11.796f, 21.03f, 12.204f, 21.202f, 12.552f)
            lineTo(21.833f, 13.835f)
            curveTo(22.504f, 15.197f, 21.943f, 16.846f, 20.581f, 17.517f)
            curveTo(20.474f, 17.569f, 20.364f, 17.615f, 20.252f, 17.653f)
            lineTo(18.898f, 18.113f)
            curveTo(18.531f, 18.238f, 18.242f, 18.527f, 18.117f, 18.894f)
            lineTo(17.657f, 20.248f)
            curveTo(17.168f, 21.686f, 15.606f, 22.455f, 14.168f, 21.966f)
            curveTo(14.055f, 21.927f, 13.945f, 21.882f, 13.839f, 21.829f)
            lineTo(12.556f, 21.198f)
            curveTo(12.208f, 21.026f, 11.8f, 21.026f, 11.452f, 21.198f)
            lineTo(10.169f, 21.829f)
            curveTo(8.806f, 22.5f, 7.158f, 21.939f, 6.487f, 20.577f)
            curveTo(6.434f, 20.47f, 6.389f, 20.36f, 6.351f, 20.248f)
            lineTo(5.89f, 18.894f)
            curveTo(5.765f, 18.527f, 5.477f, 18.238f, 5.109f, 18.113f)
            lineTo(3.756f, 17.653f)
            curveTo(2.318f, 17.164f, 1.549f, 15.602f, 2.038f, 14.164f)
            curveTo(2.076f, 14.051f, 2.122f, 13.941f, 2.174f, 13.835f)
            lineTo(2.806f, 12.552f)
            curveTo(2.977f, 12.204f, 2.977f, 11.796f, 2.806f, 11.448f)
            lineTo(2.174f, 10.165f)
            curveTo(1.503f, 8.802f, 2.064f, 7.154f, 3.427f, 6.483f)
            curveTo(3.533f, 6.431f, 3.643f, 6.385f, 3.756f, 6.347f)
            lineTo(5.109f, 5.886f)
            curveTo(5.477f, 5.761f, 5.765f, 5.473f, 5.89f, 5.105f)
            lineTo(6.351f, 3.752f)
            curveTo(6.84f, 2.314f, 8.402f, 1.545f, 9.84f, 2.034f)
            close()
            moveTo(15.017f, 12f)
            lineTo(8.982f, 12f)
            curveTo(8.974f, 12f, 8.966f, 12f, 8.958f, 12f)
            horizontalLineTo(8.5f)
            curveTo(7.672f, 12f, 7f, 12.672f, 7f, 13.5f)
            verticalLineTo(14f)
            curveTo(7f, 15.244f, 7.74f, 16.51f, 9.075f, 17.276f)
            curveTo(9.905f, 17.785f, 10.927f, 18.035f, 12f, 18.035f)
            curveTo(13.071f, 18.035f, 14.091f, 17.786f, 14.921f, 17.278f)
            curveTo(16.258f, 16.513f, 17f, 15.245f, 17f, 14f)
            verticalLineTo(13.5f)
            curveTo(17f, 12.672f, 16.328f, 12f, 15.5f, 12f)
            horizontalLineTo(15.042f)
            curveTo(15.034f, 12f, 15.026f, 12f, 15.017f, 12f)
            close()
            moveTo(12f, 5.5f)
            curveTo(10.481f, 5.5f, 9.25f, 6.731f, 9.25f, 8.25f)
            curveTo(9.25f, 9.769f, 10.481f, 11f, 12f, 11f)
            curveTo(13.519f, 11f, 14.75f, 9.769f, 14.75f, 8.25f)
            curveTo(14.75f, 6.731f, 13.519f, 5.5f, 12f, 5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonStarburstPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonStarburst, contentDescription = null)
    }
}
