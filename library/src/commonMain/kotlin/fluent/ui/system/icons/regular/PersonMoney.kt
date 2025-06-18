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

public val FluentUi.Regular.PersonMoney: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonMoney",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.754f, 14f)
            curveTo(18.534f, 14f, 19.222f, 14.397f, 19.625f, 15f)
            horizontalLineTo(13.5f)
            curveTo(12.937f, 15f, 12.418f, 15.186f, 12f, 15.5f)
            horizontalLineTo(6.253f)
            curveTo(5.839f, 15.5f, 5.504f, 15.835f, 5.504f, 16.249f)
            verticalLineTo(16.827f)
            curveTo(5.504f, 17.362f, 5.695f, 17.881f, 6.043f, 18.288f)
            curveTo(7.138f, 19.57f, 8.777f, 20.302f, 11f, 20.466f)
            verticalLineTo(21.5f)
            curveTo(11f, 21.661f, 11.016f, 21.819f, 11.045f, 21.972f)
            curveTo(8.368f, 21.803f, 6.306f, 20.906f, 4.902f, 19.262f)
            curveTo(4.322f, 18.583f, 4.004f, 17.719f, 4.004f, 16.827f)
            verticalLineTo(16.249f)
            curveTo(4.004f, 15.007f, 5.011f, 14f, 6.253f, 14f)
            horizontalLineTo(17.754f)
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
            moveTo(12f, 17.5f)
            curveTo(12f, 16.672f, 12.672f, 16f, 13.5f, 16f)
            horizontalLineTo(21.5f)
            curveTo(22.329f, 16f, 23f, 16.672f, 23f, 17.5f)
            verticalLineTo(21.5f)
            curveTo(23f, 22.328f, 22.329f, 23f, 21.5f, 23f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 23f, 12f, 22.328f, 12f, 21.5f)
            verticalLineTo(17.5f)
            close()
            moveTo(22f, 18f)
            curveTo(21.448f, 18f, 21f, 17.552f, 21f, 17f)
            horizontalLineTo(20f)
            curveTo(20f, 18.105f, 20.896f, 19f, 22f, 19f)
            verticalLineTo(18f)
            close()
            moveTo(22f, 20f)
            curveTo(20.896f, 20f, 20f, 20.895f, 20f, 22f)
            horizontalLineTo(21f)
            curveTo(21f, 21.448f, 21.448f, 21f, 22f, 21f)
            verticalLineTo(20f)
            close()
            moveTo(14f, 17f)
            curveTo(14f, 17.552f, 13.552f, 18f, 13f, 18f)
            verticalLineTo(19f)
            curveTo(14.105f, 19f, 15f, 18.105f, 15f, 17f)
            horizontalLineTo(14f)
            close()
            moveTo(15f, 22f)
            curveTo(15f, 20.895f, 14.105f, 20f, 13f, 20f)
            verticalLineTo(21f)
            curveTo(13.552f, 21f, 14f, 21.448f, 14f, 22f)
            horizontalLineTo(15f)
            close()
            moveTo(19.25f, 19.5f)
            curveTo(19.25f, 18.534f, 18.467f, 17.75f, 17.5f, 17.75f)
            curveTo(16.534f, 17.75f, 15.75f, 18.534f, 15.75f, 19.5f)
            curveTo(15.75f, 20.466f, 16.534f, 21.25f, 17.5f, 21.25f)
            curveTo(18.467f, 21.25f, 19.25f, 20.466f, 19.25f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonMoneyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonMoney, contentDescription = null)
    }
}
