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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Light.Mail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Mail",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 5f)
            horizontalLineTo(25.5f)
            curveTo(27.985f, 5f, 30f, 7.015f, 30f, 9.5f)
            verticalLineTo(10.49f)
            curveTo(30f, 10.496f, 30f, 10.503f, 30f, 10.509f)
            verticalLineTo(22.5f)
            curveTo(30f, 24.985f, 27.985f, 27f, 25.5f, 27f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineTo(10.509f)
            curveTo(2f, 10.503f, 2f, 10.496f, 2f, 10.49f)
            verticalLineTo(9.5f)
            curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
            close()
            moveTo(29f, 10.206f)
            verticalLineTo(9.5f)
            curveTo(29f, 7.567f, 27.433f, 6f, 25.5f, 6f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 6f, 3f, 7.567f, 3f, 9.5f)
            verticalLineTo(10.206f)
            lineTo(16f, 17.428f)
            lineTo(29f, 10.206f)
            close()
            moveTo(3f, 11.35f)
            verticalLineTo(22.5f)
            curveTo(3f, 24.433f, 4.567f, 26f, 6.5f, 26f)
            horizontalLineTo(25.5f)
            curveTo(27.433f, 26f, 29f, 24.433f, 29f, 22.5f)
            verticalLineTo(11.35f)
            lineTo(16.243f, 18.437f)
            curveTo(16.092f, 18.521f, 15.908f, 18.521f, 15.757f, 18.437f)
            lineTo(3f, 11.35f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Mail, contentDescription = null)
    }
}
