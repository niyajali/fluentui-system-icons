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

public val FluentUi.Filled.PersonPhone: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonPhone",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 21.372f)
            verticalLineTo(14f)
            horizontalLineTo(4.253f)
            curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
            verticalLineTo(17.169f)
            curveTo(2.004f, 17.741f, 2.182f, 18.299f, 2.514f, 18.765f)
            curveTo(4.056f, 20.929f, 6.579f, 22.001f, 10f, 22.001f)
            curveTo(11.511f, 22.001f, 12.847f, 21.792f, 14f, 21.372f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
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
            curveTo(19.72f, 20.441f, 20.003f, 20.127f, 20.003f, 19.747f)
            curveTo(20.003f, 19.333f, 19.667f, 18.997f, 19.253f, 18.997f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonPhonePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonPhone, contentDescription = null)
    }
}
