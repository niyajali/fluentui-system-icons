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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.Paw: ImageVector
    get() {
        if (_Paw != null) {
            return _Paw!!
        }
        _Paw = ImageVector.Builder(
            name = "Colored.Paw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFFFF921F),
                        1f to Color(0xFFEB4824)
                    ),
                    start = Offset(8.329f, 11.462f),
                    end = Offset(13.266f, 21.495f)
                )
            ) {
                moveTo(12f, 10f)
                curveTo(8.134f, 10f, 5f, 13.134f, 5f, 17f)
                curveTo(5f, 18.361f, 5.721f, 19.388f, 6.701f, 20.044f)
                curveTo(7.663f, 20.689f, 8.898f, 21f, 10.078f, 21f)
                horizontalLineTo(13.922f)
                curveTo(15.102f, 21f, 16.337f, 20.689f, 17.299f, 20.044f)
                curveTo(18.279f, 19.388f, 19f, 18.361f, 19f, 17f)
                curveTo(19f, 13.134f, 15.866f, 10f, 12f, 10f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEB4824),
                        1f to Color(0xFFFF921F)
                    ),
                    center = Offset(12.611f, 12.143f),
                    radius = 11.571f
                )
            ) {
                moveTo(6.25f, 5.25f)
                curveTo(6.25f, 3.828f, 7.278f, 2.5f, 8.75f, 2.5f)
                curveTo(10.222f, 2.5f, 11.25f, 3.828f, 11.25f, 5.25f)
                curveTo(11.25f, 6.672f, 10.222f, 8f, 8.75f, 8f)
                curveTo(7.278f, 8f, 6.25f, 6.672f, 6.25f, 5.25f)
                close()
                moveTo(1f, 8.75f)
                curveTo(1f, 7.328f, 2.028f, 6f, 3.5f, 6f)
                curveTo(4.972f, 6f, 6f, 7.328f, 6f, 8.75f)
                curveTo(6f, 10.172f, 4.972f, 11.5f, 3.5f, 11.5f)
                curveTo(2.028f, 11.5f, 1f, 10.172f, 1f, 8.75f)
                close()
                moveTo(12.75f, 5.25f)
                curveTo(12.75f, 3.828f, 13.778f, 2.5f, 15.25f, 2.5f)
                curveTo(16.722f, 2.5f, 17.75f, 3.828f, 17.75f, 5.25f)
                curveTo(17.75f, 6.672f, 16.722f, 8f, 15.25f, 8f)
                curveTo(13.778f, 8f, 12.75f, 6.672f, 12.75f, 5.25f)
                close()
                moveTo(18f, 8.75f)
                curveTo(18f, 7.328f, 19.028f, 6f, 20.5f, 6f)
                curveTo(21.972f, 6f, 23f, 7.328f, 23f, 8.75f)
                curveTo(23f, 10.172f, 21.972f, 11.5f, 20.5f, 11.5f)
                curveTo(19.028f, 11.5f, 18f, 10.172f, 18f, 8.75f)
                close()
            }
        }.build()

        return _Paw!!
    }

@Suppress("ObjectPropertyName")
private var _Paw: ImageVector? = null

@Preview
@Composable
private fun PawPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Paw, contentDescription = null)
    }
}
