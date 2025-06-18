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

public val FluentUi.Colored.Cloud: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Cloud",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(2.714f, 6.625f),
                end = Offset(11.675f, 19.925f)
            )
        ) {
            moveTo(6.08f, 9.019f)
            curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
            curveTo(14.98f, 4f, 17.452f, 6.172f, 17.92f, 9.019f)
            curveTo(20.208f, 9.231f, 22f, 11.156f, 22f, 13.5f)
            curveTo(22f, 15.985f, 19.985f, 18f, 17.5f, 18f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.019f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFFFFF),
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(2f, 10.542f),
                end = Offset(8.067f, 15.912f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(11f, 13.5f)
            curveTo(11f, 15.985f, 8.985f, 18f, 6.5f, 18f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveTo(2f, 11.015f, 4.015f, 9f, 6.5f, 9f)
            curveTo(8.985f, 9f, 11f, 11.015f, 11f, 13.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFFFFF),
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(8.146f, 4.675f),
                end = Offset(9.739f, 12.946f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(12f, 16f)
            curveTo(15.314f, 16f, 18f, 13.314f, 18f, 10f)
            curveTo(18f, 6.686f, 15.314f, 4f, 12f, 4f)
            curveTo(9.02f, 4f, 6.548f, 6.172f, 6.08f, 9.019f)
            curveTo(6.218f, 9.007f, 6.358f, 9f, 6.5f, 9f)
            curveTo(8.985f, 9f, 11f, 11.015f, 11f, 13.5f)
            curveTo(11f, 14.332f, 10.774f, 15.111f, 10.381f, 15.779f)
            curveTo(10.896f, 15.923f, 11.439f, 16f, 12f, 16f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.412f to Color(0xFF2C87F5),
                    1f to Color(0x002C87F5)
                ),
                center = Offset(6.546f, 13.825f),
                radius = 7.298f
            )
        ) {
            moveTo(12f, 16f)
            curveTo(15.314f, 16f, 18f, 13.314f, 18f, 10f)
            curveTo(18f, 6.686f, 15.314f, 4f, 12f, 4f)
            curveTo(9.02f, 4f, 6.548f, 6.172f, 6.08f, 9.019f)
            curveTo(6.218f, 9.007f, 6.358f, 9f, 6.5f, 9f)
            curveTo(8.985f, 9f, 11f, 11.015f, 11f, 13.5f)
            curveTo(11f, 14.332f, 10.774f, 15.111f, 10.381f, 15.779f)
            curveTo(10.896f, 15.923f, 11.439f, 16f, 12f, 16f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(11.167f, 3.125f),
                radius = 17.321f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(6.08f, 9.019f)
            curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
            curveTo(14.98f, 4f, 17.452f, 6.172f, 17.92f, 9.019f)
            curveTo(20.208f, 9.231f, 22f, 11.156f, 22f, 13.5f)
            curveTo(22f, 15.985f, 19.985f, 18f, 17.5f, 18f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.019f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Cloud, contentDescription = null)
    }
}
