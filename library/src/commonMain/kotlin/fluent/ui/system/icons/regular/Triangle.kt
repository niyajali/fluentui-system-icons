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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Triangle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: triangle
 * - Source: ic_fluent_triangle_24_regular.svg
 * 
 * @return The [ImageVector] for the Triangle icon.
 */
public val FluentIcons.Regular.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.302f, 16.631f)
                curveTo(1.441f, 18.131f, 2.524f, 20.0f, 4.253f, 20.0f)
                horizontalLineTo(19.742f)
                curveTo(21.472f, 20.0f, 22.555f, 18.131f, 21.694f, 16.631f)
                lineTo(13.95f, 3.128f)
                curveTo(13.085f, 1.621f, 10.911f, 1.621f, 10.046f, 3.128f)
                lineTo(2.302f, 16.631f)
                close()
                moveTo(4.253f, 18.5f)
                curveTo(3.677f, 18.5f, 3.316f, 17.877f, 3.603f, 17.377f)
                lineTo(11.347f, 3.875f)
                curveTo(11.635f, 3.372f, 12.36f, 3.372f, 12.648f, 3.875f)
                lineTo(20.393f, 17.377f)
                curveTo(20.68f, 17.877f, 20.319f, 18.5f, 19.742f, 18.5f)
                horizontalLineTo(4.253f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

@Suppress("ObjectPropertyName")
private var _triangle: ImageVector? = null

@Preview
@Composable
private fun TrianglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Triangle, contentDescription = null)
    }
}

