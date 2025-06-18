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

public val FluentUi.Regular.HapticWeak: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HapticWeak",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.245f, 20.999f)
            curveTo(15.111f, 20.999f, 14.974f, 20.962f, 14.851f, 20.886f)
            curveTo(14.776f, 20.839f, 12.999f, 19.694f, 12.999f, 16.871f)
            curveTo(12.999f, 15.439f, 13.456f, 14.695f, 13.86f, 14.038f)
            curveTo(14.216f, 13.458f, 14.499f, 12.999f, 14.499f, 11.992f)
            curveTo(14.499f, 10.985f, 14.217f, 10.529f, 13.86f, 9.949f)
            curveTo(13.457f, 9.294f, 12.999f, 8.551f, 12.999f, 7.12f)
            curveTo(12.999f, 4.301f, 14.776f, 3.161f, 14.853f, 3.114f)
            curveTo(15.205f, 2.893f, 15.666f, 3.002f, 15.886f, 3.353f)
            curveTo(16.104f, 3.702f, 15.999f, 4.161f, 15.654f, 4.382f)
            curveTo(15.594f, 4.422f, 14.5f, 5.179f, 14.5f, 7.12f)
            curveTo(14.5f, 8.125f, 14.782f, 8.583f, 15.139f, 9.162f)
            curveTo(15.542f, 9.817f, 16f, 10.56f, 16f, 11.991f)
            curveTo(16f, 13.422f, 15.543f, 14.167f, 15.139f, 14.824f)
            curveTo(14.783f, 15.404f, 14.5f, 15.863f, 14.5f, 16.87f)
            curveTo(14.5f, 18.828f, 15.609f, 19.588f, 15.656f, 19.619f)
            curveTo(15.998f, 19.846f, 16.098f, 20.308f, 15.876f, 20.653f)
            curveTo(15.732f, 20.876f, 15.491f, 20.998f, 15.245f, 20.998f)
            verticalLineTo(20.999f)
            close()
            moveTo(9.876f, 20.654f)
            curveTo(10.099f, 20.309f, 9.998f, 19.847f, 9.656f, 19.62f)
            curveTo(9.609f, 19.589f, 8.5f, 18.829f, 8.5f, 16.871f)
            curveTo(8.5f, 15.863f, 8.782f, 15.405f, 9.139f, 14.825f)
            curveTo(9.543f, 14.168f, 10f, 13.424f, 10f, 11.992f)
            curveTo(10f, 10.56f, 9.542f, 9.818f, 9.139f, 9.163f)
            curveTo(8.783f, 8.583f, 8.5f, 8.126f, 8.5f, 7.121f)
            curveTo(8.5f, 5.18f, 9.595f, 4.422f, 9.654f, 4.383f)
            curveTo(10f, 4.162f, 10.104f, 3.703f, 9.886f, 3.354f)
            curveTo(9.667f, 3.003f, 9.204f, 2.894f, 8.853f, 3.115f)
            curveTo(8.777f, 3.162f, 6.999f, 4.303f, 6.999f, 7.121f)
            curveTo(6.999f, 8.551f, 7.457f, 9.294f, 7.86f, 9.95f)
            curveTo(8.216f, 10.53f, 8.499f, 10.987f, 8.499f, 11.993f)
            curveTo(8.499f, 12.999f, 8.217f, 13.459f, 7.86f, 14.039f)
            curveTo(7.456f, 14.696f, 6.999f, 15.44f, 6.999f, 16.872f)
            curveTo(6.999f, 19.695f, 8.775f, 20.84f, 8.851f, 20.887f)
            curveTo(8.974f, 20.964f, 9.111f, 21.001f, 9.245f, 21f)
            curveTo(9.491f, 21f, 9.732f, 20.877f, 9.876f, 20.655f)
            verticalLineTo(20.654f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HapticWeakPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HapticWeak, contentDescription = null)
    }
}
