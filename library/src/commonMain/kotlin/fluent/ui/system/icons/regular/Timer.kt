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
 * Timer Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general time tracking scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_timer_24_regular.svg)
 * 
 * @return The [ImageVector] for the Timer icon.
 */
public val FluentIcons.Regular.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(16.694f, 5.0f, 20.5f, 8.806f, 20.5f, 13.5f)
                curveTo(20.5f, 18.194f, 16.694f, 22.0f, 12.0f, 22.0f)
                curveTo(7.306f, 22.0f, 3.5f, 18.194f, 3.5f, 13.5f)
                curveTo(3.5f, 8.806f, 7.306f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 6.5f)
                curveTo(8.134f, 6.5f, 5.0f, 9.634f, 5.0f, 13.5f)
                curveTo(5.0f, 17.366f, 8.134f, 20.5f, 12.0f, 20.5f)
                curveTo(15.866f, 20.5f, 19.0f, 17.366f, 19.0f, 13.5f)
                curveTo(19.0f, 9.634f, 15.866f, 6.5f, 12.0f, 6.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.38f, 8.0f, 12.693f, 8.282f, 12.743f, 8.648f)
                lineTo(12.75f, 8.75f)
                verticalLineTo(13.25f)
                curveTo(12.75f, 13.664f, 12.414f, 14.0f, 12.0f, 14.0f)
                curveTo(11.62f, 14.0f, 11.307f, 13.718f, 11.257f, 13.352f)
                lineTo(11.25f, 13.25f)
                verticalLineTo(8.75f)
                curveTo(11.25f, 8.336f, 11.586f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(19.147f, 5.114f)
                lineTo(19.23f, 5.174f)
                lineTo(20.388f, 6.138f)
                curveTo(20.707f, 6.403f, 20.75f, 6.876f, 20.485f, 7.194f)
                curveTo(20.242f, 7.486f, 19.824f, 7.546f, 19.511f, 7.35f)
                lineTo(19.429f, 7.291f)
                lineTo(18.27f, 6.326f)
                curveTo(17.952f, 6.061f, 17.909f, 5.589f, 18.174f, 5.27f)
                curveTo(18.417f, 4.978f, 18.834f, 4.918f, 19.147f, 5.114f)
                close()
                moveTo(14.25f, 2.5f)
                curveTo(14.664f, 2.5f, 15.0f, 2.836f, 15.0f, 3.25f)
                curveTo(15.0f, 3.63f, 14.718f, 3.943f, 14.352f, 3.993f)
                lineTo(14.25f, 4.0f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 4.0f, 9.0f, 3.664f, 9.0f, 3.25f)
                curveTo(9.0f, 2.87f, 9.282f, 2.557f, 9.648f, 2.507f)
                lineTo(9.75f, 2.5f)
                horizontalLineTo(14.25f)
                close()
            }
        }
        .build()
        return _timer!!
    }

@Suppress("ObjectPropertyName")
private var _timer: ImageVector? = null

@Preview
@Composable
private fun TimerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Timer, contentDescription = "Timer Icon")
    }
}

