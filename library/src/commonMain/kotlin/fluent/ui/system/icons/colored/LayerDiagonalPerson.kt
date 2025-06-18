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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.LayerDiagonalPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.LayerDiagonalPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF1B44B1),
                ),
                start = Offset(2.429f, 4.617f),
                end = Offset(12.05f, 13.167f),
            ),
        ) {
            moveTo(14f, 4.238f)
            curveTo(14f, 2.678f, 12.451f, 1.592f, 10.984f, 2.123f)
            lineTo(4.144f, 4.598f)
            curveTo(2.857f, 5.064f, 2f, 6.286f, 2f, 7.654f)
            verticalLineTo(13.762f)
            curveTo(2f, 15.322f, 3.549f, 16.409f, 5.016f, 15.878f)
            lineTo(12.845f, 13.044f)
            curveTo(13.538f, 12.793f, 14f, 12.135f, 14f, 11.399f)
            verticalLineTo(4.238f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(6.429f, 7.617f),
                end = Offset(16.049f, 16.167f),
            ),
        ) {
            moveTo(18f, 7.238f)
            curveTo(18f, 5.678f, 16.451f, 4.592f, 14.984f, 5.123f)
            lineTo(8.144f, 7.598f)
            curveTo(6.857f, 8.064f, 6f, 9.286f, 6f, 10.654f)
            verticalLineTo(16.762f)
            curveTo(6f, 18.322f, 7.549f, 19.409f, 9.016f, 18.878f)
            lineTo(16.846f, 16.044f)
            curveTo(17.538f, 15.793f, 18f, 15.135f, 18f, 14.399f)
            verticalLineTo(7.238f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF58AAFE),
                ),
                start = Offset(10.429f, 10.617f),
                end = Offset(20.049f, 19.167f),
            ),
        ) {
            moveTo(22f, 10.238f)
            curveTo(22f, 8.678f, 20.451f, 7.592f, 18.984f, 8.123f)
            lineTo(12.144f, 10.598f)
            curveTo(10.857f, 11.064f, 10f, 12.286f, 10f, 13.654f)
            verticalLineTo(19.762f)
            curveTo(10f, 21.322f, 11.549f, 22.409f, 13.016f, 21.878f)
            lineTo(20.846f, 19.044f)
            curveTo(21.538f, 18.793f, 22f, 18.135f, 22f, 17.399f)
            verticalLineTo(10.238f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(16.14f, 18.665f),
                end = Offset(17.898f, 23.718f),
            ),
        ) {
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
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(17.189f, 12.665f),
                end = Offset(19.737f, 16.734f),
            ),
        ) {
            moveTo(21f, 14.5f)
            curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
            curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
            curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
            curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LayerDiagonalPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.LayerDiagonalPerson, contentDescription = null)
    }
}
