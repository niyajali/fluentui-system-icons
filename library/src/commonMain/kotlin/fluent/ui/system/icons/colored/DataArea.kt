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

public val FluentUi.Colored.DataArea: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.DataArea",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.164f to Color(0xFF3BD5FF),
                    0.537f to Color(0xFF9C6CFE),
                    0.908f to Color(0xFFE656EB)
                ),
                start = Offset(-0.692f, 7.688f),
                end = Offset(23.794f, 22.289f)
            )
        ) {
            moveTo(19.5f, 6.75f)
            curveTo(19.5f, 6.466f, 19.34f, 6.206f, 19.085f, 6.079f)
            curveTo(18.831f, 5.952f, 18.527f, 5.98f, 18.3f, 6.15f)
            lineTo(12.7f, 10.35f)
            lineTo(8.88f, 8.104f)
            curveTo(8.661f, 7.975f, 8.392f, 7.966f, 8.165f, 8.079f)
            lineTo(4.5f, 9.9f)
            verticalLineTo(19.5f)
            horizontalLineTo(19.5f)
            lineTo(19.5f, 6.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.636f to Color(0x000FAFFF),
                    0.962f to Color(0xFF0067BF)
                ),
                center = Offset(17.192f, 8.25f),
                radius = 15.351f
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(19.5f, 6.75f)
            curveTo(19.5f, 6.466f, 19.34f, 6.206f, 19.085f, 6.079f)
            curveTo(18.831f, 5.952f, 18.527f, 5.98f, 18.3f, 6.15f)
            lineTo(12.7f, 10.35f)
            lineTo(8.88f, 8.104f)
            curveTo(8.661f, 7.975f, 8.392f, 7.966f, 8.165f, 8.079f)
            lineTo(4.5f, 9.9f)
            verticalLineTo(19.5f)
            horizontalLineTo(19.5f)
            lineTo(19.5f, 6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00163697),
                    1f to Color(0xFF163697)
                ),
                start = Offset(12f, 17.25f),
                end = Offset(12f, 19.5f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(19.5f, 6.75f)
            curveTo(19.5f, 6.466f, 19.34f, 6.206f, 19.085f, 6.079f)
            curveTo(18.831f, 5.952f, 18.527f, 5.98f, 18.3f, 6.15f)
            lineTo(12.7f, 10.35f)
            lineTo(8.88f, 8.104f)
            curveTo(8.661f, 7.975f, 8.392f, 7.966f, 8.165f, 8.079f)
            lineTo(4.5f, 9.9f)
            verticalLineTo(19.5f)
            horizontalLineTo(19.5f)
            lineTo(19.5f, 6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00163697),
                    1f to Color(0xFF163697)
                ),
                start = Offset(6.808f, 15.563f),
                end = Offset(4.5f, 15.563f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(19.5f, 6.75f)
            curveTo(19.5f, 6.466f, 19.34f, 6.206f, 19.085f, 6.079f)
            curveTo(18.831f, 5.952f, 18.527f, 5.98f, 18.3f, 6.15f)
            lineTo(12.7f, 10.35f)
            lineTo(8.88f, 8.104f)
            curveTo(8.661f, 7.975f, 8.392f, 7.966f, 8.165f, 8.079f)
            lineTo(4.5f, 9.9f)
            verticalLineTo(19.5f)
            horizontalLineTo(19.5f)
            lineTo(19.5f, 6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF70777D),
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(19.313f, 4.125f),
                end = Offset(3.56f, 27.58f)
            )
        ) {
            moveTo(5f, 4f)
            curveTo(5f, 3.448f, 4.552f, 3f, 4f, 3f)
            curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
            verticalLineTo(17.5f)
            curveTo(3f, 19.433f, 4.567f, 21f, 6.5f, 21f)
            horizontalLineTo(20f)
            curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
            curveTo(21f, 19.448f, 20.552f, 19f, 20f, 19f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 19f, 5f, 18.328f, 5f, 17.5f)
            verticalLineTo(4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataAreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.DataArea, contentDescription = null)
    }
}
