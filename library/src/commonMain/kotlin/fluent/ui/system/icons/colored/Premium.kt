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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.Premium: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Premium",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFFD9D9D9))) {
            moveTo(17.999f, 3f)
            curveTo(18.24f, 3f, 18.464f, 3.115f, 18.604f, 3.306f)
            lineTo(18.659f, 3.393f)
            lineTo(21.922f, 9.421f)
            lineTo(21.96f, 9.514f)
            lineTo(21.972f, 9.554f)
            lineTo(21.992f, 9.656f)
            lineTo(21.998f, 9.75f)
            curveTo(21.998f, 9.819f, 21.989f, 9.886f, 21.971f, 9.949f)
            lineTo(21.947f, 10.012f)
            horizontalLineTo(15.5f)
            lineTo(13.5f, 3f)
            horizontalLineTo(17.999f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF102784)
                ),
                start = Offset(16.535f, 3f),
                end = Offset(21.091f, 13.647f)
            )
        ) {
            moveTo(17.999f, 3f)
            curveTo(18.24f, 3f, 18.464f, 3.115f, 18.604f, 3.306f)
            lineTo(18.659f, 3.393f)
            lineTo(21.922f, 9.421f)
            lineTo(21.96f, 9.514f)
            lineTo(21.972f, 9.554f)
            lineTo(21.992f, 9.656f)
            lineTo(21.998f, 9.75f)
            curveTo(21.998f, 9.819f, 21.989f, 9.886f, 21.971f, 9.949f)
            lineTo(21.947f, 10.012f)
            horizontalLineTo(15.5f)
            lineTo(13.5f, 3f)
            horizontalLineTo(17.999f)
            close()
        }
        path(fill = SolidColor(Color(0xFFD9D9D9))) {
            moveTo(2.006f, 9.843f)
            lineTo(2f, 9.75f)
            lineTo(2.003f, 9.684f)
            lineTo(2.016f, 9.595f)
            curveTo(2.022f, 9.565f, 2.03f, 9.537f, 2.04f, 9.509f)
            lineTo(2.062f, 9.45f)
            lineTo(2.09f, 9.393f)
            lineTo(5.339f, 3.393f)
            curveTo(5.454f, 3.181f, 5.662f, 3.039f, 5.897f, 3.007f)
            lineTo(5.999f, 3f)
            lineTo(10.5f, 3.007f)
            lineTo(8.25f, 10f)
            lineTo(2.04f, 9.991f)
            curveTo(2.024f, 9.944f, 2.012f, 9.894f, 2.006f, 9.843f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF29C3FF)
                ),
                start = Offset(9.286f, 0.083f),
                end = Offset(5.308f, 8.955f)
            )
        ) {
            moveTo(2.006f, 9.843f)
            lineTo(2f, 9.75f)
            lineTo(2.003f, 9.684f)
            lineTo(2.016f, 9.595f)
            curveTo(2.022f, 9.565f, 2.03f, 9.537f, 2.04f, 9.509f)
            lineTo(2.062f, 9.45f)
            lineTo(2.09f, 9.393f)
            lineTo(5.339f, 3.393f)
            curveTo(5.454f, 3.181f, 5.662f, 3.039f, 5.897f, 3.007f)
            lineTo(5.999f, 3f)
            lineTo(10.5f, 3.007f)
            lineTo(8.25f, 10f)
            lineTo(2.04f, 9.991f)
            curveTo(2.024f, 9.944f, 2.012f, 9.894f, 2.006f, 9.843f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1B44B1),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(24.351f, 3f),
                end = Offset(13.462f, 19.603f)
            )
        ) {
            moveTo(21.96f, 9.514f)
            lineTo(21.922f, 9.421f)
            lineTo(21.694f, 9f)
            horizontalLineTo(15.766f)
            lineTo(14.997f, 10.5f)
            lineTo(11.999f, 18.187f)
            lineTo(11.999f, 21f)
            lineTo(12.124f, 20.99f)
            lineTo(12.201f, 20.973f)
            lineTo(12.299f, 20.94f)
            curveTo(12.413f, 20.892f, 12.516f, 20.814f, 12.596f, 20.708f)
            lineTo(21.83f, 10.221f)
            lineTo(21.871f, 10.168f)
            curveTo(21.876f, 10.16f, 21.881f, 10.152f, 21.886f, 10.144f)
            lineTo(21.924f, 10.075f)
            lineTo(21.971f, 9.949f)
            curveTo(21.989f, 9.886f, 21.998f, 9.819f, 21.998f, 9.75f)
            lineTo(21.992f, 9.656f)
            lineTo(21.972f, 9.554f)
            lineTo(21.96f, 9.514f)
            close()
        }
        path(fill = SolidColor(Color(0xFFA9A9A9))) {
            moveTo(11.999f, 21f)
            lineTo(11.899f, 20.994f)
            lineTo(11.781f, 20.968f)
            curveTo(11.721f, 20.951f, 11.662f, 20.925f, 11.608f, 20.892f)
            lineTo(11.598f, 20.885f)
            curveTo(11.551f, 20.856f, 11.507f, 20.822f, 11.467f, 20.781f)
            lineTo(2.178f, 10.235f)
            lineTo(2.152f, 10.203f)
            lineTo(2.112f, 10.144f)
            curveTo(2.056f, 10.054f, 2.019f, 9.952f, 2.006f, 9.843f)
            lineTo(2f, 9.75f)
            lineTo(2.003f, 9.684f)
            lineTo(2.016f, 9.595f)
            curveTo(2.022f, 9.565f, 2.03f, 9.537f, 2.04f, 9.509f)
            lineTo(2.062f, 9.45f)
            lineTo(2.09f, 9.393f)
            lineTo(2.303f, 9f)
            horizontalLineTo(8.344f)
            lineTo(8.998f, 10.5f)
            lineTo(11.999f, 18.187f)
            lineTo(11.999f, 21f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(3.765f, 6.6f),
                end = Offset(11.05f, 20.884f)
            )
        ) {
            moveTo(11.999f, 21f)
            lineTo(11.899f, 20.994f)
            lineTo(11.781f, 20.968f)
            curveTo(11.721f, 20.951f, 11.662f, 20.925f, 11.608f, 20.892f)
            lineTo(11.598f, 20.885f)
            curveTo(11.551f, 20.856f, 11.507f, 20.822f, 11.467f, 20.781f)
            lineTo(2.178f, 10.235f)
            lineTo(2.152f, 10.203f)
            lineTo(2.112f, 10.144f)
            curveTo(2.056f, 10.054f, 2.019f, 9.952f, 2.006f, 9.843f)
            lineTo(2f, 9.75f)
            lineTo(2.003f, 9.684f)
            lineTo(2.016f, 9.595f)
            curveTo(2.022f, 9.565f, 2.03f, 9.537f, 2.04f, 9.509f)
            lineTo(2.062f, 9.45f)
            lineTo(2.09f, 9.393f)
            lineTo(2.303f, 9f)
            horizontalLineTo(8.344f)
            lineTo(8.998f, 10.5f)
            lineTo(11.999f, 18.187f)
            lineTo(11.999f, 21f)
            close()
        }
        path(fill = SolidColor(Color(0xFF7C7A7A))) {
            moveTo(9.286f, 3.521f)
            curveTo(9.385f, 3.211f, 9.674f, 3f, 10f, 3f)
            horizontalLineTo(14f)
            curveTo(14.326f, 3f, 14.615f, 3.211f, 14.714f, 3.521f)
            lineTo(16.628f, 9.5f)
            horizontalLineTo(7.373f)
            lineTo(9.286f, 3.521f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(12f, 3f),
                end = Offset(12f, 11.125f)
            )
        ) {
            moveTo(9.286f, 3.521f)
            curveTo(9.385f, 3.211f, 9.674f, 3f, 10f, 3f)
            horizontalLineTo(14f)
            curveTo(14.326f, 3f, 14.615f, 3.211f, 14.714f, 3.521f)
            lineTo(16.628f, 9.5f)
            horizontalLineTo(7.373f)
            lineTo(9.286f, 3.521f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3F3F3F))) {
            moveTo(7.533f, 9f)
            lineTo(7.286f, 9.771f)
            curveTo(7.233f, 9.935f, 7.239f, 10.112f, 7.301f, 10.273f)
            lineTo(11.301f, 20.523f)
            curveTo(11.414f, 20.81f, 11.691f, 21f, 12f, 21f)
            curveTo(12.309f, 21f, 12.586f, 20.81f, 12.699f, 20.523f)
            lineTo(16.699f, 10.273f)
            curveTo(16.761f, 10.112f, 16.767f, 9.935f, 16.714f, 9.771f)
            lineTo(16.468f, 9f)
            horizontalLineTo(7.533f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2052CB),
                    1f to Color(0xFF0FAFFF)
                ),
                start = Offset(11.994f, 4.8f),
                end = Offset(11.994f, 21f)
            )
        ) {
            moveTo(7.533f, 9f)
            lineTo(7.286f, 9.771f)
            curveTo(7.233f, 9.935f, 7.239f, 10.112f, 7.301f, 10.273f)
            lineTo(11.301f, 20.523f)
            curveTo(11.414f, 20.81f, 11.691f, 21f, 12f, 21f)
            curveTo(12.309f, 21f, 12.586f, 20.81f, 12.699f, 20.523f)
            lineTo(16.699f, 10.273f)
            curveTo(16.761f, 10.112f, 16.767f, 9.935f, 16.714f, 9.771f)
            lineTo(16.468f, 9f)
            horizontalLineTo(7.533f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.533f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(-0.031f, -13.95f),
                end = Offset(15.123f, 22.799f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(17.999f, 3f)
            curveTo(18.24f, 3f, 18.464f, 3.115f, 18.604f, 3.306f)
            lineTo(18.659f, 3.393f)
            lineTo(21.922f, 9.421f)
            lineTo(21.96f, 9.514f)
            lineTo(21.972f, 9.554f)
            lineTo(21.992f, 9.656f)
            lineTo(21.998f, 9.75f)
            curveTo(21.998f, 9.819f, 21.989f, 9.886f, 21.971f, 9.949f)
            lineTo(21.924f, 10.075f)
            lineTo(21.886f, 10.144f)
            curveTo(21.864f, 10.18f, 21.839f, 10.214f, 21.811f, 10.246f)
            lineTo(21.871f, 10.168f)
            lineTo(21.846f, 10.203f)
            lineTo(12.596f, 20.708f)
            curveTo(12.516f, 20.814f, 12.413f, 20.892f, 12.299f, 20.94f)
            lineTo(12.201f, 20.973f)
            lineTo(12.123f, 20.99f)
            lineTo(11.999f, 21f)
            lineTo(11.899f, 20.994f)
            lineTo(11.781f, 20.968f)
            curveTo(11.721f, 20.951f, 11.662f, 20.925f, 11.608f, 20.892f)
            lineTo(11.598f, 20.885f)
            curveTo(11.551f, 20.856f, 11.507f, 20.822f, 11.467f, 20.781f)
            lineTo(2.178f, 10.235f)
            lineTo(2.152f, 10.203f)
            lineTo(2.112f, 10.144f)
            curveTo(2.056f, 10.054f, 2.019f, 9.952f, 2.006f, 9.843f)
            lineTo(2f, 9.75f)
            lineTo(2.003f, 9.684f)
            lineTo(2.016f, 9.595f)
            curveTo(2.022f, 9.565f, 2.03f, 9.537f, 2.04f, 9.509f)
            lineTo(2.062f, 9.45f)
            lineTo(2.09f, 9.393f)
            lineTo(5.339f, 3.393f)
            curveTo(5.454f, 3.181f, 5.662f, 3.039f, 5.897f, 3.007f)
            lineTo(5.999f, 3f)
            horizontalLineTo(17.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PremiumPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Premium, contentDescription = null)
    }
}
