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
 * FolderBriefcase icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: folder, briefcase
 * - Source: ic_fluent_folder_briefcase_20_regular.svg
 * 
 * @return The [ImageVector] for the FolderBriefcase icon.
 */
public val FluentIcons.Regular.FolderBriefcase: ImageVector
    get() {
        if (_folderBriefcase != null) {
            return _folderBriefcase!!
        }
        _folderBriefcase = Builder(name = "FolderBriefcase", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 3.0f)
                curveTo(3.119f, 3.0f, 2.0f, 4.119f, 2.0f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(2.0f, 15.881f, 3.119f, 17.0f, 4.5f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 16.0f, 3.0f, 15.328f, 3.0f, 14.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.086f)
                curveTo(7.484f, 8.0f, 7.865f, 7.842f, 8.146f, 7.561f)
                lineTo(9.707f, 6.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 6.0f, 17.0f, 6.672f, 17.0f, 7.5f)
                verticalLineTo(9.5f)
                curveTo(17.491f, 9.869f, 17.842f, 10.414f, 17.958f, 11.042f)
                curveTo(17.972f, 11.045f, 17.986f, 11.047f, 18.0f, 11.05f)
                verticalLineTo(7.5f)
                curveTo(18.0f, 6.119f, 16.881f, 5.0f, 15.5f, 5.0f)
                horizontalLineTo(9.707f)
                lineTo(8.22f, 3.513f)
                curveTo(7.891f, 3.184f, 7.446f, 3.0f, 6.982f, 3.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(3.0f, 5.5f)
                curveTo(3.0f, 4.672f, 3.672f, 4.0f, 4.5f, 4.0f)
                horizontalLineTo(6.982f)
                curveTo(7.181f, 4.0f, 7.372f, 4.079f, 7.513f, 4.22f)
                lineTo(8.793f, 5.5f)
                lineTo(7.439f, 6.854f)
                curveTo(7.346f, 6.947f, 7.218f, 7.0f, 7.086f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.5f)
                close()
                moveTo(12.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.5f)
                curveTo(10.672f, 12.0f, 10.0f, 12.672f, 10.0f, 13.5f)
                verticalLineTo(17.5f)
                curveTo(10.0f, 18.328f, 10.672f, 19.0f, 11.5f, 19.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 19.0f, 19.0f, 18.328f, 19.0f, 17.5f)
                verticalLineTo(13.5f)
                curveTo(19.0f, 12.672f, 18.328f, 12.0f, 17.5f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.5f)
                curveTo(17.0f, 10.672f, 16.328f, 10.0f, 15.5f, 10.0f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 10.0f, 12.0f, 10.672f, 12.0f, 11.5f)
                close()
                moveTo(13.5f, 11.0f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 11.0f, 16.0f, 11.224f, 16.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.5f)
                curveTo(13.0f, 11.224f, 13.224f, 11.0f, 13.5f, 11.0f)
                close()
            }
        }
        .build()
        return _folderBriefcase!!
    }

@Suppress("ObjectPropertyName")
private var _folderBriefcase: ImageVector? = null

@Preview
@Composable
private fun FolderBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FolderBriefcase, contentDescription = null)
    }
}

