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

public val FluentUi.Regular.MailUnread: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailUnread",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 7.829f)
            curveTo(23.165f, 7.417f, 24f, 6.306f, 24f, 5f)
            curveTo(24f, 3.343f, 22.657f, 2f, 21f, 2f)
            curveTo(19.68f, 2f, 18.559f, 2.853f, 18.158f, 4.038f)
            curveTo(18.055f, 4.34f, 18f, 4.663f, 18f, 5f)
            curveTo(18f, 5.17f, 18.014f, 5.337f, 18.042f, 5.5f)
            curveTo(18.231f, 6.63f, 19.053f, 7.547f, 20.131f, 7.872f)
            curveTo(20.147f, 7.877f, 20.163f, 7.882f, 20.179f, 7.886f)
            curveTo(20.44f, 7.96f, 20.715f, 8f, 21f, 8f)
            curveTo(21.351f, 8f, 21.687f, 7.94f, 22f, 7.829f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineTo(16.611f)
            curveTo(16.538f, 4.322f, 16.5f, 4.656f, 16.5f, 5f)
            curveTo(16.5f, 5.169f, 16.509f, 5.336f, 16.528f, 5.5f)
            horizontalLineTo(5.25f)
            curveTo(4.332f, 5.5f, 3.579f, 6.207f, 3.506f, 7.106f)
            lineTo(3.5f, 7.25f)
            verticalLineTo(7.679f)
            lineTo(12f, 12.153f)
            lineTo(18.49f, 8.736f)
            curveTo(19.037f, 9.103f, 19.667f, 9.354f, 20.348f, 9.453f)
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
            verticalLineTo(9.473f)
            curveTo(20.664f, 9.491f, 20.831f, 9.5f, 21f, 9.5f)
            curveTo(21.344f, 9.5f, 21.678f, 9.461f, 22f, 9.388f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
            lineTo(2f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(2f, 5.517f, 3.356f, 4.101f, 5.066f, 4.005f)
            lineTo(5.25f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailUnreadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MailUnread, contentDescription = null)
    }
}
