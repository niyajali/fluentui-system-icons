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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.MailCopy: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailCopy",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.999f, 7.511f)
            curveTo(2.098f, 8.089f, 1.5f, 9.1f, 1.5f, 10.25f)
            verticalLineTo(16.25f)
            curveTo(1.5f, 19.149f, 3.851f, 21.5f, 6.75f, 21.5f)
            horizontalLineTo(15.75f)
            curveTo(16.9f, 21.5f, 17.911f, 20.902f, 18.489f, 20f)
            lineTo(6.75f, 20f)
            curveTo(4.679f, 20f, 3f, 18.321f, 3f, 16.25f)
            lineTo(2.999f, 7.511f)
            close()
            moveTo(18.75f, 4f)
            horizontalLineTo(7.25f)
            curveTo(5.517f, 4f, 4.101f, 5.356f, 4.005f, 7.066f)
            lineTo(4f, 7.25f)
            verticalLineTo(15.75f)
            curveTo(4f, 17.483f, 5.356f, 18.899f, 7.066f, 18.995f)
            lineTo(7.25f, 19f)
            horizontalLineTo(18.75f)
            curveTo(20.483f, 19f, 21.899f, 17.643f, 21.995f, 15.934f)
            lineTo(22f, 15.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.517f, 20.643f, 4.101f, 18.934f, 4.005f)
            lineTo(18.75f, 4f)
            close()
            moveTo(5.5f, 8.899f)
            lineTo(12.651f, 12.664f)
            curveTo(12.838f, 12.762f, 13.057f, 12.776f, 13.253f, 12.706f)
            lineTo(13.349f, 12.664f)
            lineTo(20.5f, 8.9f)
            verticalLineTo(15.75f)
            curveTo(20.5f, 16.668f, 19.793f, 17.421f, 18.893f, 17.494f)
            lineTo(18.75f, 17.5f)
            horizontalLineTo(7.25f)
            curveTo(6.332f, 17.5f, 5.579f, 16.793f, 5.506f, 15.894f)
            lineTo(5.5f, 15.75f)
            verticalLineTo(8.899f)
            close()
            moveTo(7.25f, 5.5f)
            horizontalLineTo(18.75f)
            curveTo(19.668f, 5.5f, 20.421f, 6.207f, 20.494f, 7.106f)
            lineTo(20.498f, 7.206f)
            lineTo(13f, 11.153f)
            lineTo(5.501f, 7.205f)
            curveTo(5.525f, 6.259f, 6.299f, 5.5f, 7.25f, 5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailCopy, contentDescription = null)
    }
}
