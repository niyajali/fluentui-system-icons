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
package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.ProhibitedMultiple: ImageVector
    get() {
        if (_ProhibitedMultiple != null) {
            return _ProhibitedMultiple!!
        }
        _ProhibitedMultiple = ImageVector.Builder(
            name = "Regular.ProhibitedMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.697f, 5.697f)
                curveTo(8.447f, 2.947f, 12.801f, 2.779f, 15.747f, 5.193f)
                lineTo(5.193f, 15.747f)
                curveTo(2.779f, 12.801f, 2.947f, 8.447f, 5.697f, 5.697f)
                close()
                moveTo(6.253f, 16.807f)
                lineTo(16.807f, 6.253f)
                curveTo(19.221f, 9.199f, 19.053f, 13.553f, 16.303f, 16.303f)
                curveTo(13.553f, 19.053f, 9.199f, 19.221f, 6.253f, 16.807f)
                close()
                moveTo(17.364f, 4.636f)
                curveTo(13.849f, 1.121f, 8.151f, 1.121f, 4.636f, 4.636f)
                curveTo(1.121f, 8.151f, 1.121f, 13.849f, 4.636f, 17.364f)
                curveTo(8.151f, 20.879f, 13.849f, 20.879f, 17.364f, 17.364f)
                curveTo(20.879f, 13.849f, 20.879f, 8.151f, 17.364f, 4.636f)
                close()
                moveTo(21f, 11f)
                curveTo(21f, 16.523f, 16.523f, 21f, 11f, 21f)
                curveTo(10.136f, 21f, 9.298f, 20.89f, 8.499f, 20.685f)
                curveTo(9.765f, 21.364f, 11.212f, 21.75f, 12.75f, 21.75f)
                curveTo(17.721f, 21.75f, 21.75f, 17.721f, 21.75f, 12.75f)
                curveTo(21.75f, 11.212f, 21.364f, 9.765f, 20.685f, 8.499f)
                curveTo(20.89f, 9.298f, 21f, 10.136f, 21f, 11f)
                close()
            }
        }.build()

        return _ProhibitedMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _ProhibitedMultiple: ImageVector? = null

@Preview
@Composable
private fun ProhibitedMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ProhibitedMultiple, contentDescription = null)
    }
}
