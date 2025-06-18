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

public val FluentIcons.Colored.BookOpenLightbulb: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.BookOpenLightbulb",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    0.908f to Color(0xFF2052CB),
                ),
                start = Offset(3.875f, 4.571f),
                end = Offset(7.289f, 24.157f),
            ),
        ) {
            moveTo(2f, 6f)
            curveTo(2f, 4.895f, 2.895f, 4f, 4f, 4f)
            horizontalLineTo(10f)
            curveTo(10.768f, 4f, 12f, 5f, 12f, 6f)
            lineTo(13f, 12.5f)
            lineTo(12f, 19.236f)
            curveTo(11.469f, 19.711f, 10.768f, 20f, 10f, 20f)
            horizontalLineTo(4f)
            curveTo(2.895f, 20f, 2f, 19.105f, 2f, 18f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    0.908f to Color(0xFF2052CB),
                ),
                start = Offset(20.125f, 4.571f),
                end = Offset(16.711f, 24.157f),
            ),
        ) {
            moveTo(20f, 4f)
            curveTo(21.105f, 4f, 22f, 4.895f, 22f, 6f)
            verticalLineTo(18f)
            horizontalLineTo(19f)
            verticalLineTo(20f)
            horizontalLineTo(14f)
            curveTo(13.232f, 20f, 12.531f, 19.711f, 12f, 19.236f)
            lineTo(11f, 12.5f)
            lineTo(12f, 6f)
            curveTo(12f, 5f, 13.232f, 4f, 14f, 4f)
            horizontalLineTo(20f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB6EFFF),
                    0.851f to Color(0xFF58AAFE),
                ),
                start = Offset(2.286f, 3.442f),
                end = Offset(27.658f, 15.213f),
            ),
        ) {
            moveTo(3.5f, 5f)
            curveTo(3.5f, 4.448f, 3.948f, 4f, 4.5f, 4f)
            horizontalLineTo(10.5f)
            curveTo(11.328f, 4f, 12f, 4.672f, 12f, 5.5f)
            lineTo(12.555f, 11f)
            lineTo(12f, 16.5f)
            curveTo(12f, 17.605f, 11.105f, 18.5f, 10f, 18.5f)
            horizontalLineTo(4.5f)
            curveTo(3.948f, 18.5f, 3.5f, 18.052f, 3.5f, 17.5f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.123f to Color(0xFF9DEAFF),
                    0.616f to Color(0xFF4894FE),
                ),
                start = Offset(19.969f, 4.906f),
                end = Offset(0.231f, 9.077f),
            ),
        ) {
            moveTo(20.5f, 5f)
            curveTo(20.5f, 4.448f, 20.052f, 4f, 19.5f, 4f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 4f, 12f, 4.672f, 12f, 5.5f)
            verticalLineTo(16.5f)
            curveTo(12f, 17.605f, 12.895f, 18.5f, 14f, 18.5f)
            horizontalLineTo(19.5f)
            curveTo(20.052f, 18.5f, 20.5f, 18.052f, 20.5f, 17.5f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.251f to Color(0xFF2063C3),
                    0.714f to Color(0x008AD6FF),
                ),
                center = Offset(19.5f, 18.5f),
                radius = 12.379f,
            ),
        ) {
            moveTo(20.5f, 5f)
            curveTo(20.5f, 4.448f, 20.052f, 4f, 19.5f, 4f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 4f, 12f, 4.672f, 12f, 5.5f)
            verticalLineTo(16.5f)
            curveTo(12f, 17.605f, 12.895f, 18.5f, 14f, 18.5f)
            horizontalLineTo(19.5f)
            curveTo(20.052f, 18.5f, 20.5f, 18.052f, 20.5f, 17.5f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.376f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505),
                ),
                center = Offset(16.618f, 12.694f),
                radius = 10.094f,
            ),
        ) {
            moveTo(17.1f, 21f)
            lineTo(17.259f, 21.794f)
            curveTo(17.399f, 22.495f, 18.015f, 23f, 18.73f, 23f)
            horizontalLineTo(19.27f)
            curveTo(19.985f, 23f, 20.601f, 22.495f, 20.741f, 21.794f)
            lineTo(20.9f, 21f)
            lineTo(19f, 20.5f)
            lineTo(17.1f, 21f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD34719),
                    1f to Color(0x00D34719),
                ),
                start = Offset(19f, 20.5f),
                end = Offset(19f, 23f),
            ),
        ) {
            moveTo(17.1f, 21f)
            lineTo(17.259f, 21.794f)
            curveTo(17.399f, 22.495f, 18.015f, 23f, 18.73f, 23f)
            horizontalLineTo(19.27f)
            curveTo(19.985f, 23f, 20.601f, 22.495f, 20.741f, 21.794f)
            lineTo(20.9f, 21f)
            lineTo(19f, 20.5f)
            lineTo(17.1f, 21f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.376f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505),
                ),
                center = Offset(16.333f, 13.005f),
                radius = 9.181f,
            ),
        ) {
            moveTo(23f, 16f)
            curveTo(23f, 17.381f, 22.301f, 18.598f, 21.237f, 19.317f)
            lineTo(21.1f, 20f)
            lineTo(19f, 20.5f)
            lineTo(16.9f, 20f)
            lineTo(16.763f, 19.317f)
            curveTo(15.7f, 18.598f, 15f, 17.381f, 15f, 16f)
            curveTo(15f, 13.791f, 16.791f, 12f, 19f, 12f)
            curveTo(21.209f, 12f, 23f, 13.791f, 23f, 16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC7A3),
                    1f to Color(0xFFFF9C70),
                ),
                start = Offset(18.668f, 20.397f),
                end = Offset(19.672f, 22.084f),
            ),
        ) {
            moveTo(20.899f, 21f)
            horizontalLineTo(17.101f)
            lineTo(16.9f, 20f)
            horizontalLineTo(21.1f)
            lineTo(20.899f, 21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookOpenLightbulbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.BookOpenLightbulb, contentDescription = null)
    }
}
