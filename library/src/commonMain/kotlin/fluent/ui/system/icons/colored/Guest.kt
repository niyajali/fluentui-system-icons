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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.Guest: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Guest",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    0.218f to Color(0xFF35DAF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-1.333f, -2.374f),
                end = Offset(18.824f, 16.454f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(19.995f, 4.096f)
            curveTo(19.916f, 2.925f, 18.941f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            lineTo(6.096f, 2.005f)
            curveTo(4.925f, 2.084f, 4f, 3.059f, 4f, 4.25f)
            verticalLineTo(19.755f)
            lineTo(4.005f, 19.909f)
            curveTo(4.084f, 21.079f, 5.059f, 22.005f, 6.25f, 22.005f)
            horizontalLineTo(17.75f)
            lineTo(17.904f, 21.999f)
            curveTo(19.075f, 21.92f, 20f, 20.945f, 20f, 19.755f)
            verticalLineTo(4.25f)
            lineTo(19.995f, 4.096f)
            close()
            moveTo(10.75f, 5f)
            curveTo(10.336f, 5f, 10f, 5.336f, 10f, 5.75f)
            curveTo(10f, 6.164f, 10.336f, 6.5f, 10.75f, 6.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 6.5f, 14f, 6.164f, 14f, 5.75f)
            curveTo(14f, 5.336f, 13.664f, 5f, 13.25f, 5f)
            horizontalLineTo(10.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.549f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(14.476f, 4.457f),
                end = Offset(20.452f, 24.832f)
            ),
            fillAlpha = 0.7f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(19.995f, 4.096f)
            curveTo(19.916f, 2.925f, 18.941f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            lineTo(6.096f, 2.005f)
            curveTo(4.925f, 2.084f, 4f, 3.059f, 4f, 4.25f)
            verticalLineTo(19.755f)
            lineTo(4.005f, 19.909f)
            curveTo(4.084f, 21.079f, 5.059f, 22.005f, 6.25f, 22.005f)
            horizontalLineTo(17.75f)
            lineTo(17.904f, 21.999f)
            curveTo(19.075f, 21.92f, 20f, 20.945f, 20f, 19.755f)
            verticalLineTo(4.25f)
            lineTo(19.995f, 4.096f)
            close()
            moveTo(10.75f, 5f)
            curveTo(10.336f, 5f, 10f, 5.336f, 10f, 5.75f)
            curveTo(10f, 6.164f, 10.336f, 6.5f, 10.75f, 6.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 6.5f, 14f, 6.164f, 14f, 5.75f)
            curveTo(14f, 5.336f, 13.664f, 5f, 13.25f, 5f)
            horizontalLineTo(10.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color(0xFFFFFFFF)
                ),
                start = Offset(18.004f, 23.36f),
                end = Offset(13.237f, 7.832f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(14.75f, 14.996f)
            curveTo(15.44f, 14.996f, 16f, 15.555f, 16f, 16.246f)
            verticalLineTo(16.745f)
            curveTo(16f, 18.591f, 14.528f, 19.499f, 12f, 19.499f)
            curveTo(9.472f, 19.499f, 8f, 18.59f, 8f, 16.743f)
            verticalLineTo(16.246f)
            curveTo(8f, 15.555f, 8.56f, 14.996f, 9.25f, 14.996f)
            horizontalLineTo(14.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color(0xFFFFFFFF)
                ),
                start = Offset(15.752f, 18.281f),
                end = Offset(7.824f, 3.741f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(12f, 8.996f)
            curveTo(13.381f, 8.996f, 14.5f, 10.115f, 14.5f, 11.496f)
            curveTo(14.5f, 12.876f, 13.381f, 13.996f, 12f, 13.996f)
            curveTo(10.619f, 13.996f, 9.5f, 12.876f, 9.5f, 11.496f)
            curveTo(9.5f, 10.115f, 10.619f, 8.996f, 12f, 8.996f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GuestPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Guest, contentDescription = null)
    }
}
