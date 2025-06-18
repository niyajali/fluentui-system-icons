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

public val FluentUi.Regular.StackVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StackVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(20.25f)
            curveTo(21f, 20.664f, 20.664f, 21f, 20.25f, 21f)
            curveTo(19.836f, 21f, 19.5f, 20.664f, 19.5f, 20.25f)
            verticalLineTo(16.25f)
            curveTo(19.5f, 15.283f, 18.716f, 14.5f, 17.75f, 14.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 14.5f, 4.5f, 15.283f, 4.5f, 16.25f)
            verticalLineTo(20.25f)
            curveTo(4.5f, 20.664f, 4.164f, 21f, 3.75f, 21f)
            curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
            verticalLineTo(6.25f)
            close()
            moveTo(4.5f, 13.511f)
            curveTo(5.005f, 13.188f, 5.606f, 13f, 6.25f, 13f)
            horizontalLineTo(17.75f)
            curveTo(18.394f, 13f, 18.995f, 13.188f, 19.5f, 13.511f)
            verticalLineTo(11.25f)
            curveTo(19.5f, 10.283f, 18.716f, 9.5f, 17.75f, 9.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 9.5f, 4.5f, 10.283f, 4.5f, 11.25f)
            verticalLineTo(13.511f)
            close()
            moveTo(19.5f, 6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(8.511f)
            curveTo(5.005f, 8.188f, 5.606f, 8f, 6.25f, 8f)
            horizontalLineTo(17.75f)
            curveTo(18.394f, 8f, 18.995f, 8.188f, 19.5f, 8.511f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StackVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.StackVertical, contentDescription = null)
    }
}
