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
 * TicketDiagonal icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: ticket, diagonal
 * - Source: ic_fluent_ticket_diagonal_24_regular.svg
 * 
 * @return The [ImageVector] for the TicketDiagonal icon.
 */
public val FluentIcons.Regular.TicketDiagonal: ImageVector
    get() {
        if (_ticketDiagonal != null) {
            return _ticketDiagonal!!
        }
        _ticketDiagonal = Builder(name = "TicketDiagonal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.53f, 3.591f)
                curveTo(14.237f, 3.298f, 13.762f, 3.298f, 13.469f, 3.591f)
                lineTo(3.591f, 13.469f)
                curveTo(3.298f, 13.762f, 3.298f, 14.237f, 3.591f, 14.53f)
                lineTo(4.659f, 15.598f)
                curveTo(5.056f, 15.376f, 5.514f, 15.25f, 6.0f, 15.25f)
                curveTo(7.518f, 15.25f, 8.75f, 16.481f, 8.75f, 18.0f)
                curveTo(8.75f, 18.485f, 8.623f, 18.943f, 8.401f, 19.34f)
                lineTo(9.469f, 20.409f)
                curveTo(9.762f, 20.702f, 10.237f, 20.702f, 10.53f, 20.409f)
                lineTo(20.409f, 10.53f)
                curveTo(20.702f, 10.237f, 20.702f, 9.762f, 20.409f, 9.469f)
                lineTo(19.34f, 8.401f)
                curveTo(18.943f, 8.623f, 18.485f, 8.75f, 18.0f, 8.75f)
                curveTo(16.481f, 8.75f, 15.25f, 7.519f, 15.25f, 6.0f)
                curveTo(15.25f, 5.514f, 15.376f, 5.056f, 15.598f, 4.659f)
                lineTo(14.53f, 3.591f)
                close()
                moveTo(12.409f, 2.53f)
                curveTo(13.288f, 1.651f, 14.712f, 1.651f, 15.591f, 2.53f)
                lineTo(16.762f, 3.702f)
                curveTo(17.273f, 4.212f, 17.181f, 4.929f, 16.924f, 5.362f)
                curveTo(16.813f, 5.549f, 16.75f, 5.766f, 16.75f, 6.0f)
                curveTo(16.75f, 6.69f, 17.309f, 7.25f, 18.0f, 7.25f)
                curveTo(18.234f, 7.25f, 18.451f, 7.186f, 18.637f, 7.075f)
                curveTo(19.07f, 6.818f, 19.787f, 6.726f, 20.298f, 7.237f)
                lineTo(21.469f, 8.409f)
                curveTo(22.348f, 9.287f, 22.348f, 10.712f, 21.469f, 11.591f)
                lineTo(11.591f, 21.469f)
                curveTo(10.712f, 22.348f, 9.287f, 22.348f, 8.409f, 21.469f)
                lineTo(7.237f, 20.298f)
                curveTo(6.726f, 19.787f, 6.818f, 19.07f, 7.075f, 18.637f)
                curveTo(7.186f, 18.451f, 7.25f, 18.234f, 7.25f, 18.0f)
                curveTo(7.25f, 17.309f, 6.69f, 16.75f, 6.0f, 16.75f)
                curveTo(5.765f, 16.75f, 5.548f, 16.813f, 5.362f, 16.924f)
                curveTo(4.929f, 17.182f, 4.212f, 17.273f, 3.702f, 16.762f)
                lineTo(2.53f, 15.591f)
                curveTo(1.651f, 14.712f, 1.651f, 13.288f, 2.53f, 12.409f)
                lineTo(12.409f, 2.53f)
                close()
            }
        }
        .build()
        return _ticketDiagonal!!
    }

@Suppress("ObjectPropertyName")
private var _ticketDiagonal: ImageVector? = null

@Preview
@Composable
private fun TicketDiagonalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TicketDiagonal, contentDescription = null)
    }
}

