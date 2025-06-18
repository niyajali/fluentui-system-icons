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

public val FluentUi.Regular.RemixAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RemixAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 2.75f)
            curveTo(2f, 2.336f, 2.336f, 2f, 2.75f, 2f)
            horizontalLineTo(12f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 14.987f, 20.691f, 17.668f, 18.615f, 19.5f)
            horizontalLineTo(16.004f)
            curveTo(18.68f, 18.069f, 20.5f, 15.247f, 20.5f, 12f)
            curveTo(20.5f, 7.821f, 17.484f, 4.347f, 13.511f, 3.634f)
            curveTo(13.02f, 3.546f, 12.516f, 3.5f, 12f, 3.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 3.5f, 2f, 3.164f, 2f, 2.75f)
            close()
            moveTo(10.362f, 21.866f)
            curveTo(10.895f, 21.954f, 11.442f, 22f, 12f, 22f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 22f, 22f, 21.664f, 22f, 21.25f)
            curveTo(22f, 20.836f, 21.664f, 20.5f, 21.25f, 20.5f)
            horizontalLineTo(12f)
            curveTo(8.922f, 20.5f, 6.226f, 18.864f, 4.734f, 16.414f)
            curveTo(3.951f, 15.127f, 3.5f, 13.616f, 3.5f, 12f)
            curveTo(3.5f, 8.753f, 5.32f, 5.932f, 7.996f, 4.5f)
            horizontalLineTo(5.385f)
            curveTo(3.309f, 6.333f, 2f, 9.014f, 2f, 12f)
            curveTo(2f, 16.965f, 5.618f, 21.085f, 10.362f, 21.866f)
            close()
            moveTo(12f, 8f)
            curveTo(12.414f, 8f, 12.75f, 8.336f, 12.75f, 8.75f)
            verticalLineTo(11.25f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 11.25f, 16f, 11.586f, 16f, 12f)
            curveTo(16f, 12.414f, 15.664f, 12.75f, 15.25f, 12.75f)
            horizontalLineTo(12.75f)
            verticalLineTo(15.25f)
            curveTo(12.75f, 15.664f, 12.414f, 16f, 12f, 16f)
            curveTo(11.586f, 16f, 11.25f, 15.664f, 11.25f, 15.25f)
            verticalLineTo(12.75f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 12.75f, 8f, 12.414f, 8f, 12f)
            curveTo(8f, 11.586f, 8.336f, 11.25f, 8.75f, 11.25f)
            horizontalLineTo(11.25f)
            verticalLineTo(8.75f)
            curveTo(11.25f, 8.336f, 11.586f, 8f, 12f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RemixAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.RemixAdd, contentDescription = null)
    }
}
