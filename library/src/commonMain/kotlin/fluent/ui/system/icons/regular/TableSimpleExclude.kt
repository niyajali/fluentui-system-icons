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
 * TableSimpleExclude Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent placement of user video in meeting.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_simple_exclude_24_regular.svg)
 * 
 * @return The [ImageVector] for the TableSimpleExclude icon.
 */
public val FluentIcons.Regular.TableSimpleExclude: ImageVector
    get() {
        if (_tableSimpleExclude != null) {
            return _tableSimpleExclude!!
        }
        _tableSimpleExclude = Builder(name = "TableSimpleExclude", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 3.455f, 3.455f, 2.0f, 5.25f, 2.0f)
                horizontalLineTo(15.25f)
                curveTo(17.045f, 2.0f, 18.5f, 3.455f, 18.5f, 5.25f)
                verticalLineTo(10.0f)
                curveTo(18.5f, 10.552f, 18.052f, 11.0f, 17.5f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.5f)
                curveTo(11.0f, 18.052f, 10.552f, 18.5f, 10.0f, 18.5f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 18.5f, 2.0f, 17.045f, 2.0f, 15.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(17.0f, 5.25f)
                curveTo(17.0f, 4.284f, 16.216f, 3.5f, 15.25f, 3.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.25f)
                close()
                moveTo(9.5f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(3.5f, 15.25f)
                curveTo(3.5f, 16.216f, 4.284f, 17.0f, 5.25f, 17.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(15.25f)
                close()
                moveTo(12.5f, 14.75f)
                curveTo(12.5f, 13.507f, 13.507f, 12.5f, 14.75f, 12.5f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 12.5f, 22.0f, 13.507f, 22.0f, 14.75f)
                verticalLineTo(19.75f)
                curveTo(22.0f, 20.993f, 20.993f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(14.75f)
                curveTo(13.507f, 22.0f, 12.5f, 20.993f, 12.5f, 19.75f)
                verticalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _tableSimpleExclude!!
    }

@Suppress("ObjectPropertyName")
private var _tableSimpleExclude: ImageVector? = null

@Preview
@Composable
private fun TableSimpleExcludePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableSimpleExclude, contentDescription = "TableSimpleExclude Icon")
    }
}

