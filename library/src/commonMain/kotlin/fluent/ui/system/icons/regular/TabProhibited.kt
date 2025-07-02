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
 * TabProhibited icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tab, prohibited
 * - Source: ic_fluent_tab_prohibited_24_regular.svg
 * 
 * @return The [ImageVector] for the TabProhibited icon.
 */
public val FluentIcons.Regular.TabProhibited: ImageVector
    get() {
        if (_tabProhibited != null) {
            return _tabProhibited!!
        }
        _tabProhibited = Builder(name = "TabProhibited", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.75f, 3.0f)
                curveTo(4.231f, 3.0f, 3.0f, 4.231f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.0f, 19.769f, 4.231f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(12.022f)
                curveTo(11.725f, 20.537f, 11.486f, 20.034f, 11.314f, 19.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 19.5f, 4.5f, 18.94f, 4.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(4.5f, 5.06f, 5.06f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(18.25f)
                curveTo(18.94f, 4.5f, 19.5f, 5.06f, 19.5f, 5.75f)
                verticalLineTo(11.314f)
                curveTo(20.034f, 11.486f, 20.537f, 11.725f, 21.0f, 12.022f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 4.231f, 19.769f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(17.5f, 23.0f)
                curveTo(20.538f, 23.0f, 23.0f, 20.538f, 23.0f, 17.5f)
                curveTo(23.0f, 14.462f, 20.538f, 12.0f, 17.5f, 12.0f)
                curveTo(14.462f, 12.0f, 12.0f, 14.462f, 12.0f, 17.5f)
                curveTo(12.0f, 20.538f, 14.462f, 23.0f, 17.5f, 23.0f)
                close()
                moveTo(14.191f, 19.748f)
                curveTo(13.755f, 19.108f, 13.5f, 18.333f, 13.5f, 17.5f)
                curveTo(13.5f, 15.291f, 15.291f, 13.5f, 17.5f, 13.5f)
                curveTo(18.333f, 13.5f, 19.108f, 13.755f, 19.748f, 14.191f)
                lineTo(14.191f, 19.748f)
                close()
                moveTo(15.252f, 20.809f)
                lineTo(20.809f, 15.252f)
                curveTo(21.245f, 15.892f, 21.5f, 16.667f, 21.5f, 17.5f)
                curveTo(21.5f, 19.709f, 19.709f, 21.5f, 17.5f, 21.5f)
                curveTo(16.667f, 21.5f, 15.892f, 21.245f, 15.252f, 20.809f)
                close()
            }
        }
        .build()
        return _tabProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _tabProhibited: ImageVector? = null

@Preview
@Composable
private fun TabProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabProhibited, contentDescription = null)
    }
}

