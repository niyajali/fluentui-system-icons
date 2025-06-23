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

public val FluentIcons.Filled.MailWarning: ImageVector
    get() {
        if (_MailWarning != null) {
            return _MailWarning!!
        }
        _MailWarning = ImageVector.Builder(
            name = "Filled.MailWarning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.161f, 1.83f)
                lineTo(12.164f, 9.828f)
                curveTo(11.665f, 10.826f, 12.391f, 12f, 13.507f, 12f)
                horizontalLineTo(21.501f)
                curveTo(22.617f, 12f, 23.342f, 10.826f, 22.844f, 9.828f)
                lineTo(18.847f, 1.83f)
                curveTo(18.294f, 0.723f, 16.714f, 0.723f, 16.161f, 1.83f)
                close()
                moveTo(18.004f, 4.496f)
                verticalLineTo(7.497f)
                curveTo(18.004f, 7.774f, 17.78f, 7.998f, 17.504f, 7.998f)
                curveTo(17.228f, 7.998f, 17.003f, 7.774f, 17.003f, 7.497f)
                verticalLineTo(4.496f)
                curveTo(17.003f, 4.219f, 17.228f, 3.995f, 17.504f, 3.995f)
                curveTo(17.78f, 3.995f, 18.004f, 4.219f, 18.004f, 4.496f)
                close()
                moveTo(17.504f, 9.999f)
                curveTo(17.228f, 9.999f, 17.003f, 9.775f, 17.003f, 9.498f)
                curveTo(17.003f, 9.222f, 17.228f, 8.998f, 17.504f, 8.998f)
                curveTo(17.78f, 8.998f, 18.004f, 9.222f, 18.004f, 9.498f)
                curveTo(18.004f, 9.775f, 17.78f, 9.999f, 17.504f, 9.999f)
                close()
                moveTo(21.5f, 13f)
                horizontalLineTo(13.616f)
                lineTo(12.348f, 13.664f)
                curveTo(12.13f, 13.778f, 11.87f, 13.778f, 11.652f, 13.664f)
                lineTo(2f, 8.608f)
                verticalLineTo(16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                lineTo(18.934f, 19.995f)
                curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
                verticalLineTo(12.951f)
                curveTo(21.84f, 12.983f, 21.672f, 13f, 21.5f, 13f)
                close()
                moveTo(5.25f, 4f)
                horizontalLineTo(13.959f)
                lineTo(11.271f, 9.381f)
                curveTo(10.851f, 10.221f, 10.952f, 11.137f, 11.395f, 11.836f)
                lineTo(2.016f, 6.924f)
                curveTo(2.174f, 5.343f, 3.464f, 4.095f, 5.064f, 4.005f)
                lineTo(5.25f, 4f)
                close()
            }
        }.build()

        return _MailWarning!!
    }

@Suppress("ObjectPropertyName")
private var _MailWarning: ImageVector? = null

@Preview
@Composable
private fun MailWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailWarning, contentDescription = null)
    }
}
