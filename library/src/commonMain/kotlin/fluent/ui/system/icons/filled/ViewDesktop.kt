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

public val FluentUi.Filled.ViewDesktop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ViewDesktop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.749f, 3f)
            curveTo(20.94f, 3f, 21.914f, 3.925f, 21.994f, 5.096f)
            lineTo(21.999f, 5.25f)
            verticalLineTo(15.752f)
            curveTo(21.999f, 16.943f, 21.074f, 17.918f, 19.903f, 17.997f)
            lineTo(19.749f, 18.002f)
            lineTo(15.499f, 18.002f)
            verticalLineTo(20.5f)
            lineTo(17.25f, 20.5f)
            curveTo(17.664f, 20.5f, 18f, 20.836f, 18f, 21.25f)
            curveTo(18f, 21.63f, 17.718f, 21.944f, 17.352f, 21.994f)
            lineTo(17.25f, 22f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 22f, 6f, 21.665f, 6f, 21.25f)
            curveTo(6f, 20.871f, 6.282f, 20.557f, 6.648f, 20.507f)
            lineTo(6.75f, 20.5f)
            lineTo(8.499f, 20.5f)
            verticalLineTo(18.002f)
            lineTo(4.25f, 18.002f)
            curveTo(3.059f, 18.002f, 2.084f, 17.077f, 2.005f, 15.906f)
            lineTo(2f, 15.752f)
            verticalLineTo(5.25f)
            curveTo(2f, 4.059f, 2.925f, 3.084f, 4.096f, 3.005f)
            lineTo(4.25f, 3f)
            horizontalLineTo(19.749f)
            close()
            moveTo(13.998f, 18.002f)
            horizontalLineTo(9.998f)
            lineTo(9.999f, 20.5f)
            horizontalLineTo(13.999f)
            lineTo(13.998f, 18.002f)
            close()
            moveTo(18.504f, 6f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 6f, 9f, 6.224f, 9f, 6.5f)
            verticalLineTo(14.502f)
            curveTo(9f, 14.779f, 9.224f, 15.002f, 9.5f, 15.002f)
            horizontalLineTo(18.504f)
            curveTo(18.78f, 15.002f, 19.004f, 14.779f, 19.004f, 14.502f)
            verticalLineTo(6.5f)
            curveTo(19.004f, 6.224f, 18.78f, 6f, 18.504f, 6f)
            close()
            moveTo(7.499f, 6f)
            horizontalLineTo(5.499f)
            curveTo(5.223f, 6f, 4.999f, 6.224f, 4.999f, 6.5f)
            verticalLineTo(14.502f)
            curveTo(4.999f, 14.779f, 5.223f, 15.002f, 5.499f, 15.002f)
            horizontalLineTo(7.499f)
            curveTo(7.775f, 15.002f, 7.999f, 14.779f, 7.999f, 14.502f)
            verticalLineTo(6.5f)
            curveTo(7.999f, 6.224f, 7.775f, 6f, 7.499f, 6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ViewDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ViewDesktop, contentDescription = null)
    }
}
