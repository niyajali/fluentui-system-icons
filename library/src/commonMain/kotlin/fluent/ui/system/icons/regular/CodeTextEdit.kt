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
 * CodeTextEdit Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, vs code
 * - Description: Used in code type scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_text_edit_20_regular.svg)
 * 
 * @return The [ImageVector] for the CodeTextEdit icon.
 */
public val FluentIcons.Regular.CodeTextEdit: ImageVector
    get() {
        if (_codeTextEdit != null) {
            return _codeTextEdit!!
        }
        _codeTextEdit = Builder(name = "CodeTextEdit", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 5.0f)
                curveTo(2.224f, 5.0f, 2.0f, 5.224f, 2.0f, 5.5f)
                curveTo(2.0f, 5.776f, 2.224f, 6.0f, 2.5f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(8.276f, 6.0f, 8.5f, 5.776f, 8.5f, 5.5f)
                curveTo(8.5f, 5.224f, 8.276f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(2.5f)
                close()
                moveTo(5.5f, 8.0f)
                curveTo(5.224f, 8.0f, 5.0f, 8.224f, 5.0f, 8.5f)
                curveTo(5.0f, 8.776f, 5.224f, 9.0f, 5.5f, 9.0f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 9.0f, 11.0f, 8.776f, 11.0f, 8.5f)
                curveTo(11.0f, 8.224f, 10.776f, 8.0f, 10.5f, 8.0f)
                horizontalLineTo(5.5f)
                close()
                moveTo(4.0f, 11.5f)
                curveTo(4.0f, 11.224f, 4.224f, 11.0f, 4.5f, 11.0f)
                horizontalLineTo(13.944f)
                lineTo(12.944f, 12.0f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 12.0f, 4.0f, 11.776f, 4.0f, 11.5f)
                close()
                moveTo(10.274f, 14.67f)
                lineTo(10.944f, 14.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 14.0f, 2.0f, 14.224f, 2.0f, 14.5f)
                curveTo(2.0f, 14.776f, 2.224f, 15.0f, 2.5f, 15.0f)
                horizontalLineTo(9.986f)
                curveTo(10.074f, 14.884f, 10.17f, 14.774f, 10.274f, 14.67f)
                close()
                moveTo(12.5f, 8.5f)
                curveTo(12.5f, 8.224f, 12.724f, 8.0f, 13.0f, 8.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 8.0f, 17.0f, 8.224f, 17.0f, 8.5f)
                curveTo(17.0f, 8.776f, 16.776f, 9.0f, 16.5f, 9.0f)
                horizontalLineTo(13.0f)
                curveTo(12.724f, 9.0f, 12.5f, 8.776f, 12.5f, 8.5f)
                close()
                moveTo(10.5f, 5.0f)
                curveTo(10.224f, 5.0f, 10.0f, 5.224f, 10.0f, 5.5f)
                curveTo(10.0f, 5.776f, 10.224f, 6.0f, 10.5f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.276f, 6.0f, 17.5f, 5.776f, 17.5f, 5.5f)
                curveTo(17.5f, 5.224f, 17.276f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(10.98f, 15.377f)
                lineTo(15.809f, 10.548f)
                curveTo(16.539f, 9.817f, 17.724f, 9.817f, 18.454f, 10.548f)
                curveTo(19.184f, 11.278f, 19.184f, 12.462f, 18.454f, 13.193f)
                lineTo(13.625f, 18.022f)
                curveTo(13.343f, 18.304f, 12.99f, 18.503f, 12.604f, 18.6f)
                lineTo(11.106f, 18.974f)
                curveTo(10.455f, 19.137f, 9.865f, 18.547f, 10.027f, 17.896f)
                lineTo(10.402f, 16.398f)
                curveTo(10.498f, 16.012f, 10.698f, 15.659f, 10.98f, 15.377f)
                close()
            }
        }
        .build()
        return _codeTextEdit!!
    }

@Suppress("ObjectPropertyName")
private var _codeTextEdit: ImageVector? = null

@Preview
@Composable
private fun CodeTextEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeTextEdit, contentDescription = "CodeTextEdit Icon")
    }
}

