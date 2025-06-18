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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.DocumentLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.DocumentLock",
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
            moveTo(6f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(9f)
            lineTo(15f, 7f)
            lineTo(13f, 2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(20f)
            curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
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
            moveTo(6f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(9f)
            lineTo(15f, 7f)
            lineTo(13f, 2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(20f)
            curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0x004A43CB),
                    0.62f to Color(0x7F4A43CB),
                    1f to Color(0x004A43CB),
                ),
                center = Offset(6f, 15.75f),
                radius = 3.75f,
            ),
            fillAlpha = 0.7f,
        ) {
            moveTo(6f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(9f)
            lineTo(15f, 7f)
            lineTo(13f, 2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(20f)
            curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0x7F4A43CB),
                    0.731f to Color(0x0C4A43CB),
                    1f to Color(0x004A43CB),
                ),
                center = Offset(10f, 17.625f),
                radius = 3.333f,
            ),
            fillAlpha = 0.7f,
        ) {
            moveTo(6f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(9f)
            lineTo(15f, 7f)
            lineTo(13f, 2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(20f)
            curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0x664A43CB),
                    1f to Color(0x004A43CB),
                ),
                center = Offset(10f, 20.75f),
                radius = 3.75f,
            ),
            fillAlpha = 0.7f,
        ) {
            moveTo(6f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(9f)
            lineTo(15f, 7f)
            lineTo(13f, 2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(20f)
            curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
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
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFD638),
                ),
                start = Offset(11.013f, 23.495f),
                end = Offset(0.646f, 17.135f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(3.929f, 15f)
            verticalLineTo(14.167f)
            curveTo(3.929f, 12.694f, 5.08f, 11.5f, 6.5f, 11.5f)
            curveTo(7.92f, 11.5f, 9.071f, 12.694f, 9.071f, 14.167f)
            verticalLineTo(15f)
            horizontalLineTo(9.666f)
            curveTo(10.403f, 15f, 11f, 15.597f, 11f, 16.333f)
            verticalLineTo(21.667f)
            curveTo(11f, 22.403f, 10.404f, 23f, 9.668f, 23f)
            horizontalLineTo(3.332f)
            curveTo(2.596f, 23f, 2f, 22.403f, 2f, 21.667f)
            verticalLineTo(16.333f)
            curveTo(2f, 15.597f, 2.597f, 15f, 3.334f, 15f)
            horizontalLineTo(3.929f)
            close()
            moveTo(6.5f, 13f)
            curveTo(5.948f, 13f, 5.5f, 13.448f, 5.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(7.5f)
            verticalLineTo(14f)
            curveTo(7.5f, 13.448f, 7.052f, 13f, 6.5f, 13f)
            close()
        }
        path(fill = SolidColor(Color(0xFF944600))) {
            moveTo(6.5f, 20f)
            curveTo(7.052f, 20f, 7.5f, 19.552f, 7.5f, 19f)
            curveTo(7.5f, 18.448f, 7.052f, 18f, 6.5f, 18f)
            curveTo(5.948f, 18f, 5.5f, 18.448f, 5.5f, 19f)
            curveTo(5.5f, 19.552f, 5.948f, 20f, 6.5f, 20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.DocumentLock, contentDescription = null)
    }
}
