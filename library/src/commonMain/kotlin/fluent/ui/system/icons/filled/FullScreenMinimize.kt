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

public val FluentIcons.Filled.FullScreenMinimize: ImageVector
    get() {
        if (_FullScreenMinimize != null) {
            return _FullScreenMinimize!!
        }
        _FullScreenMinimize = ImageVector.Builder(
            name = "Filled.FullScreenMinimize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 4f)
                curveTo(9f, 3.448f, 8.552f, 3f, 8f, 3f)
                curveTo(7.448f, 3f, 7f, 3.448f, 7f, 4f)
                verticalLineTo(6.5f)
                curveTo(7f, 6.776f, 6.776f, 7f, 6.5f, 7f)
                horizontalLineTo(4f)
                curveTo(3.448f, 7f, 3f, 7.448f, 3f, 8f)
                curveTo(3f, 8.552f, 3.448f, 9f, 4f, 9f)
                horizontalLineTo(6.5f)
                curveTo(7.881f, 9f, 9f, 7.881f, 9f, 6.5f)
                verticalLineTo(4f)
                close()
                moveTo(9f, 20f)
                curveTo(9f, 20.552f, 8.552f, 21f, 8f, 21f)
                curveTo(7.448f, 21f, 7f, 20.552f, 7f, 20f)
                verticalLineTo(17.5f)
                curveTo(7f, 17.224f, 6.776f, 17f, 6.5f, 17f)
                horizontalLineTo(4f)
                curveTo(3.448f, 17f, 3f, 16.552f, 3f, 16f)
                curveTo(3f, 15.448f, 3.448f, 15f, 4f, 15f)
                horizontalLineTo(6.5f)
                curveTo(7.881f, 15f, 9f, 16.119f, 9f, 17.5f)
                verticalLineTo(20f)
                close()
                moveTo(16f, 3f)
                curveTo(15.448f, 3f, 15f, 3.448f, 15f, 4f)
                verticalLineTo(6.5f)
                curveTo(15f, 7.881f, 16.119f, 9f, 17.5f, 9f)
                horizontalLineTo(20f)
                curveTo(20.552f, 9f, 21f, 8.552f, 21f, 8f)
                curveTo(21f, 7.448f, 20.552f, 7f, 20f, 7f)
                horizontalLineTo(17.5f)
                curveTo(17.224f, 7f, 17f, 6.776f, 17f, 6.5f)
                verticalLineTo(4f)
                curveTo(17f, 3.448f, 16.552f, 3f, 16f, 3f)
                close()
                moveTo(15f, 20f)
                curveTo(15f, 20.552f, 15.448f, 21f, 16f, 21f)
                curveTo(16.552f, 21f, 17f, 20.552f, 17f, 20f)
                verticalLineTo(17.5f)
                curveTo(17f, 17.224f, 17.224f, 17f, 17.5f, 17f)
                horizontalLineTo(20f)
                curveTo(20.552f, 17f, 21f, 16.552f, 21f, 16f)
                curveTo(21f, 15.448f, 20.552f, 15f, 20f, 15f)
                horizontalLineTo(17.5f)
                curveTo(16.119f, 15f, 15f, 16.119f, 15f, 17.5f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _FullScreenMinimize!!
    }

@Suppress("ObjectPropertyName")
private var _FullScreenMinimize: ImageVector? = null

@Preview
@Composable
private fun FullScreenMinimizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FullScreenMinimize, contentDescription = null)
    }
}
