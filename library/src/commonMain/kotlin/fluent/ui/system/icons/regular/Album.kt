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

public val FluentUi.Regular.Album: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Album",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 9f)
            curveTo(10f, 7.895f, 10.895f, 7f, 12f, 7f)
            horizontalLineTo(16f)
            curveTo(17.105f, 7f, 18f, 7.895f, 18f, 9f)
            verticalLineTo(10f)
            curveTo(18f, 11.105f, 17.105f, 12f, 16f, 12f)
            horizontalLineTo(12f)
            curveTo(10.895f, 12f, 10f, 11.105f, 10f, 10f)
            verticalLineTo(9f)
            close()
            moveTo(12f, 8.5f)
            curveTo(11.724f, 8.5f, 11.5f, 8.724f, 11.5f, 9f)
            verticalLineTo(10f)
            curveTo(11.5f, 10.276f, 11.724f, 10.5f, 12f, 10.5f)
            horizontalLineTo(16f)
            curveTo(16.276f, 10.5f, 16.5f, 10.276f, 16.5f, 10f)
            verticalLineTo(9f)
            curveTo(16.5f, 8.724f, 16.276f, 8.5f, 16f, 8.5f)
            horizontalLineTo(12f)
            close()
            moveTo(4f, 4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineTo(18f)
            curveTo(2f, 19.105f, 2.895f, 20f, 4f, 20f)
            horizontalLineTo(20f)
            curveTo(21.105f, 20f, 22f, 19.105f, 22f, 18f)
            verticalLineTo(6f)
            curveTo(22f, 4.895f, 21.105f, 4f, 20f, 4f)
            horizontalLineTo(4f)
            close()
            moveTo(20f, 5.5f)
            curveTo(20.276f, 5.5f, 20.5f, 5.724f, 20.5f, 6f)
            verticalLineTo(18f)
            curveTo(20.5f, 18.276f, 20.276f, 18.5f, 20f, 18.5f)
            horizontalLineTo(7.5f)
            verticalLineTo(5.5f)
            horizontalLineTo(20f)
            close()
            moveTo(4f, 5.5f)
            horizontalLineTo(6f)
            verticalLineTo(18.5f)
            horizontalLineTo(4f)
            curveTo(3.724f, 18.5f, 3.5f, 18.276f, 3.5f, 18f)
            verticalLineTo(6f)
            curveTo(3.5f, 5.724f, 3.724f, 5.5f, 4f, 5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlbumPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Album, contentDescription = null)
    }
}
