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

public val FluentIcons.Light.ArrowClockwise: ImageVector
    get() {
        if (_ArrowClockwise != null) {
            return _ArrowClockwise!!
        }
        _ArrowClockwise = ImageVector.Builder(
            name = "Light.ArrowClockwise",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 16f)
                curveTo(4f, 9.373f, 9.373f, 4f, 16f, 4f)
                curveTo(20.015f, 4f, 23.569f, 5.972f, 25.748f, 9f)
                horizontalLineTo(20.5f)
                curveTo(20.224f, 9f, 20f, 9.224f, 20f, 9.5f)
                curveTo(20f, 9.776f, 20.224f, 10f, 20.5f, 10f)
                horizontalLineTo(26.5f)
                curveTo(26.776f, 10f, 27f, 9.776f, 27f, 9.5f)
                verticalLineTo(3.5f)
                curveTo(27f, 3.224f, 26.776f, 3f, 26.5f, 3f)
                curveTo(26.224f, 3f, 26f, 3.224f, 26f, 3.5f)
                verticalLineTo(7.693f)
                curveTo(23.615f, 4.825f, 20.021f, 3f, 16f, 3f)
                curveTo(8.82f, 3f, 3f, 8.82f, 3f, 16f)
                curveTo(3f, 23.18f, 8.82f, 29f, 16f, 29f)
                curveTo(23.18f, 29f, 29f, 23.18f, 29f, 16f)
                curveTo(29f, 15.466f, 28.968f, 14.939f, 28.905f, 14.422f)
                curveTo(28.876f, 14.179f, 28.666f, 14f, 28.421f, 14f)
                curveTo(28.114f, 14f, 27.881f, 14.276f, 27.917f, 14.581f)
                curveTo(27.972f, 15.046f, 28f, 15.52f, 28f, 16f)
                curveTo(28f, 22.627f, 22.627f, 28f, 16f, 28f)
                curveTo(9.373f, 28f, 4f, 22.627f, 4f, 16f)
                close()
            }
        }.build()

        return _ArrowClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowClockwise: ImageVector? = null

@Preview
@Composable
private fun ArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.ArrowClockwise, contentDescription = null)
    }
}
