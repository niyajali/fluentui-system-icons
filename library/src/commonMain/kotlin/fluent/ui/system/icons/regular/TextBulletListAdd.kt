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
 * TextBulletListAdd Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_bullet_list_add_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextBulletListAdd icon.
 */
public val FluentIcons.Regular.TextBulletListAdd: ImageVector
    get() {
        if (_textBulletListAdd != null) {
            return _textBulletListAdd!!
        }
        _textBulletListAdd = Builder(name = "TextBulletListAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.499f, 18.749f)
                curveTo(4.499f, 18.059f, 3.939f, 17.5f, 3.249f, 17.5f)
                curveTo(2.559f, 17.5f, 2.0f, 18.059f, 2.0f, 18.749f)
                curveTo(2.0f, 19.439f, 2.559f, 19.999f, 3.249f, 19.999f)
                curveTo(3.939f, 19.999f, 4.499f, 19.439f, 4.499f, 18.749f)
                close()
                moveTo(12.019f, 18.0f)
                horizontalLineTo(6.75f)
                lineTo(6.648f, 18.007f)
                curveTo(6.282f, 18.056f, 6.0f, 18.37f, 6.0f, 18.75f)
                curveTo(6.0f, 19.164f, 6.336f, 19.5f, 6.75f, 19.5f)
                horizontalLineTo(12.314f)
                curveTo(12.159f, 19.022f, 12.059f, 18.52f, 12.019f, 18.0f)
                close()
                moveTo(13.809f, 13.0f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 13.0f, 6.0f, 12.664f, 6.0f, 12.25f)
                curveTo(6.0f, 11.87f, 6.282f, 11.557f, 6.648f, 11.507f)
                lineTo(6.75f, 11.5f)
                horizontalLineTo(15.994f)
                curveTo(15.165f, 11.847f, 14.422f, 12.361f, 13.809f, 13.0f)
                close()
                moveTo(4.499f, 12.249f)
                curveTo(4.499f, 11.559f, 3.939f, 11.0f, 3.249f, 11.0f)
                curveTo(2.559f, 11.0f, 2.0f, 11.559f, 2.0f, 12.249f)
                curveTo(2.0f, 12.939f, 2.559f, 13.499f, 3.249f, 13.499f)
                curveTo(3.939f, 13.499f, 4.499f, 12.939f, 4.499f, 12.249f)
                close()
                moveTo(4.499f, 5.749f)
                curveTo(4.499f, 5.059f, 3.939f, 4.5f, 3.249f, 4.5f)
                curveTo(2.559f, 4.5f, 2.0f, 5.059f, 2.0f, 5.749f)
                curveTo(2.0f, 6.439f, 2.559f, 6.999f, 3.249f, 6.999f)
                curveTo(3.939f, 6.999f, 4.499f, 6.439f, 4.499f, 5.749f)
                close()
                moveTo(21.25f, 5.0f)
                horizontalLineTo(6.75f)
                lineTo(6.648f, 5.007f)
                curveTo(6.282f, 5.057f, 6.0f, 5.37f, 6.0f, 5.75f)
                curveTo(6.0f, 6.164f, 6.336f, 6.5f, 6.75f, 6.5f)
                horizontalLineTo(21.25f)
                lineTo(21.352f, 6.493f)
                curveTo(21.718f, 6.443f, 22.0f, 6.13f, 22.0f, 5.75f)
                curveTo(22.0f, 5.336f, 21.664f, 5.0f, 21.25f, 5.0f)
                close()
                moveTo(24.0f, 17.5f)
                curveTo(24.0f, 14.462f, 21.538f, 12.0f, 18.5f, 12.0f)
                curveTo(15.462f, 12.0f, 13.0f, 14.462f, 13.0f, 17.5f)
                curveTo(13.0f, 20.537f, 15.462f, 23.0f, 18.5f, 23.0f)
                curveTo(21.538f, 23.0f, 24.0f, 20.537f, 24.0f, 17.5f)
                close()
                moveTo(19.001f, 18.0f)
                lineTo(19.001f, 20.503f)
                curveTo(19.001f, 20.779f, 18.777f, 21.003f, 18.501f, 21.003f)
                curveTo(18.225f, 21.003f, 18.001f, 20.779f, 18.001f, 20.503f)
                lineTo(18.001f, 18.0f)
                horizontalLineTo(15.496f)
                curveTo(15.22f, 18.0f, 14.996f, 17.776f, 14.996f, 17.5f)
                curveTo(14.996f, 17.223f, 15.22f, 17.0f, 15.496f, 17.0f)
                horizontalLineTo(18.0f)
                lineTo(18.0f, 14.499f)
                curveTo(18.0f, 14.223f, 18.224f, 13.999f, 18.5f, 13.999f)
                curveTo(18.776f, 13.999f, 19.0f, 14.223f, 19.0f, 14.499f)
                lineTo(19.0f, 17.0f)
                horizontalLineTo(21.497f)
                curveTo(21.772f, 17.0f, 21.996f, 17.223f, 21.996f, 17.5f)
                curveTo(21.996f, 17.776f, 21.772f, 18.0f, 21.497f, 18.0f)
                horizontalLineTo(19.001f)
                close()
            }
        }
        .build()
        return _textBulletListAdd!!
    }

@Suppress("ObjectPropertyName")
private var _textBulletListAdd: ImageVector? = null

@Preview
@Composable
private fun TextBulletListAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextBulletListAdd, contentDescription = "TextBulletListAdd Icon")
    }
}

