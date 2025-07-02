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
 * WindowInPrivate icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: window, in, private
 * - Source: ic_fluent_window_inprivate_20_regular.svg
 * 
 * @return The [ImageVector] for the WindowInPrivate icon.
 */
public val FluentIcons.Regular.WindowInPrivate: ImageVector
    get() {
        if (_windowInPrivate != null) {
            return _windowInPrivate!!
        }
        _windowInPrivate = Builder(name = "WindowInPrivate", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.498f, 3.001f)
                curveTo(4.117f, 3.001f, 2.998f, 4.12f, 2.998f, 5.501f)
                verticalLineTo(14.501f)
                curveTo(2.998f, 15.882f, 4.117f, 17.001f, 5.498f, 17.001f)
                horizontalLineTo(14.498f)
                curveTo(15.879f, 17.001f, 16.998f, 15.882f, 16.998f, 14.501f)
                verticalLineTo(7.001f)
                horizontalLineTo(17.001f)
                verticalLineTo(6.001f)
                horizontalLineTo(16.998f)
                verticalLineTo(5.501f)
                curveTo(16.998f, 4.12f, 15.879f, 3.001f, 14.498f, 3.001f)
                horizontalLineTo(5.498f)
                close()
                moveTo(15.998f, 5.501f)
                verticalLineTo(6.001f)
                horizontalLineTo(14.709f)
                lineTo(15.853f, 4.857f)
                curveTo(15.946f, 5.052f, 15.998f, 5.27f, 15.998f, 5.501f)
                close()
                moveTo(15.147f, 4.148f)
                lineTo(13.294f, 6.001f)
                horizontalLineTo(10.466f)
                lineTo(12.466f, 4.001f)
                horizontalLineTo(14.498f)
                curveTo(14.731f, 4.001f, 14.951f, 4.054f, 15.147f, 4.148f)
                close()
                moveTo(11.052f, 4.001f)
                lineTo(9.052f, 6.001f)
                horizontalLineTo(6.223f)
                lineTo(8.223f, 4.001f)
                horizontalLineTo(11.052f)
                close()
                moveTo(6.809f, 4.001f)
                lineTo(4.809f, 6.001f)
                horizontalLineTo(3.998f)
                verticalLineTo(5.501f)
                curveTo(3.998f, 4.673f, 4.67f, 4.001f, 5.498f, 4.001f)
                horizontalLineTo(6.809f)
                close()
                moveTo(3.998f, 8.226f)
                lineTo(5.223f, 7.001f)
                horizontalLineTo(8.052f)
                lineTo(3.998f, 11.055f)
                verticalLineTo(8.226f)
                close()
                moveTo(9.466f, 7.001f)
                horizontalLineTo(12.294f)
                lineTo(4.145f, 15.15f)
                curveTo(4.051f, 14.954f, 3.998f, 14.733f, 3.998f, 14.501f)
                verticalLineTo(12.469f)
                lineTo(9.466f, 7.001f)
                close()
                moveTo(13.709f, 7.001f)
                horizontalLineTo(15.998f)
                verticalLineTo(7.54f)
                lineTo(7.537f, 16.001f)
                horizontalLineTo(5.498f)
                curveTo(5.267f, 16.001f, 5.049f, 15.949f, 4.854f, 15.856f)
                lineTo(13.709f, 7.001f)
                close()
                moveTo(15.998f, 8.954f)
                verticalLineTo(11.783f)
                lineTo(11.78f, 16.001f)
                horizontalLineTo(8.951f)
                lineTo(15.998f, 8.954f)
                close()
                moveTo(15.998f, 13.197f)
                verticalLineTo(14.501f)
                curveTo(15.998f, 15.329f, 15.326f, 16.001f, 14.498f, 16.001f)
                horizontalLineTo(13.194f)
                lineTo(15.998f, 13.197f)
                close()
            }
        }
        .build()
        return _windowInPrivate!!
    }

@Suppress("ObjectPropertyName")
private var _windowInPrivate: ImageVector? = null

@Preview
@Composable
private fun WindowInPrivatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowInPrivate, contentDescription = null)
    }
}

