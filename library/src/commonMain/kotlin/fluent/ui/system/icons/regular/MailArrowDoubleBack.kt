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

public val FluentIcons.Regular.MailArrowDoubleBack: ImageVector
    get() {
        if (_MailArrowDoubleBack != null) {
            return _MailArrowDoubleBack!!
        }
        _MailArrowDoubleBack = ImageVector.Builder(
            name = "Regular.MailArrowDoubleBack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
                curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
                curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
                curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(15.854f, 4.854f)
                lineTo(14.207f, 6.5f)
                lineTo(15.854f, 8.146f)
                curveTo(16.049f, 8.342f, 16.049f, 8.658f, 15.854f, 8.854f)
                curveTo(15.658f, 9.049f, 15.342f, 9.049f, 15.146f, 8.854f)
                lineTo(13.146f, 6.854f)
                curveTo(12.951f, 6.658f, 12.951f, 6.342f, 13.146f, 6.146f)
                lineTo(15.146f, 4.146f)
                curveTo(15.342f, 3.951f, 15.658f, 3.951f, 15.854f, 4.146f)
                curveTo(16.049f, 4.342f, 16.049f, 4.658f, 15.854f, 4.854f)
                close()
                moveTo(18.854f, 4.146f)
                curveTo(19.049f, 4.342f, 19.049f, 4.658f, 18.854f, 4.854f)
                lineTo(17.707f, 6f)
                horizontalLineTo(20f)
                curveTo(20.828f, 6f, 21.5f, 6.672f, 21.5f, 7.5f)
                verticalLineTo(8f)
                curveTo(21.5f, 8.276f, 21.276f, 8.5f, 21f, 8.5f)
                curveTo(20.724f, 8.5f, 20.5f, 8.276f, 20.5f, 8f)
                verticalLineTo(7.5f)
                curveTo(20.5f, 7.224f, 20.276f, 7f, 20f, 7f)
                horizontalLineTo(17.707f)
                lineTo(18.854f, 8.146f)
                curveTo(19.049f, 8.342f, 19.049f, 8.658f, 18.854f, 8.854f)
                curveTo(18.658f, 9.049f, 18.342f, 9.049f, 18.146f, 8.854f)
                lineTo(16.146f, 6.854f)
                curveTo(15.951f, 6.658f, 15.951f, 6.342f, 16.146f, 6.146f)
                lineTo(18.146f, 4.146f)
                curveTo(18.342f, 3.951f, 18.658f, 3.951f, 18.854f, 4.146f)
                close()
                moveTo(20.5f, 16.75f)
                verticalLineTo(12.268f)
                curveTo(21.051f, 11.981f, 21.556f, 11.617f, 22f, 11.19f)
                verticalLineTo(16.75f)
                curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(2f, 5.517f, 3.356f, 4.101f, 5.066f, 4.005f)
                lineTo(5.25f, 4f)
                horizontalLineTo(11.498f)
                curveTo(11.3f, 4.474f, 11.157f, 4.977f, 11.076f, 5.5f)
                horizontalLineTo(5.25f)
                curveTo(4.332f, 5.5f, 3.579f, 6.207f, 3.506f, 7.106f)
                lineTo(3.5f, 7.25f)
                verticalLineTo(7.679f)
                lineTo(12f, 12.153f)
                lineTo(13.305f, 11.465f)
                curveTo(13.744f, 11.836f, 14.232f, 12.15f, 14.759f, 12.395f)
                lineTo(12.349f, 13.664f)
                curveTo(12.162f, 13.762f, 11.943f, 13.776f, 11.747f, 13.706f)
                lineTo(11.651f, 13.664f)
                lineTo(3.5f, 9.374f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.668f, 4.207f, 18.421f, 5.106f, 18.494f)
                lineTo(5.25f, 18.5f)
                horizontalLineTo(18.75f)
                curveTo(19.668f, 18.5f, 20.421f, 17.793f, 20.494f, 16.893f)
                lineTo(20.5f, 16.75f)
                close()
            }
        }.build()

        return _MailArrowDoubleBack!!
    }

@Suppress("ObjectPropertyName")
private var _MailArrowDoubleBack: ImageVector? = null

@Preview
@Composable
private fun MailArrowDoubleBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailArrowDoubleBack, contentDescription = null)
    }
}
