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
 * FolderList icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: folder, list
 * - Source: ic_fluent_folder_list_20_filled.svg
 * 
 * @return The [ImageVector] for the FolderList icon.
 */
public val FluentIcons.Filled.FolderList: ImageVector
    get() {
        if (_folderList != null) {
            return _folderList!!
        }
        _folderList = Builder(name = "FolderList", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 5.5f)
                curveTo(2.0f, 4.119f, 3.119f, 3.0f, 4.5f, 3.0f)
                horizontalLineTo(6.982f)
                curveTo(7.446f, 3.0f, 7.891f, 3.184f, 8.22f, 3.513f)
                lineTo(9.5f, 4.793f)
                lineTo(7.439f, 6.854f)
                curveTo(7.346f, 6.947f, 7.218f, 7.0f, 7.086f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.5f)
                close()
                moveTo(2.0f, 8.0f)
                verticalLineTo(14.5f)
                curveTo(2.0f, 15.881f, 3.119f, 17.0f, 4.5f, 17.0f)
                horizontalLineTo(11.085f)
                curveTo(11.151f, 16.814f, 11.253f, 16.644f, 11.382f, 16.5f)
                curveTo(11.144f, 16.235f, 11.0f, 15.884f, 11.0f, 15.5f)
                curveTo(11.0f, 15.116f, 11.144f, 14.765f, 11.382f, 14.5f)
                curveTo(11.144f, 14.235f, 11.0f, 13.884f, 11.0f, 13.5f)
                curveTo(11.0f, 12.672f, 11.672f, 12.0f, 12.5f, 12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.5f)
                curveTo(18.0f, 6.119f, 16.881f, 5.0f, 15.5f, 5.0f)
                horizontalLineTo(10.707f)
                lineTo(8.146f, 7.561f)
                curveTo(7.865f, 7.842f, 7.484f, 8.0f, 7.086f, 8.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(12.5f, 13.0f)
                curveTo(12.224f, 13.0f, 12.0f, 13.224f, 12.0f, 13.5f)
                curveTo(12.0f, 13.776f, 12.224f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(18.5f)
                curveTo(18.776f, 14.0f, 19.0f, 13.776f, 19.0f, 13.5f)
                curveTo(19.0f, 13.224f, 18.776f, 13.0f, 18.5f, 13.0f)
                horizontalLineTo(12.5f)
                close()
                moveTo(12.5f, 15.0f)
                curveTo(12.224f, 15.0f, 12.0f, 15.224f, 12.0f, 15.5f)
                curveTo(12.0f, 15.776f, 12.224f, 16.0f, 12.5f, 16.0f)
                horizontalLineTo(18.5f)
                curveTo(18.776f, 16.0f, 19.0f, 15.776f, 19.0f, 15.5f)
                curveTo(19.0f, 15.224f, 18.776f, 15.0f, 18.5f, 15.0f)
                horizontalLineTo(12.5f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 17.224f, 12.224f, 17.0f, 12.5f, 17.0f)
                horizontalLineTo(18.5f)
                curveTo(18.776f, 17.0f, 19.0f, 17.224f, 19.0f, 17.5f)
                curveTo(19.0f, 17.776f, 18.776f, 18.0f, 18.5f, 18.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 18.0f, 12.0f, 17.776f, 12.0f, 17.5f)
                close()
            }
        }
        .build()
        return _folderList!!
    }

@Suppress("ObjectPropertyName")
private var _folderList: ImageVector? = null

@Preview
@Composable
private fun FolderListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FolderList, contentDescription = null)
    }
}

