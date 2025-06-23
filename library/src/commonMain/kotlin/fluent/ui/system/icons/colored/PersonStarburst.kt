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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.PersonStarburst: ImageVector
    get() {
        if (_PersonStarburst != null) {
            return _PersonStarburst!!
        }
        _PersonStarburst = ImageVector.Builder(
            name = "Colored.PersonStarburst",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1EC8B0),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(5.262f, 0.763f),
                    end = Offset(15.375f, 23.236f)
                )
            ) {
                moveTo(9.84f, 2.034f)
                curveTo(9.952f, 2.072f, 10.062f, 2.118f, 10.169f, 2.17f)
                lineTo(11.452f, 2.802f)
                curveTo(11.8f, 2.973f, 12.208f, 2.973f, 12.556f, 2.802f)
                lineTo(13.839f, 2.17f)
                curveTo(15.201f, 1.499f, 16.85f, 2.06f, 17.521f, 3.423f)
                lineTo(17.594f, 3.585f)
                lineTo(17.657f, 3.752f)
                lineTo(18.117f, 5.105f)
                curveTo(18.242f, 5.473f, 18.531f, 5.761f, 18.898f, 5.886f)
                lineTo(20.252f, 6.347f)
                curveTo(21.69f, 6.836f, 22.459f, 8.398f, 21.969f, 9.836f)
                curveTo(21.931f, 9.948f, 21.886f, 10.058f, 21.833f, 10.165f)
                lineTo(21.202f, 11.448f)
                curveTo(21.03f, 11.796f, 21.03f, 12.204f, 21.202f, 12.552f)
                lineTo(21.833f, 13.835f)
                curveTo(22.504f, 15.197f, 21.943f, 16.846f, 20.581f, 17.517f)
                curveTo(20.474f, 17.569f, 20.364f, 17.615f, 20.252f, 17.653f)
                lineTo(18.898f, 18.113f)
                curveTo(18.531f, 18.238f, 18.242f, 18.527f, 18.117f, 18.894f)
                lineTo(17.657f, 20.248f)
                curveTo(17.168f, 21.686f, 15.606f, 22.455f, 14.168f, 21.966f)
                curveTo(14.055f, 21.927f, 13.945f, 21.882f, 13.839f, 21.829f)
                lineTo(12.556f, 21.198f)
                curveTo(12.208f, 21.026f, 11.8f, 21.026f, 11.452f, 21.198f)
                lineTo(10.169f, 21.829f)
                curveTo(8.806f, 22.5f, 7.158f, 21.939f, 6.487f, 20.577f)
                curveTo(6.434f, 20.47f, 6.389f, 20.36f, 6.351f, 20.248f)
                lineTo(5.89f, 18.894f)
                curveTo(5.765f, 18.527f, 5.477f, 18.238f, 5.109f, 18.113f)
                lineTo(3.756f, 17.653f)
                curveTo(2.318f, 17.164f, 1.549f, 15.602f, 2.038f, 14.164f)
                curveTo(2.076f, 14.051f, 2.122f, 13.941f, 2.174f, 13.835f)
                lineTo(2.806f, 12.552f)
                curveTo(2.977f, 12.204f, 2.977f, 11.796f, 2.806f, 11.448f)
                lineTo(2.174f, 10.165f)
                curveTo(1.503f, 8.802f, 2.064f, 7.154f, 3.427f, 6.483f)
                curveTo(3.533f, 6.431f, 3.643f, 6.385f, 3.756f, 6.347f)
                lineTo(5.109f, 5.886f)
                curveTo(5.477f, 5.761f, 5.765f, 5.473f, 5.89f, 5.105f)
                lineTo(6.351f, 3.752f)
                curveTo(6.84f, 2.314f, 8.402f, 1.545f, 9.84f, 2.034f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.533f to Color(0x00FF6CE8),
                        1f to Color(0xFFFF6CE8)
                    ),
                    start = Offset(15.134f, 4.371f),
                    end = Offset(19.142f, 24.288f)
                ),
                fillAlpha = 0.7f,
            ) {
                moveTo(9.84f, 2.034f)
                curveTo(9.952f, 2.072f, 10.062f, 2.118f, 10.169f, 2.17f)
                lineTo(11.452f, 2.802f)
                curveTo(11.8f, 2.973f, 12.208f, 2.973f, 12.556f, 2.802f)
                lineTo(13.839f, 2.17f)
                curveTo(15.201f, 1.499f, 16.85f, 2.06f, 17.521f, 3.423f)
                lineTo(17.594f, 3.585f)
                lineTo(17.657f, 3.752f)
                lineTo(18.117f, 5.105f)
                curveTo(18.242f, 5.473f, 18.531f, 5.761f, 18.898f, 5.886f)
                lineTo(20.252f, 6.347f)
                curveTo(21.69f, 6.836f, 22.459f, 8.398f, 21.969f, 9.836f)
                curveTo(21.931f, 9.948f, 21.886f, 10.058f, 21.833f, 10.165f)
                lineTo(21.202f, 11.448f)
                curveTo(21.03f, 11.796f, 21.03f, 12.204f, 21.202f, 12.552f)
                lineTo(21.833f, 13.835f)
                curveTo(22.504f, 15.197f, 21.943f, 16.846f, 20.581f, 17.517f)
                curveTo(20.474f, 17.569f, 20.364f, 17.615f, 20.252f, 17.653f)
                lineTo(18.898f, 18.113f)
                curveTo(18.531f, 18.238f, 18.242f, 18.527f, 18.117f, 18.894f)
                lineTo(17.657f, 20.248f)
                curveTo(17.168f, 21.686f, 15.606f, 22.455f, 14.168f, 21.966f)
                curveTo(14.055f, 21.927f, 13.945f, 21.882f, 13.839f, 21.829f)
                lineTo(12.556f, 21.198f)
                curveTo(12.208f, 21.026f, 11.8f, 21.026f, 11.452f, 21.198f)
                lineTo(10.169f, 21.829f)
                curveTo(8.806f, 22.5f, 7.158f, 21.939f, 6.487f, 20.577f)
                curveTo(6.434f, 20.47f, 6.389f, 20.36f, 6.351f, 20.248f)
                lineTo(5.89f, 18.894f)
                curveTo(5.765f, 18.527f, 5.477f, 18.238f, 5.109f, 18.113f)
                lineTo(3.756f, 17.653f)
                curveTo(2.318f, 17.164f, 1.549f, 15.602f, 2.038f, 14.164f)
                curveTo(2.076f, 14.051f, 2.122f, 13.941f, 2.174f, 13.835f)
                lineTo(2.806f, 12.552f)
                curveTo(2.977f, 12.204f, 2.977f, 11.796f, 2.806f, 11.448f)
                lineTo(2.174f, 10.165f)
                curveTo(1.503f, 8.802f, 2.064f, 7.154f, 3.427f, 6.483f)
                curveTo(3.533f, 6.431f, 3.643f, 6.385f, 3.756f, 6.347f)
                lineTo(5.109f, 5.886f)
                curveTo(5.477f, 5.761f, 5.765f, 5.473f, 5.89f, 5.105f)
                lineTo(6.351f, 3.752f)
                curveTo(6.84f, 2.314f, 8.402f, 1.545f, 9.84f, 2.034f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF9DEAFF),
                        1f to Color(0xFFFFFFFF)
                    ),
                    start = Offset(19.246f, 28.381f),
                    end = Offset(-1.946f, -2.712f)
                ),
                fillAlpha = 0.9f,
            ) {
                moveTo(12f, 5.965f)
                curveTo(10.667f, 5.965f, 9.586f, 7.046f, 9.586f, 8.379f)
                curveTo(9.586f, 9.712f, 10.667f, 10.793f, 12f, 10.793f)
                curveTo(13.333f, 10.793f, 14.414f, 9.712f, 14.414f, 8.379f)
                curveTo(14.414f, 7.046f, 13.333f, 5.965f, 12f, 5.965f)
                close()
                moveTo(15.017f, 12f)
                lineTo(8.982f, 12f)
                curveTo(7.982f, 12f, 7.172f, 12.811f, 7.172f, 13.81f)
                curveTo(7.172f, 15.157f, 7.726f, 16.237f, 8.635f, 16.966f)
                curveTo(9.53f, 17.685f, 10.729f, 18.035f, 12f, 18.035f)
                curveTo(13.271f, 18.035f, 14.47f, 17.685f, 15.365f, 16.966f)
                curveTo(16.274f, 16.237f, 16.828f, 15.158f, 16.828f, 13.81f)
                curveTo(16.828f, 12.81f, 16.017f, 12f, 15.017f, 12f)
                close()
            }
        }.build()

        return _PersonStarburst!!
    }

@Suppress("ObjectPropertyName")
private var _PersonStarburst: ImageVector? = null

@Preview
@Composable
private fun PersonStarburstPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.PersonStarburst, contentDescription = null)
    }
}
