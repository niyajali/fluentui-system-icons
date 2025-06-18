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

public val FluentUi.Regular.DataWaterfall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataWaterfall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 3.75f)
            curveTo(2f, 3.336f, 2.336f, 3f, 2.75f, 3f)
            horizontalLineTo(9.25f)
            curveTo(10.493f, 3f, 11.5f, 4.007f, 11.5f, 5.25f)
            verticalLineTo(11f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 11f, 20f, 12.007f, 20f, 13.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 19.5f, 22f, 19.836f, 22f, 20.25f)
            curveTo(22f, 20.664f, 21.664f, 21f, 21.25f, 21f)
            horizontalLineTo(14.75f)
            curveTo(13.507f, 21f, 12.5f, 19.993f, 12.5f, 18.75f)
            verticalLineTo(12.5f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 12.5f, 4f, 11.493f, 4f, 10.25f)
            verticalLineTo(4.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 4.5f, 2f, 4.164f, 2f, 3.75f)
            close()
            moveTo(18.5f, 19.5f)
            verticalLineTo(13.25f)
            curveTo(18.5f, 12.836f, 18.164f, 12.5f, 17.75f, 12.5f)
            horizontalLineTo(14f)
            verticalLineTo(18.75f)
            curveTo(14f, 19.164f, 14.336f, 19.5f, 14.75f, 19.5f)
            horizontalLineTo(18.5f)
            close()
            moveTo(10f, 5.25f)
            curveTo(10f, 4.836f, 9.664f, 4.5f, 9.25f, 4.5f)
            horizontalLineTo(5.5f)
            verticalLineTo(10.25f)
            curveTo(5.5f, 10.664f, 5.836f, 11f, 6.25f, 11f)
            horizontalLineTo(10f)
            verticalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataWaterfallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DataWaterfall, contentDescription = null)
    }
}
