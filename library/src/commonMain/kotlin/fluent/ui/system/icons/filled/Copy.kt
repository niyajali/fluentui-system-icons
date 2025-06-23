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

public val FluentIcons.Filled.Copy: ImageVector
    get() {
        if (_Copy != null) {
            return _Copy!!
        }
        _Copy = ImageVector.Builder(
            name = "Filled.Copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.503f, 4.627f)
                lineTo(5.5f, 6.75f)
                verticalLineTo(17.254f)
                curveTo(5.5f, 19.049f, 6.955f, 20.504f, 8.75f, 20.504f)
                lineTo(17.366f, 20.504f)
                curveTo(17.057f, 21.378f, 16.224f, 22.004f, 15.244f, 22.004f)
                horizontalLineTo(8.75f)
                curveTo(6.127f, 22.004f, 4f, 19.878f, 4f, 17.254f)
                verticalLineTo(6.75f)
                curveTo(4f, 5.769f, 4.627f, 4.935f, 5.503f, 4.627f)
                close()
                moveTo(17.75f, 2f)
                curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
                verticalLineTo(17.25f)
                curveTo(20f, 18.493f, 18.993f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(8.75f)
                curveTo(7.507f, 19.5f, 6.5f, 18.493f, 6.5f, 17.25f)
                verticalLineTo(4.25f)
                curveTo(6.5f, 3.007f, 7.507f, 2f, 8.75f, 2f)
                horizontalLineTo(17.75f)
                close()
            }
        }.build()

        return _Copy!!
    }

@Suppress("ObjectPropertyName")
private var _Copy: ImageVector? = null

@Preview
@Composable
private fun CopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Copy, contentDescription = null)
    }
}
