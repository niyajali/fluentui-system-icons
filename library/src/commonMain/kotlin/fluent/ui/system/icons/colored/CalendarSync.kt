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

public val FluentIcons.Colored.CalendarSync: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.CalendarSync",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF),
                ),
                start = Offset(9.429f, 6.5f),
                end = Offset(14.137f, 20.932f),
            ),
        ) {
            moveTo(21f, 7.5f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.5f)
            lineTo(12f, 6.5f)
            lineTo(21f, 7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00DCF8FF),
                    1f to Color(0xB2FF6CE8),
                ),
                start = Offset(13.929f, 12.432f),
                end = Offset(16.625f, 24.267f),
            ),
        ) {
            moveTo(21f, 7.5f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.5f)
            lineTo(12f, 6.5f)
            lineTo(21f, 7.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.535f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB),
                ),
                center = Offset(17.786f, 19.023f),
                radius = 8.568f,
            ),
            fillAlpha = 0.3f,
        ) {
            moveTo(21f, 7.5f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.5f)
            lineTo(12f, 6.5f)
            lineTo(21f, 7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(3.723f, 3f),
                end = Offset(5.356f, 11.537f),
            ),
        ) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B),
                ),
                start = Offset(12.393f, 14.063f),
                end = Offset(19.984f, 21.95f),
            ),
        ) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFFFFF),
                    1f to Color(0xFFE3FFD9),
                ),
                start = Offset(15.313f, 14.714f),
                end = Offset(17.46f, 22.296f),
            ),
        ) {
            moveTo(20.5f, 14f)
            curveTo(20.776f, 14f, 21f, 14.224f, 21f, 14.5f)
            verticalLineTo(16.5f)
            curveTo(21f, 16.776f, 20.776f, 17f, 20.5f, 17f)
            horizontalLineTo(18.5f)
            curveTo(18.224f, 17f, 18f, 16.776f, 18f, 16.5f)
            curveTo(18f, 16.224f, 18.224f, 16f, 18.5f, 16f)
            horizontalLineTo(19.5f)
            curveTo(19.044f, 15.392f, 18.317f, 15f, 17.5f, 15f)
            curveTo(16.667f, 15f, 15.928f, 15.407f, 15.473f, 16.036f)
            curveTo(15.311f, 16.26f, 14.999f, 16.31f, 14.775f, 16.148f)
            curveTo(14.551f, 15.986f, 14.501f, 15.673f, 14.663f, 15.45f)
            curveTo(15.298f, 14.572f, 16.332f, 14f, 17.5f, 14f)
            curveTo(18.48f, 14f, 19.365f, 14.403f, 20f, 15.051f)
            verticalLineTo(14.5f)
            curveTo(20f, 14.224f, 20.224f, 14f, 20.5f, 14f)
            close()
            moveTo(15f, 19.949f)
            verticalLineTo(20.5f)
            curveTo(15f, 20.776f, 14.776f, 21f, 14.5f, 21f)
            curveTo(14.224f, 21f, 14f, 20.776f, 14f, 20.5f)
            verticalLineTo(18.5f)
            curveTo(14f, 18.224f, 14.224f, 18f, 14.5f, 18f)
            horizontalLineTo(16.5f)
            curveTo(16.776f, 18f, 17f, 18.224f, 17f, 18.5f)
            curveTo(17f, 18.776f, 16.776f, 19f, 16.5f, 19f)
            horizontalLineTo(15.5f)
            curveTo(15.956f, 19.608f, 16.683f, 20f, 17.5f, 20f)
            curveTo(18.266f, 20f, 18.952f, 19.656f, 19.411f, 19.112f)
            curveTo(19.589f, 18.901f, 19.905f, 18.874f, 20.116f, 19.052f)
            curveTo(20.327f, 19.23f, 20.353f, 19.546f, 20.175f, 19.757f)
            curveTo(19.534f, 20.516f, 18.573f, 21f, 17.5f, 21f)
            curveTo(16.52f, 21f, 15.635f, 20.597f, 15f, 19.949f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.CalendarSync, contentDescription = null)
    }
}
