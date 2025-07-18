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
 * BeakerOff Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent free of harmful chemicals.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_beaker_off_20_filled.svg)
 * 
 * @return The [ImageVector] for the BeakerOff icon.
 */
public val FluentIcons.Filled.BeakerOff: ImageVector
    get() {
        if (_beakerOff != null) {
            return _beakerOff!!
        }
        _beakerOff = Builder(name = "BeakerOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.854f, 2.146f)
                curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
                curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
                lineTo(6.994f, 7.702f)
                verticalLineTo(8.687f)
                curveTo(6.994f, 9.266f, 6.851f, 9.836f, 6.576f, 10.347f)
                lineTo(5.685f, 12.0f)
                horizontalLineTo(11.293f)
                lineTo(12.293f, 13.0f)
                horizontalLineTo(5.146f)
                lineTo(4.182f, 14.79f)
                curveTo(3.643f, 15.789f, 4.366f, 17.002f, 5.502f, 17.002f)
                horizontalLineTo(14.498f)
                curveTo(15.005f, 17.002f, 15.43f, 16.76f, 15.697f, 16.404f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(2.854f, 2.146f)
                close()
                moveTo(6.994f, 4.873f)
                lineTo(14.121f, 12.0f)
                horizontalLineTo(14.316f)
                lineTo(13.423f, 10.344f)
                curveTo(13.148f, 9.834f, 13.004f, 9.263f, 13.004f, 8.684f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                curveTo(14.276f, 4.0f, 14.5f, 3.776f, 14.5f, 3.5f)
                curveTo(14.5f, 3.224f, 14.276f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.761f, 3.0f, 5.562f, 3.167f, 5.512f, 3.391f)
                lineTo(6.121f, 4.0f)
                horizontalLineTo(6.994f)
                verticalLineTo(4.873f)
                close()
            }
        }
        .build()
        return _beakerOff!!
    }

@Suppress("ObjectPropertyName")
private var _beakerOff: ImageVector? = null

@Preview
@Composable
private fun BeakerOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BeakerOff, contentDescription = "BeakerOff Icon")
    }
}

