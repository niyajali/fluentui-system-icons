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
package fluent.ui.system.icons.light

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

public val FluentUi.Light.Chat: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Chat",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 1.999f)
            curveTo(8.268f, 1.999f, 2f, 8.267f, 2f, 15.999f)
            curveTo(2f, 18.369f, 2.59f, 20.604f, 3.631f, 22.562f)
            lineTo(2.059f, 28.089f)
            curveTo(1.738f, 29.219f, 2.782f, 30.263f, 3.912f, 29.942f)
            lineTo(9.44f, 28.37f)
            curveTo(11.398f, 29.41f, 13.631f, 29.999f, 16f, 29.999f)
            curveTo(23.732f, 29.999f, 30f, 23.731f, 30f, 15.999f)
            curveTo(30f, 8.267f, 23.732f, 1.999f, 16f, 1.999f)
            close()
            moveTo(16f, 28.999f)
            curveTo(13.877f, 28.999f, 11.771f, 28.477f, 9.91f, 27.487f)
            lineTo(9.555f, 27.298f)
            lineTo(3.639f, 28.981f)
            curveTo(3.59f, 28.995f, 3.542f, 29.002f, 3.495f, 29.002f)
            curveTo(3.344f, 29.002f, 3.197f, 28.926f, 3.1f, 28.799f)
            curveTo(3.033f, 28.71f, 2.964f, 28.562f, 3.021f, 28.363f)
            lineTo(4.703f, 22.448f)
            lineTo(4.514f, 22.093f)
            curveTo(3.524f, 20.231f, 3f, 18.123f, 3f, 16f)
            curveTo(3f, 8.832f, 8.832f, 3f, 16f, 3f)
            curveTo(23.168f, 3f, 29f, 8.832f, 29f, 16f)
            curveTo(29f, 23.168f, 23.168f, 28.999f, 16f, 28.999f)
            close()
            moveTo(21.5f, 13f)
            horizontalLineTo(10.5f)
            curveTo(10.224f, 13f, 10f, 12.776f, 10f, 12.5f)
            curveTo(10f, 12.224f, 10.224f, 12f, 10.5f, 12f)
            horizontalLineTo(21.5f)
            curveTo(21.776f, 12f, 22f, 12.224f, 22f, 12.5f)
            curveTo(22f, 12.776f, 21.776f, 13f, 21.5f, 13f)
            close()
            moveTo(17.5f, 19f)
            horizontalLineTo(10.5f)
            curveTo(10.224f, 19f, 10f, 18.776f, 10f, 18.5f)
            curveTo(10f, 18.224f, 10.224f, 18f, 10.5f, 18f)
            horizontalLineTo(17.5f)
            curveTo(17.776f, 18f, 18f, 18.224f, 18f, 18.5f)
            curveTo(18f, 18.776f, 17.776f, 19f, 17.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Chat, contentDescription = null)
    }
}
