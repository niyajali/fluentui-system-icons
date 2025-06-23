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

public val FluentIcons.Regular.LaptopPerson: ImageVector
    get() {
        if (_LaptopPerson != null) {
            return _LaptopPerson!!
        }
        _LaptopPerson = ImageVector.Builder(
            name = "Regular.LaptopPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 4f)
                curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
                verticalLineTo(13.75f)
                curveTo(4f, 14.993f, 5.007f, 16f, 6.25f, 16f)
                horizontalLineTo(16.051f)
                curveTo(15.632f, 15.59f, 15.316f, 15.076f, 15.145f, 14.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 14.5f, 5.5f, 14.164f, 5.5f, 13.75f)
                verticalLineTo(6.25f)
                curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 5.5f, 18.5f, 5.836f, 18.5f, 6.25f)
                verticalLineTo(10f)
                curveTo(19.037f, 10f, 19.545f, 10.121f, 20f, 10.337f)
                verticalLineTo(6.25f)
                curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
                horizontalLineTo(6.25f)
                close()
                moveTo(2.75f, 17.5f)
                horizontalLineTo(13.308f)
                curveTo(13.111f, 17.881f, 13f, 18.313f, 13f, 18.772f)
                verticalLineTo(18.875f)
                curveTo(13f, 18.917f, 13.001f, 18.958f, 13.002f, 19f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 19f, 2f, 18.664f, 2f, 18.25f)
                curveTo(2f, 17.836f, 2.336f, 17.5f, 2.75f, 17.5f)
                close()
                moveTo(21f, 13.5f)
                curveTo(21f, 14.881f, 19.881f, 16f, 18.5f, 16f)
                curveTo(17.119f, 16f, 16f, 14.881f, 16f, 13.5f)
                curveTo(16f, 12.119f, 17.119f, 11f, 18.5f, 11f)
                curveTo(19.881f, 11f, 21f, 12.119f, 21f, 13.5f)
                close()
                moveTo(23f, 18.875f)
                curveTo(23f, 20.431f, 21.714f, 22f, 18.5f, 22f)
                curveTo(15.286f, 22f, 14f, 20.437f, 14f, 18.875f)
                verticalLineTo(18.772f)
                curveTo(14f, 17.793f, 14.794f, 17f, 15.773f, 17f)
                horizontalLineTo(21.227f)
                curveTo(22.206f, 17f, 23f, 17.793f, 23f, 18.772f)
                verticalLineTo(18.875f)
                close()
            }
        }.build()

        return _LaptopPerson!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopPerson: ImageVector? = null

@Preview
@Composable
private fun LaptopPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LaptopPerson, contentDescription = null)
    }
}
