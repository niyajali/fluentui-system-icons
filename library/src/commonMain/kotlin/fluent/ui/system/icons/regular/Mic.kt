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

public val FluentUi.Regular.Mic: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Mic",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.25f, 11f)
            curveTo(18.63f, 11f, 18.944f, 11.282f, 18.993f, 11.648f)
            lineTo(19f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(19f, 15.809f, 16.245f, 18.725f, 12.751f, 18.982f)
            lineTo(12.75f, 21.25f)
            curveTo(12.75f, 21.664f, 12.414f, 22f, 12f, 22f)
            curveTo(11.62f, 22f, 11.307f, 21.718f, 11.257f, 21.352f)
            lineTo(11.25f, 21.25f)
            lineTo(11.25f, 18.982f)
            curveTo(7.833f, 18.732f, 5.123f, 15.938f, 5.004f, 12.486f)
            lineTo(5f, 12.25f)
            verticalLineTo(11.75f)
            curveTo(5f, 11.336f, 5.336f, 11f, 5.75f, 11f)
            curveTo(6.13f, 11f, 6.443f, 11.282f, 6.493f, 11.648f)
            lineTo(6.5f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(6.5f, 15.077f, 8.734f, 17.382f, 11.534f, 17.496f)
            lineTo(11.75f, 17.5f)
            horizontalLineTo(12.25f)
            curveTo(15.077f, 17.5f, 17.382f, 15.266f, 17.496f, 12.466f)
            lineTo(17.5f, 12.25f)
            verticalLineTo(11.75f)
            curveTo(17.5f, 11.336f, 17.836f, 11f, 18.25f, 11f)
            close()
            moveTo(12f, 2f)
            curveTo(14.209f, 2f, 16f, 3.791f, 16f, 6f)
            verticalLineTo(12f)
            curveTo(16f, 14.209f, 14.209f, 16f, 12f, 16f)
            curveTo(9.791f, 16f, 8f, 14.209f, 8f, 12f)
            verticalLineTo(6f)
            curveTo(8f, 3.791f, 9.791f, 2f, 12f, 2f)
            close()
            moveTo(12f, 3.5f)
            curveTo(10.619f, 3.5f, 9.5f, 4.619f, 9.5f, 6f)
            verticalLineTo(12f)
            curveTo(9.5f, 13.381f, 10.619f, 14.5f, 12f, 14.5f)
            curveTo(13.381f, 14.5f, 14.5f, 13.381f, 14.5f, 12f)
            verticalLineTo(6f)
            curveTo(14.5f, 4.619f, 13.381f, 3.5f, 12f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Mic, contentDescription = null)
    }
}
