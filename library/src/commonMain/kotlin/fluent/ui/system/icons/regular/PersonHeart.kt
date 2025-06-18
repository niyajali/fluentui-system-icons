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

public val FluentUi.Regular.PersonHeart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonHeart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.109f, 15.499f)
            curveTo(10.157f, 14.984f, 10.294f, 14.476f, 10.521f, 13.999f)
            horizontalLineTo(4.253f)
            curveTo(3.011f, 13.999f, 2.004f, 15.006f, 2.004f, 16.248f)
            verticalLineTo(16.826f)
            curveTo(2.004f, 17.719f, 2.322f, 18.582f, 2.902f, 19.261f)
            curveTo(4.468f, 21.095f, 6.854f, 22f, 10f, 22f)
            curveTo(11.413f, 22f, 12.673f, 21.818f, 13.774f, 21.451f)
            lineTo(12.559f, 20.236f)
            curveTo(11.796f, 20.412f, 10.944f, 20.5f, 10f, 20.5f)
            curveTo(7.262f, 20.5f, 5.296f, 19.755f, 4.043f, 18.287f)
            curveTo(3.695f, 17.879f, 3.504f, 17.361f, 3.504f, 16.826f)
            verticalLineTo(16.248f)
            curveTo(3.504f, 15.835f, 3.839f, 15.499f, 4.253f, 15.499f)
            horizontalLineTo(10.109f)
            close()
            moveTo(10f, 2.004f)
            curveTo(12.762f, 2.004f, 15f, 4.242f, 15f, 7.004f)
            curveTo(15f, 9.765f, 12.762f, 12.004f, 10f, 12.004f)
            curveTo(7.239f, 12.004f, 5f, 9.765f, 5f, 7.004f)
            curveTo(5f, 4.242f, 7.239f, 2.004f, 10f, 2.004f)
            close()
            moveTo(10f, 3.504f)
            curveTo(8.067f, 3.504f, 6.5f, 5.071f, 6.5f, 7.004f)
            curveTo(6.5f, 8.937f, 8.067f, 10.504f, 10f, 10.504f)
            curveTo(11.933f, 10.504f, 13.5f, 8.937f, 13.5f, 7.004f)
            curveTo(13.5f, 5.071f, 11.933f, 3.504f, 10f, 3.504f)
            close()
            moveTo(17.044f, 22.996f)
            curveTo(16.852f, 22.996f, 16.66f, 22.923f, 16.514f, 22.776f)
            lineTo(12.105f, 18.368f)
            curveTo(10.751f, 17.014f, 10.751f, 14.819f, 12.105f, 13.465f)
            curveTo(13.459f, 12.112f, 15.654f, 12.112f, 17.008f, 13.465f)
            lineTo(17.044f, 13.501f)
            lineTo(17.08f, 13.465f)
            curveTo(18.434f, 12.112f, 20.629f, 12.112f, 21.983f, 13.465f)
            curveTo(23.336f, 14.819f, 23.336f, 17.014f, 21.983f, 18.368f)
            lineTo(17.574f, 22.776f)
            curveTo(17.428f, 22.923f, 17.236f, 22.996f, 17.044f, 22.996f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonHeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonHeart, contentDescription = null)
    }
}
