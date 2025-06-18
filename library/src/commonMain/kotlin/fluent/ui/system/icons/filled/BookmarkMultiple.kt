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
package fluent.ui.system.icons.filled

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

public val FluentUi.Filled.BookmarkMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookmarkMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 6.748f)
            curveTo(4f, 5.505f, 5.007f, 4.498f, 6.25f, 4.498f)
            horizontalLineTo(15.251f)
            curveTo(16.493f, 4.498f, 17.501f, 5.505f, 17.501f, 6.748f)
            verticalLineTo(21.25f)
            curveTo(17.501f, 21.518f, 17.357f, 21.767f, 17.124f, 21.9f)
            curveTo(16.891f, 22.034f, 16.605f, 22.033f, 16.373f, 21.898f)
            lineTo(10.75f, 18.618f)
            lineTo(5.128f, 21.898f)
            curveTo(4.896f, 22.033f, 4.609f, 22.034f, 4.376f, 21.9f)
            curveTo(4.144f, 21.767f, 4f, 21.518f, 4f, 21.25f)
            verticalLineTo(6.748f)
            close()
            moveTo(15.25f, 2f)
            curveTo(17.873f, 2f, 20f, 4.127f, 20f, 6.751f)
            verticalLineTo(18.623f)
            curveTo(20f, 19.037f, 19.664f, 19.373f, 19.25f, 19.373f)
            curveTo(18.836f, 19.373f, 18.5f, 19.037f, 18.5f, 18.623f)
            verticalLineTo(6.751f)
            curveTo(18.5f, 4.955f, 17.045f, 3.5f, 15.25f, 3.5f)
            horizontalLineTo(6.637f)
            curveTo(6.637f, 3.5f, 6.75f, 2.943f, 7.434f, 2.419f)
            curveTo(8f, 2f, 8.602f, 2f, 8.602f, 2f)
            horizontalLineTo(15.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookmarkMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BookmarkMultiple, contentDescription = null)
    }
}
