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
 * LayoutAddAbove Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, vscode
 * - Description: Used to represent UI layouts.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_layout_add_above_24_regular.svg)
 * 
 * @return The [ImageVector] for the LayoutAddAbove icon.
 */
public val FluentIcons.Regular.LayoutAddAbove: ImageVector
    get() {
        if (_layoutAddAbove != null) {
            return _layoutAddAbove!!
        }
        _layoutAddAbove = Builder(name = "LayoutAddAbove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.25f, 9.0f)
                curveTo(20.664f, 9.0f, 21.0f, 9.336f, 21.0f, 9.75f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(9.75f)
                curveTo(3.0f, 9.336f, 3.336f, 9.0f, 3.75f, 9.0f)
                horizontalLineTo(20.25f)
                close()
                moveTo(4.5f, 17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                close()
                moveTo(20.25f, 3.0f)
                curveTo(20.664f, 3.0f, 21.0f, 3.336f, 21.0f, 3.75f)
                curveTo(21.0f, 4.164f, 20.664f, 4.5f, 20.25f, 4.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 4.5f, 3.0f, 4.164f, 3.0f, 3.75f)
                curveTo(3.0f, 3.336f, 3.336f, 3.0f, 3.75f, 3.0f)
                horizontalLineTo(20.25f)
                close()
            }
        }
        .build()
        return _layoutAddAbove!!
    }

@Suppress("ObjectPropertyName")
private var _layoutAddAbove: ImageVector? = null

@Preview
@Composable
private fun LayoutAddAbovePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LayoutAddAbove, contentDescription = "LayoutAddAbove Icon")
    }
}

