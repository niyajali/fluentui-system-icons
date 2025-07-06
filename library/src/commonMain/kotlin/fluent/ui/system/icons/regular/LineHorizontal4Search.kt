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
 * LineHorizontal4Search Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: line, horizontal4search
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_line_horizontal_4_search_20_regular.svg)
 * 
 * @return The [ImageVector] for the LineHorizontal4Search icon.
 */
public val FluentIcons.Regular.LineHorizontal4Search: ImageVector
    get() {
        if (_lineHorizontal4Search != null) {
            return _lineHorizontal4Search!!
        }
        _lineHorizontal4Search = Builder(name = "LineHorizontal4Search", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 10.0f)
                curveTo(13.563f, 10.0f, 14.539f, 9.632f, 15.309f, 9.016f)
                lineTo(19.146f, 12.854f)
                curveTo(19.342f, 13.049f, 19.658f, 13.049f, 19.854f, 12.854f)
                curveTo(20.049f, 12.658f, 20.049f, 12.342f, 19.854f, 12.146f)
                lineTo(16.016f, 8.309f)
                curveTo(16.632f, 7.539f, 17.0f, 6.563f, 17.0f, 5.5f)
                curveTo(17.0f, 3.015f, 14.985f, 1.0f, 12.5f, 1.0f)
                curveTo(10.015f, 1.0f, 8.0f, 3.015f, 8.0f, 5.5f)
                curveTo(8.0f, 7.985f, 10.015f, 10.0f, 12.5f, 10.0f)
                close()
                moveTo(12.5f, 2.0f)
                curveTo(14.433f, 2.0f, 16.0f, 3.567f, 16.0f, 5.5f)
                curveTo(16.0f, 7.433f, 14.433f, 9.0f, 12.5f, 9.0f)
                curveTo(10.567f, 9.0f, 9.0f, 7.433f, 9.0f, 5.5f)
                curveTo(9.0f, 3.567f, 10.567f, 2.0f, 12.5f, 2.0f)
                close()
                moveTo(12.52f, 11.0f)
                horizontalLineTo(15.879f)
                lineTo(16.879f, 12.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 12.0f, 2.0f, 11.776f, 2.0f, 11.5f)
                curveTo(2.0f, 11.224f, 2.224f, 11.0f, 2.5f, 11.0f)
                horizontalLineTo(12.48f)
                lineTo(12.5f, 11.0f)
                lineTo(12.52f, 11.0f)
                close()
                moveTo(2.5f, 3.0f)
                horizontalLineTo(7.6f)
                curveTo(7.438f, 3.317f, 7.306f, 3.651f, 7.207f, 4.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 4.0f, 2.0f, 3.776f, 2.0f, 3.5f)
                curveTo(2.0f, 3.224f, 2.224f, 3.0f, 2.5f, 3.0f)
                close()
                moveTo(7.6f, 8.0f)
                curveTo(7.438f, 7.683f, 7.306f, 7.349f, 7.207f, 7.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 7.0f, 2.0f, 7.224f, 2.0f, 7.5f)
                curveTo(2.0f, 7.776f, 2.224f, 8.0f, 2.5f, 8.0f)
                horizontalLineTo(7.6f)
                close()
                moveTo(2.0f, 15.5f)
                curveTo(2.0f, 15.224f, 2.224f, 15.0f, 2.5f, 15.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 15.0f, 18.0f, 15.224f, 18.0f, 15.5f)
                curveTo(18.0f, 15.776f, 17.776f, 16.0f, 17.5f, 16.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 16.0f, 2.0f, 15.776f, 2.0f, 15.5f)
                close()
            }
        }
        .build()
        return _lineHorizontal4Search!!
    }

@Suppress("ObjectPropertyName")
private var _lineHorizontal4Search: ImageVector? = null

@Preview
@Composable
private fun LineHorizontal4SearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LineHorizontal4Search, contentDescription = "LineHorizontal4Search Icon")
    }
}

