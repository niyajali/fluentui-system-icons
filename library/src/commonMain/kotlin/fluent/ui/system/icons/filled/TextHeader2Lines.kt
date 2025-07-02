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
 * TextHeader2Lines icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: text, header2lines
 * - Source: ic_fluent_text_header_2_lines_24_filled.svg
 * 
 * @return The [ImageVector] for the TextHeader2Lines icon.
 */
public val FluentIcons.Filled.TextHeader2Lines: ImageVector
    get() {
        if (_textHeader2Lines != null) {
            return _textHeader2Lines!!
        }
        _textHeader2Lines = Builder(name = "TextHeader2Lines", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.199f, 3.808f)
                curveTo(13.765f, 3.635f, 13.151f, 3.877f, 12.911f, 4.406f)
                curveTo(12.683f, 4.909f, 12.091f, 5.132f, 11.588f, 4.904f)
                curveTo(11.085f, 4.676f, 10.861f, 4.084f, 11.089f, 3.581f)
                curveTo(11.7f, 2.232f, 13.364f, 1.322f, 14.94f, 1.95f)
                curveTo(16.624f, 2.622f, 17.386f, 4.735f, 16.392f, 6.322f)
                curveTo(16.076f, 6.827f, 15.65f, 7.25f, 15.247f, 7.605f)
                curveTo(15.016f, 7.809f, 14.738f, 8.036f, 14.483f, 8.243f)
                curveTo(14.327f, 8.37f, 14.18f, 8.491f, 14.057f, 8.594f)
                curveTo(13.882f, 8.742f, 13.733f, 8.877f, 13.606f, 9.0f)
                horizontalLineTo(16.25f)
                curveTo(16.802f, 9.0f, 17.25f, 9.448f, 17.25f, 10.0f)
                curveTo(17.25f, 10.552f, 16.802f, 11.0f, 16.25f, 11.0f)
                horizontalLineTo(12.0f)
                curveTo(11.448f, 11.0f, 11.0f, 10.552f, 11.0f, 10.0f)
                curveTo(11.0f, 8.628f, 12.035f, 7.684f, 12.767f, 7.066f)
                curveTo(12.956f, 6.906f, 13.124f, 6.769f, 13.285f, 6.639f)
                curveTo(13.502f, 6.463f, 13.705f, 6.299f, 13.924f, 6.106f)
                curveTo(14.276f, 5.795f, 14.533f, 5.522f, 14.697f, 5.26f)
                curveTo(15.003f, 4.772f, 14.769f, 4.036f, 14.199f, 3.808f)
                close()
                moveTo(4.0f, 3.0f)
                curveTo(4.0f, 2.448f, 3.552f, 2.0f, 3.0f, 2.0f)
                curveTo(2.448f, 2.0f, 2.0f, 2.448f, 2.0f, 3.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 10.552f, 2.448f, 11.0f, 3.0f, 11.0f)
                curveTo(3.552f, 11.0f, 4.0f, 10.552f, 4.0f, 10.0f)
                lineTo(4.0f, 7.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.995f)
                curveTo(7.0f, 10.547f, 7.448f, 10.995f, 8.0f, 10.995f)
                curveTo(8.552f, 10.995f, 9.0f, 10.547f, 9.0f, 9.995f)
                lineTo(9.0f, 3.002f)
                curveTo(9.0f, 2.449f, 8.552f, 2.002f, 8.0f, 2.002f)
                curveTo(7.448f, 2.002f, 7.0f, 2.449f, 7.0f, 3.002f)
                verticalLineTo(5.5f)
                lineTo(4.0f, 5.5f)
                lineTo(4.0f, 3.0f)
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
            }
        }
        .build()
        return _textHeader2Lines!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader2Lines: ImageVector? = null

@Preview
@Composable
private fun TextHeader2LinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextHeader2Lines, contentDescription = null)
    }
}

