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

public val FluentUi.Regular.AlignBottom: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignBottom",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.75f, 21f)
            curveTo(2.336f, 21f, 2f, 20.664f, 2f, 20.25f)
            curveTo(2f, 19.836f, 2.336f, 19.5f, 2.75f, 19.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 19.5f, 22f, 19.836f, 22f, 20.25f)
            curveTo(22f, 20.664f, 21.664f, 21f, 21.25f, 21f)
            horizontalLineTo(2.75f)
            close()
            moveTo(4f, 15.75f)
            curveTo(4f, 16.993f, 5.007f, 18f, 6.25f, 18f)
            horizontalLineTo(8.75f)
            curveTo(9.993f, 18f, 11f, 16.993f, 11f, 15.75f)
            lineTo(11f, 5.25f)
            curveTo(11f, 4.007f, 9.993f, 3f, 8.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 3f, 4f, 4.007f, 4f, 5.25f)
            lineTo(4f, 15.75f)
            close()
            moveTo(6.25f, 16.5f)
            curveTo(5.836f, 16.5f, 5.5f, 16.164f, 5.5f, 15.75f)
            lineTo(5.5f, 5.25f)
            curveTo(5.5f, 4.836f, 5.836f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(8.75f)
            curveTo(9.164f, 4.5f, 9.5f, 4.836f, 9.5f, 5.25f)
            lineTo(9.5f, 15.75f)
            curveTo(9.5f, 16.164f, 9.164f, 16.5f, 8.75f, 16.5f)
            horizontalLineTo(6.25f)
            close()
            moveTo(13f, 15.75f)
            curveTo(13f, 16.993f, 14.007f, 18f, 15.25f, 18f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 18f, 20f, 16.993f, 20f, 15.75f)
            verticalLineTo(8.75f)
            curveTo(20f, 7.507f, 18.993f, 6.5f, 17.75f, 6.5f)
            horizontalLineTo(15.25f)
            curveTo(14.007f, 6.5f, 13f, 7.507f, 13f, 8.75f)
            lineTo(13f, 15.75f)
            close()
            moveTo(15.25f, 16.5f)
            curveTo(14.836f, 16.5f, 14.5f, 16.164f, 14.5f, 15.75f)
            lineTo(14.5f, 8.75f)
            curveTo(14.5f, 8.336f, 14.836f, 8f, 15.25f, 8f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 8f, 18.5f, 8.336f, 18.5f, 8.75f)
            verticalLineTo(15.75f)
            curveTo(18.5f, 16.164f, 18.164f, 16.5f, 17.75f, 16.5f)
            horizontalLineTo(15.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlignBottomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AlignBottom, contentDescription = null)
    }
}
