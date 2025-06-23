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

public val FluentIcons.Filled.Laptop: ImageVector
    get() {
        if (_Laptop != null) {
            return _Laptop!!
        }
        _Laptop = ImageVector.Builder(
            name = "Filled.Laptop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(13.75f)
                curveTo(20f, 14.993f, 18.993f, 16f, 17.75f, 16f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 16f, 4f, 14.993f, 4f, 13.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(2.75f, 17.5f)
                curveTo(2.336f, 17.5f, 2f, 17.836f, 2f, 18.25f)
                curveTo(2f, 18.664f, 2.336f, 19f, 2.75f, 19f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 19f, 22f, 18.664f, 22f, 18.25f)
                curveTo(22f, 17.836f, 21.664f, 17.5f, 21.25f, 17.5f)
                horizontalLineTo(2.75f)
                close()
            }
        }.build()

        return _Laptop!!
    }

@Suppress("ObjectPropertyName")
private var _Laptop: ImageVector? = null

@Preview
@Composable
private fun LaptopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Laptop, contentDescription = null)
    }
}
