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

public val FluentIcons.Colored.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Colored.Star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF6F47),
                        1f to Color(0xFFFFCD0F)
                    ),
                    start = Offset(21.994f, 21.928f),
                    end = Offset(1.427f, 2.53f)
                )
            ) {
                moveTo(10.788f, 3.103f)
                curveTo(11.283f, 2.099f, 12.714f, 2.099f, 13.209f, 3.103f)
                lineTo(15.567f, 7.88f)
                lineTo(20.84f, 8.646f)
                curveTo(21.947f, 8.807f, 22.389f, 10.168f, 21.588f, 10.949f)
                lineTo(17.772f, 14.668f)
                lineTo(18.673f, 19.919f)
                curveTo(18.862f, 21.022f, 17.705f, 21.863f, 16.714f, 21.343f)
                lineTo(11.998f, 18.863f)
                lineTo(7.283f, 21.343f)
                curveTo(6.292f, 21.863f, 5.135f, 21.022f, 5.324f, 19.919f)
                lineTo(6.224f, 14.668f)
                lineTo(2.409f, 10.949f)
                curveTo(1.608f, 10.168f, 2.05f, 8.807f, 3.157f, 8.646f)
                lineTo(8.43f, 7.88f)
                lineTo(10.788f, 3.103f)
                close()
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null

@Preview
@Composable
private fun StarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Star, contentDescription = null)
    }
}
