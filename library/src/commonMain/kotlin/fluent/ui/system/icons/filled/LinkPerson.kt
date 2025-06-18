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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.LinkPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LinkPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 6f)
            curveTo(10f, 5.448f, 9.552f, 5f, 9f, 5f)
            horizontalLineTo(7f)
            lineTo(6.783f, 5.005f)
            curveTo(4.122f, 5.118f, 2f, 7.311f, 2f, 10f)
            curveTo(2f, 12.761f, 4.239f, 15f, 7f, 15f)
            horizontalLineTo(9f)
            lineTo(9.117f, 14.993f)
            curveTo(9.614f, 14.936f, 10f, 14.513f, 10f, 14f)
            curveTo(10f, 13.448f, 9.552f, 13f, 9f, 13f)
            horizontalLineTo(7f)
            lineTo(6.824f, 12.995f)
            curveTo(5.249f, 12.904f, 4f, 11.598f, 4f, 10f)
            curveTo(4f, 8.343f, 5.343f, 7f, 7f, 7f)
            horizontalLineTo(9f)
            lineTo(9.117f, 6.993f)
            curveTo(9.614f, 6.936f, 10f, 6.513f, 10f, 6f)
            close()
            moveTo(22f, 10f)
            curveTo(22f, 7.239f, 19.761f, 5f, 17f, 5f)
            horizontalLineTo(15f)
            lineTo(14.883f, 5.007f)
            curveTo(14.386f, 5.064f, 14f, 5.487f, 14f, 6f)
            curveTo(14f, 6.552f, 14.448f, 7f, 15f, 7f)
            horizontalLineTo(17f)
            lineTo(17.176f, 7.005f)
            curveTo(18.751f, 7.096f, 20f, 8.402f, 20f, 10f)
            curveTo(20f, 10.604f, 19.821f, 11.167f, 19.514f, 11.637f)
            curveTo(20.085f, 12.04f, 20.531f, 12.609f, 20.779f, 13.274f)
            curveTo(21.54f, 12.397f, 22f, 11.252f, 22f, 10f)
            close()
            moveTo(17f, 9f)
            horizontalLineTo(7f)
            lineTo(6.883f, 9.007f)
            curveTo(6.386f, 9.064f, 6f, 9.487f, 6f, 10f)
            curveTo(6f, 10.552f, 6.448f, 11f, 7f, 11f)
            horizontalLineTo(17f)
            lineTo(17.117f, 10.993f)
            curveTo(17.614f, 10.936f, 18f, 10.513f, 18f, 10f)
            curveTo(18f, 9.448f, 17.552f, 9f, 17f, 9f)
            close()
            moveTo(20f, 14.5f)
            curveTo(20f, 15.881f, 18.881f, 17f, 17.5f, 17f)
            curveTo(16.119f, 17f, 15f, 15.881f, 15f, 14.5f)
            curveTo(15f, 13.119f, 16.119f, 12f, 17.5f, 12f)
            curveTo(18.881f, 12f, 20f, 13.119f, 20f, 14.5f)
            close()
            moveTo(22f, 19.875f)
            curveTo(22f, 21.431f, 20.714f, 23f, 17.5f, 23f)
            curveTo(14.286f, 23f, 13f, 21.437f, 13f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(13f, 18.793f, 13.794f, 18f, 14.773f, 18f)
            horizontalLineTo(20.227f)
            curveTo(21.206f, 18f, 22f, 18.793f, 22f, 19.772f)
            verticalLineTo(19.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LinkPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LinkPerson, contentDescription = null)
    }
}
