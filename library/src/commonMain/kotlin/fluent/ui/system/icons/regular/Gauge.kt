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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Gauge: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Gauge",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.934f, 16.066f)
            curveTo(8.227f, 16.359f, 8.227f, 16.834f, 7.934f, 17.126f)
            curveTo(7.641f, 17.419f, 7.166f, 17.419f, 6.873f, 17.126f)
            curveTo(4.042f, 14.295f, 4.042f, 9.705f, 6.873f, 6.873f)
            curveTo(8.718f, 5.029f, 11.31f, 4.387f, 13.672f, 4.945f)
            curveTo(14.075f, 5.04f, 14.325f, 5.444f, 14.23f, 5.847f)
            curveTo(14.135f, 6.25f, 13.731f, 6.5f, 13.328f, 6.404f)
            curveTo(11.45f, 5.961f, 9.396f, 6.472f, 7.934f, 7.934f)
            curveTo(5.689f, 10.18f, 5.689f, 13.82f, 7.934f, 16.066f)
            close()
            moveTo(17.888f, 9.142f)
            curveTo(18.279f, 9.005f, 18.707f, 9.211f, 18.844f, 9.602f)
            curveTo(19.733f, 12.146f, 19.162f, 15.091f, 17.126f, 17.126f)
            curveTo(16.834f, 17.419f, 16.359f, 17.419f, 16.066f, 17.126f)
            curveTo(15.773f, 16.834f, 15.773f, 16.359f, 16.066f, 16.066f)
            curveTo(17.679f, 14.453f, 18.134f, 12.118f, 17.428f, 10.097f)
            curveTo(17.291f, 9.706f, 17.497f, 9.278f, 17.888f, 9.142f)
            close()
            moveTo(15.879f, 6.667f)
            curveTo(16.106f, 6.473f, 16.439f, 6.467f, 16.673f, 6.652f)
            curveTo(16.908f, 6.837f, 16.978f, 7.163f, 16.841f, 7.428f)
            lineTo(16.712f, 7.679f)
            curveTo(16.629f, 7.838f, 16.511f, 8.066f, 16.368f, 8.342f)
            curveTo(16.082f, 8.893f, 15.695f, 9.633f, 15.295f, 10.391f)
            curveTo(14.896f, 11.149f, 14.481f, 11.925f, 14.139f, 12.548f)
            curveTo(13.969f, 12.859f, 13.814f, 13.134f, 13.688f, 13.351f)
            curveTo(13.57f, 13.552f, 13.455f, 13.742f, 13.369f, 13.851f)
            curveTo(12.726f, 14.663f, 11.547f, 14.8f, 10.735f, 14.158f)
            curveTo(9.923f, 13.515f, 9.785f, 12.336f, 10.428f, 11.524f)
            curveTo(10.514f, 11.415f, 10.672f, 11.259f, 10.841f, 11.099f)
            curveTo(11.023f, 10.926f, 11.255f, 10.712f, 11.519f, 10.474f)
            curveTo(12.046f, 9.998f, 12.706f, 9.416f, 13.351f, 8.853f)
            curveTo(13.997f, 8.29f, 14.629f, 7.743f, 15.099f, 7.338f)
            curveTo(15.334f, 7.135f, 15.529f, 6.968f, 15.665f, 6.851f)
            lineTo(15.879f, 6.667f)
            close()
            moveTo(22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            close()
            moveTo(3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GaugePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Gauge, contentDescription = null)
    }
}
