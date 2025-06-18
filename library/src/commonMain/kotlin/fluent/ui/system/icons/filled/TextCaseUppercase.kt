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

public val FluentUi.Filled.TextCaseUppercase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextCaseUppercase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 3f)
            horizontalLineTo(15f)
            curveTo(14.448f, 3f, 14f, 3.448f, 14f, 4f)
            verticalLineTo(19.25f)
            curveTo(14f, 19.802f, 14.448f, 20.25f, 15f, 20.25f)
            horizontalLineTo(18.875f)
            curveTo(21.568f, 20.25f, 23.75f, 18.067f, 23.75f, 15.375f)
            curveTo(23.75f, 13.571f, 22.771f, 11.996f, 21.314f, 11.153f)
            curveTo(22.2f, 10.29f, 22.75f, 9.084f, 22.75f, 7.75f)
            curveTo(22.75f, 5.127f, 20.624f, 3f, 18f, 3f)
            close()
            moveTo(18f, 10.5f)
            horizontalLineTo(16f)
            verticalLineTo(5f)
            horizontalLineTo(18f)
            curveTo(19.519f, 5f, 20.75f, 6.231f, 20.75f, 7.75f)
            curveTo(20.75f, 9.269f, 19.519f, 10.5f, 18f, 10.5f)
            close()
            moveTo(16f, 18.25f)
            verticalLineTo(12.5f)
            horizontalLineTo(18.875f)
            curveTo(20.463f, 12.5f, 21.75f, 13.787f, 21.75f, 15.375f)
            curveTo(21.75f, 16.963f, 20.463f, 18.25f, 18.875f, 18.25f)
            horizontalLineTo(16f)
            close()
            moveTo(7.257f, 3f)
            curveTo(7.676f, 3.003f, 8.049f, 3.267f, 8.191f, 3.661f)
            lineTo(13.691f, 18.911f)
            curveTo(13.878f, 19.43f, 13.609f, 20.003f, 13.09f, 20.191f)
            curveTo(12.57f, 20.378f, 11.997f, 20.109f, 11.81f, 19.589f)
            lineTo(10.515f, 16f)
            horizontalLineTo(3.794f)
            lineTo(2.436f, 19.603f)
            curveTo(2.241f, 20.12f, 1.664f, 20.381f, 1.147f, 20.186f)
            curveTo(0.631f, 19.991f, 0.37f, 19.414f, 0.565f, 18.897f)
            lineTo(6.315f, 3.647f)
            curveTo(6.462f, 3.255f, 6.839f, 2.997f, 7.257f, 3f)
            close()
            moveTo(4.549f, 14f)
            horizontalLineTo(9.794f)
            lineTo(7.229f, 6.89f)
            lineTo(4.549f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextCaseUppercasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextCaseUppercase, contentDescription = null)
    }
}
