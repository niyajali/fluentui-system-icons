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
 * ChevronDoubleUp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: chevron, double, up
 * - Source: ic_fluent_chevron_double_up_20_regular.svg
 * 
 * @return The [ImageVector] for the ChevronDoubleUp icon.
 */
public val FluentIcons.Regular.ChevronDoubleUp: ImageVector
    get() {
        if (_chevronDoubleUp != null) {
            return _chevronDoubleUp!!
        }
        _chevronDoubleUp = Builder(name = "ChevronDoubleUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.146f, 9.646f)
                curveTo(3.951f, 9.842f, 3.951f, 10.158f, 4.147f, 10.353f)
                curveTo(4.343f, 10.548f, 4.659f, 10.548f, 4.854f, 10.352f)
                lineTo(10.0f, 5.188f)
                lineTo(15.146f, 10.352f)
                curveTo(15.341f, 10.548f, 15.657f, 10.548f, 15.853f, 10.353f)
                curveTo(16.049f, 10.158f, 16.049f, 9.842f, 15.854f, 9.646f)
                lineTo(10.39f, 4.162f)
                curveTo(10.175f, 3.946f, 9.825f, 3.946f, 9.61f, 4.162f)
                lineTo(4.146f, 9.646f)
                close()
                moveTo(4.146f, 14.647f)
                curveTo(3.951f, 14.843f, 3.951f, 15.159f, 4.147f, 15.354f)
                curveTo(4.343f, 15.549f, 4.659f, 15.549f, 4.854f, 15.353f)
                lineTo(10.0f, 10.188f)
                lineTo(15.146f, 15.353f)
                curveTo(15.341f, 15.549f, 15.657f, 15.549f, 15.853f, 15.354f)
                curveTo(16.049f, 15.159f, 16.049f, 14.843f, 15.854f, 14.647f)
                lineTo(10.39f, 9.163f)
                curveTo(10.175f, 8.947f, 9.825f, 8.947f, 9.61f, 9.163f)
                lineTo(4.146f, 14.647f)
                close()
            }
        }
        .build()
        return _chevronDoubleUp!!
    }

@Suppress("ObjectPropertyName")
private var _chevronDoubleUp: ImageVector? = null

@Preview
@Composable
private fun ChevronDoubleUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChevronDoubleUp, contentDescription = null)
    }
}

