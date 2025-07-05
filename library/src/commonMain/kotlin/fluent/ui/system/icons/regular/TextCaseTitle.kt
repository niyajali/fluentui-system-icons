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
 * TextCaseTitle Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Collection includes Text Case Lowercase, Text Case Title, Text Case Uppercase, Text Change Case.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_case_title_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextCaseTitle icon.
 */
public val FluentIcons.Regular.TextCaseTitle: ImageVector
    get() {
        if (_textCaseTitle != null) {
            return _textCaseTitle!!
        }
        _textCaseTitle = Builder(name = "TextCaseTitle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 3.0f)
                curveTo(15.336f, 3.0f, 15.0f, 3.336f, 15.0f, 3.75f)
                verticalLineTo(19.25f)
                curveTo(15.0f, 19.664f, 15.336f, 20.0f, 15.75f, 20.0f)
                curveTo(16.164f, 20.0f, 16.5f, 19.664f, 16.5f, 19.25f)
                verticalLineTo(19.013f)
                curveTo(17.185f, 19.631f, 18.054f, 20.0f, 19.0f, 20.0f)
                curveTo(21.209f, 20.0f, 23.0f, 17.985f, 23.0f, 15.5f)
                curveTo(23.0f, 13.015f, 21.209f, 11.0f, 19.0f, 11.0f)
                curveTo(18.054f, 11.0f, 17.185f, 11.369f, 16.5f, 11.987f)
                verticalLineTo(3.75f)
                curveTo(16.5f, 3.336f, 16.164f, 3.0f, 15.75f, 3.0f)
                close()
                moveTo(16.5f, 15.5f)
                curveTo(16.5f, 13.672f, 17.781f, 12.5f, 19.0f, 12.5f)
                curveTo(20.219f, 12.5f, 21.5f, 13.672f, 21.5f, 15.5f)
                curveTo(21.5f, 17.328f, 20.219f, 18.5f, 19.0f, 18.5f)
                curveTo(17.781f, 18.5f, 16.5f, 17.328f, 16.5f, 15.5f)
                close()
                moveTo(7.761f, 3.0f)
                curveTo(8.074f, 3.005f, 8.352f, 3.204f, 8.457f, 3.499f)
                lineTo(13.957f, 18.999f)
                curveTo(14.095f, 19.39f, 13.891f, 19.818f, 13.501f, 19.957f)
                curveTo(13.111f, 20.095f, 12.682f, 19.891f, 12.543f, 19.501f)
                lineTo(11.124f, 15.5f)
                lineTo(4.006f, 15.5f)
                lineTo(2.45f, 19.521f)
                curveTo(2.3f, 19.907f, 1.866f, 20.099f, 1.479f, 19.949f)
                curveTo(1.093f, 19.8f, 0.901f, 19.365f, 1.051f, 18.979f)
                lineTo(7.051f, 3.479f)
                curveTo(7.164f, 3.187f, 7.447f, 2.996f, 7.761f, 3.0f)
                close()
                moveTo(7.72f, 5.907f)
                lineTo(4.587f, 14.0f)
                lineTo(10.592f, 14.0f)
                lineTo(7.72f, 5.907f)
                close()
            }
        }
        .build()
        return _textCaseTitle!!
    }

@Suppress("ObjectPropertyName")
private var _textCaseTitle: ImageVector? = null

@Preview
@Composable
private fun TextCaseTitlePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextCaseTitle, contentDescription = "TextCaseTitle Icon")
    }
}

