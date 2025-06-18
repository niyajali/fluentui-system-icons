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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ScanText: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ScanText",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5.25f)
            curveTo(4f, 4.56f, 4.56f, 4f, 5.25f, 4f)
            horizontalLineTo(8f)
            curveTo(8.552f, 4f, 9f, 3.552f, 9f, 3f)
            curveTo(9f, 2.955f, 8.997f, 2.91f, 8.991f, 2.866f)
            curveTo(8.997f, 2.828f, 9f, 2.789f, 9f, 2.75f)
            curveTo(9f, 2.336f, 8.664f, 2f, 8.25f, 2f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(2f, 8.664f, 2.336f, 9f, 2.75f, 9f)
            curveTo(2.789f, 9f, 2.828f, 8.997f, 2.866f, 8.991f)
            curveTo(2.91f, 8.997f, 2.955f, 9f, 3f, 9f)
            curveTo(3.552f, 9f, 4f, 8.552f, 4f, 8f)
            verticalLineTo(5.25f)
            close()
            moveTo(4f, 18.75f)
            curveTo(4f, 19.44f, 4.56f, 20f, 5.25f, 20f)
            horizontalLineTo(8f)
            curveTo(8.552f, 20f, 9f, 20.448f, 9f, 21f)
            curveTo(9f, 21.045f, 8.997f, 21.09f, 8.991f, 21.134f)
            curveTo(8.997f, 21.172f, 9f, 21.211f, 9f, 21.25f)
            curveTo(9f, 21.664f, 8.664f, 22f, 8.25f, 22f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 22f, 2f, 20.545f, 2f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(2f, 15.336f, 2.336f, 15f, 2.75f, 15f)
            curveTo(2.789f, 15f, 2.828f, 15.003f, 2.866f, 15.009f)
            curveTo(2.91f, 15.003f, 2.955f, 15f, 3f, 15f)
            curveTo(3.552f, 15f, 4f, 15.448f, 4f, 16f)
            verticalLineTo(18.75f)
            close()
            moveTo(18.75f, 4f)
            curveTo(19.44f, 4f, 20f, 4.56f, 20f, 5.25f)
            verticalLineTo(8f)
            curveTo(20f, 8.552f, 20.448f, 9f, 21f, 9f)
            curveTo(21.045f, 9f, 21.09f, 8.997f, 21.134f, 8.991f)
            curveTo(21.172f, 8.997f, 21.211f, 9f, 21.25f, 9f)
            curveTo(21.664f, 9f, 22f, 8.664f, 22f, 8.25f)
            verticalLineTo(5.25f)
            curveTo(22f, 3.455f, 20.545f, 2f, 18.75f, 2f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 2f, 15f, 2.336f, 15f, 2.75f)
            curveTo(15f, 2.789f, 15.003f, 2.828f, 15.009f, 2.866f)
            curveTo(15.003f, 2.91f, 15f, 2.955f, 15f, 3f)
            curveTo(15f, 3.552f, 15.448f, 4f, 16f, 4f)
            horizontalLineTo(18.75f)
            close()
            moveTo(20f, 18.75f)
            curveTo(20f, 19.44f, 19.44f, 20f, 18.75f, 20f)
            horizontalLineTo(16f)
            curveTo(15.448f, 20f, 15f, 20.448f, 15f, 21f)
            curveTo(15f, 21.045f, 15.003f, 21.09f, 15.009f, 21.134f)
            curveTo(15.003f, 21.172f, 15f, 21.211f, 15f, 21.25f)
            curveTo(15f, 21.664f, 15.336f, 22f, 15.75f, 22f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(22f, 15.336f, 21.664f, 15f, 21.25f, 15f)
            curveTo(21.211f, 15f, 21.172f, 15.003f, 21.134f, 15.009f)
            curveTo(21.09f, 15.003f, 21.045f, 15f, 21f, 15f)
            curveTo(20.448f, 15f, 20f, 15.448f, 20f, 16f)
            verticalLineTo(18.75f)
            close()
            moveTo(7f, 8f)
            curveTo(7f, 7.448f, 7.448f, 7f, 8f, 7f)
            horizontalLineTo(16f)
            curveTo(16.552f, 7f, 17f, 7.448f, 17f, 8f)
            curveTo(17f, 8.552f, 16.552f, 9f, 16f, 9f)
            horizontalLineTo(8f)
            curveTo(7.448f, 9f, 7f, 8.552f, 7f, 8f)
            close()
            moveTo(8f, 11f)
            curveTo(7.448f, 11f, 7f, 11.448f, 7f, 12f)
            curveTo(7f, 12.552f, 7.448f, 13f, 8f, 13f)
            horizontalLineTo(16f)
            curveTo(16.552f, 13f, 17f, 12.552f, 17f, 12f)
            curveTo(17f, 11.448f, 16.552f, 11f, 16f, 11f)
            horizontalLineTo(8f)
            close()
            moveTo(7f, 16f)
            curveTo(7f, 15.448f, 7.448f, 15f, 8f, 15f)
            horizontalLineTo(12f)
            curveTo(12.552f, 15f, 13f, 15.448f, 13f, 16f)
            curveTo(13f, 16.552f, 12.552f, 17f, 12f, 17f)
            horizontalLineTo(8f)
            curveTo(7.448f, 17f, 7f, 16.552f, 7f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScanTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ScanText, contentDescription = null)
    }
}
