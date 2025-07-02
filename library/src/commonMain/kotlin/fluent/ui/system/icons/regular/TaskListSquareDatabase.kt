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
 * TaskListSquareDatabase icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: task, list, square, database
 * - Source: ic_fluent_task_list_square_database_24_regular.svg
 * 
 * @return The [ImageVector] for the TaskListSquareDatabase icon.
 */
public val FluentIcons.Regular.TaskListSquareDatabase: ImageVector
    get() {
        if (_taskListSquareDatabase != null) {
            return _taskListSquareDatabase!!
        }
        _taskListSquareDatabase = Builder(name = "TaskListSquareDatabase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(12.055f)
                curveTo(12.019f, 20.84f, 12.0f, 20.673f, 12.0f, 20.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(11.103f)
                curveTo(19.552f, 11.111f, 19.604f, 11.118f, 19.655f, 11.127f)
                curveTo(20.127f, 11.201f, 20.579f, 11.307f, 21.0f, 11.441f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(21.0f, 12.5f)
                curveTo(20.552f, 12.332f, 20.046f, 12.2f, 19.5f, 12.114f)
                curveTo(19.027f, 12.04f, 18.523f, 12.0f, 18.0f, 12.0f)
                curveTo(15.239f, 12.0f, 13.0f, 13.119f, 13.0f, 14.5f)
                curveTo(13.0f, 15.881f, 15.239f, 17.0f, 18.0f, 17.0f)
                curveTo(18.523f, 17.0f, 19.027f, 16.96f, 19.5f, 16.885f)
                curveTo(20.046f, 16.8f, 20.552f, 16.668f, 21.0f, 16.5f)
                curveTo(22.214f, 16.044f, 23.0f, 15.318f, 23.0f, 14.5f)
                curveTo(23.0f, 13.682f, 22.214f, 12.956f, 21.0f, 12.5f)
                close()
                moveTo(21.0f, 17.559f)
                curveTo(20.534f, 17.708f, 20.029f, 17.822f, 19.5f, 17.896f)
                curveTo(19.017f, 17.965f, 18.514f, 18.0f, 18.0f, 18.0f)
                curveTo(16.498f, 18.0f, 15.088f, 17.698f, 14.017f, 17.162f)
                curveTo(13.663f, 16.985f, 13.31f, 16.762f, 13.0f, 16.492f)
                verticalLineTo(20.5f)
                curveTo(13.0f, 20.856f, 13.148f, 21.194f, 13.416f, 21.5f)
                curveTo(14.188f, 22.383f, 15.95f, 23.0f, 18.0f, 23.0f)
                curveTo(20.761f, 23.0f, 23.0f, 21.881f, 23.0f, 20.5f)
                verticalLineTo(16.492f)
                curveTo(22.69f, 16.762f, 22.337f, 16.985f, 21.983f, 17.162f)
                curveTo(21.68f, 17.313f, 21.351f, 17.446f, 21.0f, 17.559f)
                close()
            }
        }
        .build()
        return _taskListSquareDatabase!!
    }

@Suppress("ObjectPropertyName")
private var _taskListSquareDatabase: ImageVector? = null

@Preview
@Composable
private fun TaskListSquareDatabasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TaskListSquareDatabase, contentDescription = null)
    }
}

