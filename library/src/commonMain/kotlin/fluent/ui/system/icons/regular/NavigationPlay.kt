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
 * NavigationPlay Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general bullet list UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_navigation_play_20_regular.svg)
 * 
 * @return The [ImageVector] for the NavigationPlay icon.
 */
public val FluentIcons.Regular.NavigationPlay: ImageVector
    get() {
        if (_navigationPlay != null) {
            return _navigationPlay!!
        }
        _navigationPlay = Builder(name = "NavigationPlay", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 5.0f)
                curveTo(2.224f, 5.0f, 2.0f, 5.224f, 2.0f, 5.5f)
                curveTo(2.0f, 5.776f, 2.224f, 6.0f, 2.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 6.0f, 18.0f, 5.776f, 18.0f, 5.5f)
                curveTo(18.0f, 5.224f, 17.776f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(2.5f)
                close()
                moveTo(2.5f, 10.0f)
                curveTo(2.224f, 10.0f, 2.0f, 10.224f, 2.0f, 10.5f)
                curveTo(2.0f, 10.776f, 2.224f, 11.0f, 2.5f, 11.0f)
                horizontalLineTo(11.257f)
                curveTo(11.571f, 10.621f, 11.934f, 10.284f, 12.337f, 10.0f)
                horizontalLineTo(2.5f)
                close()
                moveTo(10.207f, 16.0f)
                curveTo(10.116f, 15.678f, 10.053f, 15.343f, 10.022f, 15.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 15.0f, 2.0f, 15.224f, 2.0f, 15.5f)
                curveTo(2.0f, 15.776f, 2.224f, 16.0f, 2.5f, 16.0f)
                horizontalLineTo(10.207f)
                close()
                moveTo(20.0f, 14.5f)
                curveTo(20.0f, 16.985f, 17.985f, 19.0f, 15.5f, 19.0f)
                curveTo(13.015f, 19.0f, 11.0f, 16.985f, 11.0f, 14.5f)
                curveTo(11.0f, 12.015f, 13.015f, 10.0f, 15.5f, 10.0f)
                curveTo(17.985f, 10.0f, 20.0f, 12.015f, 20.0f, 14.5f)
                close()
                moveTo(17.713f, 14.063f)
                lineTo(14.743f, 12.413f)
                curveTo(14.41f, 12.227f, 14.0f, 12.469f, 14.0f, 12.85f)
                lineTo(14.0f, 16.15f)
                curveTo(14.0f, 16.531f, 14.41f, 16.772f, 14.743f, 16.587f)
                lineTo(17.713f, 14.937f)
                curveTo(18.056f, 14.747f, 18.056f, 14.253f, 17.713f, 14.063f)
                close()
            }
        }
        .build()
        return _navigationPlay!!
    }

@Suppress("ObjectPropertyName")
private var _navigationPlay: ImageVector? = null

@Preview
@Composable
private fun NavigationPlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.NavigationPlay, contentDescription = "NavigationPlay Icon")
    }
}

