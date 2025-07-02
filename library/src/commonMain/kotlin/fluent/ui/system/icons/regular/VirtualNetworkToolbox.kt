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
 * VirtualNetworkToolbox icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: virtual, network, toolbox
 * - Source: ic_fluent_virtual_network_toolbox_20_regular.svg
 * 
 * @return The [ImageVector] for the VirtualNetworkToolbox icon.
 */
public val FluentIcons.Regular.VirtualNetworkToolbox: ImageVector
    get() {
        if (_virtualNetworkToolbox != null) {
            return _virtualNetworkToolbox!!
        }
        _virtualNetworkToolbox = Builder(name = "VirtualNetworkToolbox", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.88f, 6.825f)
                curveTo(5.059f, 6.616f, 5.035f, 6.3f, 4.825f, 6.12f)
                curveTo(4.616f, 5.941f, 4.3f, 5.965f, 4.12f, 6.175f)
                lineTo(1.12f, 9.675f)
                curveTo(0.96f, 9.862f, 0.96f, 10.138f, 1.12f, 10.325f)
                lineTo(4.12f, 13.825f)
                curveTo(4.3f, 14.035f, 4.616f, 14.059f, 4.825f, 13.88f)
                curveTo(5.035f, 13.7f, 5.059f, 13.384f, 4.88f, 13.175f)
                lineTo(2.159f, 10.0f)
                lineTo(4.88f, 6.825f)
                close()
                moveTo(17.958f, 11.042f)
                curveTo(17.904f, 10.748f, 17.798f, 10.472f, 17.65f, 10.223f)
                lineTo(17.841f, 10.0f)
                lineTo(15.12f, 6.825f)
                curveTo(14.941f, 6.616f, 14.965f, 6.3f, 15.175f, 6.12f)
                curveTo(15.384f, 5.941f, 15.7f, 5.965f, 15.88f, 6.175f)
                lineTo(18.88f, 9.675f)
                curveTo(19.04f, 9.862f, 19.04f, 10.138f, 18.88f, 10.325f)
                lineTo(18.213f, 11.103f)
                curveTo(18.13f, 11.078f, 18.045f, 11.058f, 17.958f, 11.042f)
                close()
                moveTo(7.0f, 10.0f)
                curveTo(7.0f, 10.552f, 6.552f, 11.0f, 6.0f, 11.0f)
                curveTo(5.448f, 11.0f, 5.0f, 10.552f, 5.0f, 10.0f)
                curveTo(5.0f, 9.448f, 5.448f, 9.0f, 6.0f, 9.0f)
                curveTo(6.552f, 9.0f, 7.0f, 9.448f, 7.0f, 10.0f)
                close()
                moveTo(10.0f, 11.0f)
                curveTo(10.552f, 11.0f, 11.0f, 10.552f, 11.0f, 10.0f)
                curveTo(11.0f, 9.448f, 10.552f, 9.0f, 10.0f, 9.0f)
                curveTo(9.448f, 9.0f, 9.0f, 9.448f, 9.0f, 10.0f)
                curveTo(9.0f, 10.552f, 9.448f, 11.0f, 10.0f, 11.0f)
                close()
                moveTo(12.0f, 12.0f)
                verticalLineTo(11.5f)
                curveTo(12.0f, 10.672f, 12.672f, 10.0f, 13.5f, 10.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 10.0f, 17.0f, 10.672f, 17.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 12.0f, 19.0f, 12.672f, 19.0f, 13.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 14.224f, 16.776f, 14.0f, 16.5f, 14.0f)
                curveTo(16.224f, 14.0f, 16.0f, 14.224f, 16.0f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.5f)
                curveTo(13.0f, 14.224f, 12.776f, 14.0f, 12.5f, 14.0f)
                curveTo(12.224f, 14.0f, 12.0f, 14.224f, 12.0f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.5f)
                curveTo(10.0f, 12.672f, 10.672f, 12.0f, 11.5f, 12.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.5f)
                curveTo(16.0f, 11.224f, 15.776f, 11.0f, 15.5f, 11.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 11.0f, 13.0f, 11.224f, 13.0f, 11.5f)
                close()
                moveTo(17.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 18.328f, 18.328f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(11.5f)
                curveTo(10.672f, 19.0f, 10.0f, 18.328f, 10.0f, 17.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.5f)
                curveTo(12.0f, 16.776f, 12.224f, 17.0f, 12.5f, 17.0f)
                curveTo(12.776f, 17.0f, 13.0f, 16.776f, 13.0f, 16.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.5f)
                curveTo(16.0f, 16.776f, 16.224f, 17.0f, 16.5f, 17.0f)
                curveTo(16.776f, 17.0f, 17.0f, 16.776f, 17.0f, 16.5f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _virtualNetworkToolbox!!
    }

@Suppress("ObjectPropertyName")
private var _virtualNetworkToolbox: ImageVector? = null

@Preview
@Composable
private fun VirtualNetworkToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VirtualNetworkToolbox, contentDescription = null)
    }
}

