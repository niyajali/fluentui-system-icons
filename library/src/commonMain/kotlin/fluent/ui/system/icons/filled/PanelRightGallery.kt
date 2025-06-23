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

public val FluentIcons.Filled.PanelRightGallery: ImageVector
    get() {
        if (_PanelRightGallery != null) {
            return _PanelRightGallery!!
        }
        _PanelRightGallery = ImageVector.Builder(
            name = "Filled.PanelRightGallery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.75f, 4f)
                curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(16f)
                verticalLineTo(5.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 5.5f, 3.5f, 6.284f, 3.5f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.716f, 4.284f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(16f)
                verticalLineTo(15.5f)
                horizontalLineTo(22f)
                verticalLineTo(16.75f)
                curveTo(22f, 18.545f, 20.545f, 20f, 18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                horizontalLineTo(18.75f)
                close()
                moveTo(22f, 14f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _PanelRightGallery!!
    }

@Suppress("ObjectPropertyName")
private var _PanelRightGallery: ImageVector? = null

@Preview
@Composable
private fun PanelRightGalleryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PanelRightGallery, contentDescription = null)
    }
}
