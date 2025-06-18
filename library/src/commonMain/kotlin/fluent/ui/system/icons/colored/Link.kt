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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.Link: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Link",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(-4.429f, 2.625f),
                end = Offset(3.504f, 26.481f),
            ),
        ) {
            moveTo(9f, 7f)
            curveTo(9.552f, 7f, 10f, 7.448f, 10f, 8f)
            curveTo(10f, 8.513f, 9.614f, 8.936f, 9.117f, 8.993f)
            lineTo(9f, 9f)
            horizontalLineTo(7f)
            curveTo(5.343f, 9f, 4f, 10.343f, 4f, 12f)
            curveTo(4f, 13.598f, 5.249f, 14.904f, 6.824f, 14.995f)
            lineTo(7f, 15f)
            horizontalLineTo(9f)
            curveTo(9.552f, 15f, 10f, 15.448f, 10f, 16f)
            curveTo(10f, 16.513f, 9.614f, 16.935f, 9.117f, 16.993f)
            lineTo(9f, 17f)
            horizontalLineTo(7f)
            curveTo(4.239f, 17f, 2f, 14.761f, 2f, 12f)
            curveTo(2f, 9.311f, 4.122f, 7.118f, 6.783f, 7.005f)
            lineTo(7f, 7f)
            horizontalLineTo(9f)
            close()
            moveTo(17f, 7f)
            curveTo(19.761f, 7f, 22f, 9.239f, 22f, 12f)
            curveTo(22f, 14.689f, 19.878f, 16.882f, 17.217f, 16.995f)
            lineTo(17f, 17f)
            horizontalLineTo(15f)
            curveTo(14.448f, 17f, 14f, 16.552f, 14f, 16f)
            curveTo(14f, 15.487f, 14.386f, 15.064f, 14.883f, 15.007f)
            lineTo(15f, 15f)
            horizontalLineTo(17f)
            curveTo(18.657f, 15f, 20f, 13.657f, 20f, 12f)
            curveTo(20f, 10.402f, 18.751f, 9.096f, 17.176f, 9.005f)
            lineTo(17f, 9f)
            horizontalLineTo(15f)
            curveTo(14.448f, 9f, 14f, 8.552f, 14f, 8f)
            curveTo(14f, 7.487f, 14.386f, 7.064f, 14.883f, 7.007f)
            lineTo(15f, 7f)
            horizontalLineTo(17f)
            close()
            moveTo(7f, 11f)
            horizontalLineTo(17f)
            curveTo(17.552f, 11f, 18f, 11.448f, 18f, 12f)
            curveTo(18f, 12.513f, 17.614f, 12.936f, 17.117f, 12.993f)
            lineTo(17f, 13f)
            horizontalLineTo(7f)
            curveTo(6.448f, 13f, 6f, 12.552f, 6f, 12f)
            curveTo(6f, 11.487f, 6.386f, 11.064f, 6.883f, 11.007f)
            lineTo(7f, 11f)
            horizontalLineTo(17f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Link, contentDescription = null)
    }
}
