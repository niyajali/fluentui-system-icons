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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.DrinkMargarita: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DrinkMargarita",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.873f, 3.49f)
            curveTo(20.282f, 3.422f, 20.558f, 3.035f, 20.49f, 2.627f)
            curveTo(20.422f, 2.218f, 20.035f, 1.942f, 19.627f, 2.01f)
            lineTo(13.627f, 3.01f)
            curveTo(13.319f, 3.062f, 13.076f, 3.297f, 13.014f, 3.603f)
            lineTo(12.735f, 5f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 5f, 5f, 5.336f, 5f, 5.75f)
            verticalLineTo(9.75f)
            curveTo(5f, 11.461f, 6.322f, 12.863f, 8f, 12.991f)
            verticalLineTo(13.5f)
            curveTo(8f, 15.453f, 9.399f, 17.079f, 11.25f, 17.43f)
            verticalLineTo(20.5f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 20.5f, 8f, 20.836f, 8f, 21.25f)
            curveTo(8f, 21.664f, 8.336f, 22f, 8.75f, 22f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 22f, 16f, 21.664f, 16f, 21.25f)
            curveTo(16f, 20.836f, 15.664f, 20.5f, 15.25f, 20.5f)
            horizontalLineTo(12.75f)
            verticalLineTo(17.43f)
            curveTo(14.601f, 17.079f, 16f, 15.453f, 16f, 13.5f)
            verticalLineTo(12.991f)
            curveTo(17.678f, 12.863f, 19f, 11.461f, 19f, 9.75f)
            verticalLineTo(5.75f)
            curveTo(19f, 5.336f, 18.664f, 5f, 18.25f, 5f)
            horizontalLineTo(14.265f)
            lineTo(14.384f, 4.405f)
            lineTo(19.873f, 3.49f)
            close()
            moveTo(17.5f, 8f)
            horizontalLineTo(13.665f)
            lineTo(13.965f, 6.5f)
            horizontalLineTo(17.5f)
            verticalLineTo(8f)
            close()
            moveTo(13.365f, 9.5f)
            horizontalLineTo(17.5f)
            verticalLineTo(9.75f)
            curveTo(17.5f, 10.717f, 16.716f, 11.5f, 15.75f, 11.5f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 11.5f, 14.5f, 11.836f, 14.5f, 12.25f)
            verticalLineTo(13.5f)
            curveTo(14.5f, 14.881f, 13.381f, 16f, 12f, 16f)
            curveTo(10.619f, 16f, 9.5f, 14.881f, 9.5f, 13.5f)
            verticalLineTo(12.25f)
            curveTo(9.5f, 11.836f, 9.164f, 11.5f, 8.75f, 11.5f)
            horizontalLineTo(8.25f)
            curveTo(7.284f, 11.5f, 6.5f, 10.717f, 6.5f, 9.75f)
            verticalLineTo(9.5f)
            horizontalLineTo(11.835f)
            lineTo(11.014f, 13.603f)
            curveTo(10.933f, 14.009f, 11.197f, 14.404f, 11.603f, 14.486f)
            curveTo(12.009f, 14.567f, 12.404f, 14.303f, 12.485f, 13.897f)
            lineTo(13.365f, 9.5f)
            close()
            moveTo(12.135f, 8f)
            horizontalLineTo(6.5f)
            verticalLineTo(6.5f)
            horizontalLineTo(12.435f)
            lineTo(12.135f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DrinkMargaritaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DrinkMargarita, contentDescription = null)
    }
}
