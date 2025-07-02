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

package fluent.ui.system.icons.filled

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
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: radio, button, off
 * - Source: ic_fluent_radio_button_off_16_filled.svg
 * 
 * @return The [ImageVector] for the RadioButtonOff icon.
 */
public val FluentIcons.Filled.RadioButtonOff: ImageVector
    get() {
        if (_radioButtonOff != null) {
            return _radioButtonOff!!
        }
        _radioButtonOff = Builder(name = "RadioButtonOff", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.146f, 14.854f)
                curveTo(14.244f, 14.951f, 14.372f, 15.0f, 14.5f, 15.0f)
                verticalLineTo(14.999f)
                curveTo(14.628f, 14.999f, 14.756f, 14.951f, 14.854f, 14.853f)
                curveTo(15.049f, 14.658f, 15.049f, 14.341f, 14.854f, 14.146f)
                lineTo(1.853f, 1.147f)
                curveTo(1.658f, 0.952f, 1.341f, 0.952f, 1.146f, 1.147f)
                curveTo(0.951f, 1.342f, 0.951f, 1.659f, 1.146f, 1.854f)
                lineTo(3.425f, 4.133f)
                curveTo(2.529f, 5.172f, 2.0f, 6.523f, 2.0f, 8.0f)
                curveTo(2.0f, 11.31f, 4.69f, 14.0f, 8.0f, 14.0f)
                curveTo(9.477f, 14.0f, 10.828f, 13.471f, 11.868f, 12.575f)
                lineTo(14.146f, 14.854f)
                close()
                moveTo(11.164f, 11.872f)
                curveTo(10.298f, 12.58f, 9.197f, 13.0f, 8.0f, 13.0f)
                curveTo(5.24f, 13.0f, 3.0f, 10.76f, 3.0f, 8.0f)
                curveTo(3.0f, 6.803f, 3.42f, 5.702f, 4.129f, 4.837f)
                lineTo(5.557f, 6.264f)
                curveTo(5.204f, 6.754f, 5.0f, 7.354f, 5.0f, 8.0f)
                curveTo(5.0f, 9.66f, 6.34f, 11.0f, 8.0f, 11.0f)
                curveTo(8.647f, 11.0f, 9.246f, 10.796f, 9.736f, 10.444f)
                lineTo(11.164f, 11.872f)
                close()
                moveTo(4.95f, 2.83f)
                curveTo(5.84f, 2.3f, 6.88f, 2.0f, 8.0f, 2.0f)
                curveTo(11.311f, 2.0f, 14.0f, 4.69f, 14.0f, 8.0f)
                curveTo(14.0f, 9.12f, 13.7f, 10.16f, 13.17f, 11.05f)
                lineTo(12.431f, 10.31f)
                curveTo(12.8f, 9.62f, 13.0f, 8.83f, 13.0f, 8.0f)
                curveTo(13.0f, 5.24f, 10.76f, 3.0f, 8.0f, 3.0f)
                curveTo(7.17f, 3.0f, 6.38f, 3.2f, 5.69f, 3.57f)
                lineTo(4.95f, 2.83f)
                close()
                moveTo(10.891f, 8.77f)
                curveTo(10.96f, 8.53f, 11.0f, 8.27f, 11.0f, 8.0f)
                curveTo(11.0f, 6.34f, 9.66f, 5.0f, 8.0f, 5.0f)
                curveTo(7.73f, 5.0f, 7.47f, 5.04f, 7.23f, 5.11f)
                lineTo(10.891f, 8.77f)
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
        Image(imageVector = FluentIcons.Filled.RadioButtonOff, contentDescription = null)
    }
}

