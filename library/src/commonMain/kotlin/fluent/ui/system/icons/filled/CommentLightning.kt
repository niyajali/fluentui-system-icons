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

public val FluentIcons.Filled.CommentLightning: ImageVector
    get() {
        if (_CommentLightning != null) {
            return _CommentLightning!!
        }
        _CommentLightning = ImageVector.Builder(
            name = "Filled.CommentLightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.318f, 1f)
                horizontalLineTo(21.145f)
                curveTo(21.528f, 1f, 21.768f, 1.412f, 21.581f, 1.745f)
                lineTo(19.75f, 5f)
                horizontalLineTo(21.246f)
                curveTo(21.891f, 5f, 22.235f, 5.759f, 21.81f, 6.244f)
                lineTo(16.987f, 11.752f)
                curveTo(16.482f, 12.328f, 15.544f, 11.837f, 15.729f, 11.094f)
                lineTo(16.5f, 8f)
                horizontalLineTo(13.498f)
                curveTo(13.131f, 8f, 12.889f, 7.619f, 13.045f, 7.287f)
                lineTo(15.865f, 1.287f)
                curveTo(15.948f, 1.112f, 16.124f, 1f, 16.318f, 1f)
                close()
                moveTo(5.25f, 3f)
                horizontalLineTo(13.955f)
                lineTo(12.14f, 6.862f)
                curveTo(11.672f, 7.857f, 12.398f, 9f, 13.497f, 9f)
                horizontalLineTo(15.22f)
                lineTo(14.759f, 10.853f)
                curveTo(14.32f, 12.614f, 16.543f, 13.776f, 17.739f, 12.411f)
                lineTo(22f, 7.545f)
                verticalLineTo(14.75f)
                curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
                horizontalLineTo(13f)
                lineTo(8f, 21.75f)
                curveTo(7.176f, 22.368f, 6f, 21.78f, 6f, 20.75f)
                verticalLineTo(18f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
                close()
            }
        }.build()

        return _CommentLightning!!
    }

@Suppress("ObjectPropertyName")
private var _CommentLightning: ImageVector? = null

@Preview
@Composable
private fun CommentLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CommentLightning, contentDescription = null)
    }
}
