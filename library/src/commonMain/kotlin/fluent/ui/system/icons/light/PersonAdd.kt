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

public val FluentIcons.Light.PersonAdd: ImageVector
    get() {
        if (_PersonAdd != null) {
            return _PersonAdd!!
        }
        _PersonAdd = ImageVector.Builder(
            name = "Light.PersonAdd",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 9f)
                curveTo(9f, 5.134f, 12.134f, 2f, 16f, 2f)
                curveTo(19.866f, 2f, 23f, 5.134f, 23f, 9f)
                curveTo(23f, 12.866f, 19.866f, 16f, 16f, 16f)
                curveTo(12.134f, 16f, 9f, 12.866f, 9f, 9f)
                close()
                moveTo(16f, 3f)
                curveTo(12.686f, 3f, 10f, 5.686f, 10f, 9f)
                curveTo(10f, 12.314f, 12.686f, 15f, 16f, 15f)
                curveTo(19.314f, 15f, 22f, 12.314f, 22f, 9f)
                curveTo(22f, 5.686f, 19.314f, 3f, 16f, 3f)
                close()
                moveTo(16.375f, 18f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 18f, 4f, 19.567f, 4f, 21.5f)
                verticalLineTo(22.167f)
                curveTo(4f, 24.316f, 6.766f, 30f, 16f, 30f)
                curveTo(16.426f, 30f, 16.839f, 29.988f, 17.238f, 29.965f)
                curveTo(16.927f, 29.663f, 16.638f, 29.34f, 16.373f, 28.997f)
                curveTo(16.25f, 28.999f, 16.126f, 29f, 16f, 29f)
                curveTo(7.234f, 29f, 5f, 23.684f, 5f, 22.167f)
                verticalLineTo(21.5f)
                curveTo(5f, 20.119f, 6.119f, 19f, 7.5f, 19f)
                horizontalLineTo(15.704f)
                curveTo(15.906f, 18.651f, 16.13f, 18.317f, 16.375f, 18f)
                close()
                moveTo(23.5f, 31f)
                curveTo(19.358f, 31f, 16f, 27.642f, 16f, 23.5f)
                curveTo(16f, 19.358f, 19.358f, 16f, 23.5f, 16f)
                curveTo(27.642f, 16f, 31f, 19.358f, 31f, 23.5f)
                curveTo(31f, 27.642f, 27.642f, 31f, 23.5f, 31f)
                close()
                moveTo(24.5f, 18.75f)
                curveTo(24.5f, 18.336f, 24.164f, 18f, 23.75f, 18f)
                curveTo(23.336f, 18f, 23f, 18.336f, 23f, 18.75f)
                verticalLineTo(22.5f)
                horizontalLineTo(19.25f)
                curveTo(18.836f, 22.5f, 18.5f, 22.836f, 18.5f, 23.25f)
                curveTo(18.5f, 23.664f, 18.836f, 24f, 19.25f, 24f)
                horizontalLineTo(23f)
                verticalLineTo(27.75f)
                curveTo(23f, 28.164f, 23.336f, 28.5f, 23.75f, 28.5f)
                curveTo(24.164f, 28.5f, 24.5f, 28.164f, 24.5f, 27.75f)
                verticalLineTo(24f)
                horizontalLineTo(28.25f)
                curveTo(28.664f, 24f, 29f, 23.664f, 29f, 23.25f)
                curveTo(29f, 22.836f, 28.664f, 22.5f, 28.25f, 22.5f)
                horizontalLineTo(24.5f)
                verticalLineTo(18.75f)
                close()
            }
        }.build()

        return _PersonAdd!!
    }

@Suppress("ObjectPropertyName")
private var _PersonAdd: ImageVector? = null

@Preview
@Composable
private fun PersonAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.PersonAdd, contentDescription = null)
    }
}
