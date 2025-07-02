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
package fluent.ui.system.icons.color

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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.BuildingGovernment: ImageVector
    get() {
        if (_BuildingGovernment != null) {
            return _BuildingGovernment!!
        }
        _BuildingGovernment = ImageVector.Builder(
            name = "Colored.BuildingGovernment",
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
                moveTo(11f, 2.5f)
                curveTo(11f, 2.224f, 11.224f, 2f, 11.5f, 2f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 2f, 16f, 2.224f, 16f, 2.5f)
                verticalLineTo(4.5f)
                curveTo(16f, 4.776f, 15.776f, 5f, 15.5f, 5f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 5f, 11f, 4.776f, 11f, 4.5f)
                verticalLineTo(2.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFC205),
                        0.735f to Color(0xFFFFA43D),
                        1f to Color(0xFFE67505)
                    ),
                    start = Offset(12f, 6f),
                    end = Offset(12f, 13.5f)
                )
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
                        1f to Color(0x00FFD638)
                    ),
                    center = Offset(16.9f, 7.154f),
                    radius = 4.038f
                )
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
                        1f to Color(0xFF889096)
                    ),
                    start = Offset(9.813f, 13f),
                    end = Offset(19.143f, 22.541f)
                )
            ) {
                moveTo(2f, 15.5f)
                curveTo(2f, 14.119f, 3.119f, 13f, 4.5f, 13f)
                horizontalLineTo(19.5f)
                curveTo(20.881f, 13f, 22f, 14.119f, 22f, 15.5f)
                verticalLineTo(21.25f)
                curveTo(22f, 21.664f, 21.664f, 22f, 21.25f, 22f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 22f, 2f, 21.664f, 2f, 21.25f)
                verticalLineTo(15.5f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFB357),
                        1f to Color(0x00FFB357)
                    ),
                    center = Offset(20.75f, 13f),
                    radius = 5.181f
                ),
                fillAlpha = 0.6f,
            ) {
                moveTo(2f, 15.5f)
                curveTo(2f, 14.119f, 3.119f, 13f, 4.5f, 13f)
                horizontalLineTo(19.5f)
                curveTo(20.881f, 13f, 22f, 14.119f, 22f, 15.5f)
                verticalLineTo(21.25f)
                curveTo(22f, 21.664f, 21.664f, 22f, 21.25f, 22f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 22f, 2f, 21.664f, 2f, 21.25f)
                verticalLineTo(15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF55595E))) {
                moveTo(9.5f, 17.75f)
                curveTo(9.5f, 17.336f, 9.836f, 17f, 10.25f, 17f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 17f, 14.5f, 17.336f, 14.5f, 17.75f)
                verticalLineTo(22f)
                horizontalLineTo(9.5f)
                verticalLineTo(17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF63686E))) {
                moveTo(5.75f, 15.5f)
                curveTo(6.164f, 15.5f, 6.5f, 15.836f, 6.5f, 16.25f)
                verticalLineTo(18.75f)
                curveTo(6.5f, 19.164f, 6.164f, 19.5f, 5.75f, 19.5f)
                curveTo(5.336f, 19.5f, 5f, 19.164f, 5f, 18.75f)
                verticalLineTo(16.25f)
                curveTo(5f, 15.836f, 5.336f, 15.5f, 5.75f, 15.5f)
                close()
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
        }.build()

        return _BuildingGovernment!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingGovernment: ImageVector? = null

@Preview
@Composable
private fun BuildingGovernmentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.BuildingGovernment, contentDescription = null)
    }
}
