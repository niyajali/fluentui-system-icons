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

package fluent.ui.system.icons.filled

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
 * Person6 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: person6
 * - Source: ic_fluent_person_6_20_filled.svg
 * 
 * @return The [ImageVector] for the Person6 icon.
 */
public val FluentIcons.Filled.Person6: ImageVector
    get() {
        if (_person6 != null) {
            return _person6!!
        }
        _person6 = Builder(name = "Person6", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                curveTo(6.0f, 3.791f, 7.791f, 2.0f, 10.0f, 2.0f)
                curveTo(12.209f, 2.0f, 14.0f, 3.791f, 14.0f, 6.0f)
                curveTo(14.0f, 8.209f, 12.209f, 10.0f, 10.0f, 10.0f)
                curveTo(7.791f, 10.0f, 6.0f, 8.209f, 6.0f, 6.0f)
                close()
                moveTo(3.0f, 13.0f)
                curveTo(3.0f, 11.887f, 3.903f, 11.0f, 5.009f, 11.0f)
                lineTo(14.05f, 11.0f)
                curveTo(13.402f, 11.635f, 13.0f, 12.521f, 13.0f, 13.5f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 16.871f, 13.058f, 17.228f, 13.165f, 17.564f)
                curveTo(12.204f, 17.858f, 11.125f, 18.0f, 10.0f, 18.0f)
                curveTo(8.145f, 18.0f, 6.417f, 17.614f, 5.135f, 16.797f)
                curveTo(3.833f, 15.966f, 3.0f, 14.691f, 3.0f, 13.0f)
                close()
                moveTo(15.0f, 13.5f)
                curveTo(15.0f, 12.672f, 15.672f, 12.0f, 16.5f, 12.0f)
                curveTo(16.948f, 12.0f, 17.35f, 12.196f, 17.625f, 12.508f)
                curveTo(17.808f, 12.715f, 18.124f, 12.735f, 18.331f, 12.552f)
                curveTo(18.538f, 12.369f, 18.558f, 12.053f, 18.375f, 11.846f)
                curveTo(17.917f, 11.328f, 17.247f, 11.0f, 16.5f, 11.0f)
                curveTo(15.119f, 11.0f, 14.0f, 12.119f, 14.0f, 13.5f)
                verticalLineTo(16.5f)
                curveTo(14.0f, 17.881f, 15.119f, 19.0f, 16.5f, 19.0f)
                curveTo(17.881f, 19.0f, 19.0f, 17.881f, 19.0f, 16.5f)
                curveTo(19.0f, 15.119f, 17.881f, 14.0f, 16.5f, 14.0f)
                curveTo(15.937f, 14.0f, 15.418f, 14.186f, 15.0f, 14.5f)
                verticalLineTo(13.5f)
                close()
                moveTo(16.5f, 18.0f)
                curveTo(15.672f, 18.0f, 15.0f, 17.328f, 15.0f, 16.5f)
                curveTo(15.0f, 15.672f, 15.672f, 15.0f, 16.5f, 15.0f)
                curveTo(17.328f, 15.0f, 18.0f, 15.672f, 18.0f, 16.5f)
                curveTo(18.0f, 17.328f, 17.328f, 18.0f, 16.5f, 18.0f)
                close()
            }
        }
        .build()
        return _person6!!
    }

@Suppress("ObjectPropertyName")
private var _person6: ImageVector? = null

@Preview
@Composable
private fun Person6Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Person6, contentDescription = null)
    }
}

