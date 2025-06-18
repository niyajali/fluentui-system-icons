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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.Archive: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Archive",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(19.5f)
            curveTo(20.328f, 3f, 21f, 3.672f, 21f, 4.5f)
            verticalLineTo(6f)
            curveTo(21f, 6.828f, 20.328f, 7.5f, 19.5f, 7.5f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 7.5f, 3f, 6.828f, 3f, 6f)
            verticalLineTo(4.5f)
            close()
            moveTo(4f, 9f)
            horizontalLineTo(20f)
            verticalLineTo(17.25f)
            curveTo(20f, 19.321f, 18.321f, 21f, 16.25f, 21f)
            horizontalLineTo(7.75f)
            curveTo(5.679f, 21f, 4f, 19.321f, 4f, 17.25f)
            verticalLineTo(9f)
            close()
            moveTo(10.25f, 11f)
            curveTo(9.836f, 11f, 9.5f, 11.336f, 9.5f, 11.75f)
            curveTo(9.5f, 12.164f, 9.836f, 12.5f, 10.25f, 12.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 12.5f, 14.5f, 12.164f, 14.5f, 11.75f)
            curveTo(14.5f, 11.336f, 14.164f, 11f, 13.75f, 11f)
            horizontalLineTo(10.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArchivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Archive, contentDescription = null)
    }
}
