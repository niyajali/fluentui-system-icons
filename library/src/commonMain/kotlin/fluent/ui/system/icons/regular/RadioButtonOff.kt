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
 * RadioButtonOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: radio, button, off
 * - Source: ic_fluent_radio_button_off_16_regular.svg
 * 
 * @return The [ImageVector] for the RadioButtonOff icon.
 */
public val FluentIcons.Regular.RadioButtonOff: ImageVector
    get() {
        if (_radioButtonOff != null) {
            return _radioButtonOff!!
        }
        _radioButtonOff = Builder(name = "RadioButtonOff", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.853f, 1.147f)
                lineTo(14.854f, 14.146f)
                curveTo(15.049f, 14.341f, 15.049f, 14.658f, 14.854f, 14.853f)
                curveTo(14.756f, 14.951f, 14.628f, 14.999f, 14.5f, 15.0f)
                curveTo(14.372f, 15.0f, 14.244f, 14.951f, 14.146f, 14.854f)
                lineTo(11.874f, 12.582f)
                curveTo(10.828f, 13.466f, 9.477f, 14.0f, 8.0f, 14.0f)
                curveTo(4.686f, 14.0f, 2.0f, 11.314f, 2.0f, 8.0f)
                curveTo(2.0f, 6.523f, 2.533f, 5.171f, 3.418f, 4.126f)
                lineTo(1.146f, 1.854f)
                curveTo(0.951f, 1.659f, 0.951f, 1.342f, 1.146f, 1.147f)
                curveTo(1.341f, 0.952f, 1.658f, 0.952f, 1.853f, 1.147f)
                close()
                moveTo(3.0f, 8.0f)
                curveTo(3.0f, 10.761f, 5.239f, 13.0f, 8.0f, 13.0f)
                lineTo(7.999f, 12.999f)
                curveTo(9.2f, 12.999f, 10.301f, 12.576f, 11.163f, 11.871f)
                lineTo(4.128f, 4.836f)
                curveTo(3.423f, 5.698f, 3.0f, 6.8f, 3.0f, 8.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(13.0f, 5.239f, 10.761f, 3.0f, 8.0f, 3.0f)
                lineTo(7.998f, 2.998f)
                curveTo(7.166f, 2.998f, 6.393f, 3.221f, 5.703f, 3.581f)
                lineTo(4.956f, 2.834f)
                curveTo(5.849f, 2.307f, 6.887f, 1.999f, 7.999f, 1.999f)
                curveTo(11.313f, 1.999f, 13.999f, 4.685f, 13.999f, 7.999f)
                curveTo(13.999f, 9.111f, 13.691f, 10.149f, 13.164f, 11.042f)
                lineTo(12.417f, 10.295f)
                curveTo(12.777f, 9.605f, 13.0f, 8.832f, 13.0f, 8.0f)
                close()
            }
        }
        .build()
        return _radioButtonOff!!
    }

@Suppress("ObjectPropertyName")
private var _radioButtonOff: ImageVector? = null

@Preview
@Composable
private fun RadioButtonOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.RadioButtonOff, contentDescription = null)
    }
}

