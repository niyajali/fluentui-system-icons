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
 * TextHeader2LinesCaret icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: text, header2lines, caret
 * - Source: ic_fluent_text_header_2_lines_caret_24_filled.svg
 * 
 * @return The [ImageVector] for the TextHeader2LinesCaret icon.
 */
public val FluentIcons.Filled.TextHeader2LinesCaret: ImageVector
    get() {
        if (_textHeader2LinesCaret != null) {
            return _textHeader2LinesCaret!!
        }
        _textHeader2LinesCaret = Builder(name = "TextHeader2LinesCaret", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.411f, 4.406f)
                curveTo(12.65f, 3.877f, 13.265f, 3.635f, 13.698f, 3.808f)
                curveTo(14.269f, 4.036f, 14.503f, 4.772f, 14.197f, 5.26f)
                curveTo(14.033f, 5.522f, 13.775f, 5.795f, 13.423f, 6.106f)
                curveTo(13.205f, 6.299f, 13.002f, 6.463f, 12.785f, 6.639f)
                curveTo(12.624f, 6.769f, 12.456f, 6.906f, 12.267f, 7.066f)
                curveTo(11.535f, 7.684f, 10.5f, 8.628f, 10.5f, 10.0f)
                curveTo(10.5f, 10.552f, 10.948f, 11.0f, 11.5f, 11.0f)
                horizontalLineTo(15.75f)
                curveTo(16.302f, 11.0f, 16.75f, 10.552f, 16.75f, 10.0f)
                curveTo(16.75f, 9.448f, 16.302f, 9.0f, 15.75f, 9.0f)
                horizontalLineTo(13.106f)
                curveTo(13.232f, 8.877f, 13.382f, 8.742f, 13.557f, 8.594f)
                curveTo(13.679f, 8.491f, 13.827f, 8.37f, 13.983f, 8.243f)
                curveTo(14.238f, 8.036f, 14.515f, 7.809f, 14.747f, 7.605f)
                curveTo(15.149f, 7.25f, 15.575f, 6.827f, 15.892f, 6.322f)
                curveTo(16.886f, 4.735f, 16.124f, 2.622f, 14.44f, 1.95f)
                curveTo(12.864f, 1.322f, 11.2f, 2.232f, 10.589f, 3.581f)
                curveTo(10.361f, 4.084f, 10.584f, 4.676f, 11.087f, 4.904f)
                curveTo(11.591f, 5.132f, 12.183f, 4.909f, 12.411f, 4.406f)
                close()
                moveTo(3.0f, 2.0f)
                curveTo(3.552f, 2.0f, 4.0f, 2.448f, 4.0f, 3.0f)
                lineTo(4.0f, 5.5f)
                lineTo(7.0f, 5.5f)
                verticalLineTo(3.002f)
                curveTo(7.0f, 2.449f, 7.448f, 2.002f, 8.0f, 2.002f)
                curveTo(8.552f, 2.002f, 9.0f, 2.449f, 9.0f, 3.002f)
                lineTo(9.0f, 9.995f)
                curveTo(9.0f, 10.547f, 8.552f, 10.995f, 8.0f, 10.995f)
                curveTo(7.448f, 10.995f, 7.0f, 10.547f, 7.0f, 9.995f)
                verticalLineTo(7.5f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 10.0f)
                curveTo(4.0f, 10.552f, 3.552f, 11.0f, 3.0f, 11.0f)
                curveTo(2.448f, 11.0f, 2.0f, 10.552f, 2.0f, 10.0f)
                verticalLineTo(3.0f)
                curveTo(2.0f, 2.448f, 2.448f, 2.0f, 3.0f, 2.0f)
                close()
                moveTo(17.557f, 5.462f)
                curveTo(17.673f, 5.182f, 17.947f, 4.999f, 18.25f, 4.999f)
                horizontalLineTo(21.252f)
                curveTo(21.555f, 4.999f, 21.829f, 5.182f, 21.945f, 5.462f)
                curveTo(22.061f, 5.742f, 21.997f, 6.065f, 21.782f, 6.28f)
                lineTo(20.282f, 7.78f)
                curveTo(19.989f, 8.073f, 19.514f, 8.073f, 19.22f, 7.78f)
                lineTo(17.72f, 6.28f)
                curveTo(17.505f, 6.065f, 17.441f, 5.742f, 17.557f, 5.462f)
                close()
                moveTo(2.0f, 20.0f)
                curveTo(2.0f, 19.448f, 2.448f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 19.0f, 22.0f, 19.448f, 22.0f, 20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                close()
                moveTo(3.0f, 14.0f)
                curveTo(2.448f, 14.0f, 2.0f, 14.448f, 2.0f, 15.0f)
                curveTo(2.0f, 15.552f, 2.448f, 16.0f, 3.0f, 16.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 16.0f, 22.0f, 15.552f, 22.0f, 15.0f)
                curveTo(22.0f, 14.448f, 21.552f, 14.0f, 21.0f, 14.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _textHeader2LinesCaret!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader2LinesCaret: ImageVector? = null

@Preview
@Composable
private fun TextHeader2LinesCaretPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextHeader2LinesCaret, contentDescription = null)
    }
}

