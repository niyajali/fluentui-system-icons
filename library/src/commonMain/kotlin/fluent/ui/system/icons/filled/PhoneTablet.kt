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

public val FluentUi.Filled.PhoneTablet: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneTablet",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.254f, 7f)
            curveTo(9.221f, 7f, 10.004f, 7.783f, 10.004f, 8.75f)
            verticalLineTo(18.25f)
            curveTo(10.004f, 19.216f, 9.221f, 20f, 8.254f, 20f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 20f, 2f, 19.216f, 2f, 18.25f)
            verticalLineTo(8.75f)
            curveTo(2f, 7.783f, 2.783f, 7f, 3.75f, 7f)
            horizontalLineTo(8.254f)
            close()
            moveTo(6.252f, 16.495f)
            horizontalLineTo(5.752f)
            lineTo(5.65f, 16.502f)
            curveTo(5.284f, 16.552f, 5.002f, 16.865f, 5.002f, 17.245f)
            curveTo(5.002f, 17.625f, 5.284f, 17.939f, 5.65f, 17.988f)
            lineTo(5.752f, 17.995f)
            horizontalLineTo(6.252f)
            lineTo(6.354f, 17.988f)
            curveTo(6.72f, 17.939f, 7.002f, 17.625f, 7.002f, 17.245f)
            curveTo(7.002f, 16.865f, 6.72f, 16.552f, 6.354f, 16.502f)
            lineTo(6.252f, 16.495f)
            close()
            moveTo(19.749f, 4f)
            curveTo(20.94f, 4f, 21.915f, 4.925f, 21.994f, 6.096f)
            lineTo(21.999f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(21.999f, 15.941f, 21.074f, 16.916f, 19.903f, 16.995f)
            lineTo(19.749f, 17f)
            horizontalLineTo(10.999f)
            lineTo(10.999f, 8.5f)
            curveTo(10.999f, 7.175f, 9.968f, 6.09f, 8.664f, 6.005f)
            lineTo(8.499f, 6f)
            lineTo(6.013f, 6f)
            curveTo(6.131f, 4.929f, 7.002f, 4.084f, 8.085f, 4.006f)
            lineTo(8.249f, 4f)
            horizontalLineTo(19.749f)
            close()
            moveTo(15.249f, 13.5f)
            horizontalLineTo(12.749f)
            curveTo(12.335f, 13.5f, 11.999f, 13.836f, 11.999f, 14.25f)
            curveTo(11.999f, 14.63f, 12.281f, 14.943f, 12.648f, 14.993f)
            lineTo(12.749f, 15f)
            horizontalLineTo(15.249f)
            curveTo(15.664f, 15f, 15.999f, 14.664f, 15.999f, 14.25f)
            curveTo(15.999f, 13.87f, 15.717f, 13.557f, 15.351f, 13.507f)
            lineTo(15.249f, 13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneTabletPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhoneTablet, contentDescription = null)
    }
}
