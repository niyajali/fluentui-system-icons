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
 * LaserTool Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a pointer in presentation scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_laser_tool_20_regular.svg)
 * 
 * @return The [ImageVector] for the LaserTool icon.
 */
public val FluentIcons.Regular.LaserTool: ImageVector
    get() {
        if (_laserTool != null) {
            return _laserTool!!
        }
        _laserTool = Builder(name = "LaserTool", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 2.5f)
                curveTo(4.0f, 2.224f, 3.776f, 2.0f, 3.5f, 2.0f)
                curveTo(3.224f, 2.0f, 3.0f, 2.224f, 3.0f, 2.5f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 5.74f, 3.402f, 6.387f, 4.0f, 6.732f)
                verticalLineTo(7.5f)
                curveTo(4.0f, 8.328f, 4.672f, 9.0f, 5.5f, 9.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(12.5f)
                curveTo(9.5f, 12.776f, 9.724f, 13.0f, 10.0f, 13.0f)
                curveTo(10.276f, 13.0f, 10.5f, 12.776f, 10.5f, 12.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 9.0f, 16.0f, 8.328f, 16.0f, 7.5f)
                verticalLineTo(6.732f)
                curveTo(16.598f, 6.387f, 17.0f, 5.74f, 17.0f, 5.0f)
                verticalLineTo(2.5f)
                curveTo(17.0f, 2.224f, 16.776f, 2.0f, 16.5f, 2.0f)
                curveTo(16.224f, 2.0f, 16.0f, 2.224f, 16.0f, 2.5f)
                verticalLineTo(5.0f)
                curveTo(16.0f, 5.552f, 15.552f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 6.0f, 4.0f, 5.552f, 4.0f, 5.0f)
                verticalLineTo(2.5f)
                close()
                moveTo(5.0f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.5f)
                curveTo(15.0f, 7.776f, 14.776f, 8.0f, 14.5f, 8.0f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 8.0f, 5.0f, 7.776f, 5.0f, 7.5f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 14.0f)
                curveTo(5.224f, 14.0f, 5.0f, 14.224f, 5.0f, 14.5f)
                curveTo(5.0f, 14.776f, 5.224f, 15.0f, 5.5f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(7.276f, 15.0f, 7.5f, 14.776f, 7.5f, 14.5f)
                curveTo(7.5f, 14.224f, 7.276f, 14.0f, 7.0f, 14.0f)
                horizontalLineTo(5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 14.5f)
                curveTo(12.5f, 14.224f, 12.724f, 14.0f, 13.0f, 14.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 14.0f, 15.0f, 14.224f, 15.0f, 14.5f)
                curveTo(15.0f, 14.776f, 14.776f, 15.0f, 14.5f, 15.0f)
                horizontalLineTo(13.0f)
                curveTo(12.724f, 15.0f, 12.5f, 14.776f, 12.5f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                curveTo(10.276f, 15.0f, 10.5f, 14.776f, 10.5f, 14.5f)
                curveTo(10.5f, 14.224f, 10.276f, 14.0f, 10.0f, 14.0f)
                curveTo(9.724f, 14.0f, 9.5f, 14.224f, 9.5f, 14.5f)
                curveTo(9.5f, 14.776f, 9.724f, 15.0f, 10.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                curveTo(10.276f, 16.0f, 10.5f, 16.224f, 10.5f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(10.5f, 18.776f, 10.276f, 19.0f, 10.0f, 19.0f)
                curveTo(9.724f, 19.0f, 9.5f, 18.776f, 9.5f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(9.5f, 16.224f, 9.724f, 16.0f, 10.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.854f, 15.854f)
                curveTo(9.049f, 15.658f, 9.049f, 15.342f, 8.854f, 15.146f)
                curveTo(8.658f, 14.951f, 8.342f, 14.951f, 8.146f, 15.146f)
                lineTo(6.646f, 16.646f)
                curveTo(6.451f, 16.842f, 6.451f, 17.158f, 6.646f, 17.354f)
                curveTo(6.842f, 17.549f, 7.158f, 17.549f, 7.354f, 17.354f)
                lineTo(8.854f, 15.854f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.146f, 15.146f)
                curveTo(10.951f, 15.342f, 10.951f, 15.658f, 11.146f, 15.854f)
                lineTo(12.646f, 17.354f)
                curveTo(12.842f, 17.549f, 13.158f, 17.549f, 13.354f, 17.354f)
                curveTo(13.549f, 17.158f, 13.549f, 16.842f, 13.354f, 16.646f)
                lineTo(11.854f, 15.146f)
                curveTo(11.658f, 14.951f, 11.342f, 14.951f, 11.146f, 15.146f)
                close()
            }
        }
        .build()
        return _laserTool!!
    }

@Suppress("ObjectPropertyName")
private var _laserTool: ImageVector? = null

@Preview
@Composable
private fun LaserToolPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LaserTool, contentDescription = "LaserTool Icon")
    }
}

