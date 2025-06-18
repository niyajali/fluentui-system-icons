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

public val FluentUi.Filled.Send: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Send",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.815f, 12.197f)
            lineTo(5.283f, 13.452f)
            curveTo(5.107f, 13.481f, 4.96f, 13.603f, 4.897f, 13.77f)
            lineTo(2.299f, 20.728f)
            curveTo(2.051f, 21.367f, 2.72f, 21.977f, 3.334f, 21.67f)
            lineTo(21.334f, 12.67f)
            curveTo(21.886f, 12.394f, 21.886f, 11.605f, 21.334f, 11.329f)
            lineTo(3.334f, 2.329f)
            curveTo(2.72f, 2.022f, 2.051f, 2.632f, 2.299f, 3.272f)
            lineTo(4.897f, 10.229f)
            curveTo(4.96f, 10.396f, 5.107f, 10.518f, 5.283f, 10.547f)
            lineTo(12.815f, 11.802f)
            curveTo(12.924f, 11.821f, 12.997f, 11.924f, 12.979f, 12.033f)
            curveTo(12.965f, 12.117f, 12.899f, 12.183f, 12.815f, 12.197f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SendPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Send, contentDescription = null)
    }
}
