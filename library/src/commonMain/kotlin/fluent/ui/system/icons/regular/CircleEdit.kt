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

public val FluentUi.Regular.CircleEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 16.457f, 6.931f, 20.113f, 11.295f, 20.471f)
            lineTo(11.061f, 21.407f)
            curveTo(11.015f, 21.591f, 10.995f, 21.773f, 10.997f, 21.95f)
            curveTo(5.945f, 21.447f, 2f, 17.184f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.271f, 2f, 21.589f, 6.077f, 21.972f, 11.25f)
            curveTo(21.57f, 11.083f, 21.142f, 11f, 20.715f, 11f)
            horizontalLineTo(20.713f)
            curveTo(20.623f, 11f, 20.533f, 11.004f, 20.443f, 11.011f)
            curveTo(19.953f, 6.783f, 16.36f, 3.5f, 12f, 3.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.715f, 12f)
            horizontalLineTo(20.713f)
            curveTo(20.128f, 12f, 19.544f, 12.223f, 19.098f, 12.67f)
            lineTo(13.196f, 18.572f)
            curveTo(12.851f, 18.916f, 12.607f, 19.347f, 12.489f, 19.819f)
            lineTo(12.031f, 21.65f)
            curveTo(11.833f, 22.446f, 12.554f, 23.167f, 13.35f, 22.968f)
            lineTo(15.18f, 22.511f)
            curveTo(15.653f, 22.393f, 16.084f, 22.149f, 16.428f, 21.804f)
            lineTo(22.33f, 15.902f)
            curveTo(23.223f, 15.009f, 23.223f, 13.562f, 22.33f, 12.67f)
            curveTo(21.884f, 12.223f, 21.3f, 12f, 20.715f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CircleEdit, contentDescription = null)
    }
}
