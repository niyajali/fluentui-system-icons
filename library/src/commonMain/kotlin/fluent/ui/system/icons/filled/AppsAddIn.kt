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

public val FluentUi.Filled.AppsAddIn: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AppsAddIn",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 3f)
            curveTo(11.881f, 3f, 13f, 4.119f, 13f, 5.5f)
            verticalLineTo(11f)
            horizontalLineTo(18.5f)
            curveTo(19.881f, 11f, 21f, 12.119f, 21f, 13.5f)
            verticalLineTo(18.5f)
            curveTo(21f, 19.881f, 19.881f, 21f, 18.5f, 21f)
            horizontalLineTo(5.5f)
            curveTo(4.119f, 21f, 3f, 19.881f, 3f, 18.5f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.119f, 4.119f, 3f, 5.5f, 3f)
            horizontalLineTo(10.5f)
            close()
            moveTo(11f, 13f)
            horizontalLineTo(5f)
            verticalLineTo(18.5f)
            curveTo(5f, 18.776f, 5.224f, 19f, 5.5f, 19f)
            horizontalLineTo(11f)
            verticalLineTo(13f)
            close()
            moveTo(18.5f, 13f)
            horizontalLineTo(13f)
            verticalLineTo(19f)
            horizontalLineTo(18.5f)
            curveTo(18.776f, 19f, 19f, 18.776f, 19f, 18.5f)
            verticalLineTo(13.5f)
            curveTo(19f, 13.224f, 18.776f, 13f, 18.5f, 13f)
            close()
            moveTo(10.5f, 5f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 5f, 5f, 5.224f, 5f, 5.5f)
            verticalLineTo(11f)
            horizontalLineTo(11f)
            verticalLineTo(5.5f)
            curveTo(11f, 5.224f, 10.776f, 5f, 10.5f, 5f)
            close()
            moveTo(17.883f, 2.007f)
            lineTo(18f, 2f)
            curveTo(18.513f, 2f, 18.935f, 2.386f, 18.993f, 2.883f)
            lineTo(19f, 3f)
            verticalLineTo(5f)
            horizontalLineTo(21f)
            curveTo(21.513f, 5f, 21.935f, 5.386f, 21.993f, 5.883f)
            lineTo(22f, 6f)
            curveTo(22f, 6.513f, 21.614f, 6.936f, 21.117f, 6.993f)
            lineTo(21f, 7f)
            horizontalLineTo(19f)
            verticalLineTo(9f)
            curveTo(19f, 9.513f, 18.614f, 9.936f, 18.117f, 9.993f)
            lineTo(18f, 10f)
            curveTo(17.487f, 10f, 17.065f, 9.614f, 17.007f, 9.117f)
            lineTo(17f, 9f)
            verticalLineTo(7f)
            horizontalLineTo(15f)
            curveTo(14.487f, 7f, 14.064f, 6.614f, 14.007f, 6.117f)
            lineTo(14f, 6f)
            curveTo(14f, 5.487f, 14.386f, 5.064f, 14.883f, 5.007f)
            lineTo(15f, 5f)
            horizontalLineTo(17f)
            verticalLineTo(3f)
            curveTo(17f, 2.487f, 17.386f, 2.064f, 17.883f, 2.007f)
            lineTo(18f, 2f)
            lineTo(17.883f, 2.007f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppsAddInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.AppsAddIn, contentDescription = null)
    }
}
