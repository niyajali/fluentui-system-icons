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
 * ServerMultiple Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent physical & digital server machines.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_server_multiple_20_filled.svg)
 * 
 * @return The [ImageVector] for the ServerMultiple icon.
 */
public val FluentIcons.Filled.ServerMultiple: ImageVector
    get() {
        if (_serverMultiple != null) {
            return _serverMultiple!!
        }
        _serverMultiple = Builder(name = "ServerMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 2.0f)
                curveTo(6.119f, 2.0f, 5.0f, 3.119f, 5.0f, 4.5f)
                verticalLineTo(15.5f)
                curveTo(5.0f, 16.881f, 6.119f, 18.0f, 7.5f, 18.0f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 18.0f, 15.0f, 16.881f, 15.0f, 15.5f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 3.119f, 13.881f, 2.0f, 12.5f, 2.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(7.5f, 5.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 5.0f, 13.0f, 5.224f, 13.0f, 5.5f)
                curveTo(13.0f, 5.776f, 12.776f, 6.0f, 12.5f, 6.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 6.0f, 7.0f, 5.776f, 7.0f, 5.5f)
                curveTo(7.0f, 5.224f, 7.224f, 5.0f, 7.5f, 5.0f)
                close()
                moveTo(7.0f, 12.5f)
                curveTo(7.0f, 12.224f, 7.224f, 12.0f, 7.5f, 12.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 12.0f, 13.0f, 12.224f, 13.0f, 12.5f)
                curveTo(13.0f, 12.776f, 12.776f, 13.0f, 12.5f, 13.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 13.0f, 7.0f, 12.776f, 7.0f, 12.5f)
                close()
                moveTo(7.0f, 14.5f)
                curveTo(7.0f, 14.224f, 7.224f, 14.0f, 7.5f, 14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 14.0f, 13.0f, 14.224f, 13.0f, 14.5f)
                curveTo(13.0f, 14.776f, 12.776f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 15.0f, 7.0f, 14.776f, 7.0f, 14.5f)
                close()
                moveTo(2.0f, 7.0f)
                curveTo(2.0f, 5.895f, 2.895f, 5.0f, 4.0f, 5.0f)
                verticalLineTo(15.5f)
                curveTo(4.0f, 15.67f, 4.012f, 15.837f, 4.035f, 16.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 16.0f, 2.0f, 15.105f, 2.0f, 14.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(16.0f, 15.5f)
                curveTo(16.0f, 15.67f, 15.988f, 15.837f, 15.965f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 16.0f, 18.0f, 15.105f, 18.0f, 14.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 5.895f, 17.105f, 5.0f, 16.0f, 5.0f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _serverMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _serverMultiple: ImageVector? = null

@Preview
@Composable
private fun ServerMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ServerMultiple, contentDescription = "ServerMultiple Icon")
    }
}

