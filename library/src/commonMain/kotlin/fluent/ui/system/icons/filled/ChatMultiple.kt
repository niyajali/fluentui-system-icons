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

public val FluentUi.Filled.ChatMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 3f)
            curveTo(5.358f, 3f, 2f, 6.358f, 2f, 10.5f)
            curveTo(2f, 11.634f, 2.252f, 12.71f, 2.703f, 13.675f)
            curveTo(2.401f, 14.9f, 2.14f, 16.208f, 2.022f, 16.817f)
            curveTo(1.888f, 17.506f, 2.487f, 18.11f, 3.175f, 17.987f)
            curveTo(3.798f, 17.876f, 5.153f, 17.627f, 6.411f, 17.336f)
            curveTo(7.354f, 17.763f, 8.4f, 18f, 9.5f, 18f)
            curveTo(13.642f, 18f, 17f, 14.642f, 17f, 10.5f)
            curveTo(17f, 6.358f, 13.642f, 3f, 9.5f, 3f)
            close()
            moveTo(9.462f, 19f)
            curveTo(10.8f, 20.241f, 12.592f, 21f, 14.562f, 21f)
            curveTo(15.661f, 21f, 16.707f, 20.763f, 17.649f, 20.337f)
            curveTo(18.693f, 20.581f, 19.836f, 20.825f, 20.563f, 20.977f)
            curveTo(21.455f, 21.163f, 22.235f, 20.362f, 22.03f, 19.478f)
            curveTo(21.868f, 18.774f, 21.612f, 17.682f, 21.359f, 16.674f)
            curveTo(21.81f, 15.71f, 22.062f, 14.633f, 22.062f, 13.5f)
            curveTo(22.062f, 10.217f, 19.952f, 7.427f, 17.015f, 6.411f)
            curveTo(17.365f, 7.048f, 17.636f, 7.734f, 17.815f, 8.458f)
            curveTo(19.468f, 9.526f, 20.562f, 11.385f, 20.562f, 13.5f)
            curveTo(20.562f, 14.492f, 20.322f, 15.425f, 19.897f, 16.247f)
            lineTo(19.767f, 16.5f)
            lineTo(19.837f, 16.776f)
            curveTo(20.065f, 17.671f, 20.304f, 18.676f, 20.479f, 19.426f)
            curveTo(19.705f, 19.263f, 18.661f, 19.036f, 17.74f, 18.817f)
            lineTo(17.475f, 18.754f)
            lineTo(17.232f, 18.875f)
            curveTo(16.428f, 19.275f, 15.522f, 19.5f, 14.562f, 19.5f)
            curveTo(13.502f, 19.5f, 12.507f, 19.226f, 11.643f, 18.744f)
            curveTo(10.977f, 18.911f, 10.28f, 19f, 9.562f, 19f)
            curveTo(9.528f, 19f, 9.495f, 19f, 9.462f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChatMultiple, contentDescription = null)
    }
}
