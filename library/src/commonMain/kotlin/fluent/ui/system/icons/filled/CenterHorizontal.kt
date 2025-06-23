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

public val FluentIcons.Filled.CenterHorizontal: ImageVector
    get() {
        if (_CenterHorizontal != null) {
            return _CenterHorizontal!!
        }
        _CenterHorizontal = ImageVector.Builder(
            name = "Filled.CenterHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 3f)
                curveTo(4.164f, 3f, 4.5f, 3.336f, 4.5f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(4.5f, 20.664f, 4.164f, 21f, 3.75f, 21f)
                curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
                close()
                moveTo(20.25f, 3f)
                curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(21f, 20.664f, 20.664f, 21f, 20.25f, 21f)
                curveTo(19.836f, 21f, 19.5f, 20.664f, 19.5f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(19.5f, 3.336f, 19.836f, 3f, 20.25f, 3f)
                close()
                moveTo(10.25f, 5f)
                curveTo(9.007f, 5f, 8f, 6.007f, 8f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(8f, 17.993f, 9.007f, 19f, 10.25f, 19f)
                horizontalLineTo(13.75f)
                curveTo(14.993f, 19f, 16f, 17.993f, 16f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(16f, 6.007f, 14.993f, 5f, 13.75f, 5f)
                horizontalLineTo(10.25f)
                close()
            }
        }.build()

        return _CenterHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _CenterHorizontal: ImageVector? = null

@Preview
@Composable
private fun CenterHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CenterHorizontal, contentDescription = null)
    }
}
