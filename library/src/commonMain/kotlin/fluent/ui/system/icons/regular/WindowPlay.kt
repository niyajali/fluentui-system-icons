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
 * WindowPlay Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_play_20_regular.svg)
 * 
 * @return The [ImageVector] for the WindowPlay icon.
 */
public val FluentIcons.Regular.WindowPlay: ImageVector
    get() {
        if (_windowPlay != null) {
            return _windowPlay!!
        }
        _windowPlay = Builder(name = "WindowPlay", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 5.5f)
                curveTo(17.0f, 4.119f, 15.881f, 3.0f, 14.5f, 3.0f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 3.0f, 3.0f, 4.119f, 3.0f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 15.881f, 4.119f, 17.0f, 5.5f, 17.0f)
                horizontalLineTo(9.6f)
                curveTo(9.438f, 16.683f, 9.306f, 16.349f, 9.207f, 16.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 16.0f, 4.0f, 15.328f, 4.0f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.207f)
                curveTo(16.349f, 9.306f, 16.683f, 9.438f, 17.0f, 9.6f)
                verticalLineTo(5.5f)
                close()
                moveTo(5.5f, 4.0f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 4.0f, 16.0f, 4.672f, 16.0f, 5.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.5f)
                curveTo(4.0f, 4.672f, 4.672f, 4.0f, 5.5f, 4.0f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(16.713f, 14.063f)
                lineTo(13.743f, 12.413f)
                curveTo(13.41f, 12.227f, 13.0f, 12.469f, 13.0f, 12.85f)
                lineTo(13.0f, 16.15f)
                curveTo(13.0f, 16.531f, 13.41f, 16.772f, 13.743f, 16.587f)
                lineTo(16.713f, 14.937f)
                curveTo(17.056f, 14.747f, 17.056f, 14.253f, 16.713f, 14.063f)
                close()
            }
        }
        .build()
        return _windowPlay!!
    }

@Suppress("ObjectPropertyName")
private var _windowPlay: ImageVector? = null

@Preview
@Composable
private fun WindowPlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowPlay, contentDescription = "WindowPlay Icon")
    }
}

