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

public val FluentIcons.Light.Clock: ImageVector
    get() {
        if (_Clock != null) {
            return _Clock!!
        }
        _Clock = ImageVector.Builder(
            name = "Light.Clock",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16f, 8.5f)
                curveTo(16f, 8.224f, 15.776f, 8f, 15.5f, 8f)
                curveTo(15.224f, 8f, 15f, 8.224f, 15f, 8.5f)
                verticalLineTo(16.5f)
                curveTo(15f, 16.776f, 15.224f, 17f, 15.5f, 17f)
                horizontalLineTo(20.5f)
                curveTo(20.776f, 17f, 21f, 16.776f, 21f, 16.5f)
                curveTo(21f, 16.224f, 20.776f, 16f, 20.5f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(8.5f)
                close()
                moveTo(30f, 16f)
                curveTo(30f, 23.732f, 23.732f, 30f, 16f, 30f)
                curveTo(8.268f, 30f, 2f, 23.732f, 2f, 16f)
                curveTo(2f, 8.268f, 8.268f, 2f, 16f, 2f)
                curveTo(23.732f, 2f, 30f, 8.268f, 30f, 16f)
                close()
                moveTo(29f, 16f)
                curveTo(29f, 8.82f, 23.18f, 3f, 16f, 3f)
                curveTo(8.82f, 3f, 3f, 8.82f, 3f, 16f)
                curveTo(3f, 23.18f, 8.82f, 29f, 16f, 29f)
                curveTo(23.18f, 29f, 29f, 23.18f, 29f, 16f)
                close()
            }
        }.build()

        return _Clock!!
    }

@Suppress("ObjectPropertyName")
private var _Clock: ImageVector? = null

@Preview
@Composable
private fun ClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Clock, contentDescription = null)
    }
}
