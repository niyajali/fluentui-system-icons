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

public val FluentIcons.Regular.AlbumAdd: ImageVector
    get() {
        if (_AlbumAdd != null) {
            return _AlbumAdd!!
        }
        _AlbumAdd = ImageVector.Builder(
            name = "Regular.AlbumAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 6f)
                curveTo(2f, 4.895f, 2.895f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                curveTo(21.105f, 4f, 22f, 4.895f, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 19.105f, 21.105f, 20f, 20f, 20f)
                horizontalLineTo(12.502f)
                curveTo(12.7f, 19.526f, 12.843f, 19.023f, 12.924f, 18.5f)
                horizontalLineTo(20f)
                curveTo(20.276f, 18.5f, 20.5f, 18.276f, 20.5f, 18f)
                verticalLineTo(6f)
                curveTo(20.5f, 5.724f, 20.276f, 5.5f, 20f, 5.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.076f)
                curveTo(7.174f, 11.026f, 6.84f, 11f, 6.5f, 11f)
                curveTo(6.332f, 11f, 6.165f, 11.006f, 6f, 11.019f)
                verticalLineTo(5.5f)
                horizontalLineTo(4f)
                curveTo(3.724f, 5.5f, 3.5f, 5.724f, 3.5f, 6f)
                verticalLineTo(11.732f)
                curveTo(2.949f, 12.019f, 2.444f, 12.383f, 2f, 12.81f)
                verticalLineTo(6f)
                close()
                moveTo(12f, 7f)
                curveTo(10.895f, 7f, 10f, 7.895f, 10f, 9f)
                verticalLineTo(10f)
                curveTo(10f, 11.105f, 10.895f, 12f, 12f, 12f)
                horizontalLineTo(16f)
                curveTo(17.105f, 12f, 18f, 11.105f, 18f, 10f)
                verticalLineTo(9f)
                curveTo(18f, 7.895f, 17.105f, 7f, 16f, 7f)
                horizontalLineTo(12f)
                close()
                moveTo(16f, 8.5f)
                curveTo(16.276f, 8.5f, 16.5f, 8.724f, 16.5f, 9f)
                verticalLineTo(10f)
                curveTo(16.5f, 10.276f, 16.276f, 10.5f, 16f, 10.5f)
                horizontalLineTo(12f)
                curveTo(11.724f, 10.5f, 11.5f, 10.276f, 11.5f, 10f)
                verticalLineTo(9f)
                curveTo(11.5f, 8.724f, 11.724f, 8.5f, 12f, 8.5f)
                horizontalLineTo(16f)
                close()
                moveTo(6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                close()
                moveTo(7.001f, 20.503f)
                lineTo(7.001f, 18f)
                horizontalLineTo(9.497f)
                curveTo(9.772f, 18f, 9.996f, 17.776f, 9.996f, 17.5f)
                curveTo(9.996f, 17.224f, 9.772f, 17f, 9.497f, 17f)
                horizontalLineTo(7f)
                lineTo(7f, 14.499f)
                curveTo(7f, 14.223f, 6.776f, 13.999f, 6.5f, 13.999f)
                curveTo(6.224f, 13.999f, 6f, 14.223f, 6f, 14.499f)
                lineTo(6f, 17f)
                horizontalLineTo(3.496f)
                curveTo(3.22f, 17f, 2.996f, 17.224f, 2.996f, 17.5f)
                curveTo(2.996f, 17.776f, 3.22f, 18f, 3.496f, 18f)
                horizontalLineTo(6.001f)
                lineTo(6.001f, 20.503f)
                curveTo(6.001f, 20.78f, 6.225f, 21.003f, 6.501f, 21.003f)
                curveTo(6.777f, 21.003f, 7.001f, 20.78f, 7.001f, 20.503f)
                close()
            }
        }.build()

        return _AlbumAdd!!
    }

@Suppress("ObjectPropertyName")
private var _AlbumAdd: ImageVector? = null

@Preview
@Composable
private fun AlbumAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AlbumAdd, contentDescription = null)
    }
}
