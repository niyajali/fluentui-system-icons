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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.Mail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mail",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 8.608f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
            lineTo(2f, 16.75f)
            verticalLineTo(8.608f)
            lineTo(11.652f, 13.664f)
            curveTo(11.87f, 13.778f, 12.13f, 13.778f, 12.348f, 13.664f)
            lineTo(22f, 8.608f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineTo(18.75f)
            curveTo(20.435f, 4f, 21.82f, 5.282f, 21.984f, 6.924f)
            lineTo(12f, 12.153f)
            lineTo(2.016f, 6.924f)
            curveTo(2.174f, 5.343f, 3.464f, 4.095f, 5.064f, 4.005f)
            lineTo(5.25f, 4f)
            horizontalLineTo(18.75f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Mail, contentDescription = null)
    }
}
