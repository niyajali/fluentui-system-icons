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

public val FluentIcons.Regular.DualScreenSpan: ImageVector
    get() {
        if (_DualScreenSpan != null) {
            return _DualScreenSpan!!
        }
        _DualScreenSpan = ImageVector.Builder(
            name = "Regular.DualScreenSpan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.311f, 10.249f)
                curveTo(8.586f, 9.939f, 8.559f, 9.465f, 8.249f, 9.19f)
                curveTo(7.939f, 8.915f, 7.465f, 8.943f, 7.19f, 9.252f)
                lineTo(5.19f, 11.502f)
                curveTo(4.938f, 11.787f, 4.938f, 12.215f, 5.19f, 12.499f)
                lineTo(7.19f, 14.749f)
                curveTo(7.465f, 15.059f, 7.939f, 15.087f, 8.249f, 14.811f)
                curveTo(8.559f, 14.536f, 8.586f, 14.062f, 8.311f, 13.752f)
                lineTo(7.421f, 12.751f)
                horizontalLineTo(16.581f)
                lineTo(15.69f, 13.752f)
                curveTo(15.415f, 14.062f, 15.443f, 14.536f, 15.752f, 14.811f)
                curveTo(16.062f, 15.087f, 16.536f, 15.059f, 16.811f, 14.749f)
                lineTo(18.811f, 12.499f)
                lineTo(18.822f, 12.487f)
                curveTo(18.927f, 12.363f, 18.993f, 12.205f, 19f, 12.032f)
                curveTo(19.001f, 12.012f, 19.001f, 11.992f, 19f, 11.972f)
                curveTo(18.993f, 11.791f, 18.922f, 11.626f, 18.809f, 11.5f)
                lineTo(16.811f, 9.252f)
                curveTo(16.536f, 8.943f, 16.062f, 8.915f, 15.752f, 9.19f)
                curveTo(15.443f, 9.465f, 15.415f, 9.939f, 15.69f, 10.249f)
                lineTo(16.581f, 11.251f)
                horizontalLineTo(7.421f)
                lineTo(8.311f, 10.249f)
                close()
                moveTo(12.755f, 4.002f)
                lineTo(12.755f, 4.004f)
                lineTo(20.253f, 4.004f)
                curveTo(21.219f, 4.004f, 22.003f, 4.788f, 22.003f, 5.754f)
                verticalLineTo(18.25f)
                curveTo(22.003f, 19.216f, 21.219f, 20f, 20.253f, 20f)
                horizontalLineTo(11.255f)
                lineTo(11.255f, 19.997f)
                lineTo(3.758f, 19.997f)
                curveTo(2.791f, 19.997f, 2.008f, 19.214f, 2.008f, 18.247f)
                verticalLineTo(5.752f)
                curveTo(2.008f, 4.785f, 2.791f, 4.002f, 3.758f, 4.002f)
                horizontalLineTo(12.755f)
                close()
                moveTo(20.253f, 5.504f)
                horizontalLineTo(12.755f)
                verticalLineTo(10.501f)
                horizontalLineTo(11.255f)
                verticalLineTo(5.502f)
                horizontalLineTo(3.758f)
                curveTo(3.62f, 5.502f, 3.508f, 5.614f, 3.508f, 5.752f)
                verticalLineTo(18.247f)
                curveTo(3.508f, 18.385f, 3.62f, 18.497f, 3.758f, 18.497f)
                horizontalLineTo(11.255f)
                verticalLineTo(13.501f)
                lineTo(12.755f, 13.501f)
                verticalLineTo(18.5f)
                horizontalLineTo(20.253f)
                curveTo(20.391f, 18.5f, 20.503f, 18.388f, 20.503f, 18.25f)
                verticalLineTo(5.754f)
                curveTo(20.503f, 5.616f, 20.391f, 5.504f, 20.253f, 5.504f)
                close()
            }
        }.build()

        return _DualScreenSpan!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreenSpan: ImageVector? = null

@Preview
@Composable
private fun DualScreenSpanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DualScreenSpan, contentDescription = null)
    }
}
