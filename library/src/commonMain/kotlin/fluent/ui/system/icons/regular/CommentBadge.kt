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

public val FluentIcons.Regular.CommentBadge: ImageVector
    get() {
        if (_CommentBadge != null) {
            return _CommentBadge!!
        }
        _CommentBadge = ImageVector.Builder(
            name = "Regular.CommentBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.5f, 7f)
                curveTo(21.881f, 7f, 23f, 5.881f, 23f, 4.5f)
                curveTo(23f, 3.119f, 21.881f, 2f, 20.5f, 2f)
                curveTo(19.119f, 2f, 18f, 3.119f, 18f, 4.5f)
                curveTo(18f, 5.881f, 19.119f, 7f, 20.5f, 7f)
                close()
                moveTo(20.5f, 8f)
                curveTo(21.037f, 8f, 21.545f, 7.879f, 22f, 7.663f)
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
                horizontalLineTo(17.337f)
                curveTo(17.121f, 3.455f, 17f, 3.963f, 17f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(3.5f, 15.717f, 4.284f, 16.5f, 5.25f, 16.5f)
                horizontalLineTo(7.499f)
                lineTo(7.5f, 20.251f)
                lineTo(12.514f, 16.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 16.5f, 20.5f, 15.717f, 20.5f, 14.75f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _CommentBadge!!
    }

@Suppress("ObjectPropertyName")
private var _CommentBadge: ImageVector? = null

@Preview
@Composable
private fun CommentBadgePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CommentBadge, contentDescription = null)
    }
}
