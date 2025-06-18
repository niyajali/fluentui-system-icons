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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.DocumentOnePage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentOnePage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 2f)
            curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(20f, 3.007f, 18.993f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            close()
            moveTo(5.5f, 4.25f)
            curveTo(5.5f, 3.836f, 5.836f, 3.5f, 6.25f, 3.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 3.5f, 18.5f, 3.836f, 18.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18.5f, 20.164f, 18.164f, 20.5f, 17.75f, 20.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 20.5f, 5.5f, 20.164f, 5.5f, 19.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(7.75f, 6.5f)
            curveTo(7.336f, 6.5f, 7f, 6.836f, 7f, 7.25f)
            curveTo(7f, 7.664f, 7.336f, 8f, 7.75f, 8f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 8f, 17f, 7.664f, 17f, 7.25f)
            curveTo(17f, 6.836f, 16.664f, 6.5f, 16.25f, 6.5f)
            horizontalLineTo(7.75f)
            close()
            moveTo(7f, 16.25f)
            curveTo(7f, 15.836f, 7.336f, 15.5f, 7.75f, 15.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 15.5f, 17f, 15.836f, 17f, 16.25f)
            curveTo(17f, 16.664f, 16.664f, 17f, 16.25f, 17f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 17f, 7f, 16.664f, 7f, 16.25f)
            close()
            moveTo(7.75f, 11f)
            curveTo(7.336f, 11f, 7f, 11.336f, 7f, 11.75f)
            curveTo(7f, 12.164f, 7.336f, 12.5f, 7.75f, 12.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 12.5f, 17f, 12.164f, 17f, 11.75f)
            curveTo(17f, 11.336f, 16.664f, 11f, 16.25f, 11f)
            horizontalLineTo(7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentOnePagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentOnePage, contentDescription = null)
    }
}
