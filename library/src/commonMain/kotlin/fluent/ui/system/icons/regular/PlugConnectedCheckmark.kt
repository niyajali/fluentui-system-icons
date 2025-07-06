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
 * PlugConnectedCheckmark Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent connections - physical or with app add ins.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_plug_connected_checkmark_20_regular.svg)
 * 
 * @return The [ImageVector] for the PlugConnectedCheckmark icon.
 */
public val FluentIcons.Regular.PlugConnectedCheckmark: ImageVector
    get() {
        if (_plugConnectedCheckmark != null) {
            return _plugConnectedCheckmark!!
        }
        _plugConnectedCheckmark = Builder(name = "PlugConnectedCheckmark", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.854f, 2.854f)
                curveTo(18.049f, 2.658f, 18.049f, 2.342f, 17.854f, 2.146f)
                curveTo(17.658f, 1.951f, 17.342f, 1.951f, 17.146f, 2.146f)
                lineTo(14.478f, 4.815f)
                curveTo(12.895f, 3.58f, 10.602f, 3.69f, 9.146f, 5.146f)
                lineTo(8.846f, 5.446f)
                curveTo(8.264f, 6.028f, 8.264f, 6.972f, 8.846f, 7.554f)
                lineTo(11.311f, 10.018f)
                curveTo(11.591f, 9.819f, 11.891f, 9.645f, 12.206f, 9.5f)
                lineTo(9.553f, 6.846f)
                curveTo(9.362f, 6.655f, 9.362f, 6.345f, 9.553f, 6.154f)
                lineTo(9.853f, 5.854f)
                curveTo(11.039f, 4.668f, 12.961f, 4.668f, 14.146f, 5.854f)
                curveTo(15.0f, 6.708f, 15.239f, 7.944f, 14.862f, 9.012f)
                curveTo(15.205f, 9.034f, 15.54f, 9.088f, 15.863f, 9.17f)
                curveTo(16.233f, 7.944f, 16.007f, 6.576f, 15.185f, 5.522f)
                lineTo(17.854f, 2.854f)
                close()
                moveTo(7.554f, 8.846f)
                lineTo(10.018f, 11.311f)
                curveTo(9.819f, 11.591f, 9.645f, 11.891f, 9.5f, 12.206f)
                lineTo(6.847f, 9.554f)
                curveTo(6.655f, 9.362f, 6.345f, 9.362f, 6.154f, 9.554f)
                lineTo(5.854f, 9.854f)
                curveTo(4.668f, 11.039f, 4.668f, 12.961f, 5.854f, 14.146f)
                curveTo(6.708f, 15.0f, 7.944f, 15.239f, 9.012f, 14.863f)
                curveTo(9.034f, 15.206f, 9.088f, 15.54f, 9.17f, 15.863f)
                curveTo(7.944f, 16.233f, 6.576f, 16.007f, 5.522f, 15.185f)
                lineTo(2.854f, 17.854f)
                curveTo(2.658f, 18.049f, 2.342f, 18.049f, 2.146f, 17.854f)
                curveTo(1.951f, 17.658f, 1.951f, 17.342f, 2.146f, 17.146f)
                lineTo(4.815f, 14.478f)
                curveTo(3.58f, 12.895f, 3.691f, 10.603f, 5.147f, 9.146f)
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
        Image(imageVector = FluentIcons.Regular.PlugConnectedCheckmark, contentDescription = "PlugConnectedCheckmark Icon")
    }
}

