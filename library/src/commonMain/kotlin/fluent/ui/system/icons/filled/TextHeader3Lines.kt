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
 * TextHeader3Lines icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: text, header3lines
 * - Source: ic_fluent_text_header_3_lines_24_filled.svg
 * 
 * @return The [ImageVector] for the TextHeader3Lines icon.
 */
public val FluentIcons.Filled.TextHeader3Lines: ImageVector
    get() {
        if (_textHeader3Lines != null) {
            return _textHeader3Lines!!
        }
        _textHeader3Lines = Builder(name = "TextHeader3Lines", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.573f, 3.812f)
                curveTo(14.054f, 3.645f, 13.207f, 3.826f, 12.742f, 4.345f)
                curveTo(12.373f, 4.756f, 11.742f, 4.79f, 11.332f, 4.421f)
                curveTo(10.921f, 4.052f, 10.887f, 3.419f, 11.256f, 3.009f)
                curveTo(12.257f, 1.892f, 13.928f, 1.505f, 15.182f, 1.907f)
                curveTo(16.856f, 2.443f, 17.917f, 4.423f, 16.771f, 6.129f)
                curveTo(16.678f, 6.267f, 16.58f, 6.391f, 16.476f, 6.502f)
                curveTo(16.58f, 6.614f, 16.678f, 6.737f, 16.771f, 6.875f)
                curveTo(17.917f, 8.581f, 16.856f, 10.561f, 15.182f, 11.097f)
                curveTo(13.928f, 11.499f, 12.257f, 11.112f, 11.256f, 9.996f)
                curveTo(10.887f, 9.585f, 10.921f, 8.952f, 11.332f, 8.583f)
                curveTo(11.742f, 8.214f, 12.373f, 8.248f, 12.742f, 8.659f)
                curveTo(13.207f, 9.178f, 14.054f, 9.359f, 14.573f, 9.193f)
                curveTo(14.889f, 9.092f, 15.099f, 8.877f, 15.19f, 8.657f)
                curveTo(15.274f, 8.453f, 15.27f, 8.224f, 15.113f, 7.991f)
                curveTo(14.833f, 7.574f, 14.373f, 7.509f, 13.646f, 7.503f)
                lineTo(13.599f, 7.502f)
                lineTo(13.513f, 7.502f)
                curveTo(12.961f, 7.502f, 12.514f, 7.054f, 12.514f, 6.502f)
                curveTo(12.514f, 5.95f, 12.961f, 5.502f, 13.513f, 5.502f)
                lineTo(13.599f, 5.502f)
                lineTo(13.646f, 5.502f)
                curveTo(14.373f, 5.496f, 14.833f, 5.43f, 15.113f, 5.013f)
                curveTo(15.27f, 4.78f, 15.274f, 4.551f, 15.19f, 4.347f)
                curveTo(15.099f, 4.127f, 14.889f, 3.913f, 14.573f, 3.812f)
                close()
                moveTo(4.0f, 3.0f)
                curveTo(4.0f, 2.448f, 3.552f, 2.0f, 3.0f, 2.0f)
                curveTo(2.448f, 2.0f, 2.0f, 2.448f, 2.0f, 3.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 10.552f, 2.448f, 11.0f, 3.0f, 11.0f)
                curveTo(3.552f, 11.0f, 4.0f, 10.552f, 4.0f, 10.0f)
                lineTo(4.0f, 7.5f)
                lineTo(7.0f, 7.5f)
                verticalLineTo(9.995f)
                curveTo(7.0f, 10.547f, 7.448f, 10.995f, 8.0f, 10.995f)
                curveTo(8.552f, 10.995f, 9.0f, 10.547f, 9.0f, 9.995f)
                lineTo(9.0f, 3.002f)
                curveTo(9.0f, 2.449f, 8.552f, 2.002f, 8.0f, 2.002f)
                curveTo(7.448f, 2.002f, 7.0f, 2.449f, 7.0f, 3.002f)
                verticalLineTo(5.5f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 3.0f)
                close()
                moveTo(3.0f, 19.0f)
                curveTo(2.448f, 19.0f, 2.0f, 19.448f, 2.0f, 20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 21.0f, 22.0f, 20.552f, 22.0f, 20.0f)
                curveTo(22.0f, 19.448f, 21.552f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 14.448f, 2.448f, 14.0f, 3.0f, 14.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 14.0f, 22.0f, 14.448f, 22.0f, 15.0f)
                curveTo(22.0f, 15.552f, 21.552f, 16.0f, 21.0f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 16.0f, 2.0f, 15.552f, 2.0f, 15.0f)
                close()
            }
        }
        .build()
        return _textHeader3Lines!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader3Lines: ImageVector? = null

@Preview
@Composable
private fun TextHeader3LinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextHeader3Lines, contentDescription = null)
    }
}

