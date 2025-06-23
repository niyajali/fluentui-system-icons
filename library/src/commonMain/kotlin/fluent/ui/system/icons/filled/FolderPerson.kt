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

public val FluentIcons.Filled.FolderPerson: ImageVector
    get() {
        if (_FolderPerson != null) {
            return _FolderPerson!!
        }
        _FolderPerson = ImageVector.Builder(
            name = "Filled.FolderPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(8.129f)
                curveTo(8.328f, 8f, 8.518f, 7.921f, 8.659f, 7.78f)
                lineTo(11.25f, 5.189f)
                lineTo(9.72f, 3.659f)
                curveTo(9.298f, 3.237f, 8.725f, 3f, 8.129f, 3f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
                close()
                moveTo(2f, 17.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(8.129f)
                curveTo(8.725f, 9.5f, 9.298f, 9.263f, 9.72f, 8.841f)
                lineTo(13.061f, 5.5f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 5.5f, 22f, 6.955f, 22f, 8.75f)
                verticalLineTo(14.5f)
                curveTo(22f, 12.567f, 20.433f, 11f, 18.5f, 11f)
                curveTo(16.567f, 11f, 15f, 12.567f, 15f, 14.5f)
                curveTo(15f, 15.479f, 15.402f, 16.365f, 16.051f, 17f)
                horizontalLineTo(15.773f)
                curveTo(14.242f, 17f, 13f, 18.24f, 13f, 19.772f)
                verticalLineTo(19.875f)
                curveTo(13f, 20.254f, 13.056f, 20.633f, 13.172f, 21f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
                close()
                moveTo(21f, 14.5f)
                curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
                curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
                curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
                curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
                close()
                moveTo(23f, 19.875f)
                curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
                curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
                horizontalLineTo(21.227f)
                curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }.build()

        return _FolderPerson!!
    }

@Suppress("ObjectPropertyName")
private var _FolderPerson: ImageVector? = null

@Preview
@Composable
private fun FolderPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FolderPerson, contentDescription = null)
    }
}
