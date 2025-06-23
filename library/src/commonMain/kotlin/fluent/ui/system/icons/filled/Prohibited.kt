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

public val FluentIcons.Filled.Prohibited: ImageVector
    get() {
        if (_Prohibited != null) {
            return _Prohibited!!
        }
        _Prohibited = ImageVector.Builder(
            name = "Filled.Prohibited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.906f, 5.68f)
                curveTo(13.768f, 3.237f, 9.228f, 3.458f, 6.343f, 6.343f)
                curveTo(3.458f, 9.228f, 3.237f, 13.768f, 5.68f, 16.906f)
                lineTo(16.906f, 5.68f)
                close()
                moveTo(18.32f, 7.094f)
                lineTo(7.094f, 18.32f)
                curveTo(10.232f, 20.763f, 14.772f, 20.542f, 17.657f, 17.657f)
                curveTo(20.542f, 14.772f, 20.763f, 10.232f, 18.32f, 7.094f)
                close()
                moveTo(4.929f, 4.929f)
                curveTo(8.834f, 1.024f, 15.166f, 1.024f, 19.071f, 4.929f)
                curveTo(22.976f, 8.834f, 22.976f, 15.166f, 19.071f, 19.071f)
                curveTo(15.166f, 22.976f, 8.834f, 22.976f, 4.929f, 19.071f)
                curveTo(1.024f, 15.166f, 1.024f, 8.834f, 4.929f, 4.929f)
                close()
            }
        }.build()

        return _Prohibited!!
    }

@Suppress("ObjectPropertyName")
private var _Prohibited: ImageVector? = null

@Preview
@Composable
private fun ProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Prohibited, contentDescription = null)
    }
}
