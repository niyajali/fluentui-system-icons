/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.MailUnread: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.MailUnread",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(27f, 11f)
            curveTo(29.209f, 11f, 31f, 9.209f, 31f, 7f)
            curveTo(31f, 4.791f, 29.209f, 3f, 27f, 3f)
            curveTo(24.791f, 3f, 23f, 4.791f, 23f, 7f)
            curveTo(23f, 9.209f, 24.791f, 11f, 27f, 11f)
            close()
            moveTo(6.5f, 5f)
            horizontalLineTo(21.875f)
            curveTo(21.75f, 5.32f, 21.654f, 5.654f, 21.591f, 6f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 6f, 3f, 7.567f, 3f, 9.5f)
            verticalLineTo(10.206f)
            lineTo(16f, 17.428f)
            lineTo(25.333f, 12.243f)
            curveTo(25.838f, 12.403f, 26.374f, 12.493f, 26.93f, 12.5f)
            lineTo(16.243f, 18.437f)
            curveTo(16.092f, 18.521f, 15.908f, 18.521f, 15.757f, 18.437f)
            lineTo(3f, 11.35f)
            verticalLineTo(22.5f)
            curveTo(3f, 24.433f, 4.567f, 26f, 6.5f, 26f)
            horizontalLineTo(25.5f)
            curveTo(27.433f, 26f, 29f, 24.433f, 29f, 22.5f)
            verticalLineTo(12.125f)
            curveTo(29.353f, 11.987f, 29.687f, 11.814f, 30f, 11.611f)
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
}

@Preview
@Composable
private fun MailUnreadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.MailUnread, contentDescription = null)
    }
}
