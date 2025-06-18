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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ContactCardRibbon: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ContactCardRibbon",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.75f, 4f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineTo(11.758f)
            curveTo(21.551f, 11.457f, 21.044f, 11.235f, 20.5f, 11.111f)
            verticalLineTo(6.25f)
            curveTo(20.5f, 5.836f, 20.164f, 5.5f, 19.75f, 5.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineTo(17.755f)
            curveTo(3.5f, 18.169f, 3.836f, 18.505f, 4.25f, 18.505f)
            horizontalLineTo(16f)
            verticalLineTo(20.005f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20.005f, 2f, 18.997f, 2f, 17.755f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineTo(19.75f)
            close()
            moveTo(13.252f, 12.996f)
            horizontalLineTo(15.76f)
            curveTo(15.459f, 13.445f, 15.236f, 13.952f, 15.112f, 14.496f)
            horizontalLineTo(13.252f)
            curveTo(12.838f, 14.496f, 12.502f, 14.16f, 12.502f, 13.746f)
            curveTo(12.502f, 13.366f, 12.784f, 13.053f, 13.151f, 13.003f)
            lineTo(13.252f, 12.996f)
            close()
            moveTo(9.75f, 12.5f)
            curveTo(10.164f, 12.5f, 10.5f, 12.836f, 10.5f, 13.25f)
            verticalLineTo(13.743f)
            lineTo(10.492f, 13.851f)
            curveTo(10.329f, 14.964f, 9.398f, 15.501f, 8f, 15.501f)
            curveTo(6.602f, 15.501f, 5.67f, 14.964f, 5.508f, 13.85f)
            lineTo(5.5f, 13.742f)
            verticalLineTo(13.25f)
            curveTo(5.5f, 12.836f, 5.836f, 12.5f, 6.25f, 12.5f)
            horizontalLineTo(9.75f)
            close()
            moveTo(8f, 8.502f)
            curveTo(8.828f, 8.502f, 9.5f, 9.174f, 9.5f, 10.002f)
            curveTo(9.5f, 10.831f, 8.828f, 11.502f, 8f, 11.502f)
            curveTo(7.172f, 11.502f, 6.5f, 10.831f, 6.5f, 10.002f)
            curveTo(6.5f, 9.174f, 7.172f, 8.502f, 8f, 8.502f)
            close()
            moveTo(13.252f, 9.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 9.5f, 18.5f, 9.836f, 18.5f, 10.25f)
            curveTo(18.5f, 10.63f, 18.218f, 10.943f, 17.852f, 10.993f)
            lineTo(17.75f, 11f)
            horizontalLineTo(13.252f)
            curveTo(12.838f, 11f, 12.502f, 10.664f, 12.502f, 10.25f)
            curveTo(12.502f, 9.87f, 12.784f, 9.557f, 13.151f, 9.507f)
            lineTo(13.252f, 9.5f)
            close()
            moveTo(23f, 15.5f)
            curveTo(23f, 17.433f, 21.433f, 19f, 19.5f, 19f)
            curveTo(17.567f, 19f, 16f, 17.433f, 16f, 15.5f)
            curveTo(16f, 13.567f, 17.567f, 12f, 19.5f, 12f)
            curveTo(21.433f, 12f, 23f, 13.567f, 23f, 15.5f)
            close()
            moveTo(17f, 19.242f)
            verticalLineTo(22.286f)
            curveTo(17f, 22.918f, 17.765f, 23.235f, 18.212f, 22.788f)
            lineTo(19.5f, 21.5f)
            lineTo(20.788f, 22.788f)
            curveTo(21.235f, 23.235f, 22f, 22.918f, 22f, 22.286f)
            verticalLineTo(19.242f)
            curveTo(21.285f, 19.721f, 20.425f, 20f, 19.5f, 20f)
            curveTo(18.575f, 20f, 17.715f, 19.721f, 17f, 19.242f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ContactCardRibbonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ContactCardRibbon, contentDescription = null)
    }
}
