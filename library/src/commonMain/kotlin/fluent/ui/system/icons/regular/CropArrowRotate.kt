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

public val FluentUi.Regular.CropArrowRotate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CropArrowRotate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.702f, 7.636f)
            curveTo(6.188f, 5.157f, 8.9f, 3.5f, 11.999f, 3.5f)
            curveTo(14.595f, 3.5f, 16.92f, 4.664f, 18.48f, 6.5f)
            horizontalLineTo(16.75f)
            curveTo(16.336f, 6.5f, 16f, 6.836f, 16f, 7.25f)
            curveTo(16f, 7.664f, 16.336f, 8f, 16.75f, 8f)
            horizontalLineTo(19.908f)
            curveTo(19.929f, 8.001f, 19.95f, 8.001f, 19.971f, 8f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 8f, 21f, 7.664f, 21f, 7.25f)
            verticalLineTo(3.75f)
            curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
            curveTo(19.836f, 3f, 19.5f, 3.336f, 19.5f, 3.75f)
            verticalLineTo(5.386f)
            curveTo(17.668f, 3.311f, 14.987f, 2f, 11.999f, 2f)
            curveTo(8.352f, 2f, 5.162f, 3.952f, 3.415f, 6.865f)
            curveTo(3.202f, 7.22f, 3.318f, 7.681f, 3.673f, 7.894f)
            curveTo(4.028f, 8.107f, 4.489f, 7.991f, 4.702f, 7.636f)
            close()
            moveTo(4.5f, 18.617f)
            verticalLineTo(20.25f)
            curveTo(4.5f, 20.664f, 4.164f, 21f, 3.75f, 21f)
            curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
            verticalLineTo(16.75f)
            curveTo(3f, 16.336f, 3.336f, 16f, 3.75f, 16f)
            horizontalLineTo(4.027f)
            curveTo(4.048f, 15.999f, 4.068f, 15.999f, 4.089f, 16f)
            horizontalLineTo(7.25f)
            curveTo(7.664f, 16f, 8f, 16.336f, 8f, 16.75f)
            curveTo(8f, 17.164f, 7.664f, 17.5f, 7.25f, 17.5f)
            horizontalLineTo(5.517f)
            curveTo(7.077f, 19.336f, 9.402f, 20.5f, 11.999f, 20.5f)
            curveTo(15.097f, 20.5f, 17.809f, 18.843f, 19.295f, 16.364f)
            curveTo(19.508f, 16.008f, 19.969f, 15.893f, 20.324f, 16.106f)
            curveTo(20.68f, 16.319f, 20.795f, 16.78f, 20.582f, 17.135f)
            curveTo(18.836f, 20.048f, 15.645f, 22f, 11.999f, 22f)
            curveTo(9.012f, 22f, 6.332f, 20.691f, 4.5f, 18.617f)
            close()
            moveTo(9.5f, 6.75f)
            curveTo(9.5f, 6.336f, 9.164f, 6f, 8.75f, 6f)
            curveTo(8.336f, 6f, 8f, 6.336f, 8f, 6.75f)
            verticalLineTo(8f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
            curveTo(6f, 9.164f, 6.336f, 9.5f, 6.75f, 9.5f)
            horizontalLineTo(8f)
            verticalLineTo(13.25f)
            curveTo(8f, 14.769f, 9.231f, 16f, 10.75f, 16f)
            horizontalLineTo(14.5f)
            verticalLineTo(17.25f)
            curveTo(14.5f, 17.664f, 14.836f, 18f, 15.25f, 18f)
            curveTo(15.664f, 18f, 16f, 17.664f, 16f, 17.25f)
            verticalLineTo(16f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 16f, 18f, 15.664f, 18f, 15.25f)
            curveTo(18f, 14.836f, 17.664f, 14.5f, 17.25f, 14.5f)
            horizontalLineTo(10.75f)
            curveTo(10.06f, 14.5f, 9.5f, 13.94f, 9.5f, 13.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(14.5f, 10.75f)
            verticalLineTo(13.5f)
            horizontalLineTo(16f)
            verticalLineTo(10.75f)
            curveTo(16f, 9.231f, 14.769f, 8f, 13.25f, 8f)
            horizontalLineTo(10.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(13.25f)
            curveTo(13.94f, 9.5f, 14.5f, 10.06f, 14.5f, 10.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CropArrowRotatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CropArrowRotate, contentDescription = null)
    }
}
