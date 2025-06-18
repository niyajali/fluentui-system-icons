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
package fluent.ui.system.icons.filled

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

public val FluentUi.Filled.ReadingList: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReadingList",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20f, 18f)
            curveTo(20.552f, 18f, 21f, 18.448f, 21f, 19f)
            curveTo(21f, 19.513f, 20.614f, 19.935f, 20.117f, 19.993f)
            lineTo(20f, 20f)
            horizontalLineTo(7f)
            curveTo(6.448f, 20f, 6f, 19.552f, 6f, 19f)
            curveTo(6f, 18.487f, 6.386f, 18.065f, 6.883f, 18.007f)
            lineTo(7f, 18f)
            horizontalLineTo(20f)
            close()
            moveTo(17f, 15f)
            curveTo(17.552f, 15f, 18f, 15.448f, 18f, 16f)
            curveTo(18f, 16.513f, 17.614f, 16.935f, 17.117f, 16.993f)
            lineTo(17f, 17f)
            horizontalLineTo(4f)
            curveTo(3.448f, 17f, 3f, 16.552f, 3f, 16f)
            curveTo(3f, 15.487f, 3.386f, 15.064f, 3.883f, 15.007f)
            lineTo(4f, 15f)
            horizontalLineTo(17f)
            close()
            moveTo(20f, 12f)
            curveTo(20.552f, 12f, 21f, 12.448f, 21f, 13f)
            curveTo(21f, 13.513f, 20.614f, 13.936f, 20.117f, 13.993f)
            lineTo(20f, 14f)
            horizontalLineTo(7f)
            curveTo(6.448f, 14f, 6f, 13.552f, 6f, 13f)
            curveTo(6f, 12.487f, 6.386f, 12.064f, 6.883f, 12.007f)
            lineTo(7f, 12f)
            horizontalLineTo(20f)
            close()
            moveTo(6f, 5f)
            curveTo(7.232f, 5f, 8.325f, 5.75f, 8.781f, 6.873f)
            curveTo(8.988f, 7.385f, 8.742f, 7.968f, 8.23f, 8.175f)
            curveTo(7.755f, 8.368f, 7.218f, 8.169f, 6.977f, 7.73f)
            lineTo(6.927f, 7.625f)
            curveTo(6.776f, 7.25f, 6.411f, 7f, 6f, 7f)
            curveTo(5.448f, 7f, 5f, 7.448f, 5f, 8f)
            curveTo(5f, 8.552f, 5.448f, 9f, 6f, 9f)
            horizontalLineTo(17.5f)
            curveTo(18.052f, 9f, 18.5f, 9.448f, 18.5f, 10f)
            curveTo(18.5f, 10.513f, 18.114f, 10.936f, 17.617f, 10.993f)
            lineTo(17.5f, 11f)
            horizontalLineTo(6f)
            curveTo(4.343f, 11f, 3f, 9.657f, 3f, 8f)
            curveTo(3f, 6.343f, 4.343f, 5f, 6f, 5f)
            close()
            moveTo(20f, 6f)
            curveTo(20.552f, 6f, 21f, 6.448f, 21f, 7f)
            curveTo(21f, 7.513f, 20.614f, 7.936f, 20.117f, 7.993f)
            lineTo(20f, 8f)
            horizontalLineTo(11f)
            curveTo(10.448f, 8f, 10f, 7.552f, 10f, 7f)
            curveTo(10f, 6.487f, 10.386f, 6.064f, 10.883f, 6.007f)
            lineTo(11f, 6f)
            horizontalLineTo(20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReadingListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ReadingList, contentDescription = null)
    }
}
