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
 * ArrowEnter Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in UI to map experiences together in a flow chart.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_enter_20_regular.svg)
 * 
 * @return The [ImageVector] for the ArrowEnter icon.
 */
public val FluentIcons.Regular.ArrowEnter: ImageVector
    get() {
        if (_arrowEnter != null) {
            return _arrowEnter!!
        }
        _arrowEnter = Builder(name = "ArrowEnter", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 17.0f)
                curveTo(7.224f, 17.0f, 7.0f, 16.776f, 7.0f, 16.5f)
                curveTo(7.0f, 16.224f, 7.224f, 16.0f, 7.5f, 16.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 16.0f, 16.0f, 15.105f, 16.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(16.0f, 4.895f, 15.105f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 4.0f, 7.0f, 3.776f, 7.0f, 3.5f)
                curveTo(7.0f, 3.224f, 7.224f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 3.0f, 17.0f, 4.343f, 17.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 15.657f, 15.657f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(7.646f, 6.146f)
                curveTo(7.842f, 5.951f, 8.158f, 5.951f, 8.354f, 6.146f)
                lineTo(11.854f, 9.646f)
                curveTo(12.049f, 9.842f, 12.049f, 10.158f, 11.854f, 10.354f)
                lineTo(8.354f, 13.854f)
                curveTo(8.158f, 14.049f, 7.842f, 14.049f, 7.646f, 13.854f)
                curveTo(7.451f, 13.658f, 7.451f, 13.342f, 7.646f, 13.146f)
                lineTo(10.293f, 10.5f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 10.5f, 1.0f, 10.276f, 1.0f, 10.0f)
                curveTo(1.0f, 9.724f, 1.224f, 9.5f, 1.5f, 9.5f)
                horizontalLineTo(10.293f)
                lineTo(7.646f, 6.854f)
                curveTo(7.451f, 6.658f, 7.451f, 6.342f, 7.646f, 6.146f)
                close()
            }
        }
        .build()
        return _arrowEnter!!
    }

@Suppress("ObjectPropertyName")
private var _arrowEnter: ImageVector? = null

@Preview
@Composable
private fun ArrowEnterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowEnter, contentDescription = "ArrowEnter Icon")
    }
}

