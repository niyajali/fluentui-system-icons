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
 * TextPeriodAsterisk Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_period_asterisk_20_filled.svg)
 * 
 * @return The [ImageVector] for the TextPeriodAsterisk icon.
 */
public val FluentIcons.Filled.TextPeriodAsterisk: ImageVector
    get() {
        if (_textPeriodAsterisk != null) {
            return _textPeriodAsterisk!!
        }
        _textPeriodAsterisk = Builder(name = "TextPeriodAsterisk", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.246f, 4.75f)
                curveTo(12.246f, 4.336f, 11.91f, 4.0f, 11.496f, 4.0f)
                curveTo(11.082f, 4.0f, 10.746f, 4.336f, 10.746f, 4.75f)
                verticalLineTo(6.608f)
                lineTo(8.982f, 6.035f)
                curveTo(8.588f, 5.907f, 8.165f, 6.122f, 8.037f, 6.516f)
                curveTo(7.909f, 6.91f, 8.125f, 7.333f, 8.518f, 7.461f)
                lineTo(10.286f, 8.036f)
                lineTo(9.193f, 9.54f)
                curveTo(8.95f, 9.875f, 9.024f, 10.344f, 9.359f, 10.588f)
                curveTo(9.694f, 10.831f, 10.163f, 10.757f, 10.407f, 10.422f)
                lineTo(11.498f, 8.92f)
                lineTo(12.589f, 10.422f)
                curveTo(12.833f, 10.757f, 13.302f, 10.831f, 13.637f, 10.588f)
                curveTo(13.972f, 10.344f, 14.046f, 9.875f, 13.802f, 9.54f)
                lineTo(12.71f, 8.037f)
                lineTo(14.481f, 7.461f)
                curveTo(14.875f, 7.333f, 15.091f, 6.91f, 14.963f, 6.516f)
                curveTo(14.835f, 6.122f, 14.412f, 5.907f, 14.018f, 6.035f)
                lineTo(12.246f, 6.61f)
                verticalLineTo(4.75f)
                close()
                moveTo(6.5f, 16.0f)
                curveTo(7.328f, 16.0f, 8.0f, 15.328f, 8.0f, 14.5f)
                curveTo(8.0f, 13.672f, 7.328f, 13.0f, 6.5f, 13.0f)
                curveTo(5.672f, 13.0f, 5.0f, 13.672f, 5.0f, 14.5f)
                curveTo(5.0f, 15.328f, 5.672f, 16.0f, 6.5f, 16.0f)
                close()
            }
        }
        .build()
        return _textPeriodAsterisk!!
    }

@Suppress("ObjectPropertyName")
private var _textPeriodAsterisk: ImageVector? = null

@Preview
@Composable
private fun TextPeriodAsteriskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextPeriodAsterisk, contentDescription = "TextPeriodAsterisk Icon")
    }
}

