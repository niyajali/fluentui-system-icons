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

public val FluentIcons.Regular.CellularData3: ImageVector
    get() {
        if (_CellularData3 != null) {
            return _CellularData3!!
        }
        _CellularData3 = ImageVector.Builder(
            name = "Regular.CellularData3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 17f)
                curveTo(4.13f, 17f, 4.443f, 17.282f, 4.493f, 17.648f)
                lineTo(4.5f, 17.75f)
                verticalLineTo(19.25f)
                curveTo(4.5f, 19.664f, 4.164f, 20f, 3.75f, 20f)
                curveTo(3.37f, 20f, 3.057f, 19.718f, 3.007f, 19.352f)
                lineTo(3f, 19.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 17.336f, 3.336f, 17f, 3.75f, 17f)
                close()
                moveTo(11.75f, 11f)
                curveTo(12.13f, 11f, 12.443f, 11.282f, 12.493f, 11.648f)
                lineTo(12.5f, 11.75f)
                verticalLineTo(19.25f)
                curveTo(12.5f, 19.664f, 12.164f, 20f, 11.75f, 20f)
                curveTo(11.37f, 20f, 11.057f, 19.718f, 11.007f, 19.352f)
                lineTo(11f, 19.25f)
                verticalLineTo(11.75f)
                curveTo(11f, 11.336f, 11.336f, 11f, 11.75f, 11f)
                close()
                moveTo(7.75f, 14f)
                curveTo(8.13f, 14f, 8.443f, 14.282f, 8.493f, 14.648f)
                lineTo(8.5f, 14.75f)
                verticalLineTo(19.249f)
                curveTo(8.5f, 19.663f, 8.164f, 19.999f, 7.75f, 19.999f)
                curveTo(7.37f, 19.999f, 7.057f, 19.717f, 7.007f, 19.351f)
                lineTo(7f, 19.249f)
                verticalLineTo(14.75f)
                curveTo(7f, 14.336f, 7.336f, 14f, 7.75f, 14f)
                close()
            }
        }.build()

        return _CellularData3!!
    }

@Suppress("ObjectPropertyName")
private var _CellularData3: ImageVector? = null

@Preview
@Composable
private fun CellularData3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CellularData3, contentDescription = null)
    }
}
