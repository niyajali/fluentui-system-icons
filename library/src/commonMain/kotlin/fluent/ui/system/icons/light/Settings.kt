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

public val FluentUi.Light.Settings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Settings",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.999f, 16f)
            curveTo(20.999f, 18.761f, 18.761f, 21f, 15.999f, 21f)
            curveTo(13.238f, 21f, 10.999f, 18.761f, 10.999f, 16f)
            curveTo(10.999f, 13.239f, 13.238f, 11f, 15.999f, 11f)
            curveTo(18.761f, 11f, 20.999f, 13.239f, 20.999f, 16f)
            close()
            moveTo(19.999f, 16f)
            curveTo(19.999f, 13.791f, 18.208f, 12f, 15.999f, 12f)
            curveTo(13.79f, 12f, 11.999f, 13.791f, 11.999f, 16f)
            curveTo(11.999f, 18.209f, 13.79f, 20f, 15.999f, 20f)
            curveTo(18.208f, 20f, 19.999f, 18.209f, 19.999f, 16f)
            close()
            moveTo(5.9f, 6.304f)
            curveTo(6.183f, 6.009f, 6.623f, 5.94f, 6.995f, 6.111f)
            lineTo(8.796f, 6.941f)
            curveTo(10.016f, 7.503f, 11.433f, 6.727f, 11.615f, 5.395f)
            lineTo(11.912f, 3.219f)
            curveTo(11.965f, 2.83f, 12.24f, 2.505f, 12.622f, 2.41f)
            curveTo(13.703f, 2.142f, 14.835f, 2f, 15.999f, 2f)
            curveTo(17.164f, 2f, 18.295f, 2.142f, 19.377f, 2.41f)
            curveTo(19.758f, 2.505f, 20.033f, 2.83f, 20.087f, 3.219f)
            lineTo(20.384f, 5.395f)
            curveTo(20.566f, 6.727f, 21.982f, 7.503f, 23.202f, 6.941f)
            lineTo(25.004f, 6.111f)
            curveTo(25.375f, 5.94f, 25.815f, 6.009f, 26.098f, 6.304f)
            curveTo(27.645f, 7.915f, 28.81f, 9.895f, 29.448f, 12.099f)
            curveTo(29.562f, 12.492f, 29.401f, 12.909f, 29.066f, 13.144f)
            lineTo(27.33f, 14.363f)
            curveTo(26.196f, 15.16f, 26.196f, 16.84f, 27.33f, 17.637f)
            lineTo(29.066f, 18.856f)
            curveTo(29.401f, 19.091f, 29.562f, 19.508f, 29.448f, 19.901f)
            curveTo(28.81f, 22.105f, 27.645f, 24.085f, 26.098f, 25.696f)
            curveTo(25.815f, 25.99f, 25.375f, 26.06f, 25.004f, 25.889f)
            lineTo(23.202f, 25.059f)
            curveTo(21.982f, 24.497f, 20.566f, 25.273f, 20.384f, 26.605f)
            lineTo(20.087f, 28.781f)
            curveTo(20.033f, 29.17f, 19.758f, 29.495f, 19.377f, 29.59f)
            curveTo(18.295f, 29.858f, 17.164f, 30f, 15.999f, 30f)
            curveTo(14.835f, 30f, 13.703f, 29.858f, 12.622f, 29.59f)
            curveTo(12.24f, 29.495f, 11.965f, 29.17f, 11.912f, 28.781f)
            lineTo(11.615f, 26.605f)
            curveTo(11.433f, 25.273f, 10.016f, 24.497f, 8.796f, 25.059f)
            lineTo(6.995f, 25.889f)
            curveTo(6.623f, 26.06f, 6.183f, 25.991f, 5.9f, 25.696f)
            curveTo(4.353f, 24.085f, 3.188f, 22.105f, 2.55f, 19.901f)
            curveTo(2.436f, 19.508f, 2.597f, 19.091f, 2.932f, 18.856f)
            lineTo(4.669f, 17.637f)
            curveTo(5.803f, 16.84f, 5.803f, 15.16f, 4.669f, 14.363f)
            lineTo(2.932f, 13.144f)
            curveTo(2.597f, 12.909f, 2.436f, 12.492f, 2.55f, 12.099f)
            curveTo(3.188f, 9.895f, 4.353f, 7.915f, 5.9f, 6.304f)
            close()
            moveTo(3.522f, 12.336f)
            lineTo(5.243f, 13.545f)
            curveTo(6.944f, 14.74f, 6.944f, 17.26f, 5.243f, 18.455f)
            lineTo(3.522f, 19.664f)
            curveTo(4.113f, 21.679f, 5.179f, 23.492f, 6.593f, 24.973f)
            lineTo(8.377f, 24.151f)
            curveTo(10.208f, 23.307f, 12.333f, 24.472f, 12.606f, 26.469f)
            lineTo(12.9f, 28.629f)
            curveTo(13.892f, 28.871f, 14.93f, 29f, 15.999f, 29f)
            curveTo(17.068f, 29f, 18.106f, 28.871f, 19.098f, 28.629f)
            lineTo(19.393f, 26.469f)
            curveTo(19.666f, 24.472f, 21.791f, 23.307f, 23.621f, 24.151f)
            lineTo(25.406f, 24.973f)
            curveTo(26.819f, 23.492f, 27.885f, 21.679f, 28.476f, 19.664f)
            lineTo(26.755f, 18.455f)
            curveTo(25.054f, 17.26f, 25.054f, 14.74f, 26.755f, 13.545f)
            lineTo(28.476f, 12.336f)
            curveTo(27.885f, 10.321f, 26.819f, 8.508f, 25.406f, 7.027f)
            lineTo(23.621f, 7.849f)
            curveTo(21.791f, 8.693f, 19.666f, 7.528f, 19.393f, 5.531f)
            lineTo(19.098f, 3.371f)
            curveTo(18.106f, 3.129f, 17.068f, 3f, 15.999f, 3f)
            curveTo(14.93f, 3f, 13.892f, 3.129f, 12.9f, 3.371f)
            lineTo(12.606f, 5.531f)
            curveTo(12.333f, 7.528f, 10.208f, 8.693f, 8.377f, 7.849f)
            lineTo(6.593f, 7.027f)
            curveTo(5.179f, 8.508f, 4.113f, 10.321f, 3.522f, 12.336f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Settings, contentDescription = null)
    }
}
