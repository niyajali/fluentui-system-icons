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
 * TaskListLtr icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Direction: LTR
 * - Keywords: task, list, ltr
 * - Source: ic_fluent_task_list_24_regular_ltr.svg
 * 
 * @return The [ImageVector] for the TaskListLtr icon.
 */
public val FluentIcons.Regular.TaskListLtr: ImageVector
    get() {
        if (_taskListLtr != null) {
            return _taskListLtr!!
        }
        _taskListLtr = Builder(name = "TaskListLtr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.78f, 4.78f)
                curveTo(7.073f, 4.487f, 7.073f, 4.013f, 6.78f, 3.72f)
                curveTo(6.487f, 3.427f, 6.013f, 3.427f, 5.72f, 3.72f)
                lineTo(3.75f, 5.689f)
                lineTo(3.28f, 5.22f)
                curveTo(2.987f, 4.927f, 2.513f, 4.927f, 2.22f, 5.22f)
                curveTo(1.927f, 5.513f, 1.927f, 5.987f, 2.22f, 6.28f)
                lineTo(3.22f, 7.28f)
                curveTo(3.513f, 7.573f, 3.987f, 7.573f, 4.28f, 7.28f)
                lineTo(6.78f, 4.78f)
                close()
                moveTo(21.25f, 18.007f)
                horizontalLineTo(9.75f)
                lineTo(9.648f, 18.014f)
                curveTo(9.282f, 18.063f, 9.0f, 18.377f, 9.0f, 18.757f)
                curveTo(9.0f, 19.171f, 9.336f, 19.507f, 9.75f, 19.507f)
                horizontalLineTo(21.25f)
                lineTo(21.352f, 19.5f)
                curveTo(21.718f, 19.45f, 22.0f, 19.136f, 22.0f, 18.757f)
                curveTo(22.0f, 18.343f, 21.664f, 18.007f, 21.25f, 18.007f)
                close()
                moveTo(21.25f, 11.5f)
                horizontalLineTo(9.75f)
                lineTo(9.648f, 11.507f)
                curveTo(9.282f, 11.557f, 9.0f, 11.87f, 9.0f, 12.25f)
                curveTo(9.0f, 12.664f, 9.336f, 13.0f, 9.75f, 13.0f)
                horizontalLineTo(21.25f)
                lineTo(21.352f, 12.993f)
                curveTo(21.718f, 12.943f, 22.0f, 12.63f, 22.0f, 12.25f)
                curveTo(22.0f, 11.836f, 21.664f, 11.5f, 21.25f, 11.5f)
                close()
                moveTo(21.25f, 5.0f)
                horizontalLineTo(9.75f)
                lineTo(9.648f, 5.007f)
                curveTo(9.282f, 5.057f, 9.0f, 5.37f, 9.0f, 5.75f)
                curveTo(9.0f, 6.164f, 9.336f, 6.5f, 9.75f, 6.5f)
                horizontalLineTo(21.25f)
                lineTo(21.352f, 6.493f)
                curveTo(21.718f, 6.443f, 22.0f, 6.13f, 22.0f, 5.75f)
                curveTo(22.0f, 5.336f, 21.664f, 5.0f, 21.25f, 5.0f)
                close()
                moveTo(6.78f, 17.78f)
                curveTo(7.073f, 17.487f, 7.073f, 17.013f, 6.78f, 16.72f)
                curveTo(6.487f, 16.427f, 6.013f, 16.427f, 5.72f, 16.72f)
                lineTo(3.75f, 18.689f)
                lineTo(3.28f, 18.22f)
                curveTo(2.987f, 17.927f, 2.513f, 17.927f, 2.22f, 18.22f)
                curveTo(1.927f, 18.513f, 1.927f, 18.987f, 2.22f, 19.28f)
                lineTo(3.22f, 20.28f)
                curveTo(3.513f, 20.573f, 3.987f, 20.573f, 4.28f, 20.28f)
                lineTo(6.78f, 17.78f)
                close()
                moveTo(6.78f, 10.22f)
                curveTo(7.073f, 10.513f, 7.073f, 10.987f, 6.78f, 11.28f)
                lineTo(4.28f, 13.78f)
                curveTo(3.987f, 14.073f, 3.513f, 14.073f, 3.22f, 13.78f)
                lineTo(2.22f, 12.78f)
                curveTo(1.927f, 12.487f, 1.927f, 12.013f, 2.22f, 11.72f)
                curveTo(2.513f, 11.427f, 2.987f, 11.427f, 3.28f, 11.72f)
                lineTo(3.75f, 12.189f)
                lineTo(5.72f, 10.22f)
                curveTo(6.013f, 9.927f, 6.487f, 9.927f, 6.78f, 10.22f)
                close()
            }
        }
        .build()
        return _taskListLtr!!
    }

@Suppress("ObjectPropertyName")
private var _taskListLtr: ImageVector? = null

@Preview
@Composable
private fun TaskListLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TaskListLtr, contentDescription = null)
    }
}

