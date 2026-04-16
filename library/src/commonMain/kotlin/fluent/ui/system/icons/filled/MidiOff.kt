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
 * MidiOff Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent off musical devices and in concert event scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_midi_off_24_filled.svg)
 * 
 * @return The [ImageVector] for the MidiOff icon.
 */
public val FluentIcons.Filled.MidiOff: ImageVector
    get() {
        if (_midiOff != null) {
            return _midiOff!!
        }
        _midiOff = Builder(name = "MidiOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.22f, 2.22f)
                curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
                lineTo(21.78f, 20.72f)
                curveTo(22.073f, 21.013f, 22.073f, 21.487f, 21.78f, 21.78f)
                curveTo(21.487f, 22.073f, 21.013f, 22.073f, 20.72f, 21.78f)
                lineTo(18.94f, 20.0f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.0f, 2.0f, 18.993f, 2.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.387f, 2.486f, 4.637f, 3.199f, 4.26f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
                close()
                moveTo(19.75f, 4.0f)
                curveTo(20.993f, 4.0f, 22.0f, 5.007f, 22.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 18.065f, 21.935f, 18.364f, 21.818f, 18.636f)
                lineTo(20.5f, 17.317f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.817f)
                lineTo(16.5f, 13.317f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.183f)
                lineTo(7.183f, 4.0f)
                horizontalLineTo(19.75f)
                close()
                moveTo(3.5f, 17.75f)
                curveTo(3.5f, 18.164f, 3.836f, 18.5f, 4.25f, 18.5f)
                horizontalLineTo(17.44f)
                lineTo(14.5f, 15.561f)
                verticalLineTo(16.25f)
                curveTo(14.5f, 16.664f, 14.164f, 17.0f, 13.75f, 17.0f)
                curveTo(13.336f, 17.0f, 13.0f, 16.664f, 13.0f, 16.25f)
                verticalLineTo(14.061f)
                lineTo(11.0f, 12.061f)
                verticalLineTo(16.25f)
                curveTo(11.0f, 16.664f, 10.664f, 17.0f, 10.25f, 17.0f)
                curveTo(9.836f, 17.0f, 9.5f, 16.664f, 9.5f, 16.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(16.25f)
                curveTo(7.5f, 16.664f, 7.164f, 17.0f, 6.75f, 17.0f)
                curveTo(6.336f, 17.0f, 6.0f, 16.664f, 6.0f, 16.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(17.75f)
                close()
                moveTo(5.5f, 7.0f)
                curveTo(4.948f, 7.0f, 4.5f, 7.448f, 4.5f, 8.0f)
                curveTo(4.5f, 8.552f, 4.948f, 9.0f, 5.5f, 9.0f)
                curveTo(6.052f, 9.0f, 6.5f, 8.552f, 6.5f, 8.0f)
                curveTo(6.5f, 7.448f, 6.052f, 7.0f, 5.5f, 7.0f)
                close()
                moveTo(14.75f, 7.0f)
                curveTo(14.336f, 7.0f, 14.0f, 7.336f, 14.0f, 7.75f)
                curveTo(14.0f, 8.164f, 14.336f, 8.5f, 14.75f, 8.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 8.5f, 18.0f, 8.164f, 18.0f, 7.75f)
                curveTo(18.0f, 7.336f, 17.664f, 7.0f, 17.25f, 7.0f)
                horizontalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _midiOff!!
    }

@Suppress("ObjectPropertyName")
private var _midiOff: ImageVector? = null

@Preview
@Composable
private fun MidiOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MidiOff, contentDescription = "MidiOff Icon")
    }
}

