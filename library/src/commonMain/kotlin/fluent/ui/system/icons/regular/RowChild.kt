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

public val FluentUi.Regular.RowChild: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RowChild",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 3f, 21f, 4.007f, 21f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(21f, 9.493f, 19.993f, 10.5f, 18.75f, 10.5f)
            horizontalLineTo(7.5f)
            verticalLineTo(14.75f)
            curveTo(7.5f, 15.717f, 8.283f, 16.5f, 9.25f, 16.5f)
            horizontalLineTo(12f)
            verticalLineTo(15.75f)
            curveTo(12f, 14.507f, 13.007f, 13.5f, 14.25f, 13.5f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 13.5f, 21f, 14.507f, 21f, 15.75f)
            verticalLineTo(18.75f)
            curveTo(21f, 19.993f, 19.993f, 21f, 18.75f, 21f)
            horizontalLineTo(14.25f)
            curveTo(13.007f, 21f, 12f, 19.993f, 12f, 18.75f)
            verticalLineTo(18f)
            horizontalLineTo(9.25f)
            curveTo(7.455f, 18f, 6f, 16.545f, 6f, 14.75f)
            verticalLineTo(10.5f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 10.5f, 3f, 9.493f, 3f, 8.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(18.75f, 9f)
            curveTo(19.164f, 9f, 19.5f, 8.664f, 19.5f, 8.25f)
            verticalLineTo(5.25f)
            curveTo(19.5f, 4.836f, 19.164f, 4.5f, 18.75f, 4.5f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(4.5f, 8.664f, 4.836f, 9f, 5.25f, 9f)
            horizontalLineTo(18.75f)
            close()
            moveTo(13.5f, 15.75f)
            verticalLineTo(18.75f)
            curveTo(13.5f, 19.164f, 13.836f, 19.5f, 14.25f, 19.5f)
            horizontalLineTo(18.75f)
            curveTo(19.164f, 19.5f, 19.5f, 19.164f, 19.5f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(19.5f, 15.336f, 19.164f, 15f, 18.75f, 15f)
            horizontalLineTo(14.25f)
            curveTo(13.836f, 15f, 13.5f, 15.336f, 13.5f, 15.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RowChildPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.RowChild, contentDescription = null)
    }
}
