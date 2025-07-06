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
 * TextFontSize Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_font_size_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextFontSize icon.
 */
public val FluentIcons.Regular.TextFontSize: ImageVector
    get() {
        if (_textFontSize != null) {
            return _textFontSize!!
        }
        _textFontSize = Builder(name = "TextFontSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.212f, 17.11f)
                lineTo(15.043f, 3.499f)
                curveTo(15.266f, 2.873f, 16.113f, 2.836f, 16.408f, 3.389f)
                lineTo(16.457f, 3.499f)
                lineTo(21.957f, 19.0f)
                curveTo(22.096f, 19.39f, 21.891f, 19.819f, 21.501f, 19.957f)
                curveTo(21.143f, 20.084f, 20.753f, 19.923f, 20.584f, 19.595f)
                lineTo(20.543f, 19.501f)
                lineTo(18.946f, 15.0f)
                horizontalLineTo(12.552f)
                lineTo(10.973f, 19.452f)
                curveTo(10.92f, 19.64f, 10.795f, 19.805f, 10.618f, 19.904f)
                lineTo(10.525f, 19.948f)
                curveTo(10.172f, 20.087f, 9.777f, 19.94f, 9.596f, 19.618f)
                lineTo(9.552f, 19.526f)
                lineTo(8.556f, 17.0f)
                horizontalLineTo(4.443f)
                lineTo(3.448f, 19.521f)
                curveTo(3.308f, 19.874f, 2.93f, 20.062f, 2.572f, 19.974f)
                lineTo(2.474f, 19.943f)
                curveTo(2.121f, 19.803f, 1.933f, 19.425f, 2.022f, 19.067f)
                lineTo(2.053f, 18.969f)
                lineTo(5.806f, 9.474f)
                curveTo(6.042f, 8.879f, 6.849f, 8.844f, 7.151f, 9.37f)
                lineTo(7.202f, 9.475f)
                lineTo(10.212f, 17.11f)
                lineTo(15.043f, 3.499f)
                lineTo(10.212f, 17.11f)
                close()
                moveTo(6.503f, 11.792f)
                lineTo(5.036f, 15.5f)
                horizontalLineTo(7.964f)
                lineTo(6.503f, 11.792f)
                close()
                moveTo(15.75f, 5.992f)
                lineTo(13.084f, 13.5f)
                horizontalLineTo(18.414f)
                lineTo(15.75f, 5.992f)
                close()
            }
        }
        .build()
        return _textFontSize!!
    }

@Suppress("ObjectPropertyName")
private var _textFontSize: ImageVector? = null

@Preview
@Composable
private fun TextFontSizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextFontSize, contentDescription = "TextFontSize Icon")
    }
}

