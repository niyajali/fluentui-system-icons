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
 * TextAsterisk icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: text, asterisk
 * - Source: ic_fluent_text_asterisk_20_regular.svg
 * 
 * @return The [ImageVector] for the TextAsterisk icon.
 */
public val FluentIcons.Regular.TextAsterisk: ImageVector
    get() {
        if (_textAsterisk != null) {
            return _textAsterisk!!
        }
        _textAsterisk = Builder(name = "TextAsterisk", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 2.5f)
                curveTo(10.5f, 2.224f, 10.276f, 2.0f, 10.0f, 2.0f)
                curveTo(9.724f, 2.0f, 9.5f, 2.224f, 9.5f, 2.5f)
                verticalLineTo(8.793f)
                lineTo(5.05f, 4.343f)
                curveTo(4.855f, 4.148f, 4.538f, 4.148f, 4.343f, 4.343f)
                curveTo(4.148f, 4.538f, 4.148f, 4.855f, 4.343f, 5.05f)
                lineTo(8.793f, 9.5f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 9.5f, 2.0f, 9.724f, 2.0f, 10.0f)
                curveTo(2.0f, 10.276f, 2.224f, 10.5f, 2.5f, 10.5f)
                horizontalLineTo(8.793f)
                lineTo(4.343f, 14.95f)
                curveTo(4.148f, 15.145f, 4.148f, 15.462f, 4.343f, 15.657f)
                curveTo(4.538f, 15.852f, 4.855f, 15.852f, 5.05f, 15.657f)
                lineTo(9.5f, 11.207f)
                verticalLineTo(17.5f)
                curveTo(9.5f, 17.776f, 9.724f, 18.0f, 10.0f, 18.0f)
                curveTo(10.276f, 18.0f, 10.5f, 17.776f, 10.5f, 17.5f)
                verticalLineTo(11.207f)
                lineTo(14.95f, 15.657f)
                curveTo(15.145f, 15.852f, 15.462f, 15.852f, 15.657f, 15.657f)
                curveTo(15.852f, 15.462f, 15.852f, 15.145f, 15.657f, 14.95f)
                lineTo(11.207f, 10.5f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 10.5f, 18.0f, 10.276f, 18.0f, 10.0f)
                curveTo(18.0f, 9.724f, 17.776f, 9.5f, 17.5f, 9.5f)
                horizontalLineTo(11.207f)
                lineTo(15.657f, 5.05f)
                curveTo(15.852f, 4.855f, 15.852f, 4.538f, 15.657f, 4.343f)
                curveTo(15.462f, 4.148f, 15.145f, 4.148f, 14.95f, 4.343f)
                lineTo(10.5f, 8.793f)
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
        Image(imageVector = FluentIcons.Regular.TextAsterisk, contentDescription = null)
    }
}

