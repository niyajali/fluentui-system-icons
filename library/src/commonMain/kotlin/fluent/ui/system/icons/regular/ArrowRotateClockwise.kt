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

public val FluentUi.Regular.ArrowRotateClockwise: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRotateClockwise",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3f)
            curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
            curveTo(21f, 15.078f, 19.441f, 17.865f, 16.977f, 19.501f)
            lineTo(18.75f, 19.5f)
            curveTo(19.164f, 19.5f, 19.5f, 19.836f, 19.5f, 20.25f)
            curveTo(19.5f, 20.63f, 19.218f, 20.944f, 18.852f, 20.993f)
            lineTo(18.75f, 21f)
            horizontalLineTo(14.75f)
            curveTo(14.37f, 21f, 14.057f, 20.718f, 14.007f, 20.352f)
            lineTo(14f, 20.25f)
            verticalLineTo(16.25f)
            curveTo(14f, 15.836f, 14.336f, 15.5f, 14.75f, 15.5f)
            curveTo(15.13f, 15.5f, 15.443f, 15.782f, 15.493f, 16.148f)
            lineTo(15.5f, 16.25f)
            lineTo(15.501f, 18.635f)
            curveTo(17.924f, 17.356f, 19.5f, 14.825f, 19.5f, 12f)
            curveTo(19.5f, 7.858f, 16.142f, 4.5f, 12f, 4.5f)
            curveTo(7.858f, 4.5f, 4.5f, 7.858f, 4.5f, 12f)
            curveTo(4.5f, 12.414f, 4.164f, 12.75f, 3.75f, 12.75f)
            curveTo(3.336f, 12.75f, 3f, 12.414f, 3f, 12f)
            curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
            close()
            moveTo(12f, 9.25f)
            curveTo(13.519f, 9.25f, 14.75f, 10.481f, 14.75f, 12f)
            curveTo(14.75f, 13.519f, 13.519f, 14.75f, 12f, 14.75f)
            curveTo(10.481f, 14.75f, 9.25f, 13.519f, 9.25f, 12f)
            curveTo(9.25f, 10.481f, 10.481f, 9.25f, 12f, 9.25f)
            close()
            moveTo(12f, 10.75f)
            curveTo(11.31f, 10.75f, 10.75f, 11.31f, 10.75f, 12f)
            curveTo(10.75f, 12.69f, 11.31f, 13.25f, 12f, 13.25f)
            curveTo(12.69f, 13.25f, 13.25f, 12.69f, 13.25f, 12f)
            curveTo(13.25f, 11.31f, 12.69f, 10.75f, 12f, 10.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowRotateClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowRotateClockwise, contentDescription = null)
    }
}
