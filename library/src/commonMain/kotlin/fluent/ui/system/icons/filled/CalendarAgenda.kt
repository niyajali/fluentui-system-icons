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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.CalendarAgenda: ImageVector
    get() {
        if (_CalendarAgenda != null) {
            return _CalendarAgenda!!
        }
        _CalendarAgenda = ImageVector.Builder(
            name = "Filled.CalendarAgenda",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(17f, 7.75f)
                curveTo(17f, 7.37f, 16.718f, 7.057f, 16.352f, 7.007f)
                lineTo(16.25f, 7f)
                horizontalLineTo(7.75f)
                lineTo(7.648f, 7.007f)
                curveTo(7.282f, 7.057f, 7f, 7.37f, 7f, 7.75f)
                curveTo(7f, 8.13f, 7.282f, 8.443f, 7.648f, 8.493f)
                lineTo(7.75f, 8.5f)
                horizontalLineTo(16.25f)
                lineTo(16.352f, 8.493f)
                curveTo(16.718f, 8.443f, 17f, 8.13f, 17f, 7.75f)
                close()
                moveTo(17f, 16.25f)
                curveTo(17f, 15.87f, 16.718f, 15.557f, 16.352f, 15.507f)
                lineTo(16.25f, 15.5f)
                horizontalLineTo(7.75f)
                lineTo(7.648f, 15.507f)
                curveTo(7.282f, 15.557f, 7f, 15.87f, 7f, 16.25f)
                curveTo(7f, 16.63f, 7.282f, 16.944f, 7.648f, 16.993f)
                lineTo(7.75f, 17f)
                horizontalLineTo(16.25f)
                lineTo(16.352f, 16.993f)
                curveTo(16.718f, 16.944f, 17f, 16.63f, 17f, 16.25f)
                close()
                moveTo(17f, 12f)
                curveTo(17f, 11.62f, 16.718f, 11.307f, 16.352f, 11.257f)
                lineTo(16.25f, 11.25f)
                horizontalLineTo(7.75f)
                lineTo(7.648f, 11.257f)
                curveTo(7.282f, 11.307f, 7f, 11.62f, 7f, 12f)
                curveTo(7f, 12.38f, 7.282f, 12.693f, 7.648f, 12.743f)
                lineTo(7.75f, 12.75f)
                horizontalLineTo(16.25f)
                lineTo(16.352f, 12.743f)
                curveTo(16.718f, 12.693f, 17f, 12.38f, 17f, 12f)
                close()
            }
        }.build()

        return _CalendarAgenda!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarAgenda: ImageVector? = null

@Preview
@Composable
private fun CalendarAgendaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalendarAgenda, contentDescription = null)
    }
}
