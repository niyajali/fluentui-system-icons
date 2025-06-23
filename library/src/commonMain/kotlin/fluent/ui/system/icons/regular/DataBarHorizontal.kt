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

public val FluentIcons.Regular.DataBarHorizontal: ImageVector
    get() {
        if (_DataBarHorizontal != null) {
            return _DataBarHorizontal!!
        }
        _DataBarHorizontal = ImageVector.Builder(
            name = "Regular.DataBarHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 18.251f)
                curveTo(21f, 17.009f, 19.993f, 16.002f, 18.751f, 16.002f)
                horizontalLineTo(5.249f)
                curveTo(4.007f, 16.002f, 3f, 17.009f, 3f, 18.251f)
                curveTo(3f, 19.493f, 4.007f, 20.5f, 5.249f, 20.5f)
                horizontalLineTo(18.751f)
                curveTo(19.993f, 20.5f, 21f, 19.493f, 21f, 18.251f)
                close()
                moveTo(17f, 11.751f)
                curveTo(17f, 10.509f, 15.993f, 9.502f, 14.751f, 9.502f)
                lineTo(5.249f, 9.502f)
                curveTo(4.007f, 9.502f, 3f, 10.509f, 3f, 11.751f)
                curveTo(3f, 12.993f, 4.007f, 14f, 5.249f, 14f)
                horizontalLineTo(14.751f)
                curveTo(15.993f, 14f, 17f, 12.993f, 17f, 11.751f)
                close()
                moveTo(13f, 5.251f)
                curveTo(13f, 4.009f, 11.993f, 3.002f, 10.751f, 3.002f)
                lineTo(5.249f, 3.002f)
                curveTo(4.007f, 3.002f, 3f, 4.009f, 3f, 5.251f)
                curveTo(3f, 6.493f, 4.007f, 7.5f, 5.249f, 7.5f)
                lineTo(10.751f, 7.5f)
                curveTo(11.993f, 7.5f, 13f, 6.493f, 13f, 5.251f)
                close()
                moveTo(19.5f, 18.251f)
                curveTo(19.5f, 18.665f, 19.165f, 19f, 18.751f, 19f)
                horizontalLineTo(5.249f)
                curveTo(4.835f, 19f, 4.5f, 18.665f, 4.5f, 18.251f)
                curveTo(4.5f, 17.837f, 4.835f, 17.502f, 5.249f, 17.502f)
                horizontalLineTo(18.751f)
                curveTo(19.165f, 17.502f, 19.5f, 17.837f, 19.5f, 18.251f)
                close()
                moveTo(15.5f, 11.751f)
                curveTo(15.5f, 12.165f, 15.165f, 12.5f, 14.751f, 12.5f)
                horizontalLineTo(5.249f)
                curveTo(4.835f, 12.5f, 4.5f, 12.165f, 4.5f, 11.751f)
                curveTo(4.5f, 11.337f, 4.835f, 11.002f, 5.249f, 11.002f)
                horizontalLineTo(14.751f)
                curveTo(15.165f, 11.002f, 15.5f, 11.337f, 15.5f, 11.751f)
                close()
                moveTo(11.5f, 5.251f)
                curveTo(11.5f, 5.665f, 11.165f, 6f, 10.751f, 6f)
                lineTo(5.249f, 6f)
                curveTo(4.835f, 6f, 4.5f, 5.665f, 4.5f, 5.251f)
                curveTo(4.5f, 4.837f, 4.835f, 4.502f, 5.249f, 4.502f)
                lineTo(10.751f, 4.502f)
                curveTo(11.165f, 4.502f, 11.5f, 4.837f, 11.5f, 5.251f)
                close()
            }
        }.build()

        return _DataBarHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _DataBarHorizontal: ImageVector? = null

@Preview
@Composable
private fun DataBarHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DataBarHorizontal, contentDescription = null)
    }
}
