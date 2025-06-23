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

public val FluentIcons.Filled.WifiLock: ImageVector
    get() {
        if (_WifiLock != null) {
            return _WifiLock!!
        }
        _WifiLock = ImageVector.Builder(
            name = "Filled.WifiLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.784f, 10.708f)
                curveTo(18.381f, 11.305f, 18.896f, 12.026f, 19.288f, 12.793f)
                curveTo(19.539f, 13.285f, 19.344f, 13.887f, 18.853f, 14.139f)
                curveTo(18.361f, 14.39f, 17.759f, 14.196f, 17.507f, 13.704f)
                curveTo(17.207f, 13.118f, 16.814f, 12.566f, 16.37f, 12.123f)
                curveTo(14.468f, 10.22f, 11.626f, 9.83f, 9.338f, 10.952f)
                curveTo(8.905f, 10.352f, 8.286f, 9.895f, 7.567f, 9.665f)
                curveTo(10.721f, 7.584f, 15.007f, 7.931f, 17.784f, 10.708f)
                close()
                moveTo(4.982f, 9.713f)
                curveTo(4.896f, 9.799f, 4.81f, 9.89f, 4.724f, 9.983f)
                curveTo(4.125f, 10.337f, 3.641f, 10.863f, 3.34f, 11.493f)
                curveTo(3.046f, 11.599f, 2.707f, 11.566f, 2.43f, 11.374f)
                curveTo(1.976f, 11.059f, 1.864f, 10.436f, 2.178f, 9.982f)
                curveTo(2.606f, 9.365f, 3.079f, 8.788f, 3.568f, 8.299f)
                curveTo(8.221f, 3.645f, 15.766f, 3.645f, 20.419f, 8.299f)
                curveTo(20.927f, 8.807f, 21.406f, 9.386f, 21.823f, 9.99f)
                curveTo(22.137f, 10.445f, 22.023f, 11.068f, 21.568f, 11.381f)
                curveTo(21.114f, 11.695f, 20.491f, 11.581f, 20.177f, 11.126f)
                curveTo(19.827f, 10.62f, 19.426f, 10.133f, 19.005f, 9.713f)
                curveTo(15.133f, 5.841f, 8.854f, 5.841f, 4.982f, 9.713f)
                close()
                moveTo(15.735f, 13.7f)
                curveTo(16.196f, 14.16f, 16.573f, 14.724f, 16.837f, 15.324f)
                curveTo(17.058f, 15.83f, 16.828f, 16.42f, 16.322f, 16.642f)
                curveTo(15.816f, 16.863f, 15.226f, 16.633f, 15.005f, 16.127f)
                curveTo(14.839f, 15.75f, 14.601f, 15.394f, 14.321f, 15.114f)
                curveTo(13.587f, 14.38f, 12.587f, 14.073f, 11.631f, 14.192f)
                curveTo(11.275f, 13.613f, 10.689f, 13.19f, 10f, 13.05f)
                verticalLineTo(13f)
                curveTo(10f, 12.861f, 9.992f, 12.723f, 9.976f, 12.588f)
                curveTo(11.884f, 11.772f, 14.178f, 12.143f, 15.735f, 13.7f)
                close()
                moveTo(13.061f, 16.441f)
                curveTo(13.648f, 17.027f, 13.648f, 17.978f, 13.061f, 18.564f)
                curveTo(12.768f, 18.857f, 12.384f, 19.004f, 12f, 19.004f)
                verticalLineTo(16.001f)
                curveTo(12.384f, 16.001f, 12.768f, 16.148f, 13.061f, 16.441f)
                close()
                moveTo(4f, 14f)
                verticalLineTo(13f)
                curveTo(4f, 11.619f, 5.119f, 10.5f, 6.5f, 10.5f)
                curveTo(7.881f, 10.5f, 9f, 11.619f, 9f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(9.5f)
                curveTo(10.328f, 14f, 11f, 14.672f, 11f, 15.5f)
                verticalLineTo(20.5f)
                curveTo(11f, 21.328f, 10.328f, 22f, 9.5f, 22f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 22f, 2f, 21.328f, 2f, 20.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 14.672f, 2.672f, 14f, 3.5f, 14f)
                horizontalLineTo(4f)
                close()
                moveTo(5.5f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(7.5f)
                verticalLineTo(13f)
                curveTo(7.5f, 12.448f, 7.052f, 12f, 6.5f, 12f)
                curveTo(5.948f, 12f, 5.5f, 12.448f, 5.5f, 13f)
                close()
                moveTo(7.5f, 18f)
                curveTo(7.5f, 17.448f, 7.052f, 17f, 6.5f, 17f)
                curveTo(5.948f, 17f, 5.5f, 17.448f, 5.5f, 18f)
                curveTo(5.5f, 18.552f, 5.948f, 19f, 6.5f, 19f)
                curveTo(7.052f, 19f, 7.5f, 18.552f, 7.5f, 18f)
                close()
            }
        }.build()

        return _WifiLock!!
    }

@Suppress("ObjectPropertyName")
private var _WifiLock: ImageVector? = null

@Preview
@Composable
private fun WifiLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WifiLock, contentDescription = null)
    }
}
