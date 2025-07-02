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
 * IOsChevronRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: ios, chevron, right
 * - Source: ic_fluent_ios_chevron_right_20_regular.svg
 * 
 * @return The [ImageVector] for the IOsChevronRight icon.
 */
public val FluentIcons.Regular.IOsChevronRight: ImageVector
    get() {
        if (_iOsChevronRight != null) {
            return _iOsChevronRight!!
        }
        _iOsChevronRight = Builder(name = "IOsChevronRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.646f, 5.854f)
                curveTo(12.451f, 5.658f, 12.451f, 5.342f, 12.646f, 5.146f)
                curveTo(12.842f, 4.951f, 13.158f, 4.951f, 13.354f, 5.146f)
                lineTo(17.854f, 9.646f)
                curveTo(18.049f, 9.842f, 18.049f, 10.158f, 17.854f, 10.354f)
                lineTo(13.354f, 14.854f)
                curveTo(13.158f, 15.049f, 12.842f, 15.049f, 12.646f, 14.854f)
                curveTo(12.451f, 14.658f, 12.451f, 14.342f, 12.646f, 14.146f)
                lineTo(16.793f, 10.0f)
                lineTo(12.646f, 5.854f)
                close()
            }
        }
        .build()
        return _iOsChevronRight!!
    }

@Suppress("ObjectPropertyName")
private var _iOsChevronRight: ImageVector? = null

@Preview
@Composable
private fun IOsChevronRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.IOsChevronRight, contentDescription = null)
    }
}

