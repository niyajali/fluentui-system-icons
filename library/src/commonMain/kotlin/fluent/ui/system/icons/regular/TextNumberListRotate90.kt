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

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * TextNumberListRotate90 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, number, list, rotate90
 * - Source: ic_fluent_text_number_list_rotate_90_24_regular.svg
 * 
 * @return The [ImageVector] for the TextNumberListRotate90 icon.
 */
public val FluentIcons.Regular.TextNumberListRotate90: ImageVector
    get() {
        if (_textNumberListRotate90 != null) {
            return _textNumberListRotate90!!
        }
        _textNumberListRotate90 = Builder(name = "TextNumberListRotate90", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.25f, 6.0f)
                curveTo(21.604f, 6.0f, 21.91f, 5.752f, 21.984f, 5.406f)
                curveTo(22.057f, 5.06f, 21.879f, 4.71f, 21.557f, 4.566f)
                lineTo(21.554f, 4.564f)
                curveTo(21.549f, 4.562f, 21.541f, 4.558f, 21.53f, 4.553f)
                curveTo(21.506f, 4.541f, 21.469f, 4.523f, 21.422f, 4.497f)
                curveTo(21.326f, 4.445f, 21.191f, 4.366f, 21.038f, 4.259f)
                curveTo(20.725f, 4.042f, 20.375f, 3.735f, 20.136f, 3.353f)
                curveTo(19.917f, 3.001f, 19.454f, 2.895f, 19.103f, 3.114f)
                curveTo(18.751f, 3.333f, 18.645f, 3.796f, 18.864f, 4.147f)
                curveTo(18.942f, 4.272f, 19.025f, 4.39f, 19.112f, 4.5f)
                lineTo(16.75f, 4.5f)
                curveTo(16.336f, 4.5f, 16.0f, 4.836f, 16.0f, 5.25f)
                curveTo(16.0f, 5.664f, 16.336f, 6.0f, 16.75f, 6.0f)
                lineTo(21.25f, 6.0f)
                close()
                moveTo(5.25f, 20.5f)
                curveTo(5.664f, 20.5f, 6.0f, 20.164f, 6.0f, 19.75f)
                lineTo(6.0f, 10.75f)
                curveTo(6.0f, 10.335f, 5.664f, 10.0f, 5.25f, 10.0f)
                curveTo(4.836f, 10.0f, 4.5f, 10.335f, 4.5f, 10.75f)
                lineTo(4.5f, 19.75f)
                curveTo(4.5f, 20.164f, 4.836f, 20.5f, 5.25f, 20.5f)
                close()
                moveTo(11.756f, 20.5f)
                curveTo(12.171f, 20.5f, 12.506f, 20.164f, 12.506f, 19.75f)
                lineTo(12.506f, 10.75f)
                curveTo(12.506f, 10.335f, 12.171f, 10.0f, 11.756f, 10.0f)
                curveTo(11.342f, 10.0f, 11.006f, 10.335f, 11.006f, 10.75f)
                lineTo(11.006f, 19.75f)
                curveTo(11.006f, 20.164f, 11.342f, 20.5f, 11.756f, 20.5f)
                close()
                moveTo(18.25f, 20.5f)
                curveTo(18.664f, 20.5f, 19.0f, 20.164f, 19.0f, 19.75f)
                verticalLineTo(10.75f)
                curveTo(19.0f, 10.335f, 18.664f, 10.0f, 18.25f, 10.0f)
                curveTo(17.836f, 10.0f, 17.5f, 10.335f, 17.5f, 10.75f)
                lineTo(17.5f, 19.75f)
                curveTo(17.5f, 20.164f, 17.836f, 20.5f, 18.25f, 20.5f)
                close()
                moveTo(13.48f, 5.151f)
                curveTo(13.533f, 4.85f, 13.414f, 4.474f, 13.22f, 4.28f)
                curveTo(12.927f, 3.987f, 12.927f, 3.513f, 13.22f, 3.22f)
                curveTo(13.513f, 2.927f, 13.987f, 2.927f, 14.28f, 3.22f)
                curveTo(14.836f, 3.776f, 15.092f, 4.65f, 14.957f, 5.412f)
                curveTo(14.887f, 5.809f, 14.703f, 6.217f, 14.352f, 6.527f)
                curveTo(13.994f, 6.843f, 13.527f, 7.0f, 13.0f, 7.0f)
                curveTo(12.38f, 7.0f, 11.92f, 6.729f, 11.58f, 6.394f)
                curveTo(11.297f, 6.116f, 11.069f, 5.763f, 10.891f, 5.488f)
                lineTo(10.84f, 5.409f)
                curveTo(10.713f, 5.213f, 10.603f, 5.054f, 10.5f, 4.927f)
                verticalLineTo(6.25f)
                curveTo(10.5f, 6.664f, 10.164f, 7.0f, 9.75f, 7.0f)
                curveTo(9.336f, 7.0f, 9.0f, 6.664f, 9.0f, 6.25f)
                verticalLineTo(3.75f)
                curveTo(9.0f, 3.336f, 9.336f, 3.0f, 9.75f, 3.0f)
                curveTo(11.064f, 3.0f, 11.703f, 3.984f, 12.087f, 4.575f)
                lineTo(12.126f, 4.635f)
                curveTo(12.332f, 4.953f, 12.472f, 5.168f, 12.631f, 5.325f)
                curveTo(12.767f, 5.459f, 12.869f, 5.5f, 13.0f, 5.5f)
                curveTo(13.223f, 5.5f, 13.318f, 5.439f, 13.359f, 5.402f)
                curveTo(13.406f, 5.361f, 13.457f, 5.285f, 13.48f, 5.151f)
                close()
                moveTo(2.72f, 2.97f)
                curveTo(2.72f, 2.97f, 2.636f, 3.063f, 2.715f, 2.974f)
                lineTo(2.71f, 2.98f)
                lineTo(2.697f, 2.993f)
                curveTo(2.688f, 3.003f, 2.677f, 3.015f, 2.664f, 3.03f)
                curveTo(2.639f, 3.058f, 2.607f, 3.097f, 2.572f, 3.144f)
                curveTo(2.501f, 3.238f, 2.414f, 3.37f, 2.329f, 3.54f)
                curveTo(2.158f, 3.881f, 2.0f, 4.37f, 2.0f, 5.0f)
                curveTo(2.0f, 5.639f, 2.181f, 6.196f, 2.54f, 6.601f)
                curveTo(2.9f, 7.009f, 3.397f, 7.212f, 3.899f, 7.196f)
                curveTo(4.315f, 7.182f, 4.695f, 7.029f, 5.0f, 6.77f)
                curveTo(5.305f, 7.029f, 5.685f, 7.182f, 6.101f, 7.196f)
                curveTo(6.603f, 7.212f, 7.1f, 7.009f, 7.46f, 6.601f)
                curveTo(7.819f, 6.196f, 8.0f, 5.639f, 8.0f, 5.0f)
                curveTo(8.0f, 4.37f, 7.842f, 3.881f, 7.671f, 3.54f)
                curveTo(7.586f, 3.37f, 7.499f, 3.238f, 7.428f, 3.144f)
                curveTo(7.393f, 3.097f, 7.361f, 3.058f, 7.336f, 3.03f)
                curveTo(7.323f, 3.015f, 7.312f, 3.003f, 7.303f, 2.993f)
                lineTo(7.29f, 2.98f)
                lineTo(7.285f, 2.974f)
                lineTo(7.282f, 2.972f)
                lineTo(7.282f, 2.971f)
                lineTo(7.28f, 2.97f)
                curveTo(6.987f, 2.677f, 6.513f, 2.677f, 6.22f, 2.97f)
                curveTo(5.931f, 3.259f, 5.927f, 3.725f, 6.208f, 4.018f)
                curveTo(6.211f, 4.022f, 6.218f, 4.03f, 6.228f, 4.044f)
                curveTo(6.251f, 4.074f, 6.289f, 4.13f, 6.329f, 4.21f)
                curveTo(6.408f, 4.369f, 6.5f, 4.63f, 6.5f, 5.0f)
                curveTo(6.5f, 5.361f, 6.4f, 5.536f, 6.336f, 5.608f)
                curveTo(6.275f, 5.678f, 6.209f, 5.698f, 6.149f, 5.696f)
                curveTo(6.084f, 5.694f, 5.997f, 5.664f, 5.918f, 5.573f)
                curveTo(5.842f, 5.484f, 5.75f, 5.31f, 5.75f, 5.0f)
                curveTo(5.75f, 4.586f, 5.414f, 4.25f, 5.0f, 4.25f)
                curveTo(4.586f, 4.25f, 4.25f, 4.586f, 4.25f, 5.0f)
                curveTo(4.25f, 5.31f, 4.158f, 5.484f, 4.082f, 5.573f)
                curveTo(4.003f, 5.664f, 3.916f, 5.694f, 3.851f, 5.696f)
                curveTo(3.791f, 5.698f, 3.725f, 5.678f, 3.664f, 5.608f)
                curveTo(3.6f, 5.536f, 3.5f, 5.361f, 3.5f, 5.0f)
                curveTo(3.5f, 4.63f, 3.592f, 4.369f, 3.671f, 4.21f)
                curveTo(3.711f, 4.13f, 3.749f, 4.074f, 3.772f, 4.044f)
                curveTo(3.782f, 4.03f, 3.789f, 4.022f, 3.792f, 4.018f)
                curveTo(4.073f, 3.725f, 4.069f, 3.259f, 3.78f, 2.97f)
                curveTo(3.487f, 2.677f, 3.013f, 2.677f, 2.72f, 2.97f)
                close()
                moveTo(7.282f, 2.972f)
                lineTo(7.282f, 2.971f)
                curveTo(7.287f, 2.978f, 7.449f, 3.172f, 7.282f, 2.972f)
                close()
            }
        }
        .build()
        return _textNumberListRotate90!!
    }

@Suppress("ObjectPropertyName")
private var _textNumberListRotate90: ImageVector? = null

@Preview
@Composable
private fun TextNumberListRotate90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextNumberListRotate90, contentDescription = null)
    }
}

