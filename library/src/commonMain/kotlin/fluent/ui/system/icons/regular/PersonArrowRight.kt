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

public val FluentIcons.Regular.PersonArrowRight: ImageVector
    get() {
        if (_PersonArrowRight != null) {
            return _PersonArrowRight!!
        }
        _PersonArrowRight = ImageVector.Builder(
            name = "Regular.PersonArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.314f, 15.5f)
                curveTo(11.486f, 14.967f, 11.726f, 14.463f, 12.022f, 14f)
                horizontalLineTo(4.253f)
                curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
                verticalLineTo(16.827f)
                curveTo(2.004f, 17.719f, 2.322f, 18.583f, 2.902f, 19.262f)
                curveTo(4.468f, 21.096f, 6.854f, 22.001f, 10f, 22.001f)
                curveTo(10.932f, 22.001f, 11.796f, 21.922f, 12.593f, 21.763f)
                curveTo(12.234f, 21.35f, 11.926f, 20.89f, 11.679f, 20.396f)
                curveTo(11.156f, 20.466f, 10.596f, 20.501f, 10f, 20.501f)
                curveTo(7.262f, 20.501f, 5.296f, 19.756f, 4.043f, 18.288f)
                curveTo(3.695f, 17.881f, 3.504f, 17.362f, 3.504f, 16.827f)
                verticalLineTo(16.249f)
                curveTo(3.504f, 15.835f, 3.839f, 15.5f, 4.253f, 15.5f)
                horizontalLineTo(11.314f)
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
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.463f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.463f, 14.463f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
                close()
                moveTo(18.354f, 14.647f)
                curveTo(18.159f, 14.451f, 17.842f, 14.451f, 17.647f, 14.647f)
                curveTo(17.452f, 14.842f, 17.452f, 15.159f, 17.647f, 15.354f)
                lineTo(19.293f, 17f)
                horizontalLineTo(15f)
                curveTo(14.724f, 17f, 14.5f, 17.224f, 14.5f, 17.5f)
                curveTo(14.5f, 17.776f, 14.724f, 18f, 15f, 18f)
                horizontalLineTo(19.293f)
                lineTo(17.647f, 19.647f)
                curveTo(17.452f, 19.842f, 17.452f, 20.159f, 17.647f, 20.354f)
                curveTo(17.842f, 20.549f, 18.159f, 20.549f, 18.354f, 20.354f)
                lineTo(20.854f, 17.854f)
                curveTo(20.907f, 17.801f, 20.946f, 17.739f, 20.97f, 17.672f)
                curveTo(20.989f, 17.621f, 20.999f, 17.567f, 21f, 17.51f)
                lineTo(21f, 17.5f)
                curveTo(21f, 17.423f, 20.983f, 17.35f, 20.952f, 17.285f)
                curveTo(20.936f, 17.253f, 20.917f, 17.222f, 20.895f, 17.193f)
                curveTo(20.881f, 17.175f, 20.866f, 17.158f, 20.85f, 17.143f)
                lineTo(18.354f, 14.647f)
                close()
            }
        }.build()

        return _PersonArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _PersonArrowRight: ImageVector? = null

@Preview
@Composable
private fun PersonArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonArrowRight, contentDescription = null)
    }
}
