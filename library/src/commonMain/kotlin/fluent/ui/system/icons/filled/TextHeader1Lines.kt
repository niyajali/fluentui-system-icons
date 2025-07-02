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
 * TextHeader1Lines icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: text, header1lines
 * - Source: ic_fluent_text_header_1_lines_24_filled.svg
 * 
 * @return The [ImageVector] for the TextHeader1Lines icon.
 */
public val FluentIcons.Filled.TextHeader1Lines: ImageVector
    get() {
        if (_textHeader1Lines != null) {
            return _textHeader1Lines!!
        }
        _textHeader1Lines = Builder(name = "TextHeader1Lines", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                curveTo(3.552f, 2.0f, 4.0f, 2.448f, 4.0f, 3.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.002f)
                curveTo(7.0f, 2.449f, 7.448f, 2.002f, 8.0f, 2.002f)
                curveTo(8.552f, 2.002f, 9.0f, 2.449f, 9.0f, 3.002f)
                verticalLineTo(9.995f)
                curveTo(9.0f, 10.547f, 8.552f, 10.995f, 8.0f, 10.995f)
                curveTo(7.448f, 10.995f, 7.0f, 10.547f, 7.0f, 9.995f)
                lineTo(7.0f, 7.5f)
                lineTo(4.0f, 7.5f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 10.552f, 3.552f, 11.0f, 3.0f, 11.0f)
                curveTo(2.448f, 11.0f, 2.0f, 10.552f, 2.0f, 10.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 2.448f, 2.448f, 2.0f, 3.0f, 2.0f)
                close()
                moveTo(3.0f, 19.0f)
                curveTo(2.448f, 19.0f, 2.0f, 19.448f, 2.0f, 20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 21.0f, 22.0f, 20.552f, 22.0f, 20.0f)
                curveTo(22.0f, 19.448f, 21.552f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 14.448f, 2.448f, 14.0f, 3.0f, 14.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 14.0f, 22.0f, 14.448f, 22.0f, 15.0f)
                curveTo(22.0f, 15.552f, 21.552f, 16.0f, 21.0f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 16.0f, 2.0f, 15.552f, 2.0f, 15.0f)
                close()
                moveTo(13.0f, 10.0f)
                curveTo(13.0f, 10.55f, 13.45f, 11.0f, 14.0f, 11.0f)
                curveTo(14.55f, 11.0f, 15.0f, 10.55f, 15.0f, 10.0f)
                verticalLineTo(3.0f)
                curveTo(15.0f, 2.54f, 14.68f, 2.14f, 14.23f, 2.03f)
                curveTo(13.78f, 1.92f, 13.31f, 2.14f, 13.11f, 2.54f)
                curveTo(12.61f, 3.54f, 11.58f, 4.09f, 11.55f, 4.1f)
                curveTo(11.06f, 4.35f, 10.86f, 4.95f, 11.11f, 5.44f)
                curveTo(11.35f, 5.94f, 11.96f, 6.14f, 12.45f, 5.89f)
                curveTo(12.46f, 5.884f, 12.479f, 5.874f, 12.504f, 5.86f)
                curveTo(12.596f, 5.81f, 12.779f, 5.71f, 13.0f, 5.56f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _textHeader1Lines!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader1Lines: ImageVector? = null

@Preview
@Composable
private fun TextHeader1LinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextHeader1Lines, contentDescription = null)
    }
}

