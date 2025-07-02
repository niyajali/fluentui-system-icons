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
 * TabGroup icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tab, group
 * - Source: ic_fluent_tab_group_24_regular.svg
 * 
 * @return The [ImageVector] for the TabGroup icon.
 */
public val FluentIcons.Regular.TabGroup: ImageVector
    get() {
        if (_tabGroup != null) {
            return _tabGroup!!
        }
        _tabGroup = Builder(name = "TabGroup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.75f)
                curveTo(2.0f, 6.231f, 3.231f, 5.0f, 4.75f, 5.0f)
                horizontalLineTo(17.25f)
                curveTo(18.769f, 5.0f, 20.0f, 6.231f, 20.0f, 7.75f)
                verticalLineTo(13.25f)
                curveTo(20.0f, 14.769f, 18.769f, 16.0f, 17.25f, 16.0f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 16.0f, 2.0f, 14.769f, 2.0f, 13.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(4.75f, 6.5f)
                curveTo(4.06f, 6.5f, 3.5f, 7.06f, 3.5f, 7.75f)
                verticalLineTo(13.25f)
                curveTo(3.5f, 13.94f, 4.06f, 14.5f, 4.75f, 14.5f)
                horizontalLineTo(17.25f)
                curveTo(17.94f, 14.5f, 18.5f, 13.94f, 18.5f, 13.25f)
                verticalLineTo(7.75f)
                curveTo(18.5f, 7.06f, 17.94f, 6.5f, 17.25f, 6.5f)
                horizontalLineTo(4.75f)
                close()
                moveTo(4.797f, 17.0f)
                curveTo(5.252f, 17.89f, 6.178f, 18.499f, 7.247f, 18.499f)
                horizontalLineTo(17.247f)
                curveTo(20.146f, 18.499f, 22.497f, 16.149f, 22.497f, 13.249f)
                verticalLineTo(10.249f)
                curveTo(22.497f, 9.182f, 21.889f, 8.257f, 21.0f, 7.801f)
                verticalLineTo(13.25f)
                curveTo(21.0f, 15.321f, 19.321f, 17.0f, 17.25f, 17.0f)
                horizontalLineTo(4.797f)
                close()
                moveTo(7.25f, 9.75f)
                curveTo(6.836f, 9.75f, 6.5f, 10.086f, 6.5f, 10.5f)
                curveTo(6.5f, 10.914f, 6.836f, 11.25f, 7.25f, 11.25f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 11.25f, 15.5f, 10.914f, 15.5f, 10.5f)
                curveTo(15.5f, 10.086f, 15.164f, 9.75f, 14.75f, 9.75f)
                horizontalLineTo(7.25f)
                close()
            }
        }
        .build()
        return _tabGroup!!
    }

@Suppress("ObjectPropertyName")
private var _tabGroup: ImageVector? = null

@Preview
@Composable
private fun TabGroupPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabGroup, contentDescription = null)
    }
}

