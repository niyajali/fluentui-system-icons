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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.GlobeDesktop: ImageVector
    get() {
        if (_GlobeDesktop != null) {
            return _GlobeDesktop!!
        }
        _GlobeDesktop = ImageVector.Builder(
            name = "Regular.GlobeDesktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22.002f, 11.999f)
                curveTo(22.001f, 6.476f, 17.524f, 1.998f, 12f, 1.998f)
                curveTo(6.476f, 1.998f, 1.999f, 6.476f, 1.999f, 12f)
                curveTo(1.999f, 17.186f, 5.946f, 21.45f, 11f, 21.952f)
                verticalLineTo(20.109f)
                curveTo(10.222f, 19.497f, 9.522f, 18.204f, 9.061f, 16.499f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(8.738f)
                curveTo(8.585f, 14.069f, 8.499f, 13.059f, 8.499f, 12f)
                curveTo(8.499f, 11.309f, 8.535f, 10.639f, 8.603f, 9.999f)
                horizontalLineTo(15.397f)
                curveTo(15.465f, 10.639f, 15.502f, 11.309f, 15.502f, 11.999f)
                horizontalLineTo(17.002f)
                curveTo(17.002f, 11.315f, 16.969f, 10.646f, 16.907f, 9.999f)
                lineTo(20.265f, 9.998f)
                curveTo(20.42f, 10.64f, 20.502f, 11.31f, 20.502f, 11.999f)
                horizontalLineTo(22f)
                lineTo(22.002f, 11.999f)
                close()
                moveTo(4.786f, 16.5f)
                lineTo(7.508f, 16.5f)
                lineTo(7.61f, 16.895f)
                curveTo(7.927f, 18.064f, 8.358f, 19.091f, 8.88f, 19.91f)
                curveTo(7.178f, 19.238f, 5.744f, 18.033f, 4.786f, 16.5f)
                close()
                moveTo(3.736f, 9.999f)
                horizontalLineTo(7.094f)
                curveTo(7.031f, 10.646f, 6.999f, 11.316f, 6.999f, 12f)
                curveTo(6.999f, 13.042f, 7.074f, 14.05f, 7.216f, 15f)
                lineTo(4.043f, 15f)
                curveTo(3.691f, 14.067f, 3.499f, 13.056f, 3.499f, 12f)
                curveTo(3.499f, 11.317f, 3.579f, 10.653f, 3.731f, 10.016f)
                lineTo(3.736f, 9.999f)
                close()
                moveTo(8.858f, 4.097f)
                lineTo(8.881f, 4.089f)
                curveTo(8.159f, 5.221f, 7.612f, 6.747f, 7.298f, 8.5f)
                lineTo(4.25f, 8.499f)
                curveTo(5.155f, 6.499f, 6.811f, 4.912f, 8.858f, 4.097f)
                close()
                moveTo(11.884f, 3.503f)
                lineTo(12f, 3.498f)
                lineTo(12.126f, 3.504f)
                curveTo(13.388f, 3.63f, 14.605f, 5.629f, 15.171f, 8.499f)
                horizontalLineTo(8.829f)
                curveTo(9.397f, 5.621f, 10.619f, 3.619f, 11.884f, 3.503f)
                close()
                moveTo(15.227f, 4.263f)
                lineTo(15.12f, 4.089f)
                lineTo(15.411f, 4.21f)
                curveTo(17.334f, 5.053f, 18.885f, 6.588f, 19.75f, 8.499f)
                lineTo(16.702f, 8.5f)
                curveTo(16.404f, 6.835f, 15.896f, 5.375f, 15.227f, 4.263f)
                close()
                moveTo(12f, 18.999f)
                curveTo(12f, 19.551f, 12.448f, 19.999f, 13f, 19.999f)
                horizontalLineTo(16f)
                verticalLineTo(21.999f)
                horizontalLineTo(15.5f)
                curveTo(15.224f, 21.999f, 15f, 22.223f, 15f, 22.499f)
                curveTo(15f, 22.775f, 15.224f, 22.999f, 15.5f, 22.999f)
                horizontalLineTo(19.5f)
                curveTo(19.776f, 22.999f, 20f, 22.775f, 20f, 22.499f)
                curveTo(20f, 22.223f, 19.776f, 21.999f, 19.5f, 21.999f)
                horizontalLineTo(19f)
                verticalLineTo(19.999f)
                horizontalLineTo(22f)
                curveTo(22.552f, 19.999f, 23f, 19.551f, 23f, 18.999f)
                verticalLineTo(13.999f)
                curveTo(23f, 13.447f, 22.552f, 12.999f, 22f, 12.999f)
                horizontalLineTo(13f)
                curveTo(12.448f, 12.999f, 12f, 13.447f, 12f, 13.999f)
                verticalLineTo(18.999f)
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
        Image(imageVector = FluentIcons.Regular.GlobeDesktop, contentDescription = null)
    }
}
