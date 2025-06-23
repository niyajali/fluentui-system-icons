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

public val FluentIcons.Regular.Globe: ImageVector
    get() {
        if (_Globe != null) {
            return _Globe!!
        }
        _Globe = ImageVector.Builder(
            name = "Regular.Globe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 1.998f)
                curveTo(17.524f, 1.998f, 22.002f, 6.476f, 22.002f, 12f)
                curveTo(22.002f, 17.523f, 17.524f, 22.001f, 12f, 22.001f)
                curveTo(6.476f, 22.001f, 1.999f, 17.523f, 1.999f, 12f)
                curveTo(1.999f, 6.476f, 6.476f, 1.998f, 12f, 1.998f)
                close()
                moveTo(14.939f, 16.499f)
                horizontalLineTo(9.061f)
                curveTo(9.713f, 18.913f, 10.847f, 20.501f, 12f, 20.501f)
                curveTo(13.154f, 20.501f, 14.287f, 18.913f, 14.939f, 16.499f)
                close()
                moveTo(7.508f, 16.5f)
                lineTo(4.786f, 16.5f)
                curveTo(5.744f, 18.033f, 7.178f, 19.238f, 8.88f, 19.91f)
                curveTo(8.358f, 19.091f, 7.927f, 18.064f, 7.61f, 16.895f)
                lineTo(7.508f, 16.5f)
                close()
                moveTo(19.214f, 16.5f)
                lineTo(16.492f, 16.5f)
                curveTo(16.168f, 17.834f, 15.7f, 19f, 15.119f, 19.91f)
                curveTo(16.716f, 19.28f, 18.076f, 18.181f, 19.029f, 16.783f)
                lineTo(19.214f, 16.5f)
                close()
                moveTo(7.094f, 9.999f)
                horizontalLineTo(3.736f)
                lineTo(3.731f, 10.016f)
                curveTo(3.579f, 10.653f, 3.499f, 11.317f, 3.499f, 12f)
                curveTo(3.499f, 13.056f, 3.691f, 14.067f, 4.043f, 15f)
                lineTo(7.216f, 15f)
                curveTo(7.074f, 14.05f, 6.999f, 13.042f, 6.999f, 12f)
                curveTo(6.999f, 11.316f, 7.031f, 10.646f, 7.094f, 9.999f)
                close()
                moveTo(15.397f, 9.999f)
                horizontalLineTo(8.603f)
                curveTo(8.535f, 10.639f, 8.499f, 11.309f, 8.499f, 12f)
                curveTo(8.499f, 13.059f, 8.585f, 14.069f, 8.738f, 15f)
                horizontalLineTo(15.262f)
                curveTo(15.415f, 14.069f, 15.502f, 13.059f, 15.502f, 12f)
                curveTo(15.502f, 11.309f, 15.465f, 10.639f, 15.397f, 9.999f)
                close()
                moveTo(20.265f, 9.998f)
                lineTo(16.907f, 9.999f)
                curveTo(16.969f, 10.646f, 17.002f, 11.316f, 17.002f, 12f)
                curveTo(17.002f, 13.042f, 16.926f, 14.05f, 16.784f, 15f)
                lineTo(19.957f, 15f)
                curveTo(20.309f, 14.067f, 20.502f, 13.056f, 20.502f, 12f)
                curveTo(20.502f, 11.31f, 20.42f, 10.64f, 20.265f, 9.998f)
                close()
                moveTo(8.881f, 4.089f)
                lineTo(8.858f, 4.097f)
                curveTo(6.811f, 4.912f, 5.155f, 6.499f, 4.25f, 8.499f)
                lineTo(7.298f, 8.5f)
                curveTo(7.612f, 6.747f, 8.159f, 5.221f, 8.881f, 4.089f)
                close()
                moveTo(12f, 3.498f)
                lineTo(11.884f, 3.503f)
                curveTo(10.619f, 3.619f, 9.397f, 5.621f, 8.829f, 8.499f)
                horizontalLineTo(15.171f)
                curveTo(14.605f, 5.629f, 13.388f, 3.63f, 12.126f, 3.504f)
                lineTo(12f, 3.498f)
                close()
                moveTo(15.12f, 4.089f)
                lineTo(15.227f, 4.263f)
                curveTo(15.896f, 5.375f, 16.404f, 6.835f, 16.702f, 8.5f)
                lineTo(19.75f, 8.499f)
                curveTo(18.885f, 6.588f, 17.334f, 5.053f, 15.411f, 4.21f)
                lineTo(15.12f, 4.089f)
                close()
            }
        }.build()

        return _Globe!!
    }

@Suppress("ObjectPropertyName")
private var _Globe: ImageVector? = null

@Preview
@Composable
private fun GlobePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Globe, contentDescription = null)
    }
}
