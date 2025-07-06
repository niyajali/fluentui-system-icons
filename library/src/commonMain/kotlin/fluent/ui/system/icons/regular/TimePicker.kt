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
 * TimePicker Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent time picker in mobile scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_time_picker_24_regular.svg)
 * 
 * @return The [ImageVector] for the TimePicker icon.
 */
public val FluentIcons.Regular.TimePicker: ImageVector
    get() {
        if (_timePicker != null) {
            return _timePicker!!
        }
        _timePicker = Builder(name = "TimePicker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.473f, 2.168f)
                curveTo(12.197f, 1.944f, 11.803f, 1.944f, 11.527f, 2.168f)
                lineTo(7.527f, 5.418f)
                curveTo(7.206f, 5.679f, 7.157f, 6.151f, 7.418f, 6.473f)
                curveTo(7.679f, 6.794f, 8.151f, 6.843f, 8.473f, 6.582f)
                lineTo(12.0f, 3.716f)
                lineTo(15.527f, 6.582f)
                curveTo(15.849f, 6.843f, 16.321f, 6.794f, 16.582f, 6.473f)
                curveTo(16.843f, 6.151f, 16.794f, 5.679f, 16.473f, 5.418f)
                lineTo(12.473f, 2.168f)
                close()
                moveTo(2.75f, 9.0f)
                curveTo(1.507f, 9.0f, 0.5f, 10.007f, 0.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(0.5f, 13.993f, 1.507f, 15.0f, 2.75f, 15.0f)
                curveTo(3.993f, 15.0f, 5.0f, 13.993f, 5.0f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(5.0f, 10.007f, 3.993f, 9.0f, 2.75f, 9.0f)
                close()
                moveTo(2.0f, 11.25f)
                curveTo(2.0f, 10.836f, 2.336f, 10.5f, 2.75f, 10.5f)
                curveTo(3.164f, 10.5f, 3.5f, 10.836f, 3.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(3.5f, 13.164f, 3.164f, 13.5f, 2.75f, 13.5f)
                curveTo(2.336f, 13.5f, 2.0f, 13.164f, 2.0f, 12.75f)
                verticalLineTo(11.25f)
                close()
                moveTo(8.25f, 9.0f)
                curveTo(7.007f, 9.0f, 6.0f, 10.007f, 6.0f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(6.0f, 13.993f, 7.007f, 15.0f, 8.25f, 15.0f)
                curveTo(9.493f, 15.0f, 10.5f, 13.993f, 10.5f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(10.5f, 10.007f, 9.493f, 9.0f, 8.25f, 9.0f)
                close()
                moveTo(7.5f, 11.25f)
                curveTo(7.5f, 10.836f, 7.836f, 10.5f, 8.25f, 10.5f)
                curveTo(8.664f, 10.5f, 9.0f, 10.836f, 9.0f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(9.0f, 13.164f, 8.664f, 13.5f, 8.25f, 13.5f)
                curveTo(7.836f, 13.5f, 7.5f, 13.164f, 7.5f, 12.75f)
                verticalLineTo(11.25f)
                close()
                moveTo(14.0f, 11.25f)
                curveTo(14.0f, 10.007f, 15.007f, 9.0f, 16.25f, 9.0f)
                curveTo(17.493f, 9.0f, 18.5f, 10.007f, 18.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(18.5f, 13.993f, 17.493f, 15.0f, 16.25f, 15.0f)
                curveTo(15.007f, 15.0f, 14.0f, 13.993f, 14.0f, 12.75f)
                verticalLineTo(11.25f)
                close()
                moveTo(16.25f, 10.5f)
                curveTo(15.836f, 10.5f, 15.5f, 10.836f, 15.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(15.5f, 13.164f, 15.836f, 13.5f, 16.25f, 13.5f)
                curveTo(16.664f, 13.5f, 17.0f, 13.164f, 17.0f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(17.0f, 10.836f, 16.664f, 10.5f, 16.25f, 10.5f)
                close()
                moveTo(21.75f, 9.0f)
                curveTo(20.507f, 9.0f, 19.5f, 10.007f, 19.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(19.5f, 13.993f, 20.507f, 15.0f, 21.75f, 15.0f)
                curveTo(22.993f, 15.0f, 24.0f, 13.993f, 24.0f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(24.0f, 10.007f, 22.993f, 9.0f, 21.75f, 9.0f)
                close()
                moveTo(21.0f, 11.25f)
                curveTo(21.0f, 10.836f, 21.336f, 10.5f, 21.75f, 10.5f)
                curveTo(22.164f, 10.5f, 22.5f, 10.836f, 22.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(22.5f, 13.164f, 22.164f, 13.5f, 21.75f, 13.5f)
                curveTo(21.336f, 13.5f, 21.0f, 13.164f, 21.0f, 12.75f)
                verticalLineTo(11.25f)
                close()
                moveTo(13.0f, 10.75f)
                curveTo(13.0f, 11.164f, 12.664f, 11.5f, 12.25f, 11.5f)
                curveTo(11.836f, 11.5f, 11.5f, 11.164f, 11.5f, 10.75f)
                curveTo(11.5f, 10.336f, 11.836f, 10.0f, 12.25f, 10.0f)
                curveTo(12.664f, 10.0f, 13.0f, 10.336f, 13.0f, 10.75f)
                close()
                moveTo(12.25f, 14.5f)
                curveTo(12.664f, 14.5f, 13.0f, 14.164f, 13.0f, 13.75f)
                curveTo(13.0f, 13.336f, 12.664f, 13.0f, 12.25f, 13.0f)
                curveTo(11.836f, 13.0f, 11.5f, 13.336f, 11.5f, 13.75f)
                curveTo(11.5f, 14.164f, 11.836f, 14.5f, 12.25f, 14.5f)
                close()
                moveTo(12.473f, 21.832f)
                lineTo(16.473f, 18.582f)
                curveTo(16.794f, 18.321f, 16.843f, 17.848f, 16.582f, 17.527f)
                curveTo(16.321f, 17.206f, 15.849f, 17.157f, 15.527f, 17.418f)
                lineTo(12.0f, 20.284f)
                lineTo(8.473f, 17.418f)
                curveTo(8.151f, 17.157f, 7.679f, 17.206f, 7.418f, 17.527f)
                curveTo(7.157f, 17.848f, 7.206f, 18.321f, 7.527f, 18.582f)
                lineTo(11.527f, 21.832f)
                curveTo(11.803f, 22.056f, 12.197f, 22.056f, 12.473f, 21.832f)
                close()
            }
        }
        .build()
        return _timePicker!!
    }

@Suppress("ObjectPropertyName")
private var _timePicker: ImageVector? = null

@Preview
@Composable
private fun TimePickerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TimePicker, contentDescription = "TimePicker Icon")
    }
}

