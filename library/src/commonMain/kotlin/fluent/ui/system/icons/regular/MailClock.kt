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

public val FluentIcons.Regular.MailClock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailClock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.5f)
            curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
            curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
            curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
            close()
            moveTo(17.5f, 3f)
            curveTo(17.776f, 3f, 18f, 3.224f, 18f, 3.5f)
            verticalLineTo(6f)
            horizontalLineTo(20f)
            curveTo(20.276f, 6f, 20.5f, 6.224f, 20.5f, 6.5f)
            curveTo(20.5f, 6.776f, 20.276f, 7f, 20f, 7f)
            horizontalLineTo(17.5f)
            curveTo(17.224f, 7f, 17f, 6.776f, 17f, 6.5f)
            verticalLineTo(3.5f)
            curveTo(17f, 3.224f, 17.224f, 3f, 17.5f, 3f)
            close()
            moveTo(20.5f, 12.268f)
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
            lineTo(14.759f, 12.395f)
            curveTo(14.232f, 12.15f, 13.744f, 11.836f, 13.305f, 11.465f)
            lineTo(12f, 12.153f)
            lineTo(3.5f, 7.679f)
            verticalLineTo(7.25f)
            lineTo(3.506f, 7.106f)
            curveTo(3.579f, 6.207f, 4.332f, 5.5f, 5.25f, 5.5f)
            horizontalLineTo(11.076f)
            curveTo(11.157f, 4.977f, 11.3f, 4.474f, 11.498f, 4f)
            horizontalLineTo(5.25f)
            lineTo(5.066f, 4.005f)
            curveTo(3.356f, 4.101f, 2f, 5.517f, 2f, 7.25f)
            verticalLineTo(16.75f)
            lineTo(2.005f, 16.934f)
            curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            lineTo(18.934f, 19.995f)
            curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
            verticalLineTo(11.19f)
            curveTo(21.556f, 11.617f, 21.051f, 11.981f, 20.5f, 12.268f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailClock, contentDescription = null)
    }
}
