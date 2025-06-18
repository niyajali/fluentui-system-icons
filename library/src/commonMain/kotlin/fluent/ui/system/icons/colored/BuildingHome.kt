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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.BuildingHome: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.BuildingHome",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF29C3FF),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(4f, 2.625f),
                end = Offset(23.081f, 22.168f),
            ),
        ) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 9.5f, 20f, 10.507f, 20f, 11.75f)
            verticalLineTo(21f)
            horizontalLineTo(18f)
            verticalLineTo(22f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 22f, 4f, 21.664f, 4f, 21.25f)
            verticalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A43CB),
                    0.914f to Color(0x004A43CB),
                ),
                center = Offset(16f, 20.75f),
                radius = 8.25f,
            ),
        ) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 9.5f, 20f, 10.507f, 20f, 11.75f)
            verticalLineTo(21f)
            horizontalLineTo(18f)
            verticalLineTo(22f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 22f, 4f, 21.664f, 4f, 21.25f)
            verticalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A43CB),
                    0.914f to Color(0x004A43CB),
                ),
                center = Offset(17f, 16f),
                radius = 5.701f,
            ),
        ) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 9.5f, 20f, 10.507f, 20f, 11.75f)
            verticalLineTo(21f)
            horizontalLineTo(18f)
            verticalLineTo(22f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 22f, 4f, 21.664f, 4f, 21.25f)
            verticalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF),
                ),
                start = Offset(9.15f, 4.5f),
                end = Offset(13.953f, 15.067f),
            ),
        ) {
            moveTo(7f, 6.5f)
            curveTo(7f, 7.052f, 7.448f, 7.5f, 8f, 7.5f)
            curveTo(8.552f, 7.5f, 9f, 7.052f, 9f, 6.5f)
            curveTo(9f, 5.948f, 8.552f, 5.5f, 8f, 5.5f)
            curveTo(7.448f, 5.5f, 7f, 5.948f, 7f, 6.5f)
            close()
            moveTo(8f, 12.5f)
            curveTo(7.448f, 12.5f, 7f, 12.948f, 7f, 13.5f)
            curveTo(7f, 14.052f, 7.448f, 14.5f, 8f, 14.5f)
            curveTo(8.552f, 14.5f, 9f, 14.052f, 9f, 13.5f)
            curveTo(9f, 12.948f, 8.552f, 12.5f, 8f, 12.5f)
            close()
            moveTo(8f, 9f)
            curveTo(7.448f, 9f, 7f, 9.448f, 7f, 10f)
            curveTo(7f, 10.552f, 7.448f, 11f, 8f, 11f)
            curveTo(8.552f, 11f, 9f, 10.552f, 9f, 10f)
            curveTo(9f, 9.448f, 8.552f, 9f, 8f, 9f)
            close()
            moveTo(12f, 5.5f)
            curveTo(11.448f, 5.5f, 11f, 5.948f, 11f, 6.5f)
            curveTo(11f, 7.052f, 11.448f, 7.5f, 12f, 7.5f)
            curveTo(12.552f, 7.5f, 13f, 7.052f, 13f, 6.5f)
            curveTo(13f, 5.948f, 12.552f, 5.5f, 12f, 5.5f)
            close()
            moveTo(12f, 9f)
            curveTo(11.448f, 9f, 11f, 9.448f, 11f, 10f)
            curveTo(11f, 10.552f, 11.448f, 11f, 12f, 11f)
            curveTo(12.552f, 11f, 13f, 10.552f, 13f, 10f)
            curveTo(13f, 9.448f, 12.552f, 9f, 12f, 9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02),
                ),
                start = Offset(17.5f, 17f),
                end = Offset(14.694f, 23.238f),
            ),
        ) {
            moveTo(15f, 17f)
            horizontalLineTo(20f)
            verticalLineTo(23f)
            horizontalLineTo(15f)
            verticalLineTo(17f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD394),
                    1f to Color(0xFFFFB357),
                ),
                start = Offset(13.859f, 14.109f),
                end = Offset(21.397f, 21.439f),
            ),
        ) {
            moveTo(18.1f, 13.325f)
            curveTo(17.744f, 13.058f, 17.256f, 13.058f, 16.9f, 13.325f)
            lineTo(13.4f, 15.95f)
            curveTo(13.148f, 16.139f, 13f, 16.435f, 13f, 16.75f)
            verticalLineTo(22f)
            curveTo(13f, 22.552f, 13.448f, 23f, 14f, 23f)
            horizontalLineTo(15f)
            curveTo(15.552f, 23f, 16f, 23f, 16f, 23f)
            verticalLineTo(19.5f)
            curveTo(16f, 19.224f, 16.224f, 19f, 16.5f, 19f)
            horizontalLineTo(18.5f)
            curveTo(18.776f, 19f, 19f, 19.224f, 19f, 19.5f)
            verticalLineTo(23f)
            curveTo(19f, 23f, 19.448f, 23f, 20f, 23f)
            horizontalLineTo(21f)
            curveTo(21.552f, 23f, 22f, 22.552f, 22f, 22f)
            verticalLineTo(16.75f)
            curveTo(22f, 16.435f, 21.852f, 16.139f, 21.6f, 15.95f)
            lineTo(18.1f, 13.325f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824),
                ),
                start = Offset(18f, 11f),
                end = Offset(17.263f, 16.847f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(17.5f, 13.95f)
            lineTo(21.54f, 17.092f)
            curveTo(21.867f, 17.346f, 22.338f, 17.287f, 22.592f, 16.96f)
            curveTo(22.846f, 16.633f, 22.787f, 16.162f, 22.461f, 15.908f)
            lineTo(18.267f, 12.647f)
            curveTo(17.816f, 12.296f, 17.184f, 12.296f, 16.733f, 12.647f)
            lineTo(12.54f, 15.908f)
            curveTo(12.213f, 16.162f, 12.154f, 16.633f, 12.408f, 16.96f)
            curveTo(12.662f, 17.287f, 13.134f, 17.346f, 13.46f, 17.092f)
            lineTo(17.5f, 13.95f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingHomePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.BuildingHome, contentDescription = null)
    }
}
