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

public val FluentIcons.Filled.StarArrowRightStart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarArrowRightStart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.79f, 3.102f)
            curveTo(11.285f, 2.099f, 12.716f, 2.099f, 13.211f, 3.102f)
            lineTo(15.569f, 7.88f)
            lineTo(20.841f, 8.646f)
            curveTo(21.949f, 8.807f, 22.391f, 10.168f, 21.59f, 10.949f)
            lineTo(17.774f, 14.668f)
            lineTo(18.675f, 19.919f)
            curveTo(18.864f, 21.022f, 17.707f, 21.863f, 16.716f, 21.342f)
            lineTo(12.758f, 19.261f)
            curveTo(12.916f, 18.701f, 13f, 18.11f, 13f, 17.5f)
            curveTo(13f, 13.91f, 10.09f, 11f, 6.5f, 11f)
            curveTo(5.343f, 11f, 4.257f, 11.302f, 3.316f, 11.831f)
            lineTo(2.411f, 10.949f)
            curveTo(1.61f, 10.168f, 2.052f, 8.807f, 3.159f, 8.646f)
            lineTo(8.432f, 7.88f)
            lineTo(10.79f, 3.102f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.537f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.537f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(3.5f, 17f)
            curveTo(3.224f, 17f, 3f, 17.223f, 3f, 17.5f)
            curveTo(3f, 17.776f, 3.224f, 18f, 3.5f, 18f)
            lineTo(8.293f, 18f)
            lineTo(6.646f, 19.646f)
            curveTo(6.451f, 19.841f, 6.451f, 20.158f, 6.646f, 20.353f)
            curveTo(6.842f, 20.548f, 7.158f, 20.548f, 7.354f, 20.353f)
            lineTo(9.854f, 17.853f)
            curveTo(10.049f, 17.658f, 10.049f, 17.341f, 9.854f, 17.146f)
            lineTo(7.354f, 14.646f)
            curveTo(7.158f, 14.451f, 6.842f, 14.451f, 6.646f, 14.646f)
            curveTo(6.451f, 14.841f, 6.451f, 15.158f, 6.646f, 15.353f)
            lineTo(8.293f, 17f)
            lineTo(3.5f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarArrowRightStartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StarArrowRightStart, contentDescription = null)
    }
}
