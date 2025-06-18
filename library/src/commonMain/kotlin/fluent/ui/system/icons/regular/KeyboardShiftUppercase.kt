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

public val FluentUi.Regular.KeyboardShiftUppercase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.KeyboardShiftUppercase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.321f, 2.603f)
            curveTo(12.623f, 1.799f, 11.375f, 1.799f, 10.677f, 2.603f)
            lineTo(2.432f, 12.107f)
            curveTo(1.449f, 13.24f, 2.254f, 15.004f, 3.754f, 15.004f)
            horizontalLineTo(7f)
            verticalLineTo(17.25f)
            curveTo(7f, 18.216f, 7.783f, 19f, 8.75f, 19f)
            horizontalLineTo(15.25f)
            curveTo(16.216f, 19f, 17f, 18.216f, 17f, 17.25f)
            verticalLineTo(15.004f)
            horizontalLineTo(20.245f)
            curveTo(21.745f, 15.004f, 22.55f, 13.24f, 21.567f, 12.107f)
            lineTo(13.321f, 2.603f)
            close()
            moveTo(11.811f, 3.586f)
            curveTo(11.91f, 3.471f, 12.089f, 3.471f, 12.188f, 3.586f)
            lineTo(20.434f, 13.09f)
            curveTo(20.574f, 13.252f, 20.459f, 13.504f, 20.245f, 13.504f)
            horizontalLineTo(16.25f)
            curveTo(15.836f, 13.504f, 15.5f, 13.84f, 15.5f, 14.254f)
            verticalLineTo(17.25f)
            curveTo(15.5f, 17.388f, 15.388f, 17.5f, 15.25f, 17.5f)
            horizontalLineTo(8.75f)
            curveTo(8.612f, 17.5f, 8.5f, 17.388f, 8.5f, 17.25f)
            verticalLineTo(14.254f)
            curveTo(8.5f, 13.84f, 8.164f, 13.504f, 7.75f, 13.504f)
            horizontalLineTo(3.754f)
            curveTo(3.54f, 13.504f, 3.425f, 13.252f, 3.565f, 13.09f)
            lineTo(11.811f, 3.586f)
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
        Image(imageVector = FluentUi.Regular.KeyboardShiftUppercase, contentDescription = null)
    }
}
