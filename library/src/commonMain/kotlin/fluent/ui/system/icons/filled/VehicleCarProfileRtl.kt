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

public val FluentUi.Filled.VehicleCarProfileRtl: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VehicleCarProfileRtl",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.972f, 4f)
            curveTo(17.212f, 4f, 18.299f, 4.83f, 18.625f, 6.026f)
            lineTo(19.578f, 9.519f)
            curveTo(20.942f, 9.682f, 22f, 10.842f, 22f, 12.25f)
            verticalLineTo(14.5f)
            curveTo(22f, 15.365f, 21.601f, 16.136f, 20.977f, 16.64f)
            curveTo(20.784f, 18.251f, 19.413f, 19.5f, 17.75f, 19.5f)
            curveTo(16.304f, 19.5f, 15.078f, 18.556f, 14.657f, 17.25f)
            horizontalLineTo(9.843f)
            curveTo(9.421f, 18.556f, 8.196f, 19.5f, 6.75f, 19.5f)
            curveTo(5.21f, 19.5f, 3.921f, 18.429f, 3.585f, 16.992f)
            curveTo(2.649f, 16.553f, 2f, 15.602f, 2f, 14.5f)
            verticalLineTo(12.812f)
            curveTo(2f, 11.55f, 2.859f, 10.45f, 4.083f, 10.144f)
            lineTo(6.265f, 9.598f)
            lineTo(8.774f, 5.352f)
            curveTo(9.268f, 4.514f, 10.169f, 4f, 11.142f, 4f)
            horizontalLineTo(15.972f)
            close()
            moveTo(17.178f, 6.421f)
            curveTo(17.03f, 5.877f, 16.536f, 5.5f, 15.972f, 5.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(18.018f)
            lineTo(17.178f, 6.421f)
            close()
            moveTo(13f, 9.5f)
            verticalLineTo(5.5f)
            horizontalLineTo(11.142f)
            curveTo(10.699f, 5.5f, 10.29f, 5.734f, 10.065f, 6.114f)
            lineTo(8.066f, 9.5f)
            horizontalLineTo(13f)
            close()
            moveTo(17.75f, 14.5f)
            curveTo(16.784f, 14.5f, 16f, 15.283f, 16f, 16.25f)
            curveTo(16f, 17.216f, 16.784f, 18f, 17.75f, 18f)
            curveTo(18.716f, 18f, 19.5f, 17.216f, 19.5f, 16.25f)
            curveTo(19.5f, 15.283f, 18.716f, 14.5f, 17.75f, 14.5f)
            close()
            moveTo(8.5f, 16.25f)
            curveTo(8.5f, 15.283f, 7.716f, 14.5f, 6.75f, 14.5f)
            curveTo(5.784f, 14.5f, 5f, 15.283f, 5f, 16.25f)
            curveTo(5f, 17.216f, 5.784f, 18f, 6.75f, 18f)
            curveTo(7.716f, 18f, 8.5f, 17.216f, 8.5f, 16.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VehicleCarProfileRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VehicleCarProfileRtl, contentDescription = null)
    }
}
