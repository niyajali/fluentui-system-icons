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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.GlobeWarning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GlobeWarning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.906f, 16.501f)
            horizontalLineTo(13.209f)
            lineTo(11.271f, 20.381f)
            curveTo(11.083f, 20.757f, 11f, 21.148f, 11.004f, 21.527f)
            curveTo(10.173f, 20.743f, 9.422f, 19.032f, 8.964f, 16.795f)
            lineTo(8.906f, 16.501f)
            close()
            moveTo(8.676f, 15.001f)
            horizontalLineTo(13.959f)
            lineTo(15.267f, 12.383f)
            curveTo(15.336f, 12.244f, 15.415f, 12.115f, 15.503f, 11.997f)
            curveTo(15.503f, 11.312f, 15.476f, 10.645f, 15.426f, 10f)
            horizontalLineTo(8.577f)
            lineTo(8.544f, 10.489f)
            curveTo(8.515f, 10.981f, 8.5f, 11.486f, 8.5f, 12f)
            curveTo(8.5f, 13.048f, 8.562f, 14.055f, 8.676f, 15.001f)
            close()
            moveTo(19.741f, 12.383f)
            lineTo(21.049f, 15.001f)
            horizontalLineTo(21.545f)
            curveTo(21.843f, 14.054f, 22.003f, 13.046f, 22.003f, 12f)
            curveTo(22.003f, 11.316f, 21.934f, 10.646f, 21.803f, 10f)
            lineTo(16.933f, 10.001f)
            lineTo(16.972f, 10.657f)
            curveTo(16.978f, 10.788f, 16.983f, 10.92f, 16.988f, 11.053f)
            curveTo(18.03f, 10.838f, 19.191f, 11.281f, 19.741f, 12.383f)
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
            moveTo(16.161f, 12.83f)
            lineTo(12.164f, 20.828f)
            curveTo(11.665f, 21.826f, 12.391f, 23f, 13.507f, 23f)
            horizontalLineTo(21.501f)
            curveTo(22.617f, 23f, 23.342f, 21.826f, 22.844f, 20.828f)
            lineTo(18.847f, 12.83f)
            curveTo(18.294f, 11.723f, 16.714f, 11.723f, 16.161f, 12.83f)
            close()
            moveTo(18.004f, 15.496f)
            verticalLineTo(18.497f)
            curveTo(18.004f, 18.774f, 17.78f, 18.998f, 17.504f, 18.998f)
            curveTo(17.228f, 18.998f, 17.003f, 18.774f, 17.003f, 18.497f)
            verticalLineTo(15.496f)
            curveTo(17.003f, 15.219f, 17.228f, 14.995f, 17.504f, 14.995f)
            curveTo(17.78f, 14.995f, 18.004f, 15.219f, 18.004f, 15.496f)
            close()
            moveTo(17.504f, 20.999f)
            curveTo(17.228f, 20.999f, 17.003f, 20.775f, 17.003f, 20.499f)
            curveTo(17.003f, 20.222f, 17.228f, 19.998f, 17.504f, 19.998f)
            curveTo(17.78f, 19.998f, 18.004f, 20.222f, 18.004f, 20.499f)
            curveTo(18.004f, 20.775f, 17.78f, 20.999f, 17.504f, 20.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GlobeWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GlobeWarning, contentDescription = null)
    }
}
