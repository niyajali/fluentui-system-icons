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
 * TextContinuous Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_continuous_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextContinuous icon.
 */
public val FluentIcons.Regular.TextContinuous: ImageVector
    get() {
        if (_textContinuous != null) {
            return _textContinuous!!
        }
        _textContinuous = Builder(name = "TextContinuous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 5.0f)
                curveTo(3.336f, 5.0f, 3.0f, 5.336f, 3.0f, 5.75f)
                curveTo(3.0f, 6.164f, 3.336f, 6.5f, 3.75f, 6.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 6.5f, 21.0f, 6.164f, 21.0f, 5.75f)
                curveTo(21.0f, 5.336f, 20.664f, 5.0f, 20.25f, 5.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(8.75f, 9.0f)
                curveTo(8.336f, 9.0f, 8.0f, 9.336f, 8.0f, 9.75f)
                curveTo(8.0f, 10.164f, 8.336f, 10.5f, 8.75f, 10.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 10.5f, 21.0f, 10.164f, 21.0f, 9.75f)
                curveTo(21.0f, 9.336f, 20.664f, 9.0f, 20.25f, 9.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(8.0f, 13.75f)
                curveTo(8.0f, 13.336f, 8.336f, 13.0f, 8.75f, 13.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 13.0f, 21.0f, 13.336f, 21.0f, 13.75f)
                curveTo(21.0f, 14.164f, 20.664f, 14.5f, 20.25f, 14.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 14.5f, 8.0f, 14.164f, 8.0f, 13.75f)
                close()
                moveTo(3.75f, 17.0f)
                curveTo(3.336f, 17.0f, 3.0f, 17.336f, 3.0f, 17.75f)
                curveTo(3.0f, 18.164f, 3.336f, 18.5f, 3.75f, 18.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 18.5f, 21.0f, 18.164f, 21.0f, 17.75f)
                curveTo(21.0f, 17.336f, 20.664f, 17.0f, 20.25f, 17.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(3.22f, 11.03f)
                curveTo(2.927f, 10.737f, 2.927f, 10.263f, 3.22f, 9.97f)
                curveTo(3.513f, 9.677f, 3.987f, 9.677f, 4.28f, 9.97f)
                lineTo(5.78f, 11.47f)
                curveTo(6.073f, 11.763f, 6.073f, 12.237f, 5.78f, 12.53f)
                lineTo(4.28f, 14.03f)
                curveTo(3.987f, 14.323f, 3.513f, 14.323f, 3.22f, 14.03f)
                curveTo(2.927f, 13.737f, 2.927f, 13.263f, 3.22f, 12.97f)
                lineTo(4.189f, 12.0f)
                lineTo(3.22f, 11.03f)
                close()
            }
        }
        .build()
        return _textContinuous!!
    }

@Suppress("ObjectPropertyName")
private var _textContinuous: ImageVector? = null

@Preview
@Composable
private fun TextContinuousPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextContinuous, contentDescription = "TextContinuous Icon")
    }
}

