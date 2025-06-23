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

public val FluentIcons.Filled.GlobeDesktop: ImageVector
    get() {
        if (_GlobeDesktop != null) {
            return _GlobeDesktop!!
        }
        _GlobeDesktop = ImageVector.Builder(
            name = "Filled.GlobeDesktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 16.501f)
                horizontalLineTo(8.904f)
                lineTo(8.962f, 16.795f)
                curveTo(9.6f, 19.905f, 10.803f, 21.999f, 12f, 21.999f)
                curveTo(12.495f, 21.999f, 12.992f, 21.641f, 13.449f, 21f)
                horizontalLineTo(13f)
                curveTo(11.895f, 21f, 11f, 20.105f, 11f, 19f)
                verticalLineTo(16.501f)
                close()
                moveTo(11f, 15.001f)
                horizontalLineTo(8.674f)
                curveTo(8.561f, 14.055f, 8.499f, 13.048f, 8.499f, 12f)
                curveTo(8.499f, 11.486f, 8.514f, 10.981f, 8.542f, 10.489f)
                lineTo(8.576f, 10f)
                horizontalLineTo(15.425f)
                curveTo(15.475f, 10.646f, 15.502f, 11.314f, 15.502f, 12f)
                horizontalLineTo(13f)
                curveTo(11.895f, 12f, 11f, 12.895f, 11f, 14f)
                verticalLineTo(15.001f)
                close()
                moveTo(22.002f, 12f)
                lineTo(22f, 12f)
                horizontalLineTo(17.002f)
                curveTo(17.002f, 11.546f, 16.991f, 11.098f, 16.97f, 10.657f)
                lineTo(16.931f, 10.001f)
                lineTo(21.802f, 10f)
                curveTo(21.933f, 10.646f, 22.002f, 11.315f, 22.002f, 12f)
                close()
                moveTo(7.372f, 16.501f)
                lineTo(3.066f, 16.501f)
                lineTo(3.212f, 16.78f)
                curveTo(4.467f, 19.083f, 6.601f, 20.837f, 9.164f, 21.594f)
                curveTo(8.355f, 20.354f, 7.736f, 18.583f, 7.372f, 16.501f)
                close()
                moveTo(7.069f, 10.001f)
                lineTo(2.199f, 10f)
                curveTo(2.067f, 10.646f, 1.999f, 11.316f, 1.999f, 12f)
                curveTo(1.999f, 13.046f, 2.159f, 14.054f, 2.456f, 15.001f)
                horizontalLineTo(7.159f)
                lineTo(7.102f, 14.421f)
                curveTo(7.034f, 13.64f, 6.999f, 12.83f, 6.999f, 12f)
                curveTo(6.999f, 11.319f, 7.022f, 10.651f, 7.069f, 10.001f)
                close()
                moveTo(14.837f, 2.407f)
                lineTo(14.944f, 2.577f)
                curveTo(15.825f, 4.008f, 16.466f, 6.084f, 16.781f, 8.5f)
                lineTo(21.372f, 8.5f)
                curveTo(20.279f, 5.574f, 17.855f, 3.298f, 14.837f, 2.407f)
                close()
                moveTo(9.164f, 2.407f)
                lineTo(9.042f, 2.444f)
                curveTo(6.08f, 3.359f, 3.707f, 5.614f, 2.628f, 8.5f)
                lineTo(7.219f, 8.5f)
                lineTo(7.281f, 8.061f)
                curveTo(7.628f, 5.736f, 8.283f, 3.756f, 9.164f, 2.407f)
                close()
                moveTo(15.214f, 8.185f)
                curveTo(14.646f, 4.544f, 13.319f, 2.002f, 12f, 2.002f)
                curveTo(10.644f, 2.002f, 9.279f, 4.691f, 8.739f, 8.5f)
                horizontalLineTo(15.261f)
                lineTo(15.214f, 8.185f)
                close()
                moveTo(12f, 14f)
                curveTo(12f, 13.448f, 12.448f, 13f, 13f, 13f)
                horizontalLineTo(22f)
                curveTo(22.552f, 13f, 23f, 13.448f, 23f, 14f)
                verticalLineTo(19f)
                curveTo(23f, 19.552f, 22.552f, 20f, 22f, 20f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(19.5f)
                curveTo(19.776f, 22f, 20f, 22.224f, 20f, 22.5f)
                curveTo(20f, 22.776f, 19.776f, 23f, 19.5f, 23f)
                horizontalLineTo(15.5f)
                curveTo(15.224f, 23f, 15f, 22.776f, 15f, 22.5f)
                curveTo(15f, 22.224f, 15.224f, 22f, 15.5f, 22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                curveTo(12.448f, 20f, 12f, 19.552f, 12f, 19f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _GlobeDesktop!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeDesktop: ImageVector? = null

@Preview
@Composable
private fun GlobeDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GlobeDesktop, contentDescription = null)
    }
}
