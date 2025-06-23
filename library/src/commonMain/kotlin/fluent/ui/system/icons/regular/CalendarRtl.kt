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

public val FluentIcons.Regular.CalendarRtl: ImageVector
    get() {
        if (_CalendarRtl != null) {
            return _CalendarRtl!!
        }
        _CalendarRtl = ImageVector.Builder(
            name = "Regular.CalendarRtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                close()
                moveTo(16.25f, 14.5f)
                curveTo(15.56f, 14.5f, 15f, 15.06f, 15f, 15.75f)
                curveTo(15f, 16.44f, 15.56f, 17f, 16.25f, 17f)
                curveTo(16.94f, 17f, 17.5f, 16.44f, 17.5f, 15.75f)
                curveTo(17.5f, 15.06f, 16.94f, 14.5f, 16.25f, 14.5f)
                close()
                moveTo(12f, 14.5f)
                curveTo(11.31f, 14.5f, 10.75f, 15.06f, 10.75f, 15.75f)
                curveTo(10.75f, 16.44f, 11.31f, 17f, 12f, 17f)
                curveTo(12.69f, 17f, 13.25f, 16.44f, 13.25f, 15.75f)
                curveTo(13.25f, 15.06f, 12.69f, 14.5f, 12f, 14.5f)
                close()
                moveTo(16.25f, 10.5f)
                curveTo(15.56f, 10.5f, 15f, 11.06f, 15f, 11.75f)
                curveTo(15f, 12.44f, 15.56f, 13f, 16.25f, 13f)
                curveTo(16.94f, 13f, 17.5f, 12.44f, 17.5f, 11.75f)
                curveTo(17.5f, 11.06f, 16.94f, 10.5f, 16.25f, 10.5f)
                close()
                moveTo(12f, 10.5f)
                curveTo(11.31f, 10.5f, 10.75f, 11.06f, 10.75f, 11.75f)
                curveTo(10.75f, 12.44f, 11.31f, 13f, 12f, 13f)
                curveTo(12.69f, 13f, 13.25f, 12.44f, 13.25f, 11.75f)
                curveTo(13.25f, 11.06f, 12.69f, 10.5f, 12f, 10.5f)
                close()
                moveTo(7.75f, 10.5f)
                curveTo(7.06f, 10.5f, 6.5f, 11.06f, 6.5f, 11.75f)
                curveTo(6.5f, 12.44f, 7.06f, 13f, 7.75f, 13f)
                curveTo(8.44f, 13f, 9f, 12.44f, 9f, 11.75f)
                curveTo(9f, 11.06f, 8.44f, 10.5f, 7.75f, 10.5f)
                close()
                moveTo(6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(7f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                close()
            }
        }.build()

        return _CalendarRtl!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarRtl: ImageVector? = null

@Preview
@Composable
private fun CalendarRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalendarRtl, contentDescription = null)
    }
}
