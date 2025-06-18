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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.Warning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Warning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.03f, 3.659f)
            curveTo(10.886f, 2.111f, 13.111f, 2.111f, 13.967f, 3.659f)
            lineTo(21.713f, 17.66f)
            curveTo(22.543f, 19.16f, 21.458f, 21f, 19.744f, 21f)
            horizontalLineTo(4.253f)
            curveTo(2.539f, 21f, 1.455f, 19.16f, 2.284f, 17.66f)
            lineTo(10.03f, 3.659f)
            close()
            moveTo(12.997f, 17.001f)
            curveTo(12.997f, 16.449f, 12.55f, 16.002f, 11.999f, 16.002f)
            curveTo(11.447f, 16.002f, 11f, 16.449f, 11f, 17.001f)
            curveTo(11f, 17.552f, 11.447f, 18f, 11.999f, 18f)
            curveTo(12.55f, 18f, 12.997f, 17.552f, 12.997f, 17.001f)
            close()
            moveTo(12.738f, 9.148f)
            curveTo(12.688f, 8.782f, 12.374f, 8.5f, 11.995f, 8.5f)
            curveTo(11.58f, 8.5f, 11.245f, 8.836f, 11.245f, 9.251f)
            lineTo(11.249f, 13.752f)
            lineTo(11.256f, 13.854f)
            curveTo(11.306f, 14.22f, 11.62f, 14.502f, 11.999f, 14.502f)
            curveTo(12.413f, 14.501f, 12.749f, 14.165f, 12.749f, 13.751f)
            lineTo(12.745f, 9.249f)
            lineTo(12.738f, 9.148f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Warning, contentDescription = null)
    }
}
