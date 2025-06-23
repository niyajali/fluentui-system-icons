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

public val FluentIcons.Filled.TabDesktopMultiple: ImageVector
    get() {
        if (_TabDesktopMultiple != null) {
            return _TabDesktopMultiple!!
        }
        _TabDesktopMultiple = ImageVector.Builder(
            name = "Filled.TabDesktopMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.001f, 6.009f)
                curveTo(20.68f, 6.136f, 22.002f, 7.539f, 22.002f, 9.25f)
                verticalLineTo(17.25f)
                curveTo(22.002f, 19.873f, 19.876f, 22f, 17.252f, 22f)
                horizontalLineTo(9.252f)
                curveTo(7.541f, 22f, 6.139f, 20.678f, 6.012f, 19f)
                horizontalLineTo(14.751f)
                curveTo(17.098f, 19f, 19.001f, 17.097f, 19.001f, 14.75f)
                verticalLineTo(6.009f)
                close()
                moveTo(5.25f, 2f)
                curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
                verticalLineTo(14.75f)
                curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
                horizontalLineTo(14.75f)
                curveTo(16.545f, 18f, 18f, 16.545f, 18f, 14.75f)
                verticalLineTo(7.5f)
                horizontalLineTo(10.75f)
                curveTo(9.507f, 7.5f, 8.5f, 6.493f, 8.5f, 5.25f)
                verticalLineTo(2f)
                horizontalLineTo(5.25f)
                close()
                moveTo(10.75f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(5.25f)
                curveTo(18f, 3.455f, 16.545f, 2f, 14.75f, 2f)
                horizontalLineTo(10f)
                verticalLineTo(5.25f)
                curveTo(10f, 5.664f, 10.336f, 6f, 10.75f, 6f)
                close()
            }
        }.build()

        return _TabDesktopMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _TabDesktopMultiple: ImageVector? = null

@Preview
@Composable
private fun TabDesktopMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TabDesktopMultiple, contentDescription = null)
    }
}
