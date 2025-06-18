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

public val FluentUi.Regular.LocalLanguage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocalLanguage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.34f, 6.372f)
            lineTo(9.389f, 6.477f)
            lineTo(14.949f, 20.977f)
            curveTo(15.097f, 21.362f, 14.91f, 21.797f, 14.532f, 21.948f)
            curveTo(14.185f, 22.087f, 13.798f, 21.938f, 13.622f, 21.615f)
            lineTo(13.579f, 21.523f)
            lineTo(12.146f, 17.786f)
            lineTo(5.059f, 17.786f)
            lineTo(4.965f, 17.78f)
            lineTo(3.418f, 21.54f)
            curveTo(3.261f, 21.922f, 2.83f, 22.101f, 2.456f, 21.941f)
            curveTo(2.112f, 21.795f, 1.935f, 21.413f, 2.029f, 21.056f)
            lineTo(2.062f, 20.96f)
            lineTo(8.026f, 6.46f)
            curveTo(8.266f, 5.875f, 9.049f, 5.85f, 9.34f, 6.372f)
            close()
            moveTo(18.746f, 2.003f)
            curveTo(19.125f, 2.003f, 19.439f, 2.285f, 19.489f, 2.651f)
            lineTo(19.496f, 2.753f)
            lineTo(19.495f, 7.499f)
            lineTo(21.246f, 7.5f)
            curveTo(21.625f, 7.5f, 21.939f, 7.782f, 21.989f, 8.148f)
            lineTo(21.996f, 8.25f)
            curveTo(21.996f, 8.629f, 21.713f, 8.943f, 21.347f, 8.993f)
            lineTo(21.246f, 9f)
            lineTo(19.495f, 8.999f)
            lineTo(19.496f, 16.25f)
            curveTo(19.496f, 16.629f, 19.213f, 16.943f, 18.847f, 16.993f)
            lineTo(18.746f, 17f)
            curveTo(18.366f, 17f, 18.052f, 16.718f, 18.003f, 16.351f)
            lineTo(17.996f, 16.25f)
            verticalLineTo(2.753f)
            curveTo(17.996f, 2.339f, 18.331f, 2.003f, 18.746f, 2.003f)
            close()
            moveTo(8.811f, 8.747f)
            lineTo(5.649f, 16.286f)
            horizontalLineTo(11.759f)
            lineTo(8.811f, 8.747f)
            close()
            moveTo(10.748f, 2.003f)
            horizontalLineTo(16.246f)
            curveTo(16.625f, 2.003f, 16.939f, 2.285f, 16.989f, 2.651f)
            lineTo(16.996f, 2.753f)
            verticalLineTo(5.757f)
            curveTo(16.996f, 8.101f, 15.095f, 10.002f, 12.75f, 10.002f)
            curveTo(12.336f, 10.002f, 12f, 9.666f, 12f, 9.252f)
            curveTo(12f, 8.838f, 12.336f, 8.502f, 12.75f, 8.502f)
            curveTo(14.21f, 8.502f, 15.404f, 7.362f, 15.491f, 5.924f)
            lineTo(15.495f, 5.757f)
            verticalLineTo(3.503f)
            horizontalLineTo(10.748f)
            curveTo(10.333f, 3.503f, 9.998f, 3.167f, 9.998f, 2.753f)
            curveTo(9.998f, 2.373f, 10.28f, 2.059f, 10.646f, 2.01f)
            lineTo(10.748f, 2.003f)
            horizontalLineTo(16.246f)
            horizontalLineTo(10.748f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocalLanguagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.LocalLanguage, contentDescription = null)
    }
}
