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
 * VirtualNetwork Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent virtual network connections.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_virtual_network_20_filled.svg)
 * 
 * @return The [ImageVector] for the VirtualNetwork icon.
 */
public val FluentIcons.Filled.VirtualNetwork: ImageVector
    get() {
        if (_virtualNetwork != null) {
            return _virtualNetwork!!
        }
        _virtualNetwork = Builder(name = "VirtualNetwork", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.707f, 6.156f)
                curveTo(5.036f, 6.408f, 5.097f, 6.879f, 4.844f, 7.207f)
                lineTo(2.696f, 10.0f)
                lineTo(4.844f, 12.793f)
                curveTo(5.097f, 13.121f, 5.036f, 13.592f, 4.707f, 13.844f)
                curveTo(4.379f, 14.097f, 3.908f, 14.036f, 3.656f, 13.707f)
                lineTo(1.156f, 10.457f)
                curveTo(0.948f, 10.188f, 0.948f, 9.812f, 1.156f, 9.543f)
                lineTo(3.656f, 6.293f)
                curveTo(3.908f, 5.964f, 4.379f, 5.903f, 4.707f, 6.156f)
                close()
                moveTo(15.156f, 12.793f)
                curveTo(14.903f, 13.121f, 14.964f, 13.592f, 15.293f, 13.844f)
                curveTo(15.621f, 14.097f, 16.092f, 14.036f, 16.344f, 13.707f)
                lineTo(18.844f, 10.457f)
                curveTo(19.052f, 10.188f, 19.052f, 9.812f, 18.844f, 9.543f)
                lineTo(16.344f, 6.293f)
                curveTo(16.092f, 5.964f, 15.621f, 5.903f, 15.293f, 6.156f)
                curveTo(14.964f, 6.408f, 14.903f, 6.879f, 15.156f, 7.207f)
                lineTo(17.304f, 10.0f)
                lineTo(15.156f, 12.793f)
                close()
                moveTo(6.0f, 11.0f)
                curveTo(6.552f, 11.0f, 7.0f, 10.552f, 7.0f, 10.0f)
                curveTo(7.0f, 9.448f, 6.552f, 9.0f, 6.0f, 9.0f)
                curveTo(5.448f, 9.0f, 5.0f, 9.448f, 5.0f, 10.0f)
                curveTo(5.0f, 10.552f, 5.448f, 11.0f, 6.0f, 11.0f)
                close()
                moveTo(11.0f, 10.0f)
                curveTo(11.0f, 10.552f, 10.552f, 11.0f, 10.0f, 11.0f)
                curveTo(9.448f, 11.0f, 9.0f, 10.552f, 9.0f, 10.0f)
                curveTo(9.0f, 9.448f, 9.448f, 9.0f, 10.0f, 9.0f)
                curveTo(10.552f, 9.0f, 11.0f, 9.448f, 11.0f, 10.0f)
                close()
                moveTo(14.0f, 11.0f)
                curveTo(14.552f, 11.0f, 15.0f, 10.552f, 15.0f, 10.0f)
                curveTo(15.0f, 9.448f, 14.552f, 9.0f, 14.0f, 9.0f)
                curveTo(13.448f, 9.0f, 13.0f, 9.448f, 13.0f, 10.0f)
                curveTo(13.0f, 10.552f, 13.448f, 11.0f, 14.0f, 11.0f)
                close()
            }
        }
        .build()
        return _virtualNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _virtualNetwork: ImageVector? = null

@Preview
@Composable
private fun VirtualNetworkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VirtualNetwork, contentDescription = "VirtualNetwork Icon")
    }
}

