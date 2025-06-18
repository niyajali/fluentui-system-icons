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

public val FluentUi.Regular.AppsListDetail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AppsListDetail",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.25f, 4f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(2f, 9.993f, 3.007f, 11f, 4.25f, 11f)
            horizontalLineTo(6.75f)
            curveTo(7.993f, 11f, 9f, 9.993f, 9f, 8.75f)
            verticalLineTo(6.25f)
            curveTo(9f, 5.007f, 7.993f, 4f, 6.75f, 4f)
            horizontalLineTo(4.25f)
            close()
            moveTo(3.5f, 6.25f)
            curveTo(3.5f, 5.836f, 3.836f, 5.5f, 4.25f, 5.5f)
            horizontalLineTo(6.75f)
            curveTo(7.164f, 5.5f, 7.5f, 5.836f, 7.5f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(7.5f, 9.164f, 7.164f, 9.5f, 6.75f, 9.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 9.5f, 3.5f, 9.164f, 3.5f, 8.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(11.25f, 5f)
            curveTo(10.836f, 5f, 10.5f, 5.336f, 10.5f, 5.75f)
            curveTo(10.5f, 6.164f, 10.836f, 6.5f, 11.25f, 6.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 6.5f, 22f, 6.164f, 22f, 5.75f)
            curveTo(22f, 5.336f, 21.664f, 5f, 21.25f, 5f)
            horizontalLineTo(11.25f)
            close()
            moveTo(11.25f, 8f)
            curveTo(10.836f, 8f, 10.5f, 8.336f, 10.5f, 8.75f)
            curveTo(10.5f, 9.164f, 10.836f, 9.5f, 11.25f, 9.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 9.5f, 19f, 9.164f, 19f, 8.75f)
            curveTo(19f, 8.336f, 18.664f, 8f, 18.25f, 8f)
            horizontalLineTo(11.25f)
            close()
            moveTo(4.25f, 13f)
            curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(2f, 18.993f, 3.007f, 20f, 4.25f, 20f)
            horizontalLineTo(6.75f)
            curveTo(7.993f, 20f, 9f, 18.993f, 9f, 17.75f)
            verticalLineTo(15.25f)
            curveTo(9f, 14.007f, 7.993f, 13f, 6.75f, 13f)
            horizontalLineTo(4.25f)
            close()
            moveTo(3.5f, 15.25f)
            curveTo(3.5f, 14.836f, 3.836f, 14.5f, 4.25f, 14.5f)
            horizontalLineTo(6.75f)
            curveTo(7.164f, 14.5f, 7.5f, 14.836f, 7.5f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(7.5f, 18.164f, 7.164f, 18.5f, 6.75f, 18.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 18.5f, 3.5f, 18.164f, 3.5f, 17.75f)
            verticalLineTo(15.25f)
            close()
            moveTo(11.25f, 14f)
            curveTo(10.836f, 14f, 10.5f, 14.336f, 10.5f, 14.75f)
            curveTo(10.5f, 15.164f, 10.836f, 15.5f, 11.25f, 15.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 15.5f, 22f, 15.164f, 22f, 14.75f)
            curveTo(22f, 14.336f, 21.664f, 14f, 21.25f, 14f)
            horizontalLineTo(11.25f)
            close()
            moveTo(11.25f, 17f)
            curveTo(10.836f, 17f, 10.5f, 17.336f, 10.5f, 17.75f)
            curveTo(10.5f, 18.164f, 10.836f, 18.5f, 11.25f, 18.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 18.5f, 19f, 18.164f, 19f, 17.75f)
            curveTo(19f, 17.336f, 18.664f, 17f, 18.25f, 17f)
            horizontalLineTo(11.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppsListDetailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AppsListDetail, contentDescription = null)
    }
}
