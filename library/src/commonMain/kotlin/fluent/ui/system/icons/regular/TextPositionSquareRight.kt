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
 * TextPositionSquareRight Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_position_square_right_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextPositionSquareRight icon.
 */
public val FluentIcons.Regular.TextPositionSquareRight: ImageVector
    get() {
        if (_textPositionSquareRight != null) {
            return _textPositionSquareRight!!
        }
        _textPositionSquareRight = Builder(name = "TextPositionSquareRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.25f, 4.0f)
                curveTo(20.664f, 4.0f, 21.0f, 4.336f, 21.0f, 4.75f)
                curveTo(21.0f, 5.164f, 20.664f, 5.5f, 20.25f, 5.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 5.5f, 3.0f, 5.164f, 3.0f, 4.75f)
                curveTo(3.0f, 4.336f, 3.336f, 4.0f, 3.75f, 4.0f)
                horizontalLineTo(20.25f)
                close()
                moveTo(10.75f, 7.5f)
                curveTo(11.164f, 7.5f, 11.5f, 7.836f, 11.5f, 8.25f)
                curveTo(11.5f, 8.664f, 11.164f, 9.0f, 10.75f, 9.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 9.0f, 3.0f, 8.664f, 3.0f, 8.25f)
                curveTo(3.0f, 7.836f, 3.336f, 7.5f, 3.75f, 7.5f)
                horizontalLineTo(10.75f)
                close()
                moveTo(11.5f, 15.25f)
                curveTo(11.5f, 14.836f, 11.164f, 14.5f, 10.75f, 14.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 14.5f, 3.0f, 14.836f, 3.0f, 15.25f)
                curveTo(3.0f, 15.664f, 3.336f, 16.0f, 3.75f, 16.0f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 16.0f, 11.5f, 15.664f, 11.5f, 15.25f)
                close()
                moveTo(10.75f, 11.0f)
                curveTo(11.164f, 11.0f, 11.5f, 11.336f, 11.5f, 11.75f)
                curveTo(11.5f, 12.164f, 11.164f, 12.5f, 10.75f, 12.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 12.5f, 3.0f, 12.164f, 3.0f, 11.75f)
                curveTo(3.0f, 11.336f, 3.336f, 11.0f, 3.75f, 11.0f)
                horizontalLineTo(10.75f)
                close()
                moveTo(21.0f, 18.75f)
                curveTo(21.0f, 18.336f, 20.664f, 18.0f, 20.25f, 18.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 18.0f, 3.0f, 18.336f, 3.0f, 18.75f)
                curveTo(3.0f, 19.164f, 3.336f, 19.5f, 3.75f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 19.5f, 21.0f, 19.164f, 21.0f, 18.75f)
                close()
                moveTo(19.5f, 11.0f)
                curveTo(19.5f, 9.619f, 18.381f, 8.5f, 17.0f, 8.5f)
                curveTo(15.619f, 8.5f, 14.5f, 9.619f, 14.5f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(14.5f, 16.164f, 14.164f, 16.5f, 13.75f, 16.5f)
                curveTo(13.336f, 16.5f, 13.0f, 16.164f, 13.0f, 15.75f)
                verticalLineTo(11.0f)
                curveTo(13.0f, 8.791f, 14.791f, 7.0f, 17.0f, 7.0f)
                curveTo(19.209f, 7.0f, 21.0f, 8.791f, 21.0f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(21.0f, 16.164f, 20.664f, 16.5f, 20.25f, 16.5f)
                curveTo(19.836f, 16.5f, 19.5f, 16.164f, 19.5f, 15.75f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _textPositionSquareRight!!
    }

@Suppress("ObjectPropertyName")
private var _textPositionSquareRight: ImageVector? = null

@Preview
@Composable
private fun TextPositionSquareRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextPositionSquareRight, contentDescription = "TextPositionSquareRight Icon")
    }
}

