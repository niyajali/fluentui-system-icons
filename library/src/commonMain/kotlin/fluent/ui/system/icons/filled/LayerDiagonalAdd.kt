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

public val FluentIcons.Filled.LayerDiagonalAdd: ImageVector
    get() {
        if (_LayerDiagonalAdd != null) {
            return _LayerDiagonalAdd!!
        }
        _LayerDiagonalAdd = ImageVector.Builder(
            name = "Filled.LayerDiagonalAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.984f, 2.136f)
                curveTo(12.451f, 1.605f, 14f, 2.692f, 14f, 4.252f)
                verticalLineTo(4.429f)
                lineTo(7.474f, 6.79f)
                curveTo(5.989f, 7.328f, 5f, 8.738f, 5f, 10.317f)
                verticalLineTo(15.87f)
                curveTo(3.538f, 16.388f, 2f, 15.304f, 2f, 13.749f)
                verticalLineTo(7.667f)
                curveTo(2f, 6.299f, 2.857f, 5.077f, 4.144f, 4.611f)
                lineTo(10.984f, 2.136f)
                close()
                moveTo(14.984f, 5.136f)
                curveTo(16.451f, 4.605f, 18f, 5.692f, 18f, 7.252f)
                verticalLineTo(7.429f)
                lineTo(11.144f, 9.91f)
                curveTo(9.857f, 10.375f, 9f, 11.597f, 9f, 12.966f)
                verticalLineTo(18.871f)
                curveTo(7.538f, 19.388f, 6f, 18.304f, 6f, 16.749f)
                verticalLineTo(10.317f)
                curveTo(6f, 9.159f, 6.725f, 8.125f, 7.814f, 7.731f)
                lineTo(14.984f, 5.136f)
                close()
                moveTo(18.984f, 8.136f)
                curveTo(20.451f, 7.605f, 22f, 8.692f, 22f, 10.252f)
                verticalLineTo(12.022f)
                curveTo(20.99f, 11.375f, 19.789f, 11f, 18.5f, 11f)
                curveTo(14.91f, 11f, 12f, 13.91f, 12f, 17.5f)
                curveTo(12f, 19.092f, 12.573f, 20.551f, 13.523f, 21.681f)
                lineTo(13.016f, 21.865f)
                curveTo(11.549f, 22.396f, 10f, 21.309f, 10f, 19.749f)
                verticalLineTo(12.966f)
                curveTo(10f, 12.019f, 10.594f, 11.172f, 11.484f, 10.85f)
                lineTo(18.984f, 8.136f)
                close()
                moveTo(24f, 17.5f)
                curveTo(24f, 14.462f, 21.538f, 12f, 18.5f, 12f)
                curveTo(15.462f, 12f, 13f, 14.462f, 13f, 17.5f)
                curveTo(13f, 20.538f, 15.462f, 23f, 18.5f, 23f)
                curveTo(21.538f, 23f, 24f, 20.538f, 24f, 17.5f)
                close()
                moveTo(19.001f, 18f)
                lineTo(19.001f, 20.503f)
                curveTo(19.001f, 20.78f, 18.777f, 21.003f, 18.501f, 21.003f)
                curveTo(18.225f, 21.003f, 18.001f, 20.78f, 18.001f, 20.503f)
                lineTo(18.001f, 18f)
                horizontalLineTo(15.496f)
                curveTo(15.22f, 18f, 14.996f, 17.776f, 14.996f, 17.5f)
                curveTo(14.996f, 17.224f, 15.22f, 17f, 15.496f, 17f)
                horizontalLineTo(18f)
                lineTo(18f, 14.499f)
                curveTo(18f, 14.223f, 18.224f, 13.999f, 18.5f, 13.999f)
                curveTo(18.776f, 13.999f, 19f, 14.223f, 19f, 14.499f)
                lineTo(19f, 17f)
                horizontalLineTo(21.497f)
                curveTo(21.772f, 17f, 21.996f, 17.224f, 21.996f, 17.5f)
                curveTo(21.996f, 17.776f, 21.772f, 18f, 21.497f, 18f)
                horizontalLineTo(19.001f)
                close()
            }
        }.build()

        return _LayerDiagonalAdd!!
    }

@Suppress("ObjectPropertyName")
private var _LayerDiagonalAdd: ImageVector? = null

@Preview
@Composable
private fun LayerDiagonalAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LayerDiagonalAdd, contentDescription = null)
    }
}
