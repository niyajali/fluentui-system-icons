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

public val FluentUi.Regular.StarArrowRightStart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarArrowRightStart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.788f, 3.102f)
            curveTo(11.283f, 2.099f, 12.714f, 2.099f, 13.209f, 3.102f)
            lineTo(15.567f, 7.88f)
            lineTo(20.84f, 8.646f)
            curveTo(21.947f, 8.807f, 22.389f, 10.168f, 21.588f, 10.949f)
            lineTo(17.772f, 14.668f)
            lineTo(18.673f, 19.919f)
            curveTo(18.862f, 21.022f, 17.705f, 21.863f, 16.714f, 21.342f)
            lineTo(12.758f, 19.262f)
            curveTo(12.899f, 18.761f, 12.981f, 18.235f, 12.997f, 17.693f)
            lineTo(17.143f, 19.873f)
            lineTo(16.281f, 14.844f)
            curveTo(16.206f, 14.406f, 16.351f, 13.959f, 16.669f, 13.649f)
            lineTo(20.323f, 10.087f)
            lineTo(15.273f, 9.353f)
            curveTo(14.833f, 9.289f, 14.453f, 9.013f, 14.257f, 8.614f)
            lineTo(11.998f, 4.039f)
            lineTo(9.74f, 8.614f)
            curveTo(9.543f, 9.013f, 9.163f, 9.289f, 8.724f, 9.353f)
            lineTo(3.674f, 10.087f)
            lineTo(4.832f, 11.215f)
            curveTo(4.296f, 11.357f, 3.787f, 11.566f, 3.315f, 11.832f)
            lineTo(2.409f, 10.949f)
            curveTo(1.608f, 10.168f, 2.05f, 8.807f, 3.157f, 8.646f)
            lineTo(8.43f, 7.88f)
            lineTo(10.788f, 3.102f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.537f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.537f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(3.5f, 17f)
            curveTo(3.224f, 17f, 3f, 17.223f, 3f, 17.5f)
            curveTo(3f, 17.776f, 3.224f, 18f, 3.5f, 18f)
            lineTo(8.293f, 18f)
            lineTo(6.646f, 19.646f)
            curveTo(6.451f, 19.841f, 6.451f, 20.158f, 6.646f, 20.353f)
            curveTo(6.842f, 20.548f, 7.158f, 20.548f, 7.354f, 20.353f)
            lineTo(9.854f, 17.853f)
            curveTo(10.049f, 17.658f, 10.049f, 17.341f, 9.854f, 17.146f)
            lineTo(7.354f, 14.646f)
            curveTo(7.158f, 14.451f, 6.842f, 14.451f, 6.646f, 14.646f)
            curveTo(6.451f, 14.841f, 6.451f, 15.158f, 6.646f, 15.353f)
            lineTo(8.293f, 17f)
            lineTo(3.5f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarArrowRightStartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.StarArrowRightStart, contentDescription = null)
    }
}
