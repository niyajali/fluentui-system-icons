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
 * Fax icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fax
 * - Source: ic_fluent_fax_20_regular.svg
 * 
 * @return The [ImageVector] for the Fax icon.
 */
public val FluentIcons.Regular.Fax: ImageVector
    get() {
        if (_fax != null) {
            return _fax!!
        }
        _fax = Builder(name = "Fax", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.5f)
                curveTo(5.0f, 3.672f, 5.672f, 3.0f, 6.5f, 3.0f)
                horizontalLineTo(13.5f)
                curveTo(14.328f, 3.0f, 15.0f, 3.672f, 15.0f, 4.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                curveTo(14.0f, 4.224f, 13.776f, 4.0f, 13.5f, 4.0f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 4.0f, 6.0f, 4.224f, 6.0f, 4.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.5f)
                curveTo(11.281f, 8.291f, 11.125f, 8.631f, 11.05f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 9.0f, 4.0f, 9.448f, 4.0f, 10.0f)
                verticalLineTo(15.5f)
                curveTo(4.0f, 15.776f, 4.224f, 16.0f, 4.5f, 16.0f)
                horizontalLineTo(11.05f)
                curveTo(11.125f, 16.369f, 11.281f, 16.709f, 11.5f, 17.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 17.0f, 3.0f, 16.328f, 3.0f, 15.5f)
                verticalLineTo(10.0f)
                curveTo(3.0f, 8.895f, 3.895f, 8.0f, 5.0f, 8.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(12.0f, 9.5f)
                curveTo(12.0f, 8.672f, 12.672f, 8.0f, 13.5f, 8.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 8.0f, 17.0f, 8.672f, 17.0f, 9.5f)
                verticalLineTo(15.5f)
                curveTo(17.0f, 16.328f, 16.328f, 17.0f, 15.5f, 17.0f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 17.0f, 12.0f, 16.328f, 12.0f, 15.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(13.5f, 9.0f)
                curveTo(13.224f, 9.0f, 13.0f, 9.224f, 13.0f, 9.5f)
                verticalLineTo(15.5f)
                curveTo(13.0f, 15.776f, 13.224f, 16.0f, 13.5f, 16.0f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 16.0f, 16.0f, 15.776f, 16.0f, 15.5f)
                verticalLineTo(9.5f)
                curveTo(16.0f, 9.224f, 15.776f, 9.0f, 15.5f, 9.0f)
                horizontalLineTo(13.5f)
                close()
                moveTo(5.625f, 10.0f)
                curveTo(5.97f, 10.0f, 6.25f, 10.28f, 6.25f, 10.625f)
                curveTo(6.25f, 10.97f, 5.97f, 11.25f, 5.625f, 11.25f)
                curveTo(5.28f, 11.25f, 5.0f, 10.97f, 5.0f, 10.625f)
                curveTo(5.0f, 10.28f, 5.28f, 10.0f, 5.625f, 10.0f)
                close()
                moveTo(5.625f, 12.25f)
                curveTo(5.97f, 12.25f, 6.25f, 12.53f, 6.25f, 12.875f)
                curveTo(6.25f, 13.22f, 5.97f, 13.5f, 5.625f, 13.5f)
                curveTo(5.28f, 13.5f, 5.0f, 13.22f, 5.0f, 12.875f)
                curveTo(5.0f, 12.53f, 5.28f, 12.25f, 5.625f, 12.25f)
                close()
                moveTo(8.5f, 13.0f)
                curveTo(8.5f, 12.655f, 8.22f, 12.375f, 7.875f, 12.375f)
                curveTo(7.53f, 12.375f, 7.25f, 12.655f, 7.25f, 13.0f)
                curveTo(7.25f, 13.345f, 7.53f, 13.625f, 7.875f, 13.625f)
                curveTo(8.22f, 13.625f, 8.5f, 13.345f, 8.5f, 13.0f)
                close()
                moveTo(7.875f, 10.0f)
                curveTo(8.22f, 10.0f, 8.5f, 10.28f, 8.5f, 10.625f)
                curveTo(8.5f, 10.97f, 8.22f, 11.25f, 7.875f, 11.25f)
                curveTo(7.53f, 11.25f, 7.25f, 10.97f, 7.25f, 10.625f)
                curveTo(7.25f, 10.28f, 7.53f, 10.0f, 7.875f, 10.0f)
                close()
            }
        }
        .build()
        return _fax!!
    }

@Suppress("ObjectPropertyName")
private var _fax: ImageVector? = null

@Preview
@Composable
private fun FaxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Fax, contentDescription = null)
    }
}

