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

package fluent.ui.system.icons.filled

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
 * CodeJsRectangle Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent Javascript project node.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_js_rectangle_16_filled.svg)
 * 
 * @return The [ImageVector] for the CodeJsRectangle icon.
 */
public val FluentIcons.Filled.CodeJsRectangle: ImageVector
    get() {
        if (_codeJsRectangle != null) {
            return _codeJsRectangle!!
        }
        _codeJsRectangle = Builder(name = "CodeJsRectangle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.25f, 3.0f)
                horizontalLineTo(2.75f)
                curveTo(1.785f, 3.0f, 1.0f, 3.785f, 1.0f, 4.75f)
                verticalLineTo(12.25f)
                curveTo(1.0f, 13.215f, 1.785f, 14.0f, 2.75f, 14.0f)
                horizontalLineTo(12.25f)
                curveTo(13.215f, 14.0f, 14.0f, 13.215f, 14.0f, 12.25f)
                verticalLineTo(4.75f)
                curveTo(14.0f, 3.785f, 13.215f, 3.0f, 12.25f, 3.0f)
                close()
                moveTo(7.0f, 9.5f)
                curveTo(7.0f, 9.697f, 6.961f, 9.892f, 6.886f, 10.074f)
                curveTo(6.811f, 10.256f, 6.7f, 10.421f, 6.561f, 10.561f)
                curveTo(6.422f, 10.7f, 6.256f, 10.811f, 6.074f, 10.886f)
                curveTo(5.892f, 10.961f, 5.697f, 11.0f, 5.5f, 11.0f)
                curveTo(5.303f, 11.0f, 5.108f, 10.961f, 4.926f, 10.886f)
                curveTo(4.744f, 10.811f, 4.579f, 10.7f, 4.439f, 10.561f)
                curveTo(4.3f, 10.422f, 4.189f, 10.256f, 4.114f, 10.074f)
                curveTo(4.039f, 9.892f, 4.0f, 9.697f, 4.0f, 9.5f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 8.934f, 4.013f, 8.869f, 4.038f, 8.808f)
                curveTo(4.063f, 8.747f, 4.1f, 8.692f, 4.146f, 8.646f)
                curveTo(4.193f, 8.6f, 4.248f, 8.563f, 4.308f, 8.538f)
                curveTo(4.369f, 8.513f, 4.434f, 8.5f, 4.5f, 8.5f)
                curveTo(4.566f, 8.5f, 4.631f, 8.513f, 4.692f, 8.538f)
                curveTo(4.753f, 8.563f, 4.808f, 8.6f, 4.854f, 8.646f)
                curveTo(4.9f, 8.693f, 4.937f, 8.748f, 4.962f, 8.808f)
                curveTo(4.987f, 8.869f, 5.0f, 8.934f, 5.0f, 9.0f)
                verticalLineTo(9.5f)
                curveTo(5.0f, 9.566f, 5.013f, 9.631f, 5.038f, 9.692f)
                curveTo(5.063f, 9.753f, 5.1f, 9.808f, 5.146f, 9.854f)
                curveTo(5.193f, 9.9f, 5.248f, 9.937f, 5.308f, 9.962f)
                curveTo(5.368f, 9.987f, 5.434f, 10.0f, 5.5f, 10.0f)
                curveTo(5.566f, 10.0f, 5.631f, 9.987f, 5.692f, 9.962f)
                curveTo(5.753f, 9.937f, 5.808f, 9.9f, 5.854f, 9.854f)
                curveTo(5.9f, 9.807f, 5.937f, 9.752f, 5.962f, 9.692f)
                curveTo(5.987f, 9.631f, 6.0f, 9.566f, 6.0f, 9.5f)
                verticalLineTo(6.5f)
                curveTo(6.0f, 6.434f, 6.013f, 6.369f, 6.038f, 6.308f)
                curveTo(6.063f, 6.247f, 6.1f, 6.192f, 6.146f, 6.146f)
                curveTo(6.193f, 6.1f, 6.248f, 6.063f, 6.308f, 6.038f)
                curveTo(6.369f, 6.013f, 6.434f, 6.0f, 6.5f, 6.0f)
                curveTo(6.566f, 6.0f, 6.631f, 6.013f, 6.692f, 6.038f)
                curveTo(6.753f, 6.063f, 6.808f, 6.1f, 6.854f, 6.146f)
                curveTo(6.9f, 6.193f, 6.937f, 6.248f, 6.962f, 6.308f)
                curveTo(6.987f, 6.369f, 7.0f, 6.434f, 7.0f, 6.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(9.875f, 7.127f)
                curveTo(9.795f, 7.047f, 9.688f, 7.003f, 9.575f, 7.002f)
                horizontalLineTo(9.429f)
                curveTo(9.316f, 7.002f, 9.209f, 7.047f, 9.129f, 7.127f)
                curveTo(9.05f, 7.207f, 9.005f, 7.314f, 9.004f, 7.427f)
                curveTo(9.004f, 7.506f, 9.025f, 7.584f, 9.067f, 7.651f)
                curveTo(9.108f, 7.719f, 9.168f, 7.773f, 9.239f, 7.808f)
                lineTo(10.215f, 8.297f)
                curveTo(10.501f, 8.442f, 10.73f, 8.678f, 10.865f, 8.969f)
                curveTo(11.003f, 9.259f, 11.038f, 9.588f, 10.965f, 9.901f)
                curveTo(10.892f, 10.213f, 10.716f, 10.492f, 10.465f, 10.692f)
                curveTo(10.213f, 10.891f, 9.901f, 11.0f, 9.58f, 11.0f)
                horizontalLineTo(9.434f)
                curveTo(9.245f, 11.0f, 9.059f, 10.962f, 8.888f, 10.891f)
                curveTo(8.716f, 10.82f, 8.559f, 10.716f, 8.425f, 10.582f)
                curveTo(8.29f, 10.449f, 8.184f, 10.291f, 8.112f, 10.12f)
                curveTo(8.04f, 9.948f, 8.001f, 9.763f, 8.0f, 9.573f)
                curveTo(7.999f, 9.437f, 8.05f, 9.305f, 8.143f, 9.205f)
                curveTo(8.236f, 9.105f, 8.364f, 9.044f, 8.5f, 9.036f)
                curveTo(8.564f, 9.032f, 8.628f, 9.041f, 8.688f, 9.063f)
                curveTo(8.748f, 9.084f, 8.803f, 9.118f, 8.849f, 9.163f)
                curveTo(8.896f, 9.206f, 8.934f, 9.259f, 8.96f, 9.317f)
                curveTo(8.985f, 9.375f, 8.999f, 9.437f, 9.0f, 9.5f)
                curveTo(8.993f, 9.561f, 8.999f, 9.623f, 9.017f, 9.682f)
                curveTo(9.035f, 9.741f, 9.065f, 9.796f, 9.105f, 9.843f)
                curveTo(9.145f, 9.89f, 9.194f, 9.928f, 9.249f, 9.955f)
                curveTo(9.305f, 9.982f, 9.365f, 9.997f, 9.427f, 10.0f)
                horizontalLineTo(9.573f)
                curveTo(9.629f, 10.0f, 9.684f, 9.988f, 9.735f, 9.967f)
                curveTo(9.786f, 9.946f, 9.833f, 9.915f, 9.873f, 9.875f)
                curveTo(9.953f, 9.795f, 9.997f, 9.688f, 9.998f, 9.575f)
                curveTo(9.998f, 9.496f, 9.977f, 9.418f, 9.935f, 9.351f)
                curveTo(9.894f, 9.283f, 9.834f, 9.229f, 9.763f, 9.194f)
                lineTo(8.787f, 8.702f)
                curveTo(8.501f, 8.557f, 8.273f, 8.321f, 8.138f, 8.03f)
                curveTo(8.003f, 7.74f, 7.969f, 7.413f, 8.043f, 7.101f)
                curveTo(8.116f, 6.789f, 8.292f, 6.511f, 8.543f, 6.312f)
                curveTo(9.118f, 5.854f, 10.059f, 5.897f, 10.582f, 6.418f)
                curveTo(10.849f, 6.686f, 11.0f, 7.049f, 11.0f, 7.427f)
                curveTo(11.0f, 7.563f, 10.95f, 7.695f, 10.857f, 7.795f)
                curveTo(10.764f, 7.895f, 10.636f, 7.956f, 10.5f, 7.964f)
                curveTo(10.436f, 7.968f, 10.372f, 7.959f, 10.312f, 7.937f)
                curveTo(10.252f, 7.916f, 10.197f, 7.881f, 10.151f, 7.837f)
                curveTo(10.104f, 7.794f, 10.066f, 7.742f, 10.041f, 7.683f)
                curveTo(10.015f, 7.625f, 10.001f, 7.563f, 10.0f, 7.5f)
                verticalLineTo(7.427f)
                curveTo(10.0f, 7.314f, 9.954f, 7.207f, 9.875f, 7.127f)
                close()
            }
        }
        .build()
        return _codeJsRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _codeJsRectangle: ImageVector? = null

@Preview
@Composable
private fun CodeJsRectanglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CodeJsRectangle, contentDescription = "CodeJsRectangle Icon")
    }
}

