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

public val FluentUi.Filled.Options: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Options",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.75f, 13.5f)
            curveTo(10.287f, 13.5f, 11.575f, 14.567f, 11.913f, 16f)
            lineTo(21.25f, 16f)
            curveTo(21.664f, 16f, 22f, 16.336f, 22f, 16.75f)
            curveTo(22f, 17.13f, 21.718f, 17.444f, 21.352f, 17.493f)
            lineTo(21.25f, 17.5f)
            lineTo(11.913f, 17.501f)
            curveTo(11.574f, 18.934f, 10.287f, 20f, 8.75f, 20f)
            curveTo(7.213f, 20f, 5.926f, 18.934f, 5.587f, 17.501f)
            lineTo(2.75f, 17.5f)
            curveTo(2.336f, 17.5f, 2f, 17.164f, 2f, 16.75f)
            curveTo(2f, 16.37f, 2.282f, 16.056f, 2.648f, 16.007f)
            lineTo(2.75f, 16f)
            lineTo(5.587f, 16f)
            curveTo(5.925f, 14.567f, 7.213f, 13.5f, 8.75f, 13.5f)
            close()
            moveTo(15.25f, 4f)
            curveTo(16.787f, 4f, 18.075f, 5.067f, 18.413f, 6.5f)
            lineTo(21.25f, 6.5f)
            curveTo(21.664f, 6.5f, 22f, 6.836f, 22f, 7.25f)
            curveTo(22f, 7.63f, 21.718f, 7.943f, 21.352f, 7.993f)
            lineTo(21.25f, 8f)
            lineTo(18.413f, 8.001f)
            curveTo(18.074f, 9.434f, 16.787f, 10.5f, 15.25f, 10.5f)
            curveTo(13.713f, 10.5f, 12.426f, 9.434f, 12.087f, 8.001f)
            lineTo(2.75f, 8f)
            curveTo(2.336f, 8f, 2f, 7.664f, 2f, 7.25f)
            curveTo(2f, 6.87f, 2.282f, 6.557f, 2.648f, 6.507f)
            lineTo(2.75f, 6.5f)
            lineTo(12.087f, 6.5f)
            curveTo(12.425f, 5.067f, 13.713f, 4f, 15.25f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OptionsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Options, contentDescription = null)
    }
}
