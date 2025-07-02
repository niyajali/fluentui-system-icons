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
 * PlugConnectedAdd icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: plug, connected, add
 * - Source: ic_fluent_plug_connected_add_20_filled.svg
 * 
 * @return The [ImageVector] for the PlugConnectedAdd icon.
 */
public val FluentIcons.Filled.PlugConnectedAdd: ImageVector
    get() {
        if (_plugConnectedAdd != null) {
            return _plugConnectedAdd!!
        }
        _plugConnectedAdd = Builder(name = "PlugConnectedAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
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
                moveTo(17.0f, 18.242f)
                curveTo(16.26f, 18.736f, 15.39f, 19.0f, 14.5f, 19.0f)
                curveTo(13.307f, 19.0f, 12.162f, 18.526f, 11.318f, 17.682f)
                curveTo(10.474f, 16.838f, 10.0f, 15.693f, 10.0f, 14.5f)
                curveTo(10.0f, 13.61f, 10.264f, 12.74f, 10.758f, 12.0f)
                curveTo(11.253f, 11.26f, 11.956f, 10.683f, 12.778f, 10.342f)
                curveTo(13.6f, 10.002f, 14.505f, 9.913f, 15.378f, 10.087f)
                curveTo(16.251f, 10.26f, 17.053f, 10.689f, 17.682f, 11.318f)
                curveTo(18.311f, 11.947f, 18.74f, 12.749f, 18.913f, 13.622f)
                curveTo(19.087f, 14.495f, 18.998f, 15.4f, 18.657f, 16.222f)
                curveTo(18.317f, 17.044f, 17.74f, 17.747f, 17.0f, 18.242f)
                close()
                moveTo(14.854f, 12.146f)
                curveTo(14.76f, 12.053f, 14.633f, 12.0f, 14.5f, 12.0f)
                curveTo(14.367f, 12.0f, 14.24f, 12.053f, 14.146f, 12.146f)
                curveTo(14.053f, 12.24f, 14.0f, 12.367f, 14.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.367f, 14.0f, 12.24f, 14.053f, 12.146f, 14.146f)
                curveTo(12.053f, 14.24f, 12.0f, 14.367f, 12.0f, 14.5f)
                curveTo(12.0f, 14.633f, 12.053f, 14.76f, 12.146f, 14.854f)
                curveTo(12.24f, 14.947f, 12.367f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.5f)
                curveTo(14.0f, 16.633f, 14.053f, 16.76f, 14.146f, 16.854f)
                curveTo(14.24f, 16.947f, 14.367f, 17.0f, 14.5f, 17.0f)
                curveTo(14.633f, 17.0f, 14.76f, 16.947f, 14.854f, 16.854f)
                curveTo(14.947f, 16.76f, 15.0f, 16.633f, 15.0f, 16.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.5f)
                curveTo(16.633f, 15.0f, 16.76f, 14.947f, 16.854f, 14.854f)
                curveTo(16.947f, 14.76f, 17.0f, 14.633f, 17.0f, 14.5f)
                curveTo(17.0f, 14.367f, 16.947f, 14.24f, 16.854f, 14.146f)
                curveTo(16.76f, 14.053f, 16.633f, 14.0f, 16.5f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 12.367f, 14.947f, 12.24f, 14.854f, 12.146f)
                close()
            }
        }
        .build()
        return _plugConnectedAdd!!
    }

@Suppress("ObjectPropertyName")
private var _plugConnectedAdd: ImageVector? = null

@Preview
@Composable
private fun PlugConnectedAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PlugConnectedAdd, contentDescription = null)
    }
}

