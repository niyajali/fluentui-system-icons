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

public val FluentIcons.Colored.SlideTextSparkle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.SlideTextSparkle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFC92CB),
                    0.51f to Color(0xFFDD3CE2),
                    1f to Color(0xFFB91CBF),
                ),
                start = Offset(2.407f, 19.869f),
                end = Offset(16.688f, 1.856f),
            ),
        ) {
            moveTo(19.25f, 3.99f)
            horizontalLineTo(4.75f)
            curveTo(3.23f, 3.99f, 2f, 5.22f, 2f, 6.74f)
            verticalLineTo(17.24f)
            curveTo(2f, 18.76f, 3.23f, 19.99f, 4.75f, 19.99f)
            horizontalLineTo(19.25f)
            curveTo(20.77f, 19.99f, 22f, 18.76f, 22f, 17.24f)
            verticalLineTo(6.74f)
            curveTo(22f, 5.22f, 20.77f, 3.99f, 19.25f, 3.99f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55107A),
                    1f to Color(0x0055107A),
                ),
                center = Offset(9.083f, 8.79f),
                radius = 0.8f,
            ),
            fillAlpha = 0.3f,
        ) {
            moveTo(19.25f, 3.99f)
            horizontalLineTo(4.75f)
            curveTo(3.23f, 3.99f, 2f, 5.22f, 2f, 6.74f)
            verticalLineTo(17.24f)
            curveTo(2f, 18.76f, 3.23f, 19.99f, 4.75f, 19.99f)
            horizontalLineTo(19.25f)
            curveTo(20.77f, 19.99f, 22f, 18.76f, 22f, 17.24f)
            verticalLineTo(6.74f)
            curveTo(22f, 5.22f, 20.77f, 3.99f, 19.25f, 3.99f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55107A),
                    1f to Color(0x0055107A),
                ),
                center = Offset(11.167f, 11.99f),
                radius = 1.2f,
            ),
            fillAlpha = 0.3f,
        ) {
            moveTo(19.25f, 3.99f)
            horizontalLineTo(4.75f)
            curveTo(3.23f, 3.99f, 2f, 5.22f, 2f, 6.74f)
            verticalLineTo(17.24f)
            curveTo(2f, 18.76f, 3.23f, 19.99f, 4.75f, 19.99f)
            horizontalLineTo(19.25f)
            curveTo(20.77f, 19.99f, 22f, 18.76f, 22f, 17.24f)
            verticalLineTo(6.74f)
            curveTo(22f, 5.22f, 20.77f, 3.99f, 19.25f, 3.99f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55107A),
                    1f to Color(0x0055107A),
                ),
                center = Offset(9.917f, 15.19f),
                radius = 1.2f,
            ),
            fillAlpha = 0.3f,
        ) {
            moveTo(19.25f, 3.99f)
            horizontalLineTo(4.75f)
            curveTo(3.23f, 3.99f, 2f, 5.22f, 2f, 6.74f)
            verticalLineTo(17.24f)
            curveTo(2f, 18.76f, 3.23f, 19.99f, 4.75f, 19.99f)
            horizontalLineTo(19.25f)
            curveTo(20.77f, 19.99f, 22f, 18.76f, 22f, 17.24f)
            verticalLineTo(6.74f)
            curveTo(22f, 5.22f, 20.77f, 3.99f, 19.25f, 3.99f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55107A),
                    1f to Color(0x0055107A),
                ),
                center = Offset(17f, 5.59f),
                radius = 3.6f,
            ),
            fillAlpha = 0.6f,
        ) {
            moveTo(19.25f, 3.99f)
            horizontalLineTo(4.75f)
            curveTo(3.23f, 3.99f, 2f, 5.22f, 2f, 6.74f)
            verticalLineTo(17.24f)
            curveTo(2f, 18.76f, 3.23f, 19.99f, 4.75f, 19.99f)
            horizontalLineTo(19.25f)
            curveTo(20.77f, 19.99f, 22f, 18.76f, 22f, 17.24f)
            verticalLineTo(6.74f)
            curveTo(22f, 5.22f, 20.77f, 3.99f, 19.25f, 3.99f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55107A),
                    1f to Color(0x0055107A),
                ),
                center = Offset(21.167f, 10.39f),
                radius = 2.4f,
            ),
            fillAlpha = 0.4f,
        ) {
            moveTo(19.25f, 3.99f)
            horizontalLineTo(4.75f)
            curveTo(3.23f, 3.99f, 2f, 5.22f, 2f, 6.74f)
            verticalLineTo(17.24f)
            curveTo(2f, 18.76f, 3.23f, 19.99f, 4.75f, 19.99f)
            horizontalLineTo(19.25f)
            curveTo(20.77f, 19.99f, 22f, 18.76f, 22f, 17.24f)
            verticalLineTo(6.74f)
            curveTo(22f, 5.22f, 20.77f, 3.99f, 19.25f, 3.99f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.36f, 5f)
            lineTo(14.74f, 5.45f)
            curveTo(15.16f, 5.59f, 15.54f, 5.83f, 15.85f, 6.14f)
            curveTo(15.93f, 6.22f, 16.01f, 6.31f, 16.08f, 6.41f)
            curveTo(16.28f, 6.66f, 16.43f, 6.95f, 16.53f, 7.26f)
            lineTo(16.98f, 8.64f)
            curveTo(17.02f, 8.75f, 17.09f, 8.84f, 17.18f, 8.9f)
            curveTo(17.27f, 8.97f, 17.38f, 9f, 17.49f, 9f)
            curveTo(17.6f, 9f, 17.71f, 8.97f, 17.8f, 8.9f)
            curveTo(17.88f, 8.84f, 17.95f, 8.76f, 17.99f, 8.67f)
            curveTo(17.99f, 8.66f, 17.99f, 8.65f, 18f, 8.64f)
            lineTo(18.45f, 7.26f)
            curveTo(18.59f, 6.84f, 18.82f, 6.46f, 19.14f, 6.15f)
            curveTo(19.45f, 5.84f, 19.83f, 5.6f, 20.25f, 5.46f)
            lineTo(21.63f, 5.01f)
            curveTo(21.74f, 4.97f, 21.83f, 4.9f, 21.89f, 4.81f)
            curveTo(21.96f, 4.72f, 21.99f, 4.61f, 21.99f, 4.5f)
            curveTo(21.99f, 4.39f, 21.96f, 4.28f, 21.89f, 4.19f)
            curveTo(21.83f, 4.1f, 21.73f, 4.03f, 21.63f, 3.99f)
            horizontalLineTo(21.6f)
            lineTo(20.22f, 3.54f)
            curveTo(19.8f, 3.4f, 19.42f, 3.17f, 19.11f, 2.85f)
            curveTo(18.8f, 2.54f, 18.56f, 2.16f, 18.42f, 1.74f)
            lineTo(17.97f, 0.36f)
            curveTo(17.93f, 0.25f, 17.86f, 0.16f, 17.77f, 0.1f)
            curveTo(17.68f, 0.03f, 17.57f, 0f, 17.46f, 0f)
            curveTo(17.35f, 0f, 17.24f, 0.03f, 17.15f, 0.1f)
            curveTo(17.06f, 0.17f, 16.99f, 0.26f, 16.95f, 0.36f)
            lineTo(16.5f, 1.74f)
            verticalLineTo(1.77f)
            curveTo(16.35f, 2.17f, 16.12f, 2.54f, 15.83f, 2.84f)
            curveTo(15.52f, 3.15f, 15.15f, 3.39f, 14.73f, 3.53f)
            lineTo(13.35f, 3.98f)
            curveTo(13.24f, 4.02f, 13.15f, 4.09f, 13.09f, 4.18f)
            curveTo(13.02f, 4.27f, 12.99f, 4.38f, 12.99f, 4.49f)
            curveTo(12.99f, 4.6f, 13.02f, 4.71f, 13.09f, 4.8f)
            curveTo(13.16f, 4.89f, 13.25f, 4.96f, 13.35f, 5f)
            horizontalLineTo(13.36f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFEE5FF),
                    0.964f to Color(0xFFF0B6F2),
                ),
                start = Offset(21.823f, 10f),
                end = Offset(14.664f, 4.247f),
            ),
        ) {
            moveTo(13.36f, 5f)
            lineTo(14.74f, 5.45f)
            curveTo(15.16f, 5.59f, 15.54f, 5.83f, 15.85f, 6.14f)
            curveTo(15.93f, 6.22f, 16.01f, 6.31f, 16.08f, 6.41f)
            curveTo(16.28f, 6.66f, 16.43f, 6.95f, 16.53f, 7.26f)
            lineTo(16.98f, 8.64f)
            curveTo(17.02f, 8.75f, 17.09f, 8.84f, 17.18f, 8.9f)
            curveTo(17.27f, 8.97f, 17.38f, 9f, 17.49f, 9f)
            curveTo(17.6f, 9f, 17.71f, 8.97f, 17.8f, 8.9f)
            curveTo(17.88f, 8.84f, 17.95f, 8.76f, 17.99f, 8.67f)
            curveTo(17.99f, 8.66f, 17.99f, 8.65f, 18f, 8.64f)
            lineTo(18.45f, 7.26f)
            curveTo(18.59f, 6.84f, 18.82f, 6.46f, 19.14f, 6.15f)
            curveTo(19.45f, 5.84f, 19.83f, 5.6f, 20.25f, 5.46f)
            lineTo(21.63f, 5.01f)
            curveTo(21.74f, 4.97f, 21.83f, 4.9f, 21.89f, 4.81f)
            curveTo(21.96f, 4.72f, 21.99f, 4.61f, 21.99f, 4.5f)
            curveTo(21.99f, 4.39f, 21.96f, 4.28f, 21.89f, 4.19f)
            curveTo(21.83f, 4.1f, 21.73f, 4.03f, 21.63f, 3.99f)
            horizontalLineTo(21.6f)
            lineTo(20.22f, 3.54f)
            curveTo(19.8f, 3.4f, 19.42f, 3.17f, 19.11f, 2.85f)
            curveTo(18.8f, 2.54f, 18.56f, 2.16f, 18.42f, 1.74f)
            lineTo(17.97f, 0.36f)
            curveTo(17.93f, 0.25f, 17.86f, 0.16f, 17.77f, 0.1f)
            curveTo(17.68f, 0.03f, 17.57f, 0f, 17.46f, 0f)
            curveTo(17.35f, 0f, 17.24f, 0.03f, 17.15f, 0.1f)
            curveTo(17.06f, 0.17f, 16.99f, 0.26f, 16.95f, 0.36f)
            lineTo(16.5f, 1.74f)
            verticalLineTo(1.77f)
            curveTo(16.35f, 2.17f, 16.12f, 2.54f, 15.83f, 2.84f)
            curveTo(15.52f, 3.15f, 15.15f, 3.39f, 14.73f, 3.53f)
            lineTo(13.35f, 3.98f)
            curveTo(13.24f, 4.02f, 13.15f, 4.09f, 13.09f, 4.18f)
            curveTo(13.02f, 4.27f, 12.99f, 4.38f, 12.99f, 4.49f)
            curveTo(12.99f, 4.6f, 13.02f, 4.71f, 13.09f, 4.8f)
            curveTo(13.16f, 4.89f, 13.25f, 4.96f, 13.35f, 5f)
            horizontalLineTo(13.36f)
            close()
        }
        path(fill = SolidColor(Color(0xFF242424))) {
            moveTo(16f, 11.74f)
            curveTo(16f, 11.33f, 15.66f, 10.99f, 15.25f, 10.99f)
            horizontalLineTo(6.75f)
            curveTo(6.34f, 10.99f, 6f, 11.33f, 6f, 11.74f)
            curveTo(6f, 12.15f, 6.34f, 12.49f, 6.75f, 12.49f)
            horizontalLineTo(15.25f)
            curveTo(15.66f, 12.49f, 16f, 12.15f, 16f, 11.74f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFEE5FF),
                    0.964f to Color(0xFFF0B6F2),
                ),
                start = Offset(15.583f, 11.74f),
                end = Offset(4.75f, 11.74f),
            ),
        ) {
            moveTo(16f, 11.74f)
            curveTo(16f, 11.33f, 15.66f, 10.99f, 15.25f, 10.99f)
            horizontalLineTo(6.75f)
            curveTo(6.34f, 10.99f, 6f, 11.33f, 6f, 11.74f)
            curveTo(6f, 12.15f, 6.34f, 12.49f, 6.75f, 12.49f)
            horizontalLineTo(15.25f)
            curveTo(15.66f, 12.49f, 16f, 12.15f, 16f, 11.74f)
            close()
        }
        path(fill = SolidColor(Color(0xFF242424))) {
            moveTo(6.75f, 13.99f)
            curveTo(6.34f, 13.99f, 6f, 14.33f, 6f, 14.74f)
            curveTo(6f, 15.15f, 6.34f, 15.49f, 6.75f, 15.49f)
            horizontalLineTo(13.25f)
            curveTo(13.66f, 15.49f, 14f, 15.15f, 14f, 14.74f)
            curveTo(14f, 14.33f, 13.66f, 13.99f, 13.25f, 13.99f)
            horizontalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFEE5FF),
                    0.964f to Color(0xFFF0B6F2),
                ),
                start = Offset(13.667f, 14.74f),
                end = Offset(5f, 14.74f),
            ),
        ) {
            moveTo(6.75f, 13.99f)
            curveTo(6.34f, 13.99f, 6f, 14.33f, 6f, 14.74f)
            curveTo(6f, 15.15f, 6.34f, 15.49f, 6.75f, 15.49f)
            horizontalLineTo(13.25f)
            curveTo(13.66f, 15.49f, 14f, 15.15f, 14f, 14.74f)
            curveTo(14f, 14.33f, 13.66f, 13.99f, 13.25f, 13.99f)
            horizontalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFEE5FF),
                    0.964f to Color(0xFFF0B6F2),
                ),
                start = Offset(29.125f, 21.5f),
                end = Offset(13.871f, 12.52f),
            ),
        ) {
            moveTo(23.94f, 10.32f)
            curveTo(23.9f, 10.27f, 23.85f, 10.23f, 23.79f, 10.21f)
            horizontalLineTo(23.77f)
            lineTo(23f, 9.96f)
            curveTo(22.77f, 9.88f, 22.56f, 9.75f, 22.38f, 9.58f)
            curveTo(22.21f, 9.41f, 22.08f, 9.2f, 22f, 8.96f)
            lineTo(21.75f, 8.2f)
            curveTo(21.73f, 8.14f, 21.69f, 8.09f, 21.64f, 8.05f)
            curveTo(21.59f, 8.01f, 21.53f, 7.99f, 21.47f, 7.99f)
            curveTo(21.41f, 7.99f, 21.35f, 8.01f, 21.3f, 8.05f)
            curveTo(21.25f, 8.09f, 21.21f, 8.14f, 21.19f, 8.2f)
            lineTo(20.94f, 8.96f)
            curveTo(20.86f, 9.19f, 20.74f, 9.4f, 20.57f, 9.57f)
            curveTo(20.4f, 9.74f, 20.19f, 9.87f, 19.96f, 9.95f)
            lineTo(19.19f, 10.2f)
            curveTo(19.13f, 10.22f, 19.08f, 10.26f, 19.04f, 10.31f)
            curveTo(19f, 10.36f, 18.98f, 10.42f, 18.98f, 10.48f)
            curveTo(18.98f, 10.54f, 19f, 10.6f, 19.04f, 10.65f)
            curveTo(19.08f, 10.7f, 19.13f, 10.74f, 19.19f, 10.76f)
            lineTo(19.96f, 11.01f)
            curveTo(20.19f, 11.09f, 20.4f, 11.22f, 20.58f, 11.39f)
            curveTo(20.75f, 11.56f, 20.88f, 11.78f, 20.96f, 12.01f)
            lineTo(21.21f, 12.77f)
            curveTo(21.23f, 12.83f, 21.27f, 12.88f, 21.32f, 12.92f)
            curveTo(21.37f, 12.96f, 21.43f, 12.98f, 21.49f, 12.98f)
            curveTo(21.55f, 12.98f, 21.61f, 12.96f, 21.66f, 12.92f)
            curveTo(21.71f, 12.88f, 21.75f, 12.83f, 21.77f, 12.77f)
            lineTo(22.02f, 12.01f)
            curveTo(22.1f, 11.78f, 22.23f, 11.57f, 22.4f, 11.39f)
            curveTo(22.57f, 11.22f, 22.79f, 11.09f, 23.02f, 11.01f)
            lineTo(23.79f, 10.76f)
            curveTo(23.85f, 10.74f, 23.9f, 10.7f, 23.94f, 10.65f)
            curveTo(23.98f, 10.6f, 24f, 10.54f, 24f, 10.48f)
            curveTo(24f, 10.42f, 23.98f, 10.36f, 23.94f, 10.31f)
            verticalLineTo(10.32f)
            close()
        }
        path(fill = SolidColor(Color(0xFF242424))) {
            moveTo(6.75f, 9.49f)
            horizontalLineTo(11.25f)
            curveTo(11.66f, 9.49f, 12f, 9.15f, 12f, 8.74f)
            curveTo(12f, 8.33f, 11.66f, 7.99f, 11.25f, 7.99f)
            horizontalLineTo(6.75f)
            curveTo(6.34f, 7.99f, 6f, 8.33f, 6f, 8.74f)
            curveTo(6f, 9.15f, 6.34f, 9.49f, 6.75f, 9.49f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFEE5FF),
                    0.964f to Color(0xFFF0B6F2),
                ),
                start = Offset(11.75f, 8.74f),
                end = Offset(5.25f, 8.74f),
            ),
        ) {
            moveTo(6.75f, 9.49f)
            horizontalLineTo(11.25f)
            curveTo(11.66f, 9.49f, 12f, 9.15f, 12f, 8.74f)
            curveTo(12f, 8.33f, 11.66f, 7.99f, 11.25f, 7.99f)
            horizontalLineTo(6.75f)
            curveTo(6.34f, 7.99f, 6f, 8.33f, 6f, 8.74f)
            curveTo(6f, 9.15f, 6.34f, 9.49f, 6.75f, 9.49f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideTextSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.SlideTextSparkle, contentDescription = null)
    }
}
