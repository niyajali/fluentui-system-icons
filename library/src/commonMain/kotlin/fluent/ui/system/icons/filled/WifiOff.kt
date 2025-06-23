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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.WifiOff: ImageVector
    get() {
        if (_WifiOff != null) {
            return _WifiOff!!
        }
        _WifiOff = ImageVector.Builder(
            name = "Filled.WifiOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.858f, 14.273f)
                lineTo(20.292f, 21.707f)
                curveTo(20.683f, 22.098f, 21.316f, 22.098f, 21.706f, 21.707f)
                curveTo(22.097f, 21.317f, 22.097f, 20.683f, 21.706f, 20.293f)
                lineTo(3.707f, 2.293f)
                curveTo(3.316f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(5.39f, 6.804f)
                curveTo(4.747f, 7.233f, 4.136f, 7.731f, 3.569f, 8.299f)
                curveTo(3.08f, 8.788f, 2.608f, 9.365f, 2.18f, 9.982f)
                curveTo(1.865f, 10.436f, 1.977f, 11.059f, 2.431f, 11.374f)
                curveTo(2.885f, 11.689f, 3.508f, 11.576f, 3.823f, 11.122f)
                curveTo(4.186f, 10.598f, 4.584f, 10.112f, 4.983f, 9.713f)
                curveTo(5.554f, 9.142f, 6.178f, 8.655f, 6.838f, 8.252f)
                lineTo(7.99f, 9.405f)
                curveTo(7.382f, 9.754f, 6.81f, 10.189f, 6.29f, 10.708f)
                curveTo(5.675f, 11.324f, 5.173f, 12.019f, 4.787f, 12.782f)
                curveTo(4.537f, 13.275f, 4.735f, 13.876f, 5.228f, 14.126f)
                curveTo(5.72f, 14.375f, 6.322f, 14.177f, 6.571f, 13.685f)
                curveTo(6.862f, 13.11f, 7.239f, 12.587f, 7.704f, 12.122f)
                curveTo(8.232f, 11.594f, 8.833f, 11.183f, 9.473f, 10.888f)
                lineTo(10.881f, 12.295f)
                curveTo(9.948f, 12.506f, 9.062f, 12.974f, 8.336f, 13.7f)
                curveTo(7.876f, 14.16f, 7.51f, 14.709f, 7.246f, 15.312f)
                curveTo(7.024f, 15.818f, 7.255f, 16.408f, 7.761f, 16.629f)
                curveTo(8.267f, 16.851f, 8.857f, 16.62f, 9.078f, 16.114f)
                curveTo(9.245f, 15.733f, 9.472f, 15.392f, 9.75f, 15.114f)
                curveTo(10.592f, 14.272f, 11.784f, 13.991f, 12.858f, 14.273f)
                close()
                moveTo(11.526f, 8.343f)
                lineTo(13.754f, 10.572f)
                curveTo(14.712f, 10.85f, 15.615f, 11.367f, 16.37f, 12.122f)
                curveTo(16.814f, 12.566f, 17.207f, 13.118f, 17.507f, 13.704f)
                curveTo(17.759f, 14.195f, 18.361f, 14.39f, 18.853f, 14.139f)
                curveTo(19.344f, 13.887f, 19.539f, 13.285f, 19.288f, 12.793f)
                curveTo(18.896f, 12.026f, 18.381f, 11.304f, 17.784f, 10.708f)
                curveTo(16.067f, 8.991f, 13.773f, 8.203f, 11.526f, 8.343f)
                close()
                moveTo(8.51f, 5.327f)
                lineTo(10.161f, 6.978f)
                curveTo(13.269f, 6.397f, 16.601f, 7.308f, 19.005f, 9.713f)
                curveTo(19.426f, 10.133f, 19.827f, 10.619f, 20.177f, 11.126f)
                curveTo(20.491f, 11.581f, 21.114f, 11.695f, 21.568f, 11.381f)
                curveTo(22.022f, 11.067f, 22.137f, 10.445f, 21.823f, 9.99f)
                curveTo(21.406f, 9.386f, 20.927f, 8.807f, 20.419f, 8.299f)
                curveTo(17.196f, 5.075f, 12.586f, 4.085f, 8.51f, 5.327f)
                close()
                moveTo(13.062f, 16.441f)
                curveTo(13.648f, 17.027f, 13.648f, 17.978f, 13.062f, 18.564f)
                curveTo(12.476f, 19.15f, 11.525f, 19.15f, 10.939f, 18.564f)
                curveTo(10.353f, 17.978f, 10.353f, 17.027f, 10.939f, 16.441f)
                curveTo(11.525f, 15.855f, 12.476f, 15.855f, 13.062f, 16.441f)
                close()
            }
        }.build()

        return _WifiOff!!
    }

@Suppress("ObjectPropertyName")
private var _WifiOff: ImageVector? = null

@Preview
@Composable
private fun WifiOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WifiOff, contentDescription = null)
    }
}
