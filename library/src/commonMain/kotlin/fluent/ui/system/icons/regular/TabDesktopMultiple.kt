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

public val FluentIcons.Regular.TabDesktopMultiple: ImageVector
    get() {
        if (_TabDesktopMultiple != null) {
            return _TabDesktopMultiple!!
        }
        _TabDesktopMultiple = ImageVector.Builder(
            name = "Regular.TabDesktopMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.248f, 22f)
                curveTo(7.538f, 22f, 6.135f, 20.678f, 6.008f, 19f)
                horizontalLineTo(7.516f)
                curveTo(7.637f, 19.848f, 8.367f, 20.5f, 9.248f, 20.5f)
                horizontalLineTo(17.248f)
                curveTo(19.043f, 20.5f, 20.498f, 19.045f, 20.498f, 17.25f)
                verticalLineTo(9.25f)
                curveTo(20.498f, 8.368f, 19.846f, 7.639f, 18.998f, 7.518f)
                verticalLineTo(6.009f)
                curveTo(20.677f, 6.137f, 21.998f, 7.539f, 21.998f, 9.25f)
                verticalLineTo(17.25f)
                curveTo(21.998f, 19.873f, 19.872f, 22f, 17.248f, 22f)
                horizontalLineTo(9.248f)
                close()
                moveTo(2f, 5.25f)
                curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
                horizontalLineTo(14.75f)
                curveTo(16.545f, 2f, 18f, 3.455f, 18f, 5.25f)
                verticalLineTo(14.75f)
                curveTo(18f, 16.545f, 16.545f, 18f, 14.75f, 18f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(5.25f, 3.5f)
                curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
                verticalLineTo(14.75f)
                curveTo(3.5f, 15.717f, 4.284f, 16.5f, 5.25f, 16.5f)
                horizontalLineTo(14.75f)
                curveTo(15.717f, 16.5f, 16.5f, 15.717f, 16.5f, 14.75f)
                verticalLineTo(7.5f)
                horizontalLineTo(10.75f)
                curveTo(9.507f, 7.5f, 8.5f, 6.493f, 8.5f, 5.25f)
                verticalLineTo(3.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(10f, 3.5f)
                verticalLineTo(5.25f)
                curveTo(10f, 5.664f, 10.336f, 6f, 10.75f, 6f)
                horizontalLineTo(16.5f)
                verticalLineTo(5.25f)
                curveTo(16.5f, 4.284f, 15.717f, 3.5f, 14.75f, 3.5f)
                horizontalLineTo(10f)
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
        Image(imageVector = FluentIcons.Regular.TabDesktopMultiple, contentDescription = null)
    }
}
