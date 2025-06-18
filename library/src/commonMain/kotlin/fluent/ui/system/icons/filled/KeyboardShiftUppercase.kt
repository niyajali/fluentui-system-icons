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

public val FluentUi.Filled.KeyboardShiftUppercase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyboardShiftUppercase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.321f, 2.603f)
            curveTo(12.623f, 1.799f, 11.375f, 1.799f, 10.677f, 2.603f)
            lineTo(2.432f, 12.107f)
            curveTo(1.449f, 13.24f, 2.253f, 15.004f, 3.753f, 15.004f)
            horizontalLineTo(6.999f)
            verticalLineTo(17.251f)
            curveTo(6.999f, 18.217f, 7.783f, 19.001f, 8.749f, 19.001f)
            horizontalLineTo(15.249f)
            curveTo(16.216f, 19.001f, 16.999f, 18.217f, 16.999f, 17.251f)
            verticalLineTo(15.004f)
            horizontalLineTo(20.244f)
            curveTo(21.744f, 15.004f, 22.549f, 13.24f, 21.566f, 12.107f)
            lineTo(13.321f, 2.603f)
            close()
            moveTo(7.75f, 20.5f)
            curveTo(7.336f, 20.5f, 7f, 20.836f, 7f, 21.25f)
            curveTo(7f, 21.664f, 7.336f, 22f, 7.75f, 22f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 22f, 17f, 21.664f, 17f, 21.25f)
            curveTo(17f, 20.836f, 16.664f, 20.5f, 16.25f, 20.5f)
            horizontalLineTo(7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KeyboardShiftUppercasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.KeyboardShiftUppercase, contentDescription = null)
    }
}
