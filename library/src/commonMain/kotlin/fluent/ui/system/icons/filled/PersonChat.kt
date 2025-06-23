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

public val FluentIcons.Filled.PersonChat: ImageVector
    get() {
        if (_PersonChat != null) {
            return _PersonChat!!
        }
        _PersonChat = ImageVector.Builder(
            name = "Filled.PersonChat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.997f, 17.499f)
                curveTo(10.997f, 16.21f, 11.372f, 15.009f, 12.019f, 13.998f)
                horizontalLineTo(6.249f)
                curveTo(5.007f, 13.998f, 4f, 15.005f, 4f, 16.247f)
                verticalLineTo(17.167f)
                curveTo(4f, 17.74f, 4.178f, 18.298f, 4.51f, 18.764f)
                curveTo(5.913f, 20.732f, 8.127f, 21.798f, 11.09f, 21.974f)
                lineTo(11.612f, 20.261f)
                curveTo(11.217f, 19.422f, 10.997f, 18.485f, 10.997f, 17.499f)
                close()
                moveTo(11.998f, 2f)
                curveTo(14.76f, 2f, 16.999f, 4.239f, 16.999f, 7.001f)
                curveTo(16.999f, 9.763f, 14.76f, 12.002f, 11.998f, 12.002f)
                curveTo(9.236f, 12.002f, 6.997f, 9.763f, 6.997f, 7.001f)
                curveTo(6.997f, 4.239f, 9.236f, 2f, 11.998f, 2f)
                close()
                moveTo(23f, 17.499f)
                curveTo(23f, 20.537f, 20.537f, 23f, 17.499f, 23f)
                curveTo(16.531f, 23f, 15.622f, 22.75f, 14.832f, 22.312f)
                lineTo(12.645f, 22.977f)
                curveTo(12.262f, 23.094f, 11.904f, 22.736f, 12.021f, 22.353f)
                lineTo(12.687f, 20.166f)
                curveTo(12.248f, 19.376f, 11.998f, 18.467f, 11.998f, 17.499f)
                curveTo(11.998f, 14.46f, 14.461f, 11.998f, 17.499f, 11.998f)
                curveTo(20.537f, 11.998f, 23f, 14.46f, 23f, 17.499f)
                close()
                moveTo(15.498f, 15.998f)
                curveTo(15.222f, 15.998f, 14.998f, 16.222f, 14.998f, 16.499f)
                curveTo(14.998f, 16.775f, 15.222f, 16.999f, 15.498f, 16.999f)
                horizontalLineTo(19.499f)
                curveTo(19.775f, 16.999f, 19.999f, 16.775f, 19.999f, 16.499f)
                curveTo(19.999f, 16.222f, 19.775f, 15.998f, 19.499f, 15.998f)
                horizontalLineTo(15.498f)
                close()
                moveTo(14.998f, 18.499f)
                curveTo(14.998f, 18.775f, 15.222f, 18.999f, 15.498f, 18.999f)
                horizontalLineTo(17.499f)
                curveTo(17.775f, 18.999f, 17.999f, 18.775f, 17.999f, 18.499f)
                curveTo(17.999f, 18.223f, 17.775f, 17.999f, 17.499f, 17.999f)
                horizontalLineTo(15.498f)
                curveTo(15.222f, 17.999f, 14.998f, 18.223f, 14.998f, 18.499f)
                close()
            }
        }.build()

        return _PersonChat!!
    }

@Suppress("ObjectPropertyName")
private var _PersonChat: ImageVector? = null

@Preview
@Composable
private fun PersonChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonChat, contentDescription = null)
    }
}
