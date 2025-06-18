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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.MailRewind: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailRewind",
        defaultWidth = 25.dp,
        defaultHeight = 24.dp,
        viewportWidth = 25f,
        viewportHeight = 24f
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
            moveTo(12f, 12.153f)
            lineTo(16.101f, 9.994f)
            lineTo(16.686f, 10.505f)
            curveTo(16.941f, 10.728f, 17.224f, 10.871f, 17.515f, 10.944f)
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
            verticalLineTo(9.469f)
            lineTo(21.686f, 10.505f)
            curveTo(21.787f, 10.593f, 21.892f, 10.669f, 22f, 10.733f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
            lineTo(2f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(2f, 5.517f, 3.356f, 4.101f, 5.066f, 4.005f)
            lineTo(5.25f, 4f)
            horizontalLineTo(12.679f)
            curveTo(12.227f, 4.398f, 12f, 4.949f, 12f, 5.5f)
            horizontalLineTo(5.25f)
            curveTo(4.332f, 5.5f, 3.579f, 6.207f, 3.506f, 7.106f)
            lineTo(3.5f, 7.25f)
            verticalLineTo(7.679f)
            lineTo(12f, 12.153f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailRewindPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MailRewind, contentDescription = null)
    }
}
