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

public val FluentUi.Regular.Person: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Person",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.754f, 14f)
            curveTo(18.997f, 14f, 20.003f, 15.007f, 20.003f, 16.249f)
            verticalLineTo(16.824f)
            curveTo(20.003f, 17.719f, 19.684f, 18.584f, 19.102f, 19.263f)
            curveTo(17.533f, 21.097f, 15.146f, 22.001f, 12f, 22.001f)
            curveTo(8.854f, 22.001f, 6.468f, 21.096f, 4.902f, 19.262f)
            curveTo(4.322f, 18.583f, 4.004f, 17.719f, 4.004f, 16.827f)
            verticalLineTo(16.249f)
            curveTo(4.004f, 15.007f, 5.011f, 14f, 6.253f, 14f)
            horizontalLineTo(17.754f)
            close()
            moveTo(17.754f, 15.5f)
            horizontalLineTo(6.253f)
            curveTo(5.839f, 15.5f, 5.504f, 15.835f, 5.504f, 16.249f)
            verticalLineTo(16.827f)
            curveTo(5.504f, 17.362f, 5.695f, 17.881f, 6.043f, 18.288f)
            curveTo(7.296f, 19.756f, 9.262f, 20.501f, 12f, 20.501f)
            curveTo(14.739f, 20.501f, 16.706f, 19.756f, 17.963f, 18.288f)
            curveTo(18.312f, 17.88f, 18.503f, 17.361f, 18.503f, 16.824f)
            verticalLineTo(16.249f)
            curveTo(18.503f, 15.835f, 18.168f, 15.5f, 17.754f, 15.5f)
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
        }
    }.build()
}

@Preview
@Composable
private fun PersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Person, contentDescription = null)
    }
}
