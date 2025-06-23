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

public val FluentIcons.Filled.List: ImageVector
    get() {
        if (_List != null) {
            return _List!!
        }
        _List = ImageVector.Builder(
            name = "Filled.List",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 17f)
                horizontalLineTo(15f)
                curveTo(15.552f, 17f, 16f, 17.448f, 16f, 18f)
                curveTo(16f, 18.513f, 15.614f, 18.935f, 15.117f, 18.993f)
                lineTo(15f, 19f)
                horizontalLineTo(3f)
                curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
                curveTo(2f, 17.487f, 2.386f, 17.065f, 2.883f, 17.007f)
                lineTo(3f, 17f)
                horizontalLineTo(15f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 11f)
                horizontalLineTo(21f)
                curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
                curveTo(22f, 12.513f, 21.614f, 12.936f, 21.117f, 12.993f)
                lineTo(21f, 13f)
                horizontalLineTo(3f)
                curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
                curveTo(2f, 11.487f, 2.386f, 11.064f, 2.883f, 11.007f)
                lineTo(3f, 11f)
                horizontalLineTo(21f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 5f)
                horizontalLineTo(18f)
                curveTo(18.552f, 5f, 19f, 5.448f, 19f, 6f)
                curveTo(19f, 6.513f, 18.614f, 6.936f, 18.117f, 6.993f)
                lineTo(18f, 7f)
                horizontalLineTo(3f)
                curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
                curveTo(2f, 5.487f, 2.386f, 5.064f, 2.883f, 5.007f)
                lineTo(3f, 5f)
                horizontalLineTo(18f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _List!!
    }

@Suppress("ObjectPropertyName")
private var _List: ImageVector? = null

@Preview
@Composable
private fun ListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.List, contentDescription = null)
    }
}
