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

public val FluentUi.Regular.ArrowReplyAll: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowReplyAll",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.28f, 5.22f)
            curveTo(9.573f, 5.513f, 9.573f, 5.987f, 9.28f, 6.28f)
            lineTo(4.811f, 10.75f)
            lineTo(9.28f, 15.22f)
            curveTo(9.573f, 15.513f, 9.573f, 15.987f, 9.28f, 16.28f)
            curveTo(8.987f, 16.573f, 8.513f, 16.573f, 8.22f, 16.28f)
            lineTo(3.22f, 11.28f)
            curveTo(2.927f, 10.987f, 2.927f, 10.513f, 3.22f, 10.22f)
            lineTo(8.22f, 5.22f)
            curveTo(8.513f, 4.927f, 8.987f, 4.927f, 9.28f, 5.22f)
            close()
            moveTo(13.28f, 5.22f)
            curveTo(13.573f, 5.513f, 13.573f, 5.987f, 13.28f, 6.28f)
            lineTo(9.561f, 10f)
            horizontalLineTo(13.25f)
            curveTo(17.53f, 10f, 21f, 13.47f, 21f, 17.75f)
            verticalLineTo(18.25f)
            curveTo(21f, 18.664f, 20.664f, 19f, 20.25f, 19f)
            curveTo(19.836f, 19f, 19.5f, 18.664f, 19.5f, 18.25f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 14.298f, 16.702f, 11.5f, 13.25f, 11.5f)
            horizontalLineTo(9.561f)
            lineTo(13.28f, 15.22f)
            curveTo(13.573f, 15.513f, 13.573f, 15.987f, 13.28f, 16.28f)
            curveTo(12.987f, 16.573f, 12.513f, 16.573f, 12.22f, 16.28f)
            lineTo(7.22f, 11.28f)
            curveTo(6.927f, 10.987f, 6.927f, 10.513f, 7.22f, 10.22f)
            lineTo(12.22f, 5.22f)
            curveTo(12.513f, 4.927f, 12.987f, 4.927f, 13.28f, 5.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowReplyAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowReplyAll, contentDescription = null)
    }
}
