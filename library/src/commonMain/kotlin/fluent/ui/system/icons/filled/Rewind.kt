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

public val FluentIcons.Filled.Rewind: ImageVector
    get() {
        if (_Rewind != null) {
            return _Rewind!!
        }
        _Rewind = ImageVector.Builder(
            name = "Filled.Rewind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.03f, 4.362f)
                curveTo(11.003f, 3.533f, 12.502f, 4.225f, 12.502f, 5.504f)
                verticalLineTo(9.493f)
                lineTo(18.529f, 4.363f)
                curveTo(19.503f, 3.534f, 21.002f, 4.226f, 21.002f, 5.506f)
                verticalLineTo(18.498f)
                curveTo(21.002f, 19.377f, 20.295f, 19.979f, 19.537f, 20.001f)
                horizontalLineTo(19.45f)
                curveTo(19.132f, 19.991f, 18.809f, 19.879f, 18.529f, 19.641f)
                lineTo(12.502f, 14.511f)
                verticalLineTo(18.497f)
                curveTo(12.502f, 19.776f, 11.004f, 20.468f, 10.03f, 19.639f)
                lineTo(2.62f, 13.333f)
                curveTo(1.799f, 12.634f, 1.799f, 11.367f, 2.62f, 10.668f)
                lineTo(10.03f, 4.362f)
                close()
                moveTo(2.62f, 10.668f)
                lineTo(3.106f, 11.239f)
                close()
            }
        }.build()

        return _Rewind!!
    }

@Suppress("ObjectPropertyName")
private var _Rewind: ImageVector? = null

@Preview
@Composable
private fun RewindPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Rewind, contentDescription = null)
    }
}
