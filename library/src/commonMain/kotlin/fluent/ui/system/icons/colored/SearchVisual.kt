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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.SearchVisual: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.SearchVisual",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.015f to Color(0xFF3DCBFF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(1.21f, 0.325f),
                end = Offset(16.893f, 25.659f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.5f, 4f)
            curveTo(4.224f, 4f, 4f, 4.224f, 4f, 4.5f)
            verticalLineTo(8f)
            curveTo(4f, 8.552f, 3.552f, 9f, 3f, 9f)
            curveTo(2.448f, 9f, 2f, 8.552f, 2f, 8f)
            verticalLineTo(4.5f)
            curveTo(2f, 3.119f, 3.119f, 2f, 4.5f, 2f)
            horizontalLineTo(8f)
            curveTo(8.552f, 2f, 9f, 2.448f, 9f, 3f)
            curveTo(9f, 3.552f, 8.552f, 4f, 8f, 4f)
            horizontalLineTo(4.5f)
            close()
            moveTo(15f, 3f)
            curveTo(15f, 2.448f, 15.448f, 2f, 16f, 2f)
            horizontalLineTo(19.5f)
            curveTo(20.881f, 2f, 22f, 3.119f, 22f, 4.5f)
            verticalLineTo(8f)
            curveTo(22f, 8.552f, 21.552f, 9f, 21f, 9f)
            curveTo(20.448f, 9f, 20f, 8.552f, 20f, 8f)
            verticalLineTo(4.5f)
            curveTo(20f, 4.224f, 19.776f, 4f, 19.5f, 4f)
            horizontalLineTo(16f)
            curveTo(15.448f, 4f, 15f, 3.552f, 15f, 3f)
            close()
            moveTo(3f, 15f)
            curveTo(3.552f, 15f, 4f, 15.448f, 4f, 16f)
            verticalLineTo(19.5f)
            curveTo(4f, 19.776f, 4.224f, 20f, 4.5f, 20f)
            horizontalLineTo(8f)
            curveTo(8.552f, 20f, 9f, 20.448f, 9f, 21f)
            curveTo(9f, 21.552f, 8.552f, 22f, 8f, 22f)
            horizontalLineTo(4.5f)
            curveTo(3.119f, 22f, 2f, 20.881f, 2f, 19.5f)
            verticalLineTo(16f)
            curveTo(2f, 15.448f, 2.448f, 15f, 3f, 15f)
            close()
            moveTo(21f, 15f)
            curveTo(21.552f, 15f, 22f, 15.448f, 22f, 16f)
            verticalLineTo(19.5f)
            curveTo(22f, 20.881f, 20.881f, 22f, 19.5f, 22f)
            horizontalLineTo(16f)
            curveTo(15.448f, 22f, 15f, 21.552f, 15f, 21f)
            curveTo(15f, 20.448f, 15.448f, 20f, 16f, 20f)
            horizontalLineTo(19.5f)
            curveTo(19.776f, 20f, 20f, 19.776f, 20f, 19.5f)
            verticalLineTo(16f)
            curveTo(20f, 15.448f, 20.448f, 15f, 21f, 15f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(8.984f, 8.438f),
                radius = 7.357f
            )
        ) {
            moveTo(12f, 15f)
            curveTo(13.657f, 15f, 15f, 13.657f, 15f, 12f)
            curveTo(15f, 10.343f, 13.657f, 9f, 12f, 9f)
            curveTo(10.343f, 9f, 9f, 10.343f, 9f, 12f)
            curveTo(9f, 13.657f, 10.343f, 15f, 12f, 15f)
            close()
            moveTo(7.5f, 8.75f)
            curveTo(8.19f, 8.75f, 8.75f, 8.19f, 8.75f, 7.5f)
            curveTo(8.75f, 6.81f, 8.19f, 6.25f, 7.5f, 6.25f)
            curveTo(6.81f, 6.25f, 6.25f, 6.81f, 6.25f, 7.5f)
            curveTo(6.25f, 8.19f, 6.81f, 8.75f, 7.5f, 8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SearchVisualPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.SearchVisual, contentDescription = null)
    }
}
