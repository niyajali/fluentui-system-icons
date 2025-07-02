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
 * TextHeader2 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, header2
 * - Source: ic_fluent_text_header_2_24_regular.svg
 * 
 * @return The [ImageVector] for the TextHeader2 icon.
 */
public val FluentIcons.Regular.TextHeader2: ImageVector
    get() {
        if (_textHeader2 != null) {
            return _textHeader2!!
        }
        _textHeader2 = Builder(name = "TextHeader2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.75f, 5.0f)
                curveTo(11.164f, 5.0f, 11.5f, 5.336f, 11.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(11.5f, 18.664f, 11.164f, 19.0f, 10.75f, 19.0f)
                curveTo(10.336f, 19.0f, 10.0f, 18.664f, 10.0f, 18.25f)
                verticalLineTo(12.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(18.25f)
                curveTo(3.5f, 18.664f, 3.164f, 19.0f, 2.75f, 19.0f)
                curveTo(2.336f, 19.0f, 2.0f, 18.664f, 2.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(2.0f, 5.336f, 2.336f, 5.0f, 2.75f, 5.0f)
                curveTo(3.164f, 5.0f, 3.5f, 5.336f, 3.5f, 5.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.75f)
                curveTo(10.0f, 5.336f, 10.336f, 5.0f, 10.75f, 5.0f)
                close()
                moveTo(17.75f, 4.5f)
                curveTo(20.097f, 4.5f, 22.0f, 6.403f, 22.0f, 8.75f)
                curveTo(22.0f, 10.049f, 21.455f, 11.05f, 20.71f, 11.865f)
                curveTo(19.988f, 12.656f, 19.037f, 13.315f, 18.185f, 13.923f)
                curveTo(16.632f, 15.033f, 15.387f, 16.007f, 15.076f, 17.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 17.5f, 22.0f, 17.836f, 22.0f, 18.25f)
                curveTo(22.0f, 18.664f, 21.664f, 19.0f, 21.25f, 19.0f)
                horizontalLineTo(14.25f)
                curveTo(13.836f, 19.0f, 13.5f, 18.664f, 13.5f, 18.25f)
                curveTo(13.5f, 15.438f, 15.614f, 13.917f, 17.315f, 12.702f)
                curveTo(18.213f, 12.061f, 19.012f, 11.501f, 19.603f, 10.854f)
                curveTo(20.17f, 10.232f, 20.5f, 9.576f, 20.5f, 8.75f)
                curveTo(20.5f, 7.231f, 19.269f, 6.0f, 17.75f, 6.0f)
                curveTo(16.365f, 6.0f, 15.217f, 7.025f, 15.027f, 8.357f)
                curveTo(14.969f, 8.767f, 14.59f, 9.051f, 14.18f, 8.993f)
                curveTo(13.77f, 8.935f, 13.485f, 8.555f, 13.543f, 8.146f)
                curveTo(13.837f, 6.085f, 15.608f, 4.5f, 17.75f, 4.5f)
                close()
            }
        }
        .build()
        return _textHeader2!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader2: ImageVector? = null

@Preview
@Composable
private fun TextHeader2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextHeader2, contentDescription = null)
    }
}

