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

public val FluentIcons.Regular.CreditCardPerson: ImageVector
    get() {
        if (_CreditCardPerson != null) {
            return _CreditCardPerson!!
        }
        _CreditCardPerson = ImageVector.Builder(
            name = "Regular.CreditCardPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 5f)
                curveTo(3.455f, 5f, 2f, 6.455f, 2f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
                horizontalLineTo(13.109f)
                curveTo(13.287f, 18.385f, 13.672f, 17.858f, 14.184f, 17.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 17.5f, 3.5f, 16.716f, 3.5f, 15.75f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(8.25f)
                curveTo(22f, 6.455f, 20.545f, 5f, 18.75f, 5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(20.5f, 8.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(8.25f)
                curveTo(3.5f, 7.284f, 4.284f, 6.5f, 5.25f, 6.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 6.5f, 20.5f, 7.284f, 20.5f, 8.25f)
                close()
                moveTo(21f, 14.5f)
                curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
                curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
                curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
                curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
                close()
                moveTo(23f, 19.875f)
                curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
                curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
                horizontalLineTo(21.227f)
                curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }.build()

        return _CreditCardPerson!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardPerson: ImageVector? = null

@Preview
@Composable
private fun CreditCardPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CreditCardPerson, contentDescription = null)
    }
}
