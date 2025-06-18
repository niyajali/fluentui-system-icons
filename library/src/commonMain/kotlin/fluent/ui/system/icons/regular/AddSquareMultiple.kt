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

public val FluentIcons.Regular.AddSquareMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AddSquareMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 3f)
            curveTo(4.007f, 3f, 3f, 4.007f, 3f, 5.25f)
            verticalLineTo(16.25f)
            curveTo(3f, 17.493f, 4.007f, 18.5f, 5.25f, 18.5f)
            horizontalLineTo(16.25f)
            curveTo(17.493f, 18.5f, 18.5f, 17.493f, 18.5f, 16.25f)
            verticalLineTo(5.25f)
            curveTo(18.5f, 4.007f, 17.493f, 3f, 16.25f, 3f)
            horizontalLineTo(5.25f)
            close()
            moveTo(4.5f, 5.25f)
            curveTo(4.5f, 4.836f, 4.836f, 4.5f, 5.25f, 4.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 4.5f, 17f, 4.836f, 17f, 5.25f)
            verticalLineTo(16.25f)
            curveTo(17f, 16.664f, 16.664f, 17f, 16.25f, 17f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 17f, 4.5f, 16.664f, 4.5f, 16.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(7.75f, 21f)
            curveTo(6.77f, 21f, 5.937f, 20.374f, 5.628f, 19.5f)
            horizontalLineTo(16.25f)
            curveTo(18.045f, 19.5f, 19.5f, 18.045f, 19.5f, 16.25f)
            verticalLineTo(5.628f)
            curveTo(20.374f, 5.937f, 21f, 6.77f, 21f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(21f, 18.873f, 18.873f, 21f, 16.25f, 21f)
            horizontalLineTo(7.75f)
            close()
            moveTo(10.75f, 6.5f)
            curveTo(11.164f, 6.5f, 11.5f, 6.836f, 11.5f, 7.25f)
            verticalLineTo(10f)
            horizontalLineTo(14.25f)
            curveTo(14.664f, 10f, 15f, 10.336f, 15f, 10.75f)
            curveTo(15f, 11.164f, 14.664f, 11.5f, 14.25f, 11.5f)
            horizontalLineTo(11.5f)
            verticalLineTo(14.25f)
            curveTo(11.5f, 14.664f, 11.164f, 15f, 10.75f, 15f)
            curveTo(10.336f, 15f, 10f, 14.664f, 10f, 14.25f)
            verticalLineTo(11.5f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 11.5f, 6.5f, 11.164f, 6.5f, 10.75f)
            curveTo(6.5f, 10.336f, 6.836f, 10f, 7.25f, 10f)
            horizontalLineTo(10f)
            verticalLineTo(7.25f)
            curveTo(10f, 6.836f, 10.336f, 6.5f, 10.75f, 6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AddSquareMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AddSquareMultiple, contentDescription = null)
    }
}
