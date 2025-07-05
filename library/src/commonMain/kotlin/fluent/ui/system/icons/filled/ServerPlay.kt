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
 * ServerPlay Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent physical & digital server machines.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_server_play_20_filled.svg)
 * 
 * @return The [ImageVector] for the ServerPlay icon.
 */
public val FluentIcons.Filled.ServerPlay: ImageVector
    get() {
        if (_serverPlay != null) {
            return _serverPlay!!
        }
        _serverPlay = Builder(name = "ServerPlay", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 2.0f)
                curveTo(6.119f, 2.0f, 5.0f, 3.119f, 5.0f, 4.5f)
                verticalLineTo(15.5f)
                curveTo(5.0f, 16.881f, 6.119f, 18.0f, 7.5f, 18.0f)
                horizontalLineTo(10.257f)
                curveTo(9.571f, 17.17f, 9.125f, 16.135f, 9.022f, 15.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 15.0f, 7.0f, 14.776f, 7.0f, 14.5f)
                curveTo(7.0f, 14.224f, 7.224f, 14.0f, 7.5f, 14.0f)
                horizontalLineTo(9.022f)
                curveTo(9.053f, 13.657f, 9.116f, 13.322f, 9.207f, 13.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 13.0f, 7.0f, 12.776f, 7.0f, 12.5f)
                curveTo(7.0f, 12.224f, 7.224f, 12.0f, 7.5f, 12.0f)
                horizontalLineTo(9.6f)
                curveTo(10.51f, 10.219f, 12.363f, 9.0f, 14.5f, 9.0f)
                curveTo(14.668f, 9.0f, 14.835f, 9.008f, 15.0f, 9.022f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 3.119f, 13.881f, 2.0f, 12.5f, 2.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(7.0f, 5.5f)
                curveTo(7.0f, 5.224f, 7.224f, 5.0f, 7.5f, 5.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 5.0f, 13.0f, 5.224f, 13.0f, 5.5f)
                curveTo(13.0f, 5.776f, 12.776f, 6.0f, 12.5f, 6.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 6.0f, 7.0f, 5.776f, 7.0f, 5.5f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(16.713f, 14.063f)
                lineTo(13.743f, 12.413f)
                curveTo(13.41f, 12.227f, 13.0f, 12.469f, 13.0f, 12.85f)
                lineTo(13.0f, 16.15f)
                curveTo(13.0f, 16.531f, 13.41f, 16.772f, 13.743f, 16.587f)
                lineTo(16.713f, 14.937f)
                curveTo(17.056f, 14.747f, 17.056f, 14.253f, 16.713f, 14.063f)
                close()
            }
        }
        .build()
        return _serverPlay!!
    }

@Suppress("ObjectPropertyName")
private var _serverPlay: ImageVector? = null

@Preview
@Composable
private fun ServerPlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ServerPlay, contentDescription = "ServerPlay Icon")
    }
}

