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
 * TabDesktopCopy Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, edge
 * - Description: Used in large screen browser tab scenarios. Contains option variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tab_desktop_copy_20_regular.svg)
 * 
 * @return The [ImageVector] for the TabDesktopCopy icon.
 */
public val FluentIcons.Regular.TabDesktopCopy: ImageVector
    get() {
        if (_tabDesktopCopy != null) {
            return _tabDesktopCopy!!
        }
        _tabDesktopCopy = Builder(name = "TabDesktopCopy", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 2.0f)
                curveTo(6.119f, 2.0f, 5.0f, 3.119f, 5.0f, 4.5f)
                verticalLineTo(12.5f)
                curveTo(5.0f, 13.881f, 6.119f, 15.0f, 7.5f, 15.0f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 15.0f, 18.0f, 13.881f, 18.0f, 12.5f)
                verticalLineTo(4.5f)
                curveTo(18.0f, 3.119f, 16.881f, 2.0f, 15.5f, 2.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(17.0f, 4.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.5f)
                curveTo(10.224f, 5.0f, 10.0f, 4.776f, 10.0f, 4.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.5f)
                curveTo(16.329f, 3.0f, 17.0f, 3.672f, 17.0f, 4.5f)
                close()
                moveTo(9.0f, 4.5f)
                curveTo(9.0f, 5.328f, 9.672f, 6.0f, 10.5f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.5f)
                curveTo(17.0f, 13.328f, 16.329f, 14.0f, 15.5f, 14.0f)
                horizontalLineTo(7.5f)
                curveTo(6.672f, 14.0f, 6.0f, 13.328f, 6.0f, 12.5f)
                verticalLineTo(4.5f)
                curveTo(6.0f, 3.672f, 6.672f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(12.5f, 18.0f)
                curveTo(13.71f, 18.0f, 14.719f, 17.141f, 14.95f, 16.0f)
                horizontalLineTo(13.915f)
                curveTo(13.709f, 16.583f, 13.153f, 17.0f, 12.5f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 17.0f, 3.0f, 15.657f, 3.0f, 14.0f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 6.847f, 3.418f, 6.291f, 4.0f, 6.085f)
                verticalLineTo(5.05f)
                curveTo(2.859f, 5.282f, 2.0f, 6.291f, 2.0f, 7.5f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 16.209f, 3.791f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(12.5f)
                close()
            }
        }
        .build()
        return _tabDesktopCopy!!
    }

@Suppress("ObjectPropertyName")
private var _tabDesktopCopy: ImageVector? = null

@Preview
@Composable
private fun TabDesktopCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabDesktopCopy, contentDescription = "TabDesktopCopy Icon")
    }
}

