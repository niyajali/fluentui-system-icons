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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.AddStarburst: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.AddStarburst",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC470),
                    0.251f to Color(0xFFFF835C),
                    0.55f to Color(0xFFF24A9D),
                    0.814f to Color(0xFFB339F0),
                ),
                center = Offset(26.245f, 26.212f),
                radius = 48.647f,
            ),
        ) {
            moveTo(12.793f, 1.383f)
            curveTo(12.392f, 0.868f, 11.614f, 0.868f, 11.214f, 1.383f)
            lineTo(9.801f, 3.199f)
            curveTo(9.733f, 3.288f, 9.614f, 3.32f, 9.51f, 3.278f)
            lineTo(7.378f, 2.411f)
            curveTo(6.774f, 2.165f, 6.1f, 2.554f, 6.011f, 3.2f)
            lineTo(5.696f, 5.48f)
            curveTo(5.681f, 5.59f, 5.593f, 5.678f, 5.483f, 5.693f)
            lineTo(3.203f, 6.008f)
            curveTo(2.557f, 6.098f, 2.168f, 6.771f, 2.414f, 7.375f)
            lineTo(3.28f, 9.507f)
            curveTo(3.323f, 9.611f, 3.291f, 9.73f, 3.202f, 9.798f)
            lineTo(1.386f, 11.211f)
            curveTo(0.871f, 11.611f, 0.871f, 12.389f, 1.386f, 12.79f)
            lineTo(3.202f, 14.203f)
            curveTo(3.291f, 14.271f, 3.323f, 14.39f, 3.28f, 14.494f)
            lineTo(2.414f, 16.626f)
            curveTo(2.168f, 17.23f, 2.557f, 17.903f, 3.203f, 17.993f)
            lineTo(5.483f, 18.308f)
            curveTo(5.593f, 18.323f, 5.681f, 18.41f, 5.696f, 18.521f)
            lineTo(6.011f, 20.801f)
            curveTo(6.1f, 21.447f, 6.774f, 21.836f, 7.378f, 21.59f)
            lineTo(9.51f, 20.723f)
            curveTo(9.614f, 20.681f, 9.733f, 20.713f, 9.801f, 20.802f)
            lineTo(11.214f, 22.618f)
            curveTo(11.614f, 23.133f, 12.392f, 23.133f, 12.793f, 22.618f)
            lineTo(14.205f, 20.802f)
            curveTo(14.274f, 20.713f, 14.393f, 20.681f, 14.497f, 20.723f)
            lineTo(16.628f, 21.59f)
            curveTo(17.233f, 21.836f, 17.906f, 21.447f, 17.996f, 20.801f)
            lineTo(18.311f, 18.521f)
            curveTo(18.326f, 18.41f, 18.413f, 18.323f, 18.524f, 18.308f)
            lineTo(20.804f, 17.993f)
            curveTo(21.45f, 17.903f, 21.839f, 17.23f, 21.593f, 16.626f)
            lineTo(20.726f, 14.494f)
            curveTo(20.684f, 14.39f, 20.716f, 14.271f, 20.805f, 14.203f)
            lineTo(22.621f, 12.79f)
            curveTo(23.136f, 12.389f, 23.136f, 11.611f, 22.621f, 11.211f)
            lineTo(20.805f, 9.798f)
            curveTo(20.716f, 9.73f, 20.684f, 9.611f, 20.726f, 9.507f)
            lineTo(21.593f, 7.375f)
            curveTo(21.839f, 6.771f, 21.45f, 6.098f, 20.804f, 6.008f)
            lineTo(18.524f, 5.693f)
            curveTo(18.413f, 5.678f, 18.326f, 5.59f, 18.311f, 5.48f)
            lineTo(17.996f, 3.2f)
            curveTo(17.906f, 2.554f, 17.233f, 2.165f, 16.628f, 2.411f)
            lineTo(14.497f, 3.278f)
            curveTo(14.393f, 3.32f, 14.274f, 3.288f, 14.205f, 3.199f)
            lineTo(12.793f, 1.383f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.024f to Color(0xFFFFC8D7),
                    0.807f to Color(0xFFFFFFFF),
                ),
                start = Offset(16.305f, 19.823f),
                end = Offset(5.813f, 13.027f),
            ),
            fillAlpha = 0.95f,
        ) {
            moveTo(12f, 7f)
            curveTo(12.414f, 7f, 12.75f, 7.336f, 12.75f, 7.75f)
            verticalLineTo(11.25f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 11.25f, 17f, 11.586f, 17f, 12f)
            curveTo(17f, 12.414f, 16.664f, 12.75f, 16.25f, 12.75f)
            horizontalLineTo(12.75f)
            verticalLineTo(16.25f)
            curveTo(12.75f, 16.664f, 12.414f, 17f, 12f, 17f)
            curveTo(11.586f, 17f, 11.25f, 16.664f, 11.25f, 16.25f)
            verticalLineTo(12.75f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 12.75f, 7f, 12.414f, 7f, 12f)
            curveTo(7f, 11.586f, 7.336f, 11.25f, 7.75f, 11.25f)
            horizontalLineTo(11.25f)
            verticalLineTo(7.75f)
            curveTo(11.25f, 7.336f, 11.586f, 7f, 12f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AddStarburstPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.AddStarburst, contentDescription = null)
    }
}
