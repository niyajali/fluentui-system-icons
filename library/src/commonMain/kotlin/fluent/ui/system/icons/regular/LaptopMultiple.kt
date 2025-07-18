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

public val FluentIcons.Regular.LaptopMultiple: ImageVector
    get() {
        if (_LaptopMultiple != null) {
            return _LaptopMultiple!!
        }
        _LaptopMultiple = ImageVector.Builder(
            name = "Regular.LaptopMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.627f, 5f)
                curveTo(6.936f, 4.126f, 7.769f, 3.5f, 8.749f, 3.5f)
                horizontalLineTo(17.249f)
                curveTo(19.596f, 3.5f, 21.499f, 5.403f, 21.499f, 7.75f)
                verticalLineTo(12.25f)
                curveTo(21.499f, 13.229f, 20.873f, 14.063f, 20f, 14.372f)
                verticalLineTo(8.25f)
                curveTo(20f, 8.225f, 20f, 8.199f, 19.999f, 8.174f)
                verticalLineTo(7.75f)
                curveTo(19.999f, 6.231f, 18.768f, 5f, 17.249f, 5f)
                horizontalLineTo(6.627f)
                close()
                moveTo(4f, 8.25f)
                curveTo(4f, 7.007f, 5.007f, 6f, 6.25f, 6f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 6f, 19f, 7.007f, 19f, 8.25f)
                verticalLineTo(14.75f)
                curveTo(19f, 15.993f, 17.993f, 17f, 16.75f, 17f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 17f, 4f, 15.993f, 4f, 14.75f)
                verticalLineTo(8.25f)
                close()
                moveTo(6.25f, 7.5f)
                curveTo(5.836f, 7.5f, 5.5f, 7.836f, 5.5f, 8.25f)
                verticalLineTo(14.75f)
                curveTo(5.5f, 15.164f, 5.836f, 15.5f, 6.25f, 15.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 15.5f, 17.5f, 15.164f, 17.5f, 14.75f)
                verticalLineTo(8.25f)
                curveTo(17.5f, 7.836f, 17.164f, 7.5f, 16.75f, 7.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(2.75f, 18.5f)
                curveTo(2.336f, 18.5f, 2f, 18.836f, 2f, 19.25f)
                curveTo(2f, 19.664f, 2.336f, 20f, 2.75f, 20f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 20f, 21f, 19.664f, 21f, 19.25f)
                curveTo(21f, 18.836f, 20.664f, 18.5f, 20.25f, 18.5f)
                horizontalLineTo(2.75f)
                close()
            }
        }.build()

        return _LaptopMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopMultiple: ImageVector? = null

@Preview
@Composable
private fun LaptopMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LaptopMultiple, contentDescription = null)
    }
}
