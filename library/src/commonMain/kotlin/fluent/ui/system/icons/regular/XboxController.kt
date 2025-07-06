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
 * XboxController Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, xbox
 * - Description: Used to represent an Xbox console controller.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_xbox_controller_24_regular.svg)
 * 
 * @return The [ImageVector] for the XboxController icon.
 */
public val FluentIcons.Regular.XboxController: ImageVector
    get() {
        if (_xboxController != null) {
            return _xboxController!!
        }
        _xboxController = Builder(name = "XboxController", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.808f, 5.508f)
                curveTo(9.279f, 5.243f, 8.699f, 5.202f, 8.17f, 5.302f)
                lineTo(6.987f, 5.528f)
                curveTo(6.125f, 5.692f, 5.384f, 6.245f, 4.983f, 7.028f)
                curveTo(3.616f, 9.7f, 2.583f, 11.889f, 2.184f, 13.757f)
                curveTo(1.773f, 15.683f, 2.024f, 17.332f, 3.263f, 18.833f)
                curveTo(4.085f, 19.829f, 5.493f, 19.627f, 6.227f, 18.797f)
                curveTo(6.785f, 18.165f, 7.422f, 17.433f, 8.044f, 16.711f)
                curveTo(8.454f, 16.236f, 9.049f, 15.962f, 9.674f, 15.962f)
                horizontalLineTo(14.329f)
                curveTo(14.955f, 15.962f, 15.549f, 16.236f, 15.959f, 16.711f)
                curveTo(16.581f, 17.433f, 17.218f, 18.165f, 17.776f, 18.797f)
                curveTo(18.51f, 19.627f, 19.918f, 19.829f, 20.74f, 18.833f)
                curveTo(21.979f, 17.332f, 22.23f, 15.683f, 21.819f, 13.757f)
                curveTo(21.42f, 11.889f, 20.387f, 9.7f, 19.02f, 7.028f)
                curveTo(18.619f, 6.245f, 17.878f, 5.692f, 17.016f, 5.528f)
                lineTo(15.833f, 5.302f)
                curveTo(15.305f, 5.202f, 14.724f, 5.243f, 14.195f, 5.508f)
                curveTo(14.051f, 5.579f, 13.904f, 5.657f, 13.755f, 5.737f)
                curveTo(13.4f, 5.93f, 13.019f, 6.034f, 12.642f, 6.034f)
                horizontalLineTo(11.361f)
                curveTo(10.984f, 6.034f, 10.603f, 5.93f, 10.248f, 5.737f)
                curveTo(10.099f, 5.657f, 9.952f, 5.579f, 9.808f, 5.508f)
                close()
                moveTo(8.437f, 6.705f)
                curveTo(8.712f, 6.653f, 8.966f, 6.684f, 9.17f, 6.785f)
                curveTo(9.297f, 6.849f, 9.43f, 6.919f, 9.567f, 6.993f)
                curveTo(10.107f, 7.285f, 10.72f, 7.462f, 11.361f, 7.462f)
                horizontalLineTo(12.642f)
                curveTo(13.283f, 7.462f, 13.896f, 7.285f, 14.436f, 6.993f)
                curveTo(14.573f, 6.919f, 14.706f, 6.849f, 14.834f, 6.785f)
                curveTo(15.037f, 6.684f, 15.291f, 6.653f, 15.566f, 6.705f)
                lineTo(16.749f, 6.931f)
                curveTo(17.179f, 7.013f, 17.549f, 7.29f, 17.748f, 7.678f)
                curveTo(19.128f, 10.377f, 20.069f, 12.402f, 20.422f, 14.055f)
                curveTo(20.763f, 15.65f, 20.543f, 16.828f, 19.638f, 17.924f)
                curveTo(19.551f, 18.03f, 19.432f, 18.079f, 19.29f, 18.073f)
                curveTo(19.14f, 18.066f, 18.973f, 17.994f, 18.847f, 17.851f)
                curveTo(18.293f, 17.225f, 17.661f, 16.497f, 17.041f, 15.778f)
                curveTo(16.361f, 14.99f, 15.372f, 14.534f, 14.329f, 14.534f)
                horizontalLineTo(9.674f)
                curveTo(8.631f, 14.534f, 7.642f, 14.99f, 6.962f, 15.778f)
                curveTo(6.342f, 16.497f, 5.71f, 17.225f, 5.156f, 17.851f)
                curveTo(5.03f, 17.994f, 4.863f, 18.066f, 4.713f, 18.073f)
                curveTo(4.571f, 18.079f, 4.452f, 18.03f, 4.365f, 17.924f)
                curveTo(3.46f, 16.828f, 3.24f, 15.65f, 3.581f, 14.055f)
                curveTo(3.934f, 12.402f, 4.875f, 10.377f, 6.255f, 7.678f)
                curveTo(6.454f, 7.29f, 6.824f, 7.013f, 7.255f, 6.931f)
                lineTo(8.437f, 6.705f)
                close()
                moveTo(12.001f, 11.0f)
                curveTo(12.554f, 11.0f, 13.001f, 10.553f, 13.001f, 10.0f)
                curveTo(13.001f, 9.448f, 12.554f, 9.0f, 12.001f, 9.0f)
                curveTo(11.449f, 9.0f, 11.001f, 9.448f, 11.001f, 10.0f)
                curveTo(11.001f, 10.553f, 11.449f, 11.0f, 12.001f, 11.0f)
                close()
            }
        }
        .build()
        return _xboxController!!
    }

@Suppress("ObjectPropertyName")
private var _xboxController: ImageVector? = null

@Preview
@Composable
private fun XboxControllerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.XboxController, contentDescription = "XboxController Icon")
    }
}

