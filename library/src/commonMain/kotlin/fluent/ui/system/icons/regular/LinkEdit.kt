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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.LinkEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LinkEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.999f, 5.75f)
            curveTo(9.999f, 5.336f, 9.664f, 5f, 9.249f, 5f)
            horizontalLineTo(7f)
            lineTo(6.75f, 5.006f)
            curveTo(4.105f, 5.136f, 2f, 7.322f, 2f, 9.999f)
            curveTo(2f, 12.761f, 4.238f, 14.999f, 7f, 14.999f)
            horizontalLineTo(9.249f)
            lineTo(9.36f, 14.991f)
            curveTo(9.722f, 14.937f, 9.999f, 14.626f, 9.999f, 14.249f)
            curveTo(9.999f, 13.835f, 9.664f, 13.499f, 9.249f, 13.499f)
            horizontalLineTo(7f)
            lineTo(6.794f, 13.493f)
            curveTo(4.957f, 13.387f, 3.5f, 11.863f, 3.5f, 9.999f)
            curveTo(3.5f, 8.067f, 5.067f, 6.5f, 7f, 6.5f)
            horizontalLineTo(9.249f)
            lineTo(9.36f, 6.492f)
            curveTo(9.722f, 6.438f, 9.999f, 6.126f, 9.999f, 5.75f)
            close()
            moveTo(21.998f, 9.999f)
            curveTo(21.998f, 7.238f, 19.76f, 5f, 16.999f, 5f)
            horizontalLineTo(14.749f)
            lineTo(14.638f, 5.008f)
            curveTo(14.276f, 5.062f, 13.999f, 5.373f, 13.999f, 5.75f)
            curveTo(13.999f, 6.164f, 14.335f, 6.5f, 14.749f, 6.5f)
            horizontalLineTo(16.999f)
            lineTo(17.204f, 6.506f)
            curveTo(19.041f, 6.612f, 20.498f, 8.136f, 20.498f, 9.999f)
            curveTo(20.498f, 10.031f, 20.498f, 10.062f, 20.497f, 10.094f)
            curveTo(21.015f, 10.22f, 21.507f, 10.474f, 21.925f, 10.855f)
            curveTo(21.973f, 10.577f, 21.998f, 10.291f, 21.998f, 9.999f)
            close()
            moveTo(16.999f, 9.25f)
            horizontalLineTo(7f)
            lineTo(6.898f, 9.256f)
            curveTo(6.532f, 9.306f, 6.25f, 9.62f, 6.25f, 9.999f)
            curveTo(6.25f, 10.414f, 6.585f, 10.749f, 7f, 10.749f)
            horizontalLineTo(16.999f)
            lineTo(17.1f, 10.743f)
            curveTo(17.466f, 10.693f, 17.749f, 10.379f, 17.749f, 9.999f)
            curveTo(17.749f, 9.585f, 17.413f, 9.25f, 16.999f, 9.25f)
            close()
            moveTo(18.098f, 11.669f)
            lineTo(12.196f, 17.571f)
            curveTo(11.852f, 17.915f, 11.608f, 18.346f, 11.49f, 18.818f)
            lineTo(11.033f, 20.648f)
            curveTo(10.834f, 21.444f, 11.555f, 22.166f, 12.351f, 21.967f)
            lineTo(14.181f, 21.509f)
            curveTo(14.653f, 21.391f, 15.085f, 21.147f, 15.429f, 20.803f)
            lineTo(21.331f, 14.901f)
            curveTo(22.223f, 14.008f, 22.223f, 12.561f, 21.331f, 11.669f)
            curveTo(20.438f, 10.776f, 18.991f, 10.776f, 18.098f, 11.669f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LinkEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.LinkEdit, contentDescription = null)
    }
}
