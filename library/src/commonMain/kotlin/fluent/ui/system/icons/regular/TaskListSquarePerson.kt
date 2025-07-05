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
 * TaskListSquarePerson Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a checklist, goals in task oriented scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_task_list_square_person_20_regular.svg)
 * 
 * @return The [ImageVector] for the TaskListSquarePerson icon.
 */
public val FluentIcons.Regular.TaskListSquarePerson: ImageVector
    get() {
        if (_taskListSquarePerson != null) {
            return _taskListSquarePerson!!
        }
        _taskListSquarePerson = Builder(name = "TaskListSquarePerson", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.354f, 7.104f)
                curveTo(9.549f, 6.908f, 9.549f, 6.592f, 9.354f, 6.396f)
                curveTo(9.158f, 6.201f, 8.842f, 6.201f, 8.646f, 6.396f)
                lineTo(7.234f, 7.808f)
                lineTo(6.837f, 7.446f)
                curveTo(6.633f, 7.26f, 6.317f, 7.274f, 6.131f, 7.478f)
                curveTo(5.945f, 7.682f, 5.959f, 7.998f, 6.163f, 8.184f)
                lineTo(6.913f, 8.869f)
                curveTo(7.11f, 9.049f, 7.415f, 9.043f, 7.604f, 8.853f)
                lineTo(9.354f, 7.104f)
                close()
                moveTo(9.354f, 11.396f)
                curveTo(9.549f, 11.592f, 9.549f, 11.908f, 9.354f, 12.104f)
                lineTo(7.604f, 13.854f)
                curveTo(7.415f, 14.042f, 7.11f, 14.049f, 6.913f, 13.869f)
                lineTo(6.163f, 13.184f)
                curveTo(5.959f, 12.998f, 5.945f, 12.682f, 6.131f, 12.478f)
                curveTo(6.317f, 12.274f, 6.633f, 12.259f, 6.837f, 12.446f)
                lineTo(7.234f, 12.809f)
                lineTo(8.646f, 11.396f)
                curveTo(8.842f, 11.201f, 9.158f, 11.201f, 9.354f, 11.396f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(10.724f, 12.0f, 10.5f, 12.224f, 10.5f, 12.5f)
                curveTo(10.5f, 12.776f, 10.724f, 13.0f, 11.0f, 13.0f)
                horizontalLineTo(12.671f)
                curveTo(12.56f, 12.687f, 12.5f, 12.351f, 12.5f, 12.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(6.0f, 16.0f)
                horizontalLineTo(11.05f)
                curveTo(11.017f, 16.162f, 11.0f, 16.329f, 11.0f, 16.5f)
                curveTo(11.0f, 16.667f, 11.013f, 16.834f, 11.038f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 17.0f, 3.0f, 15.657f, 3.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 3.0f, 17.0f, 4.343f, 17.0f, 6.0f)
                verticalLineTo(9.401f)
                curveTo(16.696f, 9.226f, 16.359f, 9.102f, 16.0f, 9.041f)
                verticalLineTo(6.0f)
                curveTo(16.0f, 4.895f, 15.105f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 4.0f, 4.0f, 4.895f, 4.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 15.105f, 4.895f, 16.0f, 6.0f, 16.0f)
                close()
                moveTo(10.5f, 7.5f)
                curveTo(10.5f, 7.224f, 10.724f, 7.0f, 11.0f, 7.0f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 7.0f, 14.0f, 7.224f, 14.0f, 7.5f)
                curveTo(14.0f, 7.776f, 13.776f, 8.0f, 13.5f, 8.0f)
                horizontalLineTo(11.0f)
                curveTo(10.724f, 8.0f, 10.5f, 7.776f, 10.5f, 7.5f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(17.5f, 13.105f, 16.605f, 14.0f, 15.5f, 14.0f)
                curveTo(14.395f, 14.0f, 13.5f, 13.105f, 13.5f, 12.0f)
                curveTo(13.5f, 10.895f, 14.395f, 10.0f, 15.5f, 10.0f)
                curveTo(16.605f, 10.0f, 17.5f, 10.895f, 17.5f, 12.0f)
                close()
                moveTo(19.0f, 16.5f)
                curveTo(19.0f, 17.745f, 18.0f, 19.0f, 15.5f, 19.0f)
                curveTo(13.0f, 19.0f, 12.0f, 17.75f, 12.0f, 16.5f)
                curveTo(12.0f, 15.672f, 12.672f, 15.0f, 13.5f, 15.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 15.0f, 19.0f, 15.672f, 19.0f, 16.5f)
                close()
            }
        }
        .build()
        return _taskListSquarePerson!!
    }

@Suppress("ObjectPropertyName")
private var _taskListSquarePerson: ImageVector? = null

@Preview
@Composable
private fun TaskListSquarePersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TaskListSquarePerson, contentDescription = "TaskListSquarePerson Icon")
    }
}

