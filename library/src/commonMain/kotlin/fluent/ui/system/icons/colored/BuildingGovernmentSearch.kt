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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.BuildingGovernmentSearch: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Colored.BuildingGovernmentSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF70777D))) {
                moveTo(11f, 4.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(11f)
                verticalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF83F54))) {
                moveTo(11.5f, 2f)
                lineTo(15.5f, 2f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2.5f)
                lineTo(16f, 4.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 5f)
                lineTo(11.5f, 5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4.5f)
                lineTo(11f, 2.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 2f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFC205),
                        0.735f to Color(0xFFFFA43D),
                        1f to Color(0xFFE67505),
                    ),
                    start = Offset(12f, 6f),
                    end = Offset(12f, 13.5f),
                ),
            ) {
                moveTo(5f, 13f)
                curveTo(5f, 9.134f, 8.134f, 6f, 12f, 6f)
                curveTo(15.866f, 6f, 19f, 9.134f, 19f, 13f)
                verticalLineTo(13.5f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD638),
                        1f to Color(0x00FFD638),
                    ),
                    center = Offset(16.9f, 7.154f),
                    radius = 4.038f,
                ),
            ) {
                moveTo(5f, 13f)
                curveTo(5f, 9.134f, 8.134f, 6f, 12f, 6f)
                curveTo(15.866f, 6f, 19f, 9.134f, 19f, 13f)
                verticalLineTo(13.5f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.495f to Color(0xFFE67505),
                        0.837f to Color(0x00E67505),
                    ),
                    center = Offset(5.5f, 17f),
                    radius = 8.201f,
                ),
            ) {
                moveTo(5f, 13f)
                curveTo(5f, 9.134f, 8.134f, 6f, 12f, 6f)
                curveTo(15.866f, 6f, 19f, 9.134f, 19f, 13f)
                verticalLineTo(13.5f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFAAB3BD),
                        1f to Color(0xFF889096),
                    ),
                    start = Offset(9.813f, 13f),
                    end = Offset(19.143f, 22.541f),
                ),
            ) {
                moveTo(4.5f, 13f)
                curveTo(3.119f, 13f, 2f, 14.119f, 2f, 15.5f)
                verticalLineTo(18f)
                horizontalLineTo(2.337f)
                curveTo(2.899f, 19.183f, 4.104f, 20f, 5.5f, 20f)
                curveTo(6.492f, 20f, 7.388f, 19.587f, 8.025f, 18.923f)
                lineTo(11.025f, 22f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 22f, 22f, 21.664f, 22f, 21.25f)
                verticalLineTo(15.5f)
                curveTo(22f, 14.119f, 20.881f, 13f, 19.5f, 13f)
                horizontalLineTo(4.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.136f to Color(0xAF000000),
                        0.622f to Color(0x00000000),
                    ),
                    start = Offset(8.875f, 21.357f),
                    end = Offset(14.159f, 15.647f),
                ),
                fillAlpha = 0.5f,
            ) {
                moveTo(4.5f, 13f)
                curveTo(3.119f, 13f, 2f, 14.119f, 2f, 15.5f)
                verticalLineTo(18f)
                horizontalLineTo(2.337f)
                curveTo(2.899f, 19.183f, 4.104f, 20f, 5.5f, 20f)
                curveTo(6.492f, 20f, 7.388f, 19.587f, 8.025f, 18.923f)
                lineTo(11.025f, 22f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 22f, 22f, 21.664f, 22f, 21.25f)
                verticalLineTo(15.5f)
                curveTo(22f, 14.119f, 20.881f, 13f, 19.5f, 13f)
                horizontalLineTo(4.5f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.122f to Color(0xFF000000),
                        0.884f to Color(0x00000000),
                    ),
                    center = Offset(5.5f, 16.5f),
                    radius = 7.071f,
                ),
                fillAlpha = 0.6f,
            ) {
                moveTo(4.5f, 13f)
                curveTo(3.119f, 13f, 2f, 14.119f, 2f, 15.5f)
                verticalLineTo(18f)
                horizontalLineTo(2.337f)
                curveTo(2.899f, 19.183f, 4.104f, 20f, 5.5f, 20f)
                curveTo(6.492f, 20f, 7.388f, 19.587f, 8.025f, 18.923f)
                lineTo(11.025f, 22f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 22f, 22f, 21.664f, 22f, 21.25f)
                verticalLineTo(15.5f)
                curveTo(22f, 14.119f, 20.881f, 13f, 19.5f, 13f)
                horizontalLineTo(4.5f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFB357),
                        1f to Color(0x00FFB357),
                    ),
                    center = Offset(20.75f, 13f),
                    radius = 5.181f,
                ),
                fillAlpha = 0.6f,
            ) {
                moveTo(4.5f, 13f)
                curveTo(3.119f, 13f, 2f, 14.119f, 2f, 15.5f)
                verticalLineTo(18f)
                horizontalLineTo(2.337f)
                curveTo(2.899f, 19.183f, 4.104f, 20f, 5.5f, 20f)
                curveTo(6.492f, 20f, 7.388f, 19.587f, 8.025f, 18.923f)
                lineTo(11.025f, 22f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 22f, 22f, 21.664f, 22f, 21.25f)
                verticalLineTo(15.5f)
                curveTo(22f, 14.119f, 20.881f, 13f, 19.5f, 13f)
                horizontalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF63686E))) {
                moveTo(19f, 16.25f)
                curveTo(19f, 15.836f, 18.664f, 15.5f, 18.25f, 15.5f)
                curveTo(17.836f, 15.5f, 17.5f, 15.836f, 17.5f, 16.25f)
                verticalLineTo(18.75f)
                curveTo(17.5f, 19.164f, 17.836f, 19.5f, 18.25f, 19.5f)
                curveTo(18.664f, 19.5f, 19f, 19.164f, 19f, 18.75f)
                verticalLineTo(16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCA6407))) {
                moveTo(16f, 9.75f)
                curveTo(16f, 9.336f, 15.664f, 9f, 15.25f, 9f)
                curveTo(14.836f, 9f, 14.5f, 9.336f, 14.5f, 9.75f)
                verticalLineTo(11.25f)
                curveTo(14.5f, 11.664f, 14.836f, 12f, 15.25f, 12f)
                curveTo(15.664f, 12f, 16f, 11.664f, 16f, 11.25f)
                verticalLineTo(9.75f)
                close()
                moveTo(12f, 9f)
                curveTo(12.414f, 9f, 12.75f, 9.336f, 12.75f, 9.75f)
                verticalLineTo(11.25f)
                curveTo(12.75f, 11.664f, 12.414f, 12f, 12f, 12f)
                curveTo(11.586f, 12f, 11.25f, 11.664f, 11.25f, 11.25f)
                verticalLineTo(9.75f)
                curveTo(11.25f, 9.336f, 11.586f, 9f, 12f, 9f)
                close()
                moveTo(9.5f, 9.75f)
                curveTo(9.5f, 9.336f, 9.164f, 9f, 8.75f, 9f)
                curveTo(8.336f, 9f, 8f, 9.336f, 8f, 9.75f)
                verticalLineTo(11.25f)
                curveTo(8f, 11.664f, 8.336f, 12f, 8.75f, 12f)
                curveTo(9.164f, 12f, 9.5f, 11.664f, 9.5f, 11.25f)
                verticalLineTo(9.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFB3E0FF),
                    ),
                    start = Offset(7.25f, 14.167f),
                    end = Offset(2f, 20f),
                ),
            ) {
                moveTo(9f, 16.5f)
                curveTo(9f, 18.433f, 7.433f, 20f, 5.5f, 20f)
                curveTo(3.567f, 20f, 2f, 18.433f, 2f, 16.5f)
                curveTo(2f, 14.567f, 3.567f, 13f, 5.5f, 13f)
                curveTo(7.433f, 13f, 9f, 14.567f, 9f, 16.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0094F0),
                        1f to Color(0xFF29C3FF),
                    ),
                    start = Offset(1.579f, 21.842f),
                    end = Offset(10.842f, 14.316f),
                ),
            ) {
                moveTo(5.5f, 21f)
                curveTo(6.472f, 21f, 7.372f, 20.692f, 8.107f, 20.168f)
                lineTo(10.72f, 22.78f)
                curveTo(11.013f, 23.073f, 11.487f, 23.073f, 11.78f, 22.78f)
                curveTo(12.073f, 22.487f, 12.073f, 22.013f, 11.78f, 21.72f)
                lineTo(9.168f, 19.107f)
                curveTo(9.692f, 18.372f, 10f, 17.472f, 10f, 16.5f)
                curveTo(10f, 14.015f, 7.985f, 12f, 5.5f, 12f)
                curveTo(3.015f, 12f, 1f, 14.015f, 1f, 16.5f)
                curveTo(1f, 18.985f, 3.015f, 21f, 5.5f, 21f)
                close()
                moveTo(5.5f, 19.5f)
                curveTo(3.843f, 19.5f, 2.5f, 18.157f, 2.5f, 16.5f)
                curveTo(2.5f, 14.843f, 3.843f, 13.5f, 5.5f, 13.5f)
                curveTo(7.157f, 13.5f, 8.5f, 14.843f, 8.5f, 16.5f)
                curveTo(8.5f, 18.157f, 7.157f, 19.5f, 5.5f, 19.5f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun BuildingGovernmentSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.BuildingGovernmentSearch, contentDescription = null)
    }
}
