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

public val FluentIcons.Regular.PersonSwap: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonSwap",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.751f, 13.997f)
            curveTo(16.731f, 13.997f, 17.565f, 14.625f, 17.873f, 15.5f)
            horizontalLineTo(15.817f)
            curveTo(15.795f, 15.498f, 15.773f, 15.497f, 15.751f, 15.497f)
            horizontalLineTo(4.249f)
            curveTo(3.835f, 15.497f, 3.5f, 15.833f, 3.5f, 16.246f)
            verticalLineTo(16.824f)
            curveTo(3.5f, 17.36f, 3.691f, 17.878f, 4.039f, 18.285f)
            curveTo(5.292f, 19.753f, 7.258f, 20.498f, 9.996f, 20.498f)
            curveTo(10.053f, 20.498f, 10.108f, 20.498f, 10.164f, 20.497f)
            curveTo(10.25f, 20.681f, 10.367f, 20.85f, 10.513f, 20.996f)
            lineTo(11.448f, 21.929f)
            curveTo(10.984f, 21.975f, 10.5f, 21.998f, 9.996f, 21.998f)
            curveTo(6.851f, 21.998f, 4.465f, 21.093f, 2.898f, 19.259f)
            curveTo(2.319f, 18.58f, 2f, 17.717f, 2f, 16.824f)
            verticalLineTo(16.246f)
            curveTo(2f, 15.004f, 3.007f, 13.997f, 4.249f, 13.997f)
            horizontalLineTo(15.751f)
            close()
            moveTo(9.996f, 2.002f)
            curveTo(12.758f, 2.002f, 14.997f, 4.241f, 14.997f, 7.002f)
            curveTo(14.997f, 9.763f, 12.758f, 12.002f, 9.996f, 12.002f)
            curveTo(7.235f, 12.002f, 4.996f, 9.763f, 4.996f, 7.002f)
            curveTo(4.996f, 4.241f, 7.235f, 2.002f, 9.996f, 2.002f)
            close()
            moveTo(9.996f, 3.502f)
            curveTo(8.063f, 3.502f, 6.496f, 5.069f, 6.496f, 7.002f)
            curveTo(6.496f, 8.935f, 8.063f, 10.502f, 9.996f, 10.502f)
            curveTo(11.929f, 10.502f, 13.497f, 8.935f, 13.497f, 7.002f)
            curveTo(13.497f, 5.069f, 11.929f, 3.502f, 9.996f, 3.502f)
            close()
            moveTo(14.78f, 17.784f)
            curveTo(15.073f, 17.491f, 15.073f, 17.016f, 14.78f, 16.723f)
            curveTo(14.487f, 16.43f, 14.012f, 16.43f, 13.719f, 16.723f)
            lineTo(11.219f, 19.224f)
            curveTo(11.079f, 19.365f, 11f, 19.556f, 11f, 19.755f)
            curveTo(11f, 19.954f, 11.079f, 20.144f, 11.219f, 20.285f)
            lineTo(13.719f, 22.784f)
            curveTo(14.012f, 23.077f, 14.487f, 23.076f, 14.78f, 22.784f)
            curveTo(15.073f, 22.491f, 15.073f, 22.016f, 14.78f, 21.723f)
            lineTo(13.56f, 20.503f)
            horizontalLineTo(20.44f)
            lineTo(19.22f, 21.723f)
            curveTo(18.927f, 22.016f, 18.927f, 22.49f, 19.219f, 22.784f)
            curveTo(19.512f, 23.076f, 19.987f, 23.077f, 20.28f, 22.784f)
            lineTo(22.78f, 20.285f)
            curveTo(22.921f, 20.145f, 23f, 19.954f, 23f, 19.755f)
            curveTo(23f, 19.556f, 22.921f, 19.365f, 22.78f, 19.225f)
            lineTo(20.28f, 16.723f)
            curveTo(19.987f, 16.43f, 19.513f, 16.43f, 19.22f, 16.723f)
            curveTo(18.927f, 17.016f, 18.927f, 17.49f, 19.219f, 17.784f)
            lineTo(20.438f, 19.003f)
            horizontalLineTo(13.561f)
            lineTo(14.78f, 17.784f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonSwapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonSwap, contentDescription = null)
    }
}
