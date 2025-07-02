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
 * LineHorizontal1Dashes icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: line, horizontal1dashes
 * - Source: ic_fluent_line_horizontal_1_dashes_24_filled.svg
 * 
 * @return The [ImageVector] for the LineHorizontal1Dashes icon.
 */
public val FluentIcons.Filled.LineHorizontal1Dashes: ImageVector
    get() {
        if (_lineHorizontal1Dashes != null) {
            return _lineHorizontal1Dashes!!
        }
        _lineHorizontal1Dashes = Builder(name = "LineHorizontal1Dashes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 11.448f, 2.448f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(6.0f)
                curveTo(6.552f, 11.0f, 7.0f, 11.448f, 7.0f, 12.0f)
                curveTo(7.0f, 12.552f, 6.552f, 13.0f, 6.0f, 13.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 13.0f, 2.0f, 12.552f, 2.0f, 12.0f)
                close()
                moveTo(9.5f, 12.0f)
                curveTo(9.5f, 11.448f, 9.948f, 11.0f, 10.5f, 11.0f)
                horizontalLineTo(13.5f)
                curveTo(14.052f, 11.0f, 14.5f, 11.448f, 14.5f, 12.0f)
                curveTo(14.5f, 12.552f, 14.052f, 13.0f, 13.5f, 13.0f)
                horizontalLineTo(10.5f)
                curveTo(9.948f, 13.0f, 9.5f, 12.552f, 9.5f, 12.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 11.448f, 17.448f, 11.0f, 18.0f, 11.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 11.0f, 22.0f, 11.448f, 22.0f, 12.0f)
                curveTo(22.0f, 12.552f, 21.552f, 13.0f, 21.0f, 13.0f)
                horizontalLineTo(18.0f)
                curveTo(17.448f, 13.0f, 17.0f, 12.552f, 17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _lineHorizontal1Dashes!!
    }

@Suppress("ObjectPropertyName")
private var _lineHorizontal1Dashes: ImageVector? = null

@Preview
@Composable
private fun LineHorizontal1DashesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LineHorizontal1Dashes, contentDescription = null)
    }
}

