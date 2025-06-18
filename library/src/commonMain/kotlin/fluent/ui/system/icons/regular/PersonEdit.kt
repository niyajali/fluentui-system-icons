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

public val FluentUi.Regular.PersonEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.856f, 15.5f)
            lineTo(16.355f, 14f)
            horizontalLineTo(6.253f)
            curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.249f)
            verticalLineTo(16.827f)
            curveTo(4.004f, 17.719f, 4.322f, 18.583f, 4.902f, 19.262f)
            curveTo(6.298f, 20.896f, 8.345f, 21.793f, 11f, 21.969f)
            curveTo(10.996f, 21.786f, 11.016f, 21.598f, 11.064f, 21.408f)
            lineTo(11.295f, 20.484f)
            curveTo(8.921f, 20.364f, 7.186f, 19.626f, 6.043f, 18.288f)
            curveTo(5.695f, 17.881f, 5.504f, 17.362f, 5.504f, 16.827f)
            verticalLineTo(16.249f)
            curveTo(5.504f, 15.835f, 5.839f, 15.5f, 6.253f, 15.5f)
            horizontalLineTo(14.856f)
            close()
            moveTo(12f, 2.005f)
            curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
            curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
            curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
            curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
            close()
            moveTo(12f, 3.505f)
            curveTo(10.067f, 3.505f, 8.5f, 5.072f, 8.5f, 7.005f)
            curveTo(8.5f, 8.938f, 10.067f, 10.505f, 12f, 10.505f)
            curveTo(13.933f, 10.505f, 15.5f, 8.938f, 15.5f, 7.005f)
            curveTo(15.5f, 5.072f, 13.933f, 3.505f, 12f, 3.505f)
            close()
            moveTo(19.1f, 12.67f)
            lineTo(13.197f, 18.572f)
            curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
            lineTo(12.033f, 21.65f)
            curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
            lineTo(15.182f, 22.511f)
            curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
            lineTo(22.332f, 15.902f)
            curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
            curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonEdit, contentDescription = null)
    }
}
