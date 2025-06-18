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

public val FluentUi.Regular.ColorLine: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorLine",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.381f, 14.003f)
            curveTo(3.056f, 14.065f, 2f, 15.159f, 2f, 16.5f)
            verticalLineTo(19.5f)
            curveTo(2f, 20.881f, 3.119f, 22f, 4.5f, 22f)
            horizontalLineTo(19.5f)
            curveTo(20.881f, 22f, 22f, 20.881f, 22f, 19.5f)
            verticalLineTo(16.5f)
            curveTo(22f, 15.119f, 20.881f, 14f, 19.5f, 14f)
            horizontalLineTo(13.546f)
            lineTo(12.23f, 15.314f)
            curveTo(12.165f, 15.379f, 12.097f, 15.441f, 12.027f, 15.5f)
            horizontalLineTo(19.5f)
            curveTo(20.052f, 15.5f, 20.5f, 15.948f, 20.5f, 16.5f)
            verticalLineTo(19.5f)
            curveTo(20.5f, 20.052f, 20.052f, 20.5f, 19.5f, 20.5f)
            horizontalLineTo(4.5f)
            curveTo(3.948f, 20.5f, 3.5f, 20.052f, 3.5f, 19.5f)
            verticalLineTo(16.5f)
            curveTo(3.5f, 16.128f, 3.703f, 15.804f, 4.004f, 15.631f)
            curveTo(3.988f, 15.381f, 4.019f, 15.128f, 4.096f, 14.887f)
            lineTo(4.381f, 14.003f)
            close()
            moveTo(18.648f, 2.944f)
            curveTo(19.904f, 4.201f, 19.904f, 6.239f, 18.646f, 7.495f)
            lineTo(11.523f, 14.606f)
            curveTo(11.26f, 14.869f, 10.936f, 15.062f, 10.58f, 15.169f)
            lineTo(6.287f, 16.458f)
            curveTo(5.759f, 16.616f, 5.201f, 16.316f, 5.042f, 15.787f)
            curveTo(4.984f, 15.593f, 4.986f, 15.386f, 5.048f, 15.193f)
            lineTo(6.41f, 10.965f)
            curveTo(6.519f, 10.625f, 6.708f, 10.315f, 6.962f, 10.063f)
            lineTo(14.094f, 2.941f)
            curveTo(15.353f, 1.685f, 17.391f, 1.686f, 18.648f, 2.944f)
            close()
            moveTo(15.154f, 4.003f)
            lineTo(8.021f, 11.124f)
            curveTo(7.937f, 11.208f, 7.874f, 11.311f, 7.837f, 11.425f)
            lineTo(6.768f, 14.747f)
            lineTo(10.149f, 13.732f)
            curveTo(10.268f, 13.697f, 10.376f, 13.632f, 10.464f, 13.545f)
            lineTo(17.586f, 6.435f)
            curveTo(18.257f, 5.763f, 18.258f, 4.676f, 17.587f, 4.004f)
            curveTo(16.915f, 3.332f, 15.826f, 3.332f, 15.154f, 4.003f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColorLinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ColorLine, contentDescription = null)
    }
}
