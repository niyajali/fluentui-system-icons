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

public val FluentIcons.Regular.CommentAdd: ImageVector
    get() {
        if (_CommentAdd != null) {
            return _CommentAdd!!
        }
        _CommentAdd = ImageVector.Builder(
            name = "Regular.CommentAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 6.5f)
                curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
                curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
                curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
                close()
                moveTo(18.001f, 7f)
                lineTo(18.001f, 9.504f)
                curveTo(18.001f, 9.78f, 17.777f, 10.003f, 17.501f, 10.003f)
                curveTo(17.225f, 10.003f, 17.001f, 9.78f, 17.001f, 9.504f)
                lineTo(17.001f, 7f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 7f, 13.996f, 6.776f, 13.996f, 6.5f)
                curveTo(13.996f, 6.224f, 14.22f, 6f, 14.496f, 6f)
                horizontalLineTo(17f)
                lineTo(17f, 3.499f)
                curveTo(17f, 3.223f, 17.224f, 2.999f, 17.5f, 2.999f)
                curveTo(17.776f, 2.999f, 18f, 3.223f, 18f, 3.499f)
                lineTo(18f, 6f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 6f, 20.996f, 6.224f, 20.996f, 6.5f)
                curveTo(20.996f, 6.776f, 20.772f, 7f, 20.497f, 7f)
                horizontalLineTo(18.001f)
                close()
                moveTo(20.5f, 14.75f)
                verticalLineTo(12.268f)
                curveTo(21.051f, 11.981f, 21.556f, 11.617f, 22f, 11.19f)
                verticalLineTo(14.75f)
                curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
                horizontalLineTo(13.012f)
                lineTo(7.999f, 21.751f)
                curveTo(7.446f, 22.164f, 6.662f, 22.051f, 6.249f, 21.498f)
                curveTo(6.087f, 21.282f, 6f, 21.02f, 6f, 20.75f)
                lineTo(5.999f, 18f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
                horizontalLineTo(12.022f)
                curveTo(11.725f, 3.463f, 11.486f, 3.967f, 11.314f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(3.5f, 15.717f, 4.284f, 16.5f, 5.25f, 16.5f)
                horizontalLineTo(7.499f)
                lineTo(7.5f, 20.251f)
                lineTo(12.514f, 16.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 16.5f, 20.5f, 15.717f, 20.5f, 14.75f)
                close()
            }
        }.build()

        return _CommentAdd!!
    }

@Suppress("ObjectPropertyName")
private var _CommentAdd: ImageVector? = null

@Preview
@Composable
private fun CommentAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CommentAdd, contentDescription = null)
    }
}
