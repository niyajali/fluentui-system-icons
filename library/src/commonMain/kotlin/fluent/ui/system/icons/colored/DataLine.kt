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

public val FluentIcons.Colored.DataLine: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.DataLine",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D),
                ),
                start = Offset(5.25f, 6.75f),
                end = Offset(21.244f, 22.18f),
            ),
        ) {
            moveTo(18.886f, 6.857f)
            curveTo(19.241f, 7.07f, 19.356f, 7.531f, 19.143f, 7.886f)
            lineTo(16.143f, 12.886f)
            curveTo(15.93f, 13.241f, 15.469f, 13.356f, 15.114f, 13.143f)
            curveTo(14.759f, 12.93f, 14.644f, 12.469f, 14.857f, 12.114f)
            lineTo(17.857f, 7.114f)
            curveTo(18.07f, 6.759f, 18.531f, 6.644f, 18.886f, 6.857f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(3.814f, 18.75f),
                radius = 5.232f,
            ),
        ) {
            moveTo(18.886f, 6.857f)
            curveTo(19.241f, 7.07f, 19.356f, 7.531f, 19.143f, 7.886f)
            lineTo(16.143f, 12.886f)
            curveTo(15.93f, 13.241f, 15.469f, 13.356f, 15.114f, 13.143f)
            curveTo(14.759f, 12.93f, 14.644f, 12.469f, 14.857f, 12.114f)
            lineTo(17.857f, 7.114f)
            curveTo(18.07f, 6.759f, 18.531f, 6.644f, 18.886f, 6.857f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(19.609f, 5.659f),
                radius = 4.637f,
            ),
        ) {
            moveTo(18.886f, 6.857f)
            curveTo(19.241f, 7.07f, 19.356f, 7.531f, 19.143f, 7.886f)
            lineTo(16.143f, 12.886f)
            curveTo(15.93f, 13.241f, 15.469f, 13.356f, 15.114f, 13.143f)
            curveTo(14.759f, 12.93f, 14.644f, 12.469f, 14.857f, 12.114f)
            lineTo(17.857f, 7.114f)
            curveTo(18.07f, 6.759f, 18.531f, 6.644f, 18.886f, 6.857f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(13.908f, 13.9f),
                radius = 4.674f,
            ),
        ) {
            moveTo(18.886f, 6.857f)
            curveTo(19.241f, 7.07f, 19.356f, 7.531f, 19.143f, 7.886f)
            lineTo(16.143f, 12.886f)
            curveTo(15.93f, 13.241f, 15.469f, 13.356f, 15.114f, 13.143f)
            curveTo(14.759f, 12.93f, 14.644f, 12.469f, 14.857f, 12.114f)
            lineTo(17.857f, 7.114f)
            curveTo(18.07f, 6.759f, 18.531f, 6.644f, 18.886f, 6.857f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D),
                ),
                start = Offset(5.25f, 6.75f),
                end = Offset(21.244f, 22.18f),
            ),
        ) {
            moveTo(13.671f, 14.165f)
            curveTo(13.856f, 14.535f, 13.706f, 14.986f, 13.335f, 15.171f)
            lineTo(6.335f, 18.671f)
            curveTo(5.965f, 18.856f, 5.514f, 18.706f, 5.329f, 18.335f)
            curveTo(5.144f, 17.965f, 5.294f, 17.514f, 5.665f, 17.329f)
            lineTo(12.665f, 13.829f)
            curveTo(13.035f, 13.644f, 13.486f, 13.794f, 13.671f, 14.165f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(3.814f, 18.75f),
                radius = 5.232f,
            ),
        ) {
            moveTo(13.671f, 14.165f)
            curveTo(13.856f, 14.535f, 13.706f, 14.986f, 13.335f, 15.171f)
            lineTo(6.335f, 18.671f)
            curveTo(5.965f, 18.856f, 5.514f, 18.706f, 5.329f, 18.335f)
            curveTo(5.144f, 17.965f, 5.294f, 17.514f, 5.665f, 17.329f)
            lineTo(12.665f, 13.829f)
            curveTo(13.035f, 13.644f, 13.486f, 13.794f, 13.671f, 14.165f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(19.609f, 5.659f),
                radius = 4.637f,
            ),
        ) {
            moveTo(13.671f, 14.165f)
            curveTo(13.856f, 14.535f, 13.706f, 14.986f, 13.335f, 15.171f)
            lineTo(6.335f, 18.671f)
            curveTo(5.965f, 18.856f, 5.514f, 18.706f, 5.329f, 18.335f)
            curveTo(5.144f, 17.965f, 5.294f, 17.514f, 5.665f, 17.329f)
            lineTo(12.665f, 13.829f)
            curveTo(13.035f, 13.644f, 13.486f, 13.794f, 13.671f, 14.165f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.549f to Color(0xFF70777D),
                    1f to Color(0x0070777D),
                ),
                center = Offset(13.908f, 13.9f),
                radius = 4.674f,
            ),
        ) {
            moveTo(13.671f, 14.165f)
            curveTo(13.856f, 14.535f, 13.706f, 14.986f, 13.335f, 15.171f)
            lineTo(6.335f, 18.671f)
            curveTo(5.965f, 18.856f, 5.514f, 18.706f, 5.329f, 18.335f)
            curveTo(5.144f, 17.965f, 5.294f, 17.514f, 5.665f, 17.329f)
            lineTo(12.665f, 13.829f)
            curveTo(13.035f, 13.644f, 13.486f, 13.794f, 13.671f, 14.165f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0078D4),
                ),
                start = Offset(2.75f, 15.25f),
                end = Offset(9.204f, 22.884f),
            ),
        ) {
            moveTo(5f, 18f)
            moveToRelative(-3f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6D37CD),
                    0.641f to Color(0xFFEA71EF),
                ),
                start = Offset(17f, 17f),
                end = Offset(7.4f, 7.4f),
            ),
        ) {
            moveTo(14f, 14f)
            moveToRelative(-3f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE23CB4),
                    1f to Color(0xFFEA71EF),
                ),
                start = Offset(21.5f, 7.9f),
                end = Offset(17.2f, 3f),
            ),
        ) {
            moveTo(19f, 6f)
            moveToRelative(-3f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
        }
    }.build()
}

@Preview
@Composable
private fun DataLinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.DataLine, contentDescription = null)
    }
}
