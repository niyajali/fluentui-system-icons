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

public val FluentIcons.Filled.CommentEdit: ImageVector
    get() {
        if (_CommentEdit != null) {
            return _CommentEdit!!
        }
        _CommentEdit = ImageVector.Builder(
            name = "Filled.CommentEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 6.25f)
                curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 3f, 22f, 4.455f, 22f, 6.25f)
                verticalLineTo(10.924f)
                curveTo(20.714f, 9.679f, 18.663f, 9.692f, 17.393f, 10.962f)
                lineTo(11.49f, 16.865f)
                curveTo(11.018f, 17.337f, 10.683f, 17.929f, 10.521f, 18.577f)
                lineTo(10.126f, 20.155f)
                lineTo(8f, 21.75f)
                curveTo(7.176f, 22.368f, 6f, 21.78f, 6f, 20.75f)
                verticalLineTo(18f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(18.1f, 11.67f)
                lineTo(12.197f, 17.572f)
                curveTo(11.853f, 17.916f, 11.609f, 18.347f, 11.491f, 18.819f)
                lineTo(11.033f, 20.65f)
                curveTo(10.834f, 21.446f, 11.556f, 22.167f, 12.352f, 21.968f)
                lineTo(14.182f, 21.511f)
                curveTo(14.655f, 21.393f, 15.086f, 21.149f, 15.43f, 20.804f)
                lineTo(21.332f, 14.902f)
                curveTo(22.225f, 14.009f, 22.225f, 12.562f, 21.332f, 11.67f)
                curveTo(20.44f, 10.777f, 18.993f, 10.777f, 18.1f, 11.67f)
                close()
            }
        }.build()

        return _CommentEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CommentEdit: ImageVector? = null

@Preview
@Composable
private fun CommentEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CommentEdit, contentDescription = null)
    }
}
