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
 * TextHeader3LinesCaret icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: text, header3lines, caret
 * - Source: ic_fluent_text_header_3_lines_caret_24_filled.svg
 * 
 * @return The [ImageVector] for the TextHeader3LinesCaret icon.
 */
public val FluentIcons.Filled.TextHeader3LinesCaret: ImageVector
    get() {
        if (_textHeader3LinesCaret != null) {
            return _textHeader3LinesCaret!!
        }
        _textHeader3LinesCaret = Builder(name = "TextHeader3LinesCaret", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.994f, 4.345f)
                curveTo(12.46f, 3.826f, 13.308f, 3.645f, 13.828f, 3.812f)
                curveTo(14.144f, 3.913f, 14.354f, 4.127f, 14.445f, 4.347f)
                curveTo(14.53f, 4.551f, 14.525f, 4.78f, 14.369f, 5.013f)
                curveTo(14.088f, 5.43f, 13.628f, 5.496f, 12.899f, 5.502f)
                lineTo(12.853f, 5.502f)
                lineTo(12.766f, 5.502f)
                curveTo(12.214f, 5.502f, 11.766f, 5.95f, 11.766f, 6.502f)
                curveTo(11.766f, 7.054f, 12.214f, 7.502f, 12.766f, 7.502f)
                lineTo(12.853f, 7.502f)
                lineTo(12.899f, 7.503f)
                curveTo(13.628f, 7.509f, 14.088f, 7.574f, 14.369f, 7.991f)
                curveTo(14.525f, 8.224f, 14.53f, 8.453f, 14.445f, 8.657f)
                curveTo(14.354f, 8.877f, 14.144f, 9.092f, 13.828f, 9.193f)
                curveTo(13.308f, 9.359f, 12.46f, 9.178f, 11.994f, 8.659f)
                curveTo(11.625f, 8.248f, 10.993f, 8.214f, 10.582f, 8.583f)
                curveTo(10.171f, 8.952f, 10.137f, 9.585f, 10.506f, 9.996f)
                curveTo(11.508f, 11.112f, 13.182f, 11.499f, 14.437f, 11.097f)
                curveTo(16.114f, 10.561f, 17.176f, 8.581f, 16.028f, 6.875f)
                curveTo(15.936f, 6.737f, 15.837f, 6.614f, 15.733f, 6.502f)
                curveTo(15.837f, 6.391f, 15.936f, 6.267f, 16.028f, 6.129f)
                curveTo(17.176f, 4.423f, 16.114f, 2.443f, 14.437f, 1.907f)
                curveTo(13.182f, 1.505f, 11.508f, 1.892f, 10.506f, 3.009f)
                curveTo(10.137f, 3.419f, 10.171f, 4.052f, 10.582f, 4.421f)
                curveTo(10.993f, 4.79f, 11.625f, 4.756f, 11.994f, 4.345f)
                close()
                moveTo(3.0f, 2.0f)
                curveTo(3.552f, 2.0f, 4.0f, 2.448f, 4.0f, 3.0f)
                lineTo(4.0f, 5.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.002f)
                curveTo(7.0f, 2.449f, 7.448f, 2.002f, 8.0f, 2.002f)
                curveTo(8.552f, 2.002f, 9.0f, 2.449f, 9.0f, 3.002f)
                lineTo(9.0f, 9.995f)
                curveTo(9.0f, 10.547f, 8.552f, 10.995f, 8.0f, 10.995f)
                curveTo(7.448f, 10.995f, 7.0f, 10.547f, 7.0f, 9.995f)
                verticalLineTo(7.5f)
                lineTo(4.0f, 7.5f)
                lineTo(4.0f, 10.0f)
                curveTo(4.0f, 10.552f, 3.552f, 11.0f, 3.0f, 11.0f)
                curveTo(2.448f, 11.0f, 2.0f, 10.552f, 2.0f, 10.0f)
                verticalLineTo(3.0f)
                curveTo(2.0f, 2.448f, 2.448f, 2.0f, 3.0f, 2.0f)
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
                moveTo(2.0f, 20.0f)
                curveTo(2.0f, 19.448f, 2.448f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 19.0f, 22.0f, 19.448f, 22.0f, 20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                close()
                moveTo(3.0f, 14.0f)
                curveTo(2.448f, 14.0f, 2.0f, 14.448f, 2.0f, 15.0f)
                curveTo(2.0f, 15.552f, 2.448f, 16.0f, 3.0f, 16.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 16.0f, 22.0f, 15.552f, 22.0f, 15.0f)
                curveTo(22.0f, 14.448f, 21.552f, 14.0f, 21.0f, 14.0f)
                horizontalLineTo(3.0f)
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
        Image(imageVector = FluentIcons.Filled.TextHeader3LinesCaret, contentDescription = null)
    }
}

