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

public val FluentUi.Regular.DataHistogram: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataHistogram",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.5f, 5.23f)
            curveTo(8.5f, 3.988f, 9.507f, 2.98f, 10.75f, 2.98f)
            horizontalLineTo(13.25f)
            curveTo(14.493f, 2.98f, 15.5f, 3.988f, 15.5f, 5.23f)
            verticalLineTo(7f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 7f, 21f, 8.008f, 21f, 9.25f)
            verticalLineTo(20.25f)
            curveTo(21f, 20.665f, 20.664f, 21f, 20.25f, 21f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 21f, 3f, 20.665f, 3f, 20.25f)
            verticalLineTo(12.25f)
            curveTo(3f, 11.008f, 4.007f, 10f, 5.25f, 10f)
            horizontalLineTo(8.5f)
            verticalLineTo(5.23f)
            close()
            moveTo(10f, 19.5f)
            horizontalLineTo(14f)
            verticalLineTo(5.23f)
            curveTo(14f, 4.816f, 13.664f, 4.48f, 13.25f, 4.48f)
            horizontalLineTo(10.75f)
            curveTo(10.336f, 4.48f, 10f, 4.816f, 10f, 5.23f)
            verticalLineTo(19.5f)
            close()
            moveTo(8.5f, 11.5f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 11.5f, 4.5f, 11.836f, 4.5f, 12.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(11.5f)
            close()
            moveTo(15.5f, 19.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(9.25f)
            curveTo(19.5f, 8.836f, 19.164f, 8.5f, 18.75f, 8.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataHistogramPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DataHistogram, contentDescription = null)
    }
}
