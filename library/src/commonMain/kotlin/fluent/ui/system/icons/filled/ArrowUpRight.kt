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

public val FluentIcons.Filled.ArrowUpRight: ImageVector
    get() {
        if (_ArrowUpRight != null) {
            return _ArrowUpRight!!
        }
        _ArrowUpRight = ImageVector.Builder(
            name = "Filled.ArrowUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 3f)
                curveTo(10.448f, 3f, 10f, 3.448f, 10f, 4f)
                curveTo(10f, 4.552f, 10.448f, 5f, 11f, 5f)
                horizontalLineTo(17.586f)
                lineTo(3.293f, 19.293f)
                curveTo(2.902f, 19.683f, 2.902f, 20.316f, 3.293f, 20.707f)
                curveTo(3.683f, 21.097f, 4.317f, 21.097f, 4.707f, 20.707f)
                lineTo(19f, 6.414f)
                verticalLineTo(13f)
                curveTo(19f, 13.552f, 19.448f, 14f, 20f, 14f)
                curveTo(20.552f, 14f, 21f, 13.552f, 21f, 13f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _ArrowUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRight: ImageVector? = null

@Preview
@Composable
private fun ArrowUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowUpRight, contentDescription = null)
    }
}
