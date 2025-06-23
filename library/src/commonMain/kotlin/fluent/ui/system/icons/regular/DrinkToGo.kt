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

public val FluentIcons.Regular.DrinkToGo: ImageVector
    get() {
        if (_DrinkToGo != null) {
            return _DrinkToGo!!
        }
        _DrinkToGo = ImageVector.Builder(
            name = "Regular.DrinkToGo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.72f, 2.22f)
                curveTo(16.013f, 1.927f, 16.488f, 1.927f, 16.781f, 2.22f)
                curveTo(17.074f, 2.513f, 17.074f, 2.987f, 16.781f, 3.28f)
                lineTo(15.56f, 4.5f)
                horizontalLineTo(17.751f)
                curveTo(18.068f, 4.5f, 18.35f, 4.699f, 18.457f, 4.998f)
                lineTo(19.707f, 8.498f)
                curveTo(19.881f, 8.986f, 19.519f, 9.5f, 19.001f, 9.5f)
                horizontalLineTo(17.956f)
                lineTo(16.369f, 19.549f)
                curveTo(16.159f, 21.014f, 14.91f, 22f, 13.399f, 22f)
                horizontalLineTo(10.602f)
                curveTo(9.092f, 22f, 7.842f, 21.014f, 7.634f, 19.56f)
                lineTo(6.045f, 9.5f)
                horizontalLineTo(5.001f)
                curveTo(4.482f, 9.5f, 4.12f, 8.986f, 4.294f, 8.498f)
                lineTo(5.544f, 4.998f)
                curveTo(5.651f, 4.699f, 5.934f, 4.5f, 6.251f, 4.5f)
                horizontalLineTo(13.439f)
                lineTo(15.72f, 2.22f)
                close()
                moveTo(16.437f, 9.5f)
                horizontalLineTo(7.563f)
                lineTo(9.118f, 19.337f)
                curveTo(9.217f, 20.032f, 9.81f, 20.5f, 10.602f, 20.5f)
                horizontalLineTo(13.399f)
                curveTo(14.191f, 20.5f, 14.784f, 20.032f, 14.885f, 19.326f)
                lineTo(16.437f, 9.5f)
                close()
                moveTo(17.222f, 6f)
                horizontalLineTo(6.779f)
                lineTo(6.065f, 8f)
                horizontalLineTo(17.936f)
                lineTo(17.222f, 6f)
                close()
            }
        }.build()

        return _DrinkToGo!!
    }

@Suppress("ObjectPropertyName")
private var _DrinkToGo: ImageVector? = null

@Preview
@Composable
private fun DrinkToGoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DrinkToGo, contentDescription = null)
    }
}
