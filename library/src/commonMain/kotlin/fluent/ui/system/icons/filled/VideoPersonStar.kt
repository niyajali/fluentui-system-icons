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

public val FluentUi.Filled.VideoPersonStar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPersonStar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.745f, 4f)
            curveTo(20.988f, 4f, 21.995f, 5.007f, 21.995f, 6.25f)
            verticalLineTo(12.805f)
            curveTo(21.551f, 12.38f, 21.046f, 12.016f, 20.495f, 11.73f)
            verticalLineTo(6.25f)
            curveTo(20.495f, 5.836f, 20.16f, 5.5f, 19.745f, 5.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineTo(17.755f)
            curveTo(3.5f, 18.169f, 3.836f, 18.505f, 4.25f, 18.505f)
            lineTo(6.999f, 18.504f)
            lineTo(7f, 15.75f)
            curveTo(7f, 14.832f, 7.707f, 14.079f, 8.606f, 14.006f)
            lineTo(8.75f, 14f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 15.01f, 11f, 16.211f, 11f, 17.5f)
            curveTo(11f, 18.388f, 11.178f, 19.234f, 11.5f, 20.005f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20.005f, 2f, 18.997f, 2f, 17.755f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineTo(19.745f)
            close()
            moveTo(12f, 7f)
            curveTo(13.657f, 7f, 15f, 8.344f, 15f, 10f)
            curveTo(15f, 11.657f, 13.657f, 13f, 12f, 13f)
            curveTo(10.343f, 13f, 9f, 11.657f, 9f, 10f)
            curveTo(9f, 8.344f, 10.343f, 7f, 12f, 7f)
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
private fun VideoPersonStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoPersonStar, contentDescription = null)
    }
}
