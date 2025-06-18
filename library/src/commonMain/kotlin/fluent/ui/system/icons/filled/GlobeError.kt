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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.GlobeError: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GlobeError",
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
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(17.5f, 14f)
            curveTo(17.224f, 14f, 17f, 14.224f, 17f, 14.5f)
            verticalLineTo(18.5f)
            curveTo(17f, 18.776f, 17.224f, 19f, 17.5f, 19f)
            curveTo(17.776f, 19f, 18f, 18.776f, 18f, 18.5f)
            verticalLineTo(14.5f)
            curveTo(18f, 14.224f, 17.776f, 14f, 17.5f, 14f)
            close()
            moveTo(17.5f, 21.125f)
            curveTo(17.845f, 21.125f, 18.125f, 20.845f, 18.125f, 20.5f)
            curveTo(18.125f, 20.155f, 17.845f, 19.875f, 17.5f, 19.875f)
            curveTo(17.155f, 19.875f, 16.875f, 20.155f, 16.875f, 20.5f)
            curveTo(16.875f, 20.845f, 17.155f, 21.125f, 17.5f, 21.125f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GlobeErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.GlobeError, contentDescription = null)
    }
}
