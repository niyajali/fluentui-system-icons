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
 * TextIndentIncreaseRotate90 Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains directional & rotation variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_indent_increase_rotate_90_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextIndentIncreaseRotate90 icon.
 */
public val FluentIcons.Regular.TextIndentIncreaseRotate90: ImageVector
    get() {
        if (_textIndentIncreaseRotate90 != null) {
            return _textIndentIncreaseRotate90!!
        }
        _textIndentIncreaseRotate90 = Builder(name = "TextIndentIncreaseRotate90", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 17.75f)
                curveTo(8.0f, 18.164f, 7.664f, 18.5f, 7.25f, 18.5f)
                curveTo(6.836f, 18.5f, 6.5f, 18.164f, 6.5f, 17.75f)
                verticalLineTo(8.75f)
                curveTo(6.5f, 8.336f, 6.836f, 8.0f, 7.25f, 8.0f)
                curveTo(7.664f, 8.0f, 8.0f, 8.336f, 8.0f, 8.75f)
                verticalLineTo(17.75f)
                close()
                moveTo(14.78f, 2.72f)
                curveTo(15.047f, 2.986f, 15.071f, 3.403f, 14.853f, 3.696f)
                lineTo(14.78f, 3.78f)
                lineTo(12.78f, 5.78f)
                curveTo(12.514f, 6.047f, 12.097f, 6.071f, 11.804f, 5.853f)
                lineTo(11.72f, 5.78f)
                lineTo(9.72f, 3.78f)
                curveTo(9.427f, 3.487f, 9.427f, 3.013f, 9.72f, 2.72f)
                curveTo(9.986f, 2.453f, 10.403f, 2.429f, 10.696f, 2.647f)
                lineTo(10.78f, 2.72f)
                lineTo(12.25f, 4.189f)
                lineTo(13.72f, 2.72f)
                curveTo(14.013f, 2.427f, 14.487f, 2.427f, 14.78f, 2.72f)
                close()
                moveTo(13.0f, 20.75f)
                curveTo(13.0f, 21.164f, 12.664f, 21.5f, 12.25f, 21.5f)
                curveTo(11.836f, 21.5f, 11.5f, 21.164f, 11.5f, 20.75f)
                verticalLineTo(8.75f)
                curveTo(11.5f, 8.336f, 11.836f, 8.0f, 12.25f, 8.0f)
                curveTo(12.664f, 8.0f, 13.0f, 8.336f, 13.0f, 8.75f)
                verticalLineTo(20.75f)
                close()
                moveTo(18.0f, 17.75f)
                curveTo(18.0f, 18.164f, 17.664f, 18.5f, 17.25f, 18.5f)
                curveTo(16.836f, 18.5f, 16.5f, 18.164f, 16.5f, 17.75f)
                verticalLineTo(8.75f)
                curveTo(16.5f, 8.336f, 16.836f, 8.0f, 17.25f, 8.0f)
                curveTo(17.664f, 8.0f, 18.0f, 8.336f, 18.0f, 8.75f)
                verticalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _textIndentIncreaseRotate90!!
    }

@Suppress("ObjectPropertyName")
private var _textIndentIncreaseRotate90: ImageVector? = null

@Preview
@Composable
private fun TextIndentIncreaseRotate90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextIndentIncreaseRotate90, contentDescription = "TextIndentIncreaseRotate90 Icon")
    }
}

