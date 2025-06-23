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

public val FluentIcons.Light.TableMoveBelow: ImageVector
    get() {
        if (_TableMoveBelow != null) {
            return _TableMoveBelow!!
        }
        _TableMoveBelow = ImageVector.Builder(
            name = "Light.TableMoveBelow",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.5f, 29f)
                curveTo(3.224f, 29f, 3f, 28.776f, 3f, 28.5f)
                curveTo(3f, 28.224f, 3.224f, 28f, 3.5f, 28f)
                horizontalLineTo(28.5f)
                curveTo(28.776f, 28f, 29f, 28.224f, 29f, 28.5f)
                curveTo(29f, 28.776f, 28.776f, 29f, 28.5f, 29f)
                horizontalLineTo(3.5f)
                close()
                moveTo(15.646f, 25.854f)
                curveTo(15.842f, 26.049f, 16.158f, 26.049f, 16.354f, 25.854f)
                lineTo(19.354f, 22.854f)
                curveTo(19.549f, 22.658f, 19.549f, 22.342f, 19.354f, 22.146f)
                curveTo(19.158f, 21.951f, 18.842f, 21.951f, 18.646f, 22.146f)
                lineTo(16.5f, 24.293f)
                verticalLineTo(17.5f)
                curveTo(16.5f, 17.224f, 16.276f, 17f, 16f, 17f)
                curveTo(15.724f, 17f, 15.5f, 17.224f, 15.5f, 17.5f)
                verticalLineTo(24.293f)
                lineTo(13.354f, 22.146f)
                curveTo(13.158f, 21.951f, 12.842f, 21.951f, 12.646f, 22.146f)
                curveTo(12.451f, 22.342f, 12.451f, 22.658f, 12.646f, 22.854f)
                lineTo(15.646f, 25.854f)
                close()
                moveTo(3.5f, 21f)
                curveTo(3.224f, 21f, 3f, 20.776f, 3f, 20.5f)
                verticalLineTo(7.5f)
                curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
                verticalLineTo(20.5f)
                curveTo(29f, 20.776f, 28.776f, 21f, 28.5f, 21f)
                horizontalLineTo(20.5f)
                curveTo(20.224f, 21f, 20f, 20.776f, 20f, 20.5f)
                verticalLineTo(12f)
                lineTo(12f, 12f)
                verticalLineTo(20.5f)
                curveTo(12f, 20.776f, 11.776f, 21f, 11.5f, 21f)
                horizontalLineTo(3.5f)
                close()
                moveTo(11f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                close()
                moveTo(4f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
                verticalLineTo(11f)
                close()
                moveTo(21f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(28f)
                verticalLineTo(7.5f)
                curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
                horizontalLineTo(21f)
                close()
                moveTo(28f, 12f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                horizontalLineTo(28f)
                verticalLineTo(12f)
                close()
                moveTo(12f, 4f)
                verticalLineTo(11f)
                lineTo(20f, 11f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _TableMoveBelow!!
    }

@Suppress("ObjectPropertyName")
private var _TableMoveBelow: ImageVector? = null

@Preview
@Composable
private fun TableMoveBelowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.TableMoveBelow, contentDescription = null)
    }
}
