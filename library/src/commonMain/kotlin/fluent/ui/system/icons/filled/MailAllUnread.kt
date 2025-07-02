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
 * MailAllUnread icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: mail, all, unread
 * - Source: ic_fluent_mail_all_unread_20_filled.svg
 * 
 * @return The [ImageVector] for the MailAllUnread icon.
 */
public val FluentIcons.Filled.MailAllUnread: ImageVector
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
                curveTo(3.213f, 3.0f, 2.153f, 3.973f, 2.015f, 5.223f)
                lineTo(9.0f, 8.92f)
                lineTo(12.264f, 7.193f)
                curveTo(11.492f, 6.55f, 11.0f, 5.583f, 11.0f, 4.5f)
                curveTo(11.0f, 3.963f, 11.121f, 3.455f, 11.337f, 3.0f)
                close()
                moveTo(13.309f, 7.792f)
                lineTo(9.254f, 9.931f)
                curveTo(9.097f, 10.023f, 8.903f, 10.023f, 8.747f, 9.931f)
                lineTo(2.0f, 6.373f)
                verticalLineTo(12.5f)
                curveTo(2.0f, 13.881f, 3.119f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 15.0f, 16.0f, 13.881f, 16.0f, 12.5f)
                verticalLineTo(7.663f)
                curveTo(15.545f, 7.879f, 15.037f, 8.0f, 14.5f, 8.0f)
                curveTo(14.082f, 8.0f, 13.681f, 7.927f, 13.309f, 7.792f)
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
        Image(imageVector = FluentIcons.Filled.MailAllUnread, contentDescription = null)
    }
}

