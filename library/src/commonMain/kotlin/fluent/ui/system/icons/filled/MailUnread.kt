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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.MailUnread: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailUnread",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 8f)
            curveTo(22.657f, 8f, 24f, 6.657f, 24f, 5f)
            curveTo(24f, 3.343f, 22.657f, 2f, 21f, 2f)
            curveTo(19.68f, 2f, 18.559f, 2.853f, 18.158f, 4.038f)
            curveTo(18.055f, 4.34f, 18f, 4.663f, 18f, 5f)
            curveTo(18f, 6.364f, 18.911f, 7.516f, 20.158f, 7.88f)
            curveTo(20.425f, 7.958f, 20.708f, 8f, 21f, 8f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineTo(16.611f)
            curveTo(16.538f, 4.322f, 16.5f, 4.656f, 16.5f, 5f)
            curveTo(16.5f, 6.562f, 17.296f, 7.939f, 18.505f, 8.746f)
            lineTo(12f, 12.153f)
            lineTo(2.016f, 6.924f)
            curveTo(2.174f, 5.343f, 3.464f, 4.095f, 5.064f, 4.005f)
            lineTo(5.25f, 4f)
            close()
            moveTo(12.348f, 13.664f)
            lineTo(20.378f, 9.457f)
            curveTo(20.582f, 9.486f, 20.789f, 9.5f, 21f, 9.5f)
            curveTo(21.344f, 9.5f, 21.678f, 9.461f, 22f, 9.388f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
            lineTo(2f, 16.75f)
            verticalLineTo(8.608f)
            lineTo(11.652f, 13.664f)
            curveTo(11.87f, 13.778f, 12.13f, 13.778f, 12.348f, 13.664f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailUnreadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailUnread, contentDescription = null)
    }
}
