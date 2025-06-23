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

public val FluentIcons.Filled.DataBarVertical: ImageVector
    get() {
        if (_DataBarVertical != null) {
            return _DataBarVertical!!
        }
        _DataBarVertical = ImageVector.Builder(
            name = "Filled.DataBarVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.749f, 3f)
                curveTo(6.991f, 3f, 7.998f, 4.007f, 7.998f, 5.249f)
                verticalLineTo(18.751f)
                curveTo(7.998f, 19.993f, 6.991f, 21f, 5.749f, 21f)
                curveTo(4.507f, 21f, 3.5f, 19.993f, 3.5f, 18.751f)
                verticalLineTo(5.249f)
                curveTo(3.5f, 4.007f, 4.507f, 3f, 5.749f, 3f)
                close()
                moveTo(12.249f, 7f)
                curveTo(13.491f, 7f, 14.498f, 8.007f, 14.498f, 9.249f)
                verticalLineTo(18.751f)
                curveTo(14.498f, 19.993f, 13.491f, 21f, 12.249f, 21f)
                curveTo(11.007f, 21f, 10f, 19.993f, 10f, 18.751f)
                verticalLineTo(9.249f)
                curveTo(10f, 8.007f, 11.007f, 7f, 12.249f, 7f)
                close()
                moveTo(18.749f, 11f)
                curveTo(19.991f, 11f, 20.998f, 12.007f, 20.998f, 13.249f)
                verticalLineTo(18.751f)
                curveTo(20.998f, 19.993f, 19.991f, 21f, 18.749f, 21f)
                curveTo(17.507f, 21f, 16.5f, 19.993f, 16.5f, 18.751f)
                verticalLineTo(13.249f)
                curveTo(16.5f, 12.007f, 17.507f, 11f, 18.749f, 11f)
                close()
            }
        }.build()

        return _DataBarVertical!!
    }

@Suppress("ObjectPropertyName")
private var _DataBarVertical: ImageVector? = null

@Preview
@Composable
private fun DataBarVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DataBarVertical, contentDescription = null)
    }
}
