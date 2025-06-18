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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.QuizNew: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.QuizNew",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.517f, 8.998f)
            lineTo(10f, 7.73f)
            lineTo(9.481f, 8.998f)
            horizontalLineTo(10.517f)
            close()
            moveTo(5.75f, 3f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
            curveTo(11f, 16.614f, 11.177f, 15.77f, 11.498f, 15f)
            lineTo(5.75f, 15f)
            curveTo(5.336f, 15f, 5f, 14.664f, 5f, 14.25f)
            curveTo(5f, 13.836f, 5.336f, 13.5f, 5.75f, 13.5f)
            lineTo(12.376f, 13.5f)
            curveTo(13.566f, 11.978f, 15.419f, 11f, 17.5f, 11f)
            curveTo(18.789f, 11f, 19.99f, 11.375f, 21f, 12.022f)
            verticalLineTo(5.75f)
            curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
            horizontalLineTo(5.75f)
            close()
            moveTo(9.25f, 18.5f)
            lineTo(5.75f, 18.5f)
            curveTo(5.336f, 18.5f, 5f, 18.164f, 5f, 17.75f)
            curveTo(5f, 17.336f, 5.336f, 17f, 5.75f, 17f)
            lineTo(9.25f, 17f)
            curveTo(9.664f, 17f, 10f, 17.336f, 10f, 17.75f)
            curveTo(10f, 18.164f, 9.664f, 18.5f, 9.25f, 18.5f)
            close()
            moveTo(10.694f, 5.464f)
            lineTo(12.942f, 10.967f)
            curveTo(13.099f, 11.35f, 12.915f, 11.788f, 12.531f, 11.944f)
            curveTo(12.148f, 12.101f, 11.71f, 11.917f, 11.553f, 11.534f)
            lineTo(11.13f, 10.498f)
            horizontalLineTo(8.868f)
            lineTo(8.444f, 11.534f)
            curveTo(8.287f, 11.917f, 7.85f, 12.101f, 7.466f, 11.944f)
            curveTo(7.083f, 11.788f, 6.899f, 11.35f, 7.056f, 10.966f)
            lineTo(9.306f, 5.464f)
            curveTo(9.421f, 5.182f, 9.696f, 4.997f, 10f, 4.997f)
            curveTo(10.305f, 4.997f, 10.579f, 5.182f, 10.694f, 5.464f)
            close()
            moveTo(16.5f, 5.747f)
            verticalLineTo(6.997f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 6.997f, 18.5f, 7.333f, 18.5f, 7.747f)
            curveTo(18.5f, 8.162f, 18.164f, 8.497f, 17.75f, 8.497f)
            horizontalLineTo(16.5f)
            verticalLineTo(9.747f)
            curveTo(16.5f, 10.162f, 16.164f, 10.497f, 15.75f, 10.497f)
            curveTo(15.336f, 10.497f, 15f, 10.162f, 15f, 9.747f)
            verticalLineTo(8.497f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 8.497f, 13f, 8.162f, 13f, 7.747f)
            curveTo(13f, 7.333f, 13.336f, 6.997f, 13.75f, 6.997f)
            horizontalLineTo(15f)
            verticalLineTo(5.747f)
            curveTo(15f, 5.333f, 15.336f, 4.997f, 15.75f, 4.997f)
            curveTo(16.164f, 4.997f, 16.5f, 5.333f, 16.5f, 5.747f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.503f)
            curveTo(20.779f, 17f, 21.003f, 17.224f, 21.003f, 17.5f)
            curveTo(21.003f, 17.776f, 20.779f, 18f, 20.503f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun QuizNewPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.QuizNew, contentDescription = null)
    }
}
