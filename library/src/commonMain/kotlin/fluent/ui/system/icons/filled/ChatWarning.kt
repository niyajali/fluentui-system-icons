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

public val FluentUi.Filled.ChatWarning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatWarning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 11.998f)
            curveTo(22f, 6.475f, 17.523f, 1.998f, 12f, 1.998f)
            curveTo(6.477f, 1.998f, 2f, 6.475f, 2f, 11.998f)
            curveTo(2f, 13.641f, 2.397f, 15.227f, 3.145f, 16.648f)
            lineTo(2.029f, 20.937f)
            curveTo(1.992f, 21.077f, 1.992f, 21.225f, 2.029f, 21.365f)
            curveTo(2.147f, 21.819f, 2.611f, 22.092f, 3.065f, 21.973f)
            lineTo(7.356f, 20.856f)
            curveTo(8.775f, 21.602f, 10.36f, 21.998f, 12f, 21.998f)
            curveTo(17.523f, 21.998f, 22f, 17.521f, 22f, 11.998f)
            close()
            moveTo(12f, 6.5f)
            curveTo(12.414f, 6.5f, 12.75f, 6.835f, 12.75f, 7.25f)
            verticalLineTo(13.5f)
            curveTo(12.75f, 13.914f, 12.414f, 14.25f, 12f, 14.25f)
            curveTo(11.586f, 14.25f, 11.25f, 13.914f, 11.25f, 13.5f)
            verticalLineTo(7.25f)
            curveTo(11.25f, 6.835f, 11.586f, 6.5f, 12f, 6.5f)
            close()
            moveTo(13f, 16.497f)
            curveTo(13f, 17.05f, 12.552f, 17.497f, 12f, 17.497f)
            curveTo(11.448f, 17.497f, 11f, 17.05f, 11f, 16.497f)
            curveTo(11f, 15.945f, 11.448f, 15.497f, 12f, 15.497f)
            curveTo(12.552f, 15.497f, 13f, 15.945f, 13f, 16.497f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChatWarning, contentDescription = null)
    }
}
