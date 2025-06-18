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

public val FluentIcons.Regular.MailWarning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailWarning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.161f, 1.83f)
            lineTo(12.164f, 9.828f)
            curveTo(11.665f, 10.826f, 12.391f, 12f, 13.507f, 12f)
            horizontalLineTo(21.501f)
            curveTo(22.617f, 12f, 23.342f, 10.826f, 22.844f, 9.828f)
            lineTo(18.847f, 1.83f)
            curveTo(18.294f, 0.723f, 16.714f, 0.723f, 16.161f, 1.83f)
            close()
            moveTo(18.004f, 4.496f)
            verticalLineTo(7.497f)
            curveTo(18.004f, 7.774f, 17.78f, 7.998f, 17.504f, 7.998f)
            curveTo(17.228f, 7.998f, 17.003f, 7.774f, 17.003f, 7.497f)
            verticalLineTo(4.496f)
            curveTo(17.003f, 4.219f, 17.228f, 3.995f, 17.504f, 3.995f)
            curveTo(17.78f, 3.995f, 18.004f, 4.219f, 18.004f, 4.496f)
            close()
            moveTo(17.504f, 9.999f)
            curveTo(17.228f, 9.999f, 17.003f, 9.775f, 17.003f, 9.498f)
            curveTo(17.003f, 9.222f, 17.228f, 8.998f, 17.504f, 8.998f)
            curveTo(17.78f, 8.998f, 18.004f, 9.222f, 18.004f, 9.498f)
            curveTo(18.004f, 9.775f, 17.78f, 9.999f, 17.504f, 9.999f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineTo(13.959f)
            lineTo(13.21f, 5.5f)
            horizontalLineTo(5.25f)
            curveTo(4.332f, 5.5f, 3.579f, 6.207f, 3.506f, 7.106f)
            lineTo(3.5f, 7.25f)
            verticalLineTo(7.679f)
            lineTo(11.392f, 11.833f)
            curveTo(11.825f, 12.52f, 12.587f, 13f, 13.508f, 13f)
            horizontalLineTo(13.61f)
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
            verticalLineTo(13f)
            horizontalLineTo(21.5f)
            curveTo(21.672f, 13f, 21.84f, 12.983f, 22f, 12.951f)
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
private fun MailWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailWarning, contentDescription = null)
    }
}
