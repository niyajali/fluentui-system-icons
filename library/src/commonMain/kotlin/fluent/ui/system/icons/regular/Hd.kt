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

public val FluentUi.Regular.Hd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Hd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.25f, 8f)
            curveTo(7.664f, 8f, 8f, 8.336f, 8f, 8.75f)
            verticalLineTo(11.5f)
            horizontalLineTo(10f)
            verticalLineTo(8.75f)
            curveTo(10f, 8.336f, 10.336f, 8f, 10.75f, 8f)
            curveTo(11.164f, 8f, 11.5f, 8.336f, 11.5f, 8.75f)
            verticalLineTo(15.25f)
            curveTo(11.5f, 15.664f, 11.164f, 16f, 10.75f, 16f)
            curveTo(10.336f, 16f, 10f, 15.664f, 10f, 15.25f)
            verticalLineTo(13f)
            horizontalLineTo(8f)
            verticalLineTo(15.25f)
            curveTo(8f, 15.664f, 7.664f, 16f, 7.25f, 16f)
            curveTo(6.836f, 16f, 6.5f, 15.664f, 6.5f, 15.25f)
            verticalLineTo(8.75f)
            curveTo(6.5f, 8.336f, 6.836f, 8f, 7.25f, 8f)
            close()
            moveTo(13.75f, 8f)
            curveTo(13.336f, 8f, 13f, 8.336f, 13f, 8.75f)
            verticalLineTo(15.25f)
            curveTo(13f, 15.664f, 13.336f, 16f, 13.75f, 16f)
            horizontalLineTo(14.75f)
            curveTo(16.545f, 16f, 18f, 14.545f, 18f, 12.75f)
            verticalLineTo(11.25f)
            curveTo(18f, 9.455f, 16.545f, 8f, 14.75f, 8f)
            horizontalLineTo(13.75f)
            close()
            moveTo(14.5f, 14.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(14.75f)
            curveTo(15.717f, 9.5f, 16.5f, 10.283f, 16.5f, 11.25f)
            verticalLineTo(12.75f)
            curveTo(16.5f, 13.717f, 15.717f, 14.5f, 14.75f, 14.5f)
            horizontalLineTo(14.5f)
            close()
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(6.25f, 4.5f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            horizontalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HdPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Hd, contentDescription = null)
    }
}
