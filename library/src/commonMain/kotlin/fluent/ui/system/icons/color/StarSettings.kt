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
package fluent.ui.system.icons.color

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.StarSettings: ImageVector
    get() {
        if (_StarSettings != null) {
            return _StarSettings!!
        }
        _StarSettings = ImageVector.Builder(
            name = "Colored.StarSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF6F47),
                        1f to Color(0xFFFFCD0F)
                    ),
                    start = Offset(21.994f, 21.928f),
                    end = Offset(1.427f, 2.53f)
                )
            ) {
                moveTo(13.209f, 3.103f)
                curveTo(12.714f, 2.099f, 11.283f, 2.099f, 10.788f, 3.103f)
                lineTo(8.43f, 7.88f)
                lineTo(3.157f, 8.646f)
                curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
                lineTo(6.224f, 14.668f)
                lineTo(5.324f, 19.919f)
                curveTo(5.135f, 21.022f, 6.292f, 21.863f, 7.283f, 21.343f)
                lineTo(11.469f, 19.142f)
                lineTo(15.585f, 16.921f)
                curveTo(15.833f, 16.099f, 16.597f, 15.5f, 17.5f, 15.5f)
                curveTo(17.645f, 15.5f, 17.787f, 15.515f, 17.923f, 15.545f)
                lineTo(17.772f, 14.668f)
                lineTo(21.588f, 10.949f)
                curveTo(22.389f, 10.168f, 21.947f, 8.807f, 20.84f, 8.646f)
                lineTo(15.567f, 7.88f)
                lineTo(13.209f, 3.103f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.198f to Color(0x99EB4824),
                        0.701f to Color(0x00EB4824)
                    ),
                    center = Offset(17.62f, 19.427f),
                    radius = 12.559f
                )
            ) {
                moveTo(13.209f, 3.103f)
                curveTo(12.714f, 2.099f, 11.283f, 2.099f, 10.788f, 3.103f)
                lineTo(8.43f, 7.88f)
                lineTo(3.157f, 8.646f)
                curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
                lineTo(6.224f, 14.668f)
                lineTo(5.324f, 19.919f)
                curveTo(5.135f, 21.022f, 6.292f, 21.863f, 7.283f, 21.343f)
                lineTo(11.469f, 19.142f)
                lineTo(15.585f, 16.921f)
                curveTo(15.833f, 16.099f, 16.597f, 15.5f, 17.5f, 15.5f)
                curveTo(17.645f, 15.5f, 17.787f, 15.515f, 17.923f, 15.545f)
                lineTo(17.772f, 14.668f)
                lineTo(21.588f, 10.949f)
                curveTo(22.389f, 10.168f, 21.947f, 8.807f, 20.84f, 8.646f)
                lineTo(15.567f, 7.88f)
                lineTo(13.209f, 3.103f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.589f to Color(0xFFB03111),
                        1f to Color(0x00B03111)
                    ),
                    center = Offset(17.621f, 17.552f),
                    radius = 7.498f
                ),
                fillAlpha = 0.4f,
            ) {
                moveTo(13.209f, 3.103f)
                curveTo(12.714f, 2.099f, 11.283f, 2.099f, 10.788f, 3.103f)
                lineTo(8.43f, 7.88f)
                lineTo(3.157f, 8.646f)
                curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
                lineTo(6.224f, 14.668f)
                lineTo(5.324f, 19.919f)
                curveTo(5.135f, 21.022f, 6.292f, 21.863f, 7.283f, 21.343f)
                lineTo(11.469f, 19.142f)
                lineTo(15.585f, 16.921f)
                curveTo(15.833f, 16.099f, 16.597f, 15.5f, 17.5f, 15.5f)
                curveTo(17.645f, 15.5f, 17.787f, 15.515f, 17.923f, 15.545f)
                lineTo(17.772f, 14.668f)
                lineTo(21.588f, 10.949f)
                curveTo(22.389f, 10.168f, 21.947f, 8.807f, 20.84f, 8.646f)
                lineTo(15.567f, 7.88f)
                lineTo(13.209f, 3.103f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.628f to Color(0xFFB03111),
                        1f to Color(0x00B03111)
                    ),
                    center = Offset(17.62f, 17.552f),
                    radius = 7.289f
                ),
                fillAlpha = 0.4f,
            ) {
                moveTo(13.209f, 3.103f)
                curveTo(12.714f, 2.099f, 11.283f, 2.099f, 10.788f, 3.103f)
                lineTo(8.43f, 7.88f)
                lineTo(3.157f, 8.646f)
                curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
                lineTo(6.224f, 14.668f)
                lineTo(5.324f, 19.919f)
                curveTo(5.135f, 21.022f, 6.292f, 21.863f, 7.283f, 21.343f)
                lineTo(11.469f, 19.142f)
                lineTo(15.585f, 16.921f)
                curveTo(15.833f, 16.099f, 16.597f, 15.5f, 17.5f, 15.5f)
                curveTo(17.645f, 15.5f, 17.787f, 15.515f, 17.923f, 15.545f)
                lineTo(17.772f, 14.668f)
                lineTo(21.588f, 10.949f)
                curveTo(22.389f, 10.168f, 21.947f, 8.807f, 20.84f, 8.646f)
                lineTo(15.567f, 7.88f)
                lineTo(13.209f, 3.103f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.671f to Color(0xFFB03111),
                        0.972f to Color(0x00B03111)
                    ),
                    center = Offset(17.621f, 17.552f),
                    radius = 7.614f
                ),
                fillAlpha = 0.4f,
            ) {
                moveTo(13.209f, 3.103f)
                curveTo(12.714f, 2.099f, 11.283f, 2.099f, 10.788f, 3.103f)
                lineTo(8.43f, 7.88f)
                lineTo(3.157f, 8.646f)
                curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
                lineTo(6.224f, 14.668f)
                lineTo(5.324f, 19.919f)
                curveTo(5.135f, 21.022f, 6.292f, 21.863f, 7.283f, 21.343f)
                lineTo(11.469f, 19.142f)
                lineTo(15.585f, 16.921f)
                curveTo(15.833f, 16.099f, 16.597f, 15.5f, 17.5f, 15.5f)
                curveTo(17.645f, 15.5f, 17.787f, 15.515f, 17.923f, 15.545f)
                lineTo(17.772f, 14.668f)
                lineTo(21.588f, 10.949f)
                curveTo(22.389f, 10.168f, 21.947f, 8.807f, 20.84f, 8.646f)
                lineTo(15.567f, 7.88f)
                lineTo(13.209f, 3.103f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF70777D),
                        1f to Color(0xFFB9C0C7)
                    ),
                    start = Offset(20.156f, 22.227f),
                    end = Offset(14.626f, 12.905f)
                )
            ) {
                moveTo(14.277f, 13.976f)
                curveTo(14.592f, 15.066f, 13.938f, 16.199f, 12.836f, 16.472f)
                lineTo(12.252f, 16.617f)
                curveTo(12.207f, 16.904f, 12.184f, 17.199f, 12.184f, 17.5f)
                curveTo(12.184f, 17.815f, 12.209f, 18.124f, 12.258f, 18.424f)
                lineTo(12.798f, 18.554f)
                curveTo(13.91f, 18.822f, 14.571f, 19.967f, 14.248f, 21.064f)
                lineTo(14.061f, 21.695f)
                curveTo(14.5f, 22.081f, 15.001f, 22.394f, 15.545f, 22.617f)
                lineTo(16.039f, 22.098f)
                curveTo(16.827f, 21.269f, 18.15f, 21.269f, 18.938f, 22.099f)
                lineTo(19.437f, 22.624f)
                curveTo(19.98f, 22.403f, 20.48f, 22.093f, 20.919f, 21.711f)
                lineTo(20.721f, 21.025f)
                curveTo(20.407f, 19.934f, 21.061f, 18.801f, 22.163f, 18.528f)
                lineTo(22.746f, 18.384f)
                curveTo(22.791f, 18.096f, 22.815f, 17.801f, 22.815f, 17.5f)
                curveTo(22.815f, 17.186f, 22.789f, 16.877f, 22.74f, 16.577f)
                lineTo(22.201f, 16.447f)
                curveTo(21.088f, 16.179f, 20.427f, 15.034f, 20.751f, 13.936f)
                lineTo(20.937f, 13.306f)
                curveTo(20.498f, 12.92f, 19.997f, 12.607f, 19.453f, 12.384f)
                lineTo(18.96f, 12.902f)
                curveTo(18.171f, 13.732f, 16.849f, 13.731f, 16.061f, 12.902f)
                lineTo(15.562f, 12.377f)
                curveTo(15.018f, 12.597f, 14.518f, 12.907f, 14.079f, 13.29f)
                lineTo(14.277f, 13.976f)
                close()
                moveTo(17.499f, 19f)
                curveTo(16.698f, 19f, 16.049f, 18.329f, 16.049f, 17.5f)
                curveTo(16.049f, 16.672f, 16.698f, 16f, 17.499f, 16f)
                curveTo(18.3f, 16f, 18.949f, 16.672f, 18.949f, 17.5f)
                curveTo(18.949f, 18.329f, 18.3f, 19f, 17.499f, 19f)
                close()
            }
        }.build()

        return _StarSettings!!
    }

@Suppress("ObjectPropertyName")
private var _StarSettings: ImageVector? = null

@Preview
@Composable
private fun StarSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.StarSettings, contentDescription = null)
    }
}
