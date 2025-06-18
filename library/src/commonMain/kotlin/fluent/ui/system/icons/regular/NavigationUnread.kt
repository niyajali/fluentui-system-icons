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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.NavigationUnread: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NavigationUnread",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.25f, 8.5f)
            curveTo(20.769f, 8.5f, 22f, 7.269f, 22f, 5.75f)
            curveTo(22f, 4.231f, 20.769f, 3f, 19.25f, 3f)
            curveTo(17.731f, 3f, 16.5f, 4.231f, 16.5f, 5.75f)
            curveTo(16.5f, 7.269f, 17.731f, 8.5f, 19.25f, 8.5f)
            close()
            moveTo(15.576f, 6.503f)
            curveTo(15.526f, 6.26f, 15.5f, 6.008f, 15.5f, 5.75f)
            curveTo(15.5f, 5.494f, 15.526f, 5.245f, 15.574f, 5.003f)
            horizontalLineTo(2.752f)
            lineTo(2.65f, 5.01f)
            curveTo(2.284f, 5.06f, 2.002f, 5.374f, 2.002f, 5.753f)
            curveTo(2.002f, 6.167f, 2.338f, 6.503f, 2.752f, 6.503f)
            horizontalLineTo(15.576f)
            close()
            moveTo(21.253f, 18f)
            horizontalLineTo(2.753f)
            lineTo(2.651f, 18.007f)
            curveTo(2.285f, 18.056f, 2.003f, 18.37f, 2.003f, 18.75f)
            curveTo(2.003f, 19.164f, 2.339f, 19.5f, 2.753f, 19.5f)
            horizontalLineTo(21.253f)
            lineTo(21.355f, 19.493f)
            curveTo(21.721f, 19.444f, 22.003f, 19.13f, 22.003f, 18.75f)
            curveTo(22.003f, 18.336f, 21.667f, 18f, 21.253f, 18f)
            close()
            moveTo(2.753f, 11.503f)
            horizontalLineTo(21.253f)
            curveTo(21.667f, 11.503f, 22.003f, 11.839f, 22.003f, 12.253f)
            curveTo(22.003f, 12.633f, 21.721f, 12.946f, 21.355f, 12.996f)
            lineTo(21.253f, 13.003f)
            horizontalLineTo(2.753f)
            curveTo(2.339f, 13.003f, 2.003f, 12.667f, 2.003f, 12.253f)
            curveTo(2.003f, 11.873f, 2.285f, 11.559f, 2.651f, 11.51f)
            lineTo(2.753f, 11.503f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NavigationUnreadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.NavigationUnread, contentDescription = null)
    }
}
