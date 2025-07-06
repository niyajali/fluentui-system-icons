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
 * MailInboxPerson Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, outlook
 * - Description: Used to represent mail inbox.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mail_inbox_person_20_filled.svg)
 * 
 * @return The [ImageVector] for the MailInboxPerson icon.
 */
public val FluentIcons.Filled.MailInboxPerson: ImageVector
    get() {
        if (_mailInboxPerson != null) {
            return _mailInboxPerson!!
        }
        _mailInboxPerson = Builder(name = "MailInboxPerson", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 3.0f, 17.0f, 4.343f, 17.0f, 6.0f)
                verticalLineTo(9.401f)
                curveTo(16.696f, 9.226f, 16.359f, 9.102f, 16.0f, 9.041f)
                verticalLineTo(6.0f)
                curveTo(16.0f, 4.895f, 15.105f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 4.0f, 4.0f, 4.895f, 4.0f, 6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 10.0f, 8.0f, 10.223f, 8.0f, 10.499f)
                curveTo(8.031f, 11.676f, 8.838f, 12.5f, 10.0f, 12.5f)
                curveTo(11.163f, 12.5f, 11.968f, 11.676f, 12.0f, 10.499f)
                curveTo(12.001f, 10.224f, 12.224f, 10.0f, 12.5f, 10.0f)
                horizontalLineTo(13.264f)
                curveTo(12.789f, 10.531f, 12.5f, 11.232f, 12.5f, 12.0f)
                curveTo(12.5f, 12.773f, 12.793f, 13.478f, 13.273f, 14.01f)
                curveTo(11.999f, 14.125f, 11.0f, 15.196f, 11.0f, 16.5f)
                curveTo(11.0f, 16.651f, 11.033f, 16.821f, 11.087f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 17.0f, 3.0f, 15.657f, 3.0f, 14.0f)
                verticalLineTo(6.0f)
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
        return _mailInboxPerson!!
    }

@Suppress("ObjectPropertyName")
private var _mailInboxPerson: ImageVector? = null

@Preview
@Composable
private fun MailInboxPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailInboxPerson, contentDescription = "MailInboxPerson Icon")
    }
}

