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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.Gift: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Gift",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFBB45EA),
                    0.348f to Color(0xFF8B57ED),
                    1f to Color(0xFF5B2AB5),
                ),
                start = Offset(10.98f, 25.733f),
                end = Offset(10.98f, 8.8f),
            ),
        ) {
            moveTo(20.001f, 12.5f)
            lineTo(20f, 18.75f)
            curveTo(20f, 20.483f, 18.643f, 21.899f, 16.934f, 21.995f)
            lineTo(16.75f, 22f)
            horizontalLineTo(7.25f)
            curveTo(5.517f, 22f, 4.101f, 20.643f, 4.005f, 18.934f)
            lineTo(4f, 18.75f)
            lineTo(4f, 12.5f)
            lineTo(20.001f, 12.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.196f to Color(0xFF5B2AB5),
                    0.763f to Color(0xFF8B57ED),
                    1f to Color(0xFFBB45EA),
                ),
                center = Offset(12f, 4.759f),
                radius = 23.183f,
            ),
        ) {
            moveTo(19.75f, 7f)
            curveTo(20.44f, 7f, 21f, 7.56f, 21f, 8.25f)
            verticalLineTo(11.75f)
            curveTo(21f, 12.354f, 20.571f, 12.859f, 20.001f, 12.975f)
            lineTo(4f, 12.975f)
            curveTo(3.429f, 12.859f, 3f, 12.355f, 3f, 11.75f)
            verticalLineTo(8.25f)
            curveTo(3f, 7.56f, 3.56f, 7f, 4.25f, 7f)
            horizontalLineTo(19.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    1f to Color(0xFFFFCD0F),
                ),
                start = Offset(11.25f, 6.375f),
                end = Offset(11.25f, 20.261f),
            ),
        ) {
            moveTo(11.25f, 22f)
            verticalLineTo(12f)
            horizontalLineTo(12.75f)
            verticalLineTo(22f)
            horizontalLineTo(11.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    1f to Color(0xFFFFCD0F),
                ),
                start = Offset(11.25f, -13.429f),
                end = Offset(11.25f, 21.571f),
            ),
        ) {
            moveTo(11.25f, 13f)
            verticalLineTo(8f)
            horizontalLineTo(12.75f)
            verticalLineTo(13f)
            horizontalLineTo(11.25f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF000000)),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(9.5f, 8.5f)
            curveTo(7.705f, 8.5f, 6.25f, 7.045f, 6.25f, 5.25f)
            curveTo(6.25f, 3.455f, 7.705f, 2f, 9.5f, 2f)
            curveTo(10.505f, 2f, 11.404f, 2.456f, 12f, 3.173f)
            curveTo(12.596f, 2.456f, 13.495f, 2f, 14.5f, 2f)
            curveTo(16.295f, 2f, 17.75f, 3.455f, 17.75f, 5.25f)
            curveTo(17.75f, 7.045f, 16.295f, 8.5f, 14.5f, 8.5f)
            horizontalLineTo(9.5f)
            close()
            moveTo(7.75f, 5.25f)
            curveTo(7.75f, 4.284f, 8.533f, 3.5f, 9.5f, 3.5f)
            curveTo(10.467f, 3.5f, 11.25f, 4.284f, 11.25f, 5.25f)
            verticalLineTo(7f)
            horizontalLineTo(9.5f)
            curveTo(8.533f, 7f, 7.75f, 6.216f, 7.75f, 5.25f)
            close()
            moveTo(12.75f, 7f)
            horizontalLineTo(14.5f)
            curveTo(15.467f, 7f, 16.25f, 6.216f, 16.25f, 5.25f)
            curveTo(16.25f, 4.284f, 15.467f, 3.5f, 14.5f, 3.5f)
            curveTo(13.533f, 3.5f, 12.75f, 4.284f, 12.75f, 5.25f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F),
                ),
                start = Offset(15.194f, 8.498f),
                end = Offset(11.905f, -4.901f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(9.5f, 8.5f)
            curveTo(7.705f, 8.5f, 6.25f, 7.045f, 6.25f, 5.25f)
            curveTo(6.25f, 3.455f, 7.705f, 2f, 9.5f, 2f)
            curveTo(10.505f, 2f, 11.404f, 2.456f, 12f, 3.173f)
            curveTo(12.596f, 2.456f, 13.495f, 2f, 14.5f, 2f)
            curveTo(16.295f, 2f, 17.75f, 3.455f, 17.75f, 5.25f)
            curveTo(17.75f, 7.045f, 16.295f, 8.5f, 14.5f, 8.5f)
            horizontalLineTo(9.5f)
            close()
            moveTo(7.75f, 5.25f)
            curveTo(7.75f, 4.284f, 8.533f, 3.5f, 9.5f, 3.5f)
            curveTo(10.467f, 3.5f, 11.25f, 4.284f, 11.25f, 5.25f)
            verticalLineTo(7f)
            horizontalLineTo(9.5f)
            curveTo(8.533f, 7f, 7.75f, 6.216f, 7.75f, 5.25f)
            close()
            moveTo(12.75f, 7f)
            horizontalLineTo(14.5f)
            curveTo(15.467f, 7f, 16.25f, 6.216f, 16.25f, 5.25f)
            curveTo(16.25f, 4.284f, 15.467f, 3.5f, 14.5f, 3.5f)
            curveTo(13.533f, 3.5f, 12.75f, 4.284f, 12.75f, 5.25f)
            verticalLineTo(7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GiftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Gift, contentDescription = null)
    }
}
