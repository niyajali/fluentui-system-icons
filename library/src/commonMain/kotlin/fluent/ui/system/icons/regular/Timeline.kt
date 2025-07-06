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
 * Timeline Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent timeline UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_timeline_24_regular.svg)
 * 
 * @return The [ImageVector] for the Timeline icon.
 */
public val FluentIcons.Regular.Timeline: ImageVector
    get() {
        if (_timeline != null) {
            return _timeline!!
        }
        _timeline = Builder(name = "Timeline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.25f, 13.0f)
                curveTo(16.217f, 13.0f, 17.0f, 13.783f, 17.0f, 14.75f)
                verticalLineTo(19.25f)
                curveTo(17.0f, 20.216f, 16.217f, 21.0f, 15.25f, 21.0f)
                horizontalLineTo(3.75f)
                curveTo(2.784f, 21.0f, 2.0f, 20.216f, 2.0f, 19.25f)
                verticalLineTo(14.75f)
                curveTo(2.0f, 13.783f, 2.784f, 13.0f, 3.75f, 13.0f)
                horizontalLineTo(15.25f)
                close()
                moveTo(21.001f, 14.899f)
                lineTo(21.0f, 20.25f)
                curveTo(21.0f, 20.664f, 20.665f, 21.0f, 20.25f, 21.0f)
                curveTo(19.871f, 21.0f, 19.557f, 20.718f, 19.507f, 20.352f)
                lineTo(19.5f, 20.25f)
                lineTo(19.5f, 14.912f)
                curveTo(19.732f, 14.969f, 19.975f, 15.0f, 20.226f, 15.0f)
                curveTo(20.494f, 15.0f, 20.753f, 14.965f, 21.001f, 14.899f)
                close()
                moveTo(15.25f, 14.5f)
                horizontalLineTo(3.75f)
                curveTo(3.612f, 14.5f, 3.5f, 14.612f, 3.5f, 14.75f)
                verticalLineTo(19.25f)
                curveTo(3.5f, 19.388f, 3.612f, 19.5f, 3.75f, 19.5f)
                horizontalLineTo(15.25f)
                curveTo(15.389f, 19.5f, 15.5f, 19.388f, 15.5f, 19.25f)
                verticalLineTo(14.75f)
                curveTo(15.5f, 14.612f, 15.389f, 14.5f, 15.25f, 14.5f)
                close()
                moveTo(20.25f, 10.092f)
                curveTo(21.304f, 10.092f, 22.158f, 10.946f, 22.158f, 12.0f)
                curveTo(22.158f, 13.054f, 21.304f, 13.908f, 20.25f, 13.908f)
                curveTo(19.197f, 13.908f, 18.342f, 13.054f, 18.342f, 12.0f)
                curveTo(18.342f, 10.946f, 19.197f, 10.092f, 20.25f, 10.092f)
                close()
                moveTo(15.246f, 3.0f)
                curveTo(16.213f, 3.0f, 16.996f, 3.783f, 16.996f, 4.75f)
                verticalLineTo(9.25f)
                curveTo(16.996f, 10.217f, 16.213f, 11.0f, 15.246f, 11.0f)
                horizontalLineTo(3.746f)
                curveTo(2.78f, 11.0f, 1.996f, 10.217f, 1.996f, 9.25f)
                verticalLineTo(4.75f)
                curveTo(1.996f, 3.832f, 2.703f, 3.079f, 3.603f, 3.006f)
                lineTo(3.746f, 3.0f)
                horizontalLineTo(15.246f)
                close()
                moveTo(15.246f, 4.5f)
                horizontalLineTo(3.746f)
                lineTo(3.689f, 4.507f)
                curveTo(3.578f, 4.533f, 3.496f, 4.632f, 3.496f, 4.75f)
                verticalLineTo(9.25f)
                curveTo(3.496f, 9.388f, 3.608f, 9.5f, 3.746f, 9.5f)
                horizontalLineTo(15.246f)
                curveTo(15.384f, 9.5f, 15.496f, 9.388f, 15.496f, 9.25f)
                verticalLineTo(4.75f)
                curveTo(15.496f, 4.612f, 15.384f, 4.5f, 15.246f, 4.5f)
                close()
                moveTo(20.25f, 3.0f)
                curveTo(20.63f, 3.0f, 20.944f, 3.282f, 20.994f, 3.648f)
                lineTo(21.0f, 3.75f)
                lineTo(21.001f, 9.101f)
                curveTo(20.753f, 9.035f, 20.494f, 9.0f, 20.226f, 9.0f)
                curveTo(19.975f, 9.0f, 19.732f, 9.031f, 19.5f, 9.088f)
                lineTo(19.5f, 3.75f)
                curveTo(19.5f, 3.336f, 19.836f, 3.0f, 20.25f, 3.0f)
                close()
            }
        }
        .build()
        return _timeline!!
    }

@Suppress("ObjectPropertyName")
private var _timeline: ImageVector? = null

@Preview
@Composable
private fun TimelinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Timeline, contentDescription = "Timeline Icon")
    }
}

