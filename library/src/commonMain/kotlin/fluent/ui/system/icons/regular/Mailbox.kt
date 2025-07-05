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
 * Mailbox Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mailbox_20_regular.svg)
 * 
 * @return The [ImageVector] for the Mailbox icon.
 */
public val FluentIcons.Regular.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = Builder(name = "Mailbox", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 2.0f)
                curveTo(3.224f, 2.0f, 3.0f, 2.224f, 3.0f, 2.5f)
                verticalLineTo(4.5f)
                curveTo(3.0f, 4.776f, 3.224f, 5.0f, 3.5f, 5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.5f)
                curveTo(3.567f, 8.0f, 2.0f, 9.567f, 2.0f, 11.5f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 17.552f, 2.448f, 18.0f, 3.0f, 18.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 18.0f, 18.0f, 17.552f, 18.0f, 17.0f)
                verticalLineTo(11.5f)
                curveTo(18.0f, 9.567f, 16.433f, 8.0f, 14.5f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.5f)
                curveTo(8.0f, 2.224f, 7.776f, 2.0f, 7.5f, 2.0f)
                horizontalLineTo(3.5f)
                close()
                moveTo(7.0f, 9.0f)
                verticalLineTo(11.5f)
                curveTo(7.0f, 11.776f, 7.224f, 12.0f, 7.5f, 12.0f)
                curveTo(7.776f, 12.0f, 8.0f, 11.776f, 8.0f, 11.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.05f)
                curveTo(11.402f, 9.635f, 11.0f, 10.521f, 11.0f, 11.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.5f)
                curveTo(3.0f, 10.119f, 4.119f, 9.0f, 5.5f, 9.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(17.0f, 11.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.5f)
                curveTo(12.0f, 10.119f, 13.119f, 9.0f, 14.5f, 9.0f)
                curveTo(15.881f, 9.0f, 17.0f, 10.119f, 17.0f, 11.5f)
                close()
                moveTo(14.0f, 11.0f)
                curveTo(13.724f, 11.0f, 13.5f, 11.224f, 13.5f, 11.5f)
                curveTo(13.5f, 11.776f, 13.724f, 12.0f, 14.0f, 12.0f)
                horizontalLineTo(15.0f)
                curveTo(15.276f, 12.0f, 15.5f, 11.776f, 15.5f, 11.5f)
                curveTo(15.5f, 11.224f, 15.276f, 11.0f, 15.0f, 11.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _mailbox!!
    }

@Suppress("ObjectPropertyName")
private var _mailbox: ImageVector? = null

@Preview
@Composable
private fun MailboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Mailbox, contentDescription = "Mailbox Icon")
    }
}

