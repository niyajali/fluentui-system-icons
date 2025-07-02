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
 * Timer10 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: timer10
 * - Source: ic_fluent_timer_10_24_regular.svg
 * 
 * @return The [ImageVector] for the Timer10 icon.
 */
public val FluentIcons.Regular.Timer10: ImageVector
    get() {
        if (_timer10 != null) {
            return _timer10!!
        }
        _timer10 = Builder(name = "Timer10", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(16.199f, 5.0f, 19.686f, 8.044f, 20.376f, 12.046f)
                curveTo(20.172f, 12.016f, 19.963f, 12.0f, 19.75f, 12.0f)
                curveTo(19.444f, 12.0f, 19.146f, 12.032f, 18.859f, 12.094f)
                curveTo(18.208f, 8.902f, 15.384f, 6.5f, 12.0f, 6.5f)
                curveTo(8.134f, 6.5f, 5.0f, 9.634f, 5.0f, 13.5f)
                curveTo(5.0f, 17.366f, 8.134f, 20.5f, 12.0f, 20.5f)
                curveTo(12.168f, 20.5f, 12.335f, 20.494f, 12.5f, 20.482f)
                verticalLineTo(21.986f)
                curveTo(12.335f, 21.995f, 12.168f, 22.0f, 12.0f, 22.0f)
                curveTo(7.306f, 22.0f, 3.5f, 18.194f, 3.5f, 13.5f)
                curveTo(3.5f, 8.806f, 7.306f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.75f, 12.405f)
                verticalLineTo(8.75f)
                lineTo(12.743f, 8.648f)
                curveTo(12.693f, 8.282f, 12.38f, 8.0f, 12.0f, 8.0f)
                curveTo(11.586f, 8.0f, 11.25f, 8.336f, 11.25f, 8.75f)
                verticalLineTo(13.25f)
                lineTo(11.256f, 13.339f)
                curveTo(11.464f, 12.998f, 11.788f, 12.726f, 12.197f, 12.59f)
                lineTo(12.75f, 12.405f)
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
                moveTo(14.689f, 13.142f)
                curveTo(14.884f, 13.283f, 15.0f, 13.509f, 15.0f, 13.75f)
                verticalLineTo(22.25f)
                curveTo(15.0f, 22.664f, 14.664f, 23.0f, 14.25f, 23.0f)
                curveTo(13.836f, 23.0f, 13.5f, 22.664f, 13.5f, 22.25f)
                verticalLineTo(14.791f)
                lineTo(12.987f, 14.962f)
                curveTo(12.594f, 15.092f, 12.17f, 14.88f, 12.038f, 14.487f)
                curveTo(11.908f, 14.094f, 12.12f, 13.67f, 12.513f, 13.538f)
                lineTo(14.013f, 13.038f)
                curveTo(14.241f, 12.962f, 14.493f, 13.001f, 14.689f, 13.142f)
                close()
                moveTo(16.5f, 16.25f)
                curveTo(16.5f, 14.455f, 17.955f, 13.0f, 19.75f, 13.0f)
                curveTo(21.545f, 13.0f, 23.0f, 14.455f, 23.0f, 16.25f)
                verticalLineTo(19.75f)
                curveTo(23.0f, 21.545f, 21.545f, 23.0f, 19.75f, 23.0f)
                curveTo(17.955f, 23.0f, 16.5f, 21.545f, 16.5f, 19.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(19.75f, 14.5f)
                curveTo(18.784f, 14.5f, 18.0f, 15.283f, 18.0f, 16.25f)
                verticalLineTo(19.75f)
                curveTo(18.0f, 20.716f, 18.784f, 21.5f, 19.75f, 21.5f)
                curveTo(20.716f, 21.5f, 21.5f, 20.716f, 21.5f, 19.75f)
                verticalLineTo(16.25f)
                curveTo(21.5f, 15.283f, 20.716f, 14.5f, 19.75f, 14.5f)
                close()
            }
        }
        .build()
        return _timer10!!
    }

@Suppress("ObjectPropertyName")
private var _timer10: ImageVector? = null

@Preview
@Composable
private fun Timer10Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Timer10, contentDescription = null)
    }
}

