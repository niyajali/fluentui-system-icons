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
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Play: ImageVector
    get() {
        if (_Play != null) {
            return _Play!!
        }
        _Play = ImageVector.Builder(
            name = "Regular.Play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.608f, 4.615f)
                curveTo(7.109f, 4.343f, 6.5f, 4.705f, 6.5f, 5.274f)
                verticalLineTo(18.726f)
                curveTo(6.5f, 19.295f, 7.109f, 19.657f, 7.608f, 19.385f)
                lineTo(19.97f, 12.659f)
                curveTo(20.492f, 12.375f, 20.492f, 11.625f, 19.97f, 11.341f)
                lineTo(7.608f, 4.615f)
                close()
                moveTo(5f, 5.274f)
                curveTo(5f, 3.567f, 6.826f, 2.482f, 8.325f, 3.297f)
                lineTo(20.687f, 10.024f)
                curveTo(22.253f, 10.876f, 22.253f, 13.124f, 20.687f, 13.976f)
                lineTo(8.325f, 20.702f)
                curveTo(6.826f, 21.518f, 5f, 20.433f, 5f, 18.726f)
                verticalLineTo(5.274f)
                close()
            }
        }.build()

        return _Play!!
    }

@Suppress("ObjectPropertyName")
private var _Play: ImageVector? = null

@Preview
@Composable
private fun PlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Play, contentDescription = null)
    }
}
