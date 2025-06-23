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

public val FluentIcons.Regular.PaintBrush: ImageVector
    get() {
        if (_PaintBrush != null) {
            return _PaintBrush!!
        }
        _PaintBrush = ImageVector.Builder(
            name = "Regular.PaintBrush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.75f, 2f)
                curveTo(5.336f, 2f, 5f, 2.336f, 5f, 2.75f)
                verticalLineTo(14.25f)
                curveTo(5f, 15.493f, 6.007f, 16.5f, 7.25f, 16.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.5f)
                curveTo(9.5f, 20.881f, 10.619f, 22f, 12f, 22f)
                curveTo(13.38f, 22f, 14.5f, 20.881f, 14.5f, 19.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 16.5f, 19f, 15.493f, 19f, 14.25f)
                verticalLineTo(2.75f)
                curveTo(19f, 2.336f, 18.664f, 2f, 18.25f, 2f)
                horizontalLineTo(5.75f)
                close()
                moveTo(6.5f, 11f)
                verticalLineTo(3.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(5.252f)
                curveTo(12.5f, 5.666f, 12.835f, 6.002f, 13.25f, 6.002f)
                curveTo(13.664f, 6.002f, 14f, 5.666f, 14f, 5.252f)
                verticalLineTo(3.5f)
                horizontalLineTo(15f)
                verticalLineTo(6.251f)
                curveTo(15f, 6.665f, 15.335f, 7.001f, 15.75f, 7.001f)
                curveTo(16.164f, 7.001f, 16.5f, 6.665f, 16.5f, 6.251f)
                verticalLineTo(3.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(11f)
                horizontalLineTo(6.5f)
                close()
                moveTo(6.5f, 14.25f)
                verticalLineTo(12.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.25f)
                curveTo(17.5f, 14.665f, 17.164f, 15f, 16.75f, 15f)
                horizontalLineTo(13.75f)
                curveTo(13.335f, 15f, 13f, 15.336f, 13f, 15.75f)
                verticalLineTo(19.5f)
                curveTo(13f, 20.052f, 12.552f, 20.5f, 12f, 20.5f)
                curveTo(11.448f, 20.5f, 11f, 20.052f, 11f, 19.5f)
                verticalLineTo(15.75f)
                curveTo(11f, 15.336f, 10.664f, 15f, 10.25f, 15f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 15f, 6.5f, 14.665f, 6.5f, 14.25f)
                close()
            }
        }.build()

        return _PaintBrush!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrush: ImageVector? = null

@Preview
@Composable
private fun PaintBrushPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PaintBrush, contentDescription = null)
    }
}
