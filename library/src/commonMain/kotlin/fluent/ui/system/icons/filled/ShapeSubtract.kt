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

public val FluentIcons.Filled.ShapeSubtract: ImageVector
    get() {
        if (_ShapeSubtract != null) {
            return _ShapeSubtract!!
        }
        _ShapeSubtract = ImageVector.Builder(
            name = "Filled.ShapeSubtract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 2.905f)
                curveTo(2.384f, 3.496f, 2f, 4.328f, 2f, 5.25f)
                verticalLineTo(13.25f)
                curveTo(2f, 13.35f, 2.005f, 13.449f, 2.013f, 13.547f)
                curveTo(2.06f, 14.061f, 2.226f, 14.54f, 2.483f, 14.956f)
                curveTo(2.506f, 14.994f, 2.53f, 15.031f, 2.555f, 15.067f)
                curveTo(3.139f, 15.932f, 4.128f, 16.5f, 5.25f, 16.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(18.75f)
                curveTo(7.5f, 20.545f, 8.955f, 22f, 10.75f, 22f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
                verticalLineTo(10.75f)
                curveTo(22f, 8.955f, 20.545f, 7.5f, 18.75f, 7.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(5.25f)
                curveTo(16.5f, 3.455f, 15.045f, 2f, 13.25f, 2f)
                horizontalLineTo(5.25f)
                curveTo(4.377f, 2f, 3.584f, 2.344f, 3f, 2.905f)
                close()
                moveTo(9f, 10.75f)
                curveTo(9f, 9.783f, 9.783f, 9f, 10.75f, 9f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 9f, 20.5f, 9.783f, 20.5f, 10.75f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.716f, 19.716f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(10.75f)
                curveTo(9.783f, 20.5f, 9f, 19.716f, 9f, 18.75f)
                verticalLineTo(10.75f)
                close()
            }
        }.build()

        return _ShapeSubtract!!
    }

@Suppress("ObjectPropertyName")
private var _ShapeSubtract: ImageVector? = null

@Preview
@Composable
private fun ShapeSubtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShapeSubtract, contentDescription = null)
    }
}
