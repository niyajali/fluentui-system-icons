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

public val FluentUi.Filled.DataBarVerticalStar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataBarVerticalStar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.251f, 3f)
            curveTo(17.009f, 3f, 16.002f, 4.007f, 16.002f, 5.249f)
            verticalLineTo(11.174f)
            curveTo(16.483f, 11.06f, 16.984f, 11f, 17.5f, 11f)
            curveTo(18.582f, 11f, 19.603f, 11.264f, 20.5f, 11.732f)
            verticalLineTo(5.249f)
            curveTo(20.5f, 4.007f, 19.493f, 3f, 18.251f, 3f)
            close()
            moveTo(14f, 9.249f)
            verticalLineTo(12.022f)
            curveTo(12.196f, 13.177f, 11f, 15.199f, 11f, 17.5f)
            curveTo(11f, 18.782f, 11.371f, 19.978f, 12.012f, 20.985f)
            curveTo(11.927f, 20.995f, 11.839f, 21f, 11.751f, 21f)
            curveTo(10.509f, 21f, 9.502f, 19.993f, 9.502f, 18.751f)
            verticalLineTo(9.249f)
            curveTo(9.502f, 8.007f, 10.509f, 7f, 11.751f, 7f)
            curveTo(12.993f, 7f, 14f, 8.007f, 14f, 9.249f)
            close()
            moveTo(3.002f, 13.249f)
            curveTo(3.002f, 12.007f, 4.009f, 11f, 5.251f, 11f)
            curveTo(6.493f, 11f, 7.5f, 12.007f, 7.5f, 13.249f)
            verticalLineTo(18.751f)
            curveTo(7.5f, 19.993f, 6.493f, 21f, 5.251f, 21f)
            curveTo(4.009f, 21f, 3.002f, 19.993f, 3.002f, 18.751f)
            verticalLineTo(13.249f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(18.055f, 14.421f)
            curveTo(17.881f, 13.86f, 17.119f, 13.86f, 16.945f, 14.421f)
            lineTo(16.388f, 16.208f)
            horizontalLineTo(14.585f)
            curveTo(14.019f, 16.208f, 13.784f, 16.962f, 14.242f, 17.309f)
            lineTo(15.7f, 18.413f)
            lineTo(15.143f, 20.2f)
            curveTo(14.968f, 20.761f, 15.584f, 21.228f, 16.042f, 20.881f)
            lineTo(17.5f, 19.777f)
            lineTo(18.958f, 20.881f)
            curveTo(19.416f, 21.228f, 20.032f, 20.761f, 19.857f, 20.2f)
            lineTo(19.3f, 18.413f)
            lineTo(20.758f, 17.309f)
            curveTo(21.216f, 16.962f, 20.981f, 16.208f, 20.415f, 16.208f)
            horizontalLineTo(18.612f)
            lineTo(18.055f, 14.421f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataBarVerticalStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DataBarVerticalStar, contentDescription = null)
    }
}
