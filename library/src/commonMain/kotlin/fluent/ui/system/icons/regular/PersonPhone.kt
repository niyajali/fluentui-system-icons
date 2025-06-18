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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.PersonPhone: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonPhone",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 15.5f)
            verticalLineTo(14f)
            horizontalLineTo(4.253f)
            curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
            verticalLineTo(16.826f)
            curveTo(2.004f, 17.719f, 2.322f, 18.583f, 2.902f, 19.262f)
            curveTo(4.468f, 21.096f, 6.854f, 22.001f, 10f, 22.001f)
            curveTo(11.511f, 22.001f, 12.846f, 21.792f, 14f, 21.372f)
            verticalLineTo(19.752f)
            curveTo(12.919f, 20.25f, 11.589f, 20.501f, 10f, 20.501f)
            curveTo(7.262f, 20.501f, 5.296f, 19.755f, 4.043f, 18.288f)
            curveTo(3.695f, 17.88f, 3.504f, 17.362f, 3.504f, 16.826f)
            verticalLineTo(16.249f)
            curveTo(3.504f, 15.835f, 3.839f, 15.5f, 4.253f, 15.5f)
            horizontalLineTo(14f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
            close()
            moveTo(10f, 3.505f)
            curveTo(8.067f, 3.505f, 6.5f, 5.072f, 6.5f, 7.005f)
            curveTo(6.5f, 8.938f, 8.067f, 10.505f, 10f, 10.505f)
            curveTo(11.933f, 10.505f, 13.5f, 8.938f, 13.5f, 7.005f)
            curveTo(13.5f, 5.072f, 11.933f, 3.505f, 10f, 3.505f)
            close()
            moveTo(21.255f, 10f)
            curveTo(22.221f, 10f, 23.005f, 10.783f, 23.005f, 11.75f)
            verticalLineTo(21.25f)
            curveTo(23.005f, 22.217f, 22.221f, 23f, 21.255f, 23f)
            horizontalLineTo(16.75f)
            curveTo(15.784f, 23f, 15f, 22.217f, 15f, 21.25f)
            verticalLineTo(11.75f)
            curveTo(15f, 10.783f, 15.784f, 10f, 16.75f, 10f)
            horizontalLineTo(21.255f)
            close()
            moveTo(19.253f, 18.997f)
            horizontalLineTo(18.753f)
            lineTo(18.651f, 19.004f)
            curveTo(18.285f, 19.053f, 18.003f, 19.367f, 18.003f, 19.747f)
            curveTo(18.003f, 20.161f, 18.338f, 20.497f, 18.753f, 20.497f)
            horizontalLineTo(19.253f)
            lineTo(19.354f, 20.49f)
            curveTo(19.721f, 20.441f, 20.003f, 20.127f, 20.003f, 19.747f)
            curveTo(20.003f, 19.333f, 19.667f, 18.997f, 19.253f, 18.997f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonPhonePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonPhone, contentDescription = null)
    }
}
