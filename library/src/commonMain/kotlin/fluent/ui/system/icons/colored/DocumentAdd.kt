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

public val FluentIcons.Colored.DocumentAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.DocumentAdd",
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
                    0.535f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB),
                ),
                center = Offset(7.333f, 19f),
                radius = 8f,
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
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B),
                ),
                start = Offset(1.393f, 14.063f),
                end = Offset(8.984f, 21.95f),
            ),
        ) {
            moveTo(12f, 17.5f)
            curveTo(12f, 14.462f, 9.538f, 12f, 6.5f, 12f)
            curveTo(3.462f, 12f, 1f, 14.462f, 1f, 17.5f)
            curveTo(1f, 20.538f, 3.462f, 23f, 6.5f, 23f)
            curveTo(9.538f, 23f, 12f, 20.538f, 12f, 17.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFFFFF),
                    1f to Color(0xFFE3FFD9),
                ),
                start = Offset(4.313f, 14.714f),
                end = Offset(6.46f, 22.296f),
            ),
        ) {
            moveTo(6.5f, 14f)
            curveTo(6.224f, 14f, 6f, 14.224f, 6f, 14.5f)
            verticalLineTo(17f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 17f, 3f, 17.224f, 3f, 17.5f)
            curveTo(3f, 17.776f, 3.224f, 18f, 3.5f, 18f)
            horizontalLineTo(6f)
            verticalLineTo(20.5f)
            curveTo(6f, 20.776f, 6.224f, 21f, 6.5f, 21f)
            curveTo(6.776f, 21f, 7f, 20.776f, 7f, 20.5f)
            verticalLineTo(18f)
            horizontalLineTo(9.5f)
            curveTo(9.776f, 18f, 10f, 17.776f, 10f, 17.5f)
            curveTo(10f, 17.224f, 9.776f, 17f, 9.5f, 17f)
            horizontalLineTo(7f)
            verticalLineTo(14.5f)
            curveTo(7f, 14.224f, 6.776f, 14f, 6.5f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.DocumentAdd, contentDescription = null)
    }
}
