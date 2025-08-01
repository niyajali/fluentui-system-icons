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

public val FluentIcons.Filled.MailMultiple: ImageVector
    get() {
        if (_MailMultiple != null) {
            return _MailMultiple!!
        }
        _MailMultiple = ImageVector.Builder(
            name = "Filled.MailMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 7.511f)
                curveTo(21.902f, 8.089f, 22.5f, 9.1f, 22.5f, 10.25f)
                verticalLineTo(16.25f)
                curveTo(22.5f, 19.149f, 20.149f, 21.5f, 17.25f, 21.5f)
                horizontalLineTo(8.25f)
                curveTo(7.1f, 21.5f, 6.089f, 20.902f, 5.511f, 20f)
                lineTo(17.25f, 20f)
                curveTo(19.321f, 20f, 21f, 18.321f, 21f, 16.25f)
                lineTo(21f, 7.511f)
                close()
                moveTo(20f, 8.11f)
                verticalLineTo(15.75f)
                curveTo(20f, 17.483f, 18.643f, 18.899f, 16.934f, 18.995f)
                lineTo(16.75f, 19f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 19f, 2.101f, 17.643f, 2.005f, 15.934f)
                lineTo(2f, 15.75f)
                verticalLineTo(8.11f)
                lineTo(10.651f, 12.664f)
                curveTo(10.869f, 12.779f, 11.131f, 12.779f, 11.349f, 12.664f)
                lineTo(20f, 8.11f)
                close()
                moveTo(5.25f, 4f)
                horizontalLineTo(16.75f)
                curveTo(18.275f, 4f, 19.554f, 5.05f, 19.905f, 6.466f)
                lineTo(11f, 11.153f)
                lineTo(2.095f, 6.466f)
                curveTo(2.431f, 5.109f, 3.62f, 4.088f, 5.061f, 4.005f)
                lineTo(5.25f, 4f)
                close()
            }
        }.build()

        return _MailMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _MailMultiple: ImageVector? = null

@Preview
@Composable
private fun MailMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailMultiple, contentDescription = null)
    }
}
