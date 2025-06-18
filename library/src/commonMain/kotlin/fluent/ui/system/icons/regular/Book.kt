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

public val FluentUi.Regular.Book: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Book",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 6f)
            curveTo(7f, 5.448f, 7.448f, 5f, 8f, 5f)
            horizontalLineTo(16f)
            curveTo(16.552f, 5f, 17f, 5.448f, 17f, 6f)
            verticalLineTo(8f)
            curveTo(17f, 8.552f, 16.552f, 9f, 16f, 9f)
            horizontalLineTo(8f)
            curveTo(7.448f, 9f, 7f, 8.552f, 7f, 8f)
            verticalLineTo(6f)
            close()
            moveTo(8.5f, 7.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(6.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(7.5f)
            close()
            moveTo(4f, 4.5f)
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
            verticalLineTo(18.75f)
            curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
            horizontalLineTo(5.5f)
            curveTo(5.5f, 20.052f, 5.948f, 20.5f, 6.5f, 20.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 20.5f, 20.5f, 20.836f, 20.5f, 21.25f)
            curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
            verticalLineTo(4.5f)
            close()
            moveTo(5.5f, 18f)
            horizontalLineTo(19f)
            verticalLineTo(4.5f)
            curveTo(19f, 3.948f, 18.552f, 3.5f, 18f, 3.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 3.5f, 5.5f, 3.948f, 5.5f, 4.5f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Book, contentDescription = null)
    }
}
