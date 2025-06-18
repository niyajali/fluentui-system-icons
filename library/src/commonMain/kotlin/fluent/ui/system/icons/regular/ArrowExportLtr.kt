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

public val FluentUi.Regular.ArrowExportLtr: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExportLtr",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.753f, 4.5f)
            curveTo(3.132f, 4.5f, 3.446f, 4.782f, 3.496f, 5.148f)
            lineTo(3.502f, 5.25f)
            lineTo(3.5f, 18.254f)
            curveTo(3.5f, 18.668f, 3.164f, 19.004f, 2.75f, 19.004f)
            curveTo(2.37f, 19.004f, 2.056f, 18.722f, 2.007f, 18.356f)
            lineTo(2f, 18.254f)
            lineTo(2.002f, 5.25f)
            curveTo(2.002f, 4.836f, 2.338f, 4.5f, 2.753f, 4.5f)
            close()
            moveTo(15.647f, 6.304f)
            lineTo(15.72f, 6.22f)
            curveTo(15.986f, 5.953f, 16.403f, 5.929f, 16.696f, 6.147f)
            lineTo(16.78f, 6.22f)
            lineTo(21.777f, 11.217f)
            curveTo(22.043f, 11.483f, 22.067f, 11.9f, 21.85f, 12.193f)
            lineTo(21.777f, 12.278f)
            lineTo(16.781f, 17.281f)
            curveTo(16.488f, 17.574f, 16.013f, 17.574f, 15.72f, 17.282f)
            curveTo(15.454f, 17.016f, 15.429f, 16.599f, 15.647f, 16.305f)
            lineTo(15.719f, 16.221f)
            lineTo(19.43f, 12.504f)
            lineTo(5.753f, 12.505f)
            curveTo(5.373f, 12.505f, 5.059f, 12.223f, 5.01f, 11.857f)
            lineTo(5.003f, 11.755f)
            curveTo(5.003f, 11.375f, 5.285f, 11.061f, 5.651f, 11.012f)
            lineTo(5.753f, 11.005f)
            lineTo(19.443f, 11.004f)
            lineTo(15.72f, 7.28f)
            curveTo(15.453f, 7.014f, 15.429f, 6.597f, 15.647f, 6.304f)
            lineTo(15.72f, 6.22f)
            lineTo(15.647f, 6.304f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowExportLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowExportLtr, contentDescription = null)
    }
}
