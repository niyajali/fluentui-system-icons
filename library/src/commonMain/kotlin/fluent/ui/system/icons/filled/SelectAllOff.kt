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

public val FluentIcons.Filled.SelectAllOff: ImageVector
    get() {
        if (_SelectAllOff != null) {
            return _SelectAllOff!!
        }
        _SelectAllOff = ImageVector.Builder(
            name = "Filled.SelectAllOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(15.75f)
                curveTo(3f, 17.545f, 4.455f, 19f, 6.25f, 19f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 19f, 19f, 17.545f, 19f, 15.75f)
                verticalLineTo(6.25f)
                curveTo(19f, 4.455f, 17.545f, 3f, 15.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(9.241f, 21.5f)
                curveTo(8.09f, 21.5f, 7.078f, 20.902f, 6.5f, 19.999f)
                horizontalLineTo(9.216f)
                lineTo(9.241f, 19.999f)
                horizontalLineTo(16.246f)
                curveTo(18.319f, 19.999f, 19.999f, 18.319f, 19.999f, 16.246f)
                verticalLineTo(6.5f)
                curveTo(20.902f, 7.078f, 21.5f, 8.09f, 21.5f, 9.241f)
                verticalLineTo(16.246f)
                curveTo(21.5f, 19.148f, 19.148f, 21.5f, 16.246f, 21.5f)
                horizontalLineTo(9.241f)
                close()
            }
        }.build()

        return _SelectAllOff!!
    }

@Suppress("ObjectPropertyName")
private var _SelectAllOff: ImageVector? = null

@Preview
@Composable
private fun SelectAllOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SelectAllOff, contentDescription = null)
    }
}
