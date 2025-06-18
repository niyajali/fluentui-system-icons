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

public val FluentUi.Colored.Agents: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Agents",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC470),
                    0.251f to Color(0xFFFF835C),
                    0.584f to Color(0xFFF24A9D),
                    0.871f to Color(0xFFB339F0),
                    1f to Color(0xFFC354FF)
                ),
                center = Offset(13.893f, 25.886f),
                radius = 26.249f
            )
        ) {
            moveTo(13.918f, 3f)
            lineTo(10.332f, 5.461f)
            lineTo(7.361f, 20.913f)
            curveTo(7.566f, 20.969f, 7.781f, 20.999f, 8f, 21f)
            lineTo(8.008f, 21f)
            horizontalLineTo(16f)
            lineTo(16f, 20.997f)
            curveTo(16.763f, 20.962f, 17.459f, 20.54f, 17.844f, 19.875f)
            lineTo(18.51f, 18.72f)
            lineTo(18.482f, 18.754f)
            lineTo(18.49f, 18.731f)
            lineTo(21.719f, 13.123f)
            curveTo(22.119f, 12.428f, 22.119f, 11.572f, 21.719f, 10.877f)
            lineTo(17.896f, 4.237f)
            curveTo(17.675f, 3.854f, 17.361f, 3.545f, 16.992f, 3.331f)
            lineTo(16.967f, 3.317f)
            curveTo(16.673f, 3.152f, 16.346f, 3.047f, 16.003f, 3.012f)
            lineTo(16f, 3f)
            horizontalLineTo(13.918f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.709f to Color(0x00FFB357),
                    0.942f to Color(0xFFFFB357)
                ),
                center = Offset(13.374f, 18.923f),
                radius = 16.285f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(13.918f, 3f)
            lineTo(10.332f, 5.461f)
            lineTo(7.361f, 20.913f)
            curveTo(7.566f, 20.969f, 7.781f, 20.999f, 8f, 21f)
            lineTo(8.008f, 21f)
            horizontalLineTo(16f)
            lineTo(16f, 20.997f)
            curveTo(16.763f, 20.962f, 17.459f, 20.54f, 17.844f, 19.875f)
            lineTo(18.51f, 18.72f)
            lineTo(18.482f, 18.754f)
            lineTo(18.49f, 18.731f)
            lineTo(21.719f, 13.123f)
            curveTo(22.119f, 12.428f, 22.119f, 11.572f, 21.719f, 10.877f)
            lineTo(17.896f, 4.237f)
            curveTo(17.675f, 3.854f, 17.361f, 3.545f, 16.992f, 3.331f)
            lineTo(16.967f, 3.317f)
            curveTo(16.673f, 3.152f, 16.346f, 3.047f, 16.003f, 3.012f)
            lineTo(16f, 3f)
            horizontalLineTo(13.918f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.222f to Color(0xFF4E46E2),
                    0.578f to Color(0xFF625DF6),
                    0.955f to Color(0xFFE37DFF)
                ),
                center = Offset(20.348f, 19.2f),
                radius = 25.461f
            )
        ) {
            moveTo(13.776f, 4.674f)
            lineTo(9.953f, 19.432f)
            curveTo(9.756f, 20.329f, 8.956f, 21f, 8f, 21f)
            curveTo(7.962f, 21f, 7.923f, 20.999f, 7.885f, 20.997f)
            curveTo(7.491f, 20.977f, 7.114f, 20.863f, 6.783f, 20.671f)
            lineTo(6.758f, 20.657f)
            curveTo(6.41f, 20.45f, 6.113f, 20.157f, 5.9f, 19.797f)
            curveTo(5.886f, 19.773f, 5.872f, 19.749f, 5.859f, 19.724f)
            lineTo(2.244f, 13.097f)
            curveTo(1.869f, 12.41f, 1.879f, 11.576f, 2.27f, 10.897f)
            lineTo(6.167f, 4.127f)
            curveTo(6.246f, 3.991f, 6.337f, 3.865f, 6.439f, 3.751f)
            horizontalLineTo(6.427f)
            curveTo(6.826f, 3.304f, 7.391f, 3.031f, 7.999f, 3.002f)
            lineTo(8f, 3f)
            horizontalLineTo(15.75f)
            curveTo(14.756f, 3f, 13.932f, 3.724f, 13.776f, 4.674f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x007563F7),
                    0.986f to Color(0xFF4916AE)
                ),
                start = Offset(6.196f, 10.457f),
                end = Offset(12.208f, 11.854f)
            ),
            fillAlpha = 0.4f
        ) {
            moveTo(13.776f, 4.674f)
            lineTo(9.953f, 19.432f)
            curveTo(9.756f, 20.329f, 8.956f, 21f, 8f, 21f)
            curveTo(7.962f, 21f, 7.923f, 20.999f, 7.885f, 20.997f)
            curveTo(7.491f, 20.977f, 7.114f, 20.863f, 6.783f, 20.671f)
            lineTo(6.758f, 20.657f)
            curveTo(6.41f, 20.45f, 6.113f, 20.157f, 5.9f, 19.797f)
            curveTo(5.886f, 19.773f, 5.872f, 19.749f, 5.859f, 19.724f)
            lineTo(2.244f, 13.097f)
            curveTo(1.869f, 12.41f, 1.879f, 11.576f, 2.27f, 10.897f)
            lineTo(6.167f, 4.127f)
            curveTo(6.246f, 3.991f, 6.337f, 3.865f, 6.439f, 3.751f)
            horizontalLineTo(6.427f)
            curveTo(6.826f, 3.304f, 7.391f, 3.031f, 7.999f, 3.002f)
            lineTo(8f, 3f)
            horizontalLineTo(15.75f)
            curveTo(14.756f, 3f, 13.932f, 3.724f, 13.776f, 4.674f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.222f to Color(0xFF4E46E2),
                    0.578f to Color(0xFF625DF6),
                    0.955f to Color(0xFFE37DFF)
                ),
                center = Offset(20.348f, 19.2f),
                radius = 25.461f
            )
        ) {
            moveTo(15.834f, 3.002f)
            curveTo(15.806f, 3.001f, 15.778f, 3f, 15.75f, 3f)
            horizontalLineTo(15.834f)
            lineTo(15.834f, 3.002f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x007563F7),
                    0.986f to Color(0xFF4916AE)
                ),
                start = Offset(6.196f, 10.457f),
                end = Offset(12.208f, 11.854f)
            ),
            fillAlpha = 0.4f
        ) {
            moveTo(15.834f, 3.002f)
            curveTo(15.806f, 3.001f, 15.778f, 3f, 15.75f, 3f)
            horizontalLineTo(15.834f)
            lineTo(15.834f, 3.002f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AgentsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Agents, contentDescription = null)
    }
}
