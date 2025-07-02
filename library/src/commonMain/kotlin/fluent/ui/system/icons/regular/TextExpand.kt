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
 * TextExpand icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, expand
 * - Source: ic_fluent_text_expand_24_regular.svg
 * 
 * @return The [ImageVector] for the TextExpand icon.
 */
public val FluentIcons.Regular.TextExpand: ImageVector
    get() {
        if (_textExpand != null) {
            return _textExpand!!
        }
        _textExpand = Builder(name = "TextExpand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 19.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 19.5f, 22.0f, 19.164f, 22.0f, 18.75f)
                curveTo(22.0f, 18.37f, 21.718f, 18.056f, 21.352f, 18.007f)
                lineTo(21.25f, 18.0f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 18.0f, 6.0f, 18.336f, 6.0f, 18.75f)
                curveTo(6.0f, 19.13f, 6.282f, 19.444f, 6.648f, 19.493f)
                lineTo(6.75f, 19.5f)
                close()
                moveTo(6.75f, 4.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 4.5f, 22.0f, 4.164f, 22.0f, 3.75f)
                curveTo(22.0f, 3.37f, 21.718f, 3.057f, 21.352f, 3.007f)
                lineTo(21.25f, 3.0f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 3.0f, 6.0f, 3.336f, 6.0f, 3.75f)
                curveTo(6.0f, 4.13f, 6.282f, 4.443f, 6.648f, 4.493f)
                lineTo(6.75f, 4.5f)
                close()
                moveTo(13.75f, 8.0f)
                curveTo(13.336f, 8.0f, 13.0f, 8.336f, 13.0f, 8.75f)
                curveTo(13.0f, 9.164f, 13.336f, 9.5f, 13.75f, 9.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 9.5f, 22.0f, 9.164f, 22.0f, 8.75f)
                curveTo(22.0f, 8.336f, 21.664f, 8.0f, 21.25f, 8.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(13.0f, 13.75f)
                curveTo(13.0f, 13.336f, 13.336f, 13.0f, 13.75f, 13.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 13.0f, 22.0f, 13.336f, 22.0f, 13.75f)
                curveTo(22.0f, 14.164f, 21.664f, 14.5f, 21.25f, 14.5f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 14.5f, 13.0f, 14.164f, 13.0f, 13.75f)
                close()
                moveTo(11.0f, 11.5f)
                curveTo(11.0f, 13.985f, 8.985f, 16.0f, 6.5f, 16.0f)
                curveTo(4.015f, 16.0f, 2.0f, 13.985f, 2.0f, 11.5f)
                curveTo(2.0f, 9.015f, 4.015f, 7.0f, 6.5f, 7.0f)
                curveTo(8.985f, 7.0f, 11.0f, 9.015f, 11.0f, 11.5f)
                close()
                moveTo(7.0f, 9.5f)
                curveTo(7.0f, 9.224f, 6.776f, 9.0f, 6.5f, 9.0f)
                curveTo(6.224f, 9.0f, 6.0f, 9.224f, 6.0f, 9.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 11.0f, 4.0f, 11.224f, 4.0f, 11.5f)
                curveTo(4.0f, 11.776f, 4.224f, 12.0f, 4.5f, 12.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 13.5f)
                curveTo(6.0f, 13.776f, 6.224f, 14.0f, 6.5f, 14.0f)
                curveTo(6.776f, 14.0f, 7.0f, 13.776f, 7.0f, 13.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.5f)
                curveTo(8.776f, 12.0f, 9.0f, 11.776f, 9.0f, 11.5f)
                curveTo(9.0f, 11.224f, 8.776f, 11.0f, 8.5f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _textExpand!!
    }

@Suppress("ObjectPropertyName")
private var _textExpand: ImageVector? = null

@Preview
@Composable
private fun TextExpandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextExpand, contentDescription = null)
    }
}

