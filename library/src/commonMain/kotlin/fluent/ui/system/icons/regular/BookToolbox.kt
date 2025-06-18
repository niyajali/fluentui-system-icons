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

public val FluentUi.Regular.BookToolbox: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookToolbox",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 4f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 4f, 12f, 4.672f, 12f, 5.5f)
            verticalLineTo(7f)
            horizontalLineTo(14.5f)
            verticalLineTo(6.75f)
            curveTo(14.5f, 6.336f, 14.836f, 6f, 15.25f, 6f)
            curveTo(15.664f, 6f, 16f, 6.336f, 16f, 6.75f)
            verticalLineTo(7f)
            horizontalLineTo(19f)
            verticalLineTo(6.75f)
            curveTo(19f, 6.336f, 19.336f, 6f, 19.75f, 6f)
            curveTo(20.164f, 6f, 20.5f, 6.336f, 20.5f, 6.75f)
            verticalLineTo(7f)
            horizontalLineTo(23f)
            verticalLineTo(5.5f)
            curveTo(23f, 4.672f, 22.328f, 4f, 21.5f, 4f)
            horizontalLineTo(21f)
            verticalLineTo(3f)
            curveTo(21f, 2.033f, 20.216f, 1.25f, 19.25f, 1.25f)
            horizontalLineTo(15.75f)
            curveTo(14.783f, 1.25f, 14f, 2.033f, 14f, 3f)
            verticalLineTo(4f)
            close()
            moveTo(15.5f, 3f)
            curveTo(15.5f, 2.862f, 15.612f, 2.75f, 15.75f, 2.75f)
            horizontalLineTo(19.25f)
            curveTo(19.388f, 2.75f, 19.5f, 2.862f, 19.5f, 3f)
            verticalLineTo(4f)
            horizontalLineTo(15.5f)
            verticalLineTo(3f)
            close()
            moveTo(12f, 10.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(9.25f)
            curveTo(14.5f, 9.664f, 14.836f, 10f, 15.25f, 10f)
            curveTo(15.664f, 10f, 16f, 9.664f, 16f, 9.25f)
            verticalLineTo(8.5f)
            horizontalLineTo(19f)
            verticalLineTo(9.25f)
            curveTo(19f, 9.664f, 19.336f, 10f, 19.75f, 10f)
            curveTo(20.164f, 10f, 20.5f, 9.664f, 20.5f, 9.25f)
            verticalLineTo(8.5f)
            horizontalLineTo(23f)
            verticalLineTo(10.5f)
            curveTo(23f, 11.328f, 22.328f, 12f, 21.5f, 12f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 12f, 12f, 11.328f, 12f, 10.5f)
            close()
            moveTo(13f, 3.05f)
            curveTo(12.63f, 3.125f, 12.29f, 3.282f, 12f, 3.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 3.5f, 5.5f, 3.948f, 5.5f, 4.5f)
            verticalLineTo(18f)
            horizontalLineTo(19f)
            verticalLineTo(13f)
            horizontalLineTo(20.5f)
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
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            horizontalLineTo(13.188f)
            curveTo(13.066f, 2.31f, 13f, 2.647f, 13f, 3f)
            verticalLineTo(3.05f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookToolbox, contentDescription = null)
    }
}
