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

public val FluentUi.Regular.ArrowAutofitHeightIn: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowAutofitHeightIn",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.78f, 9.78f)
            lineTo(19.28f, 7.28f)
            curveTo(19.573f, 6.987f, 19.573f, 6.513f, 19.28f, 6.22f)
            curveTo(18.987f, 5.927f, 18.513f, 5.927f, 18.22f, 6.22f)
            lineTo(17f, 7.439f)
            verticalLineTo(3.75f)
            curveTo(17f, 3.336f, 16.664f, 3f, 16.25f, 3f)
            curveTo(15.836f, 3f, 15.5f, 3.336f, 15.5f, 3.75f)
            verticalLineTo(7.439f)
            lineTo(14.28f, 6.22f)
            curveTo(13.987f, 5.927f, 13.513f, 5.927f, 13.22f, 6.22f)
            curveTo(12.927f, 6.513f, 12.927f, 6.987f, 13.22f, 7.28f)
            lineTo(15.72f, 9.78f)
            curveTo(16.013f, 10.073f, 16.487f, 10.073f, 16.78f, 9.78f)
            close()
            moveTo(4f, 6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 4f, 11f, 4.336f, 11f, 4.75f)
            curveTo(11f, 5.164f, 10.664f, 5.5f, 10.25f, 5.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 5.5f, 5.5f, 5.836f, 5.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(5.5f, 18.164f, 5.836f, 18.5f, 6.25f, 18.5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 18.5f, 11f, 18.836f, 11f, 19.25f)
            curveTo(11f, 19.664f, 10.664f, 20f, 10.25f, 20f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 20f, 4f, 18.993f, 4f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(19.28f, 16.72f)
            lineTo(16.78f, 14.22f)
            curveTo(16.487f, 13.927f, 16.013f, 13.927f, 15.72f, 14.22f)
            lineTo(13.22f, 16.72f)
            curveTo(12.927f, 17.013f, 12.927f, 17.487f, 13.22f, 17.78f)
            curveTo(13.513f, 18.073f, 13.987f, 18.073f, 14.28f, 17.78f)
            lineTo(15.5f, 16.561f)
            verticalLineTo(20.25f)
            curveTo(15.5f, 20.664f, 15.836f, 21f, 16.25f, 21f)
            curveTo(16.664f, 21f, 17f, 20.664f, 17f, 20.25f)
            verticalLineTo(16.561f)
            lineTo(18.22f, 17.78f)
            curveTo(18.513f, 18.073f, 18.987f, 18.073f, 19.28f, 17.78f)
            curveTo(19.573f, 17.487f, 19.573f, 17.013f, 19.28f, 16.72f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowAutofitHeightInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowAutofitHeightIn, contentDescription = null)
    }
}
