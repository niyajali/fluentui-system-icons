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

public val FluentUi.Filled.LayerDiagonal: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayerDiagonal",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.984f, 2.136f)
            curveTo(12.451f, 1.605f, 14f, 2.692f, 14f, 4.252f)
            verticalLineTo(4.429f)
            lineTo(7.474f, 6.79f)
            curveTo(5.989f, 7.328f, 5f, 8.738f, 5f, 10.317f)
            verticalLineTo(15.87f)
            curveTo(3.538f, 16.388f, 2f, 15.304f, 2f, 13.749f)
            verticalLineTo(7.667f)
            curveTo(2f, 6.299f, 2.857f, 5.077f, 4.144f, 4.611f)
            lineTo(10.984f, 2.136f)
            close()
            moveTo(14.984f, 5.136f)
            curveTo(16.451f, 4.605f, 18f, 5.692f, 18f, 7.252f)
            verticalLineTo(7.429f)
            lineTo(11.144f, 9.91f)
            curveTo(9.857f, 10.375f, 9f, 11.597f, 9f, 12.966f)
            verticalLineTo(18.871f)
            curveTo(7.538f, 19.388f, 6f, 18.303f, 6f, 16.749f)
            verticalLineTo(10.317f)
            curveTo(6f, 9.159f, 6.725f, 8.125f, 7.814f, 7.731f)
            lineTo(14.984f, 5.136f)
            close()
            moveTo(18.984f, 8.136f)
            curveTo(20.451f, 7.605f, 22f, 8.692f, 22f, 10.252f)
            verticalLineTo(17.035f)
            curveTo(22f, 17.983f, 21.406f, 18.829f, 20.516f, 19.151f)
            lineTo(13.016f, 21.865f)
            curveTo(11.549f, 22.396f, 10f, 21.309f, 10f, 19.749f)
            verticalLineTo(12.966f)
            curveTo(10f, 12.018f, 10.594f, 11.172f, 11.484f, 10.85f)
            lineTo(18.984f, 8.136f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LayerDiagonalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LayerDiagonal, contentDescription = null)
    }
}
