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
 * BugArrowCounterclockwise Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to rerun bug.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_bug_arrow_counterclockwise_20_regular.svg)
 * 
 * @return The [ImageVector] for the BugArrowCounterclockwise icon.
 */
public val FluentIcons.Regular.BugArrowCounterclockwise: ImageVector
    get() {
        if (_bugArrowCounterclockwise != null) {
            return _bugArrowCounterclockwise!!
        }
        _bugArrowCounterclockwise = Builder(name = "BugArrowCounterclockwise", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.5f)
                curveTo(17.0f, 3.367f, 16.947f, 3.24f, 16.854f, 3.146f)
                curveTo(16.76f, 3.053f, 16.633f, 3.0f, 16.5f, 3.0f)
                curveTo(16.367f, 3.0f, 16.24f, 3.053f, 16.146f, 3.146f)
                curveTo(16.053f, 3.24f, 16.0f, 3.367f, 16.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(16.0f, 5.898f, 15.842f, 6.279f, 15.561f, 6.561f)
                curveTo(15.279f, 6.842f, 14.898f, 7.0f, 14.5f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 6.323f, 13.772f, 5.666f, 13.351f, 5.136f)
                curveTo(12.931f, 4.605f, 12.344f, 4.233f, 11.685f, 4.078f)
                curveTo(11.891f, 3.756f, 12.0f, 3.382f, 12.0f, 3.0f)
                verticalLineTo(2.5f)
                curveTo(12.0f, 2.367f, 11.947f, 2.24f, 11.854f, 2.146f)
                curveTo(11.76f, 2.053f, 11.633f, 2.0f, 11.5f, 2.0f)
                curveTo(11.367f, 2.0f, 11.24f, 2.053f, 11.146f, 2.146f)
                curveTo(11.053f, 2.24f, 11.0f, 2.367f, 11.0f, 2.5f)
                verticalLineTo(3.0f)
                curveTo(11.0f, 3.265f, 10.895f, 3.52f, 10.707f, 3.707f)
                curveTo(10.52f, 3.895f, 10.265f, 4.0f, 10.0f, 4.0f)
                curveTo(9.735f, 4.0f, 9.48f, 3.895f, 9.293f, 3.707f)
                curveTo(9.105f, 3.52f, 9.0f, 3.265f, 9.0f, 3.0f)
                verticalLineTo(2.5f)
                curveTo(9.0f, 2.367f, 8.947f, 2.24f, 8.854f, 2.146f)
                curveTo(8.76f, 2.053f, 8.633f, 2.0f, 8.5f, 2.0f)
                curveTo(8.367f, 2.0f, 8.24f, 2.053f, 8.146f, 2.146f)
                curveTo(8.053f, 2.24f, 8.0f, 2.367f, 8.0f, 2.5f)
                verticalLineTo(3.0f)
                curveTo(8.0f, 3.382f, 8.109f, 3.756f, 8.315f, 4.078f)
                curveTo(7.656f, 4.233f, 7.069f, 4.605f, 6.649f, 5.136f)
                curveTo(6.228f, 5.666f, 6.0f, 6.323f, 6.0f, 7.0f)
                horizontalLineTo(5.5f)
                curveTo(5.102f, 7.0f, 4.721f, 6.842f, 4.439f, 6.561f)
                curveTo(4.158f, 6.279f, 4.0f, 5.898f, 4.0f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(4.0f, 3.367f, 3.947f, 3.24f, 3.854f, 3.146f)
                curveTo(3.76f, 3.053f, 3.633f, 3.0f, 3.5f, 3.0f)
                curveTo(3.367f, 3.0f, 3.24f, 3.053f, 3.146f, 3.146f)
                curveTo(3.053f, 3.24f, 3.0f, 3.367f, 3.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 6.163f, 3.263f, 6.799f, 3.732f, 7.268f)
                curveTo(4.201f, 7.737f, 4.837f, 8.0f, 5.5f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.5f)
                curveTo(2.367f, 9.5f, 2.24f, 9.553f, 2.146f, 9.646f)
                curveTo(2.053f, 9.74f, 2.0f, 9.867f, 2.0f, 10.0f)
                curveTo(2.0f, 10.133f, 2.053f, 10.26f, 2.146f, 10.354f)
                curveTo(2.24f, 10.447f, 2.367f, 10.5f, 2.5f, 10.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.5f)
                curveTo(4.837f, 12.0f, 4.201f, 12.263f, 3.732f, 12.732f)
                curveTo(3.263f, 13.201f, 3.0f, 13.837f, 3.0f, 14.5f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 16.633f, 3.053f, 16.76f, 3.146f, 16.854f)
                curveTo(3.24f, 16.947f, 3.367f, 17.0f, 3.5f, 17.0f)
                curveTo(3.633f, 17.0f, 3.76f, 16.947f, 3.854f, 16.854f)
                curveTo(3.947f, 16.76f, 4.0f, 16.633f, 4.0f, 16.5f)
                verticalLineTo(14.5f)
                curveTo(4.0f, 14.102f, 4.158f, 13.721f, 4.439f, 13.439f)
                curveTo(4.721f, 13.158f, 5.102f, 13.0f, 5.5f, 13.0f)
                horizontalLineTo(6.0f)
                curveTo(6.002f, 13.987f, 6.37f, 14.938f, 7.032f, 15.669f)
                curveTo(7.695f, 16.4f, 8.605f, 16.859f, 9.587f, 16.958f)
                curveTo(9.413f, 16.611f, 9.277f, 16.247f, 9.18f, 15.872f)
                curveTo(8.554f, 15.696f, 8.002f, 15.32f, 7.608f, 14.802f)
                curveTo(7.215f, 14.283f, 7.001f, 13.651f, 7.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 6.47f, 7.211f, 5.961f, 7.586f, 5.586f)
                curveTo(7.961f, 5.211f, 8.47f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(11.0f)
                curveTo(11.53f, 5.0f, 12.039f, 5.211f, 12.414f, 5.586f)
                curveTo(12.789f, 5.961f, 13.0f, 6.47f, 13.0f, 7.0f)
                verticalLineTo(9.213f)
                curveTo(13.327f, 9.12f, 13.662f, 9.057f, 14.0f, 9.025f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.5f)
                curveTo(15.163f, 8.0f, 15.799f, 7.737f, 16.268f, 7.268f)
                curveTo(16.737f, 6.799f, 17.0f, 6.163f, 17.0f, 5.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(14.5f, 10.0f)
                curveTo(13.61f, 10.0f, 12.74f, 10.264f, 12.0f, 10.758f)
                curveTo(11.26f, 11.253f, 10.683f, 11.956f, 10.342f, 12.778f)
                curveTo(10.002f, 13.6f, 9.913f, 14.505f, 10.087f, 15.378f)
                curveTo(10.26f, 16.251f, 10.689f, 17.053f, 11.318f, 17.682f)
                curveTo(11.947f, 18.311f, 12.749f, 18.74f, 13.622f, 18.913f)
                curveTo(14.495f, 19.087f, 15.4f, 18.998f, 16.222f, 18.657f)
                curveTo(17.044f, 18.317f, 17.747f, 17.74f, 18.242f, 17.0f)
                curveTo(18.736f, 16.26f, 19.0f, 15.39f, 19.0f, 14.5f)
                curveTo(19.0f, 13.909f, 18.884f, 13.324f, 18.657f, 12.778f)
                curveTo(18.431f, 12.232f, 18.1f, 11.736f, 17.682f, 11.318f)
                curveTo(17.264f, 10.9f, 16.768f, 10.569f, 16.222f, 10.342f)
                curveTo(15.676f, 10.116f, 15.091f, 10.0f, 14.5f, 10.0f)
                close()
                moveTo(14.5f, 17.25f)
                curveTo(14.113f, 17.25f, 13.73f, 17.169f, 13.377f, 17.011f)
                curveTo(13.024f, 16.853f, 12.708f, 16.622f, 12.45f, 16.333f)
                curveTo(12.403f, 16.285f, 12.367f, 16.227f, 12.343f, 16.164f)
                curveTo(12.319f, 16.102f, 12.308f, 16.035f, 12.31f, 15.967f)
                curveTo(12.313f, 15.9f, 12.329f, 15.834f, 12.357f, 15.773f)
                curveTo(12.386f, 15.712f, 12.427f, 15.658f, 12.477f, 15.613f)
                curveTo(12.527f, 15.568f, 12.585f, 15.534f, 12.649f, 15.512f)
                curveTo(12.713f, 15.491f, 12.78f, 15.482f, 12.847f, 15.487f)
                curveTo(12.914f, 15.492f, 12.98f, 15.511f, 13.04f, 15.542f)
                curveTo(13.099f, 15.573f, 13.152f, 15.615f, 13.195f, 15.667f)
                curveTo(13.416f, 15.915f, 13.703f, 16.094f, 14.023f, 16.185f)
                curveTo(14.342f, 16.275f, 14.681f, 16.273f, 14.999f, 16.178f)
                curveTo(15.317f, 16.083f, 15.602f, 15.9f, 15.82f, 15.65f)
                curveTo(16.038f, 15.399f, 16.18f, 15.092f, 16.23f, 14.764f)
                curveTo(16.28f, 14.435f, 16.235f, 14.1f, 16.102f, 13.796f)
                curveTo(15.968f, 13.492f, 15.75f, 13.232f, 15.474f, 13.047f)
                curveTo(15.199f, 12.863f, 14.876f, 12.76f, 14.544f, 12.752f)
                curveTo(14.212f, 12.743f, 13.885f, 12.829f, 13.6f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.133f, 13.0f, 14.26f, 13.053f, 14.354f, 13.146f)
                curveTo(14.447f, 13.24f, 14.5f, 13.367f, 14.5f, 13.5f)
                curveTo(14.5f, 13.633f, 14.447f, 13.76f, 14.354f, 13.854f)
                curveTo(14.26f, 13.947f, 14.133f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.422f, 14.003f, 12.344f, 13.987f, 12.274f, 13.954f)
                curveTo(12.203f, 13.922f, 12.141f, 13.873f, 12.092f, 13.812f)
                curveTo(12.043f, 13.751f, 12.01f, 13.679f, 11.994f, 13.603f)
                curveTo(11.978f, 13.526f, 11.98f, 13.447f, 12.0f, 13.372f)
                verticalLineTo(12.0f)
                curveTo(12.0f, 11.867f, 12.053f, 11.74f, 12.146f, 11.646f)
                curveTo(12.24f, 11.553f, 12.367f, 11.5f, 12.5f, 11.5f)
                curveTo(12.633f, 11.5f, 12.76f, 11.553f, 12.854f, 11.646f)
                curveTo(12.947f, 11.74f, 13.0f, 11.867f, 13.0f, 12.0f)
                verticalLineTo(12.194f)
                curveTo(13.359f, 11.961f, 13.767f, 11.815f, 14.192f, 11.767f)
                curveTo(14.617f, 11.719f, 15.048f, 11.772f, 15.449f, 11.92f)
                curveTo(15.851f, 12.068f, 16.212f, 12.307f, 16.505f, 12.619f)
                curveTo(16.797f, 12.932f, 17.013f, 13.308f, 17.135f, 13.718f)
                curveTo(17.256f, 14.128f, 17.281f, 14.561f, 17.206f, 14.982f)
                curveTo(17.131f, 15.403f, 16.958f, 15.801f, 16.703f, 16.144f)
                curveTo(16.447f, 16.487f, 16.115f, 16.766f, 15.732f, 16.958f)
                curveTo(15.35f, 17.15f, 14.928f, 17.25f, 14.5f, 17.25f)
                close()
            }
        }
        .build()
        return _bugArrowCounterclockwise!!
    }

@Suppress("ObjectPropertyName")
private var _bugArrowCounterclockwise: ImageVector? = null

@Preview
@Composable
private fun BugArrowCounterclockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BugArrowCounterclockwise, contentDescription = "BugArrowCounterclockwise Icon")
    }
}

