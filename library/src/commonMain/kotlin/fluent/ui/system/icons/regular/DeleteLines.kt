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
 * DeleteLines icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: delete, lines
 * - Source: ic_fluent_delete_lines_20_regular.svg
 * 
 * @return The [ImageVector] for the DeleteLines icon.
 */
public val FluentIcons.Regular.DeleteLines: ImageVector
    get() {
        if (_deleteLines != null) {
            return _deleteLines!!
        }
        _deleteLines = Builder(name = "DeleteLines", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 4.0f)
                curveTo(11.5f, 3.172f, 10.828f, 2.5f, 10.0f, 2.5f)
                curveTo(9.172f, 2.5f, 8.5f, 3.172f, 8.5f, 4.0f)
                horizontalLineTo(11.5f)
                close()
                moveTo(7.5f, 4.0f)
                curveTo(7.5f, 2.619f, 8.619f, 1.5f, 10.0f, 1.5f)
                curveTo(11.381f, 1.5f, 12.5f, 2.619f, 12.5f, 4.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 4.0f, 18.0f, 4.224f, 18.0f, 4.5f)
                curveTo(18.0f, 4.776f, 17.776f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(16.446f)
                lineTo(15.638f, 12.0f)
                horizontalLineTo(14.631f)
                lineTo(15.439f, 5.0f)
                horizontalLineTo(4.561f)
                lineTo(5.741f, 15.229f)
                curveTo(5.858f, 16.238f, 6.712f, 17.0f, 7.728f, 17.0f)
                horizontalLineTo(10.085f)
                curveTo(10.03f, 17.156f, 10.0f, 17.325f, 10.0f, 17.5f)
                curveTo(10.0f, 17.675f, 10.03f, 17.844f, 10.085f, 18.0f)
                horizontalLineTo(7.728f)
                curveTo(6.204f, 18.0f, 4.923f, 16.858f, 4.748f, 15.344f)
                lineTo(3.554f, 5.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 5.0f, 2.0f, 4.776f, 2.0f, 4.5f)
                curveTo(2.0f, 4.224f, 2.224f, 4.0f, 2.5f, 4.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(11.5f, 13.0f)
                curveTo(11.224f, 13.0f, 11.0f, 13.224f, 11.0f, 13.5f)
                curveTo(11.0f, 13.776f, 11.224f, 14.0f, 11.5f, 14.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 14.0f, 18.0f, 13.776f, 18.0f, 13.5f)
                curveTo(18.0f, 13.224f, 17.776f, 13.0f, 17.5f, 13.0f)
                horizontalLineTo(11.5f)
                close()
                moveTo(11.5f, 15.0f)
                curveTo(11.224f, 15.0f, 11.0f, 15.224f, 11.0f, 15.5f)
                curveTo(11.0f, 15.776f, 11.224f, 16.0f, 11.5f, 16.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 16.0f, 18.0f, 15.776f, 18.0f, 15.5f)
                curveTo(18.0f, 15.224f, 17.776f, 15.0f, 17.5f, 15.0f)
                horizontalLineTo(11.5f)
                close()
                moveTo(11.5f, 17.0f)
                curveTo(11.224f, 17.0f, 11.0f, 17.224f, 11.0f, 17.5f)
                curveTo(11.0f, 17.776f, 11.224f, 18.0f, 11.5f, 18.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 18.0f, 18.0f, 17.776f, 18.0f, 17.5f)
                curveTo(18.0f, 17.224f, 17.776f, 17.0f, 17.5f, 17.0f)
                horizontalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _deleteLines!!
    }

@Suppress("ObjectPropertyName")
private var _deleteLines: ImageVector? = null

@Preview
@Composable
private fun DeleteLinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DeleteLines, contentDescription = null)
    }
}

