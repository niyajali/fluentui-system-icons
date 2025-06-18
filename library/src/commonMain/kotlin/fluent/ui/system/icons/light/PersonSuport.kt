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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.PersonSuport: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PersonSuport",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 11f)
            curveTo(8f, 6.582f, 11.582f, 3f, 16f, 3f)
            curveTo(20.418f, 3f, 24f, 6.582f, 24f, 11f)
            curveTo(24f, 11.276f, 24.224f, 11.5f, 24.5f, 11.5f)
            curveTo(24.776f, 11.5f, 25f, 11.276f, 25f, 11f)
            curveTo(25f, 6.029f, 20.971f, 2f, 16f, 2f)
            curveTo(11.029f, 2f, 7f, 6.029f, 7f, 11f)
            curveTo(7f, 15.344f, 10.078f, 18.97f, 14.173f, 19.814f)
            curveTo(14.485f, 20.513f, 15.186f, 21f, 16f, 21f)
            curveTo(17.105f, 21f, 18f, 20.105f, 18f, 19f)
            curveTo(18f, 18.636f, 17.903f, 18.294f, 17.732f, 18f)
            curveTo(17.387f, 17.402f, 16.74f, 17f, 16f, 17f)
            curveTo(14.979f, 17f, 14.137f, 17.764f, 14.015f, 18.752f)
            curveTo(10.557f, 17.869f, 8f, 14.733f, 8f, 11f)
            close()
            moveTo(16f, 6f)
            curveTo(13.239f, 6f, 11f, 8.239f, 11f, 11f)
            curveTo(11f, 13.761f, 13.239f, 16f, 16f, 16f)
            curveTo(15.273f, 16f, 14.606f, 16.258f, 14.087f, 16.689f)
            curveTo(11.711f, 15.89f, 10f, 13.645f, 10f, 11f)
            curveTo(10f, 7.686f, 12.686f, 5f, 16f, 5f)
            curveTo(19.314f, 5f, 22f, 7.686f, 22f, 11f)
            curveTo(22f, 13.645f, 20.289f, 15.89f, 17.913f, 16.689f)
            curveTo(17.393f, 16.258f, 16.727f, 16f, 16f, 16f)
            curveTo(18.761f, 16f, 21f, 13.761f, 21f, 11f)
            curveTo(21f, 8.239f, 18.761f, 6f, 16f, 6f)
            close()
            moveTo(24.5f, 19f)
            horizontalLineTo(19f)
            curveTo(19f, 18.649f, 18.94f, 18.313f, 18.829f, 18f)
            horizontalLineTo(24.5f)
            curveTo(26.433f, 18f, 28f, 19.567f, 28f, 21.5f)
            lineTo(28f, 22.167f)
            curveTo(28f, 24.316f, 25.234f, 30f, 16f, 30f)
            curveTo(6.766f, 30f, 4f, 24.316f, 4f, 22.167f)
            verticalLineTo(21.5f)
            curveTo(4f, 19.567f, 5.567f, 18f, 7.5f, 18f)
            horizontalLineTo(8.859f)
            curveTo(9.213f, 18.361f, 9.594f, 18.696f, 9.999f, 19f)
            horizontalLineTo(7.5f)
            curveTo(6.119f, 19f, 5f, 20.119f, 5f, 21.5f)
            verticalLineTo(22.167f)
            curveTo(5f, 23.684f, 7.234f, 29f, 16f, 29f)
            curveTo(24.765f, 29f, 27f, 23.684f, 27f, 22.167f)
            lineTo(27f, 21.5f)
            curveTo(27f, 20.119f, 25.881f, 19f, 24.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonSuportPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.PersonSuport, contentDescription = null)
    }
}
