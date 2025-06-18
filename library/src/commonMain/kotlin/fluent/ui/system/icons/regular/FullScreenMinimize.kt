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

public val FluentUi.Regular.FullScreenMinimize: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FullScreenMinimize",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.5f, 3.75f)
            curveTo(8.5f, 3.336f, 8.164f, 3f, 7.75f, 3f)
            curveTo(7.336f, 3f, 7f, 3.336f, 7f, 3.75f)
            verticalLineTo(6.25f)
            curveTo(7f, 6.664f, 6.664f, 7f, 6.25f, 7f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 7f, 3f, 7.336f, 3f, 7.75f)
            curveTo(3f, 8.164f, 3.336f, 8.5f, 3.75f, 8.5f)
            horizontalLineTo(6.25f)
            curveTo(7.493f, 8.5f, 8.5f, 7.493f, 8.5f, 6.25f)
            verticalLineTo(3.75f)
            close()
            moveTo(8.5f, 20.25f)
            curveTo(8.5f, 20.664f, 8.164f, 21f, 7.75f, 21f)
            curveTo(7.336f, 21f, 7f, 20.664f, 7f, 20.25f)
            verticalLineTo(17.75f)
            curveTo(7f, 17.336f, 6.664f, 17f, 6.25f, 17f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 17f, 3f, 16.664f, 3f, 16.25f)
            curveTo(3f, 15.836f, 3.336f, 15.5f, 3.75f, 15.5f)
            horizontalLineTo(6.25f)
            curveTo(7.493f, 15.5f, 8.5f, 16.507f, 8.5f, 17.75f)
            verticalLineTo(20.25f)
            close()
            moveTo(16.25f, 3f)
            curveTo(15.836f, 3f, 15.5f, 3.336f, 15.5f, 3.75f)
            verticalLineTo(6.25f)
            curveTo(15.5f, 7.493f, 16.507f, 8.5f, 17.75f, 8.5f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 8.5f, 21f, 8.164f, 21f, 7.75f)
            curveTo(21f, 7.336f, 20.664f, 7f, 20.25f, 7f)
            horizontalLineTo(17.75f)
            curveTo(17.336f, 7f, 17f, 6.664f, 17f, 6.25f)
            verticalLineTo(3.75f)
            curveTo(17f, 3.336f, 16.664f, 3f, 16.25f, 3f)
            close()
            moveTo(15.5f, 20.25f)
            curveTo(15.5f, 20.664f, 15.836f, 21f, 16.25f, 21f)
            curveTo(16.664f, 21f, 17f, 20.664f, 17f, 20.25f)
            verticalLineTo(17.75f)
            curveTo(17f, 17.336f, 17.336f, 17f, 17.75f, 17f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 17f, 21f, 16.664f, 21f, 16.25f)
            curveTo(21f, 15.836f, 20.664f, 15.5f, 20.25f, 15.5f)
            horizontalLineTo(17.75f)
            curveTo(16.507f, 15.5f, 15.5f, 16.507f, 15.5f, 17.75f)
            verticalLineTo(20.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FullScreenMinimizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FullScreenMinimize, contentDescription = null)
    }
}
