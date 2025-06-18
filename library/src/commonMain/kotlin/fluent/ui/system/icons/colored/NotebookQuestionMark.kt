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

public val FluentUi.Colored.NotebookQuestionMark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.NotebookQuestionMark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD373FC),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(18.5f, 0.501f),
                end = Offset(27.052f, 20.789f)
            )
        ) {
            moveTo(18.5f, 15f)
            lineTo(20.25f, 15f)
            curveTo(20.63f, 15f, 20.944f, 15.282f, 20.993f, 15.648f)
            lineTo(21f, 15.75f)
            verticalLineTo(17.248f)
            curveTo(21f, 17.628f, 20.718f, 17.942f, 20.352f, 17.991f)
            lineTo(20.25f, 17.998f)
            lineTo(18.5f, 17.998f)
            verticalLineTo(15f)
            lineTo(20.25f, 15f)
            lineTo(18.5f, 15f)
            close()
            moveTo(18.5f, 11f)
            lineTo(20.25f, 11f)
            curveTo(20.63f, 11f, 20.944f, 11.282f, 20.993f, 11.648f)
            lineTo(21f, 11.75f)
            verticalLineTo(13.248f)
            curveTo(21f, 13.628f, 20.718f, 13.942f, 20.352f, 13.991f)
            lineTo(20.25f, 13.998f)
            lineTo(18.5f, 13.998f)
            verticalLineTo(11f)
            lineTo(20.25f, 11f)
            lineTo(18.5f, 11f)
            close()
            moveTo(18.5f, 7f)
            lineTo(20.25f, 7f)
            curveTo(20.63f, 7f, 20.944f, 7.282f, 20.993f, 7.648f)
            lineTo(21f, 7.75f)
            verticalLineTo(9.248f)
            curveTo(21f, 9.628f, 20.718f, 9.942f, 20.352f, 9.991f)
            lineTo(20.25f, 9.998f)
            lineTo(18.5f, 9.998f)
            verticalLineTo(7f)
            lineTo(20.25f, 7f)
            lineTo(18.5f, 7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE587F2),
                    1f to Color(0xFF816CDE)
                ),
                start = Offset(2.125f, 2f),
                end = Offset(1.006f, 24.381f)
            )
        ) {
            moveTo(16.749f, 2f)
            curveTo(17.992f, 2f, 18.999f, 3.007f, 18.999f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18.999f, 20.993f, 17.992f, 22f, 16.749f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(16.749f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(10.875f, 0.75f),
                radius = 22.901f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(16.749f, 2f)
            curveTo(17.992f, 2f, 18.999f, 3.007f, 18.999f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18.999f, 20.993f, 17.992f, 22f, 16.749f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(16.749f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDD3FF),
                    1f to Color(0xFFF3D8FF)
                ),
                start = Offset(8.687f, 5f),
                end = Offset(17.134f, 10.128f)
            )
        ) {
            moveTo(15.249f, 5f)
            curveTo(15.663f, 5f, 15.999f, 5.336f, 15.999f, 5.75f)
            verticalLineTo(8.248f)
            curveTo(15.999f, 8.663f, 15.663f, 8.998f, 15.249f, 8.998f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 8.998f, 7f, 8.663f, 7f, 8.248f)
            verticalLineTo(5.75f)
            curveTo(7f, 5.336f, 7.336f, 5f, 7.75f, 5f)
            horizontalLineTo(15.249f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFDC8AFD),
                    1f to Color(0x00DC8AFD)
                ),
                center = Offset(9f, 16.688f),
                radius = 12.668f
            )
        ) {
            moveTo(16.749f, 2f)
            curveTo(17.992f, 2f, 18.999f, 3.007f, 18.999f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18.999f, 20.993f, 17.992f, 22f, 16.749f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(16.749f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2052CB),
                    1f to Color(0x002052CB)
                ),
                center = Offset(8.375f, 18.953f),
                radius = 5.126f
            )
        ) {
            moveTo(16.749f, 2f)
            curveTo(17.992f, 2f, 18.999f, 3.007f, 18.999f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18.999f, 20.993f, 17.992f, 22f, 16.749f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(16.749f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(1f, 12f),
                end = Offset(12f, 23f)
            )
        ) {
            moveTo(6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(4.971f, 14.128f),
                end = Offset(7.113f, 21.311f)
            )
        ) {
            moveTo(6.5f, 19.88f)
            curveTo(6.155f, 19.88f, 5.875f, 20.16f, 5.875f, 20.504f)
            curveTo(5.875f, 20.849f, 6.155f, 21.129f, 6.5f, 21.129f)
            curveTo(6.845f, 21.129f, 7.124f, 20.849f, 7.124f, 20.504f)
            curveTo(7.124f, 20.16f, 6.845f, 19.88f, 6.5f, 19.88f)
            close()
            moveTo(6.5f, 14.003f)
            curveTo(5.452f, 14.003f, 4.636f, 14.821f, 4.647f, 15.957f)
            curveTo(4.649f, 16.233f, 4.875f, 16.455f, 5.151f, 16.452f)
            curveTo(5.427f, 16.45f, 5.649f, 16.224f, 5.647f, 15.948f)
            curveTo(5.641f, 15.369f, 6.006f, 15.003f, 6.5f, 15.003f)
            curveTo(6.972f, 15.003f, 7.353f, 15.395f, 7.353f, 15.953f)
            curveTo(7.353f, 16.177f, 7.278f, 16.344f, 7.035f, 16.63f)
            lineTo(6.936f, 16.743f)
            lineTo(6.671f, 17.033f)
            curveTo(6.187f, 17.575f, 6f, 17.926f, 6f, 18.501f)
            curveTo(6f, 18.777f, 6.224f, 19.001f, 6.5f, 19.001f)
            curveTo(6.776f, 19.001f, 7f, 18.777f, 7f, 18.501f)
            curveTo(7f, 18.268f, 7.076f, 18.098f, 7.324f, 17.806f)
            lineTo(7.425f, 17.691f)
            lineTo(7.69f, 17.4f)
            curveTo(8.168f, 16.866f, 8.353f, 16.519f, 8.353f, 15.953f)
            curveTo(8.353f, 14.849f, 7.531f, 14.003f, 6.5f, 14.003f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NotebookQuestionMarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.NotebookQuestionMark, contentDescription = null)
    }
}
