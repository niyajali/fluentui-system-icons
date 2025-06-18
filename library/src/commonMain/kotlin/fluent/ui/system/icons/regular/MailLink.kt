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

public val FluentUi.Regular.MailLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.75f)
            curveTo(23f, 4.679f, 21.321f, 3f, 19.25f, 3f)
            lineTo(19.148f, 3.007f)
            curveTo(18.782f, 3.057f, 18.5f, 3.37f, 18.5f, 3.75f)
            curveTo(18.5f, 4.164f, 18.836f, 4.5f, 19.25f, 4.5f)
            lineTo(19.404f, 4.505f)
            curveTo(20.575f, 4.584f, 21.5f, 5.559f, 21.5f, 6.75f)
            curveTo(21.5f, 7.993f, 20.493f, 9f, 19.25f, 9f)
            lineTo(19.247f, 9.005f)
            lineTo(19.145f, 9.012f)
            curveTo(18.779f, 9.063f, 18.498f, 9.378f, 18.5f, 9.758f)
            curveTo(18.502f, 10.172f, 18.839f, 10.507f, 19.253f, 10.505f)
            verticalLineTo(10.5f)
            lineTo(19.452f, 10.495f)
            curveTo(21.428f, 10.391f, 23f, 8.754f, 23f, 6.75f)
            close()
            moveTo(16.5f, 3.75f)
            curveTo(16.5f, 3.336f, 16.164f, 3f, 15.75f, 3f)
            lineTo(15.551f, 3.005f)
            curveTo(13.572f, 3.109f, 12f, 4.746f, 12f, 6.75f)
            curveTo(12f, 8.821f, 13.679f, 10.5f, 15.75f, 10.5f)
            lineTo(15.852f, 10.493f)
            curveTo(16.218f, 10.443f, 16.5f, 10.13f, 16.5f, 9.75f)
            curveTo(16.5f, 9.336f, 16.164f, 9f, 15.75f, 9f)
            lineTo(15.596f, 8.995f)
            curveTo(14.425f, 8.916f, 13.5f, 7.941f, 13.5f, 6.75f)
            curveTo(13.5f, 5.507f, 14.507f, 4.5f, 15.75f, 4.5f)
            lineTo(15.852f, 4.493f)
            curveTo(16.218f, 4.443f, 16.5f, 4.13f, 16.5f, 3.75f)
            close()
            moveTo(20f, 6.75f)
            curveTo(20f, 6.336f, 19.664f, 6f, 19.25f, 6f)
            horizontalLineTo(15.75f)
            lineTo(15.648f, 6.007f)
            curveTo(15.282f, 6.057f, 15f, 6.37f, 15f, 6.75f)
            curveTo(15f, 7.164f, 15.336f, 7.5f, 15.75f, 7.5f)
            horizontalLineTo(19.25f)
            lineTo(19.352f, 7.493f)
            curveTo(19.718f, 7.443f, 20f, 7.13f, 20f, 6.75f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineTo(11.877f)
            curveTo(11.558f, 4.448f, 11.314f, 4.955f, 11.166f, 5.5f)
            horizontalLineTo(5.25f)
            curveTo(4.332f, 5.5f, 3.579f, 6.207f, 3.506f, 7.106f)
            lineTo(3.5f, 7.25f)
            verticalLineTo(7.679f)
            lineTo(12f, 12.153f)
            lineTo(13.927f, 11.138f)
            curveTo(14.489f, 11.371f, 15.104f, 11.5f, 15.75f, 11.5f)
            horizontalLineTo(16.459f)
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
            verticalLineTo(11.334f)
            curveTo(21.045f, 11.186f, 21.552f, 10.942f, 22f, 10.623f)
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
private fun MailLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MailLink, contentDescription = null)
    }
}
