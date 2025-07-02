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
 * VirtualNetwork icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: virtual, network
 * - Source: ic_fluent_virtual_network_20_regular.svg
 * 
 * @return The [ImageVector] for the VirtualNetwork icon.
 */
public val FluentIcons.Regular.VirtualNetwork: ImageVector
    get() {
        if (_virtualNetwork != null) {
            return _virtualNetwork!!
        }
        _virtualNetwork = Builder(name = "VirtualNetwork", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.825f, 6.12f)
                curveTo(5.035f, 6.3f, 5.059f, 6.616f, 4.88f, 6.825f)
                lineTo(2.159f, 10.0f)
                lineTo(4.88f, 13.175f)
                curveTo(5.059f, 13.384f, 5.035f, 13.7f, 4.825f, 13.88f)
                curveTo(4.616f, 14.059f, 4.3f, 14.035f, 4.12f, 13.825f)
                lineTo(1.12f, 10.325f)
                curveTo(0.96f, 10.138f, 0.96f, 9.862f, 1.12f, 9.675f)
                lineTo(4.12f, 6.175f)
                curveTo(4.3f, 5.965f, 4.616f, 5.941f, 4.825f, 6.12f)
                close()
                moveTo(15.12f, 13.175f)
                curveTo(14.941f, 13.384f, 14.965f, 13.7f, 15.175f, 13.88f)
                curveTo(15.384f, 14.059f, 15.7f, 14.035f, 15.88f, 13.825f)
                lineTo(18.88f, 10.325f)
                curveTo(19.04f, 10.138f, 19.04f, 9.862f, 18.88f, 9.675f)
                lineTo(15.88f, 6.175f)
                curveTo(15.7f, 5.965f, 15.384f, 5.941f, 15.175f, 6.12f)
                curveTo(14.965f, 6.3f, 14.941f, 6.616f, 15.12f, 6.825f)
                lineTo(17.841f, 10.0f)
                lineTo(15.12f, 13.175f)
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
        Image(imageVector = FluentIcons.Regular.VirtualNetwork, contentDescription = null)
    }
}

