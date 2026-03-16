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
 * Balcony Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a balcony.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_balcony_20_filled.svg)
 * 
 * @return The [ImageVector] for the Balcony icon.
 */
public val FluentIcons.Filled.Balcony: ImageVector
    get() {
        if (_balcony != null) {
            return _balcony!!
        }
        _balcony = Builder(name = "Balcony", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.601f, 8.01f)
                curveTo(17.829f, 8.056f, 18.0f, 8.258f, 18.0f, 8.5f)
                curveTo(18.0f, 8.742f, 17.829f, 8.944f, 17.601f, 8.99f)
                lineTo(17.5f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 15.657f, 15.657f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 17.0f, 3.0f, 15.657f, 3.0f, 14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 9.0f, 2.0f, 8.776f, 2.0f, 8.5f)
                curveTo(2.0f, 8.224f, 2.224f, 8.0f, 2.5f, 8.0f)
                horizontalLineTo(17.5f)
                lineTo(17.601f, 8.01f)
                close()
                moveTo(14.0f, 14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(10.5f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(13.657f, 2.0f, 15.0f, 3.343f, 15.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 3.343f, 6.343f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _balcony!!
    }

@Suppress("ObjectPropertyName")
private var _balcony: ImageVector? = null

@Preview
@Composable
private fun BalconyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Balcony, contentDescription = "Balcony Icon")
    }
}

