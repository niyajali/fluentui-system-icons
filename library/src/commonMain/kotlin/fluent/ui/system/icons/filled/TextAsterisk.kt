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
 * TextAsterisk Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_asterisk_20_filled.svg)
 * 
 * @return The [ImageVector] for the TextAsterisk icon.
 */
public val FluentIcons.Filled.TextAsterisk: ImageVector
    get() {
        if (_textAsterisk != null) {
            return _textAsterisk!!
        }
        _textAsterisk = Builder(name = "TextAsterisk", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.6f, 2.5f)
                curveTo(10.6f, 2.169f, 10.332f, 1.9f, 10.0f, 1.9f)
                curveTo(9.669f, 1.9f, 9.4f, 2.169f, 9.4f, 2.5f)
                verticalLineTo(8.552f)
                lineTo(5.121f, 4.273f)
                curveTo(4.887f, 4.038f, 4.507f, 4.038f, 4.273f, 4.273f)
                curveTo(4.039f, 4.507f, 4.039f, 4.887f, 4.273f, 5.121f)
                lineTo(8.552f, 9.4f)
                horizontalLineTo(2.5f)
                curveTo(2.169f, 9.4f, 1.9f, 9.669f, 1.9f, 10.0f)
                curveTo(1.9f, 10.332f, 2.169f, 10.6f, 2.5f, 10.6f)
                horizontalLineTo(8.552f)
                lineTo(4.273f, 14.879f)
                curveTo(4.039f, 15.114f, 4.039f, 15.494f, 4.273f, 15.728f)
                curveTo(4.507f, 15.962f, 4.887f, 15.962f, 5.122f, 15.728f)
                lineTo(9.4f, 11.449f)
                verticalLineTo(17.5f)
                curveTo(9.4f, 17.832f, 9.669f, 18.1f, 10.0f, 18.1f)
                curveTo(10.332f, 18.1f, 10.6f, 17.832f, 10.6f, 17.5f)
                verticalLineTo(11.449f)
                lineTo(14.88f, 15.728f)
                curveTo(15.114f, 15.962f, 15.494f, 15.962f, 15.728f, 15.728f)
                curveTo(15.962f, 15.494f, 15.962f, 15.114f, 15.728f, 14.879f)
                lineTo(11.449f, 10.6f)
                horizontalLineTo(17.5f)
                curveTo(17.832f, 10.6f, 18.1f, 10.332f, 18.1f, 10.0f)
                curveTo(18.1f, 9.669f, 17.832f, 9.4f, 17.5f, 9.4f)
                horizontalLineTo(11.449f)
                lineTo(15.728f, 5.121f)
                curveTo(15.962f, 4.887f, 15.962f, 4.507f, 15.728f, 4.273f)
                curveTo(15.494f, 4.039f, 15.114f, 4.039f, 14.88f, 4.273f)
                lineTo(10.6f, 8.552f)
                verticalLineTo(2.5f)
                close()
            }
        }
        .build()
        return _textAsterisk!!
    }

@Suppress("ObjectPropertyName")
private var _textAsterisk: ImageVector? = null

@Preview
@Composable
private fun TextAsteriskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextAsterisk, contentDescription = "TextAsterisk Icon")
    }
}

