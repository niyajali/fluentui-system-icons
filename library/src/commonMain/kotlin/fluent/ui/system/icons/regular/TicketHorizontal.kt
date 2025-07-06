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
 * TicketHorizontal Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general event scenarios. Contains horizontal & diagonal variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_ticket_horizontal_24_regular.svg)
 * 
 * @return The [ImageVector] for the TicketHorizontal icon.
 */
public val FluentIcons.Regular.TicketHorizontal: ImageVector
    get() {
        if (_ticketHorizontal != null) {
            return _ticketHorizontal!!
        }
        _ticketHorizontal = Builder(name = "TicketHorizontal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.25f, 5.0f)
                curveTo(21.216f, 5.0f, 22.0f, 5.784f, 22.0f, 6.75f)
                verticalLineTo(9.01f)
                curveTo(22.0f, 9.401f, 21.701f, 9.726f, 21.312f, 9.758f)
                curveTo(20.151f, 9.853f, 19.25f, 10.827f, 19.25f, 12.0f)
                curveTo(19.25f, 13.173f, 20.151f, 14.147f, 21.312f, 14.242f)
                curveTo(21.701f, 14.274f, 22.0f, 14.599f, 22.0f, 14.99f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.216f, 21.216f, 19.0f, 20.25f, 19.0f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 19.0f, 2.0f, 18.216f, 2.0f, 17.25f)
                lineTo(2.0f, 14.99f)
                curveTo(2.0f, 14.599f, 2.3f, 14.274f, 2.689f, 14.242f)
                curveTo(3.849f, 14.146f, 4.75f, 13.173f, 4.75f, 12.0f)
                curveTo(4.75f, 10.827f, 3.849f, 9.854f, 2.689f, 9.758f)
                curveTo(2.3f, 9.726f, 2.0f, 9.401f, 2.0f, 9.01f)
                lineTo(2.0f, 6.75f)
                curveTo(2.0f, 5.784f, 2.783f, 5.0f, 3.75f, 5.0f)
                horizontalLineTo(20.25f)
                close()
                moveTo(20.5f, 8.385f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 6.612f, 20.388f, 6.5f, 20.25f, 6.5f)
                horizontalLineTo(3.75f)
                curveTo(3.612f, 6.5f, 3.5f, 6.612f, 3.5f, 6.75f)
                lineTo(3.5f, 8.385f)
                curveTo(5.093f, 8.824f, 6.25f, 10.284f, 6.25f, 12.0f)
                curveTo(6.25f, 13.716f, 5.093f, 15.176f, 3.5f, 15.615f)
                lineTo(3.5f, 17.25f)
                curveTo(3.5f, 17.388f, 3.612f, 17.5f, 3.75f, 17.5f)
                horizontalLineTo(20.25f)
                curveTo(20.388f, 17.5f, 20.5f, 17.388f, 20.5f, 17.25f)
                verticalLineTo(15.615f)
                curveTo(18.907f, 15.176f, 17.75f, 13.716f, 17.75f, 12.0f)
                curveTo(17.75f, 10.352f, 18.816f, 8.941f, 20.311f, 8.442f)
                lineTo(20.5f, 8.385f)
                close()
            }
        }
        .build()
        return _ticketHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ticketHorizontal: ImageVector? = null

@Preview
@Composable
private fun TicketHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TicketHorizontal, contentDescription = "TicketHorizontal Icon")
    }
}

