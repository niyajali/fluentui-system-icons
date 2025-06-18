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

public val FluentUi.Regular.PhoneDesktop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneDesktop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
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
            moveTo(8.254f, 10.5f)
            horizontalLineTo(3.75f)
            curveTo(3.612f, 10.5f, 3.5f, 10.612f, 3.5f, 10.75f)
            verticalLineTo(20.25f)
            curveTo(3.5f, 20.388f, 3.612f, 20.5f, 3.75f, 20.5f)
            horizontalLineTo(8.254f)
            curveTo(8.393f, 20.5f, 8.504f, 20.388f, 8.504f, 20.25f)
            verticalLineTo(10.75f)
            curveTo(8.504f, 10.612f, 8.393f, 10.5f, 8.254f, 10.5f)
            close()
            moveTo(6.249f, 18f)
            curveTo(6.664f, 18f, 6.999f, 18.336f, 6.999f, 18.75f)
            curveTo(6.999f, 19.13f, 6.717f, 19.444f, 6.351f, 19.493f)
            lineTo(6.249f, 19.5f)
            horizontalLineTo(5.749f)
            curveTo(5.335f, 19.5f, 4.999f, 19.164f, 4.999f, 18.75f)
            curveTo(4.999f, 18.37f, 5.282f, 18.056f, 5.648f, 18.007f)
            lineTo(5.749f, 18f)
            horizontalLineTo(6.249f)
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
            verticalLineTo(14f)
            horizontalLineTo(19.749f)
            curveTo(20.129f, 14f, 20.443f, 13.718f, 20.493f, 13.352f)
            lineTo(20.499f, 13.25f)
            verticalLineTo(4.25f)
            curveTo(20.499f, 3.836f, 20.164f, 3.5f, 19.749f, 3.5f)
            horizontalLineTo(6.249f)
            curveTo(5.87f, 3.5f, 5.556f, 3.782f, 5.506f, 4.148f)
            lineTo(5.499f, 4.25f)
            verticalLineTo(8f)
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
        Image(imageVector = FluentUi.Regular.PhoneDesktop, contentDescription = null)
    }
}
