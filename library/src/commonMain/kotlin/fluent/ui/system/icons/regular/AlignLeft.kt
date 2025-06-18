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

public val FluentUi.Regular.AlignLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 2.75f)
            curveTo(3f, 2.336f, 3.336f, 2f, 3.75f, 2f)
            curveTo(4.164f, 2f, 4.5f, 2.336f, 4.5f, 2.75f)
            verticalLineTo(21.25f)
            curveTo(4.5f, 21.664f, 4.164f, 22f, 3.75f, 22f)
            curveTo(3.336f, 22f, 3f, 21.664f, 3f, 21.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(8.25f, 4f)
            curveTo(7.007f, 4f, 6f, 5.007f, 6f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(6f, 9.993f, 7.007f, 11f, 8.25f, 11f)
            lineTo(18.75f, 11f)
            curveTo(19.993f, 11f, 21f, 9.993f, 21f, 8.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 5.007f, 19.993f, 4f, 18.75f, 4f)
            lineTo(8.25f, 4f)
            close()
            moveTo(7.5f, 6.25f)
            curveTo(7.5f, 5.836f, 7.836f, 5.5f, 8.25f, 5.5f)
            lineTo(18.75f, 5.5f)
            curveTo(19.164f, 5.5f, 19.5f, 5.836f, 19.5f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(19.5f, 9.164f, 19.164f, 9.5f, 18.75f, 9.5f)
            lineTo(8.25f, 9.5f)
            curveTo(7.836f, 9.5f, 7.5f, 9.164f, 7.5f, 8.75f)
            lineTo(7.5f, 6.25f)
            close()
            moveTo(8.25f, 13f)
            curveTo(7.007f, 13f, 6f, 14.007f, 6f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(6f, 18.993f, 7.007f, 20f, 8.25f, 20f)
            horizontalLineTo(15.25f)
            curveTo(16.493f, 20f, 17.5f, 18.993f, 17.5f, 17.75f)
            verticalLineTo(15.25f)
            curveTo(17.5f, 14.007f, 16.493f, 13f, 15.25f, 13f)
            lineTo(8.25f, 13f)
            close()
            moveTo(7.5f, 15.25f)
            curveTo(7.5f, 14.836f, 7.836f, 14.5f, 8.25f, 14.5f)
            lineTo(15.25f, 14.5f)
            curveTo(15.664f, 14.5f, 16f, 14.836f, 16f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(16f, 18.164f, 15.664f, 18.5f, 15.25f, 18.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 18.5f, 7.5f, 18.164f, 7.5f, 17.75f)
            lineTo(7.5f, 15.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlignLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AlignLeft, contentDescription = null)
    }
}
