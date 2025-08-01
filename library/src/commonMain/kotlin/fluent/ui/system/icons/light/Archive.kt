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

public val FluentIcons.Light.Archive: ImageVector
    get() {
        if (_Archive != null) {
            return _Archive!!
        }
        _Archive = ImageVector.Builder(
            name = "Light.Archive",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 14.5f)
                curveTo(12f, 14.224f, 12.224f, 14f, 12.5f, 14f)
                horizontalLineTo(19.5f)
                curveTo(19.776f, 14f, 20f, 14.224f, 20f, 14.5f)
                curveTo(20f, 14.776f, 19.776f, 15f, 19.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 15f, 12f, 14.776f, 12f, 14.5f)
                close()
                moveTo(28f, 10.236f)
                verticalLineTo(23.5f)
                curveTo(28f, 26.538f, 25.538f, 29f, 22.5f, 29f)
                horizontalLineTo(9.5f)
                curveTo(6.462f, 29f, 4f, 26.538f, 4f, 23.5f)
                verticalLineTo(10.236f)
                curveTo(3.386f, 9.687f, 3f, 8.889f, 3f, 8f)
                verticalLineTo(6f)
                curveTo(3f, 4.343f, 4.343f, 3f, 6f, 3f)
                horizontalLineTo(26f)
                curveTo(27.657f, 3f, 29f, 4.343f, 29f, 6f)
                verticalLineTo(8f)
                curveTo(29f, 8.889f, 28.614f, 9.687f, 28f, 10.236f)
                close()
                moveTo(6f, 4f)
                curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
                verticalLineTo(8f)
                curveTo(4f, 8.65f, 4.31f, 9.228f, 4.791f, 9.594f)
                curveTo(4.797f, 9.598f, 4.803f, 9.602f, 4.809f, 9.607f)
                curveTo(5.141f, 9.854f, 5.554f, 10f, 6f, 10f)
                horizontalLineTo(26f)
                curveTo(26.446f, 10f, 26.859f, 9.854f, 27.191f, 9.607f)
                curveTo(27.197f, 9.602f, 27.203f, 9.598f, 27.209f, 9.594f)
                curveTo(27.69f, 9.228f, 28f, 8.65f, 28f, 8f)
                verticalLineTo(6f)
                curveTo(28f, 4.895f, 27.105f, 4f, 26f, 4f)
                horizontalLineTo(6f)
                close()
                moveTo(27f, 10.829f)
                curveTo(26.687f, 10.94f, 26.351f, 11f, 26f, 11f)
                horizontalLineTo(6f)
                curveTo(5.649f, 11f, 5.313f, 10.94f, 5f, 10.829f)
                verticalLineTo(23.5f)
                curveTo(5f, 25.985f, 7.015f, 28f, 9.5f, 28f)
                horizontalLineTo(22.5f)
                curveTo(24.985f, 28f, 27f, 25.985f, 27f, 23.5f)
                verticalLineTo(10.829f)
                close()
            }
        }.build()

        return _Archive!!
    }

@Suppress("ObjectPropertyName")
private var _Archive: ImageVector? = null

@Preview
@Composable
private fun ArchivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Archive, contentDescription = null)
    }
}
