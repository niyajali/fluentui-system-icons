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
 * TabDesktopMultipleBottom Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, edge
 * - Description: Used in large screen browser tab scenarios. Contains option variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tab_desktop_multiple_bottom_24_regular.svg)
 * 
 * @return The [ImageVector] for the TabDesktopMultipleBottom icon.
 */
public val FluentIcons.Regular.TabDesktopMultipleBottom: ImageVector
    get() {
        if (_tabDesktopMultipleBottom != null) {
            return _tabDesktopMultipleBottom!!
        }
        _tabDesktopMultipleBottom = Builder(name = "TabDesktopMultipleBottom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.009f, 5.0f)
                horizontalLineTo(7.518f)
                curveTo(7.639f, 4.152f, 8.368f, 3.5f, 9.25f, 3.5f)
                horizontalLineTo(17.25f)
                curveTo(19.045f, 3.5f, 20.5f, 4.955f, 20.5f, 6.75f)
                verticalLineTo(14.75f)
                curveTo(20.5f, 15.632f, 19.848f, 16.361f, 19.0f, 16.482f)
                verticalLineTo(17.99f)
                curveTo(20.678f, 17.863f, 22.0f, 16.461f, 22.0f, 14.75f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 4.127f, 19.873f, 2.0f, 17.25f, 2.0f)
                horizontalLineTo(9.25f)
                curveTo(7.539f, 2.0f, 6.137f, 3.322f, 6.009f, 5.0f)
                close()
                moveTo(2.0f, 9.25f)
                curveTo(2.0f, 7.455f, 3.455f, 6.0f, 5.25f, 6.0f)
                horizontalLineTo(14.75f)
                curveTo(16.545f, 6.0f, 18.0f, 7.455f, 18.0f, 9.25f)
                verticalLineTo(18.75f)
                curveTo(18.0f, 20.545f, 16.545f, 22.0f, 14.75f, 22.0f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 22.0f, 2.0f, 20.545f, 2.0f, 18.75f)
                verticalLineTo(9.25f)
                close()
                moveTo(5.25f, 7.5f)
                curveTo(4.284f, 7.5f, 3.5f, 8.283f, 3.5f, 9.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(9.25f)
                curveTo(10.493f, 16.5f, 11.5f, 17.507f, 11.5f, 18.75f)
                verticalLineTo(20.5f)
                horizontalLineTo(14.75f)
                curveTo(15.717f, 20.5f, 16.5f, 19.716f, 16.5f, 18.75f)
                verticalLineTo(9.25f)
                curveTo(16.5f, 8.283f, 15.717f, 7.5f, 14.75f, 7.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(10.0f, 20.5f)
                verticalLineTo(18.75f)
                curveTo(10.0f, 18.336f, 9.664f, 18.0f, 9.25f, 18.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(18.75f)
                curveTo(3.5f, 19.716f, 4.284f, 20.5f, 5.25f, 20.5f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _tabDesktopMultipleBottom!!
    }

@Suppress("ObjectPropertyName")
private var _tabDesktopMultipleBottom: ImageVector? = null

@Preview
@Composable
private fun TabDesktopMultipleBottomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabDesktopMultipleBottom, contentDescription = "TabDesktopMultipleBottom Icon")
    }
}

