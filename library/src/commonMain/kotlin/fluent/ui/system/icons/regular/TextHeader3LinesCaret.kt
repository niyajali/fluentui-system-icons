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
 * TextHeader3LinesCaret icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, header3lines, caret
 * - Source: ic_fluent_text_header_3_lines_caret_24_regular.svg
 * 
 * @return The [ImageVector] for the TextHeader3LinesCaret icon.
 */
public val FluentIcons.Regular.TextHeader3LinesCaret: ImageVector
    get() {
        if (_textHeader3LinesCaret != null) {
            return _textHeader3LinesCaret!!
        }
        _textHeader3LinesCaret = Builder(name = "TextHeader3LinesCaret", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 2.0f)
                curveTo(3.164f, 2.0f, 3.5f, 2.336f, 3.5f, 2.75f)
                lineTo(3.5f, 5.5f)
                horizontalLineTo(7.5f)
                lineTo(7.5f, 2.752f)
                curveTo(7.5f, 2.337f, 7.836f, 2.002f, 8.25f, 2.002f)
                curveTo(8.664f, 2.002f, 9.0f, 2.337f, 9.0f, 2.752f)
                lineTo(9.0f, 10.244f)
                curveTo(9.0f, 10.659f, 8.664f, 10.994f, 8.25f, 10.994f)
                curveTo(7.836f, 10.994f, 7.5f, 10.659f, 7.5f, 10.244f)
                verticalLineTo(7.0f)
                lineTo(3.5f, 7.0f)
                lineTo(3.5f, 10.25f)
                curveTo(3.5f, 10.664f, 3.164f, 11.0f, 2.75f, 11.0f)
                curveTo(2.336f, 11.0f, 2.0f, 10.664f, 2.0f, 10.25f)
                verticalLineTo(2.75f)
                curveTo(2.0f, 2.336f, 2.336f, 2.0f, 2.75f, 2.0f)
                close()
                moveTo(17.557f, 5.462f)
                curveTo(17.673f, 5.182f, 17.947f, 4.999f, 18.25f, 4.999f)
                horizontalLineTo(21.252f)
                curveTo(21.555f, 4.999f, 21.829f, 5.182f, 21.945f, 5.462f)
                curveTo(22.061f, 5.742f, 21.997f, 6.065f, 21.782f, 6.28f)
                lineTo(20.282f, 7.78f)
                curveTo(19.989f, 8.073f, 19.514f, 8.073f, 19.22f, 7.78f)
                lineTo(17.72f, 6.28f)
                curveTo(17.505f, 6.065f, 17.441f, 5.742f, 17.557f, 5.462f)
                close()
                moveTo(2.75f, 19.0f)
                curveTo(2.336f, 19.0f, 2.0f, 19.336f, 2.0f, 19.75f)
                curveTo(2.0f, 20.164f, 2.336f, 20.5f, 2.75f, 20.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 20.5f, 22.0f, 20.164f, 22.0f, 19.75f)
                curveTo(22.0f, 19.336f, 21.664f, 19.0f, 21.25f, 19.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 14.75f)
                curveTo(2.0f, 14.336f, 2.336f, 14.0f, 2.75f, 14.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 14.0f, 22.0f, 14.336f, 22.0f, 14.75f)
                curveTo(22.0f, 15.164f, 21.664f, 15.5f, 21.25f, 15.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 15.5f, 2.0f, 15.164f, 2.0f, 14.75f)
                close()
                moveTo(11.794f, 4.193f)
                curveTo(12.366f, 3.592f, 13.402f, 3.371f, 14.085f, 3.577f)
                curveTo(14.514f, 3.706f, 14.8f, 3.982f, 14.924f, 4.265f)
                curveTo(15.042f, 4.532f, 15.034f, 4.835f, 14.82f, 5.136f)
                curveTo(14.426f, 5.689f, 13.76f, 5.747f, 12.984f, 5.752f)
                lineTo(12.855f, 5.752f)
                curveTo(12.441f, 5.752f, 12.105f, 6.088f, 12.105f, 6.502f)
                curveTo(12.105f, 6.916f, 12.441f, 7.252f, 12.855f, 7.252f)
                lineTo(12.984f, 7.252f)
                curveTo(13.76f, 7.257f, 14.426f, 7.316f, 14.82f, 7.868f)
                curveTo(15.034f, 8.169f, 15.042f, 8.473f, 14.924f, 8.739f)
                curveTo(14.8f, 9.022f, 14.514f, 9.298f, 14.085f, 9.427f)
                curveTo(13.402f, 9.634f, 12.366f, 9.412f, 11.794f, 8.811f)
                curveTo(11.508f, 8.511f, 11.033f, 8.499f, 10.733f, 8.784f)
                curveTo(10.433f, 9.069f, 10.421f, 9.544f, 10.706f, 9.844f)
                curveTo(11.689f, 10.878f, 13.322f, 11.225f, 14.519f, 10.863f)
                curveTo(15.33f, 10.618f, 15.981f, 10.061f, 16.297f, 9.343f)
                curveTo(16.621f, 8.609f, 16.573f, 7.744f, 16.042f, 6.998f)
                curveTo(15.903f, 6.804f, 15.751f, 6.64f, 15.59f, 6.502f)
                curveTo(15.751f, 6.364f, 15.903f, 6.2f, 16.042f, 6.006f)
                curveTo(16.573f, 5.261f, 16.621f, 4.395f, 16.297f, 3.661f)
                curveTo(15.981f, 2.943f, 15.33f, 2.386f, 14.519f, 2.141f)
                curveTo(13.322f, 1.78f, 11.689f, 2.126f, 10.706f, 3.16f)
                curveTo(10.421f, 3.46f, 10.433f, 3.935f, 10.733f, 4.22f)
                curveTo(11.033f, 4.506f, 11.508f, 4.494f, 11.794f, 4.193f)
                close()
            }
        }
        .build()
        return _textHeader3LinesCaret!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader3LinesCaret: ImageVector? = null

@Preview
@Composable
private fun TextHeader3LinesCaretPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextHeader3LinesCaret, contentDescription = null)
    }
}

