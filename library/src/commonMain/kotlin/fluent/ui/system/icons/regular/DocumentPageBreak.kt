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

public val FluentUi.Regular.DocumentPageBreak: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentPageBreak",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.5f, 12f)
            curveTo(2.5f, 11.586f, 2.836f, 11.25f, 3.25f, 11.25f)
            horizontalLineTo(4.75f)
            curveTo(5.164f, 11.25f, 5.5f, 11.586f, 5.5f, 12f)
            curveTo(5.5f, 12.414f, 5.164f, 12.75f, 4.75f, 12.75f)
            horizontalLineTo(3.25f)
            curveTo(2.836f, 12.75f, 2.5f, 12.414f, 2.5f, 12f)
            close()
            moveTo(6.5f, 12f)
            curveTo(6.5f, 11.586f, 6.836f, 11.25f, 7.25f, 11.25f)
            horizontalLineTo(8.75f)
            curveTo(9.164f, 11.25f, 9.5f, 11.586f, 9.5f, 12f)
            curveTo(9.5f, 12.414f, 9.164f, 12.75f, 8.75f, 12.75f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 12.75f, 6.5f, 12.414f, 6.5f, 12f)
            close()
            moveTo(10.5f, 12f)
            curveTo(10.5f, 11.586f, 10.836f, 11.25f, 11.25f, 11.25f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 11.25f, 13.5f, 11.586f, 13.5f, 12f)
            curveTo(13.5f, 12.414f, 13.164f, 12.75f, 12.75f, 12.75f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 12.75f, 10.5f, 12.414f, 10.5f, 12f)
            close()
            moveTo(14.5f, 12f)
            curveTo(14.5f, 11.586f, 14.836f, 11.25f, 15.25f, 11.25f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 11.25f, 17.5f, 11.586f, 17.5f, 12f)
            curveTo(17.5f, 12.414f, 17.164f, 12.75f, 16.75f, 12.75f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 12.75f, 14.5f, 12.414f, 14.5f, 12f)
            close()
            moveTo(18.5f, 12f)
            curveTo(18.5f, 11.586f, 18.836f, 11.25f, 19.25f, 11.25f)
            horizontalLineTo(20.75f)
            curveTo(21.164f, 11.25f, 21.5f, 11.586f, 21.5f, 12f)
            curveTo(21.5f, 12.414f, 21.164f, 12.75f, 20.75f, 12.75f)
            horizontalLineTo(19.25f)
            curveTo(18.836f, 12.75f, 18.5f, 12.414f, 18.5f, 12f)
            close()
            moveTo(4.75f, 2f)
            curveTo(4.336f, 2f, 4f, 2.336f, 4f, 2.75f)
            verticalLineTo(7f)
            curveTo(4f, 8.104f, 4.896f, 9f, 6f, 9f)
            horizontalLineTo(18f)
            curveTo(19.104f, 9f, 20f, 8.104f, 20f, 7f)
            verticalLineTo(2.75f)
            curveTo(20f, 2.336f, 19.664f, 2f, 19.25f, 2f)
            curveTo(18.836f, 2f, 18.5f, 2.336f, 18.5f, 2.75f)
            verticalLineTo(7f)
            curveTo(18.5f, 7.275f, 18.276f, 7.5f, 18f, 7.5f)
            horizontalLineTo(6f)
            curveTo(5.724f, 7.5f, 5.5f, 7.275f, 5.5f, 7f)
            verticalLineTo(2.75f)
            curveTo(5.5f, 2.336f, 5.164f, 2f, 4.75f, 2f)
            close()
            moveTo(19.25f, 22f)
            curveTo(19.664f, 22f, 20f, 21.664f, 20f, 21.25f)
            verticalLineTo(17f)
            curveTo(20f, 15.896f, 19.104f, 15f, 18f, 15f)
            lineTo(6f, 15f)
            curveTo(4.896f, 15f, 4f, 15.896f, 4f, 17f)
            lineTo(4f, 21.25f)
            curveTo(4f, 21.664f, 4.336f, 22f, 4.75f, 22f)
            curveTo(5.164f, 22f, 5.5f, 21.664f, 5.5f, 21.25f)
            lineTo(5.5f, 17f)
            curveTo(5.5f, 16.725f, 5.724f, 16.5f, 6f, 16.5f)
            lineTo(18f, 16.5f)
            curveTo(18.276f, 16.5f, 18.5f, 16.725f, 18.5f, 17f)
            verticalLineTo(21.25f)
            curveTo(18.5f, 21.664f, 18.836f, 22f, 19.25f, 22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentPageBreakPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentPageBreak, contentDescription = null)
    }
}
