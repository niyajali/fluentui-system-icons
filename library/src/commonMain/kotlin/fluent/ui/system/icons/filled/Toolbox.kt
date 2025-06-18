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

public val FluentUi.Filled.Toolbox: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Toolbox",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 6.253f)
            verticalLineTo(7f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 7f, 2f, 8.008f, 2f, 9.25f)
            verticalLineTo(11.5f)
            horizontalLineTo(6.5f)
            verticalLineTo(10.75f)
            curveTo(6.5f, 10.336f, 6.836f, 10f, 7.25f, 10f)
            curveTo(7.664f, 10f, 8f, 10.336f, 8f, 10.75f)
            verticalLineTo(11.5f)
            horizontalLineTo(16f)
            verticalLineTo(10.75f)
            curveTo(16f, 10.336f, 16.336f, 10f, 16.75f, 10f)
            curveTo(17.164f, 10f, 17.5f, 10.336f, 17.5f, 10.75f)
            verticalLineTo(11.5f)
            horizontalLineTo(22f)
            verticalLineTo(9.25f)
            curveTo(22f, 8.008f, 20.993f, 7f, 19.75f, 7f)
            horizontalLineTo(17f)
            verticalLineTo(6.253f)
            curveTo(17f, 5.01f, 15.993f, 4.003f, 14.75f, 4.003f)
            horizontalLineTo(9.25f)
            curveTo(8.007f, 4.003f, 7f, 5.01f, 7f, 6.253f)
            close()
            moveTo(9.25f, 5.503f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 5.503f, 15.5f, 5.839f, 15.5f, 6.253f)
            verticalLineTo(7f)
            horizontalLineTo(8.5f)
            verticalLineTo(6.253f)
            curveTo(8.5f, 5.839f, 8.836f, 5.503f, 9.25f, 5.503f)
            close()
            moveTo(22f, 13f)
            horizontalLineTo(17.5f)
            verticalLineTo(14.25f)
            curveTo(17.5f, 14.665f, 17.164f, 15f, 16.75f, 15f)
            curveTo(16.336f, 15f, 16f, 14.665f, 16f, 14.25f)
            verticalLineTo(13f)
            horizontalLineTo(8f)
            verticalLineTo(14.25f)
            curveTo(8f, 14.665f, 7.664f, 15f, 7.25f, 15f)
            curveTo(6.836f, 15f, 6.5f, 14.665f, 6.5f, 14.25f)
            verticalLineTo(13f)
            horizontalLineTo(2f)
            verticalLineTo(17.747f)
            curveTo(2f, 18.99f, 3.007f, 19.997f, 4.25f, 19.997f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 19.997f, 22f, 18.99f, 22f, 17.747f)
            verticalLineTo(13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Toolbox, contentDescription = null)
    }
}
