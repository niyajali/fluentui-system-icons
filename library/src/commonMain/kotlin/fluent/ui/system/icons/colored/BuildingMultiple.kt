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

public val FluentUi.Colored.BuildingMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.BuildingMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFA3A3FF),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(3.393f, 5.75f),
                end = Offset(15.293f, 12.55f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14f, 4.25f)
            verticalLineTo(22f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 22f, 3f, 21.664f, 3f, 21.25f)
            verticalLineTo(4.25f)
            curveTo(3f, 3.007f, 4.007f, 2f, 5.25f, 2f)
            horizontalLineTo(11.75f)
            curveTo(12.993f, 2f, 14f, 3.007f, 14f, 4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x0030116E),
                    1f to Color(0xFF30116E)
                ),
                start = Offset(6.85f, 4.5f),
                end = Offset(10.7f, 4.5f)
            ),
            fillAlpha = 0.2f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14f, 4.25f)
            verticalLineTo(22f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 22f, 3f, 21.664f, 3f, 21.25f)
            verticalLineTo(4.25f)
            curveTo(3f, 3.007f, 4.007f, 2f, 5.25f, 2f)
            horizontalLineTo(11.75f)
            curveTo(12.993f, 2f, 14f, 3.007f, 14f, 4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00A3A3FF),
                    1f to Color(0xFFA3A3FF)
                ),
                start = Offset(10.838f, 8.094f),
                end = Offset(10.66f, 2.001f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14f, 4.25f)
            verticalLineTo(22f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 22f, 3f, 21.664f, 3f, 21.25f)
            verticalLineTo(4.25f)
            curveTo(3f, 3.007f, 4.007f, 2f, 5.25f, 2f)
            horizontalLineTo(11.75f)
            curveTo(12.993f, 2f, 14f, 3.007f, 14f, 4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFD1D1FF)
                ),
                start = Offset(5.333f, 4.333f),
                end = Offset(8f, 19.667f)
            )
        ) {
            moveTo(8f, 6f)
            curveTo(8f, 6.552f, 7.552f, 7f, 7f, 7f)
            curveTo(6.448f, 7f, 6f, 6.552f, 6f, 6f)
            curveTo(6f, 5.448f, 6.448f, 5f, 7f, 5f)
            curveTo(7.552f, 5f, 8f, 5.448f, 8f, 6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFD1D1FF)
                ),
                start = Offset(5.333f, 4.333f),
                end = Offset(8f, 19.667f)
            )
        ) {
            moveTo(8f, 12f)
            curveTo(8f, 12.552f, 7.552f, 13f, 7f, 13f)
            curveTo(6.448f, 13f, 6f, 12.552f, 6f, 12f)
            curveTo(6f, 11.448f, 6.448f, 11f, 7f, 11f)
            curveTo(7.552f, 11f, 8f, 11.448f, 8f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFD1D1FF)
                ),
                start = Offset(5.333f, 4.333f),
                end = Offset(8f, 19.667f)
            )
        ) {
            moveTo(8f, 9f)
            curveTo(8f, 9.552f, 7.552f, 10f, 7f, 10f)
            curveTo(6.448f, 10f, 6f, 9.552f, 6f, 9f)
            curveTo(6f, 8.448f, 6.448f, 8f, 7f, 8f)
            curveTo(7.552f, 8f, 8f, 8.448f, 8f, 9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFD1D1FF)
                ),
                start = Offset(5.333f, 4.333f),
                end = Offset(8f, 19.667f)
            )
        ) {
            moveTo(8f, 15f)
            curveTo(8f, 15.552f, 7.552f, 16f, 7f, 16f)
            curveTo(6.448f, 16f, 6f, 15.552f, 6f, 15f)
            curveTo(6f, 14.448f, 6.448f, 14f, 7f, 14f)
            curveTo(7.552f, 14f, 8f, 14.448f, 8f, 15f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFD1D1FF)
                ),
                start = Offset(5.333f, 4.333f),
                end = Offset(8f, 19.667f)
            )
        ) {
            moveTo(8f, 18f)
            curveTo(8f, 18.552f, 7.552f, 19f, 7f, 19f)
            curveTo(6.448f, 19f, 6f, 18.552f, 6f, 18f)
            curveTo(6f, 17.448f, 6.448f, 17f, 7f, 17f)
            curveTo(7.552f, 17f, 8f, 17.448f, 8f, 18f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(10f, 5.531f),
                end = Offset(25.941f, 18.736f)
            )
        ) {
            moveTo(18.75f, 5f)
            curveTo(19.993f, 5f, 21f, 6.007f, 21f, 7.25f)
            verticalLineTo(21.25f)
            curveTo(21f, 21.664f, 20.664f, 22f, 20.25f, 22f)
            curveTo(14.799f, 22f, 15.099f, 22f, 11.003f, 22f)
            curveTo(10.45f, 22f, 10f, 21.552f, 10f, 21f)
            verticalLineTo(7.25f)
            curveTo(10f, 6.007f, 11.007f, 5f, 12.25f, 5f)
            horizontalLineTo(18.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0067BF),
                    1f to Color(0xFF003580)
                ),
                start = Offset(13.804f, 18.75f),
                end = Offset(16.474f, 22.218f)
            )
        ) {
            moveTo(13f, 19f)
            curveTo(13f, 18.448f, 13.448f, 18f, 14f, 18f)
            horizontalLineTo(17f)
            curveTo(17.552f, 18f, 18f, 18.448f, 18f, 19f)
            verticalLineTo(22f)
            horizontalLineTo(13f)
            verticalLineTo(19f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(14.5f, 7.111f),
                end = Offset(18.706f, 16.575f)
            )
        ) {
            moveTo(15f, 9f)
            curveTo(15f, 9.552f, 14.552f, 10f, 14f, 10f)
            curveTo(13.448f, 10f, 13f, 9.552f, 13f, 9f)
            curveTo(13f, 8.448f, 13.448f, 8f, 14f, 8f)
            curveTo(14.552f, 8f, 15f, 8.448f, 15f, 9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(14.5f, 7.111f),
                end = Offset(18.706f, 16.575f)
            )
        ) {
            moveTo(15f, 12f)
            curveTo(15f, 12.552f, 14.552f, 13f, 14f, 13f)
            curveTo(13.448f, 13f, 13f, 12.552f, 13f, 12f)
            curveTo(13f, 11.448f, 13.448f, 11f, 14f, 11f)
            curveTo(14.552f, 11f, 15f, 11.448f, 15f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(14.5f, 7.111f),
                end = Offset(18.706f, 16.575f)
            )
        ) {
            moveTo(15f, 15f)
            curveTo(15f, 15.552f, 14.552f, 16f, 14f, 16f)
            curveTo(13.448f, 16f, 13f, 15.552f, 13f, 15f)
            curveTo(13f, 14.448f, 13.448f, 14f, 14f, 14f)
            curveTo(14.552f, 14f, 15f, 14.448f, 15f, 15f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(14.5f, 7.111f),
                end = Offset(18.706f, 16.575f)
            )
        ) {
            moveTo(18f, 9f)
            curveTo(18f, 9.552f, 17.552f, 10f, 17f, 10f)
            curveTo(16.448f, 10f, 16f, 9.552f, 16f, 9f)
            curveTo(16f, 8.448f, 16.448f, 8f, 17f, 8f)
            curveTo(17.552f, 8f, 18f, 8.448f, 18f, 9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(14.5f, 7.111f),
                end = Offset(18.706f, 16.575f)
            )
        ) {
            moveTo(18f, 12f)
            curveTo(18f, 12.552f, 17.552f, 13f, 17f, 13f)
            curveTo(16.448f, 13f, 16f, 12.552f, 16f, 12f)
            curveTo(16f, 11.448f, 16.448f, 11f, 17f, 11f)
            curveTo(17.552f, 11f, 18f, 11.448f, 18f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(14.5f, 7.111f),
                end = Offset(18.706f, 16.575f)
            )
        ) {
            moveTo(18f, 15f)
            curveTo(18f, 15.552f, 17.552f, 16f, 17f, 16f)
            curveTo(16.448f, 16f, 16f, 15.552f, 16f, 15f)
            curveTo(16f, 14.448f, 16.448f, 14f, 17f, 14f)
            curveTo(17.552f, 14f, 18f, 14.448f, 18f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.BuildingMultiple, contentDescription = null)
    }
}
