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

public val FluentUi.Regular.BookClock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookClock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 9.125f)
            verticalLineTo(10.75f)
            horizontalLineTo(13.75f)
            curveTo(14.095f, 10.75f, 14.375f, 11.03f, 14.375f, 11.375f)
            curveTo(14.375f, 11.72f, 14.095f, 12f, 13.75f, 12f)
            horizontalLineTo(12.5f)
            curveTo(12.479f, 12f, 12.458f, 11.999f, 12.438f, 11.997f)
            curveTo(12.417f, 11.999f, 12.396f, 12f, 12.375f, 12f)
            curveTo(12.03f, 12f, 11.75f, 11.72f, 11.75f, 11.375f)
            verticalLineTo(9.125f)
            curveTo(11.75f, 8.78f, 12.03f, 8.5f, 12.375f, 8.5f)
            curveTo(12.72f, 8.5f, 13f, 8.78f, 13f, 9.125f)
            close()
            moveTo(12.375f, 6.005f)
            curveTo(9.752f, 6.005f, 7.625f, 8.132f, 7.625f, 10.755f)
            curveTo(7.625f, 13.378f, 9.752f, 15.505f, 12.375f, 15.505f)
            curveTo(14.998f, 15.505f, 17.125f, 13.378f, 17.125f, 10.755f)
            curveTo(17.125f, 8.132f, 14.998f, 6.005f, 12.375f, 6.005f)
            close()
            moveTo(8.875f, 10.755f)
            curveTo(8.875f, 8.822f, 10.442f, 7.255f, 12.375f, 7.255f)
            curveTo(14.308f, 7.255f, 15.875f, 8.822f, 15.875f, 10.755f)
            curveTo(15.875f, 12.688f, 14.308f, 14.255f, 12.375f, 14.255f)
            curveTo(10.442f, 14.255f, 8.875f, 12.688f, 8.875f, 10.755f)
            close()
            moveTo(6.5f, 2f)
            curveTo(5.119f, 2f, 4f, 3.119f, 4f, 4.5f)
            verticalLineTo(19.5f)
            curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 22f, 20.5f, 21.664f, 20.5f, 21.25f)
            curveTo(20.5f, 20.836f, 20.164f, 20.5f, 19.75f, 20.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 19.5f, 20.5f, 19.164f, 20.5f, 18.75f)
            verticalLineTo(4.5f)
            curveTo(20.5f, 3.119f, 19.381f, 2f, 18f, 2f)
            horizontalLineTo(6.5f)
            close()
            moveTo(19f, 18f)
            horizontalLineTo(5.5f)
            verticalLineTo(4.5f)
            curveTo(5.5f, 3.948f, 5.948f, 3.5f, 6.5f, 3.5f)
            horizontalLineTo(18f)
            curveTo(18.552f, 3.5f, 19f, 3.948f, 19f, 4.5f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookClock, contentDescription = null)
    }
}
