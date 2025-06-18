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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.DataBarVerticalEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataBarVerticalEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.1f, 12.67f)
            curveTo(19.992f, 11.777f, 21.439f, 11.777f, 22.332f, 12.67f)
            curveTo(23.225f, 13.563f, 23.225f, 15.01f, 22.332f, 15.902f)
            lineTo(16.43f, 21.805f)
            curveTo(16.086f, 22.149f, 15.655f, 22.393f, 15.183f, 22.511f)
            lineTo(13.352f, 22.969f)
            curveTo(12.556f, 23.168f, 11.835f, 22.446f, 12.033f, 21.65f)
            lineTo(12.491f, 19.819f)
            curveTo(12.609f, 19.347f, 12.853f, 18.916f, 13.197f, 18.572f)
            lineTo(19.1f, 12.67f)
            close()
            moveTo(5.249f, 11f)
            curveTo(6.491f, 11f, 7.498f, 12.007f, 7.498f, 13.249f)
            verticalLineTo(18.751f)
            curveTo(7.498f, 19.993f, 6.491f, 21f, 5.249f, 21f)
            curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.751f)
            verticalLineTo(13.249f)
            curveTo(3f, 12.007f, 4.007f, 11f, 5.249f, 11f)
            close()
            moveTo(11.749f, 7f)
            curveTo(12.991f, 7f, 13.998f, 8.007f, 13.998f, 9.249f)
            verticalLineTo(16.357f)
            lineTo(12.498f, 17.857f)
            verticalLineTo(9.249f)
            curveTo(12.498f, 8.835f, 12.163f, 8.5f, 11.749f, 8.5f)
            curveTo(11.335f, 8.5f, 11f, 8.835f, 11f, 9.249f)
            verticalLineTo(18.751f)
            curveTo(11f, 19.096f, 11.234f, 19.383f, 11.552f, 19.47f)
            curveTo(11.542f, 19.505f, 11.531f, 19.541f, 11.521f, 19.577f)
            lineTo(11.185f, 20.925f)
            curveTo(10.216f, 20.674f, 9.5f, 19.798f, 9.5f, 18.751f)
            verticalLineTo(9.249f)
            curveTo(9.5f, 8.007f, 10.507f, 7f, 11.749f, 7f)
            close()
            moveTo(5.249f, 12.5f)
            curveTo(4.835f, 12.5f, 4.5f, 12.835f, 4.5f, 13.249f)
            verticalLineTo(18.751f)
            curveTo(4.5f, 19.165f, 4.835f, 19.5f, 5.249f, 19.5f)
            curveTo(5.663f, 19.5f, 5.998f, 19.165f, 5.998f, 18.751f)
            verticalLineTo(13.249f)
            curveTo(5.998f, 12.835f, 5.663f, 12.5f, 5.249f, 12.5f)
            close()
            moveTo(18.249f, 3f)
            curveTo(19.491f, 3f, 20.498f, 4.007f, 20.498f, 5.249f)
            verticalLineTo(11.008f)
            curveTo(19.975f, 11.042f, 19.459f, 11.202f, 18.998f, 11.485f)
            verticalLineTo(5.249f)
            curveTo(18.998f, 4.835f, 18.663f, 4.5f, 18.249f, 4.5f)
            curveTo(17.835f, 4.5f, 17.5f, 4.835f, 17.5f, 5.249f)
            verticalLineTo(12.856f)
            lineTo(16f, 14.356f)
            verticalLineTo(5.249f)
            curveTo(16f, 4.007f, 17.007f, 3f, 18.249f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataBarVerticalEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DataBarVerticalEdit, contentDescription = null)
    }
}
