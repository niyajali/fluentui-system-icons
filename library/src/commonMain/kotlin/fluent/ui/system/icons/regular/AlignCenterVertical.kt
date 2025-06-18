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

public val FluentIcons.Regular.AlignCenterVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignCenterVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.25f, 21.25f)
            verticalLineTo(20f)
            horizontalLineTo(8.75f)
            curveTo(7.507f, 20f, 6.5f, 18.993f, 6.5f, 17.75f)
            verticalLineTo(15.25f)
            curveTo(6.5f, 14.007f, 7.507f, 13f, 8.75f, 13f)
            horizontalLineTo(11.25f)
            verticalLineTo(11f)
            horizontalLineTo(6.75f)
            curveTo(5.507f, 11f, 4.5f, 9.993f, 4.5f, 8.75f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.007f, 5.507f, 4f, 6.75f, 4f)
            horizontalLineTo(11.25f)
            verticalLineTo(2.75f)
            curveTo(11.25f, 2.336f, 11.586f, 2f, 12f, 2f)
            curveTo(12.414f, 2f, 12.75f, 2.336f, 12.75f, 2.75f)
            verticalLineTo(4f)
            horizontalLineTo(17.25f)
            curveTo(18.493f, 4f, 19.5f, 5.007f, 19.5f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(19.5f, 9.993f, 18.493f, 11f, 17.25f, 11f)
            horizontalLineTo(12.75f)
            verticalLineTo(13f)
            horizontalLineTo(15.25f)
            curveTo(16.493f, 13f, 17.5f, 14.007f, 17.5f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(17.5f, 18.993f, 16.493f, 20f, 15.25f, 20f)
            horizontalLineTo(12.75f)
            verticalLineTo(21.25f)
            curveTo(12.75f, 21.664f, 12.414f, 22f, 12f, 22f)
            curveTo(11.586f, 22f, 11.25f, 21.664f, 11.25f, 21.25f)
            close()
            moveTo(15.25f, 18.5f)
            curveTo(15.664f, 18.5f, 16f, 18.164f, 16f, 17.75f)
            verticalLineTo(15.25f)
            curveTo(16f, 14.836f, 15.664f, 14.5f, 15.25f, 14.5f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 14.5f, 8f, 14.836f, 8f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(8f, 18.164f, 8.336f, 18.5f, 8.75f, 18.5f)
            horizontalLineTo(15.25f)
            close()
            moveTo(17.25f, 9.5f)
            curveTo(17.664f, 9.5f, 18f, 9.164f, 18f, 8.75f)
            verticalLineTo(6.25f)
            curveTo(18f, 5.836f, 17.664f, 5.5f, 17.25f, 5.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 5.5f, 6f, 5.836f, 6f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(6f, 9.164f, 6.336f, 9.5f, 6.75f, 9.5f)
            lineTo(17.25f, 9.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlignCenterVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AlignCenterVertical, contentDescription = null)
    }
}
