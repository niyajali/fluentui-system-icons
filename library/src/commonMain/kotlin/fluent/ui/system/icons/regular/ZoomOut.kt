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
 * ZoomOut icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: zoom, out
 * - Source: ic_fluent_zoom_out_24_regular.svg
 * 
 * @return The [ImageVector] for the ZoomOut icon.
 */
public val FluentIcons.Regular.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 9.25f)
                curveTo(13.164f, 9.25f, 13.5f, 9.586f, 13.5f, 10.0f)
                curveTo(13.5f, 10.414f, 13.164f, 10.75f, 12.75f, 10.75f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 10.75f, 6.5f, 10.414f, 6.5f, 10.0f)
                curveTo(6.5f, 9.586f, 6.836f, 9.25f, 7.25f, 9.25f)
                horizontalLineTo(12.75f)
                close()
                moveTo(10.0f, 2.0f)
                curveTo(14.418f, 2.0f, 18.0f, 5.582f, 18.0f, 10.0f)
                curveTo(18.0f, 11.939f, 17.31f, 13.717f, 16.162f, 15.102f)
                lineTo(20.78f, 19.72f)
                curveTo(21.073f, 20.013f, 21.073f, 20.487f, 20.78f, 20.78f)
                curveTo(20.487f, 21.073f, 20.013f, 21.073f, 19.72f, 20.78f)
                lineTo(15.102f, 16.162f)
                curveTo(13.717f, 17.31f, 11.939f, 18.0f, 10.0f, 18.0f)
                curveTo(5.582f, 18.0f, 2.0f, 14.418f, 2.0f, 10.0f)
                curveTo(2.0f, 5.582f, 5.582f, 2.0f, 10.0f, 2.0f)
                close()
                moveTo(10.0f, 3.5f)
                curveTo(6.41f, 3.5f, 3.5f, 6.41f, 3.5f, 10.0f)
                curveTo(3.5f, 13.59f, 6.41f, 16.5f, 10.0f, 16.5f)
                curveTo(13.59f, 16.5f, 16.5f, 13.59f, 16.5f, 10.0f)
                curveTo(16.5f, 6.41f, 13.59f, 3.5f, 10.0f, 3.5f)
                close()
            }
        }
        .build()
        return _zoomOut!!
    }

@Suppress("ObjectPropertyName")
private var _zoomOut: ImageVector? = null

@Preview
@Composable
private fun ZoomOutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ZoomOut, contentDescription = null)
    }
}

