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

public val FluentUi.Regular.MailList: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailList",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.525f, 4f)
            horizontalLineTo(5.25f)
            lineTo(5.066f, 4.005f)
            curveTo(3.356f, 4.101f, 2f, 5.517f, 2f, 7.25f)
            verticalLineTo(16.75f)
            lineTo(2.005f, 16.934f)
            curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            lineTo(18.934f, 19.995f)
            curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
            verticalLineTo(9.332f)
            curveTo(21.773f, 9.44f, 21.518f, 9.5f, 21.25f, 9.5f)
            horizontalLineTo(20.5f)
            verticalLineTo(16.75f)
            lineTo(20.494f, 16.893f)
            curveTo(20.421f, 17.793f, 19.668f, 18.5f, 18.75f, 18.5f)
            horizontalLineTo(5.25f)
            lineTo(5.106f, 18.494f)
            curveTo(4.207f, 18.421f, 3.5f, 17.668f, 3.5f, 16.75f)
            verticalLineTo(9.374f)
            lineTo(11.651f, 13.664f)
            lineTo(11.747f, 13.706f)
            curveTo(11.943f, 13.776f, 12.162f, 13.762f, 12.349f, 13.664f)
            lineTo(20.259f, 9.5f)
            horizontalLineTo(17.039f)
            lineTo(12f, 12.153f)
            lineTo(3.5f, 7.679f)
            verticalLineTo(7.25f)
            lineTo(3.506f, 7.106f)
            curveTo(3.579f, 6.207f, 4.332f, 5.5f, 5.25f, 5.5f)
            horizontalLineTo(12.018f)
            curveTo(12.006f, 5.418f, 12f, 5.335f, 12f, 5.25f)
            curveTo(12f, 4.76f, 12.201f, 4.318f, 12.525f, 4f)
            close()
            moveTo(21.25f, 2f)
            curveTo(21.64f, 2f, 21.961f, 2.298f, 21.997f, 2.679f)
            curveTo(21.999f, 2.702f, 22f, 2.726f, 22f, 2.75f)
            curveTo(22f, 2.807f, 21.994f, 2.863f, 21.981f, 2.917f)
            curveTo(21.906f, 3.251f, 21.607f, 3.5f, 21.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(13.65f, 3.5f, 13.555f, 3.48f, 13.468f, 3.445f)
            curveTo(13.193f, 3.333f, 13f, 3.064f, 13f, 2.75f)
            curveTo(13f, 2.423f, 13.209f, 2.146f, 13.5f, 2.043f)
            curveTo(13.578f, 2.015f, 13.662f, 2f, 13.75f, 2f)
            horizontalLineTo(21.25f)
            close()
            moveTo(21.25f, 4.5f)
            curveTo(21.32f, 4.5f, 21.388f, 4.51f, 21.452f, 4.528f)
            curveTo(21.768f, 4.616f, 22f, 4.906f, 22f, 5.25f)
            curveTo(22f, 5.664f, 21.664f, 6f, 21.25f, 6f)
            horizontalLineTo(13.75f)
            curveTo(13.713f, 6f, 13.677f, 5.997f, 13.641f, 5.992f)
            curveTo(13.279f, 5.94f, 13f, 5.627f, 13f, 5.25f)
            curveTo(13f, 4.836f, 13.336f, 4.5f, 13.75f, 4.5f)
            horizontalLineTo(21.25f)
            close()
            moveTo(13f, 7.75f)
            curveTo(13f, 7.336f, 13.336f, 7f, 13.75f, 7f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 7f, 22f, 7.336f, 22f, 7.75f)
            curveTo(22f, 8.164f, 21.664f, 8.5f, 21.25f, 8.5f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 8.5f, 13f, 8.164f, 13f, 7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MailList, contentDescription = null)
    }
}
