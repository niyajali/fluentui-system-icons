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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.CircleMultipleHintCheckmark: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Colored.CircleMultipleHintCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF8B52F4),
                        0.395f to Color(0xFF6D37CD),
                        0.862f to Color(0xFF4B20A0),
                    ),
                    start = Offset(3.101f, 6.367f),
                    end = Offset(15.55f, 12.376f),
                ),
            ) {
                moveTo(4.891f, 14.023f)
                curveTo(5.144f, 13.77f, 5.535f, 13.73f, 5.856f, 13.888f)
                curveTo(6.552f, 14.23f, 7.326f, 14.441f, 8.142f, 14.49f)
                curveTo(8.05f, 14.973f, 8.001f, 15.473f, 8f, 15.984f)
                curveTo(6.932f, 15.913f, 5.926f, 15.62f, 5.027f, 15.15f)
                curveTo(4.602f, 14.927f, 4.552f, 14.361f, 4.891f, 14.023f)
                close()
                moveTo(8.5f, 3.5f)
                curveTo(11.228f, 3.5f, 13.444f, 5.685f, 13.498f, 8.401f)
                curveTo(11.093f, 9.192f, 9.192f, 11.092f, 8.401f, 13.497f)
                curveTo(5.686f, 13.444f, 3.501f, 11.228f, 3.5f, 8.5f)
                curveTo(3.5f, 5.739f, 5.739f, 3.5f, 8.5f, 3.5f)
                close()
                moveTo(2.091f, 10f)
                curveTo(2.443f, 10f, 2.744f, 10.24f, 2.866f, 10.57f)
                curveTo(3.013f, 10.971f, 3.203f, 11.352f, 3.428f, 11.708f)
                curveTo(3.635f, 12.035f, 3.616f, 12.469f, 3.342f, 12.742f)
                curveTo(3.028f, 13.056f, 2.509f, 13.035f, 2.262f, 12.666f)
                curveTo(1.901f, 12.126f, 1.608f, 11.536f, 1.395f, 10.909f)
                curveTo(1.239f, 10.448f, 1.605f, 10f, 2.091f, 10f)
                close()
                moveTo(14.022f, 4.891f)
                curveTo(14.361f, 4.552f, 14.927f, 4.603f, 15.149f, 5.028f)
                curveTo(15.619f, 5.927f, 15.913f, 6.933f, 15.983f, 8f)
                curveTo(15.472f, 8.001f, 14.973f, 8.05f, 14.489f, 8.143f)
                curveTo(14.441f, 7.326f, 14.23f, 6.553f, 13.887f, 5.857f)
                curveTo(13.73f, 5.536f, 13.769f, 5.144f, 14.022f, 4.891f)
                close()
                moveTo(1.85f, 5.028f)
                curveTo(2.072f, 4.603f, 2.637f, 4.553f, 2.976f, 4.891f)
                curveTo(3.229f, 5.144f, 3.269f, 5.536f, 3.112f, 5.857f)
                curveTo(2.888f, 6.312f, 2.719f, 6.8f, 2.617f, 7.311f)
                curveTo(2.539f, 7.696f, 2.217f, 8f, 1.824f, 8f)
                curveTo(1.387f, 8f, 1.036f, 7.629f, 1.112f, 7.198f)
                curveTo(1.247f, 6.428f, 1.499f, 5.698f, 1.85f, 5.028f)
                close()
                moveTo(6.644f, 1.232f)
                curveTo(7.091f, 1.118f, 7.5f, 1.476f, 7.5f, 1.938f)
                curveTo(7.499f, 2.31f, 7.228f, 2.623f, 6.87f, 2.724f)
                curveTo(6.306f, 2.883f, 5.775f, 3.122f, 5.292f, 3.429f)
                curveTo(4.964f, 3.636f, 4.531f, 3.617f, 4.257f, 3.343f)
                curveTo(3.943f, 3.029f, 3.963f, 2.51f, 4.333f, 2.263f)
                curveTo(5.029f, 1.797f, 5.809f, 1.444f, 6.644f, 1.232f)
                close()
                moveTo(9.5f, 1.938f)
                curveTo(9.5f, 1.476f, 9.907f, 1.118f, 10.354f, 1.232f)
                curveTo(11.189f, 1.444f, 11.969f, 1.797f, 12.665f, 2.263f)
                curveTo(13.035f, 2.51f, 13.056f, 3.029f, 12.742f, 3.343f)
                curveTo(12.468f, 3.617f, 12.035f, 3.636f, 11.708f, 3.429f)
                curveTo(11.224f, 3.122f, 10.693f, 2.883f, 10.129f, 2.724f)
                curveTo(9.771f, 2.623f, 9.5f, 2.31f, 9.5f, 1.938f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFC470),
                        0.251f to Color(0xFFFF835C),
                        0.584f to Color(0xFFF24A9D),
                        0.871f to Color(0xFFB339F0),
                        1f to Color(0xFFC354FF),
                    ),
                    center = Offset(9f, 9.521f),
                    radius = 18.38f,
                ),
            ) {
                moveTo(16f, 16f)
                moveToRelative(-7f, 0f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14f, 0f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.024f to Color(0xFFFFC8D7),
                        0.807f to Color(0xFFFFFFFF),
                    ),
                    start = Offset(16.94f, 21.461f),
                    end = Offset(12.6f, 14.818f),
                ),
                fillAlpha = 0.95f,
            ) {
                moveTo(19.78f, 15.03f)
                curveTo(20.073f, 14.737f, 20.073f, 14.263f, 19.78f, 13.97f)
                curveTo(19.487f, 13.677f, 19.012f, 13.677f, 18.719f, 13.97f)
                lineTo(15.499f, 17.189f)
                lineTo(13.78f, 15.47f)
                curveTo(13.487f, 15.177f, 13.012f, 15.177f, 12.719f, 15.47f)
                curveTo(12.426f, 15.763f, 12.426f, 16.237f, 12.719f, 16.53f)
                lineTo(14.969f, 18.78f)
                curveTo(15.11f, 18.921f, 15.3f, 19f, 15.499f, 19f)
                curveTo(15.698f, 19f, 15.889f, 18.921f, 16.03f, 18.78f)
                lineTo(19.78f, 15.03f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun CircleMultipleHintCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.CircleMultipleHintCheckmark, contentDescription = null)
    }
}
