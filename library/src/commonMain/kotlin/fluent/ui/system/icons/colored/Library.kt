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

public val FluentIcons.Colored.Library: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Library",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(-1.75f, 3f),
                end = Offset(2.7f, 26.492f),
            ),
        ) {
            moveTo(5.5f, 3f)
            curveTo(6.328f, 3f, 7f, 3.672f, 7f, 4.5f)
            verticalLineTo(19.5f)
            curveTo(7f, 20.328f, 6.328f, 21f, 5.5f, 21f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 21f, 2f, 20.328f, 2f, 19.5f)
            verticalLineTo(4.5f)
            curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
            horizontalLineTo(5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(-1.75f, 3f),
                end = Offset(2.7f, 26.492f),
            ),
        ) {
            moveTo(11.5f, 3f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineTo(19.5f)
            curveTo(13f, 20.328f, 12.328f, 21f, 11.5f, 21f)
            horizontalLineTo(9.5f)
            curveTo(8.672f, 21f, 8f, 20.328f, 8f, 19.5f)
            verticalLineTo(4.5f)
            curveTo(8f, 3.672f, 8.672f, 3f, 9.5f, 3f)
            horizontalLineTo(11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(-1.75f, 3f),
                end = Offset(2.7f, 26.492f),
            ),
        ) {
            moveTo(21.995f, 18.643f)
            lineTo(18.781f, 6.124f)
            curveTo(18.575f, 5.323f, 17.758f, 4.839f, 16.955f, 5.044f)
            lineTo(15.079f, 5.527f)
            curveTo(14.276f, 5.733f, 13.793f, 6.55f, 13.999f, 7.353f)
            lineTo(17.213f, 19.87f)
            curveTo(17.419f, 20.673f, 18.236f, 21.156f, 19.039f, 20.95f)
            lineTo(20.915f, 20.469f)
            curveTo(21.718f, 20.263f, 22.201f, 19.445f, 21.995f, 18.643f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF),
                ),
                start = Offset(8f, 2.178f),
                end = Offset(13.97f, 4.427f),
            ),
        ) {
            moveTo(2f, 6f)
            horizontalLineTo(7f)
            verticalLineTo(8f)
            horizontalLineTo(2f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF),
                ),
                start = Offset(8f, 2.178f),
                end = Offset(13.97f, 4.427f),
            ),
        ) {
            moveTo(14.982f, 11.18f)
            lineTo(19.767f, 9.962f)
            lineTo(19.269f, 8.025f)
            lineTo(14.484f, 9.243f)
            lineTo(14.982f, 11.18f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF),
                ),
                start = Offset(8f, 2.178f),
                end = Offset(13.97f, 4.427f),
            ),
        ) {
            moveTo(13f, 6f)
            horizontalLineTo(8f)
            verticalLineTo(8f)
            horizontalLineTo(13f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LibraryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Library, contentDescription = null)
    }
}
