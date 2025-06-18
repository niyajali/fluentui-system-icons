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

public val FluentUi.Filled.LayerDiagonalPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayerDiagonalPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 4.252f)
            curveTo(14f, 2.692f, 12.451f, 1.605f, 10.984f, 2.136f)
            lineTo(4.144f, 4.611f)
            curveTo(2.857f, 5.077f, 2f, 6.299f, 2f, 7.667f)
            verticalLineTo(13.749f)
            curveTo(2f, 15.304f, 3.538f, 16.388f, 5f, 15.87f)
            verticalLineTo(10.317f)
            curveTo(5f, 8.738f, 5.989f, 7.328f, 7.474f, 6.79f)
            lineTo(14f, 4.429f)
            verticalLineTo(4.252f)
            close()
            moveTo(18f, 7.252f)
            curveTo(18f, 5.692f, 16.451f, 4.605f, 14.984f, 5.136f)
            lineTo(7.814f, 7.731f)
            curveTo(6.725f, 8.125f, 6f, 9.159f, 6f, 10.317f)
            verticalLineTo(16.749f)
            curveTo(6f, 18.304f, 7.538f, 19.388f, 9f, 18.871f)
            verticalLineTo(12.966f)
            curveTo(9f, 11.597f, 9.857f, 10.375f, 11.144f, 9.91f)
            lineTo(18f, 7.429f)
            verticalLineTo(7.252f)
            close()
            moveTo(22f, 10.252f)
            curveTo(22f, 8.692f, 20.451f, 7.605f, 18.984f, 8.136f)
            lineTo(11.484f, 10.85f)
            curveTo(10.594f, 11.172f, 10f, 12.019f, 10f, 12.966f)
            verticalLineTo(19.749f)
            curveTo(10f, 21.309f, 11.549f, 22.396f, 13.016f, 21.865f)
            lineTo(13.475f, 21.699f)
            curveTo(13.154f, 21.129f, 13f, 20.502f, 13f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(13f, 18.24f, 14.242f, 17f, 15.773f, 17f)
            horizontalLineTo(16.051f)
            curveTo(15.402f, 16.365f, 15f, 15.479f, 15f, 14.5f)
            curveTo(15f, 12.567f, 16.567f, 11f, 18.5f, 11f)
            curveTo(20.433f, 11f, 22f, 12.567f, 22f, 14.5f)
            verticalLineTo(10.252f)
            close()
            moveTo(21f, 14.5f)
            curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
            curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
            curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
            curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
            close()
            moveTo(23f, 19.875f)
            curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
            curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
            horizontalLineTo(21.227f)
            curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
            verticalLineTo(19.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LayerDiagonalPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LayerDiagonalPerson, contentDescription = null)
    }
}
