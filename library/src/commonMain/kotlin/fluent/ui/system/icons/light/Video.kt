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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.Video: ImageVector
    get() {
        if (_Video != null) {
            return _Video!!
        }
        _Video = ImageVector.Builder(
            name = "Light.Video",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.5f, 5.5f)
                curveTo(4.015f, 5.5f, 2f, 7.515f, 2f, 10f)
                verticalLineTo(22f)
                curveTo(2f, 24.485f, 4.015f, 26.5f, 6.5f, 26.5f)
                horizontalLineTo(18.5f)
                curveTo(20.985f, 26.5f, 23f, 24.485f, 23f, 22f)
                verticalLineTo(20.516f)
                lineTo(27.021f, 23.612f)
                curveTo(28.238f, 24.549f, 30f, 23.682f, 30f, 22.147f)
                verticalLineTo(9.853f)
                curveTo(30f, 8.318f, 28.238f, 7.451f, 27.021f, 8.387f)
                lineTo(23f, 11.484f)
                verticalLineTo(10f)
                curveTo(23f, 7.515f, 20.985f, 5.5f, 18.5f, 5.5f)
                horizontalLineTo(6.5f)
                close()
                moveTo(22f, 12.495f)
                curveTo(22f, 12.499f, 22f, 12.502f, 22f, 12.505f)
                verticalLineTo(19.495f)
                curveTo(22f, 19.498f, 22f, 19.501f, 22f, 19.505f)
                verticalLineTo(22f)
                curveTo(22f, 23.933f, 20.433f, 25.5f, 18.5f, 25.5f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 25.5f, 3f, 23.933f, 3f, 22f)
                verticalLineTo(10f)
                curveTo(3f, 8.067f, 4.567f, 6.5f, 6.5f, 6.5f)
                horizontalLineTo(18.5f)
                curveTo(20.433f, 6.5f, 22f, 8.067f, 22f, 10f)
                verticalLineTo(12.495f)
                close()
                moveTo(23f, 19.254f)
                verticalLineTo(12.746f)
                lineTo(27.631f, 9.18f)
                curveTo(28.19f, 8.749f, 29f, 9.148f, 29f, 9.853f)
                verticalLineTo(22.147f)
                curveTo(29f, 22.852f, 28.19f, 23.25f, 27.631f, 22.82f)
                lineTo(23f, 19.254f)
                close()
            }
        }.build()

        return _Video!!
    }

@Suppress("ObjectPropertyName")
private var _Video: ImageVector? = null

@Preview
@Composable
private fun VideoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Video, contentDescription = null)
    }
}
