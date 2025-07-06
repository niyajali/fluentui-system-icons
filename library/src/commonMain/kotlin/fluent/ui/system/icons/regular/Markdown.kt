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
 * Markdown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, visual studio
 * - Description: Used to represent converting to Markdown text. Markdown is a lightweight markup language for creating formatted text.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_markdown_20_regular.svg)
 * 
 * @return The [ImageVector] for the Markdown icon.
 */
public val FluentIcons.Regular.Markdown: ImageVector
    get() {
        if (_markdown != null) {
            return _markdown!!
        }
        _markdown = Builder(name = "Markdown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 4.5f)
                curveTo(16.0f, 4.224f, 15.776f, 4.0f, 15.5f, 4.0f)
                curveTo(15.224f, 4.0f, 15.0f, 4.224f, 15.0f, 4.5f)
                verticalLineTo(13.293f)
                lineTo(13.854f, 12.146f)
                curveTo(13.658f, 11.951f, 13.342f, 11.951f, 13.146f, 12.146f)
                curveTo(12.951f, 12.342f, 12.951f, 12.658f, 13.146f, 12.854f)
                lineTo(15.146f, 14.854f)
                curveTo(15.342f, 15.049f, 15.658f, 15.049f, 15.854f, 14.854f)
                lineTo(17.854f, 12.854f)
                curveTo(18.049f, 12.658f, 18.049f, 12.342f, 17.854f, 12.146f)
                curveTo(17.658f, 11.951f, 17.342f, 11.951f, 17.146f, 12.146f)
                lineTo(16.0f, 13.293f)
                verticalLineTo(4.5f)
                close()
                moveTo(2.321f, 4.033f)
                curveTo(2.514f, 3.959f, 2.733f, 4.012f, 2.872f, 4.166f)
                lineTo(7.0f, 8.753f)
                lineTo(11.128f, 4.166f)
                curveTo(11.267f, 4.012f, 11.486f, 3.959f, 11.679f, 4.033f)
                curveTo(11.872f, 4.107f, 12.0f, 4.293f, 12.0f, 4.5f)
                verticalLineTo(14.5f)
                curveTo(12.0f, 14.776f, 11.776f, 15.0f, 11.5f, 15.0f)
                curveTo(11.224f, 15.0f, 11.0f, 14.776f, 11.0f, 14.5f)
                verticalLineTo(5.803f)
                lineTo(7.372f, 9.835f)
                curveTo(7.277f, 9.94f, 7.142f, 10.0f, 7.0f, 10.0f)
                curveTo(6.858f, 10.0f, 6.723f, 9.94f, 6.628f, 9.835f)
                lineTo(3.0f, 5.803f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 14.776f, 2.776f, 15.0f, 2.5f, 15.0f)
                curveTo(2.224f, 15.0f, 2.0f, 14.776f, 2.0f, 14.5f)
                verticalLineTo(4.5f)
                curveTo(2.0f, 4.293f, 2.128f, 4.107f, 2.321f, 4.033f)
                close()
            }
        }
        .build()
        return _markdown!!
    }

@Suppress("ObjectPropertyName")
private var _markdown: ImageVector? = null

@Preview
@Composable
private fun MarkdownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Markdown, contentDescription = "Markdown Icon")
    }
}

