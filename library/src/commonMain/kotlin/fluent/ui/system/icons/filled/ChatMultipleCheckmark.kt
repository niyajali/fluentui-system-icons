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

public val FluentUi.Filled.ChatMultipleCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatMultipleCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 10.5f)
            curveTo(2f, 6.358f, 5.358f, 3f, 9.5f, 3f)
            curveTo(13.642f, 3f, 17f, 6.358f, 17f, 10.5f)
            curveTo(17f, 14.642f, 13.642f, 18f, 9.5f, 18f)
            curveTo(8.4f, 18f, 7.354f, 17.763f, 6.411f, 17.336f)
            curveTo(5.153f, 17.627f, 3.798f, 17.876f, 3.175f, 17.987f)
            curveTo(2.487f, 18.11f, 1.888f, 17.506f, 2.022f, 16.817f)
            curveTo(2.14f, 16.208f, 2.401f, 14.9f, 2.703f, 13.675f)
            curveTo(2.252f, 12.71f, 2f, 11.634f, 2f, 10.5f)
            close()
            moveTo(13.061f, 8.998f)
            curveTo(13.336f, 8.689f, 13.308f, 8.215f, 12.998f, 7.939f)
            curveTo(12.689f, 7.664f, 12.215f, 7.692f, 11.939f, 8.002f)
            lineTo(8.442f, 11.936f)
            lineTo(7.003f, 10.636f)
            curveTo(6.696f, 10.358f, 6.221f, 10.382f, 5.944f, 10.689f)
            curveTo(5.666f, 10.997f, 5.69f, 11.471f, 5.997f, 11.749f)
            lineTo(7.997f, 13.556f)
            curveTo(8.145f, 13.691f, 8.341f, 13.76f, 8.541f, 13.749f)
            curveTo(8.741f, 13.738f, 8.928f, 13.648f, 9.061f, 13.498f)
            lineTo(13.061f, 8.998f)
            close()
            moveTo(14.562f, 21f)
            curveTo(12.592f, 21f, 10.8f, 20.241f, 9.462f, 19f)
            curveTo(9.495f, 19f, 9.528f, 19f, 9.562f, 19f)
            curveTo(10.28f, 19f, 10.977f, 18.911f, 11.643f, 18.744f)
            curveTo(12.507f, 19.226f, 13.502f, 19.5f, 14.562f, 19.5f)
            curveTo(15.522f, 19.5f, 16.428f, 19.275f, 17.232f, 18.875f)
            lineTo(17.475f, 18.754f)
            lineTo(17.74f, 18.817f)
            curveTo(18.661f, 19.036f, 19.705f, 19.263f, 20.479f, 19.426f)
            curveTo(20.304f, 18.676f, 20.065f, 17.671f, 19.837f, 16.776f)
            lineTo(19.767f, 16.5f)
            lineTo(19.897f, 16.247f)
            curveTo(20.322f, 15.425f, 20.562f, 14.492f, 20.562f, 13.5f)
            curveTo(20.562f, 11.385f, 19.468f, 9.526f, 17.815f, 8.458f)
            curveTo(17.636f, 7.734f, 17.365f, 7.048f, 17.015f, 6.411f)
            curveTo(19.952f, 7.427f, 22.062f, 10.217f, 22.062f, 13.5f)
            curveTo(22.062f, 14.633f, 21.81f, 15.71f, 21.359f, 16.674f)
            curveTo(21.612f, 17.682f, 21.868f, 18.774f, 22.03f, 19.478f)
            curveTo(22.235f, 20.362f, 21.455f, 21.163f, 20.563f, 20.977f)
            curveTo(19.836f, 20.825f, 18.693f, 20.581f, 17.649f, 20.337f)
            curveTo(16.707f, 20.763f, 15.661f, 21f, 14.562f, 21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatMultipleCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChatMultipleCheckmark, contentDescription = null)
    }
}
