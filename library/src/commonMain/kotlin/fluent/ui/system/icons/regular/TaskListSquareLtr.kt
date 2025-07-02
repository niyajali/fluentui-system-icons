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
 * TaskListSquareLtr icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Direction: LTR
 * - Keywords: task, list, square, ltr
 * - Source: ic_fluent_task_list_square_24_regular_ltr.svg
 * 
 * @return The [ImageVector] for the TaskListSquareLtr icon.
 */
public val FluentIcons.Regular.TaskListSquareLtr: ImageVector
    get() {
        if (_taskListSquareLtr != null) {
            return _taskListSquareLtr!!
        }
        _taskListSquareLtr = Builder(name = "TaskListSquareLtr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 9.25f)
                curveTo(12.5f, 8.836f, 12.836f, 8.5f, 13.25f, 8.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 8.5f, 17.5f, 8.836f, 17.5f, 9.25f)
                curveTo(17.5f, 9.664f, 17.164f, 10.0f, 16.75f, 10.0f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 10.0f, 12.5f, 9.664f, 12.5f, 9.25f)
                close()
                moveTo(13.25f, 14.0f)
                curveTo(12.836f, 14.0f, 12.5f, 14.336f, 12.5f, 14.75f)
                curveTo(12.5f, 15.164f, 12.836f, 15.5f, 13.25f, 15.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 15.5f, 17.5f, 15.164f, 17.5f, 14.75f)
                curveTo(17.5f, 14.336f, 17.164f, 14.0f, 16.75f, 14.0f)
                horizontalLineTo(13.25f)
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
        return _taskListSquareLtr!!
    }

@Suppress("ObjectPropertyName")
private var _taskListSquareLtr: ImageVector? = null

@Preview
@Composable
private fun TaskListSquareLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TaskListSquareLtr, contentDescription = null)
    }
}

