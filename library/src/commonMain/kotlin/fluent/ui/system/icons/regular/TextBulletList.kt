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
 * TextBulletList Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains directional and rotate variants
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_bullet_list_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextBulletList icon.
 */
public val FluentIcons.Regular.TextBulletList: ImageVector
    get() {
        if (_textBulletList != null) {
            return _textBulletList!!
        }
        _textBulletList = Builder(name = "TextBulletList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.249f, 17.5f)
                curveTo(3.939f, 17.5f, 4.499f, 18.059f, 4.499f, 18.749f)
                curveTo(4.499f, 19.439f, 3.939f, 19.999f, 3.249f, 19.999f)
                curveTo(2.559f, 19.999f, 2.0f, 19.439f, 2.0f, 18.749f)
                curveTo(2.0f, 18.059f, 2.559f, 17.5f, 3.249f, 17.5f)
                close()
                moveTo(6.75f, 18.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 18.0f, 22.0f, 18.336f, 22.0f, 18.75f)
                curveTo(22.0f, 19.13f, 21.718f, 19.444f, 21.352f, 19.493f)
                lineTo(21.25f, 19.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 19.5f, 6.0f, 19.164f, 6.0f, 18.75f)
                curveTo(6.0f, 18.37f, 6.282f, 18.056f, 6.648f, 18.007f)
                lineTo(6.75f, 18.0f)
                horizontalLineTo(21.25f)
                horizontalLineTo(6.75f)
                close()
                moveTo(3.249f, 11.0f)
                curveTo(3.939f, 11.0f, 4.499f, 11.559f, 4.499f, 12.249f)
                curveTo(4.499f, 12.939f, 3.939f, 13.499f, 3.249f, 13.499f)
                curveTo(2.559f, 13.499f, 2.0f, 12.939f, 2.0f, 12.249f)
                curveTo(2.0f, 11.559f, 2.559f, 11.0f, 3.249f, 11.0f)
                close()
                moveTo(6.75f, 11.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 11.5f, 22.0f, 11.836f, 22.0f, 12.25f)
                curveTo(22.0f, 12.63f, 21.718f, 12.943f, 21.352f, 12.993f)
                lineTo(21.25f, 13.0f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 13.0f, 6.0f, 12.664f, 6.0f, 12.25f)
                curveTo(6.0f, 11.87f, 6.282f, 11.557f, 6.648f, 11.507f)
                lineTo(6.75f, 11.5f)
                horizontalLineTo(21.25f)
                horizontalLineTo(6.75f)
                close()
                moveTo(3.249f, 4.5f)
                curveTo(3.939f, 4.5f, 4.499f, 5.059f, 4.499f, 5.749f)
                curveTo(4.499f, 6.439f, 3.939f, 6.999f, 3.249f, 6.999f)
                curveTo(2.559f, 6.999f, 2.0f, 6.439f, 2.0f, 5.749f)
                curveTo(2.0f, 5.059f, 2.559f, 4.5f, 3.249f, 4.5f)
                close()
                moveTo(6.75f, 5.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 5.0f, 22.0f, 5.336f, 22.0f, 5.75f)
                curveTo(22.0f, 6.13f, 21.718f, 6.443f, 21.352f, 6.493f)
                lineTo(21.25f, 6.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 6.5f, 6.0f, 6.164f, 6.0f, 5.75f)
                curveTo(6.0f, 5.37f, 6.282f, 5.057f, 6.648f, 5.007f)
                lineTo(6.75f, 5.0f)
                horizontalLineTo(21.25f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _textBulletList!!
    }

@Suppress("ObjectPropertyName")
private var _textBulletList: ImageVector? = null

@Preview
@Composable
private fun TextBulletListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextBulletList, contentDescription = "TextBulletList Icon")
    }
}

