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

public val FluentIcons.Regular.PersonAdd: ImageVector
    get() {
        if (_PersonAdd != null) {
            return _PersonAdd!!
        }
        _PersonAdd = ImageVector.Builder(
            name = "Regular.PersonAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.463f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.463f, 14.463f, 12f, 17.5f, 12f)
                close()
                moveTo(12.023f, 14f)
                curveTo(11.726f, 14.463f, 11.486f, 14.966f, 11.314f, 15.5f)
                lineTo(4.253f, 15.5f)
                curveTo(3.839f, 15.5f, 3.504f, 15.835f, 3.504f, 16.249f)
                verticalLineTo(16.827f)
                curveTo(3.504f, 17.362f, 3.695f, 17.881f, 4.043f, 18.288f)
                curveTo(5.296f, 19.756f, 7.262f, 20.501f, 10f, 20.501f)
                curveTo(10.597f, 20.501f, 11.157f, 20.466f, 11.681f, 20.395f)
                curveTo(11.926f, 20.89f, 12.233f, 21.349f, 12.592f, 21.762f)
                curveTo(11.797f, 21.922f, 10.932f, 22.001f, 10f, 22.001f)
                curveTo(6.854f, 22.001f, 4.468f, 21.096f, 2.902f, 19.262f)
                curveTo(2.322f, 18.583f, 2.004f, 17.719f, 2.004f, 16.827f)
                verticalLineTo(16.249f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.253f, 14f)
                lineTo(12.023f, 14f)
                close()
                moveTo(17.5f, 14f)
                lineTo(17.41f, 14.008f)
                curveTo(17.206f, 14.045f, 17.045f, 14.206f, 17.008f, 14.41f)
                lineTo(17f, 14.5f)
                lineTo(16.999f, 17f)
                horizontalLineTo(14.504f)
                lineTo(14.414f, 17.008f)
                curveTo(14.21f, 17.045f, 14.049f, 17.206f, 14.012f, 17.41f)
                lineTo(14.004f, 17.5f)
                lineTo(14.012f, 17.59f)
                curveTo(14.049f, 17.794f, 14.21f, 17.955f, 14.414f, 17.992f)
                lineTo(14.504f, 18f)
                horizontalLineTo(16.999f)
                lineTo(17f, 20.5f)
                lineTo(17.008f, 20.59f)
                curveTo(17.045f, 20.794f, 17.206f, 20.955f, 17.41f, 20.992f)
                lineTo(17.5f, 21f)
                lineTo(17.59f, 20.992f)
                curveTo(17.794f, 20.955f, 17.955f, 20.794f, 17.992f, 20.59f)
                lineTo(18f, 20.5f)
                lineTo(17.999f, 18f)
                horizontalLineTo(20.504f)
                lineTo(20.594f, 17.992f)
                curveTo(20.798f, 17.955f, 20.959f, 17.794f, 20.996f, 17.59f)
                lineTo(21.004f, 17.5f)
                lineTo(20.996f, 17.41f)
                curveTo(20.959f, 17.206f, 20.798f, 17.045f, 20.594f, 17.008f)
                lineTo(20.504f, 17f)
                horizontalLineTo(17.999f)
                lineTo(18f, 14.5f)
                lineTo(17.992f, 14.41f)
                curveTo(17.955f, 14.206f, 17.794f, 14.045f, 17.59f, 14.008f)
                lineTo(17.5f, 14f)
                close()
                moveTo(10f, 2.005f)
                curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
                moveTo(10f, 3.505f)
                curveTo(8.067f, 3.505f, 6.5f, 5.072f, 6.5f, 7.005f)
                curveTo(6.5f, 8.938f, 8.067f, 10.505f, 10f, 10.505f)
                curveTo(11.933f, 10.505f, 13.5f, 8.938f, 13.5f, 7.005f)
                curveTo(13.5f, 5.072f, 11.933f, 3.505f, 10f, 3.505f)
                close()
            }
        }.build()

        return _PersonAdd!!
    }

@Suppress("ObjectPropertyName")
private var _PersonAdd: ImageVector? = null

@Preview
@Composable
private fun PersonAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonAdd, contentDescription = null)
    }
}
