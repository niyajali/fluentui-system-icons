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

public val FluentIcons.Filled.GlobeAdd: ImageVector
    get() {
        if (_GlobeAdd != null) {
            return _GlobeAdd!!
        }
        _GlobeAdd = ImageVector.Builder(
            name = "Filled.GlobeAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(11.077f, 16.498f)
                curveTo(11.026f, 16.825f, 11f, 17.159f, 11f, 17.5f)
                curveTo(11f, 19.152f, 11.616f, 20.66f, 12.631f, 21.807f)
                curveTo(12.424f, 21.932f, 12.212f, 21.997f, 12.002f, 21.997f)
                curveTo(10.805f, 21.997f, 9.601f, 19.903f, 8.964f, 16.793f)
                lineTo(8.906f, 16.499f)
                lineTo(11.077f, 16.498f)
                close()
                moveTo(7.373f, 16.499f)
                curveTo(7.738f, 18.581f, 8.356f, 20.353f, 9.165f, 21.592f)
                curveTo(6.5f, 20.805f, 4.299f, 18.939f, 3.067f, 16.499f)
                lineTo(7.373f, 16.499f)
                close()
                moveTo(17.5f, 13.999f)
                lineTo(17.41f, 14.007f)
                curveTo(17.206f, 14.044f, 17.045f, 14.205f, 17.008f, 14.409f)
                lineTo(17f, 14.499f)
                lineTo(17f, 16.999f)
                lineTo(14.498f, 17f)
                lineTo(14.408f, 17.008f)
                curveTo(14.204f, 17.045f, 14.043f, 17.206f, 14.006f, 17.41f)
                lineTo(13.998f, 17.5f)
                lineTo(14.006f, 17.59f)
                curveTo(14.043f, 17.794f, 14.204f, 17.955f, 14.408f, 17.992f)
                lineTo(14.498f, 18f)
                lineTo(17.001f, 17.999f)
                lineTo(17.001f, 20.503f)
                lineTo(17.009f, 20.593f)
                curveTo(17.046f, 20.798f, 17.207f, 20.958f, 17.411f, 20.995f)
                lineTo(17.501f, 21.003f)
                lineTo(17.591f, 20.995f)
                curveTo(17.795f, 20.958f, 17.956f, 20.798f, 17.993f, 20.593f)
                lineTo(18.001f, 20.503f)
                lineTo(18.001f, 17.999f)
                lineTo(20.505f, 18f)
                lineTo(20.594f, 17.992f)
                curveTo(20.799f, 17.955f, 20.959f, 17.794f, 20.997f, 17.59f)
                lineTo(21.005f, 17.5f)
                lineTo(20.997f, 17.41f)
                curveTo(20.959f, 17.206f, 20.799f, 17.045f, 20.594f, 17.008f)
                lineTo(20.505f, 17f)
                lineTo(18f, 16.999f)
                lineTo(18f, 14.499f)
                lineTo(17.992f, 14.409f)
                curveTo(17.955f, 14.205f, 17.794f, 14.044f, 17.59f, 14.007f)
                lineTo(17.5f, 13.999f)
                close()
                moveTo(7.07f, 9.999f)
                curveTo(7.024f, 10.649f, 7f, 11.317f, 7f, 11.998f)
                curveTo(7f, 12.828f, 7.035f, 13.638f, 7.103f, 14.419f)
                lineTo(7.16f, 14.999f)
                horizontalLineTo(2.458f)
                curveTo(2.16f, 14.052f, 2f, 13.044f, 2f, 11.998f)
                curveTo(2f, 11.314f, 2.069f, 10.645f, 2.2f, 9.998f)
                lineTo(7.07f, 9.999f)
                close()
                moveTo(15.426f, 9.998f)
                curveTo(15.46f, 10.427f, 15.483f, 10.867f, 15.494f, 11.315f)
                curveTo(13.686f, 11.902f, 12.225f, 13.259f, 11.499f, 14.998f)
                lineTo(8.676f, 14.999f)
                curveTo(8.562f, 14.053f, 8.5f, 13.046f, 8.5f, 11.998f)
                curveTo(8.5f, 11.484f, 8.515f, 10.979f, 8.544f, 10.487f)
                lineTo(8.577f, 9.998f)
                horizontalLineTo(15.426f)
                close()
                moveTo(21.803f, 9.998f)
                curveTo(21.934f, 10.645f, 22.003f, 11.314f, 22.003f, 11.998f)
                curveTo(22.003f, 12.263f, 21.993f, 12.524f, 21.973f, 12.783f)
                curveTo(20.807f, 11.678f, 19.233f, 11f, 17.5f, 11f)
                curveTo(17.326f, 11f, 17.155f, 11.007f, 16.985f, 11.02f)
                curveTo(16.982f, 10.897f, 16.977f, 10.776f, 16.972f, 10.655f)
                lineTo(16.933f, 9.999f)
                lineTo(21.803f, 9.998f)
                close()
                moveTo(14.838f, 2.405f)
                curveTo(17.856f, 3.296f, 20.28f, 5.572f, 21.374f, 8.498f)
                lineTo(16.783f, 8.498f)
                curveTo(16.487f, 6.233f, 15.905f, 4.267f, 15.108f, 2.851f)
                lineTo(14.946f, 2.575f)
                lineTo(14.838f, 2.405f)
                close()
                moveTo(9.165f, 2.405f)
                curveTo(8.284f, 3.754f, 7.63f, 5.734f, 7.282f, 8.059f)
                lineTo(7.221f, 8.498f)
                lineTo(2.63f, 8.498f)
                curveTo(3.671f, 5.711f, 5.92f, 3.514f, 8.739f, 2.541f)
                lineTo(9.043f, 2.442f)
                lineTo(9.165f, 2.405f)
                close()
                moveTo(12.002f, 2f)
                curveTo(13.32f, 2f, 14.647f, 4.542f, 15.215f, 8.183f)
                lineTo(15.262f, 8.498f)
                horizontalLineTo(8.741f)
                curveTo(9.28f, 4.689f, 10.645f, 2f, 12.002f, 2f)
                close()
            }
        }.build()

        return _GlobeAdd!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeAdd: ImageVector? = null

@Preview
@Composable
private fun GlobeAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GlobeAdd, contentDescription = null)
    }
}
