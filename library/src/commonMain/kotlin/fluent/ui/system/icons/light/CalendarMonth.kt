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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.CalendarMonth: ImageVector
    get() {
        if (_CalendarMonth != null) {
            return _CalendarMonth!!
        }
        _CalendarMonth = ImageVector.Builder(
            name = "Light.CalendarMonth",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.5f, 4f)
                curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
                horizontalLineTo(24.5f)
                curveTo(26.433f, 28f, 28f, 26.433f, 28f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
                horizontalLineTo(7.5f)
                close()
                moveTo(3f, 7.5f)
                curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(29f, 26.985f, 26.985f, 29f, 24.5f, 29f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(9.5f, 14f)
                curveTo(10.328f, 14f, 11f, 13.328f, 11f, 12.5f)
                curveTo(11f, 11.672f, 10.328f, 11f, 9.5f, 11f)
                curveTo(8.672f, 11f, 8f, 11.672f, 8f, 12.5f)
                curveTo(8f, 13.328f, 8.672f, 14f, 9.5f, 14f)
                close()
                moveTo(17.5f, 12.5f)
                curveTo(17.5f, 13.328f, 16.828f, 14f, 16f, 14f)
                curveTo(15.172f, 14f, 14.5f, 13.328f, 14.5f, 12.5f)
                curveTo(14.5f, 11.672f, 15.172f, 11f, 16f, 11f)
                curveTo(16.828f, 11f, 17.5f, 11.672f, 17.5f, 12.5f)
                close()
                moveTo(22.5f, 14f)
                curveTo(23.328f, 14f, 24f, 13.328f, 24f, 12.5f)
                curveTo(24f, 11.672f, 23.328f, 11f, 22.5f, 11f)
                curveTo(21.672f, 11f, 21f, 11.672f, 21f, 12.5f)
                curveTo(21f, 13.328f, 21.672f, 14f, 22.5f, 14f)
                close()
                moveTo(11f, 19.5f)
                curveTo(11f, 20.328f, 10.328f, 21f, 9.5f, 21f)
                curveTo(8.672f, 21f, 8f, 20.328f, 8f, 19.5f)
                curveTo(8f, 18.672f, 8.672f, 18f, 9.5f, 18f)
                curveTo(10.328f, 18f, 11f, 18.672f, 11f, 19.5f)
                close()
                moveTo(16f, 21f)
                curveTo(16.828f, 21f, 17.5f, 20.328f, 17.5f, 19.5f)
                curveTo(17.5f, 18.672f, 16.828f, 18f, 16f, 18f)
                curveTo(15.172f, 18f, 14.5f, 18.672f, 14.5f, 19.5f)
                curveTo(14.5f, 20.328f, 15.172f, 21f, 16f, 21f)
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
        Image(imageVector = FluentIcons.Light.CalendarMonth, contentDescription = null)
    }
}
