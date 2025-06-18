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

public val FluentUi.Regular.CopySelect: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CopySelect",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.25f, 3.5f)
            curveTo(8.283f, 3.5f, 7.5f, 4.284f, 7.5f, 5.25f)
            verticalLineTo(6.25f)
            curveTo(7.5f, 6.664f, 7.164f, 7f, 6.75f, 7f)
            curveTo(6.336f, 7f, 6f, 6.664f, 6f, 6.25f)
            verticalLineTo(5.25f)
            curveTo(6f, 3.455f, 7.455f, 2f, 9.25f, 2f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 2f, 11f, 2.336f, 11f, 2.75f)
            curveTo(11f, 3.164f, 10.664f, 3.5f, 10.25f, 3.5f)
            horizontalLineTo(9.25f)
            close()
            moveTo(12f, 2.75f)
            curveTo(12f, 2.336f, 12.336f, 2f, 12.75f, 2f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 2f, 16f, 2.336f, 16f, 2.75f)
            curveTo(16f, 3.164f, 15.664f, 3.5f, 15.25f, 3.5f)
            horizontalLineTo(12.75f)
            curveTo(12.336f, 3.5f, 12f, 3.164f, 12f, 2.75f)
            close()
            moveTo(12.75f, 16.5f)
            curveTo(12.336f, 16.5f, 12f, 16.836f, 12f, 17.25f)
            curveTo(12f, 17.664f, 12.336f, 18f, 12.75f, 18f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 18f, 16f, 17.664f, 16f, 17.25f)
            curveTo(16f, 16.836f, 15.664f, 16.5f, 15.25f, 16.5f)
            horizontalLineTo(12.75f)
            close()
            moveTo(6.75f, 8f)
            curveTo(7.164f, 8f, 7.5f, 8.336f, 7.5f, 8.75f)
            verticalLineTo(11.25f)
            curveTo(7.5f, 11.664f, 7.164f, 12f, 6.75f, 12f)
            curveTo(6.336f, 12f, 6f, 11.664f, 6f, 11.25f)
            verticalLineTo(8.75f)
            curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
            close()
            moveTo(22f, 8.75f)
            curveTo(22f, 8.336f, 21.664f, 8f, 21.25f, 8f)
            curveTo(20.836f, 8f, 20.5f, 8.336f, 20.5f, 8.75f)
            verticalLineTo(11.25f)
            curveTo(20.5f, 11.664f, 20.836f, 12f, 21.25f, 12f)
            curveTo(21.664f, 12f, 22f, 11.664f, 22f, 11.25f)
            verticalLineTo(8.75f)
            close()
            moveTo(18.75f, 16.5f)
            curveTo(19.716f, 16.5f, 20.5f, 15.717f, 20.5f, 14.75f)
            verticalLineTo(13.75f)
            curveTo(20.5f, 13.336f, 20.836f, 13f, 21.25f, 13f)
            curveTo(21.664f, 13f, 22f, 13.336f, 22f, 13.75f)
            verticalLineTo(14.75f)
            curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
            horizontalLineTo(17.75f)
            curveTo(17.336f, 18f, 17f, 17.664f, 17f, 17.25f)
            curveTo(17f, 16.836f, 17.336f, 16.5f, 17.75f, 16.5f)
            horizontalLineTo(18.75f)
            close()
            moveTo(20.5f, 5.25f)
            curveTo(20.5f, 4.284f, 19.716f, 3.5f, 18.75f, 3.5f)
            horizontalLineTo(17.75f)
            curveTo(17.336f, 3.5f, 17f, 3.164f, 17f, 2.75f)
            curveTo(17f, 2.336f, 17.336f, 2f, 17.75f, 2f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 2f, 22f, 3.455f, 22f, 5.25f)
            verticalLineTo(6.25f)
            curveTo(22f, 6.664f, 21.664f, 7f, 21.25f, 7f)
            curveTo(20.836f, 7f, 20.5f, 6.664f, 20.5f, 6.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(9.25f, 16.5f)
            curveTo(8.283f, 16.5f, 7.5f, 15.717f, 7.5f, 14.75f)
            verticalLineTo(13.75f)
            curveTo(7.5f, 13.336f, 7.164f, 13f, 6.75f, 13f)
            curveTo(6.336f, 13f, 6f, 13.336f, 6f, 13.75f)
            verticalLineTo(14.75f)
            curveTo(6f, 16.545f, 7.455f, 18f, 9.25f, 18f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 18f, 11f, 17.664f, 11f, 17.25f)
            curveTo(11f, 16.836f, 10.664f, 16.5f, 10.25f, 16.5f)
            horizontalLineTo(9.25f)
            close()
            moveTo(2f, 9.25f)
            curveTo(2f, 7.539f, 3.322f, 6.137f, 5f, 6.009f)
            verticalLineTo(7.518f)
            curveTo(4.152f, 7.639f, 3.5f, 8.368f, 3.5f, 9.25f)
            verticalLineTo(16.25f)
            curveTo(3.5f, 18.597f, 5.403f, 20.5f, 7.75f, 20.5f)
            horizontalLineTo(14.75f)
            curveTo(15.632f, 20.5f, 16.361f, 19.848f, 16.482f, 19f)
            horizontalLineTo(17.99f)
            curveTo(17.863f, 20.678f, 16.461f, 22f, 14.75f, 22f)
            horizontalLineTo(7.75f)
            curveTo(4.574f, 22f, 2f, 19.426f, 2f, 16.25f)
            verticalLineTo(9.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CopySelectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CopySelect, contentDescription = null)
    }
}
