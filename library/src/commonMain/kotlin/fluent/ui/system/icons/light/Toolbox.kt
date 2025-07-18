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

public val FluentIcons.Light.Toolbox: ImageVector
    get() {
        if (_Toolbox != null) {
            return _Toolbox!!
        }
        _Toolbox = ImageVector.Builder(
            name = "Light.Toolbox",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.25f, 3f)
                curveTo(10.455f, 3f, 9f, 4.455f, 9f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 8f, 2f, 9.231f, 2f, 10.75f)
                verticalLineTo(25.25f)
                curveTo(2f, 26.769f, 3.231f, 28f, 4.75f, 28f)
                horizontalLineTo(27.25f)
                curveTo(28.769f, 28f, 30f, 26.769f, 30f, 25.25f)
                verticalLineTo(10.75f)
                curveTo(30f, 9.231f, 28.769f, 8f, 27.25f, 8f)
                horizontalLineTo(23f)
                verticalLineTo(6.25f)
                curveTo(23f, 4.455f, 21.545f, 3f, 19.75f, 3f)
                horizontalLineTo(12.25f)
                close()
                moveTo(4.75f, 9f)
                horizontalLineTo(27.25f)
                curveTo(28.216f, 9f, 29f, 9.783f, 29f, 10.75f)
                verticalLineTo(16f)
                horizontalLineTo(23f)
                verticalLineTo(14.5f)
                curveTo(23f, 14.224f, 22.776f, 14f, 22.5f, 14f)
                curveTo(22.224f, 14f, 22f, 14.224f, 22f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(14.5f)
                curveTo(10f, 14.224f, 9.776f, 14f, 9.5f, 14f)
                curveTo(9.224f, 14f, 9f, 14.224f, 9f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(10.75f)
                curveTo(3f, 9.783f, 3.783f, 9f, 4.75f, 9f)
                close()
                moveTo(3f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(18.5f)
                curveTo(9f, 18.776f, 9.224f, 19f, 9.5f, 19f)
                curveTo(9.776f, 19f, 10f, 18.776f, 10f, 18.5f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(18.5f)
                curveTo(22f, 18.776f, 22.224f, 19f, 22.5f, 19f)
                curveTo(22.776f, 19f, 23f, 18.776f, 23f, 18.5f)
                verticalLineTo(17f)
                horizontalLineTo(29f)
                verticalLineTo(25.25f)
                curveTo(29f, 26.216f, 28.216f, 27f, 27.25f, 27f)
                horizontalLineTo(4.75f)
                curveTo(3.783f, 27f, 3f, 26.216f, 3f, 25.25f)
                verticalLineTo(17f)
                close()
                moveTo(10f, 8f)
                verticalLineTo(6.25f)
                curveTo(10f, 5.007f, 11.007f, 4f, 12.25f, 4f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Toolbox!!
    }

@Suppress("ObjectPropertyName")
private var _Toolbox: ImageVector? = null

@Preview
@Composable
private fun ToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Toolbox, contentDescription = null)
    }
}
