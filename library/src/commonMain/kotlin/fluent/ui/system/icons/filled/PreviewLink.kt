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

public val FluentIcons.Filled.PreviewLink: ImageVector
    get() {
        if (_PreviewLink != null) {
            return _PreviewLink!!
        }
        _PreviewLink = ImageVector.Builder(
            name = "Filled.PreviewLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.024f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(17.98f)
                verticalLineTo(7f)
                horizontalLineTo(6.024f)
                close()
                moveTo(14.98f, 13.479f)
                verticalLineTo(16.479f)
                horizontalLineTo(17.98f)
                verticalLineTo(13.479f)
                horizontalLineTo(14.98f)
                close()
                moveTo(2f, 5.75f)
                curveTo(2f, 4.231f, 3.231f, 3f, 4.75f, 3f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 3f, 22f, 4.231f, 22f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(22f, 19.769f, 20.769f, 21f, 19.25f, 21f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 21f, 2f, 19.769f, 2f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(4.524f, 6.25f)
                verticalLineTo(9.75f)
                curveTo(4.524f, 10.164f, 4.86f, 10.5f, 5.274f, 10.5f)
                horizontalLineTo(18.73f)
                curveTo(19.144f, 10.5f, 19.48f, 10.164f, 19.48f, 9.75f)
                verticalLineTo(6.25f)
                curveTo(19.48f, 5.836f, 19.144f, 5.5f, 18.73f, 5.5f)
                horizontalLineTo(5.274f)
                curveTo(4.86f, 5.5f, 4.524f, 5.836f, 4.524f, 6.25f)
                close()
                moveTo(13.48f, 12.729f)
                verticalLineTo(17.229f)
                curveTo(13.48f, 17.643f, 13.816f, 17.979f, 14.23f, 17.979f)
                horizontalLineTo(18.73f)
                curveTo(19.144f, 17.979f, 19.48f, 17.643f, 19.48f, 17.229f)
                verticalLineTo(12.729f)
                curveTo(19.48f, 12.315f, 19.144f, 11.979f, 18.73f, 11.979f)
                horizontalLineTo(14.23f)
                curveTo(13.816f, 11.979f, 13.48f, 12.315f, 13.48f, 12.729f)
                close()
                moveTo(5.274f, 12.5f)
                curveTo(4.86f, 12.5f, 4.524f, 12.836f, 4.524f, 13.25f)
                curveTo(4.524f, 13.664f, 4.86f, 14f, 5.274f, 14f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 14f, 12f, 13.664f, 12f, 13.25f)
                curveTo(12f, 12.836f, 11.664f, 12.5f, 11.25f, 12.5f)
                horizontalLineTo(5.274f)
                close()
                moveTo(4.524f, 16.75f)
                curveTo(4.524f, 17.164f, 4.86f, 17.5f, 5.274f, 17.5f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 17.5f, 12f, 17.164f, 12f, 16.75f)
                curveTo(12f, 16.336f, 11.664f, 16f, 11.25f, 16f)
                horizontalLineTo(5.274f)
                curveTo(4.86f, 16f, 4.524f, 16.336f, 4.524f, 16.75f)
                close()
            }
        }.build()

        return _PreviewLink!!
    }

@Suppress("ObjectPropertyName")
private var _PreviewLink: ImageVector? = null

@Preview
@Composable
private fun PreviewLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PreviewLink, contentDescription = null)
    }
}
