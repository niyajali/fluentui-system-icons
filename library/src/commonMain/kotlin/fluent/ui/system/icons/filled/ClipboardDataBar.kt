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

public val FluentUi.Filled.ClipboardDataBar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardDataBar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            close()
            moveTo(13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
            lineTo(6.25f, 4f)
            curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
            lineTo(15.986f, 3.999f)
            curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
            close()
            moveTo(16.5f, 13.75f)
            verticalLineTo(17.25f)
            curveTo(16.5f, 17.664f, 16.164f, 18f, 15.75f, 18f)
            curveTo(15.336f, 18f, 15f, 17.664f, 15f, 17.25f)
            verticalLineTo(13.75f)
            curveTo(15f, 13.336f, 15.336f, 13f, 15.75f, 13f)
            curveTo(16.164f, 13f, 16.5f, 13.336f, 16.5f, 13.75f)
            close()
            moveTo(12f, 11f)
            curveTo(12.414f, 11f, 12.75f, 11.336f, 12.75f, 11.75f)
            verticalLineTo(17.25f)
            curveTo(12.75f, 17.664f, 12.414f, 18f, 12f, 18f)
            curveTo(11.586f, 18f, 11.25f, 17.664f, 11.25f, 17.25f)
            verticalLineTo(11.75f)
            curveTo(11.25f, 11.336f, 11.586f, 11f, 12f, 11f)
            close()
            moveTo(9f, 9.75f)
            verticalLineTo(17.25f)
            curveTo(9f, 17.664f, 8.664f, 18f, 8.25f, 18f)
            curveTo(7.836f, 18f, 7.5f, 17.664f, 7.5f, 17.25f)
            verticalLineTo(9.75f)
            curveTo(7.5f, 9.336f, 7.836f, 9f, 8.25f, 9f)
            curveTo(8.664f, 9f, 9f, 9.336f, 9f, 9.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardDataBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClipboardDataBar, contentDescription = null)
    }
}
