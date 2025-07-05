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
 * CodeTsRectangle Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent TypeScript project node.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_ts_rectangle_16_regular.svg)
 * 
 * @return The [ImageVector] for the CodeTsRectangle icon.
 */
public val FluentIcons.Regular.CodeTsRectangle: ImageVector
    get() {
        if (_codeTsRectangle != null) {
            return _codeTsRectangle!!
        }
        _codeTsRectangle = Builder(name = "CodeTsRectangle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.865f, 8.969f)
                curveTo(11.002f, 9.259f, 11.038f, 9.588f, 10.965f, 9.901f)
                curveTo(10.892f, 10.213f, 10.716f, 10.492f, 10.465f, 10.692f)
                curveTo(10.213f, 10.891f, 9.901f, 11.0f, 9.58f, 11.0f)
                horizontalLineTo(9.434f)
                curveTo(9.056f, 11.0f, 8.693f, 10.849f, 8.425f, 10.582f)
                curveTo(8.155f, 10.315f, 8.002f, 9.952f, 8.0f, 9.573f)
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
                curveTo(9.686f, 9.999f, 9.793f, 9.954f, 9.873f, 9.875f)
                curveTo(9.952f, 9.795f, 9.997f, 9.688f, 9.998f, 9.575f)
                curveTo(9.999f, 9.496f, 9.977f, 9.418f, 9.935f, 9.351f)
                curveTo(9.894f, 9.283f, 9.834f, 9.229f, 9.763f, 9.194f)
                lineTo(8.787f, 8.702f)
                curveTo(8.501f, 8.557f, 8.273f, 8.321f, 8.138f, 8.03f)
                curveTo(8.003f, 7.74f, 7.969f, 7.413f, 8.043f, 7.101f)
                curveTo(8.116f, 6.789f, 8.292f, 6.511f, 8.543f, 6.312f)
                curveTo(8.794f, 6.112f, 9.106f, 6.002f, 9.427f, 6.0f)
                horizontalLineTo(9.573f)
                curveTo(9.951f, 6.0f, 10.314f, 6.151f, 10.582f, 6.418f)
                curveTo(10.849f, 6.686f, 11.0f, 7.049f, 11.0f, 7.427f)
                curveTo(11.001f, 7.563f, 10.95f, 7.695f, 10.857f, 7.795f)
                curveTo(10.764f, 7.895f, 10.636f, 7.956f, 10.5f, 7.964f)
                curveTo(10.436f, 7.968f, 10.372f, 7.959f, 10.312f, 7.937f)
                curveTo(10.252f, 7.916f, 10.197f, 7.882f, 10.151f, 7.837f)
                curveTo(10.104f, 7.794f, 10.066f, 7.742f, 10.041f, 7.683f)
                curveTo(10.015f, 7.625f, 10.001f, 7.563f, 10.0f, 7.5f)
                verticalLineTo(7.427f)
                curveTo(9.999f, 7.314f, 9.954f, 7.207f, 9.875f, 7.127f)
                curveTo(9.795f, 7.048f, 9.688f, 7.003f, 9.575f, 7.002f)
                horizontalLineTo(9.429f)
                curveTo(9.316f, 7.003f, 9.209f, 7.048f, 9.129f, 7.127f)
                curveTo(9.05f, 7.207f, 9.005f, 7.314f, 9.004f, 7.427f)
                curveTo(9.004f, 7.506f, 9.025f, 7.584f, 9.067f, 7.651f)
                curveTo(9.108f, 7.719f, 9.168f, 7.773f, 9.239f, 7.808f)
                lineTo(10.215f, 8.297f)
                curveTo(10.501f, 8.442f, 10.73f, 8.678f, 10.865f, 8.969f)
                close()
                moveTo(4.0f, 6.0f)
                curveTo(3.867f, 6.0f, 3.74f, 6.053f, 3.646f, 6.146f)
                curveTo(3.553f, 6.24f, 3.5f, 6.367f, 3.5f, 6.5f)
                curveTo(3.5f, 6.633f, 3.553f, 6.76f, 3.646f, 6.854f)
                curveTo(3.74f, 6.947f, 3.867f, 7.0f, 4.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 10.633f, 5.053f, 10.76f, 5.146f, 10.854f)
                curveTo(5.24f, 10.947f, 5.367f, 11.0f, 5.5f, 11.0f)
                curveTo(5.633f, 11.0f, 5.76f, 10.947f, 5.854f, 10.854f)
                curveTo(5.947f, 10.76f, 6.0f, 10.633f, 6.0f, 10.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                curveTo(7.133f, 7.0f, 7.26f, 6.947f, 7.354f, 6.854f)
                curveTo(7.447f, 6.76f, 7.5f, 6.633f, 7.5f, 6.5f)
                curveTo(7.5f, 6.367f, 7.447f, 6.24f, 7.354f, 6.146f)
                curveTo(7.26f, 6.053f, 7.133f, 6.0f, 7.0f, 6.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(2.75f, 3.0f)
                curveTo(1.783f, 3.0f, 1.0f, 3.783f, 1.0f, 4.75f)
                verticalLineTo(12.25f)
                curveTo(1.0f, 13.217f, 1.783f, 14.0f, 2.75f, 14.0f)
                horizontalLineTo(12.25f)
                curveTo(13.217f, 14.0f, 14.0f, 13.217f, 14.0f, 12.25f)
                verticalLineTo(4.75f)
                curveTo(14.0f, 3.783f, 13.217f, 3.0f, 12.25f, 3.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 4.75f)
                curveTo(2.0f, 4.336f, 2.336f, 4.0f, 2.75f, 4.0f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 4.0f, 13.0f, 4.336f, 13.0f, 4.75f)
                verticalLineTo(12.25f)
                curveTo(13.0f, 12.664f, 12.664f, 13.0f, 12.25f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.0f, 2.0f, 12.664f, 2.0f, 12.25f)
                verticalLineTo(4.75f)
                close()
            }
        }
        .build()
        return _codeTsRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _codeTsRectangle: ImageVector? = null

@Preview
@Composable
private fun CodeTsRectanglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeTsRectangle, contentDescription = "CodeTsRectangle Icon")
    }
}

