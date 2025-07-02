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
 * LaserTool icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: laser, tool
 * - Source: ic_fluent_laser_tool_20_filled.svg
 * 
 * @return The [ImageVector] for the LaserTool icon.
 */
public val FluentIcons.Filled.LaserTool: ImageVector
    get() {
        if (_laserTool != null) {
            return _laserTool!!
        }
        _laserTool = Builder(name = "LaserTool", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 2.0f)
                curveTo(3.224f, 2.0f, 3.0f, 2.224f, 3.0f, 2.5f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 5.749f, 3.412f, 6.402f, 4.022f, 6.745f)
                curveTo(4.03f, 6.749f, 4.038f, 6.754f, 4.047f, 6.759f)
                curveTo(4.33f, 6.913f, 4.655f, 7.0f, 5.0f, 7.0f)
                horizontalLineTo(15.0f)
                curveTo(15.355f, 7.0f, 15.689f, 6.907f, 15.978f, 6.745f)
                curveTo(16.588f, 6.402f, 17.0f, 5.749f, 17.0f, 5.0f)
                verticalLineTo(2.5f)
                curveTo(17.0f, 2.224f, 16.776f, 2.0f, 16.5f, 2.0f)
                horizontalLineTo(3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 10.0f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 10.0f, 16.0f, 9.328f, 16.0f, 8.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.5f)
                curveTo(4.0f, 9.328f, 4.672f, 10.0f, 5.5f, 10.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(12.5f)
                curveTo(9.5f, 12.776f, 9.724f, 13.0f, 10.0f, 13.0f)
                curveTo(10.276f, 13.0f, 10.5f, 12.776f, 10.5f, 12.5f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 14.5f)
                curveTo(5.0f, 14.224f, 5.224f, 14.0f, 5.5f, 14.0f)
                horizontalLineTo(7.0f)
                curveTo(7.276f, 14.0f, 7.5f, 14.224f, 7.5f, 14.5f)
                curveTo(7.5f, 14.776f, 7.276f, 15.0f, 7.0f, 15.0f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 15.0f, 5.0f, 14.776f, 5.0f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                curveTo(12.724f, 14.0f, 12.5f, 14.224f, 12.5f, 14.5f)
                curveTo(12.5f, 14.776f, 12.724f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 15.0f, 15.0f, 14.776f, 15.0f, 14.5f)
                curveTo(15.0f, 14.224f, 14.776f, 14.0f, 14.5f, 14.0f)
                horizontalLineTo(13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 14.5f)
                curveTo(10.5f, 14.776f, 10.276f, 15.0f, 10.0f, 15.0f)
                curveTo(9.724f, 15.0f, 9.5f, 14.776f, 9.5f, 14.5f)
                curveTo(9.5f, 14.224f, 9.724f, 14.0f, 10.0f, 14.0f)
                curveTo(10.276f, 14.0f, 10.5f, 14.224f, 10.5f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 16.5f)
                curveTo(10.5f, 16.224f, 10.276f, 16.0f, 10.0f, 16.0f)
                curveTo(9.724f, 16.0f, 9.5f, 16.224f, 9.5f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(9.5f, 18.776f, 9.724f, 19.0f, 10.0f, 19.0f)
                curveTo(10.276f, 19.0f, 10.5f, 18.776f, 10.5f, 18.5f)
                verticalLineTo(16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.854f, 15.146f)
                curveTo(9.049f, 15.342f, 9.049f, 15.658f, 8.854f, 15.854f)
                lineTo(7.354f, 17.354f)
                curveTo(7.158f, 17.549f, 6.842f, 17.549f, 6.646f, 17.354f)
                curveTo(6.451f, 17.158f, 6.451f, 16.842f, 6.646f, 16.646f)
                lineTo(8.146f, 15.146f)
                curveTo(8.342f, 14.951f, 8.658f, 14.951f, 8.854f, 15.146f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.146f, 15.854f)
                curveTo(10.951f, 15.658f, 10.951f, 15.342f, 11.146f, 15.146f)
                curveTo(11.342f, 14.951f, 11.658f, 14.951f, 11.854f, 15.146f)
                lineTo(13.354f, 16.646f)
                curveTo(13.549f, 16.842f, 13.549f, 17.158f, 13.354f, 17.354f)
                curveTo(13.158f, 17.549f, 12.842f, 17.549f, 12.646f, 17.354f)
                lineTo(11.146f, 15.854f)
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
        Image(imageVector = FluentIcons.Filled.LaserTool, contentDescription = null)
    }
}

