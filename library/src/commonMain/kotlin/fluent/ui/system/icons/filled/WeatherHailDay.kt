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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.WeatherHailDay: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherHailDay",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 20f)
            curveTo(13.552f, 20f, 14f, 20.448f, 14f, 21f)
            curveTo(14f, 21.552f, 13.552f, 22f, 13f, 22f)
            curveTo(12.448f, 22f, 12f, 21.552f, 12f, 21f)
            curveTo(12f, 20.448f, 12.448f, 20f, 13f, 20f)
            close()
            moveTo(9.5f, 19f)
            curveTo(10.052f, 19f, 10.5f, 19.448f, 10.5f, 20f)
            curveTo(10.5f, 20.552f, 10.052f, 21f, 9.5f, 21f)
            curveTo(8.948f, 21f, 8.5f, 20.552f, 8.5f, 20f)
            curveTo(8.5f, 19.448f, 8.948f, 19f, 9.5f, 19f)
            close()
            moveTo(16.5f, 19f)
            curveTo(17.052f, 19f, 17.5f, 19.448f, 17.5f, 20f)
            curveTo(17.5f, 20.552f, 17.052f, 21f, 16.5f, 21f)
            curveTo(15.948f, 21f, 15.5f, 20.552f, 15.5f, 20f)
            curveTo(15.5f, 19.448f, 15.948f, 19f, 16.5f, 19f)
            close()
            moveTo(13.002f, 6.009f)
            curveTo(16.17f, 6.009f, 17.968f, 8.106f, 18.229f, 10.639f)
            lineTo(18.309f, 10.639f)
            curveTo(20.348f, 10.639f, 22.001f, 12.288f, 22.001f, 14.322f)
            curveTo(22.001f, 16.355f, 20.348f, 18.004f, 18.309f, 18.004f)
            horizontalLineTo(7.694f)
            curveTo(5.655f, 18.004f, 4.002f, 16.355f, 4.002f, 14.322f)
            curveTo(4.002f, 12.288f, 5.655f, 10.639f, 7.694f, 10.639f)
            lineTo(7.774f, 10.639f)
            curveTo(8.037f, 8.09f, 9.833f, 6.009f, 13.002f, 6.009f)
            close()
            moveTo(4.367f, 10.164f)
            curveTo(4.513f, 10.515f, 4.372f, 10.913f, 4.053f, 11.099f)
            lineTo(3.962f, 11.144f)
            lineTo(3.035f, 11.528f)
            curveTo(2.653f, 11.686f, 2.214f, 11.505f, 2.055f, 11.122f)
            curveTo(1.91f, 10.771f, 2.051f, 10.373f, 2.37f, 10.187f)
            lineTo(2.461f, 10.142f)
            lineTo(3.388f, 9.758f)
            curveTo(3.77f, 9.6f, 4.209f, 9.782f, 4.367f, 10.164f)
            close()
            moveTo(10.854f, 5.331f)
            lineTo(10.683f, 5.389f)
            curveTo(8.898f, 6.019f, 7.62f, 7.394f, 7.068f, 9.212f)
            lineTo(6.997f, 9.462f)
            lineTo(6.939f, 9.7f)
            lineTo(6.733f, 9.739f)
            curveTo(6.125f, 9.866f, 5.56f, 10.113f, 5.063f, 10.453f)
            curveTo(4.974f, 10.303f, 4.895f, 10.144f, 4.826f, 9.977f)
            curveTo(3.993f, 7.966f, 4.948f, 5.66f, 6.959f, 4.827f)
            curveTo(8.302f, 4.271f, 9.775f, 4.512f, 10.854f, 5.331f)
            close()
            moveTo(2.941f, 5.362f)
            lineTo(3.046f, 5.397f)
            lineTo(3.972f, 5.781f)
            curveTo(4.355f, 5.939f, 4.537f, 6.378f, 4.378f, 6.761f)
            curveTo(4.234f, 7.109f, 3.859f, 7.29f, 3.504f, 7.202f)
            lineTo(3.398f, 7.167f)
            lineTo(2.472f, 6.783f)
            curveTo(2.089f, 6.624f, 1.908f, 6.186f, 2.066f, 5.803f)
            curveTo(2.21f, 5.455f, 2.586f, 5.273f, 2.941f, 5.362f)
            close()
            moveTo(6.756f, 2.376f)
            lineTo(6.801f, 2.467f)
            lineTo(7.185f, 3.393f)
            curveTo(7.343f, 3.776f, 7.162f, 4.215f, 6.779f, 4.373f)
            curveTo(6.428f, 4.519f, 6.03f, 4.378f, 5.844f, 4.059f)
            lineTo(5.799f, 3.967f)
            lineTo(5.415f, 3.041f)
            curveTo(5.257f, 2.659f, 5.439f, 2.22f, 5.821f, 2.061f)
            curveTo(6.172f, 1.916f, 6.57f, 2.057f, 6.756f, 2.376f)
            close()
            moveTo(11.109f, 2.057f)
            curveTo(11.457f, 2.201f, 11.639f, 2.577f, 11.55f, 2.932f)
            lineTo(11.515f, 3.037f)
            lineTo(11.132f, 3.963f)
            curveTo(10.973f, 4.346f, 10.534f, 4.528f, 10.151f, 4.369f)
            curveTo(9.804f, 4.225f, 9.622f, 3.85f, 9.711f, 3.495f)
            lineTo(9.746f, 3.389f)
            lineTo(10.129f, 2.463f)
            curveTo(10.288f, 2.08f, 10.727f, 1.899f, 11.109f, 2.057f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherHailDayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WeatherHailDay, contentDescription = null)
    }
}
