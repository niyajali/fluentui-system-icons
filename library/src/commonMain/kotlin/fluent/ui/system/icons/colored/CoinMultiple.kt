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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.CoinMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.CoinMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(8.713f, 17.472f),
                end = Offset(10.841f, 22.442f)
            )
        ) {
            moveTo(12f, 22f)
            curveTo(15.866f, 22f, 19f, 20.209f, 19f, 18f)
            verticalLineTo(16f)
            horizontalLineTo(5f)
            verticalLineTo(18f)
            curveTo(5f, 20.209f, 8.134f, 22f, 12f, 22f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(19.02f, 19.997f),
                end = Offset(11.741f, 9.577f)
            )
        ) {
            moveTo(5f, 16f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14f, 0f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(8.713f, 12.472f),
                end = Offset(10.841f, 17.442f)
            )
        ) {
            moveTo(12f, 17f)
            curveTo(15.866f, 17f, 19f, 15.209f, 19f, 13f)
            verticalLineTo(11f)
            horizontalLineTo(5f)
            verticalLineTo(13f)
            curveTo(5f, 15.209f, 8.134f, 17f, 12f, 17f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(19.02f, 14.997f),
                end = Offset(11.741f, 4.577f)
            )
        ) {
            moveTo(5f, 11f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14f, 0f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(8.713f, 7.472f),
                end = Offset(10.841f, 12.442f)
            )
        ) {
            moveTo(12f, 12f)
            curveTo(15.866f, 12f, 19f, 10.209f, 19f, 8f)
            verticalLineTo(6f)
            horizontalLineTo(5f)
            verticalLineTo(8f)
            curveTo(5f, 10.209f, 8.134f, 12f, 12f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(19.02f, 9.997f),
                end = Offset(11.741f, -0.423f)
            )
        ) {
            moveTo(5f, 6f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14f, 0f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CoinMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.CoinMultiple, contentDescription = null)
    }
}
