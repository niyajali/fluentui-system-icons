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

public val FluentUi.Filled.VehicleCarProfileLtr: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VehicleCarProfileLtr",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.028f, 4f)
            curveTo(6.787f, 4f, 5.701f, 4.83f, 5.374f, 6.026f)
            lineTo(4.422f, 9.519f)
            curveTo(3.058f, 9.682f, 2f, 10.842f, 2f, 12.25f)
            verticalLineTo(14.5f)
            curveTo(2f, 15.365f, 2.399f, 16.136f, 3.023f, 16.64f)
            curveTo(3.216f, 18.251f, 4.587f, 19.5f, 6.25f, 19.5f)
            curveTo(7.696f, 19.5f, 8.921f, 18.556f, 9.343f, 17.25f)
            horizontalLineTo(14.157f)
            curveTo(14.578f, 18.556f, 15.804f, 19.5f, 17.25f, 19.5f)
            curveTo(18.79f, 19.5f, 20.079f, 18.429f, 20.415f, 16.992f)
            curveTo(21.351f, 16.553f, 22f, 15.602f, 22f, 14.5f)
            verticalLineTo(12.812f)
            curveTo(22f, 11.55f, 21.141f, 10.45f, 19.917f, 10.144f)
            lineTo(17.735f, 9.598f)
            lineTo(15.226f, 5.352f)
            curveTo(14.732f, 4.514f, 13.831f, 4f, 12.858f, 4f)
            horizontalLineTo(8.028f)
            close()
            moveTo(6.822f, 6.421f)
            curveTo(6.97f, 5.877f, 7.464f, 5.5f, 8.028f, 5.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(5.982f)
            lineTo(6.822f, 6.421f)
            close()
            moveTo(11f, 9.5f)
            verticalLineTo(5.5f)
            horizontalLineTo(12.858f)
            curveTo(13.301f, 5.5f, 13.71f, 5.734f, 13.935f, 6.114f)
            lineTo(15.934f, 9.5f)
            horizontalLineTo(11f)
            close()
            moveTo(6.25f, 14.5f)
            curveTo(7.216f, 14.5f, 8f, 15.283f, 8f, 16.25f)
            curveTo(8f, 17.216f, 7.216f, 18f, 6.25f, 18f)
            curveTo(5.284f, 18f, 4.5f, 17.216f, 4.5f, 16.25f)
            curveTo(4.5f, 15.283f, 5.284f, 14.5f, 6.25f, 14.5f)
            close()
            moveTo(15.5f, 16.25f)
            curveTo(15.5f, 15.283f, 16.284f, 14.5f, 17.25f, 14.5f)
            curveTo(18.216f, 14.5f, 19f, 15.283f, 19f, 16.25f)
            curveTo(19f, 17.216f, 18.216f, 18f, 17.25f, 18f)
            curveTo(16.284f, 18f, 15.5f, 17.216f, 15.5f, 16.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VehicleCarProfileLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VehicleCarProfileLtr, contentDescription = null)
    }
}
