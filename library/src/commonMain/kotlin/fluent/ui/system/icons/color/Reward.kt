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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.Reward: ImageVector
    get() {
        if (_Reward != null) {
            return _Reward!!
        }
        _Reward = ImageVector.Builder(
            name = "Colored.Reward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF52D17C),
                        1f to Color(0xFF1A7F7C)
                    ),
                    start = Offset(22f, 2.858f),
                    end = Offset(14.966f, 10.309f)
                )
            ) {
                moveTo(16f, 11.65f)
                lineTo(20.662f, 9.202f)
                curveTo(21.485f, 8.771f, 22f, 7.918f, 22f, 6.989f)
                verticalLineTo(3.75f)
                curveTo(22f, 2.783f, 21.216f, 2f, 20.25f, 2f)
                horizontalLineTo(16f)
                lineTo(15f, 7f)
                lineTo(16f, 11.65f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF52D17C),
                        1f to Color(0xFF1A7F7C)
                    ),
                    start = Offset(2f, 4.599f),
                    end = Offset(9.064f, 9.274f)
                )
            ) {
                moveTo(8f, 2f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 2f, 2f, 2.783f, 2f, 3.75f)
                verticalLineTo(6.989f)
                curveTo(2f, 7.918f, 2.515f, 8.771f, 3.338f, 9.202f)
                lineTo(8f, 11.65f)
                lineTo(9f, 6.989f)
                lineTo(8f, 2f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF76EB95),
                        1f to Color(0xFF1EC8B0)
                    ),
                    start = Offset(12f, 0.559f),
                    end = Offset(15.64f, 12.405f)
                )
            ) {
                moveTo(8f, 11.65f)
                verticalLineTo(2f)
                horizontalLineTo(16f)
                verticalLineTo(11.65f)
                lineTo(12.814f, 13.323f)
                curveTo(12.304f, 13.59f, 11.696f, 13.59f, 11.186f, 13.323f)
                lineTo(8f, 11.65f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.772f to Color(0xFFFFCD0F),
                        0.991f to Color(0xFFE67505)
                    ),
                    center = Offset(-14.607f, -23f),
                    radius = 55.818f
                )
            ) {
                moveTo(17f, 17f)
                curveTo(17f, 19.761f, 14.761f, 22f, 12f, 22f)
                curveTo(9.239f, 22f, 7f, 19.761f, 7f, 17f)
                curveTo(7f, 14.239f, 9.239f, 12f, 12f, 12f)
                curveTo(14.761f, 12f, 17f, 14.239f, 17f, 17f)
                close()
            }
        }.build()

        return _Reward!!
    }

@Suppress("ObjectPropertyName")
private var _Reward: ImageVector? = null

@Preview
@Composable
private fun RewardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Reward, contentDescription = null)
    }
}
