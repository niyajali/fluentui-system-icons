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

public val FluentUi.Filled.Navigation: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Navigation",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 17f)
            horizontalLineTo(21f)
            curveTo(21.552f, 17f, 22f, 17.448f, 22f, 18f)
            curveTo(22f, 18.513f, 21.614f, 18.935f, 21.117f, 18.993f)
            lineTo(21f, 19f)
            horizontalLineTo(3f)
            curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
            curveTo(2f, 17.487f, 2.386f, 17.065f, 2.883f, 17.007f)
            lineTo(3f, 17f)
            horizontalLineTo(21f)
            horizontalLineTo(3f)
            close()
            moveTo(3f, 11f)
            lineTo(21f, 10.998f)
            curveTo(21.552f, 10.998f, 22f, 11.445f, 22f, 11.998f)
            curveTo(22f, 12.51f, 21.614f, 12.933f, 21.117f, 12.991f)
            lineTo(21f, 12.998f)
            lineTo(3f, 13f)
            curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
            curveTo(2f, 11.487f, 2.386f, 11.065f, 2.883f, 11.007f)
            lineTo(3f, 11f)
            lineTo(21f, 10.998f)
            lineTo(3f, 11f)
            close()
            moveTo(3f, 5f)
            horizontalLineTo(21f)
            curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
            curveTo(22f, 6.513f, 21.614f, 6.936f, 21.117f, 6.993f)
            lineTo(21f, 7f)
            horizontalLineTo(3f)
            curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
            curveTo(2f, 5.487f, 2.386f, 5.064f, 2.883f, 5.007f)
            lineTo(3f, 5f)
            horizontalLineTo(21f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NavigationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Navigation, contentDescription = null)
    }
}
