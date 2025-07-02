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
 * TextBulletListSquareClock icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: text, bullet, list, square, clock
 * - Source: ic_fluent_text_bullet_list_square_clock_20_filled.svg
 * 
 * @return The [ImageVector] for the TextBulletListSquareClock icon.
 */
public val FluentIcons.Filled.TextBulletListSquareClock: ImageVector
    get() {
        if (_textBulletListSquareClock != null) {
            return _textBulletListSquareClock!!
        }
        _textBulletListSquareClock = Builder(name = "TextBulletListSquareClock", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.75f, 3.0f)
                curveTo(4.231f, 3.0f, 3.0f, 4.231f, 3.0f, 5.75f)
                verticalLineTo(14.25f)
                curveTo(3.0f, 15.769f, 4.231f, 17.0f, 5.75f, 17.0f)
                horizontalLineTo(9.6f)
                curveTo(9.216f, 16.25f, 9.0f, 15.4f, 9.0f, 14.5f)
                curveTo(9.0f, 13.17f, 9.472f, 11.951f, 10.257f, 11.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 11.0f, 9.0f, 10.776f, 9.0f, 10.5f)
                curveTo(9.0f, 10.224f, 9.224f, 10.0f, 9.5f, 10.0f)
                horizontalLineTo(11.337f)
                curveTo(12.232f, 9.37f, 13.323f, 9.0f, 14.5f, 9.0f)
                curveTo(15.4f, 9.0f, 16.25f, 9.216f, 17.0f, 9.6f)
                verticalLineTo(5.75f)
                curveTo(17.0f, 4.231f, 15.769f, 3.0f, 14.25f, 3.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(7.5f, 7.25f)
                curveTo(7.5f, 7.664f, 7.164f, 8.0f, 6.75f, 8.0f)
                curveTo(6.336f, 8.0f, 6.0f, 7.664f, 6.0f, 7.25f)
                curveTo(6.0f, 6.836f, 6.336f, 6.5f, 6.75f, 6.5f)
                curveTo(7.164f, 6.5f, 7.5f, 6.836f, 7.5f, 7.25f)
                close()
                moveTo(6.75f, 9.5f)
                curveTo(7.164f, 9.5f, 7.5f, 9.836f, 7.5f, 10.25f)
                curveTo(7.5f, 10.664f, 7.164f, 11.0f, 6.75f, 11.0f)
                curveTo(6.336f, 11.0f, 6.0f, 10.664f, 6.0f, 10.25f)
                curveTo(6.0f, 9.836f, 6.336f, 9.5f, 6.75f, 9.5f)
                close()
                moveTo(7.5f, 13.25f)
                curveTo(7.5f, 13.664f, 7.164f, 14.0f, 6.75f, 14.0f)
                curveTo(6.336f, 14.0f, 6.0f, 13.664f, 6.0f, 13.25f)
                curveTo(6.0f, 12.836f, 6.336f, 12.5f, 6.75f, 12.5f)
                curveTo(7.164f, 12.5f, 7.5f, 12.836f, 7.5f, 13.25f)
                close()
                moveTo(9.5f, 8.0f)
                curveTo(9.224f, 8.0f, 9.0f, 7.776f, 9.0f, 7.5f)
                curveTo(9.0f, 7.224f, 9.224f, 7.0f, 9.5f, 7.0f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 7.0f, 14.0f, 7.224f, 14.0f, 7.5f)
                curveTo(14.0f, 7.776f, 13.776f, 8.0f, 13.5f, 8.0f)
                horizontalLineTo(9.5f)
                close()
                moveTo(14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(14.0f, 12.5f)
                curveTo(14.0f, 12.224f, 14.224f, 12.0f, 14.5f, 12.0f)
                curveTo(14.776f, 12.0f, 15.0f, 12.224f, 15.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                curveTo(16.276f, 14.0f, 16.5f, 14.224f, 16.5f, 14.5f)
                curveTo(16.5f, 14.776f, 16.276f, 15.0f, 16.0f, 15.0f)
                horizontalLineTo(14.5f)
                curveTo(14.224f, 15.0f, 14.0f, 14.776f, 14.0f, 14.5f)
                verticalLineTo(12.5f)
                close()
            }
        }
        .build()
        return _textBulletListSquareClock!!
    }

@Suppress("ObjectPropertyName")
private var _textBulletListSquareClock: ImageVector? = null

@Preview
@Composable
private fun TextBulletListSquareClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBulletListSquareClock, contentDescription = null)
    }
}

