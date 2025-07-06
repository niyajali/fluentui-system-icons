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
 * TextBulletListSquarePerson Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_bullet_list_square_person_20_filled.svg)
 * 
 * @return The [ImageVector] for the TextBulletListSquarePerson icon.
 */
public val FluentIcons.Filled.TextBulletListSquarePerson: ImageVector
    get() {
        if (_textBulletListSquarePerson != null) {
            return _textBulletListSquarePerson!!
        }
        _textBulletListSquarePerson = Builder(name = "TextBulletListSquarePerson", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.231f, 4.231f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(14.25f)
                curveTo(15.769f, 3.0f, 17.0f, 4.231f, 17.0f, 5.75f)
                verticalLineTo(9.401f)
                curveTo(16.559f, 9.146f, 16.046f, 9.0f, 15.5f, 9.0f)
                curveTo(14.611f, 9.0f, 13.813f, 9.386f, 13.264f, 10.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 10.0f, 9.0f, 10.224f, 9.0f, 10.5f)
                curveTo(9.0f, 10.776f, 9.224f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(12.671f)
                curveTo(12.56f, 11.313f, 12.5f, 11.649f, 12.5f, 12.0f)
                curveTo(12.5f, 12.351f, 12.56f, 12.687f, 12.671f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 13.0f, 9.0f, 13.224f, 9.0f, 13.5f)
                curveTo(9.0f, 13.776f, 9.224f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(13.264f)
                lineTo(13.273f, 14.01f)
                curveTo(11.999f, 14.125f, 11.0f, 15.196f, 11.0f, 16.5f)
                curveTo(11.0f, 16.667f, 11.013f, 16.834f, 11.038f, 17.0f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 17.0f, 3.0f, 15.769f, 3.0f, 14.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(6.75f, 8.0f)
                curveTo(7.164f, 8.0f, 7.5f, 7.664f, 7.5f, 7.25f)
                curveTo(7.5f, 6.836f, 7.164f, 6.5f, 6.75f, 6.5f)
                curveTo(6.336f, 6.5f, 6.0f, 6.836f, 6.0f, 7.25f)
                curveTo(6.0f, 7.664f, 6.336f, 8.0f, 6.75f, 8.0f)
                close()
                moveTo(7.5f, 10.25f)
                curveTo(7.5f, 9.836f, 7.164f, 9.5f, 6.75f, 9.5f)
                curveTo(6.336f, 9.5f, 6.0f, 9.836f, 6.0f, 10.25f)
                curveTo(6.0f, 10.664f, 6.336f, 11.0f, 6.75f, 11.0f)
                curveTo(7.164f, 11.0f, 7.5f, 10.664f, 7.5f, 10.25f)
                close()
                moveTo(6.75f, 14.0f)
                curveTo(7.164f, 14.0f, 7.5f, 13.664f, 7.5f, 13.25f)
                curveTo(7.5f, 12.836f, 7.164f, 12.5f, 6.75f, 12.5f)
                curveTo(6.336f, 12.5f, 6.0f, 12.836f, 6.0f, 13.25f)
                curveTo(6.0f, 13.664f, 6.336f, 14.0f, 6.75f, 14.0f)
                close()
                moveTo(9.0f, 7.5f)
                curveTo(9.0f, 7.776f, 9.224f, 8.0f, 9.5f, 8.0f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 8.0f, 14.0f, 7.776f, 14.0f, 7.5f)
                curveTo(14.0f, 7.224f, 13.776f, 7.0f, 13.5f, 7.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 7.0f, 9.0f, 7.224f, 9.0f, 7.5f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(17.5f, 13.105f, 16.605f, 14.0f, 15.5f, 14.0f)
                curveTo(14.395f, 14.0f, 13.5f, 13.105f, 13.5f, 12.0f)
                curveTo(13.5f, 10.895f, 14.395f, 10.0f, 15.5f, 10.0f)
                curveTo(16.605f, 10.0f, 17.5f, 10.895f, 17.5f, 12.0f)
                close()
                moveTo(19.0f, 16.5f)
                curveTo(19.0f, 17.745f, 18.0f, 19.0f, 15.5f, 19.0f)
                curveTo(13.0f, 19.0f, 12.0f, 17.75f, 12.0f, 16.5f)
                curveTo(12.0f, 15.672f, 12.672f, 15.0f, 13.5f, 15.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 15.0f, 19.0f, 15.672f, 19.0f, 16.5f)
                close()
            }
        }
        .build()
        return _textBulletListSquarePerson!!
    }

@Suppress("ObjectPropertyName")
private var _textBulletListSquarePerson: ImageVector? = null

@Preview
@Composable
private fun TextBulletListSquarePersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBulletListSquarePerson, contentDescription = "TextBulletListSquarePerson Icon")
    }
}

