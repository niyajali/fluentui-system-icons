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

public val FluentIcons.Filled.PersonSubtract: ImageVector
    get() {
        if (_PersonSubtract != null) {
            return _PersonSubtract!!
        }
        _PersonSubtract = ImageVector.Builder(
            name = "Filled.PersonSubtract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 17.5f)
                curveTo(11f, 16.211f, 11.375f, 15.01f, 12.022f, 13.999f)
                horizontalLineTo(5.253f)
                curveTo(4.011f, 13.999f, 3.004f, 15.006f, 3.004f, 16.248f)
                verticalLineTo(17.168f)
                curveTo(3.004f, 17.74f, 3.182f, 18.298f, 3.514f, 18.764f)
                curveTo(5.056f, 20.928f, 7.579f, 22f, 11f, 22f)
                curveTo(11.6f, 22f, 12.172f, 21.967f, 12.717f, 21.901f)
                curveTo(11.651f, 20.744f, 11f, 19.198f, 11f, 17.5f)
                close()
                moveTo(11f, 2.004f)
                curveTo(13.762f, 2.004f, 16f, 4.242f, 16f, 7.004f)
                curveTo(16f, 9.765f, 13.762f, 12.004f, 11f, 12.004f)
                curveTo(8.239f, 12.004f, 6f, 9.765f, 6f, 7.004f)
                curveTo(6f, 4.242f, 8.239f, 2.004f, 11f, 2.004f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(14f, 17.5f)
                curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
                horizontalLineTo(20.5f)
                curveTo(20.776f, 18f, 21f, 17.776f, 21f, 17.5f)
                curveTo(21f, 17.224f, 20.776f, 17f, 20.5f, 17f)
                horizontalLineTo(14.5f)
                curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
                close()
            }
        }.build()

        return _PersonSubtract!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSubtract: ImageVector? = null

@Preview
@Composable
private fun PersonSubtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonSubtract, contentDescription = null)
    }
}
