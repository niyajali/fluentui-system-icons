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

public val FluentUi.Light.ReadAloud: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ReadAloud",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.646f, 3.311f)
            curveTo(19.75f, 3.055f, 20.042f, 2.933f, 20.298f, 3.037f)
            curveTo(25.402f, 5.125f, 29f, 10.142f, 29f, 16f)
            curveTo(29f, 16.525f, 28.971f, 17.044f, 28.915f, 17.555f)
            curveTo(28.884f, 17.829f, 28.637f, 18.027f, 28.363f, 17.997f)
            curveTo(28.088f, 17.967f, 27.89f, 17.719f, 27.921f, 17.445f)
            curveTo(27.973f, 16.971f, 28f, 16.489f, 28f, 16f)
            curveTo(28f, 10.562f, 24.661f, 5.903f, 19.919f, 3.963f)
            curveTo(19.663f, 3.858f, 19.541f, 3.566f, 19.646f, 3.311f)
            close()
            moveTo(13.437f, 4.648f)
            curveTo(13.112f, 3.784f, 11.89f, 3.784f, 11.565f, 4.648f)
            lineTo(3.032f, 27.322f)
            curveTo(2.935f, 27.58f, 3.066f, 27.868f, 3.324f, 27.966f)
            curveTo(3.582f, 28.063f, 3.871f, 27.932f, 3.968f, 27.674f)
            lineTo(6.856f, 20f)
            horizontalLineTo(18.146f)
            lineTo(21.034f, 27.674f)
            curveTo(21.131f, 27.932f, 21.419f, 28.063f, 21.678f, 27.966f)
            curveTo(21.936f, 27.868f, 22.067f, 27.58f, 21.969f, 27.322f)
            lineTo(13.437f, 4.648f)
            close()
            moveTo(17.769f, 19f)
            horizontalLineTo(7.232f)
            lineTo(12.501f, 5f)
            lineTo(17.769f, 19f)
            close()
            moveTo(19.737f, 7.191f)
            curveTo(19.494f, 7.06f, 19.191f, 7.151f, 19.06f, 7.394f)
            curveTo(18.929f, 7.637f, 19.02f, 7.94f, 19.263f, 8.071f)
            curveTo(19.591f, 8.249f, 19.908f, 8.445f, 20.21f, 8.661f)
            curveTo(22.385f, 10.207f, 23.841f, 12.694f, 23.988f, 15.526f)
            curveTo(24.002f, 15.802f, 24.237f, 16.014f, 24.513f, 15.999f)
            curveTo(24.789f, 15.985f, 25.001f, 15.75f, 24.986f, 15.474f)
            curveTo(24.823f, 12.325f, 23.203f, 9.562f, 20.79f, 7.846f)
            curveTo(20.454f, 7.607f, 20.102f, 7.388f, 19.737f, 7.191f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReadAloudPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ReadAloud, contentDescription = null)
    }
}
