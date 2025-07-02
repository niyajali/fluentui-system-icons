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
 * CodeTextEdit icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: code, text, edit
 * - Source: ic_fluent_code_text_edit_20_filled.svg
 * 
 * @return The [ImageVector] for the CodeTextEdit icon.
 */
public val FluentIcons.Filled.CodeTextEdit: ImageVector
    get() {
        if (_codeTextEdit != null) {
            return _codeTextEdit!!
        }
        _codeTextEdit = Builder(name = "CodeTextEdit", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 4.5f)
                curveTo(2.336f, 4.5f, 2.0f, 4.836f, 2.0f, 5.25f)
                curveTo(2.0f, 5.664f, 2.336f, 6.0f, 2.75f, 6.0f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 6.0f, 8.5f, 5.664f, 8.5f, 5.25f)
                curveTo(8.5f, 4.836f, 8.164f, 4.5f, 7.75f, 4.5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(5.75f, 7.5f)
                curveTo(5.336f, 7.5f, 5.0f, 7.836f, 5.0f, 8.25f)
                curveTo(5.0f, 8.664f, 5.336f, 9.0f, 5.75f, 9.0f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 9.0f, 11.0f, 8.664f, 11.0f, 8.25f)
                curveTo(11.0f, 7.836f, 10.664f, 7.5f, 10.25f, 7.5f)
                horizontalLineTo(5.75f)
                close()
                moveTo(4.0f, 11.25f)
                curveTo(4.0f, 10.836f, 4.336f, 10.5f, 4.75f, 10.5f)
                horizontalLineTo(14.25f)
                curveTo(14.31f, 10.5f, 14.368f, 10.507f, 14.424f, 10.52f)
                lineTo(12.944f, 12.0f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 12.0f, 4.0f, 11.664f, 4.0f, 11.25f)
                close()
                moveTo(10.274f, 14.67f)
                lineTo(11.251f, 13.692f)
                curveTo(11.118f, 13.573f, 10.943f, 13.5f, 10.75f, 13.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.5f, 2.0f, 13.836f, 2.0f, 14.25f)
                curveTo(2.0f, 14.664f, 2.336f, 15.0f, 2.75f, 15.0f)
                horizontalLineTo(9.986f)
                curveTo(10.074f, 14.884f, 10.17f, 14.774f, 10.274f, 14.67f)
                close()
                moveTo(12.5f, 8.25f)
                curveTo(12.5f, 7.836f, 12.836f, 7.5f, 13.25f, 7.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 7.5f, 17.0f, 7.836f, 17.0f, 8.25f)
                curveTo(17.0f, 8.664f, 16.664f, 9.0f, 16.25f, 9.0f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 9.0f, 12.5f, 8.664f, 12.5f, 8.25f)
                close()
                moveTo(10.75f, 4.5f)
                curveTo(10.336f, 4.5f, 10.0f, 4.836f, 10.0f, 5.25f)
                curveTo(10.0f, 5.664f, 10.336f, 6.0f, 10.75f, 6.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 6.0f, 18.0f, 5.664f, 18.0f, 5.25f)
                curveTo(18.0f, 4.836f, 17.664f, 4.5f, 17.25f, 4.5f)
                horizontalLineTo(10.75f)
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
        Image(imageVector = FluentIcons.Filled.CodeTextEdit, contentDescription = null)
    }
}

