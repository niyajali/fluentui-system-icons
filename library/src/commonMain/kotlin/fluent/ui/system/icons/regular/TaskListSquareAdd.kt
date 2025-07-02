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
 * TaskListSquareAdd icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: task, list, square, add
 * - Source: ic_fluent_task_list_square_add_24_regular.svg
 * 
 * @return The [ImageVector] for the TaskListSquareAdd icon.
 */
public val FluentIcons.Regular.TaskListSquareAdd: ImageVector
    get() {
        if (_taskListSquareAdd != null) {
            return _taskListSquareAdd!!
        }
        _taskListSquareAdd = Builder(name = "TaskListSquareAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(12.022f)
                curveTo(11.725f, 20.537f, 11.486f, 20.034f, 11.314f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(11.314f)
                curveTo(20.034f, 11.486f, 20.537f, 11.725f, 21.0f, 12.022f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(12.5f, 9.25f)
                curveTo(12.5f, 8.836f, 12.836f, 8.5f, 13.25f, 8.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 8.5f, 17.5f, 8.836f, 17.5f, 9.25f)
                curveTo(17.5f, 9.664f, 17.164f, 10.0f, 16.75f, 10.0f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 10.0f, 12.5f, 9.664f, 12.5f, 9.25f)
                close()
                moveTo(10.78f, 8.78f)
                curveTo(11.073f, 8.487f, 11.073f, 8.013f, 10.78f, 7.72f)
                curveTo(10.487f, 7.427f, 10.013f, 7.427f, 9.72f, 7.72f)
                lineTo(8.25f, 9.189f)
                lineTo(7.78f, 8.72f)
                curveTo(7.487f, 8.427f, 7.013f, 8.427f, 6.72f, 8.72f)
                curveTo(6.427f, 9.013f, 6.427f, 9.487f, 6.72f, 9.78f)
                lineTo(7.72f, 10.78f)
                curveTo(8.013f, 11.073f, 8.487f, 11.073f, 8.78f, 10.78f)
                lineTo(10.78f, 8.78f)
                close()
                moveTo(10.78f, 13.22f)
                curveTo(11.073f, 13.513f, 11.073f, 13.987f, 10.78f, 14.28f)
                lineTo(8.78f, 16.28f)
                curveTo(8.487f, 16.573f, 8.013f, 16.573f, 7.72f, 16.28f)
                lineTo(6.72f, 15.28f)
                curveTo(6.427f, 14.987f, 6.427f, 14.513f, 6.72f, 14.22f)
                curveTo(7.013f, 13.927f, 7.487f, 13.927f, 7.78f, 14.22f)
                lineTo(8.25f, 14.689f)
                lineTo(9.72f, 13.22f)
                curveTo(10.013f, 12.927f, 10.487f, 12.927f, 10.78f, 13.22f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.462f, 20.538f, 12.0f, 17.5f, 12.0f)
                curveTo(14.462f, 12.0f, 12.0f, 14.462f, 12.0f, 17.5f)
                curveTo(12.0f, 20.538f, 14.462f, 23.0f, 17.5f, 23.0f)
                curveTo(20.538f, 23.0f, 23.0f, 20.538f, 23.0f, 17.5f)
                close()
                moveTo(18.001f, 18.0f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18.0f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18.0f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17.0f, 14.496f, 17.0f)
                horizontalLineTo(17.0f)
                lineTo(17.0f, 14.499f)
                curveTo(17.0f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18.0f, 14.223f, 18.0f, 14.499f)
                lineTo(18.0f, 17.0f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17.0f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18.0f, 20.497f, 18.0f)
                horizontalLineTo(18.001f)
                close()
            }
        }
        .build()
        return _taskListSquareAdd!!
    }

@Suppress("ObjectPropertyName")
private var _taskListSquareAdd: ImageVector? = null

@Preview
@Composable
private fun TaskListSquareAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TaskListSquareAdd, contentDescription = null)
    }
}

