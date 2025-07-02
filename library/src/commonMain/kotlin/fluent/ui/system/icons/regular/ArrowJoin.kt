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
 * ArrowJoin icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, join
 * - Source: ic_fluent_arrow_join_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowJoin icon.
 */
public val FluentIcons.Regular.ArrowJoin: ImageVector
    get() {
        if (_arrowJoin != null) {
            return _arrowJoin!!
        }
        _arrowJoin = Builder(name = "ArrowJoin", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 2.5f)
                curveTo(5.0f, 2.224f, 4.776f, 2.0f, 4.5f, 2.0f)
                curveTo(4.224f, 2.0f, 4.0f, 2.224f, 4.0f, 2.5f)
                curveTo(4.0f, 5.713f, 5.968f, 8.422f, 8.777f, 9.5f)
                curveTo(5.968f, 10.578f, 4.0f, 13.287f, 4.0f, 16.5f)
                curveTo(4.0f, 16.776f, 4.224f, 17.0f, 4.5f, 17.0f)
                curveTo(4.776f, 17.0f, 5.0f, 16.776f, 5.0f, 16.5f)
                curveTo(5.0f, 12.876f, 7.876f, 10.0f, 11.5f, 10.0f)
                horizontalLineTo(12.293f)
                lineTo(11.146f, 11.146f)
                curveTo(10.951f, 11.342f, 10.951f, 11.658f, 11.146f, 11.854f)
                curveTo(11.342f, 12.049f, 11.658f, 12.049f, 11.854f, 11.854f)
                lineTo(13.854f, 9.854f)
                curveTo(14.049f, 9.658f, 14.049f, 9.342f, 13.854f, 9.146f)
                lineTo(11.854f, 7.146f)
                curveTo(11.658f, 6.951f, 11.342f, 6.951f, 11.146f, 7.146f)
                curveTo(10.951f, 7.342f, 10.951f, 7.658f, 11.146f, 7.854f)
                lineTo(12.293f, 9.0f)
                horizontalLineTo(11.5f)
                curveTo(7.876f, 9.0f, 5.0f, 6.124f, 5.0f, 2.5f)
                close()
                moveTo(8.5f, 4.0f)
                curveTo(8.224f, 4.0f, 8.0f, 4.224f, 8.0f, 4.5f)
                curveTo(8.0f, 4.776f, 8.224f, 5.0f, 8.5f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(15.524f, 5.0f, 16.0f, 5.476f, 16.0f, 6.0f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 13.524f, 15.524f, 14.0f, 15.0f, 14.0f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 14.0f, 8.0f, 14.224f, 8.0f, 14.5f)
                curveTo(8.0f, 14.776f, 8.224f, 15.0f, 8.5f, 15.0f)
                horizontalLineTo(15.0f)
                curveTo(16.076f, 15.0f, 17.0f, 14.076f, 17.0f, 13.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.924f, 16.076f, 4.0f, 15.0f, 4.0f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _arrowJoin!!
    }

@Suppress("ObjectPropertyName")
private var _arrowJoin: ImageVector? = null

@Preview
@Composable
private fun ArrowJoinPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowJoin, contentDescription = null)
    }
}

