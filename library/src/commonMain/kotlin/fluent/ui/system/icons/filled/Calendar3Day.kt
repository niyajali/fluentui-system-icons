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

public val FluentIcons.Filled.Calendar3Day: ImageVector
    get() {
        if (_Calendar3Day != null) {
            return _Calendar3Day!!
        }
        _Calendar3Day = ImageVector.Builder(
            name = "Filled.Calendar3Day",
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
                moveTo(7.75f, 7f)
                curveTo(7.37f, 7f, 7.057f, 7.282f, 7.007f, 7.648f)
                lineTo(7f, 7.75f)
                verticalLineTo(16.25f)
                lineTo(7.007f, 16.352f)
                curveTo(7.057f, 16.718f, 7.37f, 17f, 7.75f, 17f)
                curveTo(8.13f, 17f, 8.443f, 16.718f, 8.493f, 16.352f)
                lineTo(8.5f, 16.25f)
                verticalLineTo(7.75f)
                lineTo(8.493f, 7.648f)
                curveTo(8.443f, 7.282f, 8.13f, 7f, 7.75f, 7f)
                close()
                moveTo(16.25f, 7f)
                curveTo(15.87f, 7f, 15.557f, 7.282f, 15.507f, 7.648f)
                lineTo(15.5f, 7.75f)
                verticalLineTo(16.25f)
                lineTo(15.507f, 16.352f)
                curveTo(15.557f, 16.718f, 15.87f, 17f, 16.25f, 17f)
                curveTo(16.63f, 17f, 16.944f, 16.718f, 16.993f, 16.352f)
                lineTo(17f, 16.25f)
                verticalLineTo(7.75f)
                lineTo(16.993f, 7.648f)
                curveTo(16.944f, 7.282f, 16.63f, 7f, 16.25f, 7f)
                close()
                moveTo(12f, 7f)
                curveTo(11.62f, 7f, 11.307f, 7.282f, 11.257f, 7.648f)
                lineTo(11.25f, 7.75f)
                verticalLineTo(16.25f)
                lineTo(11.257f, 16.352f)
                curveTo(11.307f, 16.718f, 11.62f, 17f, 12f, 17f)
                curveTo(12.38f, 17f, 12.693f, 16.718f, 12.743f, 16.352f)
                lineTo(12.75f, 16.25f)
                verticalLineTo(7.75f)
                lineTo(12.743f, 7.648f)
                curveTo(12.693f, 7.282f, 12.38f, 7f, 12f, 7f)
                close()
            }
        }.build()

        return _Calendar3Day!!
    }

@Suppress("ObjectPropertyName")
private var _Calendar3Day: ImageVector? = null

@Preview
@Composable
private fun Calendar3DayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Calendar3Day, contentDescription = null)
    }
}
