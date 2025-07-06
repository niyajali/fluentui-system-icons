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
 * TextBaseline Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_baseline_20_regular.svg)
 * 
 * @return The [ImageVector] for the TextBaseline icon.
 */
public val FluentIcons.Regular.TextBaseline: ImageVector
    get() {
        if (_textBaseline != null) {
            return _textBaseline!!
        }
        _textBaseline = Builder(name = "TextBaseline", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.461f, 3.806f)
                curveTo(10.383f, 3.621f, 10.202f, 3.5f, 10.0f, 3.5f)
                curveTo(9.799f, 3.5f, 9.618f, 3.621f, 9.54f, 3.806f)
                lineTo(5.539f, 13.306f)
                curveTo(5.432f, 13.561f, 5.552f, 13.854f, 5.806f, 13.961f)
                curveTo(6.061f, 14.068f, 6.354f, 13.948f, 6.461f, 13.694f)
                lineTo(8.016f, 10.0f)
                horizontalLineTo(11.984f)
                lineTo(13.539f, 13.694f)
                curveTo(13.646f, 13.948f, 13.94f, 14.068f, 14.194f, 13.961f)
                curveTo(14.449f, 13.854f, 14.568f, 13.561f, 14.461f, 13.306f)
                lineTo(10.461f, 3.806f)
                close()
                moveTo(11.563f, 9.0f)
                horizontalLineTo(8.438f)
                lineTo(10.0f, 5.288f)
                lineTo(11.563f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 16.0f)
                curveTo(2.224f, 16.0f, 2.0f, 16.224f, 2.0f, 16.5f)
                curveTo(2.0f, 16.776f, 2.224f, 17.0f, 2.5f, 17.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 17.0f, 18.0f, 16.776f, 18.0f, 16.5f)
                curveTo(18.0f, 16.224f, 17.776f, 16.0f, 17.5f, 16.0f)
                horizontalLineTo(2.5f)
                close()
            }
        }
        .build()
        return _textBaseline!!
    }

@Suppress("ObjectPropertyName")
private var _textBaseline: ImageVector? = null

@Preview
@Composable
private fun TextBaselinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextBaseline, contentDescription = "TextBaseline Icon")
    }
}

