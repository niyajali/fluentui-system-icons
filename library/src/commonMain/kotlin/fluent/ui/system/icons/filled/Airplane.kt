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

public val FluentUi.Filled.Airplane: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Airplane",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.989f, 11.946f)
            curveTo(21.989f, 13.046f, 21.097f, 13.938f, 19.998f, 13.938f)
            curveTo(19.978f, 13.938f, 19.959f, 13.937f, 19.939f, 13.937f)
            lineTo(15.201f, 13.797f)
            lineTo(11.747f, 20.94f)
            curveTo(11.469f, 21.514f, 10.887f, 21.879f, 10.249f, 21.879f)
            curveTo(9.738f, 21.879f, 9.323f, 21.465f, 9.323f, 20.953f)
            curveTo(9.323f, 20.917f, 9.326f, 20.88f, 9.33f, 20.843f)
            lineTo(10.192f, 13.651f)
            lineTo(6.427f, 13.541f)
            lineTo(5.937f, 14.881f)
            curveTo(5.751f, 15.39f, 5.267f, 15.728f, 4.726f, 15.728f)
            curveTo(4.228f, 15.728f, 3.825f, 15.324f, 3.825f, 14.826f)
            lineTo(3.825f, 13.35f)
            lineTo(3.015f, 13.181f)
            curveTo(2.43f, 13.059f, 2.011f, 12.544f, 2.011f, 11.946f)
            curveTo(2.011f, 11.349f, 2.43f, 10.834f, 3.015f, 10.712f)
            lineTo(3.825f, 10.544f)
            lineTo(3.825f, 9.066f)
            curveTo(3.825f, 8.607f, 4.168f, 8.228f, 4.613f, 8.172f)
            lineTo(4.726f, 8.165f)
            curveTo(5.267f, 8.165f, 5.751f, 8.503f, 5.937f, 9.011f)
            lineTo(6.428f, 10.352f)
            lineTo(10.179f, 10.242f)
            lineTo(9.33f, 3.157f)
            curveTo(9.328f, 3.139f, 9.326f, 3.121f, 9.325f, 3.102f)
            lineTo(9.323f, 3.047f)
            curveTo(9.323f, 2.536f, 9.738f, 2.121f, 10.249f, 2.121f)
            curveTo(10.834f, 2.121f, 11.372f, 2.428f, 11.672f, 2.922f)
            lineTo(11.747f, 3.061f)
            lineTo(15.15f, 10.096f)
            lineTo(19.939f, 9.956f)
            curveTo(21.039f, 9.924f, 21.956f, 10.789f, 21.988f, 11.888f)
            lineTo(21.989f, 11.946f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AirplanePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Airplane, contentDescription = null)
    }
}
