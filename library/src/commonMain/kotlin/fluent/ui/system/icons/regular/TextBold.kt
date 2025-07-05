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
 * TextBold Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains locale variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_bold_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextBold icon.
 */
public val FluentIcons.Regular.TextBold: ImageVector
    get() {
        if (_textBold != null) {
            return _textBold!!
        }
        _textBold = Builder(name = "TextBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.935f, 4.44f)
                curveTo(7.216f, 4.158f, 7.598f, 4.0f, 7.996f, 4.0f)
                horizontalLineTo(12.38f)
                curveTo(15.016f, 4.0f, 17.0f, 6.182f, 17.0f, 8.625f)
                curveTo(17.0f, 9.602f, 16.683f, 10.537f, 16.134f, 11.307f)
                curveTo(17.211f, 12.134f, 18.0f, 13.427f, 18.0f, 15.12f)
                curveTo(18.0f, 18.232f, 15.301f, 20.0f, 13.12f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(7.171f, 20.0f, 6.5f, 19.328f, 6.5f, 18.5f)
                lineTo(6.496f, 5.501f)
                curveTo(6.496f, 5.103f, 6.654f, 4.721f, 6.935f, 4.44f)
                close()
                moveTo(9.499f, 10.25f)
                horizontalLineTo(12.38f)
                curveTo(13.282f, 10.25f, 14.0f, 9.491f, 14.0f, 8.625f)
                curveTo(14.0f, 7.76f, 13.281f, 7.0f, 12.38f, 7.0f)
                horizontalLineTo(9.497f)
                lineTo(9.499f, 10.25f)
                close()
                moveTo(9.5f, 13.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.12f)
                curveTo(13.993f, 17.0f, 15.0f, 16.246f, 15.0f, 15.12f)
                curveTo(15.0f, 13.99f, 14.025f, 13.25f, 13.12f, 13.25f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _textBold!!
    }

@Suppress("ObjectPropertyName")
private var _textBold: ImageVector? = null

@Preview
@Composable
private fun TextBoldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextBold, contentDescription = "TextBold Icon")
    }
}

