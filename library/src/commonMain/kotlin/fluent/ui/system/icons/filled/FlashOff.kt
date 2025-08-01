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

public val FluentIcons.Filled.FlashOff: ImageVector
    get() {
        if (_FlashOff != null) {
            return _FlashOff!!
        }
        _FlashOff = ImageVector.Builder(
            name = "Filled.FlashOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.436f, 15.497f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(5.939f, 7f)
                lineTo(4.103f, 12.153f)
                curveTo(3.698f, 13.29f, 4.538f, 14.486f, 5.745f, 14.49f)
                lineTo(7.313f, 14.496f)
                lineTo(6.044f, 20.164f)
                curveTo(5.713f, 21.642f, 7.531f, 22.624f, 8.585f, 21.536f)
                lineTo(14.436f, 15.497f)
                close()
                moveTo(19.646f, 10.12f)
                lineTo(16.524f, 13.342f)
                lineTo(7.053f, 3.872f)
                lineTo(7.424f, 2.831f)
                curveTo(7.601f, 2.333f, 8.073f, 2f, 8.602f, 2f)
                horizontalLineTo(15.055f)
                curveTo(15.908f, 2f, 16.511f, 2.836f, 16.241f, 3.645f)
                lineTo(14.79f, 8f)
                horizontalLineTo(18.748f)
                curveTo(19.852f, 8f, 20.414f, 9.327f, 19.646f, 10.12f)
                close()
            }
        }.build()

        return _FlashOff!!
    }

@Suppress("ObjectPropertyName")
private var _FlashOff: ImageVector? = null

@Preview
@Composable
private fun FlashOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FlashOff, contentDescription = null)
    }
}
