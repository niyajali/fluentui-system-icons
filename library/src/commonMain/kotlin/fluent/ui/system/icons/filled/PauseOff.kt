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
 * PauseOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: pause, off
 * - Source: ic_fluent_pause_off_20_filled.svg
 * 
 * @return The [ImageVector] for the PauseOff icon.
 */
public val FluentIcons.Filled.PauseOff: ImageVector
    get() {
        if (_pauseOff != null) {
            return _pauseOff!!
        }
        _pauseOff = Builder(name = "PauseOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.707f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 17.328f, 3.672f, 18.0f, 4.5f, 18.0f)
                horizontalLineTo(6.5f)
                curveTo(7.328f, 18.0f, 8.0f, 17.328f, 8.0f, 16.5f)
                verticalLineTo(8.707f)
                lineTo(12.0f, 12.707f)
                verticalLineTo(16.5f)
                curveTo(12.0f, 17.328f, 12.672f, 18.0f, 13.5f, 18.0f)
                horizontalLineTo(15.5f)
                curveTo(15.989f, 18.0f, 16.423f, 17.766f, 16.697f, 17.404f)
                lineTo(17.146f, 17.854f)
                curveTo(17.342f, 18.049f, 17.658f, 18.049f, 17.854f, 17.854f)
                curveTo(18.049f, 17.658f, 18.049f, 17.342f, 17.854f, 17.146f)
                lineTo(2.854f, 2.146f)
                curveTo(2.658f, 1.951f, 2.342f, 1.951f, 2.146f, 2.146f)
                curveTo(1.951f, 2.342f, 1.951f, 2.658f, 2.146f, 2.854f)
                lineTo(3.0f, 3.707f)
                close()
                moveTo(12.0f, 9.879f)
                lineTo(17.0f, 14.879f)
                verticalLineTo(3.5f)
                curveTo(17.0f, 2.672f, 16.328f, 2.0f, 15.5f, 2.0f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 2.0f, 12.0f, 2.672f, 12.0f, 3.5f)
                verticalLineTo(9.879f)
                close()
                moveTo(4.16f, 2.039f)
                lineTo(8.0f, 5.879f)
                verticalLineTo(3.5f)
                curveTo(8.0f, 2.672f, 7.328f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(4.5f)
                curveTo(4.383f, 2.0f, 4.269f, 2.013f, 4.16f, 2.039f)
                close()
            }
        }
        .build()
        return _pauseOff!!
    }

@Suppress("ObjectPropertyName")
private var _pauseOff: ImageVector? = null

@Preview
@Composable
private fun PauseOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PauseOff, contentDescription = null)
    }
}

