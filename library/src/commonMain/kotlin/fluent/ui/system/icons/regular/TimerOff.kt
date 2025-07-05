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
 * TimerOff Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general time tracking scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_timer_off_24_regular.svg)
 * 
 * @return The [ImageVector] for the TimerOff icon.
 */
public val FluentIcons.Regular.TimerOff: ImageVector
    get() {
        if (_timerOff != null) {
            return _timerOff!!
        }
        _timerOff = Builder(name = "TimerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(6.213f, 7.274f)
                curveTo(4.544f, 8.826f, 3.5f, 11.041f, 3.5f, 13.5f)
                curveTo(3.5f, 18.194f, 7.306f, 22.0f, 12.0f, 22.0f)
                curveTo(14.459f, 22.0f, 16.674f, 20.956f, 18.226f, 19.287f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(17.164f, 18.225f)
                curveTo(15.885f, 19.623f, 14.045f, 20.5f, 12.0f, 20.5f)
                curveTo(8.134f, 20.5f, 5.0f, 17.366f, 5.0f, 13.5f)
                curveTo(5.0f, 11.455f, 5.877f, 9.615f, 7.275f, 8.335f)
                lineTo(11.25f, 12.311f)
                verticalLineTo(13.25f)
                lineTo(11.257f, 13.352f)
                curveTo(11.307f, 13.718f, 11.62f, 14.0f, 12.0f, 14.0f)
                curveTo(12.255f, 14.0f, 12.481f, 13.872f, 12.616f, 13.677f)
                lineTo(17.164f, 18.225f)
                close()
                moveTo(11.437f, 8.255f)
                lineTo(12.75f, 9.568f)
                verticalLineTo(8.75f)
                lineTo(12.743f, 8.648f)
                curveTo(12.693f, 8.282f, 12.38f, 8.0f, 12.0f, 8.0f)
                curveTo(11.776f, 8.0f, 11.574f, 8.099f, 11.437f, 8.255f)
                close()
                moveTo(19.0f, 13.5f)
                curveTo(19.0f, 14.203f, 18.896f, 14.882f, 18.704f, 15.522f)
                lineTo(19.878f, 16.697f)
                curveTo(20.279f, 15.71f, 20.5f, 14.631f, 20.5f, 13.5f)
                curveTo(20.5f, 8.806f, 16.694f, 5.0f, 12.0f, 5.0f)
                curveTo(10.869f, 5.0f, 9.79f, 5.221f, 8.803f, 5.622f)
                lineTo(9.978f, 6.796f)
                curveTo(10.618f, 6.604f, 11.297f, 6.5f, 12.0f, 6.5f)
                curveTo(15.866f, 6.5f, 19.0f, 9.634f, 19.0f, 13.5f)
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
                curveTo(9.0f, 2.87f, 9.282f, 2.556f, 9.648f, 2.507f)
                lineTo(9.75f, 2.5f)
                horizontalLineTo(14.25f)
                close()
            }
        }
        .build()
        return _timerOff!!
    }

@Suppress("ObjectPropertyName")
private var _timerOff: ImageVector? = null

@Preview
@Composable
private fun TimerOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TimerOff, contentDescription = "TimerOff Icon")
    }
}

