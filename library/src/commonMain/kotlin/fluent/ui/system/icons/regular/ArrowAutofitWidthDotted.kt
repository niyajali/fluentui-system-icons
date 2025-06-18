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

public val FluentIcons.Regular.ArrowAutofitWidthDotted: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.ArrowAutofitWidthDotted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.758f, 4f)
                curveTo(19f, 4f, 20.008f, 5.007f, 20.008f, 6.25f)
                verticalLineTo(10.25f)
                curveTo(20.008f, 10.664f, 19.672f, 11f, 19.258f, 11f)
                curveTo(18.844f, 11f, 18.508f, 10.664f, 18.508f, 10.25f)
                verticalLineTo(6.25f)
                curveTo(18.508f, 5.836f, 18.172f, 5.5f, 17.758f, 5.5f)
                lineTo(6.258f, 5.5f)
                curveTo(5.844f, 5.5f, 5.508f, 5.836f, 5.508f, 6.25f)
                lineTo(5.508f, 10.25f)
                curveTo(5.508f, 10.664f, 5.172f, 11f, 4.758f, 11f)
                curveTo(4.344f, 11f, 4.008f, 10.664f, 4.008f, 10.25f)
                lineTo(4.008f, 6.25f)
                curveTo(4.008f, 5.007f, 5.015f, 4f, 6.258f, 4f)
                horizontalLineTo(17.758f)
                close()
                moveTo(18.28f, 19.28f)
                lineTo(20.78f, 16.78f)
                curveTo(21.073f, 16.487f, 21.073f, 16.013f, 20.78f, 15.72f)
                lineTo(18.28f, 13.22f)
                curveTo(17.987f, 12.927f, 17.513f, 12.927f, 17.22f, 13.22f)
                curveTo(16.927f, 13.513f, 16.927f, 13.987f, 17.22f, 14.28f)
                lineTo(19.189f, 16.25f)
                lineTo(17.22f, 18.22f)
                curveTo(16.927f, 18.513f, 16.927f, 18.987f, 17.22f, 19.28f)
                curveTo(17.513f, 19.573f, 17.987f, 19.573f, 18.28f, 19.28f)
                close()
                moveTo(3.22f, 15.72f)
                curveTo(2.927f, 16.013f, 2.927f, 16.487f, 3.22f, 16.78f)
                lineTo(5.72f, 19.28f)
                curveTo(6.013f, 19.573f, 6.487f, 19.573f, 6.78f, 19.28f)
                curveTo(7.073f, 18.987f, 7.073f, 18.513f, 6.78f, 18.22f)
                lineTo(4.811f, 16.25f)
                lineTo(6.78f, 14.28f)
                curveTo(7.073f, 13.987f, 7.073f, 13.513f, 6.78f, 13.22f)
                curveTo(6.487f, 12.927f, 6.013f, 12.927f, 5.72f, 13.22f)
                lineTo(3.22f, 15.72f)
                close()
                moveTo(13f, 16.25f)
                curveTo(13f, 15.836f, 12.664f, 15.5f, 12.25f, 15.5f)
                horizontalLineTo(11.75f)
                curveTo(11.336f, 15.5f, 11f, 15.836f, 11f, 16.25f)
                curveTo(11f, 16.664f, 11.336f, 17f, 11.75f, 17f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 17f, 13f, 16.664f, 13f, 16.25f)
                close()
                moveTo(10f, 16.25f)
                curveTo(10f, 16.664f, 9.664f, 17f, 9.25f, 17f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 17f, 7f, 16.664f, 7f, 16.25f)
                curveTo(7f, 15.836f, 7.336f, 15.5f, 7.75f, 15.5f)
                horizontalLineTo(9.25f)
                curveTo(9.664f, 15.5f, 10f, 15.836f, 10f, 16.25f)
                close()
                moveTo(17f, 16.25f)
                curveTo(17f, 15.836f, 16.664f, 15.5f, 16.25f, 15.5f)
                horizontalLineTo(14.75f)
                curveTo(14.336f, 15.5f, 14f, 15.836f, 14f, 16.25f)
                curveTo(14f, 16.664f, 14.336f, 17f, 14.75f, 17f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 17f, 17f, 16.664f, 17f, 16.25f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ArrowAutofitWidthDottedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowAutofitWidthDotted, contentDescription = null)
    }
}
