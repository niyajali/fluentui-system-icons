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
 * TaskListAdd Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a checklist, goals in task oriented scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_task_list_add_24_regular.svg)
 * 
 * @return The [ImageVector] for the TaskListAdd icon.
 */
public val FluentIcons.Regular.TaskListAdd: ImageVector
    get() {
        if (_taskListAdd != null) {
            return _taskListAdd!!
        }
        _taskListAdd = Builder(name = "TaskListAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.78f, 3.78f)
                curveTo(7.073f, 3.487f, 7.073f, 3.013f, 6.78f, 2.72f)
                curveTo(6.487f, 2.427f, 6.013f, 2.427f, 5.72f, 2.72f)
                lineTo(3.75f, 4.689f)
                lineTo(3.28f, 4.22f)
                curveTo(2.987f, 3.927f, 2.513f, 3.927f, 2.22f, 4.22f)
                curveTo(1.927f, 4.513f, 1.927f, 4.987f, 2.22f, 5.28f)
                lineTo(3.22f, 6.28f)
                curveTo(3.513f, 6.573f, 3.987f, 6.573f, 4.28f, 6.28f)
                lineTo(6.78f, 3.78f)
                close()
                moveTo(11.0f, 17.5f)
                curveTo(11.0f, 17.842f, 11.026f, 18.179f, 11.078f, 18.507f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 18.507f, 9.0f, 18.171f, 9.0f, 17.757f)
                curveTo(9.0f, 17.377f, 9.282f, 17.063f, 9.648f, 17.014f)
                lineTo(9.75f, 17.007f)
                horizontalLineTo(11.018f)
                curveTo(11.006f, 17.17f, 11.0f, 17.334f, 11.0f, 17.5f)
                close()
                moveTo(17.5f, 11.0f)
                curveTo(18.774f, 11.0f, 19.963f, 11.367f, 20.966f, 12.0f)
                horizontalLineTo(21.25f)
                lineTo(21.352f, 11.993f)
                curveTo(21.718f, 11.943f, 22.0f, 11.63f, 22.0f, 11.25f)
                curveTo(22.0f, 10.836f, 21.664f, 10.5f, 21.25f, 10.5f)
                horizontalLineTo(9.75f)
                lineTo(9.648f, 10.507f)
                curveTo(9.282f, 10.557f, 9.0f, 10.87f, 9.0f, 11.25f)
                curveTo(9.0f, 11.664f, 9.336f, 12.0f, 9.75f, 12.0f)
                horizontalLineTo(14.034f)
                curveTo(15.037f, 11.367f, 16.226f, 11.0f, 17.5f, 11.0f)
                close()
                moveTo(21.25f, 4.0f)
                horizontalLineTo(9.75f)
                lineTo(9.648f, 4.007f)
                curveTo(9.282f, 4.057f, 9.0f, 4.37f, 9.0f, 4.75f)
                curveTo(9.0f, 5.164f, 9.336f, 5.5f, 9.75f, 5.5f)
                horizontalLineTo(21.25f)
                lineTo(21.352f, 5.493f)
                curveTo(21.718f, 5.443f, 22.0f, 5.13f, 22.0f, 4.75f)
                curveTo(22.0f, 4.336f, 21.664f, 4.0f, 21.25f, 4.0f)
                close()
                moveTo(6.78f, 16.78f)
                curveTo(7.073f, 16.487f, 7.073f, 16.013f, 6.78f, 15.72f)
                curveTo(6.487f, 15.427f, 6.013f, 15.427f, 5.72f, 15.72f)
                lineTo(3.75f, 17.689f)
                lineTo(3.28f, 17.22f)
                curveTo(2.987f, 16.927f, 2.513f, 16.927f, 2.22f, 17.22f)
                curveTo(1.927f, 17.513f, 1.927f, 17.987f, 2.22f, 18.28f)
                lineTo(3.22f, 19.28f)
                curveTo(3.513f, 19.573f, 3.987f, 19.573f, 4.28f, 19.28f)
                lineTo(6.78f, 16.78f)
                close()
                moveTo(6.78f, 9.22f)
                curveTo(7.073f, 9.513f, 7.073f, 9.987f, 6.78f, 10.28f)
                lineTo(4.28f, 12.78f)
                curveTo(3.987f, 13.073f, 3.513f, 13.073f, 3.22f, 12.78f)
                lineTo(2.22f, 11.78f)
                curveTo(1.927f, 11.487f, 1.927f, 11.013f, 2.22f, 10.72f)
                curveTo(2.513f, 10.427f, 2.987f, 10.427f, 3.28f, 10.72f)
                lineTo(3.75f, 11.189f)
                lineTo(5.72f, 9.22f)
                curveTo(6.013f, 8.927f, 6.487f, 8.927f, 6.78f, 9.22f)
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
        return _taskListAdd!!
    }

@Suppress("ObjectPropertyName")
private var _taskListAdd: ImageVector? = null

@Preview
@Composable
private fun TaskListAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TaskListAdd, contentDescription = "TaskListAdd Icon")
    }
}

