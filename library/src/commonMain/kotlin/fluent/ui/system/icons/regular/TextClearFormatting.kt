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
 * TextClearFormatting icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, clear, formatting
 * - Source: ic_fluent_text_clear_formatting_24_regular.svg
 * 
 * @return The [ImageVector] for the TextClearFormatting icon.
 */
public val FluentIcons.Regular.TextClearFormatting: ImageVector
    get() {
        if (_textClearFormatting != null) {
            return _textClearFormatting!!
        }
        _textClearFormatting = Builder(name = "TextClearFormatting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.212f, 13.821f)
                curveTo(2.358f, 13.94f, 2.541f, 14.0f, 2.761f, 14.0f)
                curveTo(3.122f, 14.0f, 3.371f, 13.812f, 3.506f, 13.437f)
                lineTo(4.58f, 10.517f)
                horizontalLineTo(9.411f)
                lineTo(10.494f, 13.437f)
                curveTo(10.629f, 13.812f, 10.878f, 14.0f, 11.239f, 14.0f)
                curveTo(11.458f, 14.0f, 11.639f, 13.94f, 11.78f, 13.821f)
                curveTo(11.927f, 13.695f, 12.0f, 13.54f, 12.0f, 13.356f)
                curveTo(12.0f, 13.247f, 11.969f, 13.111f, 11.907f, 12.948f)
                lineTo(7.973f, 2.702f)
                curveTo(7.792f, 2.234f, 7.474f, 2.0f, 7.017f, 2.0f)
                curveTo(6.532f, 2.0f, 6.199f, 2.237f, 6.019f, 2.71f)
                lineTo(2.093f, 12.948f)
                curveTo(2.031f, 13.111f, 2.0f, 13.247f, 2.0f, 13.356f)
                curveTo(2.0f, 13.54f, 2.07f, 13.695f, 2.212f, 13.821f)
                close()
                moveTo(8.98f, 9.269f)
                horizontalLineTo(5.02f)
                lineTo(6.975f, 3.901f)
                horizontalLineTo(7.025f)
                lineTo(8.98f, 9.269f)
                close()
                moveTo(13.0f, 13.105f)
                lineTo(14.748f, 11.357f)
                curveTo(14.519f, 10.875f, 14.404f, 10.3f, 14.404f, 9.635f)
                curveTo(14.404f, 8.705f, 14.631f, 7.953f, 15.085f, 7.379f)
                curveTo(15.545f, 6.801f, 16.135f, 6.511f, 16.854f, 6.511f)
                curveTo(17.6f, 6.511f, 18.19f, 6.792f, 18.623f, 7.355f)
                curveTo(18.979f, 7.818f, 19.189f, 8.416f, 19.252f, 9.148f)
                curveTo(19.676f, 9.287f, 20.075f, 9.526f, 20.413f, 9.863f)
                lineTo(20.699f, 10.149f)
                curveTo(20.71f, 9.982f, 20.716f, 9.811f, 20.716f, 9.635f)
                curveTo(20.716f, 8.315f, 20.389f, 7.258f, 19.734f, 6.462f)
                curveTo(19.08f, 5.667f, 18.22f, 5.27f, 17.154f, 5.27f)
                curveTo(16.565f, 5.27f, 16.032f, 5.408f, 15.556f, 5.684f)
                curveTo(15.085f, 5.959f, 14.715f, 6.341f, 14.444f, 6.828f)
                horizontalLineTo(14.412f)
                verticalLineTo(2.755f)
                curveTo(14.412f, 2.533f, 14.344f, 2.352f, 14.209f, 2.211f)
                curveTo(14.079f, 2.07f, 13.911f, 2.0f, 13.706f, 2.0f)
                curveTo(13.5f, 2.0f, 13.33f, 2.07f, 13.195f, 2.211f)
                curveTo(13.065f, 2.352f, 13.0f, 2.533f, 13.0f, 2.755f)
                verticalLineTo(13.105f)
                close()
                moveTo(16.982f, 21.5f)
                horizontalLineTo(20.002f)
                curveTo(20.416f, 21.5f, 20.752f, 21.836f, 20.752f, 22.25f)
                curveTo(20.752f, 22.664f, 20.416f, 23.0f, 20.002f, 23.0f)
                horizontalLineTo(14.5f)
                lineTo(14.503f, 22.993f)
                curveTo(14.062f, 22.954f, 13.632f, 22.767f, 13.295f, 22.43f)
                lineTo(10.571f, 19.706f)
                curveTo(9.81f, 18.944f, 9.81f, 17.709f, 10.573f, 16.947f)
                lineTo(16.947f, 10.572f)
                curveTo(17.709f, 9.81f, 18.945f, 9.809f, 19.706f, 10.571f)
                lineTo(22.43f, 13.295f)
                curveTo(23.191f, 14.056f, 23.191f, 15.291f, 22.428f, 16.053f)
                lineTo(16.982f, 21.5f)
                close()
                moveTo(18.008f, 11.633f)
                lineTo(13.851f, 15.79f)
                lineTo(17.211f, 19.149f)
                lineTo(21.368f, 14.993f)
                curveTo(21.545f, 14.815f, 21.544f, 14.53f, 21.369f, 14.355f)
                lineTo(18.645f, 11.631f)
                curveTo(18.471f, 11.457f, 18.186f, 11.455f, 18.008f, 11.633f)
                close()
                moveTo(12.79f, 16.851f)
                lineTo(11.633f, 18.007f)
                curveTo(11.456f, 18.185f, 11.457f, 18.471f, 11.632f, 18.645f)
                lineTo(14.356f, 21.369f)
                curveTo(14.53f, 21.543f, 14.815f, 21.545f, 14.993f, 21.367f)
                lineTo(16.15f, 20.21f)
                lineTo(12.79f, 16.851f)
                close()
            }
        }
        .build()
        return _textClearFormatting!!
    }

@Suppress("ObjectPropertyName")
private var _textClearFormatting: ImageVector? = null

@Preview
@Composable
private fun TextClearFormattingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextClearFormatting, contentDescription = null)
    }
}

