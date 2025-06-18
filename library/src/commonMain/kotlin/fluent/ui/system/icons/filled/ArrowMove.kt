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

public val FluentIcons.Filled.ArrowMove: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowMove",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.457f, 6.457f)
            curveTo(15.067f, 6.848f, 14.433f, 6.848f, 14.043f, 6.457f)
            lineTo(13f, 5.414f)
            lineTo(13f, 8.25f)
            curveTo(13f, 8.802f, 12.552f, 9.25f, 12f, 9.25f)
            curveTo(11.448f, 9.25f, 11f, 8.802f, 11f, 8.25f)
            lineTo(11f, 5.414f)
            lineTo(9.957f, 6.457f)
            curveTo(9.567f, 6.848f, 8.933f, 6.848f, 8.543f, 6.457f)
            curveTo(8.152f, 6.067f, 8.152f, 5.433f, 8.543f, 5.043f)
            lineTo(11.293f, 2.293f)
            curveTo(11.48f, 2.105f, 11.735f, 2f, 12f, 2f)
            curveTo(12.265f, 2f, 12.52f, 2.105f, 12.707f, 2.293f)
            lineTo(15.457f, 5.043f)
            curveTo(15.848f, 5.433f, 15.848f, 6.067f, 15.457f, 6.457f)
            close()
            moveTo(6.457f, 14.043f)
            curveTo(6.848f, 14.433f, 6.848f, 15.067f, 6.457f, 15.457f)
            curveTo(6.067f, 15.848f, 5.433f, 15.848f, 5.043f, 15.457f)
            lineTo(2.293f, 12.707f)
            curveTo(2.105f, 12.52f, 2f, 12.265f, 2f, 12f)
            curveTo(2f, 11.735f, 2.105f, 11.48f, 2.293f, 11.293f)
            lineTo(5.043f, 8.543f)
            curveTo(5.433f, 8.152f, 6.067f, 8.152f, 6.457f, 8.543f)
            curveTo(6.848f, 8.933f, 6.848f, 9.567f, 6.457f, 9.957f)
            lineTo(5.414f, 11f)
            horizontalLineTo(8.25f)
            curveTo(8.802f, 11f, 9.25f, 11.448f, 9.25f, 12f)
            curveTo(9.25f, 12.552f, 8.802f, 13f, 8.25f, 13f)
            horizontalLineTo(5.414f)
            lineTo(6.457f, 14.043f)
            close()
            moveTo(18.957f, 15.457f)
            curveTo(18.567f, 15.848f, 17.933f, 15.848f, 17.543f, 15.457f)
            curveTo(17.152f, 15.067f, 17.152f, 14.433f, 17.543f, 14.043f)
            lineTo(18.586f, 13f)
            horizontalLineTo(15.75f)
            curveTo(15.198f, 13f, 14.75f, 12.552f, 14.75f, 12f)
            curveTo(14.75f, 11.448f, 15.198f, 11f, 15.75f, 11f)
            horizontalLineTo(18.586f)
            lineTo(17.543f, 9.957f)
            curveTo(17.152f, 9.567f, 17.152f, 8.933f, 17.543f, 8.543f)
            curveTo(17.933f, 8.152f, 18.567f, 8.152f, 18.957f, 8.543f)
            lineTo(21.707f, 11.293f)
            curveTo(21.895f, 11.48f, 22f, 11.735f, 22f, 12f)
            curveTo(22f, 12.265f, 21.895f, 12.52f, 21.707f, 12.707f)
            lineTo(18.957f, 15.457f)
            close()
            moveTo(11f, 18.586f)
            lineTo(11f, 15.75f)
            curveTo(11f, 15.198f, 11.448f, 14.75f, 12f, 14.75f)
            curveTo(12.552f, 14.75f, 13f, 15.198f, 13f, 15.75f)
            lineTo(13f, 18.586f)
            lineTo(14.043f, 17.543f)
            curveTo(14.433f, 17.152f, 15.067f, 17.152f, 15.457f, 17.543f)
            curveTo(15.848f, 17.933f, 15.848f, 18.567f, 15.457f, 18.957f)
            lineTo(12.707f, 21.707f)
            curveTo(12.52f, 21.895f, 12.265f, 22f, 12f, 22f)
            curveTo(11.735f, 22f, 11.48f, 21.895f, 11.293f, 21.707f)
            lineTo(8.543f, 18.957f)
            curveTo(8.152f, 18.567f, 8.152f, 17.933f, 8.543f, 17.543f)
            curveTo(8.933f, 17.152f, 9.567f, 17.152f, 9.957f, 17.543f)
            lineTo(11f, 18.586f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowMovePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowMove, contentDescription = null)
    }
}
