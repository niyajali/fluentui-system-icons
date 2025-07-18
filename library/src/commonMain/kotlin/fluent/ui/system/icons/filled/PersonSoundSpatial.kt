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

public val FluentIcons.Filled.PersonSoundSpatial: ImageVector
    get() {
        if (_PersonSoundSpatial != null) {
            return _PersonSoundSpatial!!
        }
        _PersonSoundSpatial = ImageVector.Builder(
            name = "Filled.PersonSoundSpatial",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.842f, 12.102f)
                curveTo(20.107f, 12.421f, 20.584f, 12.419f, 20.877f, 12.126f)
                curveTo(21.17f, 11.833f, 21.166f, 11.361f, 20.909f, 11.036f)
                curveTo(20.029f, 9.927f, 19.504f, 8.525f, 19.504f, 6.999f)
                curveTo(19.504f, 5.474f, 20.029f, 4.071f, 20.909f, 2.963f)
                curveTo(21.166f, 2.638f, 21.17f, 2.166f, 20.877f, 1.873f)
                curveTo(20.584f, 1.58f, 20.107f, 1.578f, 19.842f, 1.897f)
                curveTo(18.694f, 3.282f, 18.004f, 5.06f, 18.004f, 6.999f)
                curveTo(18.004f, 8.939f, 18.694f, 10.717f, 19.842f, 12.102f)
                close()
                moveTo(21.979f, 4.032f)
                curveTo(22.226f, 3.698f, 22.706f, 3.701f, 22.999f, 3.994f)
                curveTo(23.292f, 4.287f, 23.283f, 4.759f, 23.059f, 5.107f)
                curveTo(22.708f, 5.653f, 22.504f, 6.302f, 22.504f, 6.999f)
                curveTo(22.504f, 7.696f, 22.708f, 8.346f, 23.059f, 8.892f)
                curveTo(23.283f, 9.24f, 23.292f, 9.712f, 22.999f, 10.005f)
                curveTo(22.706f, 10.297f, 22.226f, 10.3f, 21.979f, 9.967f)
                curveTo(21.366f, 9.137f, 21.004f, 8.11f, 21.004f, 6.999f)
                curveTo(21.004f, 5.888f, 21.366f, 4.862f, 21.979f, 4.032f)
                close()
                moveTo(3.1f, 11.036f)
                curveTo(2.842f, 11.361f, 2.838f, 11.833f, 3.131f, 12.126f)
                curveTo(3.424f, 12.419f, 3.902f, 12.421f, 4.166f, 12.102f)
                curveTo(5.314f, 10.717f, 6.004f, 8.939f, 6.004f, 7f)
                curveTo(6.004f, 5.061f, 5.314f, 3.283f, 4.166f, 1.898f)
                curveTo(3.902f, 1.579f, 3.424f, 1.581f, 3.131f, 1.874f)
                curveTo(2.838f, 2.167f, 2.842f, 2.639f, 3.1f, 2.964f)
                curveTo(3.979f, 4.072f, 4.504f, 5.475f, 4.504f, 7f)
                curveTo(4.504f, 8.525f, 3.979f, 9.928f, 3.1f, 11.036f)
                close()
                moveTo(1.01f, 10.005f)
                curveTo(1.303f, 10.298f, 1.783f, 10.301f, 2.029f, 9.967f)
                curveTo(2.642f, 9.137f, 3.004f, 8.111f, 3.004f, 7f)
                curveTo(3.004f, 5.889f, 2.642f, 4.863f, 2.029f, 4.033f)
                curveTo(1.783f, 3.699f, 1.303f, 3.702f, 1.01f, 3.995f)
                curveTo(0.717f, 4.288f, 0.725f, 4.76f, 0.949f, 5.108f)
                curveTo(1.301f, 5.654f, 1.504f, 6.303f, 1.504f, 7f)
                curveTo(1.504f, 7.697f, 1.301f, 8.347f, 0.949f, 8.892f)
                curveTo(0.725f, 9.24f, 0.717f, 9.712f, 1.01f, 10.005f)
                close()
                moveTo(17.754f, 14f)
                curveTo(18.997f, 14f, 20.003f, 15.007f, 20.003f, 16.249f)
                verticalLineTo(17.167f)
                curveTo(20.003f, 17.741f, 19.824f, 18.3f, 19.491f, 18.766f)
                curveTo(17.945f, 20.93f, 15.421f, 22.001f, 12f, 22.001f)
                curveTo(8.579f, 22.001f, 6.056f, 20.929f, 4.514f, 18.765f)
                curveTo(4.182f, 18.299f, 4.004f, 17.741f, 4.004f, 17.169f)
                verticalLineTo(16.249f)
                curveTo(4.004f, 15.007f, 5.011f, 14f, 6.253f, 14f)
                horizontalLineTo(17.754f)
                close()
                moveTo(12f, 2.005f)
                curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
                curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
                curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
                curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
                close()
            }
        }.build()

        return _PersonSoundSpatial!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSoundSpatial: ImageVector? = null

@Preview
@Composable
private fun PersonSoundSpatialPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonSoundSpatial, contentDescription = null)
    }
}
