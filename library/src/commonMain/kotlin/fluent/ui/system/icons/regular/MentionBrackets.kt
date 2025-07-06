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
 * MentionBrackets Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent specific targeting of mentions in UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mention_brackets_20_regular.svg)
 * 
 * @return The [ImageVector] for the MentionBrackets icon.
 */
public val FluentIcons.Regular.MentionBrackets: ImageVector
    get() {
        if (_mentionBrackets != null) {
            return _mentionBrackets!!
        }
        _mentionBrackets = Builder(name = "MentionBrackets", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 3.0f)
                curveTo(3.672f, 3.0f, 3.0f, 3.672f, 3.0f, 4.5f)
                verticalLineTo(15.5f)
                curveTo(3.0f, 16.328f, 3.672f, 17.0f, 4.5f, 17.0f)
                horizontalLineTo(6.5f)
                curveTo(6.776f, 17.0f, 7.0f, 17.224f, 7.0f, 17.5f)
                curveTo(7.0f, 17.776f, 6.776f, 18.0f, 6.5f, 18.0f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 18.0f, 2.0f, 16.881f, 2.0f, 15.5f)
                verticalLineTo(4.5f)
                curveTo(2.0f, 3.119f, 3.119f, 2.0f, 4.5f, 2.0f)
                horizontalLineTo(6.5f)
                curveTo(6.776f, 2.0f, 7.0f, 2.224f, 7.0f, 2.5f)
                curveTo(7.0f, 2.776f, 6.776f, 3.0f, 6.5f, 3.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(15.5f, 17.0f)
                curveTo(16.328f, 17.0f, 17.0f, 16.328f, 17.0f, 15.5f)
                verticalLineTo(4.5f)
                curveTo(17.0f, 3.672f, 16.328f, 3.0f, 15.5f, 3.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 3.0f, 13.0f, 2.776f, 13.0f, 2.5f)
                curveTo(13.0f, 2.224f, 13.224f, 2.0f, 13.5f, 2.0f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 2.0f, 18.0f, 3.119f, 18.0f, 4.5f)
                verticalLineTo(15.5f)
                curveTo(18.0f, 16.881f, 16.881f, 18.0f, 15.5f, 18.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 18.0f, 13.0f, 17.776f, 13.0f, 17.5f)
                curveTo(13.0f, 17.224f, 13.224f, 17.0f, 13.5f, 17.0f)
                horizontalLineTo(15.5f)
                close()
                moveTo(11.5f, 10.0f)
                curveTo(11.5f, 9.172f, 10.828f, 8.5f, 10.0f, 8.5f)
                curveTo(9.172f, 8.5f, 8.5f, 9.172f, 8.5f, 10.0f)
                curveTo(8.5f, 10.828f, 9.172f, 11.5f, 10.0f, 11.5f)
                curveTo(10.828f, 11.5f, 11.5f, 10.828f, 11.5f, 10.0f)
                close()
                moveTo(10.0f, 7.5f)
                curveTo(10.563f, 7.5f, 11.082f, 7.686f, 11.5f, 8.0f)
                curveTo(11.5f, 7.724f, 11.724f, 7.5f, 12.0f, 7.5f)
                curveTo(12.276f, 7.5f, 12.5f, 7.724f, 12.5f, 8.0f)
                verticalLineTo(10.75f)
                curveTo(12.5f, 11.164f, 12.836f, 11.5f, 13.25f, 11.5f)
                curveTo(13.664f, 11.5f, 14.0f, 11.164f, 14.0f, 10.75f)
                verticalLineTo(10.0f)
                curveTo(14.0f, 7.791f, 12.209f, 6.0f, 10.0f, 6.0f)
                curveTo(7.791f, 6.0f, 6.0f, 7.791f, 6.0f, 10.0f)
                curveTo(6.0f, 12.129f, 7.663f, 13.87f, 9.761f, 13.993f)
                lineTo(9.757f, 14.0f)
                lineTo(9.783f, 13.994f)
                curveTo(9.855f, 13.998f, 9.927f, 14.0f, 10.0f, 14.0f)
                curveTo(10.449f, 14.0f, 10.927f, 13.916f, 11.361f, 13.772f)
                curveTo(11.659f, 13.674f, 12.0f, 13.881f, 12.0f, 14.196f)
                curveTo(12.0f, 14.432f, 11.861f, 14.648f, 11.639f, 14.725f)
                curveTo(11.125f, 14.903f, 10.574f, 15.0f, 10.0f, 15.0f)
                curveTo(7.239f, 15.0f, 5.0f, 12.761f, 5.0f, 10.0f)
                curveTo(5.0f, 7.239f, 7.239f, 5.0f, 10.0f, 5.0f)
                curveTo(12.761f, 5.0f, 15.0f, 7.239f, 15.0f, 10.0f)
                verticalLineTo(10.75f)
                curveTo(15.0f, 11.717f, 14.217f, 12.5f, 13.25f, 12.5f)
                curveTo(12.648f, 12.5f, 12.117f, 12.196f, 11.802f, 11.733f)
                curveTo(11.347f, 12.206f, 10.708f, 12.5f, 10.0f, 12.5f)
                curveTo(8.619f, 12.5f, 7.5f, 11.381f, 7.5f, 10.0f)
                curveTo(7.5f, 8.619f, 8.619f, 7.5f, 10.0f, 7.5f)
                close()
            }
        }
        .build()
        return _mentionBrackets!!
    }

@Suppress("ObjectPropertyName")
private var _mentionBrackets: ImageVector? = null

@Preview
@Composable
private fun MentionBracketsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MentionBrackets, contentDescription = "MentionBrackets Icon")
    }
}

