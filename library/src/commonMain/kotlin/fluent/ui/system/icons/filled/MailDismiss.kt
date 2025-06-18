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

public val FluentIcons.Filled.MailDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.5f)
            curveTo(23f, 9.538f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 9.538f, 12f, 6.5f)
            curveTo(12f, 3.462f, 14.462f, 1f, 17.5f, 1f)
            curveTo(20.538f, 1f, 23f, 3.462f, 23f, 6.5f)
            close()
            moveTo(15.854f, 4.146f)
            curveTo(15.658f, 3.951f, 15.342f, 3.951f, 15.146f, 4.146f)
            curveTo(14.951f, 4.342f, 14.951f, 4.658f, 15.146f, 4.854f)
            lineTo(16.793f, 6.5f)
            lineTo(15.146f, 8.146f)
            curveTo(14.951f, 8.342f, 14.951f, 8.658f, 15.146f, 8.854f)
            curveTo(15.342f, 9.049f, 15.658f, 9.049f, 15.854f, 8.854f)
            lineTo(17.5f, 7.207f)
            lineTo(19.146f, 8.854f)
            curveTo(19.342f, 9.049f, 19.658f, 9.049f, 19.854f, 8.854f)
            curveTo(20.049f, 8.658f, 20.049f, 8.342f, 19.854f, 8.146f)
            lineTo(18.207f, 6.5f)
            lineTo(19.854f, 4.854f)
            curveTo(20.049f, 4.658f, 20.049f, 4.342f, 19.854f, 4.146f)
            curveTo(19.658f, 3.951f, 19.342f, 3.951f, 19.146f, 4.146f)
            lineTo(17.5f, 5.793f)
            lineTo(15.854f, 4.146f)
            close()
            moveTo(17.5f, 13f)
            curveTo(19.247f, 13f, 20.832f, 12.311f, 22f, 11.19f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
            lineTo(2f, 16.75f)
            verticalLineTo(8.608f)
            lineTo(11.652f, 13.664f)
            curveTo(11.87f, 13.778f, 12.13f, 13.778f, 12.348f, 13.664f)
            lineTo(14.765f, 12.398f)
            curveTo(15.596f, 12.784f, 16.523f, 13f, 17.5f, 13f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineTo(11.498f)
            curveTo(11.177f, 4.77f, 11f, 5.614f, 11f, 6.5f)
            curveTo(11f, 8.493f, 11.897f, 10.276f, 13.308f, 11.468f)
            lineTo(12f, 12.153f)
            lineTo(2.016f, 6.924f)
            curveTo(2.174f, 5.343f, 3.464f, 4.095f, 5.064f, 4.005f)
            lineTo(5.25f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailDismiss, contentDescription = null)
    }
}
