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
 * LineHorizontal1Dashes icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: line, horizontal1dashes
 * - Source: ic_fluent_line_horizontal_1_dashes_24_regular.svg
 * 
 * @return The [ImageVector] for the LineHorizontal1Dashes icon.
 */
public val FluentIcons.Regular.LineHorizontal1Dashes: ImageVector
    get() {
        if (_lineHorizontal1Dashes != null) {
            return _lineHorizontal1Dashes!!
        }
        _lineHorizontal1Dashes = Builder(name = "LineHorizontal1Dashes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 11.75f)
                curveTo(2.0f, 11.336f, 2.336f, 11.0f, 2.75f, 11.0f)
                horizontalLineTo(6.25f)
                curveTo(6.664f, 11.0f, 7.0f, 11.336f, 7.0f, 11.75f)
                curveTo(7.0f, 12.164f, 6.664f, 12.5f, 6.25f, 12.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 12.5f, 2.0f, 12.164f, 2.0f, 11.75f)
                close()
                moveTo(9.5f, 11.75f)
                curveTo(9.5f, 11.336f, 9.836f, 11.0f, 10.25f, 11.0f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 11.0f, 14.5f, 11.336f, 14.5f, 11.75f)
                curveTo(14.5f, 12.164f, 14.164f, 12.5f, 13.75f, 12.5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 12.5f, 9.5f, 12.164f, 9.5f, 11.75f)
                close()
                moveTo(17.0f, 11.75f)
                curveTo(17.0f, 11.336f, 17.336f, 11.0f, 17.75f, 11.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 11.0f, 22.0f, 11.336f, 22.0f, 11.75f)
                curveTo(22.0f, 12.164f, 21.664f, 12.5f, 21.25f, 12.5f)
                horizontalLineTo(17.75f)
                curveTo(17.336f, 12.5f, 17.0f, 12.164f, 17.0f, 11.75f)
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
        Image(imageVector = FluentIcons.Regular.LineHorizontal1Dashes, contentDescription = null)
    }
}

