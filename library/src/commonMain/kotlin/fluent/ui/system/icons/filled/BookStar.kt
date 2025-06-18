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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.BookStar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookStar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.6f, 9.527f)
            curveTo(11.501f, 9.728f, 11.31f, 9.866f, 11.089f, 9.898f)
            lineTo(9.636f, 10.11f)
            lineTo(10.688f, 11.135f)
            curveTo(10.847f, 11.291f, 10.92f, 11.515f, 10.883f, 11.735f)
            lineTo(10.634f, 13.183f)
            lineTo(11.934f, 12.499f)
            curveTo(12.132f, 12.396f, 12.368f, 12.396f, 12.566f, 12.499f)
            lineTo(13.866f, 13.183f)
            lineTo(13.617f, 11.735f)
            curveTo(13.58f, 11.515f, 13.653f, 11.291f, 13.812f, 11.135f)
            lineTo(14.864f, 10.11f)
            lineTo(13.411f, 9.898f)
            curveTo(13.19f, 9.866f, 12.999f, 9.728f, 12.9f, 9.527f)
            lineTo(12.25f, 8.21f)
            lineTo(11.6f, 9.527f)
            close()
            moveTo(4f, 4.5f)
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
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
            close()
            moveTo(10.542f, 8.608f)
            lineTo(8.081f, 8.965f)
            curveTo(7.525f, 9.046f, 7.303f, 9.729f, 7.705f, 10.122f)
            lineTo(9.486f, 11.857f)
            lineTo(9.065f, 14.308f)
            curveTo(8.97f, 14.862f, 9.552f, 15.284f, 10.049f, 15.023f)
            lineTo(12.25f, 13.866f)
            lineTo(14.451f, 15.023f)
            curveTo(14.948f, 15.284f, 15.53f, 14.862f, 15.435f, 14.308f)
            lineTo(15.014f, 11.857f)
            lineTo(16.795f, 10.122f)
            curveTo(17.197f, 9.729f, 16.975f, 9.046f, 16.419f, 8.965f)
            lineTo(13.958f, 8.608f)
            lineTo(12.858f, 6.378f)
            curveTo(12.609f, 5.874f, 11.891f, 5.874f, 11.642f, 6.378f)
            lineTo(10.542f, 8.608f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BookStar, contentDescription = null)
    }
}
