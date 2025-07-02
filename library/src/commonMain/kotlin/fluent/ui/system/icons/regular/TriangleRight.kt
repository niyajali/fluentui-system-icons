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
 * TriangleRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: triangle, right
 * - Source: ic_fluent_triangle_right_20_regular.svg
 * 
 * @return The [ImageVector] for the TriangleRight icon.
 */
public val FluentIcons.Regular.TriangleRight: ImageVector
    get() {
        if (_triangleRight != null) {
            return _triangleRight!!
        }
        _triangleRight = Builder(name = "TriangleRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.215f, 11.318f)
                curveTo(18.262f, 10.751f, 18.262f, 9.248f, 17.215f, 8.68f)
                lineTo(5.216f, 2.181f)
                curveTo(4.217f, 1.64f, 3.002f, 2.363f, 3.002f, 3.5f)
                verticalLineTo(16.499f)
                curveTo(3.002f, 17.635f, 4.217f, 18.359f, 5.216f, 17.818f)
                lineTo(17.215f, 11.318f)
                close()
                moveTo(16.739f, 9.56f)
                curveTo(17.088f, 9.749f, 17.088f, 10.25f, 16.739f, 10.439f)
                lineTo(4.74f, 16.938f)
                curveTo(4.407f, 17.119f, 4.002f, 16.878f, 4.002f, 16.499f)
                verticalLineTo(3.5f)
                curveTo(4.002f, 3.121f, 4.407f, 2.88f, 4.74f, 3.06f)
                lineTo(16.739f, 9.56f)
                close()
            }
        }
        .build()
        return _triangleRight!!
    }

@Suppress("ObjectPropertyName")
private var _triangleRight: ImageVector? = null

@Preview
@Composable
private fun TriangleRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TriangleRight, contentDescription = null)
    }
}

