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
 * TextPositionFront icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, position, front
 * - Source: ic_fluent_text_position_front_24_regular.svg
 * 
 * @return The [ImageVector] for the TextPositionFront icon.
 */
public val FluentIcons.Regular.TextPositionFront: ImageVector
    get() {
        if (_textPositionFront != null) {
            return _textPositionFront!!
        }
        _textPositionFront = Builder(name = "TextPositionFront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 4.0f)
                curveTo(3.336f, 4.0f, 3.0f, 4.336f, 3.0f, 4.75f)
                curveTo(3.0f, 5.164f, 3.336f, 5.5f, 3.75f, 5.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 5.5f, 21.0f, 5.164f, 21.0f, 4.75f)
                curveTo(21.0f, 4.336f, 20.664f, 4.0f, 20.25f, 4.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(12.0f, 8.5f)
                curveTo(10.975f, 8.5f, 10.094f, 9.117f, 9.708f, 10.0f)
                horizontalLineTo(8.126f)
                curveTo(8.57f, 8.275f, 10.136f, 7.0f, 12.0f, 7.0f)
                curveTo(13.864f, 7.0f, 15.43f, 8.275f, 15.874f, 10.0f)
                horizontalLineTo(14.292f)
                curveTo(13.906f, 9.117f, 13.025f, 8.5f, 12.0f, 8.5f)
                close()
                moveTo(8.0f, 13.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(15.75f)
                curveTo(9.5f, 16.164f, 9.164f, 16.5f, 8.75f, 16.5f)
                curveTo(8.336f, 16.5f, 8.0f, 16.164f, 8.0f, 15.75f)
                verticalLineTo(13.5f)
                close()
                moveTo(16.0f, 13.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(15.75f)
                curveTo(14.5f, 16.164f, 14.836f, 16.5f, 15.25f, 16.5f)
                curveTo(15.664f, 16.5f, 16.0f, 16.164f, 16.0f, 15.75f)
                verticalLineTo(13.5f)
                close()
                moveTo(20.25f, 11.0f)
                curveTo(20.664f, 11.0f, 21.0f, 11.336f, 21.0f, 11.75f)
                curveTo(21.0f, 12.164f, 20.664f, 12.5f, 20.25f, 12.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 12.5f, 3.0f, 12.164f, 3.0f, 11.75f)
                curveTo(3.0f, 11.336f, 3.336f, 11.0f, 3.75f, 11.0f)
                horizontalLineTo(20.25f)
                close()
                moveTo(3.0f, 18.75f)
                curveTo(3.0f, 18.336f, 3.336f, 18.0f, 3.75f, 18.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 18.0f, 21.0f, 18.336f, 21.0f, 18.75f)
                curveTo(21.0f, 19.164f, 20.664f, 19.5f, 20.25f, 19.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 19.5f, 3.0f, 19.164f, 3.0f, 18.75f)
                close()
            }
        }
        .build()
        return _textPositionFront!!
    }

@Suppress("ObjectPropertyName")
private var _textPositionFront: ImageVector? = null

@Preview
@Composable
private fun TextPositionFrontPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextPositionFront, contentDescription = null)
    }
}

