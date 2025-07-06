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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * FolderMultiple Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent a group of folders.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_folder_multiple_16_regular.svg)
 * 
 * @return The [ImageVector] for the FolderMultiple icon.
 */
public val FluentIcons.Regular.FolderMultiple: ImageVector
    get() {
        if (_folderMultiple != null) {
            return _folderMultiple!!
        }
        _folderMultiple = Builder(name = "FolderMultiple", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 3.0f)
                curveTo(2.672f, 3.0f, 2.0f, 3.672f, 2.0f, 4.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.086f)
                curveTo(5.218f, 5.0f, 5.346f, 4.947f, 5.439f, 4.854f)
                lineTo(6.293f, 4.0f)
                lineTo(5.439f, 3.146f)
                curveTo(5.346f, 3.053f, 5.218f, 3.0f, 5.086f, 3.0f)
                horizontalLineTo(3.5f)
                close()
                moveTo(1.0f, 4.441f)
                curveTo(1.0f, 4.425f, 1.001f, 4.409f, 1.002f, 4.394f)
                curveTo(1.058f, 3.062f, 2.155f, 2.0f, 3.5f, 2.0f)
                horizontalLineTo(5.086f)
                curveTo(5.484f, 2.0f, 5.865f, 2.158f, 6.146f, 2.439f)
                lineTo(7.207f, 3.5f)
                horizontalLineTo(10.5f)
                curveTo(11.881f, 3.5f, 13.0f, 4.619f, 13.0f, 6.0f)
                verticalLineTo(9.5f)
                curveTo(13.0f, 10.881f, 11.881f, 12.0f, 10.5f, 12.0f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 12.0f, 1.0f, 10.881f, 1.0f, 9.5f)
                verticalLineTo(4.441f)
                close()
                moveTo(7.207f, 4.5f)
                lineTo(6.146f, 5.561f)
                curveTo(5.865f, 5.842f, 5.484f, 6.0f, 5.086f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.5f)
                curveTo(2.0f, 10.328f, 2.672f, 11.0f, 3.5f, 11.0f)
                horizontalLineTo(10.5f)
                curveTo(11.328f, 11.0f, 12.0f, 10.328f, 12.0f, 9.5f)
                verticalLineTo(6.0f)
                curveTo(12.0f, 5.172f, 11.328f, 4.5f, 10.5f, 4.5f)
                horizontalLineTo(7.207f)
                close()
                moveTo(14.0f, 6.0f)
                curveTo(14.607f, 6.456f, 15.0f, 7.182f, 15.0f, 8.0f)
                verticalLineTo(9.5f)
                curveTo(15.0f, 11.986f, 12.986f, 14.0f, 10.5f, 14.0f)
                horizontalLineTo(5.5f)
                curveTo(4.682f, 14.0f, 3.956f, 13.607f, 3.5f, 13.0f)
                horizontalLineTo(10.5f)
                curveTo(12.433f, 13.0f, 14.0f, 11.433f, 14.0f, 9.5f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _folderMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _folderMultiple: ImageVector? = null

@Preview
@Composable
private fun FolderMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FolderMultiple, contentDescription = "FolderMultiple Icon")
    }
}

