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
 * TaskListSquareSettings Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a checklist, goals in task oriented scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_task_list_square_settings_20_filled.svg)
 * 
 * @return The [ImageVector] for the TaskListSquareSettings icon.
 */
public val FluentIcons.Filled.TaskListSquareSettings: ImageVector
    get() {
        if (_taskListSquareSettings != null) {
            return _taskListSquareSettings!!
        }
        _taskListSquareSettings = Builder(name = "TaskListSquareSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.657f, 4.343f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(9.601f)
                curveTo(9.21f, 16.233f, 9.0f, 15.377f, 9.0f, 14.5f)
                curveTo(9.0f, 13.412f, 9.323f, 12.349f, 9.927f, 11.444f)
                curveTo(10.531f, 10.54f, 11.39f, 9.835f, 12.395f, 9.419f)
                curveTo(13.4f, 9.002f, 14.506f, 8.893f, 15.573f, 9.106f)
                curveTo(16.072f, 9.205f, 16.552f, 9.372f, 17.0f, 9.601f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.343f, 15.657f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(9.354f, 6.396f)
                curveTo(9.549f, 6.592f, 9.549f, 6.908f, 9.354f, 7.104f)
                lineTo(7.604f, 8.853f)
                curveTo(7.415f, 9.043f, 7.11f, 9.049f, 6.913f, 8.869f)
                lineTo(6.163f, 8.184f)
                curveTo(5.959f, 7.998f, 5.945f, 7.682f, 6.131f, 7.478f)
                curveTo(6.317f, 7.274f, 6.633f, 7.26f, 6.837f, 7.446f)
                lineTo(7.234f, 7.808f)
                lineTo(8.646f, 6.396f)
                curveTo(8.842f, 6.201f, 9.158f, 6.201f, 9.354f, 6.396f)
                close()
                moveTo(8.646f, 11.396f)
                curveTo(8.842f, 11.201f, 9.158f, 11.201f, 9.354f, 11.396f)
                curveTo(9.549f, 11.592f, 9.549f, 11.908f, 9.354f, 12.104f)
                lineTo(7.604f, 13.854f)
                curveTo(7.415f, 14.042f, 7.11f, 14.049f, 6.913f, 13.869f)
                lineTo(6.163f, 13.184f)
                curveTo(5.959f, 12.998f, 5.945f, 12.682f, 6.131f, 12.478f)
                curveTo(6.317f, 12.274f, 6.633f, 12.259f, 6.837f, 12.446f)
                lineTo(7.234f, 12.809f)
                lineTo(8.646f, 11.396f)
                close()
                moveTo(11.0f, 8.0f)
                curveTo(10.724f, 8.0f, 10.5f, 7.776f, 10.5f, 7.5f)
                curveTo(10.5f, 7.224f, 10.724f, 7.0f, 11.0f, 7.0f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 7.0f, 14.0f, 7.224f, 14.0f, 7.5f)
                curveTo(14.0f, 7.776f, 13.776f, 8.0f, 13.5f, 8.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(10.634f, 13.92f)
                curveTo(10.893f, 13.854f, 11.135f, 13.737f, 11.347f, 13.576f)
                curveTo(11.56f, 13.415f, 11.738f, 13.213f, 11.871f, 12.982f)
                curveTo(12.004f, 12.751f, 12.09f, 12.496f, 12.123f, 12.231f)
                curveTo(12.156f, 11.967f, 12.136f, 11.698f, 12.064f, 11.442f)
                lineTo(11.908f, 10.885f)
                curveTo(12.163f, 10.688f, 12.439f, 10.521f, 12.73f, 10.385f)
                lineTo(13.067f, 10.743f)
                curveTo(13.254f, 10.941f, 13.48f, 11.099f, 13.73f, 11.207f)
                curveTo(13.98f, 11.315f, 14.25f, 11.371f, 14.522f, 11.371f)
                curveTo(14.795f, 11.371f, 15.064f, 11.315f, 15.315f, 11.207f)
                curveTo(15.565f, 11.099f, 15.79f, 10.941f, 15.977f, 10.743f)
                lineTo(16.299f, 10.4f)
                curveTo(16.597f, 10.54f, 16.877f, 10.713f, 17.134f, 10.918f)
                lineTo(17.008f, 11.34f)
                curveTo(16.93f, 11.601f, 16.906f, 11.875f, 16.938f, 12.146f)
                curveTo(16.97f, 12.416f, 17.057f, 12.677f, 17.193f, 12.913f)
                curveTo(17.329f, 13.149f, 17.513f, 13.355f, 17.731f, 13.517f)
                curveTo(17.95f, 13.68f, 18.199f, 13.796f, 18.464f, 13.859f)
                lineTo(18.813f, 13.941f)
                curveTo(18.836f, 14.125f, 18.847f, 14.31f, 18.846f, 14.496f)
                curveTo(18.846f, 14.652f, 18.838f, 14.806f, 18.823f, 14.958f)
                lineTo(18.363f, 15.076f)
                curveTo(18.105f, 15.142f, 17.862f, 15.259f, 17.65f, 15.42f)
                curveTo(17.438f, 15.581f, 17.259f, 15.783f, 17.126f, 16.014f)
                curveTo(16.993f, 16.244f, 16.907f, 16.5f, 16.874f, 16.764f)
                curveTo(16.84f, 17.029f, 16.86f, 17.297f, 16.932f, 17.554f)
                lineTo(17.088f, 18.11f)
                curveTo(16.834f, 18.307f, 16.558f, 18.475f, 16.266f, 18.61f)
                lineTo(15.929f, 18.252f)
                curveTo(15.742f, 18.054f, 15.517f, 17.896f, 15.267f, 17.788f)
                curveTo(15.017f, 17.68f, 14.747f, 17.625f, 14.475f, 17.625f)
                curveTo(14.203f, 17.625f, 13.933f, 17.68f, 13.683f, 17.788f)
                curveTo(13.433f, 17.896f, 13.207f, 18.054f, 13.02f, 18.252f)
                lineTo(12.699f, 18.6f)
                curveTo(12.402f, 18.459f, 12.122f, 18.285f, 11.864f, 18.082f)
                lineTo(11.99f, 17.659f)
                curveTo(12.068f, 17.398f, 12.092f, 17.124f, 12.061f, 16.853f)
                curveTo(12.029f, 16.582f, 11.942f, 16.321f, 11.806f, 16.085f)
                curveTo(11.669f, 15.849f, 11.486f, 15.644f, 11.268f, 15.481f)
                curveTo(11.049f, 15.319f, 10.8f, 15.203f, 10.534f, 15.14f)
                lineTo(10.185f, 15.057f)
                curveTo(10.163f, 14.873f, 10.152f, 14.688f, 10.152f, 14.503f)
                curveTo(10.152f, 14.347f, 10.16f, 14.193f, 10.175f, 14.041f)
                lineTo(10.634f, 13.92f)
                close()
                moveTo(15.499f, 14.5f)
                curveTo(15.499f, 14.234f, 15.394f, 13.98f, 15.207f, 13.793f)
                curveTo(15.019f, 13.605f, 14.765f, 13.5f, 14.499f, 13.5f)
                curveTo(14.302f, 13.5f, 14.108f, 13.558f, 13.944f, 13.668f)
                curveTo(13.779f, 13.778f, 13.651f, 13.934f, 13.575f, 14.117f)
                curveTo(13.5f, 14.3f, 13.48f, 14.501f, 13.519f, 14.695f)
                curveTo(13.557f, 14.889f, 13.652f, 15.067f, 13.792f, 15.207f)
                curveTo(13.932f, 15.347f, 14.11f, 15.442f, 14.304f, 15.481f)
                curveTo(14.498f, 15.519f, 14.699f, 15.499f, 14.882f, 15.424f)
                curveTo(15.065f, 15.348f, 15.221f, 15.22f, 15.331f, 15.055f)
                curveTo(15.441f, 14.891f, 15.499f, 14.698f, 15.499f, 14.5f)
                close()
            }
        }
        .build()
        return _taskListSquareSettings!!
    }

@Suppress("ObjectPropertyName")
private var _taskListSquareSettings: ImageVector? = null

@Preview
@Composable
private fun TaskListSquareSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TaskListSquareSettings, contentDescription = "TaskListSquareSettings Icon")
    }
}

