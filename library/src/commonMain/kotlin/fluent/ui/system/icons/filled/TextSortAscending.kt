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

public val FluentUi.Filled.TextSortAscending: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextSortAscending",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.979f, 2.673f)
            curveTo(7.839f, 2.27f, 7.46f, 2f, 7.034f, 2f)
            curveTo(6.608f, 2f, 6.228f, 2.27f, 6.089f, 2.673f)
            lineTo(3.296f, 10.742f)
            curveTo(3.115f, 11.264f, 3.391f, 11.833f, 3.913f, 12.014f)
            curveTo(4.435f, 12.195f, 5.005f, 11.918f, 5.186f, 11.396f)
            lineTo(5.597f, 10.207f)
            horizontalLineTo(8.47f)
            lineTo(8.882f, 11.396f)
            curveTo(9.063f, 11.918f, 9.632f, 12.195f, 10.154f, 12.014f)
            curveTo(10.676f, 11.833f, 10.953f, 11.264f, 10.772f, 10.742f)
            lineTo(7.979f, 2.673f)
            close()
            moveTo(6.29f, 8.207f)
            lineTo(7.034f, 6.057f)
            lineTo(7.778f, 8.207f)
            horizontalLineTo(6.29f)
            close()
            moveTo(17.5f, 2f)
            curveTo(18.052f, 2f, 18.5f, 2.448f, 18.5f, 3f)
            verticalLineTo(18.586f)
            lineTo(20.293f, 16.793f)
            curveTo(20.683f, 16.402f, 21.317f, 16.402f, 21.707f, 16.793f)
            curveTo(22.098f, 17.183f, 22.098f, 17.817f, 21.707f, 18.207f)
            lineTo(18.207f, 21.707f)
            curveTo(17.817f, 22.098f, 17.183f, 22.098f, 16.793f, 21.707f)
            lineTo(13.293f, 18.207f)
            curveTo(12.902f, 17.817f, 12.902f, 17.183f, 13.293f, 16.793f)
            curveTo(13.683f, 16.402f, 14.317f, 16.402f, 14.707f, 16.793f)
            lineTo(16.5f, 18.586f)
            verticalLineTo(3f)
            curveTo(16.5f, 2.448f, 16.948f, 2f, 17.5f, 2f)
            close()
            moveTo(3f, 16f)
            curveTo(3f, 14.343f, 4.343f, 13f, 6f, 13f)
            horizontalLineTo(10f)
            curveTo(10.552f, 13f, 11f, 13.448f, 11f, 14f)
            verticalLineTo(21f)
            curveTo(11f, 21.552f, 10.552f, 22f, 10f, 22f)
            curveTo(9.448f, 22f, 9f, 21.552f, 9f, 21f)
            verticalLineTo(19f)
            horizontalLineTo(6.339f)
            curveTo(6.307f, 19.007f, 6.26f, 19.018f, 6.203f, 19.036f)
            curveTo(6.067f, 19.079f, 5.888f, 19.154f, 5.712f, 19.28f)
            curveTo(5.406f, 19.501f, 5f, 19.951f, 5f, 21f)
            curveTo(5f, 21.552f, 4.552f, 22f, 4f, 22f)
            curveTo(3.448f, 22f, 3f, 21.552f, 3f, 21f)
            curveTo(3f, 19.726f, 3.405f, 18.818f, 3.953f, 18.193f)
            curveTo(3.367f, 17.646f, 3f, 16.866f, 3f, 16f)
            close()
            moveTo(6.27f, 17f)
            horizontalLineTo(9f)
            verticalLineTo(15f)
            horizontalLineTo(6f)
            curveTo(5.448f, 15f, 5f, 15.448f, 5f, 16f)
            curveTo(5f, 16.552f, 5.448f, 17f, 6f, 17f)
            horizontalLineTo(6.244f)
            curveTo(6.253f, 17f, 6.262f, 17f, 6.27f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextSortAscendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextSortAscending, contentDescription = null)
    }
}
