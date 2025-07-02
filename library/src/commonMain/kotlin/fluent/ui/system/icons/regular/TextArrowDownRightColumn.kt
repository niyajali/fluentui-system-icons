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
 * TextArrowDownRightColumn icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, arrow, down, right, column
 * - Source: ic_fluent_text_arrow_down_right_column_24_regular.svg
 * 
 * @return The [ImageVector] for the TextArrowDownRightColumn icon.
 */
public val FluentIcons.Regular.TextArrowDownRightColumn: ImageVector
    get() {
        if (_textArrowDownRightColumn != null) {
            return _textArrowDownRightColumn!!
        }
        _textArrowDownRightColumn = Builder(name = "TextArrowDownRightColumn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 2.75f)
                curveTo(2.0f, 2.336f, 2.336f, 2.0f, 2.75f, 2.0f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 2.0f, 12.0f, 2.336f, 12.0f, 2.75f)
                curveTo(12.0f, 3.164f, 11.664f, 3.5f, 11.25f, 3.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 3.5f, 2.0f, 3.164f, 2.0f, 2.75f)
                close()
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 6.336f, 2.336f, 6.0f, 2.75f, 6.0f)
                horizontalLineTo(9.25f)
                curveTo(9.664f, 6.0f, 10.0f, 6.336f, 10.0f, 6.75f)
                curveTo(10.0f, 7.164f, 9.664f, 7.5f, 9.25f, 7.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 7.5f, 2.0f, 7.164f, 2.0f, 6.75f)
                close()
                moveTo(15.25f, 4.0f)
                curveTo(14.007f, 4.0f, 13.0f, 5.007f, 13.0f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(13.0f, 20.993f, 14.007f, 22.0f, 15.25f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 22.0f, 21.0f, 20.993f, 21.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 5.007f, 19.993f, 4.0f, 18.75f, 4.0f)
                horizontalLineTo(15.25f)
                close()
                moveTo(14.5f, 6.25f)
                curveTo(14.5f, 5.836f, 14.836f, 5.5f, 15.25f, 5.5f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 5.5f, 19.5f, 5.836f, 19.5f, 6.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(14.5f, 11.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(11.0f)
                close()
                moveTo(19.5f, 16.5f)
                verticalLineTo(19.75f)
                curveTo(19.5f, 20.164f, 19.164f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(15.25f)
                curveTo(14.836f, 20.5f, 14.5f, 20.164f, 14.5f, 19.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(19.5f)
                close()
                moveTo(4.5f, 10.75f)
                curveTo(4.5f, 10.336f, 4.164f, 10.0f, 3.75f, 10.0f)
                curveTo(3.336f, 10.0f, 3.0f, 10.336f, 3.0f, 10.75f)
                verticalLineTo(13.75f)
                curveTo(3.0f, 15.269f, 4.231f, 16.5f, 5.75f, 16.5f)
                horizontalLineTo(8.439f)
                lineTo(7.22f, 17.72f)
                curveTo(6.927f, 18.013f, 6.927f, 18.487f, 7.22f, 18.78f)
                curveTo(7.513f, 19.073f, 7.987f, 19.073f, 8.28f, 18.78f)
                lineTo(10.78f, 16.28f)
                curveTo(11.073f, 15.987f, 11.073f, 15.513f, 10.78f, 15.22f)
                lineTo(8.28f, 12.72f)
                curveTo(7.987f, 12.427f, 7.513f, 12.427f, 7.22f, 12.72f)
                curveTo(6.927f, 13.013f, 6.927f, 13.487f, 7.22f, 13.78f)
                lineTo(8.439f, 15.0f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 15.0f, 4.5f, 14.44f, 4.5f, 13.75f)
                verticalLineTo(10.75f)
                close()
            }
        }
        .build()
        return _textArrowDownRightColumn!!
    }

@Suppress("ObjectPropertyName")
private var _textArrowDownRightColumn: ImageVector? = null

@Preview
@Composable
private fun TextArrowDownRightColumnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextArrowDownRightColumn, contentDescription = null)
    }
}

