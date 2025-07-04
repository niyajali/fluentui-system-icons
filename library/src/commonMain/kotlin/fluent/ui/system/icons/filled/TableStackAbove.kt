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

public val FluentIcons.Filled.TableStackAbove: ImageVector
    get() {
        if (_TableStackAbove != null) {
            return _TableStackAbove!!
        }
        _TableStackAbove = ImageVector.Builder(
            name = "Filled.TableStackAbove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.25f, 4.5f)
                curveTo(20.664f, 4.5f, 21f, 4.164f, 21f, 3.75f)
                curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
                curveTo(3f, 4.164f, 3.336f, 4.5f, 3.75f, 4.5f)
                lineTo(20.25f, 4.5f)
                close()
                moveTo(14.5f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.5f)
                close()
                moveTo(9.5f, 16f)
                horizontalLineTo(14.5f)
                verticalLineTo(21f)
                lineTo(9.5f, 21f)
                verticalLineTo(16f)
                close()
                moveTo(8f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(3f)
                verticalLineTo(10.25f)
                curveTo(3f, 9.836f, 3.336f, 9.5f, 3.75f, 9.5f)
                horizontalLineTo(8f)
                close()
                moveTo(8f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                close()
                moveTo(21f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(16f)
                close()
                moveTo(16f, 14.5f)
                horizontalLineTo(21f)
                verticalLineTo(10.25f)
                curveTo(21f, 10.051f, 20.921f, 9.86f, 20.78f, 9.72f)
                curveTo(20.64f, 9.579f, 20.449f, 9.5f, 20.25f, 9.5f)
                horizontalLineTo(16f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _TableStackAbove!!
    }

@Suppress("ObjectPropertyName")
private var _TableStackAbove: ImageVector? = null

@Preview
@Composable
private fun TableStackAbovePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableStackAbove, contentDescription = null)
    }
}
