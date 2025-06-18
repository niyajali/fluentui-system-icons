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

public val FluentUi.Light.WeatherMoon: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.WeatherMoon",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.229f, 3.286f)
            curveTo(16.321f, 3.149f, 16.456f, 3.08f, 16.62f, 3.1f)
            curveTo(23.035f, 3.897f, 28f, 9.369f, 28f, 16f)
            curveTo(28f, 23.18f, 22.18f, 29f, 15f, 29f)
            curveTo(9.989f, 29f, 5.64f, 26.165f, 3.469f, 22.01f)
            curveTo(3.471f, 22.008f, 3.474f, 22.006f, 3.477f, 22.005f)
            curveTo(3.481f, 22.002f, 3.487f, 22f, 3.496f, 22f)
            curveTo(10.952f, 22f, 16.996f, 15.956f, 16.996f, 8.5f)
            curveTo(16.996f, 6.862f, 16.704f, 5.292f, 16.169f, 3.838f)
            curveTo(16.096f, 3.639f, 16.131f, 3.432f, 16.229f, 3.286f)
            close()
            moveTo(3.496f, 21f)
            curveTo(2.791f, 21f, 2.203f, 21.744f, 2.577f, 22.462f)
            curveTo(4.912f, 26.941f, 9.598f, 30f, 15f, 30f)
            curveTo(22.732f, 30f, 29f, 23.732f, 29f, 16f)
            curveTo(29f, 8.858f, 23.653f, 2.966f, 16.743f, 2.108f)
            curveTo(16.161f, 2.035f, 15.675f, 2.317f, 15.398f, 2.729f)
            curveTo(15.127f, 3.134f, 15.044f, 3.677f, 15.231f, 4.183f)
            curveTo(15.726f, 5.528f, 15.996f, 6.982f, 15.996f, 8.5f)
            curveTo(15.996f, 15.404f, 10.4f, 21f, 3.496f, 21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherMoonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.WeatherMoon, contentDescription = null)
    }
}
