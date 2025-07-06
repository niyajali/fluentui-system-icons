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
 * TextNumberListLtr Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Direction: LTR
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains directional and rotational variants. Collection includes Task List & Bullet List.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_number_list_24_regular_ltr.svg)
 * 
 * @return The [ImageVector] for the TextNumberListLtr icon.
 */
public val FluentIcons.Regular.TextNumberListLtr: ImageVector
    get() {
        if (_textNumberListLtr != null) {
            return _textNumberListLtr!!
        }
        _textNumberListLtr = Builder(name = "TextNumberListLtr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 2.75f)
                curveTo(6.0f, 2.396f, 5.752f, 2.09f, 5.406f, 2.016f)
                curveTo(5.06f, 1.943f, 4.71f, 2.121f, 4.566f, 2.443f)
                lineTo(4.564f, 2.446f)
                curveTo(4.562f, 2.451f, 4.558f, 2.459f, 4.553f, 2.47f)
                curveTo(4.541f, 2.494f, 4.523f, 2.531f, 4.497f, 2.578f)
                curveTo(4.445f, 2.674f, 4.366f, 2.81f, 4.259f, 2.963f)
                curveTo(4.042f, 3.275f, 3.735f, 3.625f, 3.353f, 3.864f)
                curveTo(3.001f, 4.083f, 2.895f, 4.546f, 3.114f, 4.897f)
                curveTo(3.333f, 5.249f, 3.796f, 5.356f, 4.147f, 5.136f)
                curveTo(4.272f, 5.058f, 4.39f, 4.975f, 4.5f, 4.888f)
                verticalLineTo(7.25f)
                curveTo(4.5f, 7.664f, 4.836f, 8.0f, 5.25f, 8.0f)
                curveTo(5.664f, 8.0f, 6.0f, 7.664f, 6.0f, 7.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(20.5f, 18.75f)
                curveTo(20.5f, 18.336f, 20.164f, 18.0f, 19.75f, 18.0f)
                horizontalLineTo(10.75f)
                curveTo(10.335f, 18.0f, 10.0f, 18.336f, 10.0f, 18.75f)
                curveTo(10.0f, 19.164f, 10.335f, 19.5f, 10.75f, 19.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 19.5f, 20.5f, 19.164f, 20.5f, 18.75f)
                close()
                moveTo(20.5f, 12.244f)
                curveTo(20.5f, 11.83f, 20.164f, 11.494f, 19.75f, 11.494f)
                horizontalLineTo(10.75f)
                curveTo(10.335f, 11.494f, 10.0f, 11.83f, 10.0f, 12.244f)
                curveTo(10.0f, 12.658f, 10.335f, 12.994f, 10.75f, 12.994f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 12.994f, 20.5f, 12.658f, 20.5f, 12.244f)
                close()
                moveTo(20.5f, 5.75f)
                curveTo(20.5f, 5.336f, 20.164f, 5.0f, 19.75f, 5.0f)
                horizontalLineTo(10.75f)
                curveTo(10.335f, 5.0f, 10.0f, 5.336f, 10.0f, 5.75f)
                curveTo(10.0f, 6.164f, 10.335f, 6.5f, 10.75f, 6.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 6.5f, 20.5f, 6.164f, 20.5f, 5.75f)
                close()
                moveTo(5.151f, 10.52f)
                curveTo(4.85f, 10.467f, 4.474f, 10.586f, 4.28f, 10.781f)
                curveTo(3.987f, 11.073f, 3.513f, 11.073f, 3.22f, 10.78f)
                curveTo(2.927f, 10.488f, 2.927f, 10.013f, 3.22f, 9.72f)
                curveTo(3.776f, 9.164f, 4.65f, 8.908f, 5.412f, 9.043f)
                curveTo(5.809f, 9.113f, 6.217f, 9.297f, 6.527f, 9.648f)
                curveTo(6.843f, 10.006f, 7.0f, 10.473f, 7.0f, 11.0f)
                curveTo(7.0f, 11.62f, 6.729f, 12.08f, 6.394f, 12.421f)
                curveTo(6.116f, 12.703f, 5.763f, 12.931f, 5.488f, 13.109f)
                lineTo(5.409f, 13.16f)
                curveTo(5.213f, 13.287f, 5.054f, 13.397f, 4.927f, 13.5f)
                horizontalLineTo(6.25f)
                curveTo(6.664f, 13.5f, 7.0f, 13.836f, 7.0f, 14.25f)
                curveTo(7.0f, 14.664f, 6.664f, 15.0f, 6.25f, 15.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 15.0f, 3.0f, 14.664f, 3.0f, 14.25f)
                curveTo(3.0f, 12.936f, 3.984f, 12.297f, 4.575f, 11.913f)
                lineTo(4.635f, 11.874f)
                curveTo(4.953f, 11.668f, 5.168f, 11.528f, 5.325f, 11.369f)
                curveTo(5.459f, 11.233f, 5.5f, 11.131f, 5.5f, 11.0f)
                curveTo(5.5f, 10.778f, 5.439f, 10.682f, 5.402f, 10.641f)
                curveTo(5.361f, 10.594f, 5.285f, 10.544f, 5.151f, 10.52f)
                close()
                moveTo(2.97f, 21.28f)
                curveTo(2.97f, 21.28f, 3.063f, 21.364f, 2.974f, 21.285f)
                lineTo(2.98f, 21.29f)
                lineTo(2.993f, 21.303f)
                curveTo(3.003f, 21.312f, 3.015f, 21.323f, 3.03f, 21.336f)
                curveTo(3.058f, 21.361f, 3.097f, 21.393f, 3.144f, 21.428f)
                curveTo(3.238f, 21.499f, 3.37f, 21.586f, 3.54f, 21.671f)
                curveTo(3.881f, 21.842f, 4.37f, 22.0f, 5.0f, 22.0f)
                curveTo(5.639f, 22.0f, 6.196f, 21.819f, 6.601f, 21.461f)
                curveTo(7.009f, 21.1f, 7.212f, 20.603f, 7.196f, 20.101f)
                curveTo(7.182f, 19.685f, 7.029f, 19.305f, 6.77f, 19.0f)
                curveTo(7.029f, 18.695f, 7.182f, 18.316f, 7.196f, 17.899f)
                curveTo(7.212f, 17.397f, 7.009f, 16.9f, 6.601f, 16.54f)
                curveTo(6.196f, 16.181f, 5.639f, 16.0f, 5.0f, 16.0f)
                curveTo(4.37f, 16.0f, 3.881f, 16.158f, 3.54f, 16.329f)
                curveTo(3.37f, 16.414f, 3.238f, 16.501f, 3.144f, 16.572f)
                curveTo(3.097f, 16.607f, 3.058f, 16.639f, 3.03f, 16.664f)
                curveTo(3.015f, 16.677f, 3.003f, 16.688f, 2.993f, 16.697f)
                lineTo(2.98f, 16.71f)
                lineTo(2.974f, 16.715f)
                lineTo(2.972f, 16.718f)
                lineTo(2.971f, 16.719f)
                lineTo(2.97f, 16.72f)
                curveTo(2.677f, 17.013f, 2.677f, 17.487f, 2.97f, 17.78f)
                curveTo(3.259f, 18.069f, 3.725f, 18.073f, 4.018f, 17.792f)
                curveTo(4.022f, 17.789f, 4.03f, 17.782f, 4.044f, 17.772f)
                curveTo(4.074f, 17.749f, 4.13f, 17.711f, 4.21f, 17.671f)
                curveTo(4.369f, 17.592f, 4.63f, 17.5f, 5.0f, 17.5f)
                curveTo(5.361f, 17.5f, 5.536f, 17.6f, 5.608f, 17.664f)
                curveTo(5.678f, 17.725f, 5.698f, 17.791f, 5.696f, 17.851f)
                curveTo(5.694f, 17.916f, 5.664f, 18.003f, 5.573f, 18.082f)
                curveTo(5.484f, 18.159f, 5.31f, 18.25f, 5.0f, 18.25f)
                curveTo(4.586f, 18.25f, 4.25f, 18.586f, 4.25f, 19.0f)
                curveTo(4.25f, 19.414f, 4.586f, 19.75f, 5.0f, 19.75f)
                curveTo(5.31f, 19.75f, 5.484f, 19.842f, 5.573f, 19.918f)
                curveTo(5.664f, 19.997f, 5.694f, 20.084f, 5.696f, 20.149f)
                curveTo(5.698f, 20.209f, 5.678f, 20.275f, 5.608f, 20.337f)
                curveTo(5.536f, 20.4f, 5.361f, 20.5f, 5.0f, 20.5f)
                curveTo(4.63f, 20.5f, 4.369f, 20.408f, 4.21f, 20.329f)
                curveTo(4.13f, 20.289f, 4.074f, 20.251f, 4.044f, 20.228f)
                curveTo(4.03f, 20.218f, 4.022f, 20.211f, 4.018f, 20.208f)
                curveTo(3.725f, 19.927f, 3.259f, 19.931f, 2.97f, 20.22f)
                curveTo(2.677f, 20.513f, 2.677f, 20.987f, 2.97f, 21.28f)
                close()
                moveTo(2.972f, 16.718f)
                lineTo(2.971f, 16.719f)
                curveTo(2.978f, 16.713f, 3.172f, 16.552f, 2.972f, 16.718f)
                close()
            }
        }
        .build()
        return _textNumberListLtr!!
    }

@Suppress("ObjectPropertyName")
private var _textNumberListLtr: ImageVector? = null

@Preview
@Composable
private fun TextNumberListLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextNumberListLtr, contentDescription = "TextNumberListLtr Icon")
    }
}

