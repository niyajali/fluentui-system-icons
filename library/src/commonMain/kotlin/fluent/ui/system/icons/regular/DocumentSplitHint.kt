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

public val FluentUi.Regular.DocumentSplitHint: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentSplitHint",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20f, 11.25f)
            curveTo(20f, 11.664f, 19.664f, 12f, 19.25f, 12f)
            curveTo(18.836f, 12f, 18.5f, 11.664f, 18.5f, 11.25f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.896f, 10f, 12f, 9.104f, 12f, 8f)
            verticalLineTo(3.5f)
            horizontalLineTo(6f)
            curveTo(5.724f, 3.5f, 5.5f, 3.725f, 5.5f, 4f)
            verticalLineTo(11.25f)
            curveTo(5.5f, 11.664f, 5.164f, 12f, 4.75f, 12f)
            curveTo(4.336f, 12f, 4f, 11.664f, 4f, 11.25f)
            verticalLineTo(4f)
            curveTo(4f, 2.896f, 4.896f, 2f, 6f, 2f)
            horizontalLineTo(12.172f)
            curveTo(12.2f, 2f, 12.227f, 2.004f, 12.254f, 2.007f)
            curveTo(12.274f, 2.01f, 12.293f, 2.013f, 12.313f, 2.014f)
            curveTo(12.528f, 2.029f, 12.74f, 2.07f, 12.937f, 2.152f)
            curveTo(12.994f, 2.176f, 13.049f, 2.208f, 13.103f, 2.239f)
            curveTo(13.12f, 2.249f, 13.136f, 2.259f, 13.153f, 2.268f)
            curveTo(13.168f, 2.276f, 13.184f, 2.284f, 13.2f, 2.292f)
            curveTo(13.228f, 2.305f, 13.256f, 2.319f, 13.281f, 2.336f)
            curveTo(13.359f, 2.389f, 13.429f, 2.452f, 13.5f, 2.516f)
            curveTo(13.512f, 2.526f, 13.524f, 2.536f, 13.536f, 2.545f)
            curveTo(13.553f, 2.558f, 13.57f, 2.571f, 13.585f, 2.586f)
            lineTo(19.414f, 8.414f)
            curveTo(19.741f, 8.741f, 19.943f, 9.17f, 19.99f, 9.625f)
            curveTo(19.997f, 9.666f, 20f, 9.708f, 20f, 9.75f)
            verticalLineTo(11.25f)
            close()
            moveTo(13.5f, 4.621f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.275f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(17.378f)
            lineTo(13.5f, 4.621f)
            close()
            moveTo(4.75f, 13f)
            curveTo(5.164f, 13f, 5.5f, 13.336f, 5.5f, 13.75f)
            verticalLineTo(16.245f)
            curveTo(5.5f, 16.659f, 5.164f, 16.995f, 4.75f, 16.995f)
            curveTo(4.336f, 16.995f, 4f, 16.659f, 4f, 16.245f)
            verticalLineTo(13.75f)
            curveTo(4f, 13.336f, 4.336f, 13f, 4.75f, 13f)
            close()
            moveTo(20f, 13.75f)
            curveTo(20f, 13.336f, 19.664f, 13f, 19.25f, 13f)
            curveTo(18.836f, 13f, 18.5f, 13.336f, 18.5f, 13.75f)
            verticalLineTo(16.245f)
            curveTo(18.5f, 16.659f, 18.836f, 16.995f, 19.25f, 16.995f)
            curveTo(19.664f, 16.995f, 20f, 16.659f, 20f, 16.245f)
            verticalLineTo(13.75f)
            close()
            moveTo(9.5f, 21.25f)
            curveTo(9.5f, 20.836f, 9.836f, 20.5f, 10.25f, 20.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 20.5f, 14.5f, 20.836f, 14.5f, 21.25f)
            curveTo(14.5f, 21.664f, 14.164f, 22f, 13.75f, 22f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 22f, 9.5f, 21.664f, 9.5f, 21.25f)
            close()
            moveTo(5.5f, 19.25f)
            curveTo(5.5f, 18.836f, 5.164f, 18.5f, 4.75f, 18.5f)
            curveTo(4.336f, 18.5f, 4f, 18.836f, 4f, 19.25f)
            verticalLineTo(20f)
            curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
            horizontalLineTo(7.25f)
            curveTo(7.664f, 22f, 8f, 21.664f, 8f, 21.25f)
            curveTo(8f, 20.836f, 7.664f, 20.5f, 7.25f, 20.5f)
            horizontalLineTo(6f)
            curveTo(5.724f, 20.5f, 5.5f, 20.276f, 5.5f, 20f)
            verticalLineTo(19.25f)
            close()
            moveTo(19.25f, 18.5f)
            curveTo(18.836f, 18.5f, 18.5f, 18.836f, 18.5f, 19.25f)
            verticalLineTo(20f)
            curveTo(18.5f, 20.276f, 18.276f, 20.5f, 18f, 20.5f)
            horizontalLineTo(16.75f)
            curveTo(16.336f, 20.5f, 16f, 20.836f, 16f, 21.25f)
            curveTo(16f, 21.664f, 16.336f, 22f, 16.75f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(19.25f)
            curveTo(20f, 18.836f, 19.664f, 18.5f, 19.25f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentSplitHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentSplitHint, contentDescription = null)
    }
}
