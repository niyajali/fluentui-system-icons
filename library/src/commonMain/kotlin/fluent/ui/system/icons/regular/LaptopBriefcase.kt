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

public val FluentUi.Regular.LaptopBriefcase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LaptopBriefcase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 4f)
            curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
            verticalLineTo(13.75f)
            curveTo(4f, 14.993f, 5.007f, 16f, 6.25f, 16f)
            horizontalLineTo(11f)
            verticalLineTo(14.5f)
            lineTo(6.25f, 14.5f)
            curveTo(5.836f, 14.5f, 5.5f, 14.164f, 5.5f, 13.75f)
            verticalLineTo(6.25f)
            curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 5.5f, 18.5f, 5.836f, 18.5f, 6.25f)
            verticalLineTo(9f)
            horizontalLineTo(19.25f)
            curveTo(19.51f, 9f, 19.762f, 9.036f, 20f, 9.104f)
            verticalLineTo(6.25f)
            curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
            horizontalLineTo(6.25f)
            close()
            moveTo(2.75f, 17.5f)
            horizontalLineTo(11f)
            verticalLineTo(19f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 19f, 2f, 18.664f, 2f, 18.25f)
            curveTo(2f, 17.836f, 2.336f, 17.5f, 2.75f, 17.5f)
            close()
            moveTo(14f, 13f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 13f, 12f, 13.672f, 12f, 14.5f)
            verticalLineTo(19.5f)
            curveTo(12f, 20.328f, 12.672f, 21f, 13.5f, 21f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 21f, 23f, 20.328f, 23f, 19.5f)
            verticalLineTo(14.5f)
            curveTo(23f, 13.672f, 22.328f, 13f, 21.5f, 13f)
            horizontalLineTo(21f)
            verticalLineTo(11.75f)
            curveTo(21f, 10.783f, 20.216f, 10f, 19.25f, 10f)
            horizontalLineTo(15.75f)
            curveTo(14.783f, 10f, 14f, 10.783f, 14f, 11.75f)
            verticalLineTo(13f)
            close()
            moveTo(15.5f, 11.75f)
            curveTo(15.5f, 11.612f, 15.612f, 11.5f, 15.75f, 11.5f)
            horizontalLineTo(19.25f)
            curveTo(19.388f, 11.5f, 19.5f, 11.612f, 19.5f, 11.75f)
            verticalLineTo(13f)
            horizontalLineTo(15.5f)
            verticalLineTo(11.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LaptopBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.LaptopBriefcase, contentDescription = null)
    }
}
