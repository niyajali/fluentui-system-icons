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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.ArrowDownload: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowDownload",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 3f)
            curveTo(16.276f, 3f, 16.5f, 3.224f, 16.5f, 3.5f)
            lineTo(16.5f, 21.793f)
            lineTo(23.146f, 15.146f)
            curveTo(23.342f, 14.951f, 23.658f, 14.951f, 23.854f, 15.146f)
            curveTo(24.049f, 15.342f, 24.049f, 15.658f, 23.854f, 15.854f)
            lineTo(16.354f, 23.354f)
            curveTo(16.158f, 23.549f, 15.842f, 23.549f, 15.646f, 23.354f)
            lineTo(8.146f, 15.854f)
            curveTo(7.951f, 15.658f, 7.951f, 15.342f, 8.146f, 15.146f)
            curveTo(8.342f, 14.951f, 8.658f, 14.951f, 8.854f, 15.146f)
            lineTo(15.5f, 21.793f)
            lineTo(15.5f, 3.5f)
            curveTo(15.5f, 3.224f, 15.724f, 3f, 16f, 3f)
            close()
            moveTo(6.5f, 28.5f)
            curveTo(6.224f, 28.5f, 6f, 28.276f, 6f, 28f)
            curveTo(6f, 27.724f, 6.224f, 27.5f, 6.5f, 27.5f)
            lineTo(25.5f, 27.5f)
            curveTo(25.776f, 27.5f, 26f, 27.724f, 26f, 28f)
            curveTo(26f, 28.276f, 25.776f, 28.5f, 25.5f, 28.5f)
            lineTo(6.5f, 28.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowDownloadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.ArrowDownload, contentDescription = null)
    }
}
