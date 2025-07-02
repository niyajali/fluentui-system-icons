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
 * Mailbox icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: mailbox
 * - Source: ic_fluent_mailbox_20_filled.svg
 * 
 * @return The [ImageVector] for the Mailbox icon.
 */
public val FluentIcons.Filled.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = Builder(name = "Mailbox", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 2.5f)
                curveTo(3.0f, 2.224f, 3.224f, 2.0f, 3.5f, 2.0f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 2.0f, 8.0f, 2.224f, 8.0f, 2.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.671f)
                curveTo(10.652f, 8.825f, 10.0f, 10.086f, 10.0f, 11.5f)
                verticalLineTo(17.0f)
                curveTo(10.0f, 17.364f, 10.097f, 17.706f, 10.268f, 18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 18.0f, 2.0f, 17.552f, 2.0f, 17.0f)
                verticalLineTo(11.5f)
                curveTo(2.0f, 9.567f, 3.567f, 8.0f, 5.5f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.5f)
                curveTo(6.0f, 11.776f, 6.224f, 12.0f, 6.5f, 12.0f)
                curveTo(6.776f, 12.0f, 7.0f, 11.776f, 7.0f, 11.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 5.0f, 3.0f, 4.776f, 3.0f, 4.5f)
                verticalLineTo(2.5f)
                close()
                moveTo(14.5f, 8.0f)
                curveTo(12.567f, 8.0f, 11.0f, 9.567f, 11.0f, 11.5f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 17.552f, 11.448f, 18.0f, 12.0f, 18.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 18.0f, 18.0f, 17.552f, 18.0f, 17.0f)
                verticalLineTo(11.5f)
                curveTo(18.0f, 9.567f, 16.433f, 8.0f, 14.5f, 8.0f)
                close()
                moveTo(13.25f, 11.5f)
                curveTo(13.25f, 11.224f, 13.474f, 11.0f, 13.75f, 11.0f)
                horizontalLineTo(15.25f)
                curveTo(15.526f, 11.0f, 15.75f, 11.224f, 15.75f, 11.5f)
                curveTo(15.75f, 11.776f, 15.526f, 12.0f, 15.25f, 12.0f)
                horizontalLineTo(13.75f)
                curveTo(13.474f, 12.0f, 13.25f, 11.776f, 13.25f, 11.5f)
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
        Image(imageVector = FluentIcons.Filled.Mailbox, contentDescription = null)
    }
}

