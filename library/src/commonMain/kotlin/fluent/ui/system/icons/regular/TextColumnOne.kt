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
 * TextColumnOne icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, column, one
 * - Source: ic_fluent_text_column_one_24_regular.svg
 * 
 * @return The [ImageVector] for the TextColumnOne icon.
 */
public val FluentIcons.Regular.TextColumnOne: ImageVector
    get() {
        if (_textColumnOne != null) {
            return _textColumnOne!!
        }
        _textColumnOne = Builder(name = "TextColumnOne", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 5.75f)
                curveTo(5.0f, 5.336f, 5.336f, 5.0f, 5.75f, 5.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 5.0f, 19.0f, 5.336f, 19.0f, 5.75f)
                curveTo(19.0f, 6.164f, 18.664f, 6.5f, 18.25f, 6.5f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 6.5f, 5.0f, 6.164f, 5.0f, 5.75f)
                close()
                moveTo(5.0f, 9.75f)
                curveTo(5.0f, 9.336f, 5.336f, 9.0f, 5.75f, 9.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 9.0f, 19.0f, 9.336f, 19.0f, 9.75f)
                curveTo(19.0f, 10.164f, 18.664f, 10.5f, 18.25f, 10.5f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 10.5f, 5.0f, 10.164f, 5.0f, 9.75f)
                close()
                moveTo(5.0f, 13.75f)
                curveTo(5.0f, 13.336f, 5.336f, 13.0f, 5.75f, 13.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 13.0f, 19.0f, 13.336f, 19.0f, 13.75f)
                curveTo(19.0f, 14.164f, 18.664f, 14.5f, 18.25f, 14.5f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 14.5f, 5.0f, 14.164f, 5.0f, 13.75f)
                close()
                moveTo(5.0f, 17.75f)
                curveTo(5.0f, 17.336f, 5.336f, 17.0f, 5.75f, 17.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 17.0f, 19.0f, 17.336f, 19.0f, 17.75f)
                curveTo(19.0f, 18.164f, 18.664f, 18.5f, 18.25f, 18.5f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 18.5f, 5.0f, 18.164f, 5.0f, 17.75f)
                close()
            }
        }
        .build()
        return _textColumnOne!!
    }

@Suppress("ObjectPropertyName")
private var _textColumnOne: ImageVector? = null

@Preview
@Composable
private fun TextColumnOnePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextColumnOne, contentDescription = null)
    }
}

