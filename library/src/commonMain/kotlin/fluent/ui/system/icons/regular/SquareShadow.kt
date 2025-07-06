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
 * SquareShadow Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general UI, app tile, content or other general layouts.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_square_shadow_20_regular.svg)
 * 
 * @return The [ImageVector] for the SquareShadow icon.
 */
public val FluentIcons.Regular.SquareShadow: ImageVector
    get() {
        if (_squareShadow != null) {
            return _squareShadow!!
        }
        _squareShadow = Builder(name = "SquareShadow", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 2.0f)
                curveTo(3.119f, 2.0f, 2.0f, 3.119f, 2.0f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(2.0f, 12.881f, 3.119f, 14.0f, 4.5f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.5f)
                curveTo(6.0f, 16.881f, 7.119f, 18.0f, 8.5f, 18.0f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 18.0f, 18.0f, 16.881f, 18.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(18.0f, 7.119f, 16.881f, 6.0f, 15.5f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                curveTo(14.0f, 3.119f, 12.881f, 2.0f, 11.5f, 2.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(3.0f, 4.5f)
                curveTo(3.0f, 3.672f, 3.672f, 3.0f, 4.5f, 3.0f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 3.0f, 13.0f, 3.672f, 13.0f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(13.0f, 12.328f, 12.328f, 13.0f, 11.5f, 13.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 13.0f, 3.0f, 12.328f, 3.0f, 11.5f)
                verticalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _squareShadow!!
    }

@Suppress("ObjectPropertyName")
private var _squareShadow: ImageVector? = null

@Preview
@Composable
private fun SquareShadowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SquareShadow, contentDescription = "SquareShadow Icon")
    }
}

