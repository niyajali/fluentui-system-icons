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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.Gas: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Gas",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.145f, 2.306f)
            curveTo(13.286f, 2.114f, 13.511f, 2f, 13.75f, 2f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 2f, 19f, 2.336f, 19f, 2.75f)
            verticalLineTo(6.5f)
            curveTo(19f, 6.541f, 18.997f, 6.581f, 18.99f, 6.621f)
            curveTo(19.607f, 7.125f, 20f, 7.892f, 20f, 8.75f)
            verticalLineTo(19.25f)
            curveTo(20f, 20.769f, 18.769f, 22f, 17.25f, 22f)
            horizontalLineTo(6.75f)
            curveTo(5.231f, 22f, 4f, 20.769f, 4f, 19.25f)
            verticalLineTo(8.75f)
            curveTo(4f, 7.231f, 5.231f, 6f, 6.75f, 6f)
            horizontalLineTo(7.5f)
            verticalLineTo(5.75f)
            curveTo(7.5f, 4.784f, 6.716f, 4f, 5.75f, 4f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 4f, 4f, 3.664f, 4f, 3.25f)
            curveTo(4f, 2.836f, 4.336f, 2.5f, 4.75f, 2.5f)
            horizontalLineTo(5.75f)
            curveTo(7.545f, 2.5f, 9f, 3.955f, 9f, 5.75f)
            verticalLineTo(6f)
            horizontalLineTo(10.437f)
            lineTo(13.145f, 2.306f)
            close()
            moveTo(17.5f, 3.5f)
            horizontalLineTo(14.13f)
            lineTo(12.297f, 6f)
            horizontalLineTo(17.25f)
            curveTo(17.334f, 6f, 17.418f, 6.004f, 17.5f, 6.011f)
            verticalLineTo(3.5f)
            close()
            moveTo(8.22f, 10.22f)
            curveTo(7.927f, 10.513f, 7.927f, 10.987f, 8.22f, 11.28f)
            lineTo(10.939f, 14f)
            lineTo(8.22f, 16.72f)
            curveTo(7.927f, 17.013f, 7.927f, 17.487f, 8.22f, 17.78f)
            curveTo(8.513f, 18.073f, 8.987f, 18.073f, 9.28f, 17.78f)
            lineTo(12f, 15.061f)
            lineTo(14.72f, 17.78f)
            curveTo(15.013f, 18.073f, 15.487f, 18.073f, 15.78f, 17.78f)
            curveTo(16.073f, 17.487f, 16.073f, 17.013f, 15.78f, 16.72f)
            lineTo(13.061f, 14f)
            lineTo(15.78f, 11.28f)
            curveTo(16.073f, 10.987f, 16.073f, 10.513f, 15.78f, 10.22f)
            curveTo(15.487f, 9.927f, 15.013f, 9.927f, 14.72f, 10.22f)
            lineTo(12f, 12.939f)
            lineTo(9.28f, 10.22f)
            curveTo(8.987f, 9.927f, 8.513f, 9.927f, 8.22f, 10.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GasPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Gas, contentDescription = null)
    }
}
