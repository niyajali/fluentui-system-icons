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
 * TetrisApp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tetris, app
 * - Source: ic_fluent_tetris_app_24_regular.svg
 * 
 * @return The [ImageVector] for the TetrisApp icon.
 */
public val FluentIcons.Regular.TetrisApp: ImageVector
    get() {
        if (_tetrisApp != null) {
            return _tetrisApp!!
        }
        _tetrisApp = Builder(name = "TetrisApp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.75f, 2.0f)
                curveTo(7.784f, 2.0f, 7.0f, 2.783f, 7.0f, 3.75f)
                verticalLineTo(6.75f)
                curveTo(7.0f, 6.888f, 6.888f, 7.0f, 6.75f, 7.0f)
                horizontalLineTo(3.75f)
                curveTo(2.784f, 7.0f, 2.0f, 7.783f, 2.0f, 8.75f)
                verticalLineTo(11.75f)
                curveTo(2.0f, 12.717f, 2.784f, 13.5f, 3.75f, 13.5f)
                horizontalLineTo(11.75f)
                curveTo(12.717f, 13.5f, 13.5f, 12.717f, 13.5f, 11.75f)
                verticalLineTo(8.75f)
                curveTo(13.5f, 8.612f, 13.612f, 8.5f, 13.75f, 8.5f)
                horizontalLineTo(16.25f)
                curveTo(17.217f, 8.5f, 18.0f, 7.716f, 18.0f, 6.75f)
                verticalLineTo(3.75f)
                curveTo(18.0f, 2.783f, 17.217f, 2.0f, 16.25f, 2.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(16.25f, 7.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(16.25f)
                curveTo(16.388f, 3.5f, 16.5f, 3.612f, 16.5f, 3.75f)
                verticalLineTo(6.75f)
                curveTo(16.5f, 6.888f, 16.388f, 7.0f, 16.25f, 7.0f)
                close()
                moveTo(12.0f, 7.0f)
                horizontalLineTo(8.483f)
                curveTo(8.494f, 6.918f, 8.5f, 6.835f, 8.5f, 6.75f)
                verticalLineTo(3.75f)
                curveTo(8.5f, 3.612f, 8.612f, 3.5f, 8.75f, 3.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(7.0f, 8.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.75f)
                curveTo(3.612f, 12.0f, 3.5f, 11.888f, 3.5f, 11.75f)
                verticalLineTo(8.75f)
                curveTo(3.5f, 8.612f, 3.612f, 8.5f, 3.75f, 8.5f)
                lineTo(7.0f, 8.5f)
                close()
                moveTo(8.5f, 8.5f)
                horizontalLineTo(12.018f)
                curveTo(12.006f, 8.582f, 12.0f, 8.665f, 12.0f, 8.75f)
                verticalLineTo(11.75f)
                curveTo(12.0f, 11.888f, 11.888f, 12.0f, 11.75f, 12.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(17.25f, 10.5f)
                curveTo(16.283f, 10.5f, 15.5f, 11.283f, 15.5f, 12.25f)
                verticalLineTo(15.25f)
                curveTo(15.5f, 15.388f, 15.388f, 15.5f, 15.25f, 15.5f)
                horizontalLineTo(6.75f)
                curveTo(5.783f, 15.5f, 5.0f, 16.284f, 5.0f, 17.25f)
                verticalLineTo(20.25f)
                curveTo(5.0f, 21.216f, 5.783f, 22.0f, 6.75f, 22.0f)
                horizontalLineTo(20.25f)
                curveTo(21.216f, 22.0f, 22.0f, 21.216f, 22.0f, 20.25f)
                verticalLineTo(12.25f)
                curveTo(22.0f, 11.283f, 21.216f, 10.5f, 20.25f, 10.5f)
                horizontalLineTo(17.25f)
                close()
                moveTo(17.0f, 12.25f)
                curveTo(17.0f, 12.112f, 17.112f, 12.0f, 17.25f, 12.0f)
                horizontalLineTo(20.25f)
                curveTo(20.388f, 12.0f, 20.5f, 12.112f, 20.5f, 12.25f)
                verticalLineTo(15.5f)
                horizontalLineTo(16.982f)
                curveTo(16.994f, 15.418f, 17.0f, 15.335f, 17.0f, 15.25f)
                verticalLineTo(12.25f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(20.25f)
                curveTo(20.5f, 20.388f, 20.388f, 20.5f, 20.25f, 20.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(15.5f, 16.982f)
                verticalLineTo(20.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.25f)
                curveTo(15.335f, 17.0f, 15.418f, 16.994f, 15.5f, 16.982f)
                close()
                moveTo(10.0f, 17.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(6.75f)
                curveTo(6.612f, 20.5f, 6.5f, 20.388f, 6.5f, 20.25f)
                verticalLineTo(17.25f)
                curveTo(6.5f, 17.112f, 6.612f, 17.0f, 6.75f, 17.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _tetrisApp!!
    }

@Suppress("ObjectPropertyName")
private var _tetrisApp: ImageVector? = null

@Preview
@Composable
private fun TetrisAppPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TetrisApp, contentDescription = null)
    }
}

