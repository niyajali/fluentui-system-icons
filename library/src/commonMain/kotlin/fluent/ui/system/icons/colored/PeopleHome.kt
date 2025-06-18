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

public val FluentUi.Colored.PeopleHome: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.PeopleHome",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(5.808f, 15.064f),
                end = Offset(8.394f, 23.319f),
            ),
        ) {
            moveTo(15.754f, 14f)
            curveTo(16.996f, 14f, 18.003f, 15.007f, 18.003f, 16.249f)
            verticalLineTo(17.167f)
            curveTo(18.003f, 17.741f, 17.824f, 18.3f, 17.49f, 18.766f)
            curveTo(15.944f, 20.93f, 13.42f, 22.001f, 10f, 22.001f)
            curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.765f)
            curveTo(2.182f, 18.299f, 2.003f, 17.741f, 2.003f, 17.169f)
            verticalLineTo(16.249f)
            curveTo(2.003f, 15.007f, 3.01f, 14f, 4.252f, 14f)
            horizontalLineTo(15.754f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8),
                ),
                start = Offset(10.003f, 13.047f),
                end = Offset(13.623f, 26.573f),
            ),
        ) {
            moveTo(15.754f, 14f)
            curveTo(16.996f, 14f, 18.003f, 15.007f, 18.003f, 16.249f)
            verticalLineTo(17.167f)
            curveTo(18.003f, 17.741f, 17.824f, 18.3f, 17.49f, 18.766f)
            curveTo(15.944f, 20.93f, 13.42f, 22.001f, 10f, 22.001f)
            curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.765f)
            curveTo(2.182f, 18.299f, 2.003f, 17.741f, 2.003f, 17.169f)
            verticalLineTo(16.249f)
            curveTo(2.003f, 15.007f, 3.01f, 14f, 4.252f, 14f)
            horizontalLineTo(15.754f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.042f to Color(0xBF0A1852),
                    1f to Color(0x000A1852),
                ),
                center = Offset(14.5f, 19.5f),
                radius = 3.5f,
            ),
            fillAlpha = 0.75f,
        ) {
            moveTo(15.754f, 14f)
            curveTo(16.996f, 14f, 18.003f, 15.007f, 18.003f, 16.249f)
            verticalLineTo(17.167f)
            curveTo(18.003f, 17.741f, 17.824f, 18.3f, 17.49f, 18.766f)
            curveTo(15.944f, 20.93f, 13.42f, 22.001f, 10f, 22.001f)
            curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.765f)
            curveTo(2.182f, 18.299f, 2.003f, 17.741f, 2.003f, 17.169f)
            verticalLineTo(16.249f)
            curveTo(2.003f, 15.007f, 3.01f, 14f, 4.252f, 14f)
            horizontalLineTo(15.754f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xBF0A1852),
                    1f to Color(0x000A1852),
                ),
                center = Offset(13f, 17f),
                radius = 1.5f,
            ),
            fillAlpha = 0.55f,
        ) {
            moveTo(15.754f, 14f)
            curveTo(16.996f, 14f, 18.003f, 15.007f, 18.003f, 16.249f)
            verticalLineTo(17.167f)
            curveTo(18.003f, 17.741f, 17.824f, 18.3f, 17.49f, 18.766f)
            curveTo(15.944f, 20.93f, 13.42f, 22.001f, 10f, 22.001f)
            curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.765f)
            curveTo(2.182f, 18.299f, 2.003f, 17.741f, 2.003f, 17.169f)
            verticalLineTo(16.249f)
            curveTo(2.003f, 15.007f, 3.01f, 14f, 4.252f, 14f)
            horizontalLineTo(15.754f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(7.379f, 3.334f),
                end = Offset(12.475f, 11.472f),
            ),
        ) {
            moveTo(10f, 2.005f)
            curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
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
private fun PeopleHomePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.PeopleHome, contentDescription = null)
    }
}
