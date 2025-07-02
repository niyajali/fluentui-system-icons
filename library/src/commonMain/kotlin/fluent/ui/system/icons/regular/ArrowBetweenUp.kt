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
 * ArrowBetweenUp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, between, up
 * - Source: ic_fluent_arrow_between_up_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowBetweenUp icon.
 */
public val FluentIcons.Regular.ArrowBetweenUp: ImageVector
    get() {
        if (_arrowBetweenUp != null) {
            return _arrowBetweenUp!!
        }
        _arrowBetweenUp = Builder(name = "ArrowBetweenUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                curveTo(4.0f, 18.276f, 3.776f, 18.5f, 3.5f, 18.5f)
                curveTo(3.224f, 18.5f, 3.0f, 18.276f, 3.0f, 18.0f)
                verticalLineTo(17.5f)
                curveTo(3.0f, 16.672f, 3.672f, 16.0f, 4.5f, 16.0f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 16.0f, 16.0f, 16.672f, 16.0f, 17.5f)
                verticalLineTo(18.0f)
                curveTo(16.0f, 18.276f, 15.776f, 18.5f, 15.5f, 18.5f)
                curveTo(15.224f, 18.5f, 15.0f, 18.276f, 15.0f, 18.0f)
                verticalLineTo(17.5f)
                curveTo(15.0f, 17.224f, 14.776f, 17.0f, 14.5f, 17.0f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 17.0f, 4.0f, 17.224f, 4.0f, 17.5f)
                verticalLineTo(18.0f)
                close()
                moveTo(9.5f, 15.0f)
                curveTo(9.776f, 15.0f, 10.0f, 14.776f, 10.0f, 14.5f)
                verticalLineTo(6.707f)
                lineTo(13.646f, 10.354f)
                curveTo(13.842f, 10.549f, 14.158f, 10.549f, 14.354f, 10.354f)
                curveTo(14.549f, 10.158f, 14.549f, 9.842f, 14.354f, 9.646f)
                lineTo(9.854f, 5.146f)
                curveTo(9.658f, 4.951f, 9.342f, 4.951f, 9.146f, 5.146f)
                lineTo(4.646f, 9.646f)
                curveTo(4.451f, 9.842f, 4.451f, 10.158f, 4.646f, 10.354f)
                curveTo(4.842f, 10.549f, 5.158f, 10.549f, 5.354f, 10.354f)
                lineTo(9.0f, 6.707f)
                verticalLineTo(14.5f)
                curveTo(9.0f, 14.776f, 9.224f, 15.0f, 9.5f, 15.0f)
                close()
                moveTo(3.0f, 2.5f)
                curveTo(3.0f, 3.328f, 3.672f, 4.0f, 4.5f, 4.0f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 4.0f, 16.0f, 3.328f, 16.0f, 2.5f)
                verticalLineTo(2.0f)
                curveTo(16.0f, 1.724f, 15.776f, 1.5f, 15.5f, 1.5f)
                curveTo(15.224f, 1.5f, 15.0f, 1.724f, 15.0f, 2.0f)
                verticalLineTo(2.5f)
                curveTo(15.0f, 2.776f, 14.776f, 3.0f, 14.5f, 3.0f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 3.0f, 4.0f, 2.776f, 4.0f, 2.5f)
                verticalLineTo(2.0f)
                curveTo(4.0f, 1.724f, 3.776f, 1.5f, 3.5f, 1.5f)
                curveTo(3.224f, 1.5f, 3.0f, 1.724f, 3.0f, 2.0f)
                verticalLineTo(2.5f)
                close()
            }
        }
        .build()
        return _arrowBetweenUp!!
    }

@Suppress("ObjectPropertyName")
private var _arrowBetweenUp: ImageVector? = null

@Preview
@Composable
private fun ArrowBetweenUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowBetweenUp, contentDescription = null)
    }
}

