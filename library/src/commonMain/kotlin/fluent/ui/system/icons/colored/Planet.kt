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
package fluent.ui.system.icons.colored

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.Planet: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Planet",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF8F77FF),
                    0.457f to Color(0xFF775BE3),
                    0.656f to Color(0xFF6552D9)
                ),
                center = Offset(19.667f, 22.25f),
                radius = 19.13f
            )
        ) {
            moveTo(20.381f, 8.713f)
            curveTo(20.012f, 8.696f, 19.618f, 8.707f, 19.199f, 8.746f)
            curveTo(17.318f, 8.922f, 14.833f, 9.684f, 11.658f, 11.335f)
            curveTo(8.585f, 12.934f, 6.292f, 13.61f, 4.669f, 13.762f)
            curveTo(4.066f, 13.818f, 3.571f, 13.802f, 3.168f, 13.74f)
            curveTo(3.979f, 17.878f, 7.625f, 21f, 12f, 21f)
            curveTo(16.195f, 21f, 19.72f, 18.13f, 20.717f, 14.246f)
            curveTo(22.011f, 14.189f, 23.088f, 13.598f, 23.621f, 12.737f)
            curveTo(24.19f, 11.817f, 24.139f, 10.638f, 23.305f, 9.781f)
            curveTo(22.684f, 9.142f, 21.657f, 8.77f, 20.381f, 8.713f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.241f to Color(0xFF6E30C8),
                    1f to Color(0x006730C6)
                ),
                center = Offset(23.364f, 14.125f),
                radius = 4.239f
            )
        ) {
            moveTo(20.381f, 8.713f)
            curveTo(20.012f, 8.696f, 19.618f, 8.707f, 19.199f, 8.746f)
            curveTo(17.318f, 8.922f, 14.833f, 9.684f, 11.658f, 11.335f)
            curveTo(8.585f, 12.934f, 6.292f, 13.61f, 4.669f, 13.762f)
            curveTo(4.066f, 13.818f, 3.571f, 13.802f, 3.168f, 13.74f)
            curveTo(3.979f, 17.878f, 7.625f, 21f, 12f, 21f)
            curveTo(16.195f, 21f, 19.72f, 18.13f, 20.717f, 14.246f)
            curveTo(22.011f, 14.189f, 23.088f, 13.598f, 23.621f, 12.737f)
            curveTo(24.19f, 11.817f, 24.139f, 10.638f, 23.305f, 9.781f)
            curveTo(22.684f, 9.142f, 21.657f, 8.77f, 20.381f, 8.713f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF36284),
                    1f to Color(0x00F36284)
                ),
                center = Offset(16.534f, 26.4f),
                radius = 8.61f
            )
        ) {
            moveTo(20.381f, 8.713f)
            curveTo(20.012f, 8.696f, 19.618f, 8.707f, 19.199f, 8.746f)
            curveTo(17.318f, 8.922f, 14.833f, 9.684f, 11.658f, 11.335f)
            curveTo(8.585f, 12.934f, 6.292f, 13.61f, 4.669f, 13.762f)
            curveTo(4.066f, 13.818f, 3.571f, 13.802f, 3.168f, 13.74f)
            curveTo(3.979f, 17.878f, 7.625f, 21f, 12f, 21f)
            curveTo(16.195f, 21f, 19.72f, 18.13f, 20.717f, 14.246f)
            curveTo(22.011f, 14.189f, 23.088f, 13.598f, 23.621f, 12.737f)
            curveTo(24.19f, 11.817f, 24.139f, 10.638f, 23.305f, 9.781f)
            curveTo(22.684f, 9.142f, 21.657f, 8.77f, 20.381f, 8.713f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF7D40C8),
                    1f to Color(0x007F45D2)
                ),
                center = Offset(24.868f, 8.706f),
                radius = 16.605f
            )
        ) {
            moveTo(20.381f, 8.713f)
            curveTo(20.012f, 8.696f, 19.618f, 8.707f, 19.199f, 8.746f)
            curveTo(17.318f, 8.922f, 14.833f, 9.684f, 11.658f, 11.335f)
            curveTo(8.585f, 12.934f, 6.292f, 13.61f, 4.669f, 13.762f)
            curveTo(4.066f, 13.818f, 3.571f, 13.802f, 3.168f, 13.74f)
            curveTo(3.979f, 17.878f, 7.625f, 21f, 12f, 21f)
            curveTo(16.195f, 21f, 19.72f, 18.13f, 20.717f, 14.246f)
            curveTo(22.011f, 14.189f, 23.088f, 13.598f, 23.621f, 12.737f)
            curveTo(24.19f, 11.817f, 24.139f, 10.638f, 23.305f, 9.781f)
            curveTo(22.684f, 9.142f, 21.657f, 8.77f, 20.381f, 8.713f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.265f to Color(0x000A26B5),
                    0.581f to Color(0xFF051D92)
                ),
                center = Offset(13.584f, 20.282f),
                radius = 18.03f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(20.381f, 8.713f)
            curveTo(20.012f, 8.696f, 19.618f, 8.707f, 19.199f, 8.746f)
            curveTo(17.318f, 8.922f, 14.833f, 9.684f, 11.658f, 11.335f)
            curveTo(8.585f, 12.934f, 6.292f, 13.61f, 4.669f, 13.762f)
            curveTo(4.066f, 13.818f, 3.571f, 13.802f, 3.168f, 13.74f)
            curveTo(3.979f, 17.878f, 7.625f, 21f, 12f, 21f)
            curveTo(16.195f, 21f, 19.72f, 18.13f, 20.717f, 14.246f)
            curveTo(22.011f, 14.189f, 23.088f, 13.598f, 23.621f, 12.737f)
            curveTo(24.19f, 11.817f, 24.139f, 10.638f, 23.305f, 9.781f)
            curveTo(22.684f, 9.142f, 21.657f, 8.77f, 20.381f, 8.713f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.195f to Color(0xFFE173E7),
                    0.901f to Color(0x00E173E7)
                ),
                center = Offset(24.429f, 15.687f),
                radius = 4.335f
            )
        ) {
            moveTo(20.381f, 8.713f)
            curveTo(20.012f, 8.696f, 19.618f, 8.707f, 19.199f, 8.746f)
            curveTo(17.318f, 8.922f, 14.833f, 9.684f, 11.658f, 11.335f)
            curveTo(8.585f, 12.934f, 6.292f, 13.61f, 4.669f, 13.762f)
            curveTo(4.066f, 13.818f, 3.571f, 13.802f, 3.168f, 13.74f)
            curveTo(3.979f, 17.878f, 7.625f, 21f, 12f, 21f)
            curveTo(16.195f, 21f, 19.72f, 18.13f, 20.717f, 14.246f)
            curveTo(22.011f, 14.189f, 23.088f, 13.598f, 23.621f, 12.737f)
            curveTo(24.19f, 11.817f, 24.139f, 10.638f, 23.305f, 9.781f)
            curveTo(22.684f, 9.142f, 21.657f, 8.77f, 20.381f, 8.713f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3DD3DC),
                    1f to Color(0xFF4290F0)
                ),
                center = Offset(5.897f, 3.75f),
                radius = 18.79f
            )
        ) {
            moveTo(3.641f, 15.343f)
            lineTo(3.643f, 15.314f)
            curveTo(6.673f, 15.314f, 9.076f, 13.754f, 11.543f, 12.152f)
            curveTo(14.146f, 10.462f, 16.821f, 8.726f, 20.379f, 8.726f)
            lineTo(20.385f, 8.723f)
            curveTo(19.074f, 5.373f, 15.814f, 3f, 12f, 3f)
            curveTo(7.805f, 3f, 4.28f, 5.87f, 3.283f, 9.754f)
            curveTo(1.989f, 9.811f, 0.912f, 10.404f, 0.379f, 11.266f)
            curveTo(-0.19f, 12.186f, -0.14f, 13.364f, 0.694f, 14.222f)
            curveTo(1.315f, 14.861f, 2.343f, 15.229f, 3.619f, 15.287f)
            curveTo(3.626f, 15.306f, 3.634f, 15.325f, 3.641f, 15.343f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.285f to Color(0xFF3A80E1),
                    1f to Color(0x00488AE5)
                ),
                center = Offset(0.002f, 9.875f),
                radius = 6.473f
            )
        ) {
            moveTo(3.641f, 15.343f)
            lineTo(3.643f, 15.314f)
            curveTo(6.673f, 15.314f, 9.076f, 13.754f, 11.543f, 12.152f)
            curveTo(14.146f, 10.462f, 16.821f, 8.726f, 20.379f, 8.726f)
            lineTo(20.385f, 8.723f)
            curveTo(19.074f, 5.373f, 15.814f, 3f, 12f, 3f)
            curveTo(7.805f, 3f, 4.28f, 5.87f, 3.283f, 9.754f)
            curveTo(1.989f, 9.811f, 0.912f, 10.404f, 0.379f, 11.266f)
            curveTo(-0.19f, 12.186f, -0.14f, 13.364f, 0.694f, 14.222f)
            curveTo(1.315f, 14.861f, 2.343f, 15.229f, 3.619f, 15.287f)
            curveTo(3.626f, 15.306f, 3.634f, 15.325f, 3.641f, 15.343f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.232f to Color(0xFF3DD3DC),
                    1f to Color(0x003DD3DC)
                ),
                center = Offset(0.002f, 7.938f),
                radius = 3.19f
            )
        ) {
            moveTo(3.641f, 15.343f)
            lineTo(3.643f, 15.314f)
            curveTo(6.673f, 15.314f, 9.076f, 13.754f, 11.543f, 12.152f)
            curveTo(14.146f, 10.462f, 16.821f, 8.726f, 20.379f, 8.726f)
            lineTo(20.385f, 8.723f)
            curveTo(19.074f, 5.373f, 15.814f, 3f, 12f, 3f)
            curveTo(7.805f, 3f, 4.28f, 5.87f, 3.283f, 9.754f)
            curveTo(1.989f, 9.811f, 0.912f, 10.404f, 0.379f, 11.266f)
            curveTo(-0.19f, 12.186f, -0.14f, 13.364f, 0.694f, 14.222f)
            curveTo(1.315f, 14.861f, 2.343f, 15.229f, 3.619f, 15.287f)
            curveTo(3.626f, 15.306f, 3.634f, 15.325f, 3.641f, 15.343f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.576f to Color(0x0026CFDB),
                    1f to Color(0xFF19D9E7)
                ),
                center = Offset(5.513f, 3.55f),
                radius = 12.57f
            )
        ) {
            moveTo(3.641f, 15.343f)
            lineTo(3.643f, 15.314f)
            curveTo(6.673f, 15.314f, 9.076f, 13.754f, 11.543f, 12.152f)
            curveTo(14.146f, 10.462f, 16.821f, 8.726f, 20.379f, 8.726f)
            lineTo(20.385f, 8.723f)
            curveTo(19.074f, 5.373f, 15.814f, 3f, 12f, 3f)
            curveTo(7.805f, 3f, 4.28f, 5.87f, 3.283f, 9.754f)
            curveTo(1.989f, 9.811f, 0.912f, 10.404f, 0.379f, 11.266f)
            curveTo(-0.19f, 12.186f, -0.14f, 13.364f, 0.694f, 14.222f)
            curveTo(1.315f, 14.861f, 2.343f, 15.229f, 3.619f, 15.287f)
            curveTo(3.626f, 15.306f, 3.634f, 15.325f, 3.641f, 15.343f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PlanetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Planet, contentDescription = null)
    }
}
