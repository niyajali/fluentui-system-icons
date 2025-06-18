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

public val FluentUi.Regular.BoxEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BoxEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.409f, 2.513f)
            curveTo(12.505f, 2.147f, 11.495f, 2.147f, 10.591f, 2.513f)
            lineTo(3.093f, 5.553f)
            curveTo(2.432f, 5.821f, 2f, 6.462f, 2f, 7.175f)
            verticalLineTo(16.827f)
            curveTo(2f, 17.54f, 2.432f, 18.181f, 3.093f, 18.449f)
            lineTo(10.591f, 21.489f)
            curveTo(10.731f, 21.546f, 10.875f, 21.594f, 11.019f, 21.633f)
            curveTo(11.03f, 21.559f, 11.044f, 21.484f, 11.063f, 21.409f)
            lineTo(11.521f, 19.578f)
            curveTo(11.683f, 18.93f, 12.018f, 18.338f, 12.49f, 17.866f)
            lineTo(12.75f, 17.606f)
            verticalLineTo(10.766f)
            lineTo(20.5f, 7.773f)
            verticalLineTo(11.008f)
            curveTo(21.008f, 10.975f, 21.523f, 11.059f, 22f, 11.261f)
            verticalLineTo(7.175f)
            curveTo(22f, 6.462f, 21.568f, 5.821f, 20.907f, 5.553f)
            lineTo(13.409f, 2.513f)
            close()
            moveTo(11.155f, 3.903f)
            curveTo(11.697f, 3.683f, 12.303f, 3.683f, 12.845f, 3.903f)
            lineTo(19.438f, 6.576f)
            lineTo(16.768f, 7.606f)
            lineTo(9.241f, 4.679f)
            lineTo(11.155f, 3.903f)
            close()
            moveTo(7.215f, 5.5f)
            lineTo(14.692f, 8.408f)
            lineTo(12.001f, 9.447f)
            lineTo(4.59f, 6.565f)
            lineTo(7.215f, 5.5f)
            close()
            moveTo(3.5f, 7.75f)
            lineTo(11.25f, 10.764f)
            verticalLineTo(20.135f)
            curveTo(11.218f, 20.124f, 11.186f, 20.112f, 11.155f, 20.099f)
            lineTo(3.656f, 17.059f)
            curveTo(3.562f, 17.021f, 3.5f, 16.929f, 3.5f, 16.827f)
            verticalLineTo(7.75f)
            close()
            moveTo(19.1f, 12.67f)
            lineTo(13.197f, 18.573f)
            curveTo(12.853f, 18.917f, 12.609f, 19.348f, 12.491f, 19.82f)
            lineTo(12.033f, 21.651f)
            curveTo(11.834f, 22.447f, 12.556f, 23.168f, 13.352f, 22.969f)
            lineTo(15.182f, 22.512f)
            curveTo(15.655f, 22.394f, 16.086f, 22.149f, 16.43f, 21.805f)
            lineTo(22.332f, 15.903f)
            curveTo(23.225f, 15.01f, 23.225f, 13.563f, 22.332f, 12.67f)
            curveTo(21.44f, 11.778f, 19.993f, 11.778f, 19.1f, 12.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BoxEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BoxEdit, contentDescription = null)
    }
}
