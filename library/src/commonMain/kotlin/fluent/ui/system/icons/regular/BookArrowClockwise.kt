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

public val FluentIcons.Regular.BookArrowClockwise: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookArrowClockwise",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.25f, 5f)
            curveTo(21.664f, 5f, 22f, 4.664f, 22f, 4.25f)
            verticalLineTo(1.5f)
            curveTo(22f, 1.086f, 21.664f, 0.75f, 21.25f, 0.75f)
            curveTo(21.012f, 0.75f, 20.8f, 0.861f, 20.663f, 1.034f)
            curveTo(20.561f, 1.162f, 20.5f, 1.324f, 20.5f, 1.5f)
            verticalLineTo(2.126f)
            curveTo(19.515f, 1.418f, 18.305f, 1f, 17f, 1f)
            curveTo(13.686f, 1f, 11f, 3.686f, 11f, 7f)
            curveTo(11f, 10.314f, 13.686f, 13f, 17f, 13f)
            curveTo(20.314f, 13f, 23f, 10.314f, 23f, 7f)
            curveTo(23f, 6.586f, 22.664f, 6.25f, 22.25f, 6.25f)
            curveTo(21.836f, 6.25f, 21.5f, 6.586f, 21.5f, 7f)
            curveTo(21.5f, 9.485f, 19.485f, 11.5f, 17f, 11.5f)
            curveTo(14.515f, 11.5f, 12.5f, 9.485f, 12.5f, 7f)
            curveTo(12.5f, 4.515f, 14.515f, 2.5f, 17f, 2.5f)
            curveTo(18.065f, 2.5f, 19.042f, 2.869f, 19.812f, 3.487f)
            curveTo(19.818f, 3.491f, 19.823f, 3.496f, 19.829f, 3.5f)
            horizontalLineTo(18.5f)
            curveTo(18.086f, 3.5f, 17.75f, 3.836f, 17.75f, 4.25f)
            curveTo(17.75f, 4.664f, 18.086f, 5f, 18.5f, 5f)
            horizontalLineTo(21.25f)
            close()
            moveTo(6.5f, 2f)
            horizontalLineTo(12.101f)
            curveTo(11.649f, 2.443f, 11.256f, 2.948f, 10.936f, 3.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 3.5f, 5.5f, 3.948f, 5.5f, 4.5f)
            verticalLineTo(18f)
            horizontalLineTo(19f)
            verticalLineTo(13.71f)
            curveTo(19.529f, 13.553f, 20.032f, 13.335f, 20.5f, 13.064f)
            verticalLineTo(18.75f)
            curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
            horizontalLineTo(5.5f)
            curveTo(5.5f, 20.052f, 5.948f, 20.5f, 6.5f, 20.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 20.5f, 20.5f, 20.836f, 20.5f, 21.25f)
            curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
            verticalLineTo(4.5f)
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BookArrowClockwise, contentDescription = null)
    }
}
