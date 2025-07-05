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
 * TextDescription Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used as default to basic text representation.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_description_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextDescription icon.
 */
public val FluentIcons.Regular.TextDescription: ImageVector
    get() {
        if (_textDescription != null) {
            return _textDescription!!
        }
        _textDescription = Builder(name = "TextDescription", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 17.0f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 17.0f, 16.0f, 17.336f, 16.0f, 17.75f)
                curveTo(16.0f, 18.13f, 15.718f, 18.444f, 15.352f, 18.493f)
                lineTo(15.25f, 18.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 18.5f, 2.0f, 18.164f, 2.0f, 17.75f)
                curveTo(2.0f, 17.37f, 2.282f, 17.056f, 2.648f, 17.007f)
                lineTo(2.75f, 17.0f)
                horizontalLineTo(15.25f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 13.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 13.0f, 22.0f, 13.336f, 22.0f, 13.75f)
                curveTo(22.0f, 14.13f, 21.718f, 14.443f, 21.352f, 14.493f)
                lineTo(21.25f, 14.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 14.5f, 2.0f, 14.164f, 2.0f, 13.75f)
                curveTo(2.0f, 13.37f, 2.282f, 13.057f, 2.648f, 13.007f)
                lineTo(2.75f, 13.0f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 9.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 9.0f, 22.0f, 9.336f, 22.0f, 9.75f)
                curveTo(22.0f, 10.13f, 21.718f, 10.443f, 21.352f, 10.493f)
                lineTo(21.25f, 10.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 10.5f, 2.0f, 10.164f, 2.0f, 9.75f)
                curveTo(2.0f, 9.37f, 2.282f, 9.057f, 2.648f, 9.007f)
                lineTo(2.75f, 9.0f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 5.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 5.0f, 22.0f, 5.336f, 22.0f, 5.75f)
                curveTo(22.0f, 6.13f, 21.718f, 6.443f, 21.352f, 6.493f)
                lineTo(21.25f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6.5f, 2.0f, 6.164f, 2.0f, 5.75f)
                curveTo(2.0f, 5.37f, 2.282f, 5.057f, 2.648f, 5.007f)
                lineTo(2.75f, 5.0f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _textDescription!!
    }

@Suppress("ObjectPropertyName")
private var _textDescription: ImageVector? = null

@Preview
@Composable
private fun TextDescriptionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextDescription, contentDescription = "TextDescription Icon")
    }
}

