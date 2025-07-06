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
 * PlugConnectedCheckmark Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent connections - physical or with app add ins.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_plug_connected_checkmark_20_filled.svg)
 * 
 * @return The [ImageVector] for the PlugConnectedCheckmark icon.
 */
public val FluentIcons.Filled.PlugConnectedCheckmark: ImageVector
    get() {
        if (_plugConnectedCheckmark != null) {
            return _plugConnectedCheckmark!!
        }
        _plugConnectedCheckmark = Builder(name = "PlugConnectedCheckmark", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.78f, 3.28f)
                curveTo(18.073f, 2.987f, 18.073f, 2.513f, 17.78f, 2.22f)
                curveTo(17.487f, 1.927f, 17.013f, 1.927f, 16.72f, 2.22f)
                lineTo(14.274f, 4.665f)
                curveTo(12.703f, 3.591f, 10.541f, 3.752f, 9.146f, 5.146f)
                lineTo(8.846f, 5.446f)
                curveTo(8.264f, 6.028f, 8.264f, 6.972f, 8.846f, 7.554f)
                lineTo(11.311f, 10.018f)
                curveTo(12.21f, 9.377f, 13.311f, 9.0f, 14.5f, 9.0f)
                curveTo(14.97f, 9.0f, 15.427f, 9.059f, 15.863f, 9.17f)
                curveTo(16.209f, 8.021f, 16.033f, 6.749f, 15.335f, 5.726f)
                lineTo(17.78f, 3.28f)
                close()
                moveTo(7.554f, 8.846f)
                lineTo(10.018f, 11.311f)
                curveTo(9.377f, 12.21f, 9.0f, 13.311f, 9.0f, 14.5f)
                curveTo(9.0f, 14.97f, 9.059f, 15.427f, 9.17f, 15.863f)
                curveTo(8.022f, 16.21f, 6.749f, 16.034f, 5.726f, 15.335f)
                lineTo(3.28f, 17.78f)
                curveTo(2.987f, 18.073f, 2.513f, 18.073f, 2.22f, 17.78f)
                curveTo(1.927f, 17.487f, 1.927f, 17.013f, 2.22f, 16.72f)
                lineTo(4.666f, 14.274f)
                curveTo(3.592f, 12.703f, 3.752f, 10.541f, 5.147f, 9.146f)
                lineTo(5.447f, 8.846f)
                curveTo(6.029f, 8.265f, 6.972f, 8.265f, 7.554f, 8.846f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(16.854f, 12.646f)
                curveTo(16.658f, 12.451f, 16.342f, 12.451f, 16.146f, 12.646f)
                lineTo(13.5f, 15.293f)
                lineTo(12.854f, 14.646f)
                curveTo(12.658f, 14.451f, 12.342f, 14.451f, 12.146f, 14.646f)
                curveTo(11.951f, 14.842f, 11.951f, 15.158f, 12.146f, 15.354f)
                lineTo(13.146f, 16.354f)
                curveTo(13.342f, 16.549f, 13.658f, 16.549f, 13.854f, 16.354f)
                lineTo(16.854f, 13.354f)
                curveTo(17.049f, 13.158f, 17.049f, 12.842f, 16.854f, 12.646f)
                close()
            }
        }
        .build()
        return _plugConnectedCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _plugConnectedCheckmark: ImageVector? = null

@Preview
@Composable
private fun PlugConnectedCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PlugConnectedCheckmark, contentDescription = "PlugConnectedCheckmark Icon")
    }
}

