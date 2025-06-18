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

public val FluentUi.Filled.DrinkWine: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DrinkWine",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 2f)
            curveTo(6.336f, 2f, 6f, 2.336f, 6f, 2.75f)
            verticalLineTo(9.75f)
            curveTo(6f, 12.671f, 8.179f, 15.084f, 11f, 15.451f)
            verticalLineTo(20.508f)
            lineTo(8.753f, 20.5f)
            curveTo(8.339f, 20.499f, 8.002f, 20.833f, 8f, 21.247f)
            curveTo(7.998f, 21.661f, 8.333f, 21.999f, 8.747f, 22f)
            lineTo(11.747f, 22.011f)
            lineTo(11.752f, 22.011f)
            lineTo(15.252f, 22f)
            curveTo(15.667f, 21.999f, 16.001f, 21.662f, 16f, 21.248f)
            curveTo(15.999f, 20.833f, 15.662f, 20.499f, 15.248f, 20.5f)
            lineTo(12.5f, 20.509f)
            verticalLineTo(15.455f)
            curveTo(15.598f, 15.085f, 18f, 12.448f, 18f, 9.25f)
            verticalLineTo(2.75f)
            curveTo(18f, 2.336f, 17.664f, 2f, 17.25f, 2f)
            horizontalLineTo(6.75f)
            close()
            moveTo(7.5f, 7f)
            verticalLineTo(3.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(7f)
            horizontalLineTo(7.5f)
            close()
            moveTo(15.683f, 9.707f)
            curveTo(15.614f, 10.07f, 15.493f, 10.414f, 15.327f, 10.731f)
            curveTo(15.122f, 11.125f, 14.849f, 11.477f, 14.524f, 11.773f)
            curveTo(14.209f, 12.06f, 13.845f, 12.294f, 13.445f, 12.461f)
            curveTo(13.229f, 12.552f, 13.003f, 12.622f, 12.769f, 12.671f)
            curveTo(12.499f, 12.727f, 12.234f, 12.554f, 12.178f, 12.284f)
            curveTo(12.122f, 12.013f, 12.295f, 11.748f, 12.565f, 11.692f)
            curveTo(12.736f, 11.656f, 12.902f, 11.605f, 13.059f, 11.539f)
            curveTo(13.352f, 11.416f, 13.62f, 11.245f, 13.851f, 11.034f)
            curveTo(14.09f, 10.816f, 14.29f, 10.557f, 14.441f, 10.269f)
            curveTo(14.562f, 10.036f, 14.65f, 9.785f, 14.701f, 9.519f)
            curveTo(14.753f, 9.248f, 15.015f, 9.07f, 15.286f, 9.122f)
            curveTo(15.557f, 9.174f, 15.735f, 9.436f, 15.683f, 9.707f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DrinkWinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DrinkWine, contentDescription = null)
    }
}
