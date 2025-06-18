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

public val FluentUi.Regular.StarEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.209f, 3.102f)
            curveTo(12.714f, 2.099f, 11.283f, 2.099f, 10.788f, 3.102f)
            lineTo(8.43f, 7.88f)
            lineTo(3.157f, 8.646f)
            curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
            lineTo(6.224f, 14.668f)
            lineTo(5.324f, 19.919f)
            curveTo(5.135f, 21.022f, 6.292f, 21.863f, 7.283f, 21.342f)
            lineTo(10.227f, 19.794f)
            lineTo(10.531f, 18.577f)
            curveTo(10.6f, 18.3f, 10.701f, 18.034f, 10.83f, 17.782f)
            lineTo(6.854f, 19.873f)
            lineTo(7.716f, 14.844f)
            curveTo(7.791f, 14.406f, 7.646f, 13.959f, 7.328f, 13.649f)
            lineTo(3.674f, 10.087f)
            lineTo(8.724f, 9.353f)
            curveTo(9.163f, 9.289f, 9.543f, 9.013f, 9.74f, 8.614f)
            lineTo(11.998f, 4.039f)
            lineTo(14.257f, 8.614f)
            curveTo(14.453f, 9.013f, 14.833f, 9.289f, 15.273f, 9.353f)
            lineTo(19.723f, 10f)
            curveTo(20.45f, 10.001f, 21.177f, 10.242f, 21.775f, 10.724f)
            curveTo(22.304f, 9.932f, 21.847f, 8.792f, 20.84f, 8.646f)
            lineTo(15.567f, 7.88f)
            lineTo(13.209f, 3.102f)
            close()
            moveTo(18.1f, 11.669f)
            lineTo(12.204f, 17.571f)
            curveTo(11.86f, 17.916f, 11.616f, 18.347f, 11.498f, 18.819f)
            lineTo(11.041f, 20.65f)
            curveTo(10.842f, 21.446f, 11.563f, 22.167f, 12.358f, 21.968f)
            lineTo(14.187f, 21.51f)
            curveTo(14.658f, 21.392f, 15.089f, 21.148f, 15.433f, 20.804f)
            lineTo(21.329f, 14.901f)
            curveTo(22.221f, 14.009f, 22.221f, 12.562f, 21.329f, 11.669f)
            curveTo(20.437f, 10.776f, 18.992f, 10.776f, 18.1f, 11.669f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.StarEdit, contentDescription = null)
    }
}
