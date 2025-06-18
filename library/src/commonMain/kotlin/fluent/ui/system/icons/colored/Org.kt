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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.Org: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Org",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D),
                ),
                start = Offset(5.5f, 8.5f),
                end = Offset(7.236f, 16.765f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(11f, 11.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(12.5f)
            verticalLineTo(11.5f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 11.5f, 18f, 12.507f, 18f, 13.75f)
            verticalLineTo(16f)
            horizontalLineTo(16.5f)
            verticalLineTo(13.75f)
            curveTo(16.5f, 13.336f, 16.164f, 13f, 15.75f, 13f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 13f, 7f, 13.336f, 7f, 13.75f)
            verticalLineTo(16f)
            horizontalLineTo(5.5f)
            verticalLineTo(13.75f)
            curveTo(5.5f, 12.507f, 6.507f, 11.5f, 7.75f, 11.5f)
            horizontalLineTo(11f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.553f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(11.75f, 6.246f),
                radius = 4.561f,
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(11f, 11.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(12.5f)
            verticalLineTo(11.5f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 11.5f, 18f, 12.507f, 18f, 13.75f)
            verticalLineTo(16f)
            horizontalLineTo(16.5f)
            verticalLineTo(13.75f)
            curveTo(16.5f, 13.336f, 16.164f, 13f, 15.75f, 13f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 13f, 7f, 13.336f, 7f, 13.75f)
            verticalLineTo(16f)
            horizontalLineTo(5.5f)
            verticalLineTo(13.75f)
            curveTo(5.5f, 12.507f, 6.507f, 11.5f, 7.75f, 11.5f)
            horizontalLineTo(11f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(6.125f, 17.749f),
                radius = 4.67f,
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(11f, 11.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(12.5f)
            verticalLineTo(11.5f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 11.5f, 18f, 12.507f, 18f, 13.75f)
            verticalLineTo(16f)
            horizontalLineTo(16.5f)
            verticalLineTo(13.75f)
            curveTo(16.5f, 13.336f, 16.164f, 13f, 15.75f, 13f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 13f, 7f, 13.336f, 7f, 13.75f)
            verticalLineTo(16f)
            horizontalLineTo(5.5f)
            verticalLineTo(13.75f)
            curveTo(5.5f, 12.507f, 6.507f, 11.5f, 7.75f, 11.5f)
            horizontalLineTo(11f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(17.355f, 17.731f),
                radius = 4.616f,
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(11f, 11.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(12.5f)
            verticalLineTo(11.5f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 11.5f, 18f, 12.507f, 18f, 13.75f)
            verticalLineTo(16f)
            horizontalLineTo(16.5f)
            verticalLineTo(13.75f)
            curveTo(16.5f, 13.336f, 16.164f, 13f, 15.75f, 13f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 13f, 7f, 13.336f, 7f, 13.75f)
            verticalLineTo(16f)
            horizontalLineTo(5.5f)
            verticalLineTo(13.75f)
            curveTo(5.5f, 12.507f, 6.507f, 11.5f, 7.75f, 11.5f)
            horizontalLineTo(11f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.529f to Color(0xFF1EC8B0),
                    1f to Color(0xFF1A7F7C),
                ),
                center = Offset(-2.031f, 6.141f),
                radius = 20.282f,
            ),
        ) {
            moveTo(10f, 18.25f)
            curveTo(10f, 20.321f, 8.321f, 22f, 6.25f, 22f)
            curveTo(4.179f, 22f, 2.5f, 20.321f, 2.5f, 18.25f)
            curveTo(2.5f, 16.179f, 4.179f, 14.5f, 6.25f, 14.5f)
            curveTo(8.321f, 14.5f, 10f, 16.179f, 10f, 18.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.529f to Color(0xFF7B7BFF),
                    1f to Color(0xFF4A43CB),
                ),
                center = Offset(8.969f, 6.141f),
                radius = 20.282f,
            ),
        ) {
            moveTo(21f, 18.25f)
            curveTo(21f, 20.321f, 19.321f, 22f, 17.25f, 22f)
            curveTo(15.179f, 22f, 13.5f, 20.321f, 13.5f, 18.25f)
            curveTo(13.5f, 16.179f, 15.179f, 14.5f, 17.25f, 14.5f)
            curveTo(19.321f, 14.5f, 21f, 16.179f, 21f, 18.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.529f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF),
                ),
                center = Offset(3.469f, -6.359f),
                radius = 20.282f,
            ),
        ) {
            moveTo(15.5f, 5.75f)
            curveTo(15.5f, 7.821f, 13.821f, 9.5f, 11.75f, 9.5f)
            curveTo(9.679f, 9.5f, 8f, 7.821f, 8f, 5.75f)
            curveTo(8f, 3.679f, 9.679f, 2f, 11.75f, 2f)
            curveTo(13.821f, 2f, 15.5f, 3.679f, 15.5f, 5.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OrgPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Org, contentDescription = null)
    }
}
