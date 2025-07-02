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
 * Tabs icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tabs
 * - Source: ic_fluent_tabs_24_regular.svg
 * 
 * @return The [ImageVector] for the Tabs icon.
 */
public val FluentIcons.Regular.Tabs: ImageVector
    get() {
        if (_tabs != null) {
            return _tabs!!
        }
        _tabs = Builder(name = "Tabs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.25f)
                curveTo(2.0f, 5.246f, 5.246f, 2.0f, 9.25f, 2.0f)
                horizontalLineTo(12.75f)
                curveTo(14.102f, 2.0f, 15.261f, 2.826f, 15.751f, 4.0f)
                lineTo(13.975f, 4.0f)
                curveTo(13.659f, 3.691f, 13.227f, 3.5f, 12.75f, 3.5f)
                horizontalLineTo(9.25f)
                curveTo(6.074f, 3.5f, 3.5f, 6.074f, 3.5f, 9.25f)
                verticalLineTo(12.75f)
                curveTo(3.5f, 13.227f, 3.691f, 13.659f, 4.0f, 13.975f)
                verticalLineTo(15.75f)
                curveTo(2.826f, 15.26f, 2.0f, 14.102f, 2.0f, 12.75f)
                verticalLineTo(9.25f)
                close()
                moveTo(5.0f, 10.25f)
                curveTo(5.0f, 7.351f, 7.351f, 5.0f, 10.25f, 5.0f)
                horizontalLineTo(15.75f)
                curveTo(17.102f, 5.0f, 18.261f, 5.826f, 18.751f, 7.0f)
                lineTo(16.975f, 7.0f)
                curveTo(16.659f, 6.691f, 16.227f, 6.5f, 15.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(8.179f, 6.5f, 6.5f, 8.179f, 6.5f, 10.25f)
                verticalLineTo(15.75f)
                curveTo(6.5f, 16.227f, 6.691f, 16.659f, 7.0f, 16.975f)
                verticalLineTo(18.75f)
                curveTo(5.826f, 18.26f, 5.0f, 17.102f, 5.0f, 15.75f)
                verticalLineTo(10.25f)
                close()
                moveTo(11.25f, 8.0f)
                curveTo(9.455f, 8.0f, 8.0f, 9.455f, 8.0f, 11.25f)
                verticalLineTo(18.75f)
                curveTo(8.0f, 20.545f, 9.455f, 22.0f, 11.25f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 22.0f, 22.0f, 20.545f, 22.0f, 18.75f)
                verticalLineTo(11.25f)
                curveTo(22.0f, 9.455f, 20.545f, 8.0f, 18.75f, 8.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(9.5f, 11.25f)
                curveTo(9.5f, 10.283f, 10.283f, 9.5f, 11.25f, 9.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 9.5f, 20.5f, 10.283f, 20.5f, 11.25f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.716f, 19.716f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(11.25f)
                curveTo(10.283f, 20.5f, 9.5f, 19.716f, 9.5f, 18.75f)
                verticalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _tabs!!
    }

@Suppress("ObjectPropertyName")
private var _tabs: ImageVector? = null

@Preview
@Composable
private fun TabsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Tabs, contentDescription = null)
    }
}

