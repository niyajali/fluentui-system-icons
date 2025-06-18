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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.PhoneDesktop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneDesktop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.254f, 9f)
            curveTo(9.221f, 9f, 10.004f, 9.783f, 10.004f, 10.75f)
            verticalLineTo(20.25f)
            curveTo(10.004f, 21.216f, 9.221f, 22f, 8.254f, 22f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 22f, 2f, 21.216f, 2f, 20.25f)
            verticalLineTo(10.75f)
            curveTo(2f, 9.783f, 2.783f, 9f, 3.75f, 9f)
            horizontalLineTo(8.254f)
            close()
            moveTo(6.252f, 18.495f)
            horizontalLineTo(5.752f)
            lineTo(5.65f, 18.502f)
            curveTo(5.284f, 18.552f, 5.002f, 18.865f, 5.002f, 19.245f)
            curveTo(5.002f, 19.625f, 5.284f, 19.939f, 5.65f, 19.988f)
            lineTo(5.752f, 19.995f)
            horizontalLineTo(6.252f)
            lineTo(6.354f, 19.988f)
            curveTo(6.72f, 19.939f, 7.002f, 19.625f, 7.002f, 19.245f)
            curveTo(7.002f, 18.865f, 6.72f, 18.552f, 6.354f, 18.502f)
            lineTo(6.252f, 18.495f)
            close()
            moveTo(19.749f, 2f)
            curveTo(20.94f, 2f, 21.915f, 2.925f, 21.994f, 4.096f)
            lineTo(21.999f, 4.25f)
            verticalLineTo(13.25f)
            curveTo(21.999f, 14.441f, 21.074f, 15.416f, 19.903f, 15.495f)
            lineTo(19.749f, 15.5f)
            horizontalLineTo(16.003f)
            verticalLineTo(17.5f)
            horizontalLineTo(17.249f)
            curveTo(17.664f, 17.5f, 17.999f, 17.836f, 17.999f, 18.25f)
            curveTo(17.999f, 18.63f, 17.717f, 18.944f, 17.351f, 18.993f)
            lineTo(17.249f, 19f)
            horizontalLineTo(10.999f)
            verticalLineTo(17.5f)
            horizontalLineTo(14.503f)
            verticalLineTo(15.5f)
            horizontalLineTo(10.999f)
            verticalLineTo(10.5f)
            curveTo(10.999f, 9.175f, 9.968f, 8.09f, 8.664f, 8.005f)
            lineTo(8.499f, 8f)
            horizontalLineTo(3.999f)
            verticalLineTo(4.25f)
            curveTo(3.999f, 3.059f, 4.925f, 2.084f, 6.095f, 2.005f)
            lineTo(6.249f, 2f)
            horizontalLineTo(19.749f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhoneDesktop, contentDescription = null)
    }
}
