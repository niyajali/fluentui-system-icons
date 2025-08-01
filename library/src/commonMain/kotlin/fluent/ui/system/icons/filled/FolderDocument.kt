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

public val FluentIcons.Filled.FolderDocument: ImageVector
    get() {
        if (_FolderDocument != null) {
            return _FolderDocument!!
        }
        _FolderDocument = ImageVector.Builder(
            name = "Filled.FolderDocument",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 8f)
                verticalLineTo(6.25f)
                curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
                horizontalLineTo(8.129f)
                curveTo(8.725f, 3f, 9.298f, 3.237f, 9.72f, 3.659f)
                lineTo(11.25f, 5.189f)
                lineTo(8.659f, 7.78f)
                curveTo(8.518f, 7.921f, 8.328f, 8f, 8.129f, 8f)
                horizontalLineTo(2f)
                close()
                moveTo(2f, 9.5f)
                verticalLineTo(17.75f)
                curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(13.5f)
                curveTo(13f, 12.119f, 14.119f, 11f, 15.5f, 11f)
                horizontalLineTo(18.422f)
                curveTo(18.952f, 11f, 19.461f, 11.211f, 19.836f, 11.586f)
                lineTo(22f, 13.75f)
                verticalLineTo(8.75f)
                curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
                horizontalLineTo(13.061f)
                lineTo(9.72f, 8.841f)
                curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
                horizontalLineTo(2f)
                close()
                moveTo(18f, 15.25f)
                verticalLineTo(12f)
                horizontalLineTo(15.5f)
                curveTo(14.672f, 12f, 14f, 12.672f, 14f, 13.5f)
                verticalLineTo(21.5f)
                curveTo(14f, 22.328f, 14.672f, 23f, 15.5f, 23f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
                verticalLineTo(17f)
                horizontalLineTo(19.75f)
                curveTo(18.784f, 17f, 18f, 16.216f, 18f, 15.25f)
                close()
                moveTo(19f, 15.25f)
                verticalLineTo(12f)
                lineTo(23f, 16f)
                horizontalLineTo(19.75f)
                curveTo(19.336f, 16f, 19f, 15.664f, 19f, 15.25f)
                close()
            }
        }.build()

        return _FolderDocument!!
    }

@Suppress("ObjectPropertyName")
private var _FolderDocument: ImageVector? = null

@Preview
@Composable
private fun FolderDocumentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FolderDocument, contentDescription = null)
    }
}
