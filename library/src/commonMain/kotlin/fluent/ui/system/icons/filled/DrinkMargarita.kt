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

public val FluentIcons.Filled.DrinkMargarita: ImageVector
    get() {
        if (_DrinkMargarita != null) {
            return _DrinkMargarita!!
        }
        _DrinkMargarita = ImageVector.Builder(
            name = "Filled.DrinkMargarita",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.49f, 2.627f)
                curveTo(20.558f, 3.035f, 20.282f, 3.422f, 19.873f, 3.49f)
                lineTo(14.384f, 4.405f)
                lineTo(14.265f, 5f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 5f, 19f, 5.336f, 19f, 5.75f)
                verticalLineTo(9.75f)
                curveTo(19f, 11.461f, 17.678f, 12.863f, 16f, 12.991f)
                verticalLineTo(13.5f)
                curveTo(16f, 15.453f, 14.601f, 17.079f, 12.75f, 17.43f)
                verticalLineTo(20.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 20.5f, 16f, 20.836f, 16f, 21.25f)
                curveTo(16f, 21.664f, 15.664f, 22f, 15.25f, 22f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 22f, 8f, 21.664f, 8f, 21.25f)
                curveTo(8f, 20.836f, 8.336f, 20.5f, 8.75f, 20.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.43f)
                curveTo(9.399f, 17.079f, 8f, 15.453f, 8f, 13.5f)
                verticalLineTo(12.991f)
                curveTo(6.322f, 12.863f, 5f, 11.461f, 5f, 9.75f)
                verticalLineTo(5.75f)
                curveTo(5f, 5.336f, 5.336f, 5f, 5.75f, 5f)
                horizontalLineTo(12.735f)
                lineTo(13.014f, 3.603f)
                curveTo(13.076f, 3.297f, 13.319f, 3.062f, 13.627f, 3.01f)
                lineTo(19.627f, 2.01f)
                curveTo(20.035f, 1.942f, 20.422f, 2.218f, 20.49f, 2.627f)
                close()
                moveTo(11.985f, 8.75f)
                lineTo(12.435f, 6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(8.75f)
                horizontalLineTo(11.985f)
                close()
                moveTo(17.5f, 8.75f)
                verticalLineTo(6.5f)
                horizontalLineTo(13.965f)
                lineTo(13.515f, 8.75f)
                horizontalLineTo(17.5f)
                close()
            }
        }.build()

        return _DrinkMargarita!!
    }

@Suppress("ObjectPropertyName")
private var _DrinkMargarita: ImageVector? = null

@Preview
@Composable
private fun DrinkMargaritaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DrinkMargarita, contentDescription = null)
    }
}
