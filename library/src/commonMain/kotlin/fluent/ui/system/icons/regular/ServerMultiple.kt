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
 * ServerMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: server, multiple
 * - Source: ic_fluent_server_multiple_20_regular.svg
 * 
 * @return The [ImageVector] for the ServerMultiple icon.
 */
public val FluentIcons.Regular.ServerMultiple: ImageVector
    get() {
        if (_serverMultiple != null) {
            return _serverMultiple!!
        }
        _serverMultiple = Builder(name = "ServerMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 5.0f)
                curveTo(7.224f, 5.0f, 7.0f, 5.224f, 7.0f, 5.5f)
                curveTo(7.0f, 5.776f, 7.224f, 6.0f, 7.5f, 6.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 6.0f, 13.0f, 5.776f, 13.0f, 5.5f)
                curveTo(13.0f, 5.224f, 12.776f, 5.0f, 12.5f, 5.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(7.0f, 12.5f)
                curveTo(7.0f, 12.224f, 7.224f, 12.0f, 7.5f, 12.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 12.0f, 13.0f, 12.224f, 13.0f, 12.5f)
                curveTo(13.0f, 12.776f, 12.776f, 13.0f, 12.5f, 13.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 13.0f, 7.0f, 12.776f, 7.0f, 12.5f)
                close()
                moveTo(7.5f, 14.0f)
                curveTo(7.224f, 14.0f, 7.0f, 14.224f, 7.0f, 14.5f)
                curveTo(7.0f, 14.776f, 7.224f, 15.0f, 7.5f, 15.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 15.0f, 13.0f, 14.776f, 13.0f, 14.5f)
                curveTo(13.0f, 14.224f, 12.776f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5.0f, 4.5f)
                curveTo(5.0f, 3.119f, 6.119f, 2.0f, 7.5f, 2.0f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 2.0f, 15.0f, 3.119f, 15.0f, 4.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 5.0f, 18.0f, 5.895f, 18.0f, 7.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 15.105f, 17.105f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(14.95f)
                curveTo(14.718f, 17.141f, 13.71f, 18.0f, 12.5f, 18.0f)
                horizontalLineTo(7.5f)
                curveTo(6.291f, 18.0f, 5.282f, 17.141f, 5.05f, 16.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 16.0f, 2.0f, 15.105f, 2.0f, 14.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.895f, 2.895f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 15.0f, 17.0f, 14.552f, 17.0f, 14.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 6.448f, 16.552f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(5.0f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 6.0f, 3.0f, 6.448f, 3.0f, 7.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 14.552f, 3.448f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(7.5f, 3.0f)
                curveTo(6.672f, 3.0f, 6.0f, 3.672f, 6.0f, 4.5f)
                verticalLineTo(15.5f)
                curveTo(6.0f, 16.328f, 6.672f, 17.0f, 7.5f, 17.0f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 17.0f, 14.0f, 16.328f, 14.0f, 15.5f)
                verticalLineTo(4.5f)
                curveTo(14.0f, 3.672f, 13.328f, 3.0f, 12.5f, 3.0f)
                horizontalLineTo(7.5f)
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
        Image(imageVector = FluentIcons.Regular.ServerMultiple, contentDescription = null)
    }
}

