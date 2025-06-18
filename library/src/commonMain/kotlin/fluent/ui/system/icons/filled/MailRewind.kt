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

public val FluentIcons.Filled.MailRewind: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailRewind",
        defaultWidth = 25.dp,
        defaultHeight = 24.dp,
        viewportWidth = 25f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.002f, 8.997f)
            verticalLineTo(6.83f)
            lineTo(22.344f, 9.75f)
            curveTo(22.991f, 10.316f, 24.002f, 9.856f, 24.002f, 8.997f)
            verticalLineTo(2.002f)
            curveTo(24.002f, 1.143f, 22.991f, 0.684f, 22.344f, 1.249f)
            lineTo(19.002f, 4.17f)
            verticalLineTo(2.002f)
            curveTo(19.002f, 1.143f, 17.991f, 0.684f, 17.344f, 1.249f)
            lineTo(13.342f, 4.747f)
            curveTo(12.886f, 5.145f, 12.886f, 5.854f, 13.342f, 6.253f)
            lineTo(17.344f, 9.75f)
            curveTo(17.991f, 10.316f, 19.002f, 9.856f, 19.002f, 8.997f)
            close()
            moveTo(12.684f, 7.008f)
            curveTo(11.774f, 6.212f, 11.772f, 4.798f, 12.679f, 4f)
            horizontalLineTo(5.25f)
            lineTo(5.064f, 4.005f)
            curveTo(3.464f, 4.095f, 2.174f, 5.343f, 2.016f, 6.924f)
            lineTo(12f, 12.153f)
            lineTo(16.109f, 10.001f)
            lineTo(12.684f, 7.008f)
            close()
            moveTo(21.686f, 10.505f)
            lineTo(20.446f, 9.422f)
            lineTo(19.872f, 9.723f)
            curveTo(19.515f, 10.658f, 18.486f, 11.18f, 17.532f, 10.949f)
            lineTo(12.348f, 13.664f)
            curveTo(12.13f, 13.778f, 11.87f, 13.778f, 11.652f, 13.664f)
            lineTo(2f, 8.608f)
            verticalLineTo(16.75f)
            lineTo(2.005f, 16.934f)
            curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            lineTo(18.934f, 19.995f)
            curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
            verticalLineTo(10.733f)
            curveTo(21.892f, 10.669f, 21.787f, 10.593f, 21.686f, 10.505f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailRewindPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailRewind, contentDescription = null)
    }
}
