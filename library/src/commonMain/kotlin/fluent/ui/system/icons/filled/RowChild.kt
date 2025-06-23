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

public val FluentIcons.Filled.RowChild: ImageVector
    get() {
        if (_RowChild != null) {
            return _RowChild!!
        }
        _RowChild = ImageVector.Builder(
            name = "Filled.RowChild",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 3f)
                curveTo(4.007f, 3f, 3f, 4.007f, 3f, 5.25f)
                verticalLineTo(8.25f)
                curveTo(3f, 9.493f, 4.007f, 10.5f, 5.25f, 10.5f)
                horizontalLineTo(6f)
                verticalLineTo(14.75f)
                curveTo(6f, 16.545f, 7.455f, 18f, 9.25f, 18f)
                horizontalLineTo(12f)
                verticalLineTo(18.75f)
                curveTo(12f, 19.993f, 13.007f, 21f, 14.25f, 21f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 21f, 21f, 19.993f, 21f, 18.75f)
                verticalLineTo(15.75f)
                curveTo(21f, 14.507f, 19.993f, 13.5f, 18.75f, 13.5f)
                horizontalLineTo(14.25f)
                curveTo(13.007f, 13.5f, 12f, 14.507f, 12f, 15.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(9.25f)
                curveTo(8.283f, 16.5f, 7.5f, 15.717f, 7.5f, 14.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 10.5f, 21f, 9.493f, 21f, 8.25f)
                verticalLineTo(5.25f)
                curveTo(21f, 4.007f, 19.993f, 3f, 18.75f, 3f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()

        return _RowChild!!
    }

@Suppress("ObjectPropertyName")
private var _RowChild: ImageVector? = null

@Preview
@Composable
private fun RowChildPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.RowChild, contentDescription = null)
    }
}
