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

public val FluentIcons.Regular.ShapeIntersect: ImageVector
    get() {
        if (_ShapeIntersect != null) {
            return _ShapeIntersect!!
        }
        _ShapeIntersect = ImageVector.Builder(
            name = "Regular.ShapeIntersect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 5.25f)
                curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
                horizontalLineTo(13.25f)
                curveTo(15.045f, 2f, 16.5f, 3.455f, 16.5f, 5.25f)
                verticalLineTo(7.5f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 7.5f, 22f, 8.955f, 22f, 10.75f)
                verticalLineTo(18.75f)
                curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
                horizontalLineTo(10.75f)
                curveTo(8.955f, 22f, 7.5f, 20.545f, 7.5f, 18.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 16.5f, 2f, 15.045f, 2f, 13.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(15f, 5.25f)
                curveTo(15f, 4.284f, 14.217f, 3.5f, 13.25f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
                verticalLineTo(13.25f)
                curveTo(3.5f, 14.217f, 4.284f, 15f, 5.25f, 15f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.75f)
                curveTo(7.5f, 10.441f, 7.543f, 10.143f, 7.623f, 9.86f)
                curveTo(7.629f, 9.839f, 7.635f, 9.818f, 7.642f, 9.798f)
                curveTo(7.957f, 8.769f, 8.769f, 7.957f, 9.798f, 7.642f)
                curveTo(10.099f, 7.55f, 10.419f, 7.5f, 10.75f, 7.5f)
                horizontalLineTo(15f)
                verticalLineTo(5.25f)
                close()
                moveTo(9f, 14.561f)
                verticalLineTo(15f)
                horizontalLineTo(10.439f)
                lineTo(15f, 10.439f)
                verticalLineTo(9f)
                horizontalLineTo(14.561f)
                lineTo(9f, 14.561f)
                close()
                moveTo(12.439f, 9f)
                horizontalLineTo(10.75f)
                curveTo(10.682f, 9f, 10.615f, 9.004f, 10.549f, 9.011f)
                lineTo(9.011f, 10.549f)
                curveTo(9.004f, 10.615f, 9f, 10.682f, 9f, 10.75f)
                verticalLineTo(12.439f)
                lineTo(12.439f, 9f)
                close()
                moveTo(16.5f, 9f)
                verticalLineTo(13.25f)
                curveTo(16.5f, 15.045f, 15.045f, 16.5f, 13.25f, 16.5f)
                horizontalLineTo(9f)
                verticalLineTo(18.75f)
                curveTo(9f, 19.716f, 9.783f, 20.5f, 10.75f, 20.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 20.5f, 20.5f, 19.716f, 20.5f, 18.75f)
                verticalLineTo(10.75f)
                curveTo(20.5f, 9.783f, 19.716f, 9f, 18.75f, 9f)
                horizontalLineTo(16.5f)
                close()
                moveTo(12.561f, 15f)
                horizontalLineTo(13.25f)
                curveTo(14.217f, 15f, 15f, 14.217f, 15f, 13.25f)
                verticalLineTo(12.561f)
                lineTo(12.561f, 15f)
                close()
            }
        }.build()

        return _ShapeIntersect!!
    }

@Suppress("ObjectPropertyName")
private var _ShapeIntersect: ImageVector? = null

@Preview
@Composable
private fun ShapeIntersectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShapeIntersect, contentDescription = null)
    }
}
