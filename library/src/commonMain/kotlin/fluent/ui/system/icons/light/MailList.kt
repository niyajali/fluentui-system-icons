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

public val FluentIcons.Light.MailList: ImageVector
    get() {
        if (_MailList != null) {
            return _MailList!!
        }
        _MailList = ImageVector.Builder(
            name = "Light.MailList",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17f, 2f)
                curveTo(16.448f, 2f, 16f, 2.448f, 16f, 3f)
                curveTo(16f, 3.552f, 16.448f, 4f, 17f, 4f)
                horizontalLineTo(30f)
                curveTo(30.552f, 4f, 31f, 3.552f, 31f, 3f)
                curveTo(31f, 2.448f, 30.552f, 2f, 30f, 2f)
                horizontalLineTo(17f)
                close()
                moveTo(17f, 6f)
                curveTo(16.448f, 6f, 16f, 6.448f, 16f, 7f)
                curveTo(16f, 7.552f, 16.448f, 8f, 17f, 8f)
                horizontalLineTo(30f)
                curveTo(30.552f, 8f, 31f, 7.552f, 31f, 7f)
                curveTo(31f, 6.448f, 30.552f, 6f, 30f, 6f)
                horizontalLineTo(17f)
                close()
                moveTo(16f, 11f)
                curveTo(16f, 10.448f, 16.448f, 10f, 17f, 10f)
                horizontalLineTo(30f)
                curveTo(30.552f, 10f, 31f, 10.448f, 31f, 11f)
                curveTo(31f, 11.552f, 30.552f, 12f, 30f, 12f)
                horizontalLineTo(17f)
                curveTo(16.448f, 12f, 16f, 11.552f, 16f, 11f)
                close()
                moveTo(6.5f, 5f)
                horizontalLineTo(15.5f)
                curveTo(15.157f, 5.258f, 14.882f, 5.602f, 14.708f, 6f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 6f, 3f, 7.567f, 3f, 9.5f)
                verticalLineTo(10.206f)
                lineTo(16f, 17.428f)
                lineTo(23.07f, 13.5f)
                horizontalLineTo(25.13f)
                lineTo(16.243f, 18.437f)
                curveTo(16.092f, 18.521f, 15.908f, 18.521f, 15.757f, 18.437f)
                lineTo(3f, 11.35f)
                verticalLineTo(22.5f)
                curveTo(3f, 24.433f, 4.567f, 26f, 6.5f, 26f)
                horizontalLineTo(25.5f)
                curveTo(27.433f, 26f, 29f, 24.433f, 29f, 22.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(30f)
                lineTo(30f, 22.5f)
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

        return _MailList!!
    }

@Suppress("ObjectPropertyName")
private var _MailList: ImageVector? = null

@Preview
@Composable
private fun MailListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.MailList, contentDescription = null)
    }
}
