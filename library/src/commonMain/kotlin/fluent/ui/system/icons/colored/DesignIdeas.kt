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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.DesignIdeas: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.DesignIdeas",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.222f to Color(0xFF4E46E2),
                    0.578f to Color(0xFF625DF6),
                    0.955f to Color(0xFFE37DFF)
                ),
                center = Offset(5.207f, 19.18f),
                radius = 17.586f
            )
        ) {
            moveTo(10.5f, 9.5f)
            moveToRelative(-6.5f, 0f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, 0f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.566f to Color(0xFF251FBA),
                    1f to Color(0x005E51E4)
                ),
                center = Offset(2.292f, 12.914f),
                radius = 7.099f
            ),
            fillAlpha = 0.6f
        ) {
            moveTo(10.5f, 9.5f)
            moveToRelative(-6.5f, 0f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, 0f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.566f to Color(0xFF251FBA),
                    1f to Color(0x005E51E4)
                ),
                center = Offset(1.806f, 8.092f),
                radius = 6.531f
            ),
            fillAlpha = 0.6f
        ) {
            moveTo(10.5f, 9.5f)
            moveToRelative(-6.5f, 0f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, 0f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFC354FF),
                    0.158f to Color(0xFFB339F0),
                    0.429f to Color(0xFFF24A9D),
                    0.749f to Color(0xFFFF835C),
                    1f to Color(0xFFFFC470)
                ),
                center = Offset(11.533f, 9.857f),
                radius = 14.189f
            )
        ) {
            moveTo(13f, 9f)
            lineTo(19f, 9f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
            lineTo(22f, 18f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
            lineTo(13f, 21f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
            lineTo(10f, 12f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.195f to Color(0xFF6D37CD),
                    0.765f to Color(0xFFEA71EF)
                ),
                start = Offset(16.313f, 15.897f),
                end = Offset(11.08f, 8.208f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.5f, 16f)
            curveTo(14.09f, 16f, 17f, 13.09f, 17f, 9.5f)
            curveTo(17f, 9.332f, 16.994f, 9.165f, 16.981f, 9f)
            horizontalLineTo(13f)
            curveTo(11.343f, 9f, 10f, 10.343f, 10f, 12f)
            verticalLineTo(15.981f)
            curveTo(10.165f, 15.994f, 10.332f, 16f, 10.5f, 16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.195f to Color(0xFF7631FF),
                    0.886f to Color(0xFFE63080)
                ),
                start = Offset(17.42f, 17.705f),
                end = Offset(9.076f, 6.044f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.5f, 16f)
            curveTo(14.09f, 16f, 17f, 13.09f, 17f, 9.5f)
            curveTo(17f, 9.332f, 16.994f, 9.165f, 16.981f, 9f)
            horizontalLineTo(13f)
            curveTo(11.343f, 9f, 10f, 10.343f, 10f, 12f)
            verticalLineTo(15.981f)
            curveTo(10.165f, 15.994f, 10.332f, 16f, 10.5f, 16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(0.711f, 14.085f),
                end = Offset(6.872f, 20.61f)
            )
        ) {
            moveTo(7.5f, 13.948f)
            curveTo(7.5f, 19.217f, 6.039f, 21.969f, 4.75f, 21.969f)
            curveTo(3.633f, 21.969f, 2f, 19.685f, 2f, 13.948f)
            curveTo(2f, 9.05f, 3.231f, 8.27f, 4.75f, 8.27f)
            curveTo(6.104f, 8.27f, 7.5f, 8.679f, 7.5f, 13.948f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(4.521f, 7.413f),
                radius = 13.612f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(7.5f, 13.948f)
            curveTo(7.5f, 19.217f, 6.039f, 21.969f, 4.75f, 21.969f)
            curveTo(3.633f, 21.969f, 2f, 19.685f, 2f, 13.948f)
            curveTo(2f, 9.05f, 3.231f, 8.27f, 4.75f, 8.27f)
            curveTo(6.104f, 8.27f, 7.5f, 8.679f, 7.5f, 13.948f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.307f to Color(0xFF0D91E1),
                    0.761f to Color(0xFF52B471)
                ),
                start = Offset(9.563f, 14.544f),
                end = Offset(-0.062f, 14.544f)
            )
        ) {
            moveTo(7.5f, 13.948f)
            curveTo(7.5f, 19.217f, 6.039f, 21.969f, 4.75f, 21.969f)
            curveTo(3.633f, 21.969f, 2f, 19.685f, 2f, 13.948f)
            curveTo(2f, 9.05f, 3.231f, 8.27f, 4.75f, 8.27f)
            curveTo(6.104f, 8.27f, 7.5f, 8.679f, 7.5f, 13.948f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.169f to Color(0xFF02888D),
                    0.26f to Color(0x0002888D)
                ),
                center = Offset(3.004f, 8.077f),
                radius = 6.923f
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(7.5f, 13.948f)
            curveTo(7.5f, 19.217f, 6.039f, 21.969f, 4.75f, 21.969f)
            curveTo(3.633f, 21.969f, 2f, 19.685f, 2f, 13.948f)
            curveTo(2f, 9.05f, 3.231f, 8.27f, 4.75f, 8.27f)
            curveTo(6.104f, 8.27f, 7.5f, 8.679f, 7.5f, 13.948f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFFFFF)),
            fillAlpha = 0.15f
        ) {
            moveTo(2.063f, 12.206f)
            curveTo(2.332f, 8.856f, 3.433f, 8.27f, 4.75f, 8.27f)
            curveTo(5.936f, 8.27f, 7.155f, 8.584f, 7.439f, 12.206f)
            curveTo(6.677f, 12.689f, 5.751f, 12.972f, 4.751f, 12.972f)
            curveTo(3.752f, 12.972f, 2.825f, 12.689f, 2.063f, 12.206f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF9532),
                    0.251f to Color(0xFFFF835C),
                    1f to Color(0xFFF24A9D)
                ),
                center = Offset(5.917f, 4.45f),
                radius = 5.756f
            )
        ) {
            moveTo(5.575f, 2.074f)
            curveTo(5.835f, 2.199f, 6f, 2.462f, 6f, 2.75f)
            curveTo(6f, 3.495f, 6.328f, 4.081f, 6.732f, 4.682f)
            curveTo(7.064f, 5.176f, 7.5f, 5.823f, 7.5f, 6.75f)
            curveTo(7.5f, 7.223f, 7.381f, 7.668f, 7.171f, 8.056f)
            curveTo(6.706f, 8.916f, 5.796f, 9.5f, 4.75f, 9.5f)
            curveTo(3.708f, 9.5f, 2.801f, 8.92f, 2.334f, 8.065f)
            curveTo(2.121f, 7.675f, 2f, 7.226f, 2f, 6.75f)
            curveTo(2f, 6.382f, 2f, 5.749f, 2.383f, 4.932f)
            curveTo(2.758f, 4.132f, 3.471f, 3.213f, 4.781f, 2.164f)
            curveTo(5.007f, 1.984f, 5.315f, 1.949f, 5.575f, 2.074f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DesignIdeasPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.DesignIdeas, contentDescription = null)
    }
}
