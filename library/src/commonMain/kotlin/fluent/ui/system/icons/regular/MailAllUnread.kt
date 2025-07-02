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
 * MailAllUnread icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: mail, all, unread
 * - Source: ic_fluent_mail_all_unread_20_regular.svg
 * 
 * @return The [ImageVector] for the MailAllUnread icon.
 */
public val FluentIcons.Regular.MailAllUnread: ImageVector
    get() {
        if (_mailAllUnread != null) {
            return _mailAllUnread!!
        }
        _mailAllUnread = Builder(name = "MailAllUnread", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 7.0f)
                curveTo(15.881f, 7.0f, 17.0f, 5.881f, 17.0f, 4.5f)
                curveTo(17.0f, 3.119f, 15.881f, 2.0f, 14.5f, 2.0f)
                curveTo(13.119f, 2.0f, 12.0f, 3.119f, 12.0f, 4.5f)
                curveTo(12.0f, 5.881f, 13.119f, 7.0f, 14.5f, 7.0f)
                close()
                moveTo(11.337f, 3.0f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 3.0f, 2.0f, 4.119f, 2.0f, 5.5f)
                verticalLineTo(12.5f)
                curveTo(2.0f, 13.881f, 3.119f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 15.0f, 16.0f, 13.881f, 16.0f, 12.5f)
                verticalLineTo(7.663f)
                curveTo(15.689f, 7.811f, 15.353f, 7.914f, 15.0f, 7.965f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 13.328f, 14.328f, 14.0f, 13.5f, 14.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 14.0f, 3.0f, 13.328f, 3.0f, 12.5f)
                verticalLineTo(6.963f)
                lineTo(8.746f, 9.931f)
                lineTo(8.828f, 9.969f)
                curveTo(8.967f, 10.021f, 9.123f, 10.008f, 9.254f, 9.931f)
                lineTo(13.358f, 7.81f)
                curveTo(12.965f, 7.674f, 12.603f, 7.47f, 12.287f, 7.211f)
                lineTo(9.0f, 8.92f)
                lineTo(3.0f, 5.802f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 4.672f, 3.672f, 4.0f, 4.5f, 4.0f)
                horizontalLineTo(11.035f)
                curveTo(11.086f, 3.647f, 11.189f, 3.311f, 11.337f, 3.0f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(5.682f, 17.0f, 4.956f, 16.607f, 4.5f, 16.0f)
                horizontalLineTo(13.5f)
                curveTo(15.433f, 16.0f, 17.0f, 14.433f, 17.0f, 12.5f)
                verticalLineTo(7.5f)
                curveTo(17.607f, 7.956f, 18.0f, 8.682f, 18.0f, 9.5f)
                verticalLineTo(12.5f)
                curveTo(18.0f, 14.985f, 15.985f, 17.0f, 13.5f, 17.0f)
                horizontalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _mailAllUnread!!
    }

@Suppress("ObjectPropertyName")
private var _mailAllUnread: ImageVector? = null

@Preview
@Composable
private fun MailAllUnreadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailAllUnread, contentDescription = null)
    }
}

