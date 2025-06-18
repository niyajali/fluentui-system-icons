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

public val FluentUi.Regular.BinderTriangle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BinderTriangle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 4.25f)
            curveTo(3f, 3.007f, 4.007f, 2f, 5.25f, 2f)
            horizontalLineTo(14.75f)
            curveTo(15.993f, 2f, 17f, 3.007f, 17f, 4.25f)
            verticalLineTo(6.551f)
            lineTo(15.5f, 8.425f)
            verticalLineTo(4.25f)
            curveTo(15.5f, 3.836f, 15.164f, 3.5f, 14.75f, 3.5f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 3.5f, 4.5f, 3.836f, 4.5f, 4.25f)
            verticalLineTo(5f)
            horizontalLineTo(5.25f)
            curveTo(5.664f, 5f, 6f, 5.336f, 6f, 5.75f)
            curveTo(6f, 6.164f, 5.664f, 6.5f, 5.25f, 6.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(9.75f)
            horizontalLineTo(5.25f)
            curveTo(5.664f, 9.75f, 6f, 10.086f, 6f, 10.5f)
            curveTo(6f, 10.914f, 5.664f, 11.25f, 5.25f, 11.25f)
            horizontalLineTo(4.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(5.25f)
            curveTo(5.664f, 14.5f, 6f, 14.836f, 6f, 15.25f)
            curveTo(6f, 15.664f, 5.664f, 16f, 5.25f, 16f)
            horizontalLineTo(4.5f)
            verticalLineTo(16.75f)
            curveTo(4.5f, 17.164f, 4.836f, 17.5f, 5.25f, 17.5f)
            horizontalLineTo(8.239f)
            lineTo(7.039f, 19f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 19f, 3f, 17.993f, 3f, 16.75f)
            verticalLineTo(16f)
            horizontalLineTo(2.25f)
            curveTo(1.836f, 16f, 1.5f, 15.664f, 1.5f, 15.25f)
            curveTo(1.5f, 14.836f, 1.836f, 14.5f, 2.25f, 14.5f)
            horizontalLineTo(3f)
            verticalLineTo(11.25f)
            horizontalLineTo(2.25f)
            curveTo(1.836f, 11.25f, 1.5f, 10.914f, 1.5f, 10.5f)
            curveTo(1.5f, 10.086f, 1.836f, 9.75f, 2.25f, 9.75f)
            horizontalLineTo(3f)
            verticalLineTo(6.5f)
            horizontalLineTo(2.25f)
            curveTo(1.836f, 6.5f, 1.5f, 6.164f, 1.5f, 5.75f)
            curveTo(1.5f, 5.336f, 1.836f, 5f, 2.25f, 5f)
            horizontalLineTo(3f)
            verticalLineTo(4.25f)
            close()
            moveTo(7.75f, 7f)
            curveTo(7.336f, 7f, 7f, 7.336f, 7f, 7.75f)
            curveTo(7f, 8.164f, 7.336f, 8.5f, 7.75f, 8.5f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 8.5f, 13f, 8.164f, 13f, 7.75f)
            curveTo(13f, 7.336f, 12.664f, 7f, 12.25f, 7f)
            horizontalLineTo(7.75f)
            close()
            moveTo(18f, 13.126f)
            curveTo(18f, 12.653f, 17.405f, 12.445f, 17.11f, 12.814f)
            lineTo(12.812f, 18.188f)
            curveTo(12.55f, 18.515f, 12.783f, 19f, 13.203f, 19f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 19f, 18f, 18.664f, 18f, 18.25f)
            verticalLineTo(13.126f)
            close()
            moveTo(16.541f, 17.541f)
            horizontalLineTo(15.198f)
            lineTo(16.541f, 15.862f)
            verticalLineTo(17.541f)
            close()
            moveTo(21f, 6.003f)
            curveTo(21f, 5.057f, 19.81f, 4.64f, 19.219f, 5.378f)
            lineTo(7.22f, 20.375f)
            curveTo(6.696f, 21.029f, 7.162f, 21.999f, 8f, 21.999f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 21.999f, 21f, 20.992f, 21f, 19.749f)
            verticalLineTo(6.003f)
            close()
            moveTo(19.5f, 7.428f)
            verticalLineTo(19.749f)
            curveTo(19.5f, 20.163f, 19.164f, 20.499f, 18.75f, 20.499f)
            horizontalLineTo(9.041f)
            lineTo(19.5f, 7.428f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BinderTrianglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BinderTriangle, contentDescription = null)
    }
}
