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

public val FluentUi.Filled.DesktopArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.5f)
            curveTo(23f, 9.538f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 9.538f, 12f, 6.5f)
            curveTo(12f, 3.462f, 14.462f, 1f, 17.5f, 1f)
            curveTo(20.538f, 1f, 23f, 3.462f, 23f, 6.5f)
            close()
            moveTo(14.5f, 6f)
            curveTo(14.224f, 6f, 14f, 6.224f, 14f, 6.5f)
            curveTo(14f, 6.776f, 14.224f, 7f, 14.5f, 7f)
            lineTo(19.293f, 7f)
            lineTo(17.646f, 8.646f)
            curveTo(17.451f, 8.842f, 17.451f, 9.158f, 17.646f, 9.354f)
            curveTo(17.842f, 9.549f, 18.158f, 9.549f, 18.354f, 9.354f)
            lineTo(20.854f, 6.854f)
            curveTo(21.049f, 6.658f, 21.049f, 6.342f, 20.854f, 6.146f)
            lineTo(18.354f, 3.646f)
            curveTo(18.158f, 3.451f, 17.842f, 3.451f, 17.646f, 3.646f)
            curveTo(17.451f, 3.842f, 17.451f, 4.158f, 17.646f, 4.354f)
            lineTo(19.293f, 6f)
            lineTo(14.5f, 6f)
            close()
            moveTo(17.5f, 13f)
            curveTo(19.246f, 13f, 20.831f, 12.312f, 21.999f, 11.191f)
            verticalLineTo(15.752f)
            curveTo(21.999f, 16.943f, 21.074f, 17.917f, 19.903f, 17.997f)
            lineTo(19.749f, 18.002f)
            lineTo(15.499f, 18.002f)
            verticalLineTo(20.5f)
            lineTo(17.25f, 20.5f)
            curveTo(17.664f, 20.5f, 18f, 20.836f, 18f, 21.25f)
            curveTo(18f, 21.63f, 17.718f, 21.944f, 17.352f, 21.993f)
            lineTo(17.25f, 22f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 22f, 6f, 21.664f, 6f, 21.25f)
            curveTo(6f, 20.87f, 6.282f, 20.556f, 6.648f, 20.507f)
            lineTo(6.75f, 20.5f)
            lineTo(8.499f, 20.5f)
            verticalLineTo(18.002f)
            lineTo(4.25f, 18.002f)
            curveTo(3.059f, 18.002f, 2.084f, 17.077f, 2.005f, 15.906f)
            lineTo(2f, 15.752f)
            verticalLineTo(5.25f)
            curveTo(2f, 4.059f, 2.925f, 3.084f, 4.096f, 3.005f)
            lineTo(4.25f, 3f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 4.01f, 11f, 5.211f, 11f, 6.5f)
            curveTo(11f, 10.09f, 13.91f, 13f, 17.5f, 13f)
            close()
            moveTo(13.998f, 18.002f)
            horizontalLineTo(9.998f)
            lineTo(9.999f, 20.5f)
            horizontalLineTo(13.999f)
            lineTo(13.998f, 18.002f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DesktopArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DesktopArrowRight, contentDescription = null)
    }
}
