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

public val FluentIcons.Filled.CommentMultiple: ImageVector
    get() {
        if (_CommentMultiple != null) {
            return _CommentMultiple!!
        }
        _CommentMultiple = ImageVector.Builder(
            name = "Filled.CommentMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 5f)
                curveTo(5.168f, 5f, 5.087f, 5.002f, 5.006f, 5.007f)
                curveTo(5.583f, 4.101f, 6.596f, 3.5f, 7.75f, 3.5f)
                horizontalLineTo(15.75f)
                curveTo(18.926f, 3.5f, 21.5f, 6.074f, 21.5f, 9.25f)
                verticalLineTo(13.25f)
                curveTo(21.5f, 14.403f, 20.899f, 15.417f, 19.993f, 15.993f)
                curveTo(19.998f, 15.913f, 20f, 15.832f, 20f, 15.75f)
                verticalLineTo(9.25f)
                curveTo(20f, 6.903f, 18.097f, 5f, 15.75f, 5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(2f, 9.25f)
                curveTo(2f, 7.455f, 3.455f, 6f, 5.25f, 6f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 6f, 19f, 7.455f, 19f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(19f, 17.545f, 17.545f, 19f, 15.75f, 19f)
                horizontalLineTo(10.748f)
                lineTo(6.99f, 21.76f)
                curveTo(6.164f, 22.366f, 5f, 21.776f, 5f, 20.752f)
                verticalLineTo(18.99f)
                curveTo(3.322f, 18.863f, 2f, 17.461f, 2f, 15.75f)
                verticalLineTo(9.25f)
                close()
            }
        }.build()

        return _CommentMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CommentMultiple: ImageVector? = null

@Preview
@Composable
private fun CommentMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CommentMultiple, contentDescription = null)
    }
}
