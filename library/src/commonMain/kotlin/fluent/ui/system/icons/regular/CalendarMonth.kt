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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.CalendarMonth: ImageVector
    get() {
        if (_CalendarMonth != null) {
            return _CalendarMonth!!
        }
        _CalendarMonth = ImageVector.Builder(
            name = "Regular.CalendarMonth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                close()
                moveTo(7.75f, 13.5f)
                curveTo(8.44f, 13.5f, 9f, 14.06f, 9f, 14.75f)
                curveTo(9f, 15.44f, 8.44f, 16f, 7.75f, 16f)
                curveTo(7.06f, 16f, 6.5f, 15.44f, 6.5f, 14.75f)
                curveTo(6.5f, 14.06f, 7.06f, 13.5f, 7.75f, 13.5f)
                close()
                moveTo(12f, 13.5f)
                curveTo(12.69f, 13.5f, 13.25f, 14.06f, 13.25f, 14.75f)
                curveTo(13.25f, 15.44f, 12.69f, 16f, 12f, 16f)
                curveTo(11.31f, 16f, 10.75f, 15.44f, 10.75f, 14.75f)
                curveTo(10.75f, 14.06f, 11.31f, 13.5f, 12f, 13.5f)
                close()
                moveTo(7.75f, 8.5f)
                curveTo(8.44f, 8.5f, 9f, 9.06f, 9f, 9.75f)
                curveTo(9f, 10.44f, 8.44f, 11f, 7.75f, 11f)
                curveTo(7.06f, 11f, 6.5f, 10.44f, 6.5f, 9.75f)
                curveTo(6.5f, 9.06f, 7.06f, 8.5f, 7.75f, 8.5f)
                close()
                moveTo(12f, 8.5f)
                curveTo(12.69f, 8.5f, 13.25f, 9.06f, 13.25f, 9.75f)
                curveTo(13.25f, 10.44f, 12.69f, 11f, 12f, 11f)
                curveTo(11.31f, 11f, 10.75f, 10.44f, 10.75f, 9.75f)
                curveTo(10.75f, 9.06f, 11.31f, 8.5f, 12f, 8.5f)
                close()
                moveTo(16.25f, 8.5f)
                curveTo(16.94f, 8.5f, 17.5f, 9.06f, 17.5f, 9.75f)
                curveTo(17.5f, 10.44f, 16.94f, 11f, 16.25f, 11f)
                curveTo(15.56f, 11f, 15f, 10.44f, 15f, 9.75f)
                curveTo(15f, 9.06f, 15.56f, 8.5f, 16.25f, 8.5f)
                close()
            }
        }.build()

        return _CalendarMonth!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarMonth: ImageVector? = null

@Preview
@Composable
private fun CalendarMonthPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalendarMonth, contentDescription = null)
    }
}
