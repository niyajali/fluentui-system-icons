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
 * FilmstripOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 48dp
 * - Keywords: filmstrip, off
 * - Source: ic_fluent_filmstrip_off_48_filled.svg
 * 
 * @return The [ImageVector] for the FilmstripOff icon.
 */
public val FluentIcons.Filled.FilmstripOff: ImageVector
    get() {
        if (_filmstripOff != null) {
            return _filmstripOff!!
        }
        _filmstripOff = Builder(name = "FilmstripOff", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(38.215f, 39.983f)
                lineTo(41.866f, 43.634f)
                curveTo(42.354f, 44.122f, 43.146f, 44.122f, 43.634f, 43.634f)
                curveTo(44.122f, 43.146f, 44.122f, 42.354f, 43.634f, 41.866f)
                lineTo(6.134f, 4.366f)
                curveTo(5.646f, 3.878f, 4.854f, 3.878f, 4.366f, 4.366f)
                curveTo(3.878f, 4.854f, 3.878f, 5.646f, 4.366f, 6.134f)
                lineTo(7.089f, 8.857f)
                curveTo(5.241f, 9.943f, 4.0f, 11.951f, 4.0f, 14.25f)
                verticalLineTo(33.75f)
                curveTo(4.0f, 37.202f, 6.798f, 40.0f, 10.25f, 40.0f)
                horizontalLineTo(37.75f)
                curveTo(37.907f, 40.0f, 38.062f, 39.994f, 38.215f, 39.983f)
                close()
                moveTo(44.0f, 33.75f)
                curveTo(44.0f, 35.324f, 43.418f, 36.763f, 42.457f, 37.862f)
                lineTo(37.816f, 33.221f)
                curveTo(37.933f, 33.007f, 38.0f, 32.761f, 38.0f, 32.5f)
                verticalLineTo(31.5f)
                curveTo(38.0f, 30.672f, 37.328f, 30.0f, 36.5f, 30.0f)
                curveTo(35.982f, 30.0f, 35.526f, 30.262f, 35.256f, 30.661f)
                lineTo(12.595f, 8.0f)
                horizontalLineTo(37.75f)
                curveTo(41.202f, 8.0f, 44.0f, 10.798f, 44.0f, 14.25f)
                verticalLineTo(33.75f)
                close()
                moveTo(10.0f, 15.5f)
                curveTo(10.0f, 14.672f, 10.672f, 14.0f, 11.5f, 14.0f)
                curveTo(12.328f, 14.0f, 13.0f, 14.672f, 13.0f, 15.5f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 17.328f, 12.328f, 18.0f, 11.5f, 18.0f)
                curveTo(10.672f, 18.0f, 10.0f, 17.328f, 10.0f, 16.5f)
                verticalLineTo(15.5f)
                close()
                moveTo(36.5f, 14.0f)
                curveTo(35.672f, 14.0f, 35.0f, 14.672f, 35.0f, 15.5f)
                verticalLineTo(16.5f)
                curveTo(35.0f, 17.328f, 35.672f, 18.0f, 36.5f, 18.0f)
                curveTo(37.328f, 18.0f, 38.0f, 17.328f, 38.0f, 16.5f)
                verticalLineTo(15.5f)
                curveTo(38.0f, 14.672f, 37.328f, 14.0f, 36.5f, 14.0f)
                close()
                moveTo(10.0f, 23.5f)
                curveTo(10.0f, 22.672f, 10.672f, 22.0f, 11.5f, 22.0f)
                curveTo(12.328f, 22.0f, 13.0f, 22.672f, 13.0f, 23.5f)
                verticalLineTo(24.5f)
                curveTo(13.0f, 25.328f, 12.328f, 26.0f, 11.5f, 26.0f)
                curveTo(10.672f, 26.0f, 10.0f, 25.328f, 10.0f, 24.5f)
                verticalLineTo(23.5f)
                close()
                moveTo(36.5f, 22.0f)
                curveTo(35.672f, 22.0f, 35.0f, 22.672f, 35.0f, 23.5f)
                verticalLineTo(24.5f)
                curveTo(35.0f, 25.328f, 35.672f, 26.0f, 36.5f, 26.0f)
                curveTo(37.328f, 26.0f, 38.0f, 25.328f, 38.0f, 24.5f)
                verticalLineTo(23.5f)
                curveTo(38.0f, 22.672f, 37.328f, 22.0f, 36.5f, 22.0f)
                close()
                moveTo(10.0f, 31.5f)
                curveTo(10.0f, 30.672f, 10.672f, 30.0f, 11.5f, 30.0f)
                curveTo(12.328f, 30.0f, 13.0f, 30.672f, 13.0f, 31.5f)
                verticalLineTo(32.5f)
                curveTo(13.0f, 33.328f, 12.328f, 34.0f, 11.5f, 34.0f)
                curveTo(10.672f, 34.0f, 10.0f, 33.328f, 10.0f, 32.5f)
                verticalLineTo(31.5f)
                close()
            }
        }
        .build()
        return _filmstripOff!!
    }

@Suppress("ObjectPropertyName")
private var _filmstripOff: ImageVector? = null

@Preview
@Composable
private fun FilmstripOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FilmstripOff, contentDescription = null)
    }
}

