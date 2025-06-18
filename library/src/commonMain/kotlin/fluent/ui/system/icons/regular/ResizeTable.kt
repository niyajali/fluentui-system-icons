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

public val FluentUi.Regular.ResizeTable: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ResizeTable",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 2f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 2f, 11f, 2.336f, 11f, 2.75f)
            curveTo(11f, 3.164f, 10.664f, 3.5f, 10.25f, 3.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineTo(8.376f)
            curveTo(2.918f, 8.639f, 2.407f, 9.029f, 2f, 9.511f)
            verticalLineTo(5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            close()
            moveTo(15.624f, 20.5f)
            curveTo(15.361f, 21.082f, 14.971f, 21.593f, 14.489f, 22f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
            verticalLineTo(13.75f)
            curveTo(22f, 13.336f, 21.664f, 13f, 21.25f, 13f)
            curveTo(20.836f, 13f, 20.5f, 13.336f, 20.5f, 13.75f)
            verticalLineTo(18.75f)
            curveTo(20.5f, 19.716f, 19.716f, 20.5f, 18.75f, 20.5f)
            horizontalLineTo(15.624f)
            close()
            moveTo(21.25f, 11f)
            curveTo(21.664f, 11f, 22f, 10.664f, 22f, 10.25f)
            verticalLineTo(5.25f)
            curveTo(22f, 3.455f, 20.545f, 2f, 18.75f, 2f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 2f, 13f, 2.336f, 13f, 2.75f)
            curveTo(13f, 3.164f, 13.336f, 3.5f, 13.75f, 3.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 3.5f, 20.5f, 4.284f, 20.5f, 5.25f)
            verticalLineTo(10.25f)
            curveTo(20.5f, 10.664f, 20.836f, 11f, 21.25f, 11f)
            close()
            moveTo(5.25f, 9f)
            curveTo(3.455f, 9f, 2f, 10.455f, 2f, 12.25f)
            verticalLineTo(18.75f)
            curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
            horizontalLineTo(11.75f)
            curveTo(13.545f, 22f, 15f, 20.545f, 15f, 18.75f)
            verticalLineTo(12.25f)
            curveTo(15f, 10.455f, 13.545f, 9f, 11.75f, 9f)
            horizontalLineTo(5.25f)
            close()
            moveTo(3.5f, 12.25f)
            curveTo(3.5f, 11.283f, 4.284f, 10.5f, 5.25f, 10.5f)
            horizontalLineTo(6f)
            verticalLineTo(13f)
            horizontalLineTo(3.5f)
            verticalLineTo(12.25f)
            close()
            moveTo(6f, 14.5f)
            verticalLineTo(17f)
            horizontalLineTo(3.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(6f)
            close()
            moveTo(7.5f, 17f)
            verticalLineTo(14.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(17f)
            horizontalLineTo(7.5f)
            close()
            moveTo(11f, 17f)
            verticalLineTo(14.5f)
            horizontalLineTo(13.5f)
            verticalLineTo(17f)
            horizontalLineTo(11f)
            close()
            moveTo(7.5f, 18.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(20.5f)
            horizontalLineTo(7.5f)
            verticalLineTo(18.5f)
            close()
            moveTo(11f, 18.5f)
            horizontalLineTo(13.5f)
            verticalLineTo(18.75f)
            curveTo(13.5f, 19.716f, 12.717f, 20.5f, 11.75f, 20.5f)
            horizontalLineTo(11f)
            verticalLineTo(18.5f)
            close()
            moveTo(11f, 10.5f)
            horizontalLineTo(11.75f)
            curveTo(12.717f, 10.5f, 13.5f, 11.283f, 13.5f, 12.25f)
            verticalLineTo(13f)
            horizontalLineTo(11f)
            verticalLineTo(10.5f)
            close()
            moveTo(9.5f, 13f)
            horizontalLineTo(7.5f)
            verticalLineTo(10.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(13f)
            close()
            moveTo(6f, 18.5f)
            verticalLineTo(20.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 20.5f, 3.5f, 19.716f, 3.5f, 18.75f)
            verticalLineTo(18.5f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ResizeTablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ResizeTable, contentDescription = null)
    }
}
