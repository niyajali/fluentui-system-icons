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

public val FluentUi.Filled.Run: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Run",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.976f, 3.56f)
            curveTo(8.873f, 3.159f, 8.464f, 2.917f, 8.063f, 3.02f)
            curveTo(7.738f, 3.103f, 7.518f, 3.388f, 7.501f, 3.706f)
            curveTo(5.681f, 4.301f, 4.55f, 5.223f, 3.877f, 6.295f)
            curveTo(3.169f, 7.421f, 3.028f, 8.619f, 3.004f, 9.541f)
            curveTo(3.003f, 9.572f, 3.002f, 9.603f, 3.002f, 9.634f)
            lineTo(2.495f, 10.267f)
            curveTo(1.675f, 11.293f, 1.904f, 12.801f, 2.992f, 13.536f)
            lineTo(12.059f, 19.668f)
            curveTo(13.341f, 20.535f, 14.853f, 20.998f, 16.401f, 20.998f)
            horizontalLineTo(18.609f)
            curveTo(20.483f, 20.998f, 22.001f, 19.48f, 22.001f, 17.606f)
            curveTo(22.001f, 17.448f, 21.99f, 17.293f, 21.968f, 17.14f)
            curveTo(21.731f, 15.48f, 20.296f, 14.33f, 19.017f, 13.713f)
            curveTo(18.603f, 13.514f, 18.259f, 13.252f, 18.031f, 12.917f)
            lineTo(15.448f, 8.473f)
            curveTo(15.788f, 8.379f, 16.024f, 8.054f, 15.995f, 7.69f)
            curveTo(15.962f, 7.277f, 15.601f, 6.969f, 15.188f, 7.002f)
            curveTo(14.858f, 7.028f, 14.529f, 7.035f, 14.204f, 7.021f)
            curveTo(11.844f, 6.923f, 9.839f, 5.82f, 9.13f, 4.034f)
            curveTo(9.07f, 3.882f, 9.018f, 3.724f, 8.976f, 3.56f)
            close()
            moveTo(6.393f, 5.86f)
            lineTo(7.979f, 8.605f)
            curveTo(8.393f, 9.322f, 8.147f, 10.24f, 7.429f, 10.654f)
            lineTo(7.044f, 10.876f)
            lineTo(4.523f, 9.175f)
            curveTo(4.576f, 8.479f, 4.731f, 7.755f, 5.147f, 7.092f)
            curveTo(5.413f, 6.668f, 5.805f, 6.242f, 6.393f, 5.86f)
            close()
            moveTo(8.435f, 11.814f)
            lineTo(11.228f, 10.201f)
            curveTo(11.945f, 9.787f, 12.863f, 10.033f, 13.277f, 10.75f)
            lineTo(13.801f, 11.658f)
            curveTo(14.215f, 12.375f, 13.969f, 13.293f, 13.252f, 13.707f)
            lineTo(12.168f, 14.333f)
            lineTo(8.435f, 11.814f)
            close()
            moveTo(16.369f, 17.997f)
            horizontalLineTo(20.461f)
            curveTo(20.281f, 18.854f, 19.52f, 19.498f, 18.609f, 19.498f)
            horizontalLineTo(16.401f)
            curveTo(15.153f, 19.498f, 13.933f, 19.125f, 12.899f, 18.426f)
            lineTo(3.832f, 12.294f)
            curveTo(3.469f, 12.049f, 3.393f, 11.546f, 3.666f, 11.204f)
            lineTo(4.081f, 10.686f)
            lineTo(13.713f, 17.184f)
            curveTo(14.498f, 17.714f, 15.423f, 17.997f, 16.369f, 17.997f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RunPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Run, contentDescription = null)
    }
}
