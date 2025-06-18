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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.Mic: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Mic",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 2f)
            curveTo(19.314f, 2f, 22f, 4.686f, 22f, 8f)
            verticalLineTo(16f)
            curveTo(22f, 19.314f, 19.314f, 22f, 16f, 22f)
            curveTo(12.686f, 22f, 10f, 19.314f, 10f, 16f)
            verticalLineTo(8f)
            curveTo(10f, 4.686f, 12.686f, 2f, 16f, 2f)
            close()
            moveTo(21f, 16f)
            verticalLineTo(8f)
            curveTo(21f, 5.239f, 18.761f, 3f, 16f, 3f)
            curveTo(13.239f, 3f, 11f, 5.239f, 11f, 8f)
            verticalLineTo(16f)
            curveTo(11f, 18.761f, 13.239f, 21f, 16f, 21f)
            curveTo(18.761f, 21f, 21f, 18.761f, 21f, 16f)
            close()
            moveTo(6.5f, 15f)
            curveTo(6.776f, 15f, 7f, 15.224f, 7f, 15.5f)
            verticalLineTo(16f)
            curveTo(7f, 20.971f, 11.029f, 25f, 16f, 25f)
            curveTo(20.971f, 25f, 25f, 20.971f, 25f, 16f)
            verticalLineTo(15.5f)
            curveTo(25f, 15.224f, 25.224f, 15f, 25.5f, 15f)
            curveTo(25.776f, 15f, 26f, 15.224f, 26f, 15.5f)
            verticalLineTo(16f)
            curveTo(26f, 21.355f, 21.791f, 25.727f, 16.5f, 25.988f)
            verticalLineTo(29.5f)
            curveTo(16.5f, 29.776f, 16.276f, 30f, 16f, 30f)
            curveTo(15.724f, 30f, 15.5f, 29.776f, 15.5f, 29.5f)
            verticalLineTo(25.988f)
            curveTo(10.209f, 25.727f, 6f, 21.355f, 6f, 16f)
            verticalLineTo(15.5f)
            curveTo(6f, 15.224f, 6.224f, 15f, 6.5f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Mic, contentDescription = null)
    }
}
