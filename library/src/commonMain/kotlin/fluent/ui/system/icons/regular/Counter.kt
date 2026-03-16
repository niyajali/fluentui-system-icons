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
 * Counter Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_counter_24_regular.svg)
 * 
 * @return The [ImageVector] for the Counter icon.
 */
public val FluentIcons.Regular.Counter: ImageVector
    get() {
        if (_counter != null) {
            return _counter!!
        }
        _counter = Builder(name = "Counter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 8.0f)
                curveTo(8.881f, 8.0f, 10.0f, 9.119f, 10.0f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(10.0f, 14.881f, 8.881f, 16.0f, 7.5f, 16.0f)
                curveTo(6.119f, 16.0f, 5.0f, 14.881f, 5.0f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 9.119f, 6.119f, 8.0f, 7.5f, 8.0f)
                close()
                moveTo(7.5f, 9.5f)
                curveTo(6.948f, 9.5f, 6.5f, 9.948f, 6.5f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(6.5f, 14.052f, 6.948f, 14.5f, 7.5f, 14.5f)
                curveTo(8.052f, 14.5f, 8.5f, 14.052f, 8.5f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(8.5f, 9.948f, 8.052f, 9.5f, 7.5f, 9.5f)
                close()
                moveTo(19.0f, 4.0f)
                curveTo(20.657f, 4.0f, 22.0f, 5.343f, 22.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 18.605f, 20.739f, 19.916f, 19.154f, 19.996f)
                lineTo(19.0f, 20.0f)
                horizontalLineTo(5.0f)
                lineTo(4.846f, 19.996f)
                curveTo(3.261f, 19.916f, 2.0f, 18.605f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.343f, 3.343f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(5.0f, 5.5f)
                curveTo(4.172f, 5.5f, 3.5f, 6.172f, 3.5f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(3.5f, 17.828f, 4.172f, 18.5f, 5.0f, 18.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(5.5f)
                horizontalLineTo(5.0f)
                close()
                moveTo(12.75f, 18.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.278f)
                curveTo(16.327f, 15.356f, 16.138f, 15.426f, 15.932f, 15.477f)
                curveTo(15.53f, 15.578f, 15.123f, 15.333f, 15.023f, 14.932f)
                curveTo(14.922f, 14.53f, 15.167f, 14.123f, 15.568f, 14.023f)
                curveTo(15.924f, 13.934f, 16.195f, 13.754f, 16.381f, 13.592f)
                curveTo(16.473f, 13.511f, 16.541f, 13.438f, 16.583f, 13.388f)
                curveTo(16.604f, 13.363f, 16.618f, 13.345f, 16.625f, 13.335f)
                lineTo(16.633f, 13.324f)
                curveTo(16.637f, 13.319f, 16.641f, 13.314f, 16.646f, 13.309f)
                curveTo(16.833f, 13.052f, 17.162f, 12.94f, 17.468f, 13.032f)
                curveTo(17.784f, 13.128f, 18.0f, 13.42f, 18.0f, 13.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(19.0f)
                curveTo(19.828f, 18.5f, 20.5f, 17.828f, 20.5f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(20.5f, 6.172f, 19.828f, 5.5f, 19.0f, 5.5f)
                verticalLineTo(7.5f)
                curveTo(19.0f, 8.881f, 17.881f, 10.0f, 16.5f, 10.0f)
                curveTo(15.119f, 10.0f, 14.0f, 8.881f, 14.0f, 7.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(18.5f)
                close()
                moveTo(15.5f, 7.5f)
                curveTo(15.5f, 8.052f, 15.948f, 8.5f, 16.5f, 8.5f)
                curveTo(17.052f, 8.5f, 17.5f, 8.052f, 17.5f, 7.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _counter!!
    }

@Suppress("ObjectPropertyName")
private var _counter: ImageVector? = null

@Preview
@Composable
private fun CounterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Counter, contentDescription = "Counter Icon")
    }
}

