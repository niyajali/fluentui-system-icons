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

public val FluentUi.Regular.DocumentChevronDouble: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentChevronDouble",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.5f, 20f)
            curveTo(18.5f, 20.275f, 18.276f, 20.5f, 18f, 20.5f)
            horizontalLineTo(12.268f)
            curveTo(11.981f, 21.051f, 11.617f, 21.556f, 11.19f, 22f)
            horizontalLineTo(18f)
            curveTo(19.104f, 22f, 20f, 21.104f, 20f, 20f)
            verticalLineTo(9.828f)
            curveTo(20f, 9.298f, 19.789f, 8.789f, 19.414f, 8.414f)
            lineTo(13.585f, 2.586f)
            curveTo(13.57f, 2.571f, 13.553f, 2.558f, 13.536f, 2.545f)
            curveTo(13.524f, 2.536f, 13.512f, 2.526f, 13.5f, 2.516f)
            curveTo(13.429f, 2.452f, 13.359f, 2.389f, 13.281f, 2.336f)
            curveTo(13.256f, 2.319f, 13.228f, 2.305f, 13.2f, 2.292f)
            curveTo(13.184f, 2.284f, 13.168f, 2.276f, 13.153f, 2.268f)
            curveTo(13.136f, 2.259f, 13.12f, 2.249f, 13.103f, 2.239f)
            curveTo(13.049f, 2.208f, 12.994f, 2.176f, 12.937f, 2.152f)
            curveTo(12.74f, 2.07f, 12.528f, 2.029f, 12.313f, 2.014f)
            curveTo(12.293f, 2.013f, 12.274f, 2.01f, 12.254f, 2.007f)
            curveTo(12.227f, 2.004f, 12.2f, 2f, 12.172f, 2f)
            horizontalLineTo(6f)
            curveTo(4.896f, 2f, 4f, 2.896f, 4f, 4f)
            verticalLineTo(11.498f)
            curveTo(4.474f, 11.3f, 4.977f, 11.157f, 5.5f, 11.076f)
            verticalLineTo(4f)
            curveTo(5.5f, 3.725f, 5.724f, 3.5f, 6f, 3.5f)
            horizontalLineTo(12f)
            verticalLineTo(8f)
            curveTo(12f, 9.104f, 12.896f, 10f, 14f, 10f)
            horizontalLineTo(18.5f)
            verticalLineTo(20f)
            close()
            moveTo(13.5f, 4.621f)
            lineTo(17.378f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.275f, 13.5f, 8f)
            verticalLineTo(4.621f)
            close()
            moveTo(6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            close()
            moveTo(5.354f, 15.354f)
            curveTo(5.549f, 15.158f, 5.549f, 14.842f, 5.354f, 14.646f)
            curveTo(5.158f, 14.451f, 4.842f, 14.451f, 4.646f, 14.646f)
            lineTo(2.146f, 17.146f)
            curveTo(1.951f, 17.342f, 1.951f, 17.658f, 2.146f, 17.854f)
            lineTo(4.646f, 20.354f)
            curveTo(4.842f, 20.549f, 5.158f, 20.549f, 5.354f, 20.354f)
            curveTo(5.549f, 20.158f, 5.549f, 19.842f, 5.354f, 19.646f)
            lineTo(3.207f, 17.5f)
            lineTo(5.354f, 15.354f)
            close()
            moveTo(7.646f, 14.646f)
            curveTo(7.451f, 14.842f, 7.451f, 15.158f, 7.646f, 15.354f)
            lineTo(9.793f, 17.5f)
            lineTo(7.646f, 19.646f)
            curveTo(7.451f, 19.842f, 7.451f, 20.158f, 7.646f, 20.354f)
            curveTo(7.842f, 20.549f, 8.158f, 20.549f, 8.354f, 20.354f)
            lineTo(10.854f, 17.854f)
            curveTo(11.049f, 17.658f, 11.049f, 17.342f, 10.854f, 17.146f)
            lineTo(8.354f, 14.646f)
            curveTo(8.158f, 14.451f, 7.842f, 14.451f, 7.646f, 14.646f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentChevronDoublePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentChevronDouble, contentDescription = null)
    }
}
