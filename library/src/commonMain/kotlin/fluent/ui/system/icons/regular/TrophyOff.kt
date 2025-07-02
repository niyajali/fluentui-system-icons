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
 * TrophyOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: trophy, off
 * - Source: ic_fluent_trophy_off_24_regular.svg
 * 
 * @return The [ImageVector] for the TrophyOff icon.
 */
public val FluentIcons.Regular.TrophyOff: ImageVector
    get() {
        if (_trophyOff != null) {
            return _trophyOff!!
        }
        _trophyOff = Builder(name = "TrophyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.481f, 4.541f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
                curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
                lineTo(21.78f, 20.72f)
                curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
                curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
                lineTo(14.33f, 15.391f)
                curveTo(13.767f, 15.674f, 13.151f, 15.867f, 12.501f, 15.952f)
                lineTo(12.5f, 17.5f)
                horizontalLineTo(14.254f)
                curveTo(15.987f, 17.5f, 17.403f, 18.857f, 17.498f, 20.566f)
                lineTo(17.504f, 20.75f)
                verticalLineTo(21.25f)
                curveTo(17.504f, 21.63f, 17.221f, 21.944f, 16.855f, 21.993f)
                lineTo(16.754f, 22.0f)
                horizontalLineTo(6.751f)
                curveTo(6.371f, 22.0f, 6.057f, 21.718f, 6.007f, 21.352f)
                lineTo(6.001f, 21.25f)
                verticalLineTo(20.75f)
                curveTo(6.001f, 19.017f, 7.357f, 17.601f, 9.066f, 17.505f)
                lineTo(9.251f, 17.5f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 15.951f)
                curveTo(8.769f, 15.66f, 6.94f, 14.09f, 6.272f, 12.001f)
                lineTo(6.246f, 12.0f)
                curveTo(4.451f, 12.0f, 2.996f, 10.545f, 2.996f, 8.75f)
                verticalLineTo(5.75f)
                curveTo(2.996f, 5.281f, 3.18f, 4.855f, 3.481f, 4.541f)
                close()
                moveTo(13.19f, 14.251f)
                lineTo(7.501f, 8.561f)
                verticalLineTo(10.248f)
                curveTo(7.501f, 12.597f, 9.404f, 14.5f, 11.752f, 14.5f)
                curveTo(12.257f, 14.5f, 12.741f, 14.412f, 13.19f, 14.251f)
                close()
                moveTo(6.001f, 7.061f)
                lineTo(4.543f, 5.604f)
                curveTo(4.514f, 5.645f, 4.496f, 5.695f, 4.496f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(4.496f, 9.633f, 5.15f, 10.363f, 6.001f, 10.483f)
                verticalLineTo(7.061f)
                close()
                moveTo(16.004f, 10.248f)
                curveTo(16.004f, 10.991f, 15.813f, 11.689f, 15.479f, 12.297f)
                lineTo(16.571f, 13.389f)
                curveTo(16.85f, 12.962f, 17.073f, 12.496f, 17.232f, 12.001f)
                lineTo(17.442f, 11.995f)
                curveTo(19.151f, 11.899f, 20.508f, 10.483f, 20.508f, 8.75f)
                verticalLineTo(5.75f)
                lineTo(20.502f, 5.606f)
                curveTo(20.429f, 4.707f, 19.676f, 4.0f, 18.758f, 4.0f)
                lineTo(17.49f, 4.0f)
                curveTo(17.366f, 2.875f, 16.412f, 2.0f, 15.254f, 2.0f)
                horizontalLineTo(8.251f)
                curveTo(7.419f, 2.0f, 6.693f, 2.451f, 6.304f, 3.122f)
                lineTo(7.501f, 4.319f)
                verticalLineTo(4.25f)
                curveTo(7.501f, 3.836f, 7.836f, 3.5f, 8.251f, 3.5f)
                horizontalLineTo(15.254f)
                curveTo(15.668f, 3.5f, 16.004f, 3.836f, 16.004f, 4.25f)
                verticalLineTo(10.248f)
                close()
                moveTo(9.251f, 19.0f)
                curveTo(8.421f, 19.0f, 7.726f, 19.577f, 7.546f, 20.353f)
                lineTo(7.518f, 20.5f)
                horizontalLineTo(15.986f)
                curveTo(15.872f, 19.702f, 15.219f, 19.077f, 14.408f, 19.007f)
                lineTo(14.254f, 19.0f)
                horizontalLineTo(9.251f)
                close()
                moveTo(18.758f, 5.5f)
                lineTo(18.815f, 5.507f)
                curveTo(18.925f, 5.533f, 19.008f, 5.632f, 19.008f, 5.75f)
                verticalLineTo(8.75f)
                lineTo(19.001f, 8.904f)
                curveTo(18.93f, 9.717f, 18.304f, 10.37f, 17.504f, 10.483f)
                verticalLineTo(5.5f)
                horizontalLineTo(18.758f)
                close()
            }
        }
        .build()
        return _trophyOff!!
    }

@Suppress("ObjectPropertyName")
private var _trophyOff: ImageVector? = null

@Preview
@Composable
private fun TrophyOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TrophyOff, contentDescription = null)
    }
}

