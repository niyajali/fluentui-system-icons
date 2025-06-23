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

public val FluentIcons.Regular.Incognito: ImageVector
    get() {
        if (_Incognito != null) {
            return _Incognito!!
        }
        _Incognito = ImageVector.Builder(
            name = "Regular.Incognito",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.379f, 4.5f)
                curveTo(7.888f, 4.5f, 7.444f, 4.786f, 7.241f, 5.233f)
                lineTo(6.183f, 7.56f)
                curveTo(6.011f, 7.937f, 5.567f, 8.104f, 5.19f, 7.933f)
                curveTo(4.813f, 7.761f, 4.646f, 7.317f, 4.817f, 6.94f)
                lineTo(5.875f, 4.612f)
                curveTo(6.321f, 3.63f, 7.3f, 3f, 8.379f, 3f)
                horizontalLineTo(15.621f)
                curveTo(16.7f, 3f, 17.678f, 3.63f, 18.125f, 4.612f)
                lineTo(19.183f, 6.938f)
                curveTo(19.354f, 7.315f, 19.187f, 7.76f, 18.81f, 7.932f)
                curveTo(18.433f, 8.103f, 17.989f, 7.936f, 17.817f, 7.559f)
                lineTo(16.759f, 5.233f)
                curveTo(16.556f, 4.786f, 16.111f, 4.5f, 15.621f, 4.5f)
                horizontalLineTo(8.379f)
                close()
                moveTo(6.5f, 13.5f)
                curveTo(4.843f, 13.5f, 3.5f, 14.843f, 3.5f, 16.5f)
                curveTo(3.5f, 18.157f, 4.843f, 19.5f, 6.5f, 19.5f)
                curveTo(8.157f, 19.5f, 9.5f, 18.157f, 9.5f, 16.5f)
                curveTo(9.5f, 14.843f, 8.157f, 13.5f, 6.5f, 13.5f)
                close()
                moveTo(2f, 16.5f)
                curveTo(2f, 14.015f, 4.015f, 12f, 6.5f, 12f)
                curveTo(8.816f, 12f, 10.724f, 13.75f, 10.972f, 16f)
                horizontalLineTo(13.027f)
                curveTo(13.276f, 13.75f, 15.184f, 12f, 17.5f, 12f)
                curveTo(19.985f, 12f, 22f, 14.015f, 22f, 16.5f)
                curveTo(22f, 18.985f, 19.985f, 21f, 17.5f, 21f)
                curveTo(15.358f, 21f, 13.566f, 19.504f, 13.111f, 17.5f)
                horizontalLineTo(10.888f)
                curveTo(10.434f, 19.504f, 8.642f, 21f, 6.5f, 21f)
                curveTo(4.015f, 21f, 2f, 18.985f, 2f, 16.5f)
                close()
                moveTo(17.5f, 13.5f)
                curveTo(15.843f, 13.5f, 14.5f, 14.843f, 14.5f, 16.5f)
                curveTo(14.5f, 18.157f, 15.843f, 19.5f, 17.5f, 19.5f)
                curveTo(19.157f, 19.5f, 20.5f, 18.157f, 20.5f, 16.5f)
                curveTo(20.5f, 14.843f, 19.157f, 13.5f, 17.5f, 13.5f)
                close()
                moveTo(2.934f, 10.973f)
                curveTo(8.063f, 9.676f, 15.937f, 9.676f, 21.066f, 10.973f)
                curveTo(21.468f, 11.075f, 21.875f, 10.831f, 21.977f, 10.43f)
                curveTo(22.079f, 10.028f, 21.835f, 9.62f, 21.434f, 9.519f)
                curveTo(16.063f, 8.16f, 7.937f, 8.16f, 2.566f, 9.519f)
                curveTo(2.164f, 9.62f, 1.921f, 10.028f, 2.023f, 10.43f)
                curveTo(2.124f, 10.831f, 2.532f, 11.075f, 2.934f, 10.973f)
                close()
            }
        }.build()

        return _Incognito!!
    }

@Suppress("ObjectPropertyName")
private var _Incognito: ImageVector? = null

@Preview
@Composable
private fun IncognitoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Incognito, contentDescription = null)
    }
}
