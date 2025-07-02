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
 * TasksApp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tasks, app
 * - Source: ic_fluent_tasks_app_24_regular.svg
 * 
 * @return The [ImageVector] for the TasksApp icon.
 */
public val FluentIcons.Regular.TasksApp: ImageVector
    get() {
        if (_tasksApp != null) {
            return _tasksApp!!
        }
        _tasksApp = Builder(name = "TasksApp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.995f, 4.097f)
                curveTo(19.916f, 2.926f, 18.941f, 2.001f, 17.75f, 2.001f)
                horizontalLineTo(6.25f)
                lineTo(6.096f, 2.006f)
                curveTo(4.925f, 2.085f, 4.0f, 3.06f, 4.0f, 4.251f)
                verticalLineTo(19.749f)
                lineTo(4.005f, 19.903f)
                curveTo(4.084f, 21.074f, 5.059f, 21.999f, 6.25f, 21.999f)
                horizontalLineTo(13.818f)
                lineTo(12.319f, 20.499f)
                horizontalLineTo(6.25f)
                lineTo(6.148f, 20.492f)
                curveTo(5.782f, 20.442f, 5.5f, 20.129f, 5.5f, 19.749f)
                verticalLineTo(4.251f)
                lineTo(5.507f, 4.149f)
                curveTo(5.557f, 3.783f, 5.87f, 3.501f, 6.25f, 3.501f)
                horizontalLineTo(17.75f)
                lineTo(17.852f, 3.508f)
                curveTo(18.218f, 3.557f, 18.5f, 3.871f, 18.5f, 4.251f)
                verticalLineTo(15.818f)
                lineTo(19.659f, 14.659f)
                curveTo(19.765f, 14.553f, 19.879f, 14.459f, 20.0f, 14.378f)
                verticalLineTo(4.251f)
                lineTo(19.995f, 4.097f)
                close()
                moveTo(16.288f, 21.999f)
                curveTo(16.275f, 22.0f, 16.262f, 22.0f, 16.25f, 22.0f)
                curveTo(16.237f, 22.0f, 16.224f, 22.0f, 16.212f, 21.999f)
                curveTo(16.027f, 21.99f, 15.851f, 21.912f, 15.719f, 21.78f)
                lineTo(13.219f, 19.278f)
                curveTo(12.927f, 18.985f, 12.927f, 18.51f, 13.22f, 18.218f)
                curveTo(13.513f, 17.925f, 13.988f, 17.925f, 14.281f, 18.218f)
                lineTo(16.25f, 20.189f)
                lineTo(20.719f, 15.72f)
                curveTo(21.012f, 15.427f, 21.487f, 15.427f, 21.78f, 15.72f)
                curveTo(22.073f, 16.013f, 22.073f, 16.487f, 21.78f, 16.78f)
                lineTo(16.78f, 21.78f)
                curveTo(16.648f, 21.912f, 16.473f, 21.99f, 16.288f, 21.999f)
                close()
                moveTo(13.841f, 16.5f)
                curveTo(13.781f, 16.498f, 13.719f, 16.498f, 13.659f, 16.5f)
                horizontalLineTo(11.246f)
                curveTo(10.832f, 16.5f, 10.496f, 16.164f, 10.496f, 15.75f)
                curveTo(10.496f, 15.336f, 10.832f, 15.0f, 11.246f, 15.0f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 15.0f, 17.0f, 15.336f, 17.0f, 15.75f)
                curveTo(17.0f, 16.164f, 16.664f, 16.5f, 16.25f, 16.5f)
                horizontalLineTo(13.841f)
                close()
                moveTo(9.0f, 7.752f)
                curveTo(9.0f, 8.304f, 8.552f, 8.752f, 8.0f, 8.752f)
                curveTo(7.448f, 8.752f, 7.0f, 8.304f, 7.0f, 7.752f)
                curveTo(7.0f, 7.199f, 7.448f, 6.752f, 8.0f, 6.752f)
                curveTo(8.552f, 6.752f, 9.0f, 7.199f, 9.0f, 7.752f)
                close()
                moveTo(10.496f, 7.75f)
                curveTo(10.496f, 7.336f, 10.832f, 7.0f, 11.246f, 7.0f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 7.0f, 17.0f, 7.336f, 17.0f, 7.75f)
                curveTo(17.0f, 8.164f, 16.664f, 8.5f, 16.25f, 8.5f)
                horizontalLineTo(11.246f)
                curveTo(10.832f, 8.5f, 10.496f, 8.164f, 10.496f, 7.75f)
                close()
                moveTo(11.246f, 11.0f)
                curveTo(10.832f, 11.0f, 10.496f, 11.336f, 10.496f, 11.75f)
                curveTo(10.496f, 12.164f, 10.832f, 12.5f, 11.246f, 12.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 12.5f, 17.0f, 12.164f, 17.0f, 11.75f)
                curveTo(17.0f, 11.336f, 16.664f, 11.0f, 16.25f, 11.0f)
                horizontalLineTo(11.246f)
                close()
                moveTo(8.0f, 12.75f)
                curveTo(8.552f, 12.75f, 9.0f, 12.302f, 9.0f, 11.75f)
                curveTo(9.0f, 11.198f, 8.552f, 10.75f, 8.0f, 10.75f)
                curveTo(7.448f, 10.75f, 7.0f, 11.198f, 7.0f, 11.75f)
                curveTo(7.0f, 12.302f, 7.448f, 12.75f, 8.0f, 12.75f)
                close()
                moveTo(9.0f, 15.748f)
                curveTo(9.0f, 16.3f, 8.552f, 16.748f, 8.0f, 16.748f)
                curveTo(7.448f, 16.748f, 7.0f, 16.3f, 7.0f, 15.748f)
                curveTo(7.0f, 15.196f, 7.448f, 14.748f, 8.0f, 14.748f)
                curveTo(8.552f, 14.748f, 9.0f, 15.196f, 9.0f, 15.748f)
                close()
            }
        }
        .build()
        return _tasksApp!!
    }

@Suppress("ObjectPropertyName")
private var _tasksApp: ImageVector? = null

@Preview
@Composable
private fun TasksAppPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TasksApp, contentDescription = null)
    }
}

