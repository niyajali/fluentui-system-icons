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

public val FluentIcons.Filled.LinkAdd: ImageVector
    get() {
        if (_LinkAdd != null) {
            return _LinkAdd!!
        }
        _LinkAdd = ImageVector.Builder(
            name = "Filled.LinkAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 5f)
                curveTo(9.552f, 5f, 10f, 5.448f, 10f, 6f)
                curveTo(10f, 6.513f, 9.614f, 6.936f, 9.117f, 6.993f)
                lineTo(9f, 7f)
                horizontalLineTo(7f)
                curveTo(5.343f, 7f, 4f, 8.343f, 4f, 10f)
                curveTo(4f, 11.598f, 5.249f, 12.904f, 6.824f, 12.995f)
                lineTo(7f, 13f)
                horizontalLineTo(9f)
                curveTo(9.552f, 13f, 10f, 13.448f, 10f, 14f)
                curveTo(10f, 14.513f, 9.614f, 14.936f, 9.117f, 14.993f)
                lineTo(9f, 15f)
                horizontalLineTo(7f)
                curveTo(4.239f, 15f, 2f, 12.761f, 2f, 10f)
                curveTo(2f, 7.311f, 4.122f, 5.118f, 6.783f, 5.005f)
                lineTo(7f, 5f)
                horizontalLineTo(9f)
                close()
                moveTo(17f, 5f)
                curveTo(19.761f, 5f, 22f, 7.239f, 22f, 10f)
                curveTo(22f, 10.838f, 21.794f, 11.628f, 21.429f, 12.322f)
                curveTo(20.9f, 11.92f, 20.308f, 11.597f, 19.669f, 11.371f)
                curveTo(19.881f, 10.96f, 20f, 10.494f, 20f, 10f)
                curveTo(20f, 8.402f, 18.751f, 7.096f, 17.176f, 7.005f)
                lineTo(17f, 7f)
                horizontalLineTo(15f)
                curveTo(14.448f, 7f, 14f, 6.552f, 14f, 6f)
                curveTo(14f, 5.487f, 14.386f, 5.064f, 14.883f, 5.007f)
                lineTo(15f, 5f)
                horizontalLineTo(17f)
                close()
                moveTo(7f, 9f)
                horizontalLineTo(17f)
                curveTo(17.552f, 9f, 18f, 9.448f, 18f, 10f)
                curveTo(18f, 10.513f, 17.614f, 10.936f, 17.117f, 10.993f)
                lineTo(17f, 11f)
                horizontalLineTo(7f)
                curveTo(6.448f, 11f, 6f, 10.552f, 6f, 10f)
                curveTo(6f, 9.487f, 6.386f, 9.064f, 6.883f, 9.007f)
                lineTo(7f, 9f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(18.001f, 18f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
                horizontalLineTo(17f)
                lineTo(17f, 14.499f)
                curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
                lineTo(18f, 17f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
                horizontalLineTo(18.001f)
                close()
            }
        }.build()

        return _LinkAdd!!
    }

@Suppress("ObjectPropertyName")
private var _LinkAdd: ImageVector? = null

@Preview
@Composable
private fun LinkAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LinkAdd, contentDescription = null)
    }
}
