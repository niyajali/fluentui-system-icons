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

public val FluentIcons.Filled.CellularData1: ImageVector
    get() {
        if (_CellularData1 != null) {
            return _CellularData1!!
        }
        _CellularData1 = ImageVector.Builder(
            name = "Filled.CellularData1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20f, 5f)
                curveTo(20.552f, 5f, 21f, 5.447f, 21f, 5.999f)
                verticalLineTo(19.001f)
                curveTo(21f, 19.553f, 20.552f, 20f, 20f, 20f)
                curveTo(19.448f, 20f, 19f, 19.553f, 19f, 19.001f)
                verticalLineTo(5.999f)
                curveTo(19f, 5.447f, 19.448f, 5f, 20f, 5f)
                close()
                moveTo(16f, 8f)
                curveTo(16.552f, 8f, 17f, 8.446f, 17f, 8.995f)
                verticalLineTo(19.005f)
                curveTo(17f, 19.554f, 16.552f, 20f, 16f, 20f)
                curveTo(15.448f, 20f, 15f, 19.554f, 15f, 19.005f)
                verticalLineTo(8.995f)
                curveTo(15f, 8.446f, 15.448f, 8f, 16f, 8f)
                close()
                moveTo(12f, 11f)
                curveTo(12.552f, 11f, 13f, 11.448f, 13f, 12f)
                verticalLineTo(19f)
                curveTo(13f, 19.552f, 12.552f, 20f, 12f, 20f)
                curveTo(11.448f, 20f, 11f, 19.552f, 11f, 19f)
                verticalLineTo(12f)
                curveTo(11f, 11.448f, 11.448f, 11f, 12f, 11f)
                close()
                moveTo(8f, 14f)
                curveTo(8.552f, 14f, 9f, 14.445f, 9f, 14.994f)
                verticalLineTo(19.006f)
                curveTo(9f, 19.555f, 8.552f, 20f, 8f, 20f)
                curveTo(7.448f, 20f, 7f, 19.555f, 7f, 19.006f)
                verticalLineTo(14.994f)
                curveTo(7f, 14.445f, 7.448f, 14f, 8f, 14f)
                close()
                moveTo(4f, 17f)
                curveTo(4.552f, 17f, 5f, 17.44f, 5f, 17.984f)
                verticalLineTo(19.016f)
                curveTo(5f, 19.56f, 4.552f, 20f, 4f, 20f)
                curveTo(3.448f, 20f, 3f, 19.56f, 3f, 19.016f)
                verticalLineTo(17.984f)
                curveTo(3f, 17.44f, 3.448f, 17f, 4f, 17f)
                close()
            }
        }.build()

        return _CellularData1!!
    }

@Suppress("ObjectPropertyName")
private var _CellularData1: ImageVector? = null

@Preview
@Composable
private fun CellularData1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CellularData1, contentDescription = null)
    }
}
