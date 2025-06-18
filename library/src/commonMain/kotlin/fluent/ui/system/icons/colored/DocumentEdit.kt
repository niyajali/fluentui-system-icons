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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.DocumentEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.DocumentEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF4894FE),
                ),
                start = Offset(15.2f, 2f),
                end = Offset(16.822f, 18.87f),
            ),
        ) {
            moveTo(14.188f, 22f)
            horizontalLineTo(6f)
            curveTo(4.895f, 22f, 4f, 21.105f, 4f, 20f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(13f)
            lineTo(15f, 7f)
            lineTo(20f, 9f)
            verticalLineTo(16.188f)
            lineTo(14.188f, 22f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.362f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB),
                ),
                center = Offset(20.667f, 2.625f),
                radius = 12.562f,
            ),
            fillAlpha = 0.5f,
        ) {
            moveTo(14.188f, 22f)
            horizontalLineTo(6f)
            curveTo(4.895f, 22f, 4f, 21.105f, 4f, 20f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(13f)
            lineTo(15f, 7f)
            lineTo(20f, 9f)
            verticalLineTo(16.188f)
            lineTo(14.188f, 22f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFFB3E0FF),
                ),
                start = Offset(16.488f, 4.917f),
                end = Offset(14.738f, 7.833f),
            ),
        ) {
            moveTo(13f, 7.5f)
            verticalLineTo(2f)
            lineTo(20f, 9f)
            horizontalLineTo(14.5f)
            curveTo(13.672f, 9f, 13f, 8.328f, 13f, 7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937),
                ),
                start = Offset(15.03f, 16.308f),
                end = Offset(18.73f, 20.018f),
            ),
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
                    1f to Color(0xFFFF921F),
                ),
                start = Offset(11.387f, 19.976f),
                end = Offset(14.456f, 23.042f),
            ),
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
                    1f to Color(0xFFDD3CE2),
                ),
                start = Offset(21.904f, 13.116f),
                end = Offset(19.926f, 15.016f),
            ),
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
                    1f to Color(0xFFFFE994),
                ),
                start = Offset(19.657f, 16.292f),
                end = Offset(16.488f, 14.902f),
            ),
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
private fun DocumentEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.DocumentEdit, contentDescription = null)
    }
}
