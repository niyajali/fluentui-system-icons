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
 * TextIndentIncrease Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains directional & rotation variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_indent_increase_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextIndentIncrease icon.
 */
public val FluentIcons.Regular.TextIndentIncrease: ImageVector
    get() {
        if (_textIndentIncrease != null) {
            return _textIndentIncrease!!
        }
        _textIndentIncrease = Builder(name = "TextIndentIncrease", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.75f, 16.0f)
                curveTo(18.164f, 16.0f, 18.5f, 16.336f, 18.5f, 16.75f)
                curveTo(18.5f, 17.164f, 18.164f, 17.5f, 17.75f, 17.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 17.5f, 8.0f, 17.164f, 8.0f, 16.75f)
                curveTo(8.0f, 16.336f, 8.336f, 16.0f, 8.75f, 16.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(2.72f, 9.22f)
                curveTo(2.986f, 8.953f, 3.403f, 8.929f, 3.696f, 9.147f)
                lineTo(3.78f, 9.22f)
                lineTo(5.78f, 11.22f)
                curveTo(6.047f, 11.486f, 6.071f, 11.903f, 5.853f, 12.196f)
                lineTo(5.78f, 12.28f)
                lineTo(3.78f, 14.28f)
                curveTo(3.487f, 14.573f, 3.013f, 14.573f, 2.72f, 14.28f)
                curveTo(2.453f, 14.014f, 2.429f, 13.597f, 2.647f, 13.304f)
                lineTo(2.72f, 13.22f)
                lineTo(4.189f, 11.75f)
                lineTo(2.72f, 10.28f)
                curveTo(2.427f, 9.987f, 2.427f, 9.513f, 2.72f, 9.22f)
                close()
                moveTo(20.75f, 11.0f)
                curveTo(21.164f, 11.0f, 21.5f, 11.336f, 21.5f, 11.75f)
                curveTo(21.5f, 12.164f, 21.164f, 12.5f, 20.75f, 12.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 12.5f, 8.0f, 12.164f, 8.0f, 11.75f)
                curveTo(8.0f, 11.336f, 8.336f, 11.0f, 8.75f, 11.0f)
                horizontalLineTo(20.75f)
                close()
                moveTo(17.75f, 6.0f)
                curveTo(18.164f, 6.0f, 18.5f, 6.336f, 18.5f, 6.75f)
                curveTo(18.5f, 7.164f, 18.164f, 7.5f, 17.75f, 7.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 7.5f, 8.0f, 7.164f, 8.0f, 6.75f)
                curveTo(8.0f, 6.336f, 8.336f, 6.0f, 8.75f, 6.0f)
                horizontalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _textIndentIncrease!!
    }

@Suppress("ObjectPropertyName")
private var _textIndentIncrease: ImageVector? = null

@Preview
@Composable
private fun TextIndentIncreasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextIndentIncrease, contentDescription = "TextIndentIncrease Icon")
    }
}

