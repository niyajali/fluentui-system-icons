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

public val FluentIcons.Filled.GlobeSync: ImageVector
    get() {
        if (_GlobeSync != null) {
            return _GlobeSync!!
        }
        _GlobeSync = ImageVector.Builder(
            name = "Filled.GlobeSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.906f, 16.501f)
                horizontalLineTo(11.076f)
                curveTo(11.026f, 16.826f, 11f, 17.16f, 11f, 17.5f)
                curveTo(11f, 19.153f, 11.617f, 20.662f, 12.633f, 21.809f)
                curveTo(12.425f, 21.934f, 12.213f, 21.999f, 12.002f, 21.999f)
                curveTo(10.805f, 21.999f, 9.601f, 19.905f, 8.964f, 16.795f)
                lineTo(8.906f, 16.501f)
                close()
                moveTo(8.676f, 15.001f)
                horizontalLineTo(11.498f)
                curveTo(12.224f, 13.26f, 13.685f, 11.902f, 15.494f, 11.315f)
                curveTo(15.483f, 10.868f, 15.459f, 10.429f, 15.426f, 10f)
                horizontalLineTo(8.577f)
                lineTo(8.544f, 10.489f)
                curveTo(8.515f, 10.981f, 8.5f, 11.486f, 8.5f, 12f)
                curveTo(8.5f, 13.048f, 8.562f, 14.055f, 8.676f, 15.001f)
                close()
                moveTo(17.5f, 11f)
                curveTo(19.233f, 11f, 20.808f, 11.678f, 21.973f, 12.784f)
                curveTo(21.993f, 12.525f, 22.003f, 12.264f, 22.003f, 12f)
                curveTo(22.003f, 11.316f, 21.934f, 10.646f, 21.803f, 10f)
                lineTo(16.933f, 10.001f)
                lineTo(16.972f, 10.657f)
                curveTo(16.977f, 10.777f, 16.982f, 10.898f, 16.986f, 11.02f)
                curveTo(17.156f, 11.007f, 17.327f, 11f, 17.5f, 11f)
                close()
                moveTo(3.067f, 16.501f)
                lineTo(7.373f, 16.501f)
                curveTo(7.738f, 18.583f, 8.356f, 20.354f, 9.165f, 21.594f)
                curveTo(6.602f, 20.837f, 4.469f, 19.083f, 3.214f, 16.78f)
                lineTo(3.067f, 16.501f)
                close()
                moveTo(2.2f, 10f)
                lineTo(7.07f, 10.001f)
                curveTo(7.024f, 10.651f, 7f, 11.319f, 7f, 12f)
                curveTo(7f, 12.83f, 7.035f, 13.64f, 7.103f, 14.421f)
                lineTo(7.16f, 15.001f)
                horizontalLineTo(2.458f)
                curveTo(2.16f, 14.054f, 2f, 13.046f, 2f, 12f)
                curveTo(2f, 11.316f, 2.069f, 10.646f, 2.2f, 10f)
                close()
                moveTo(14.946f, 2.577f)
                lineTo(14.838f, 2.407f)
                curveTo(17.856f, 3.298f, 20.28f, 5.574f, 21.374f, 8.5f)
                lineTo(16.783f, 8.5f)
                curveTo(16.467f, 6.084f, 15.826f, 4.008f, 14.946f, 2.577f)
                close()
                moveTo(9.043f, 2.444f)
                lineTo(9.165f, 2.407f)
                curveTo(8.284f, 3.756f, 7.63f, 5.736f, 7.282f, 8.061f)
                lineTo(7.221f, 8.5f)
                lineTo(2.63f, 8.5f)
                curveTo(3.708f, 5.614f, 6.082f, 3.359f, 9.043f, 2.444f)
                close()
                moveTo(12.002f, 2.002f)
                curveTo(13.32f, 2.002f, 14.647f, 4.544f, 15.215f, 8.185f)
                lineTo(15.262f, 8.5f)
                horizontalLineTo(8.741f)
                curveTo(9.28f, 4.691f, 10.645f, 2.002f, 12.002f, 2.002f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                close()
                moveTo(20.5f, 14f)
                curveTo(20.776f, 14f, 21f, 14.224f, 21f, 14.5f)
                verticalLineTo(16.5f)
                curveTo(21f, 16.776f, 20.776f, 17f, 20.5f, 17f)
                horizontalLineTo(18.5f)
                curveTo(18.224f, 17f, 18f, 16.776f, 18f, 16.5f)
                curveTo(18f, 16.224f, 18.224f, 16f, 18.5f, 16f)
                horizontalLineTo(19.5f)
                curveTo(19.044f, 15.392f, 18.317f, 15f, 17.5f, 15f)
                curveTo(16.667f, 15f, 15.928f, 15.407f, 15.473f, 16.036f)
                curveTo(15.311f, 16.26f, 14.999f, 16.31f, 14.775f, 16.148f)
                curveTo(14.551f, 15.986f, 14.501f, 15.673f, 14.663f, 15.45f)
                curveTo(15.298f, 14.572f, 16.332f, 14f, 17.5f, 14f)
                curveTo(18.48f, 14f, 19.365f, 14.403f, 20f, 15.051f)
                verticalLineTo(14.5f)
                curveTo(20f, 14.224f, 20.224f, 14f, 20.5f, 14f)
                close()
                moveTo(15f, 19.949f)
                verticalLineTo(20.5f)
                curveTo(15f, 20.776f, 14.776f, 21f, 14.5f, 21f)
                curveTo(14.224f, 21f, 14f, 20.776f, 14f, 20.5f)
                verticalLineTo(18.5f)
                curveTo(14f, 18.224f, 14.224f, 18f, 14.5f, 18f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 18f, 17f, 18.224f, 17f, 18.5f)
                curveTo(17f, 18.776f, 16.776f, 19f, 16.5f, 19f)
                horizontalLineTo(15.5f)
                curveTo(15.956f, 19.608f, 16.683f, 20f, 17.5f, 20f)
                curveTo(18.266f, 20f, 18.952f, 19.656f, 19.411f, 19.112f)
                curveTo(19.589f, 18.901f, 19.905f, 18.874f, 20.116f, 19.052f)
                curveTo(20.327f, 19.23f, 20.353f, 19.546f, 20.175f, 19.757f)
                curveTo(19.534f, 20.516f, 18.573f, 21f, 17.5f, 21f)
                curveTo(16.52f, 21f, 15.635f, 20.597f, 15f, 19.949f)
                close()
            }
        }.build()

        return _GlobeSync!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeSync: ImageVector? = null

@Preview
@Composable
private fun GlobeSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GlobeSync, contentDescription = null)
    }
}
