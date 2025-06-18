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

public val FluentUi.Colored.ClipboardTextEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ClipboardTextEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(4f, 5.8f),
                end = Offset(18.146f, 23.483f)
            )
        ) {
            moveTo(6f, 4f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineTo(20f)
            curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
            horizontalLineTo(15.545f)
            lineTo(20f, 15.875f)
            verticalLineTo(6f)
            curveTo(20f, 4.895f, 19.105f, 4f, 18f, 4f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color(0xFFFFFFFF)
                ),
                start = Offset(13.25f, 19f),
                end = Offset(5.852f, 9.937f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(8f, 9f)
            curveTo(7.448f, 9f, 7f, 9.448f, 7f, 10f)
            curveTo(7f, 10.552f, 7.448f, 11f, 8f, 11f)
            horizontalLineTo(16f)
            curveTo(16.552f, 11f, 17f, 10.552f, 17f, 10f)
            curveTo(17f, 9.448f, 16.552f, 9f, 16f, 9f)
            horizontalLineTo(8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color(0xFFFFFFFF)
                ),
                start = Offset(13.25f, 19f),
                end = Offset(5.852f, 9.937f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(8f, 13f)
            curveTo(7.448f, 13f, 7f, 13.448f, 7f, 14f)
            curveTo(7f, 14.552f, 7.448f, 15f, 8f, 15f)
            horizontalLineTo(12f)
            curveTo(12.552f, 15f, 13f, 14.552f, 13f, 14f)
            curveTo(13f, 13.448f, 12.552f, 13f, 12f, 13f)
            horizontalLineTo(8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color(0xFFFFFFFF)
                ),
                start = Offset(13.25f, 19f),
                end = Offset(5.852f, 9.937f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(7f, 18f)
            curveTo(7f, 17.448f, 7.448f, 17f, 8f, 17f)
            horizontalLineTo(14f)
            curveTo(14.552f, 17f, 15f, 17.448f, 15f, 18f)
            curveTo(15f, 18.552f, 14.552f, 19f, 14f, 19f)
            horizontalLineTo(8f)
            curveTo(7.448f, 19f, 7f, 18.552f, 7f, 18f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.056f to Color(0xFF0A1852),
                    1f to Color(0x000A1852)
                ),
                center = Offset(12f, 0.5f),
                radius = 6.5f
            ),
            fillAlpha = 0.4f
        ) {
            moveTo(5.5f, 4f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineTo(20.5f)
            curveTo(4f, 21.328f, 4.672f, 22f, 5.5f, 22f)
            horizontalLineTo(13.428f)
            lineTo(20f, 16.507f)
            verticalLineTo(5.5f)
            curveTo(20f, 4.672f, 19.328f, 4f, 18.5f, 4f)
            horizontalLineTo(5.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.056f to Color(0xFF0A1852),
                    1f to Color(0x000A1852)
                ),
                center = Offset(12f, 0.5f),
                radius = 6.5f
            ),
            fillAlpha = 0.4f
        ) {
            moveTo(5.5f, 4f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineTo(20.5f)
            curveTo(4f, 21.328f, 4.672f, 22f, 5.5f, 22f)
            horizontalLineTo(13.428f)
            lineTo(20f, 16.507f)
            verticalLineTo(5.5f)
            curveTo(20f, 4.672f, 19.328f, 4f, 18.5f, 4f)
            horizontalLineTo(5.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    1f to Color(0x000A1852)
                ),
                center = Offset(17.5f, 17f),
                radius = 10.259f
            ),
            fillAlpha = 0.4f
        ) {
            moveTo(5.5f, 4f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineTo(20.5f)
            curveTo(4f, 21.328f, 4.672f, 22f, 5.5f, 22f)
            horizontalLineTo(13.428f)
            lineTo(20f, 16.507f)
            verticalLineTo(5.5f)
            curveTo(20f, 4.672f, 19.328f, 4f, 18.5f, 4f)
            horizontalLineTo(5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFAB500),
                    1f to Color(0xFFFFE06B)
                ),
                start = Offset(12f, 6f),
                end = Offset(12f, 2f)
            )
        ) {
            moveTo(8f, 4f)
            curveTo(8f, 5.105f, 8.895f, 6f, 10f, 6f)
            horizontalLineTo(14f)
            curveTo(15.105f, 6f, 16f, 5.105f, 16f, 4f)
            curveTo(16f, 2.895f, 15.105f, 2f, 14f, 2f)
            horizontalLineTo(10f)
            curveTo(8.895f, 2f, 8f, 2.895f, 8f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(15.03f, 16.308f),
                end = Offset(18.73f, 20.018f)
            )
        ) {
            moveTo(20.585f, 14.456f)
            horizontalLineTo(17.344f)
            lineTo(13.202f, 18.602f)
            curveTo(13.139f, 18.664f, 13.08f, 18.73f, 13.024f, 18.798f)
            verticalLineTo(22.006f)
            lineTo(16.275f, 22.006f)
            curveTo(16.334f, 21.956f, 16.391f, 21.904f, 16.445f, 21.849f)
            lineTo(20.585f, 17.705f)
            verticalLineTo(14.456f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.255f to Color(0xFFFFD394),
                    1f to Color(0xFFFF921F)
                ),
                start = Offset(11.387f, 19.976f),
                end = Offset(14.456f, 23.042f)
            )
        ) {
            moveTo(16.279f, 21.998f)
            curveTo(15.965f, 22.263f, 15.594f, 22.454f, 15.193f, 22.554f)
            lineTo(13.356f, 23.014f)
            curveTo(12.557f, 23.214f, 11.834f, 22.49f, 12.034f, 21.69f)
            lineTo(12.493f, 19.851f)
            curveTo(12.59f, 19.461f, 12.773f, 19.098f, 13.027f, 18.79f)
            curveTo(13.404f, 20.389f, 14.673f, 21.644f, 16.279f, 21.998f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFDD3CE2)
                ),
                start = Offset(21.904f, 13.116f),
                end = Offset(19.926f, 15.016f)
            )
        ) {
            moveTo(17.574f, 14.235f)
            lineTo(19.134f, 12.673f)
            curveTo(20.03f, 11.776f, 21.482f, 11.776f, 22.378f, 12.673f)
            curveTo(23.274f, 13.569f, 23.274f, 15.023f, 22.378f, 15.92f)
            lineTo(20.937f, 17.362f)
            lineTo(17.574f, 14.235f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFFFE994)
                ),
                start = Offset(19.657f, 16.292f),
                end = Offset(16.488f, 14.902f)
            )
        ) {
            moveTo(21.824f, 16.477f)
            curveTo(20.204f, 16.121f, 18.926f, 14.848f, 18.562f, 13.228f)
            lineTo(17.335f, 14.456f)
            curveTo(17.7f, 16.075f, 18.977f, 17.349f, 20.598f, 17.705f)
            lineTo(21.824f, 16.477f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardTextEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.ClipboardTextEdit, contentDescription = null)
    }
}
