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

public val FluentUi.Regular.Highway: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Highway",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.49f, 2.87f)
            curveTo(7.557f, 2.461f, 7.279f, 2.076f, 6.87f, 2.01f)
            curveTo(6.461f, 1.943f, 6.076f, 2.221f, 6.01f, 2.63f)
            lineTo(3.01f, 21.13f)
            curveTo(2.943f, 21.539f, 3.221f, 21.924f, 3.63f, 21.99f)
            curveTo(4.039f, 22.057f, 4.424f, 21.779f, 4.49f, 21.37f)
            lineTo(7.49f, 2.87f)
            close()
            moveTo(17.99f, 2.63f)
            curveTo(17.924f, 2.221f, 17.539f, 1.943f, 17.13f, 2.01f)
            curveTo(16.721f, 2.076f, 16.444f, 2.461f, 16.51f, 2.87f)
            lineTo(19.51f, 21.37f)
            curveTo(19.576f, 21.779f, 19.961f, 22.057f, 20.37f, 21.99f)
            curveTo(20.779f, 21.924f, 21.057f, 21.539f, 20.99f, 21.13f)
            lineTo(17.99f, 2.63f)
            close()
            moveTo(12.75f, 2.75f)
            curveTo(12.75f, 2.336f, 12.414f, 2f, 12f, 2f)
            curveTo(11.586f, 2f, 11.25f, 2.336f, 11.25f, 2.75f)
            verticalLineTo(6.25f)
            curveTo(11.25f, 6.664f, 11.586f, 7f, 12f, 7f)
            curveTo(12.414f, 7f, 12.75f, 6.664f, 12.75f, 6.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(11.25f, 13.75f)
            curveTo(11.25f, 14.164f, 11.586f, 14.5f, 12f, 14.5f)
            curveTo(12.414f, 14.5f, 12.75f, 14.164f, 12.75f, 13.75f)
            verticalLineTo(10.25f)
            curveTo(12.75f, 9.836f, 12.414f, 9.5f, 12f, 9.5f)
            curveTo(11.586f, 9.5f, 11.25f, 9.836f, 11.25f, 10.25f)
            verticalLineTo(13.75f)
            close()
            moveTo(11.25f, 17.75f)
            curveTo(11.25f, 17.336f, 11.586f, 17f, 12f, 17f)
            curveTo(12.414f, 17f, 12.75f, 17.336f, 12.75f, 17.75f)
            verticalLineTo(21.25f)
            curveTo(12.75f, 21.664f, 12.414f, 22f, 12f, 22f)
            curveTo(11.586f, 22f, 11.25f, 21.664f, 11.25f, 21.25f)
            verticalLineTo(17.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HighwayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Highway, contentDescription = null)
    }
}
