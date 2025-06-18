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

public val FluentUi.Regular.CircleHighlight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleHighlight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.559f, 3.622f)
            lineTo(13.718f, 6.78f)
            curveTo(14.011f, 7.073f, 14.486f, 7.073f, 14.778f, 6.78f)
            curveTo(15.071f, 6.488f, 15.071f, 6.013f, 14.778f, 5.72f)
            lineTo(12.578f, 3.519f)
            curveTo(13.415f, 3.576f, 14.218f, 3.753f, 14.971f, 4.034f)
            lineTo(17.468f, 6.53f)
            curveTo(17.757f, 6.819f, 18.223f, 6.823f, 18.517f, 6.542f)
            curveTo(19.754f, 8.019f, 20.5f, 9.922f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(9.922f, 20.5f, 8.019f, 19.754f, 6.542f, 18.517f)
            curveTo(6.821f, 18.223f, 6.817f, 17.758f, 6.528f, 17.47f)
            lineTo(4.036f, 14.977f)
            curveTo(3.754f, 14.224f, 3.576f, 13.42f, 3.52f, 12.582f)
            lineTo(5.718f, 14.78f)
            curveTo(6.011f, 15.073f, 6.486f, 15.073f, 6.778f, 14.78f)
            curveTo(7.071f, 14.488f, 7.071f, 14.013f, 6.778f, 13.72f)
            lineTo(3.621f, 10.562f)
            curveTo(3.708f, 10.051f, 3.841f, 9.554f, 4.016f, 9.078f)
            lineTo(6.718f, 11.78f)
            curveTo(7.011f, 12.073f, 7.486f, 12.073f, 7.778f, 11.78f)
            curveTo(8.071f, 11.488f, 8.071f, 11.013f, 7.778f, 10.72f)
            lineTo(4.701f, 7.642f)
            curveTo(4.932f, 7.255f, 5.194f, 6.888f, 5.482f, 6.544f)
            lineTo(8.218f, 9.28f)
            curveTo(8.511f, 9.573f, 8.986f, 9.573f, 9.278f, 9.28f)
            curveTo(9.571f, 8.988f, 9.571f, 8.513f, 9.278f, 8.22f)
            lineTo(6.542f, 5.483f)
            curveTo(6.886f, 5.195f, 7.253f, 4.934f, 7.64f, 4.702f)
            lineTo(10.718f, 7.78f)
            curveTo(11.011f, 8.073f, 11.486f, 8.073f, 11.778f, 7.78f)
            curveTo(12.071f, 7.488f, 12.071f, 7.013f, 11.778f, 6.72f)
            lineTo(9.075f, 4.017f)
            curveTo(9.551f, 3.842f, 10.047f, 3.709f, 10.559f, 3.622f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleHighlightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CircleHighlight, contentDescription = null)
    }
}
