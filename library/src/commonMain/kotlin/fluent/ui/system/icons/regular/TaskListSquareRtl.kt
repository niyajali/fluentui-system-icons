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
 * TaskListSquareRtl Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Direction: RTL
 * - Keywords: fluent-icon
 * - Description: Used to represent a checklist, goals in task oriented scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_task_list_square_24_regular_rtl.svg)
 * 
 * @return The [ImageVector] for the TaskListSquareRtl icon.
 */
public val FluentIcons.Regular.TaskListSquareRtl: ImageVector
    get() {
        if (_taskListSquareRtl != null) {
            return _taskListSquareRtl!!
        }
        _taskListSquareRtl = Builder(name = "TaskListSquareRtl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.25f, 14.0f)
                curveTo(6.836f, 14.0f, 6.5f, 14.336f, 6.5f, 14.75f)
                curveTo(6.5f, 15.164f, 6.836f, 15.5f, 7.25f, 15.5f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 15.5f, 11.5f, 15.164f, 11.5f, 14.75f)
                curveTo(11.5f, 14.336f, 11.164f, 14.0f, 10.75f, 14.0f)
                horizontalLineTo(7.25f)
                close()
                moveTo(6.5f, 9.25f)
                curveTo(6.5f, 8.836f, 6.836f, 8.5f, 7.25f, 8.5f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 8.5f, 11.5f, 8.836f, 11.5f, 9.25f)
                curveTo(11.5f, 9.664f, 11.164f, 10.0f, 10.75f, 10.0f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 10.0f, 6.5f, 9.664f, 6.5f, 9.25f)
                close()
                moveTo(17.78f, 8.78f)
                curveTo(18.073f, 8.487f, 18.073f, 8.013f, 17.78f, 7.72f)
                curveTo(17.487f, 7.427f, 17.013f, 7.427f, 16.72f, 7.72f)
                lineTo(15.25f, 9.189f)
                lineTo(14.78f, 8.72f)
                curveTo(14.487f, 8.427f, 14.013f, 8.427f, 13.72f, 8.72f)
                curveTo(13.427f, 9.013f, 13.427f, 9.487f, 13.72f, 9.78f)
                lineTo(14.72f, 10.78f)
                curveTo(15.013f, 11.073f, 15.487f, 11.073f, 15.78f, 10.78f)
                lineTo(17.78f, 8.78f)
                close()
                moveTo(17.78f, 13.22f)
                curveTo(18.073f, 13.513f, 18.073f, 13.987f, 17.78f, 14.28f)
                lineTo(15.78f, 16.28f)
                curveTo(15.487f, 16.573f, 15.013f, 16.573f, 14.72f, 16.28f)
                lineTo(13.72f, 15.28f)
                curveTo(13.427f, 14.987f, 13.427f, 14.513f, 13.72f, 14.22f)
                curveTo(14.013f, 13.927f, 14.487f, 13.927f, 14.78f, 14.22f)
                lineTo(15.25f, 14.689f)
                lineTo(16.72f, 13.22f)
                curveTo(17.013f, 12.927f, 17.487f, 12.927f, 17.78f, 13.22f)
                close()
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21.0f, 21.0f, 19.545f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _taskListSquareRtl!!
    }

@Suppress("ObjectPropertyName")
private var _taskListSquareRtl: ImageVector? = null

@Preview
@Composable
private fun TaskListSquareRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TaskListSquareRtl, contentDescription = "TaskListSquareRtl Icon")
    }
}

