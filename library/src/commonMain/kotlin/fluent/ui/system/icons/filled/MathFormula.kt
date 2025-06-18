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

public val FluentUi.Filled.MathFormula: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MathFormula",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.187f, 4.14f)
            curveTo(11.223f, 3.417f, 9.842f, 4.069f, 9.789f, 5.274f)
            lineTo(9.712f, 7f)
            horizontalLineTo(12f)
            curveTo(12.552f, 7f, 13f, 7.448f, 13f, 8f)
            curveTo(13f, 8.552f, 12.552f, 9f, 12f, 9f)
            horizontalLineTo(9.623f)
            lineTo(9.23f, 17.85f)
            curveTo(9.1f, 20.781f, 5.637f, 22.261f, 3.429f, 20.329f)
            lineTo(3.342f, 20.253f)
            curveTo(2.926f, 19.889f, 2.884f, 19.257f, 3.247f, 18.841f)
            curveTo(3.611f, 18.426f, 4.243f, 18.384f, 4.659f, 18.747f)
            lineTo(4.746f, 18.823f)
            curveTo(5.692f, 19.652f, 7.176f, 19.017f, 7.232f, 17.761f)
            lineTo(7.621f, 9f)
            horizontalLineTo(6f)
            curveTo(5.448f, 9f, 5f, 8.552f, 5f, 8f)
            curveTo(5f, 7.448f, 5.448f, 7f, 6f, 7f)
            horizontalLineTo(7.71f)
            lineTo(7.791f, 5.185f)
            curveTo(7.916f, 2.375f, 11.137f, 0.853f, 13.387f, 2.54f)
            lineTo(13.6f, 2.7f)
            curveTo(14.042f, 3.031f, 14.131f, 3.658f, 13.8f, 4.1f)
            curveTo(13.469f, 4.542f, 12.842f, 4.631f, 12.4f, 4.3f)
            lineTo(12.187f, 4.14f)
            close()
            moveTo(13.082f, 13.046f)
            curveTo(13.335f, 12.907f, 13.653f, 13.01f, 13.775f, 13.271f)
            lineTo(14.588f, 14.998f)
            lineTo(11.293f, 18.293f)
            curveTo(10.902f, 18.683f, 10.902f, 19.316f, 11.293f, 19.707f)
            curveTo(11.683f, 20.098f, 12.316f, 20.098f, 12.707f, 19.707f)
            lineTo(15.493f, 16.921f)
            lineTo(16.273f, 18.579f)
            curveTo(16.968f, 20.055f, 18.867f, 20.481f, 20.126f, 19.442f)
            lineTo(20.636f, 19.021f)
            curveTo(21.062f, 18.67f, 21.123f, 18.04f, 20.771f, 17.614f)
            curveTo(20.42f, 17.188f, 19.79f, 17.127f, 19.364f, 17.479f)
            lineTo(18.853f, 17.9f)
            curveTo(18.601f, 18.107f, 18.222f, 18.022f, 18.083f, 17.727f)
            lineTo(16.996f, 15.418f)
            lineTo(19.707f, 12.707f)
            curveTo(20.098f, 12.316f, 20.098f, 11.683f, 19.707f, 11.293f)
            curveTo(19.316f, 10.902f, 18.683f, 10.902f, 18.293f, 11.293f)
            lineTo(16.091f, 13.495f)
            lineTo(15.585f, 12.42f)
            curveTo(14.971f, 11.114f, 13.382f, 10.598f, 12.118f, 11.294f)
            lineTo(11.518f, 11.624f)
            curveTo(11.034f, 11.89f, 10.858f, 12.498f, 11.124f, 12.982f)
            curveTo(11.39f, 13.466f, 11.998f, 13.642f, 12.482f, 13.376f)
            lineTo(13.082f, 13.046f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MathFormulaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MathFormula, contentDescription = null)
    }
}
