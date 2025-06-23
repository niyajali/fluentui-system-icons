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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.MailAlert: ImageVector
    get() {
        if (_MailAlert != null) {
            return _MailAlert!!
        }
        _MailAlert = ImageVector.Builder(
            name = "Light.MailAlert",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(24.5f, 1.5f)
                curveTo(21.739f, 1.5f, 19.5f, 3.739f, 19.5f, 6.5f)
                verticalLineTo(9.156f)
                lineTo(17.191f, 11.753f)
                curveTo(16.772f, 12.224f, 17.086f, 12.961f, 17.7f, 13f)
                horizontalLineTo(31.299f)
                curveTo(31.913f, 12.961f, 32.226f, 12.224f, 31.808f, 11.753f)
                lineTo(29.5f, 9.157f)
                verticalLineTo(6.5f)
                curveTo(29.5f, 3.739f, 27.261f, 1.5f, 24.5f, 1.5f)
                close()
                moveTo(24.5f, 16.5f)
                curveTo(23.308f, 16.5f, 22.332f, 15.617f, 22.255f, 14.5f)
                horizontalLineTo(26.745f)
                curveTo(26.668f, 15.617f, 25.692f, 16.5f, 24.5f, 16.5f)
                close()
                moveTo(6.5f, 5f)
                horizontalLineTo(18.173f)
                curveTo(18.097f, 5.325f, 18.044f, 5.659f, 18.018f, 6f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 6f, 3f, 7.567f, 3f, 9.5f)
                verticalLineTo(10.206f)
                lineTo(16f, 17.428f)
                lineTo(20.773f, 14.776f)
                curveTo(20.814f, 15.128f, 20.906f, 15.462f, 21.04f, 15.772f)
                lineTo(16.243f, 18.437f)
                curveTo(16.092f, 18.521f, 15.908f, 18.521f, 15.757f, 18.437f)
                lineTo(3f, 11.35f)
                verticalLineTo(22.5f)
                curveTo(3f, 24.433f, 4.567f, 26f, 6.5f, 26f)
                horizontalLineTo(25.5f)
                curveTo(27.433f, 26f, 29f, 24.433f, 29f, 22.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(30f)
                verticalLineTo(22.5f)
                curveTo(30f, 24.985f, 27.985f, 27f, 25.5f, 27f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
                verticalLineTo(10.509f)
                curveTo(2f, 10.503f, 2f, 10.496f, 2f, 10.49f)
                verticalLineTo(9.5f)
                curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
                close()
            }
        }.build()

        return _MailAlert!!
    }

@Suppress("ObjectPropertyName")
private var _MailAlert: ImageVector? = null

@Preview
@Composable
private fun MailAlertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.MailAlert, contentDescription = null)
    }
}
