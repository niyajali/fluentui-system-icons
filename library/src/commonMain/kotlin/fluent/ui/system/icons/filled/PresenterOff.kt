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

public val FluentUi.Filled.PresenterOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenterOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(8.074f, 9.135f)
            curveTo(7.443f, 9.4f, 7f, 10.023f, 7f, 10.75f)
            verticalLineTo(12f)
            horizontalLineTo(10.939f)
            lineTo(11.936f, 12.997f)
            horizontalLineTo(3.749f)
            curveTo(3.04f, 12.997f, 2.727f, 13.89f, 3.28f, 14.333f)
            lineTo(8f, 18.11f)
            verticalLineTo(19.755f)
            curveTo(8f, 20.997f, 9.007f, 22.005f, 10.25f, 22.005f)
            horizontalLineTo(13.745f)
            curveTo(14.988f, 22.005f, 15.995f, 20.997f, 15.995f, 19.755f)
            verticalLineTo(18.11f)
            lineTo(16.581f, 17.642f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(16.179f, 12.997f)
            lineTo(18.937f, 15.755f)
            lineTo(20.713f, 14.333f)
            curveTo(21.267f, 13.889f, 20.953f, 12.997f, 20.244f, 12.997f)
            horizontalLineTo(16.179f)
            close()
            moveTo(12.182f, 9f)
            lineTo(15.182f, 12f)
            horizontalLineTo(16.995f)
            verticalLineTo(10.75f)
            lineTo(16.989f, 10.606f)
            curveTo(16.916f, 9.707f, 16.163f, 9f, 15.245f, 9f)
            horizontalLineTo(12.182f)
            close()
            moveTo(12f, 8f)
            curveTo(11.656f, 8f, 11.326f, 7.943f, 11.018f, 7.836f)
            lineTo(9.164f, 5.982f)
            curveTo(9.058f, 5.675f, 9f, 5.344f, 9f, 5.001f)
            curveTo(9f, 3.344f, 10.343f, 2f, 12f, 2f)
            curveTo(13.657f, 2f, 15f, 3.344f, 15f, 5.001f)
            curveTo(15f, 6.657f, 13.657f, 8f, 12f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PresenterOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PresenterOff, contentDescription = null)
    }
}
