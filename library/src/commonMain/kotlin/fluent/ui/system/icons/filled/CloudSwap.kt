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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.CloudSwap: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudSwap",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.08f, 9.019f)
            curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
            curveTo(14.98f, 4f, 17.452f, 6.172f, 17.92f, 9.019f)
            curveTo(20.208f, 9.231f, 22f, 11.156f, 22f, 13.5f)
            curveTo(22f, 14.1f, 21.883f, 14.672f, 21.67f, 15.195f)
            lineTo(19.987f, 13.513f)
            curveTo(19.304f, 12.829f, 18.196f, 12.829f, 17.513f, 13.513f)
            curveTo(16.975f, 14.05f, 16.86f, 14.85f, 17.168f, 15.5f)
            horizontalLineTo(14.832f)
            curveTo(15.14f, 14.85f, 15.025f, 14.05f, 14.487f, 13.513f)
            curveTo(13.804f, 12.829f, 12.696f, 12.829f, 12.013f, 13.513f)
            lineTo(9.513f, 16.013f)
            curveTo(8.975f, 16.55f, 8.86f, 17.35f, 9.168f, 18f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.019f)
            close()
            moveTo(13.78f, 15.28f)
            curveTo(14.073f, 14.987f, 14.073f, 14.513f, 13.78f, 14.22f)
            curveTo(13.487f, 13.927f, 13.013f, 13.927f, 12.72f, 14.22f)
            lineTo(10.22f, 16.72f)
            curveTo(9.927f, 17.013f, 9.927f, 17.487f, 10.22f, 17.78f)
            lineTo(12.72f, 20.28f)
            curveTo(13.013f, 20.573f, 13.487f, 20.573f, 13.78f, 20.28f)
            curveTo(14.073f, 19.987f, 14.073f, 19.513f, 13.78f, 19.22f)
            lineTo(12.561f, 18f)
            horizontalLineTo(19.439f)
            lineTo(18.22f, 19.22f)
            curveTo(17.927f, 19.513f, 17.927f, 19.987f, 18.22f, 20.28f)
            curveTo(18.513f, 20.573f, 18.987f, 20.573f, 19.28f, 20.28f)
            lineTo(21.78f, 17.78f)
            curveTo(22.073f, 17.487f, 22.073f, 17.013f, 21.78f, 16.72f)
            lineTo(19.28f, 14.22f)
            curveTo(18.987f, 13.927f, 18.513f, 13.927f, 18.22f, 14.22f)
            curveTo(17.927f, 14.513f, 17.927f, 14.987f, 18.22f, 15.28f)
            lineTo(19.439f, 16.5f)
            horizontalLineTo(12.561f)
            lineTo(13.78f, 15.28f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudSwapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CloudSwap, contentDescription = null)
    }
}
