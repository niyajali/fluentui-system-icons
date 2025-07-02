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
 * IOsArrow icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: ios, arrow
 * - Source: ic_fluent_ios_arrow_24_regular.svg
 * 
 * @return The [ImageVector] for the IOsArrow icon.
 */
public val FluentIcons.Regular.IOsArrow: ImageVector
    get() {
        if (_iOsArrow != null) {
            return _iOsArrow!!
        }
        _iOsArrow = Builder(name = "IOsArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.296f, 12.0f)
                lineTo(12.788f, 3.273f)
                curveTo(13.076f, 2.976f, 13.07f, 2.501f, 12.773f, 2.212f)
                curveTo(12.476f, 1.924f, 12.001f, 1.93f, 11.712f, 2.227f)
                lineTo(2.712f, 11.477f)
                curveTo(2.429f, 11.768f, 2.429f, 12.232f, 2.712f, 12.523f)
                lineTo(11.712f, 21.773f)
                curveTo(12.001f, 22.07f, 12.476f, 22.076f, 12.773f, 21.788f)
                curveTo(13.07f, 21.499f, 13.076f, 21.024f, 12.788f, 20.727f)
                lineTo(4.296f, 12.0f)
                close()
            }
        }
        .build()
        return _iOsArrow!!
    }

@Suppress("ObjectPropertyName")
private var _iOsArrow: ImageVector? = null

@Preview
@Composable
private fun IOsArrowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.IOsArrow, contentDescription = null)
    }
}

