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
 * TabletLaptop Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent tablet and laptop scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tablet_laptop_24_regular.svg)
 * 
 * @return The [ImageVector] for the TabletLaptop icon.
 */
public val FluentIcons.Regular.TabletLaptop: ImageVector
    get() {
        if (_tabletLaptop != null) {
            return _tabletLaptop!!
        }
        _tabletLaptop = Builder(name = "TabletLaptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.249f, 16.5f)
                curveTo(21.664f, 16.5f, 21.999f, 16.836f, 21.999f, 17.25f)
                curveTo(21.999f, 17.629f, 21.717f, 17.943f, 21.351f, 17.993f)
                lineTo(21.249f, 18.0f)
                lineTo(16.5f, 18.0f)
                verticalLineTo(16.5f)
                lineTo(21.249f, 16.5f)
                close()
                moveTo(4.0f, 10.0f)
                horizontalLineTo(5.499f)
                lineTo(5.5f, 6.75f)
                curveTo(5.5f, 6.612f, 5.612f, 6.5f, 5.75f, 6.5f)
                horizontalLineTo(18.25f)
                curveTo(18.388f, 6.5f, 18.5f, 6.612f, 18.5f, 6.75f)
                verticalLineTo(14.251f)
                curveTo(18.5f, 14.389f, 18.388f, 14.501f, 18.25f, 14.501f)
                lineTo(16.5f, 14.501f)
                verticalLineTo(16.001f)
                lineTo(18.25f, 16.001f)
                curveTo(19.216f, 16.001f, 20.0f, 15.217f, 20.0f, 14.251f)
                verticalLineTo(6.75f)
                curveTo(20.0f, 5.784f, 19.216f, 5.0f, 18.25f, 5.0f)
                horizontalLineTo(5.75f)
                curveTo(4.784f, 5.0f, 4.0f, 5.784f, 4.0f, 6.75f)
                verticalLineTo(10.0f)
                close()
                moveTo(7.75f, 17.0f)
                curveTo(7.336f, 17.0f, 7.0f, 17.336f, 7.0f, 17.75f)
                curveTo(7.0f, 18.164f, 7.336f, 18.5f, 7.75f, 18.5f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 18.5f, 11.0f, 18.164f, 11.0f, 17.75f)
                curveTo(11.0f, 17.336f, 10.664f, 17.0f, 10.25f, 17.0f)
                horizontalLineTo(7.75f)
                close()
                moveTo(4.25f, 11.0f)
                curveTo(3.007f, 11.0f, 2.0f, 12.007f, 2.0f, 13.25f)
                verticalLineTo(18.75f)
                curveTo(2.0f, 19.993f, 3.007f, 21.0f, 4.25f, 21.0f)
                horizontalLineTo(13.25f)
                curveTo(14.493f, 21.0f, 15.5f, 19.993f, 15.5f, 18.75f)
                verticalLineTo(13.25f)
                curveTo(15.5f, 12.007f, 14.493f, 11.0f, 13.25f, 11.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(3.5f, 13.25f)
                curveTo(3.5f, 12.836f, 3.836f, 12.5f, 4.25f, 12.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 12.5f, 14.0f, 12.836f, 14.0f, 13.25f)
                verticalLineTo(18.75f)
                curveTo(14.0f, 19.164f, 13.664f, 19.5f, 13.25f, 19.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 19.5f, 3.5f, 19.164f, 3.5f, 18.75f)
                verticalLineTo(13.25f)
                close()
            }
        }
        .build()
        return _tabletLaptop!!
    }

@Suppress("ObjectPropertyName")
private var _tabletLaptop: ImageVector? = null

@Preview
@Composable
private fun TabletLaptopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabletLaptop, contentDescription = "TabletLaptop Icon")
    }
}

