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
 * TextDirectionRotate90Left icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: text, direction, rotate90left
 * - Source: ic_fluent_text_direction_rotate_90_left_24_filled.svg
 * 
 * @return The [ImageVector] for the TextDirectionRotate90Left icon.
 */
public val FluentIcons.Filled.TextDirectionRotate90Left: ImageVector
    get() {
        if (_textDirectionRotate90Left != null) {
            return _textDirectionRotate90Left!!
        }
        _textDirectionRotate90Left = Builder(name = "TextDirectionRotate90Left", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.385f, 15.327f)
                lineTo(11.385f, 11.577f)
                curveTo(10.875f, 11.364f, 10.289f, 11.605f, 10.077f, 12.115f)
                curveTo(9.865f, 12.625f, 10.106f, 13.21f, 10.615f, 13.423f)
                lineTo(13.0f, 14.416f)
                verticalLineTo(18.083f)
                lineTo(10.615f, 19.077f)
                curveTo(10.106f, 19.289f, 9.865f, 19.875f, 10.077f, 20.384f)
                curveTo(10.289f, 20.894f, 10.875f, 21.135f, 11.385f, 20.923f)
                lineTo(20.385f, 17.173f)
                curveTo(20.757f, 17.017f, 21.0f, 16.653f, 21.0f, 16.25f)
                curveTo(21.0f, 15.846f, 20.757f, 15.482f, 20.385f, 15.327f)
                close()
                moveTo(15.0f, 15.25f)
                lineTo(17.4f, 16.25f)
                lineTo(15.0f, 17.25f)
                verticalLineTo(15.25f)
                close()
                moveTo(8.0f, 20.0f)
                curveTo(8.0f, 20.552f, 7.552f, 21.0f, 7.0f, 21.0f)
                curveTo(6.448f, 21.0f, 6.0f, 20.552f, 6.0f, 20.0f)
                verticalLineTo(6.414f)
                lineTo(5.707f, 6.707f)
                curveTo(5.317f, 7.098f, 4.683f, 7.098f, 4.293f, 6.707f)
                curveTo(3.902f, 6.317f, 3.902f, 5.683f, 4.293f, 5.293f)
                lineTo(6.293f, 3.293f)
                curveTo(6.683f, 2.902f, 7.317f, 2.902f, 7.707f, 3.293f)
                lineTo(9.707f, 5.293f)
                curveTo(10.098f, 5.683f, 10.098f, 6.317f, 9.707f, 6.707f)
                curveTo(9.317f, 7.098f, 8.683f, 7.098f, 8.293f, 6.707f)
                lineTo(8.0f, 6.414f)
                verticalLineTo(20.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(15.448f, 11.0f, 15.0f, 10.552f, 15.0f, 10.0f)
                verticalLineTo(6.414f)
                lineTo(14.707f, 6.707f)
                curveTo(14.317f, 7.098f, 13.683f, 7.098f, 13.293f, 6.707f)
                curveTo(12.902f, 6.317f, 12.902f, 5.683f, 13.293f, 5.293f)
                lineTo(15.293f, 3.293f)
                curveTo(15.683f, 2.902f, 16.317f, 2.902f, 16.707f, 3.293f)
                lineTo(18.707f, 5.293f)
                curveTo(19.098f, 5.683f, 19.098f, 6.317f, 18.707f, 6.707f)
                curveTo(18.317f, 7.098f, 17.683f, 7.098f, 17.293f, 6.707f)
                lineTo(17.0f, 6.414f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 10.552f, 16.552f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _textDirectionRotate90Left!!
    }

@Suppress("ObjectPropertyName")
private var _textDirectionRotate90Left: ImageVector? = null

@Preview
@Composable
private fun TextDirectionRotate90LeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextDirectionRotate90Left, contentDescription = null)
    }
}

