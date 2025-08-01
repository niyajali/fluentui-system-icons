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

public val FluentIcons.Filled.DesktopTower: ImageVector
    get() {
        if (_DesktopTower != null) {
            return _DesktopTower!!
        }
        _DesktopTower = ImageVector.Builder(
            name = "Filled.DesktopTower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 4.25f)
                curveTo(2f, 3.007f, 3.007f, 2f, 4.25f, 2f)
                horizontalLineTo(9.75f)
                curveTo(10.993f, 2f, 12f, 3.007f, 12f, 4.25f)
                verticalLineTo(6f)
                horizontalLineTo(9.25f)
                curveTo(7.455f, 6f, 6f, 7.455f, 6f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(6f, 17.545f, 7.455f, 19f, 9.25f, 19f)
                horizontalLineTo(10.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(10.25f)
                curveTo(9.283f, 19.5f, 8.5f, 20.284f, 8.5f, 21.25f)
                curveTo(8.5f, 21.518f, 8.56f, 21.773f, 8.668f, 22f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 22f, 2f, 20.993f, 2f, 19.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(9.25f, 7f)
                curveTo(8.007f, 7f, 7f, 8.007f, 7f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(7f, 16.993f, 8.007f, 18f, 9.25f, 18f)
                horizontalLineTo(11.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 20.5f, 9.5f, 20.836f, 9.5f, 21.25f)
                curveTo(9.5f, 21.664f, 9.836f, 22f, 10.25f, 22f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 22f, 19.5f, 21.664f, 19.5f, 21.25f)
                curveTo(19.5f, 20.836f, 19.164f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(18f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 18f, 22f, 16.993f, 22f, 15.75f)
                verticalLineTo(9.25f)
                curveTo(22f, 8.007f, 20.993f, 7f, 19.75f, 7f)
                horizontalLineTo(9.25f)
                close()
                moveTo(16f, 18f)
                verticalLineTo(20.5f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _DesktopTower!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopTower: ImageVector? = null

@Preview
@Composable
private fun DesktopTowerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DesktopTower, contentDescription = null)
    }
}
