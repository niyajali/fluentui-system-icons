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

public val FluentIcons.Filled.TextGrammarLightning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextGrammarLightning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.545f, 17f)
            horizontalLineTo(3f)
            lineTo(2.883f, 17.007f)
            curveTo(2.386f, 17.065f, 2f, 17.487f, 2f, 18f)
            curveTo(2f, 18.552f, 2.448f, 19f, 3f, 19f)
            horizontalLineTo(12.083f)
            curveTo(11.957f, 18.647f, 11.961f, 18.244f, 12.14f, 17.862f)
            lineTo(12.545f, 17f)
            close()
            moveTo(13.486f, 15f)
            horizontalLineTo(3f)
            curveTo(2.448f, 15f, 2f, 14.552f, 2f, 14f)
            curveTo(2f, 13.487f, 2.386f, 13.064f, 2.883f, 13.007f)
            lineTo(3f, 13f)
            horizontalLineTo(14.425f)
            lineTo(13.486f, 15f)
            close()
            moveTo(21f, 11f)
            lineTo(21.117f, 10.993f)
            curveTo(21.614f, 10.936f, 22f, 10.513f, 22f, 10f)
            curveTo(22f, 9.448f, 21.552f, 9f, 21f, 9f)
            horizontalLineTo(3f)
            lineTo(2.883f, 9.007f)
            curveTo(2.386f, 9.064f, 2f, 9.487f, 2f, 10f)
            curveTo(2f, 10.552f, 2.448f, 11f, 3f, 11f)
            horizontalLineTo(21f)
            close()
            moveTo(21f, 5f)
            horizontalLineTo(3f)
            lineTo(2.883f, 5.007f)
            curveTo(2.386f, 5.064f, 2f, 5.487f, 2f, 6f)
            curveTo(2f, 6.552f, 2.448f, 7f, 3f, 7f)
            horizontalLineTo(21f)
            lineTo(21.117f, 6.993f)
            curveTo(21.614f, 6.936f, 22f, 6.513f, 22f, 6f)
            curveTo(22f, 5.448f, 21.552f, 5f, 21f, 5f)
            close()
            moveTo(16.317f, 12f)
            horizontalLineTo(21.144f)
            curveTo(21.527f, 12f, 21.768f, 12.412f, 21.58f, 12.745f)
            lineTo(19.749f, 16f)
            horizontalLineTo(21.245f)
            curveTo(21.89f, 16f, 22.234f, 16.759f, 21.81f, 17.244f)
            lineTo(16.986f, 22.752f)
            curveTo(16.481f, 23.328f, 15.543f, 22.837f, 15.728f, 22.094f)
            lineTo(16.499f, 19f)
            horizontalLineTo(13.497f)
            curveTo(13.13f, 19f, 12.888f, 18.619f, 13.044f, 18.287f)
            lineTo(15.864f, 12.287f)
            curveTo(15.947f, 12.112f, 16.123f, 12f, 16.317f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextGrammarLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextGrammarLightning, contentDescription = null)
    }
}
