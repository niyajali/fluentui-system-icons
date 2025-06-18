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

public val FluentUi.Filled.Sticker: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Sticker",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(12.999f)
            lineTo(16.251f, 13f)
            lineTo(16.038f, 13.007f)
            curveTo(14.84f, 13.085f, 13.819f, 13.811f, 13.324f, 14.839f)
            curveTo(12.904f, 14.953f, 12.464f, 15.009f, 12.001f, 15.009f)
            curveTo(10.956f, 15.009f, 10.021f, 14.72f, 9.177f, 14.136f)
            curveTo(8.836f, 13.9f, 8.369f, 13.985f, 8.133f, 14.326f)
            curveTo(7.897f, 14.667f, 7.983f, 15.134f, 8.323f, 15.369f)
            curveTo(9.42f, 16.128f, 10.652f, 16.51f, 12.001f, 16.51f)
            curveTo(12.228f, 16.51f, 12.452f, 16.499f, 12.672f, 16.477f)
            lineTo(13.001f, 16.436f)
            lineTo(13f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(20.341f, 14.72f)
            lineTo(14.72f, 20.341f)
            curveTo(14.651f, 20.41f, 14.578f, 20.474f, 14.502f, 20.532f)
            lineTo(14.501f, 16.25f)
            lineTo(14.507f, 16.107f)
            curveTo(14.576f, 15.257f, 15.252f, 14.579f, 16.1f, 14.507f)
            lineTo(16.251f, 14.5f)
            lineTo(20.533f, 14.501f)
            curveTo(20.474f, 14.577f, 20.41f, 14.651f, 20.341f, 14.72f)
            close()
            moveTo(9f, 7.751f)
            curveTo(8.31f, 7.751f, 7.751f, 8.31f, 7.751f, 9f)
            curveTo(7.751f, 9.69f, 8.31f, 10.25f, 9f, 10.25f)
            curveTo(9.69f, 10.25f, 10.25f, 9.69f, 10.25f, 9f)
            curveTo(10.25f, 8.31f, 9.69f, 7.751f, 9f, 7.751f)
            close()
            moveTo(15f, 7.751f)
            curveTo(14.311f, 7.751f, 13.751f, 8.31f, 13.751f, 9f)
            curveTo(13.751f, 9.69f, 14.311f, 10.25f, 15f, 10.25f)
            curveTo(15.69f, 10.25f, 16.25f, 9.69f, 16.25f, 9f)
            curveTo(16.25f, 8.31f, 15.69f, 7.751f, 15f, 7.751f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StickerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Sticker, contentDescription = null)
    }
}
