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
 * Timer2 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: timer2
 * - Source: ic_fluent_timer_2_24_regular.svg
 * 
 * @return The [ImageVector] for the Timer2 icon.
 */
public val FluentIcons.Regular.Timer2: ImageVector
    get() {
        if (_timer2 != null) {
            return _timer2!!
        }
        _timer2 = Builder(name = "Timer2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.394f, 12.156f)
                curveTo(19.75f, 8.1f, 16.237f, 5.0f, 12.0f, 5.0f)
                curveTo(7.306f, 5.0f, 3.5f, 8.806f, 3.5f, 13.5f)
                curveTo(3.5f, 18.194f, 7.306f, 22.0f, 12.0f, 22.0f)
                curveTo(13.056f, 22.0f, 14.067f, 21.807f, 15.0f, 21.455f)
                verticalLineTo(21.25f)
                curveTo(15.0f, 20.693f, 15.107f, 20.161f, 15.302f, 19.674f)
                curveTo(14.318f, 20.201f, 13.194f, 20.5f, 12.0f, 20.5f)
                curveTo(8.134f, 20.5f, 5.0f, 17.366f, 5.0f, 13.5f)
                curveTo(5.0f, 9.634f, 8.134f, 6.5f, 12.0f, 6.5f)
                curveTo(15.358f, 6.5f, 18.164f, 8.864f, 18.843f, 12.019f)
                curveTo(18.977f, 12.007f, 19.113f, 12.0f, 19.25f, 12.0f)
                curveTo(19.646f, 12.0f, 20.03f, 12.054f, 20.394f, 12.156f)
                close()
                moveTo(12.743f, 8.648f)
                curveTo(12.693f, 8.282f, 12.38f, 8.0f, 12.0f, 8.0f)
                curveTo(11.586f, 8.0f, 11.25f, 8.336f, 11.25f, 8.75f)
                verticalLineTo(13.25f)
                lineTo(11.257f, 13.352f)
                curveTo(11.307f, 13.718f, 11.62f, 14.0f, 12.0f, 14.0f)
                curveTo(12.414f, 14.0f, 12.75f, 13.664f, 12.75f, 13.25f)
                verticalLineTo(8.75f)
                lineTo(12.743f, 8.648f)
                close()
                moveTo(19.23f, 5.174f)
                lineTo(19.147f, 5.114f)
                curveTo(18.834f, 4.918f, 18.417f, 4.978f, 18.174f, 5.27f)
                curveTo(17.909f, 5.589f, 17.952f, 6.061f, 18.27f, 6.326f)
                lineTo(19.429f, 7.291f)
                lineTo(19.511f, 7.35f)
                curveTo(19.824f, 7.546f, 20.242f, 7.486f, 20.485f, 7.194f)
                curveTo(20.75f, 6.876f, 20.707f, 6.403f, 20.388f, 6.138f)
                lineTo(19.23f, 5.174f)
                close()
                moveTo(15.0f, 3.25f)
                curveTo(15.0f, 2.836f, 14.664f, 2.5f, 14.25f, 2.5f)
                horizontalLineTo(9.75f)
                lineTo(9.648f, 2.507f)
                curveTo(9.282f, 2.557f, 9.0f, 2.87f, 9.0f, 3.25f)
                curveTo(9.0f, 3.664f, 9.336f, 4.0f, 9.75f, 4.0f)
                horizontalLineTo(14.25f)
                lineTo(14.352f, 3.993f)
                curveTo(14.718f, 3.943f, 15.0f, 3.63f, 15.0f, 3.25f)
                close()
                moveTo(19.25f, 13.0f)
                curveTo(17.455f, 13.0f, 16.0f, 14.455f, 16.0f, 16.25f)
                curveTo(16.0f, 16.664f, 16.336f, 17.0f, 16.75f, 17.0f)
                curveTo(17.164f, 17.0f, 17.5f, 16.664f, 17.5f, 16.25f)
                curveTo(17.5f, 15.283f, 18.284f, 14.5f, 19.25f, 14.5f)
                curveTo(20.216f, 14.5f, 21.0f, 15.283f, 21.0f, 16.25f)
                curveTo(21.0f, 17.216f, 20.216f, 18.0f, 19.25f, 18.0f)
                curveTo(17.455f, 18.0f, 16.0f, 19.455f, 16.0f, 21.25f)
                verticalLineTo(22.25f)
                curveTo(16.0f, 22.664f, 16.336f, 23.0f, 16.75f, 23.0f)
                horizontalLineTo(21.75f)
                curveTo(22.164f, 23.0f, 22.5f, 22.664f, 22.5f, 22.25f)
                curveTo(22.5f, 21.836f, 22.164f, 21.5f, 21.75f, 21.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(21.25f)
                curveTo(17.5f, 20.284f, 18.284f, 19.5f, 19.25f, 19.5f)
                curveTo(21.045f, 19.5f, 22.5f, 18.045f, 22.5f, 16.25f)
                curveTo(22.5f, 14.455f, 21.045f, 13.0f, 19.25f, 13.0f)
                close()
            }
        }
        .build()
        return _timer2!!
    }

@Suppress("ObjectPropertyName")
private var _timer2: ImageVector? = null

@Preview
@Composable
private fun Timer2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Timer2, contentDescription = null)
    }
}

