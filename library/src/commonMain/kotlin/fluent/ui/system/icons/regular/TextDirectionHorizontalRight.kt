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
 * TextDirectionHorizontalRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, direction, horizontal, right
 * - Source: ic_fluent_text_direction_horizontal_right_24_regular.svg
 * 
 * @return The [ImageVector] for the TextDirectionHorizontalRight icon.
 */
public val FluentIcons.Regular.TextDirectionHorizontalRight: ImageVector
    get() {
        if (_textDirectionHorizontalRight != null) {
            return _textDirectionHorizontalRight!!
        }
        _textDirectionHorizontalRight = Builder(name = "TextDirectionHorizontalRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.053f, 12.969f)
                lineTo(6.806f, 3.474f)
                curveTo(7.042f, 2.879f, 7.849f, 2.844f, 8.151f, 3.37f)
                lineTo(8.202f, 3.475f)
                lineTo(11.948f, 12.975f)
                curveTo(12.1f, 13.361f, 11.911f, 13.796f, 11.525f, 13.948f)
                curveTo(11.172f, 14.087f, 10.777f, 13.94f, 10.596f, 13.618f)
                lineTo(10.552f, 13.526f)
                lineTo(9.556f, 11.0f)
                horizontalLineTo(5.443f)
                lineTo(4.448f, 13.521f)
                curveTo(4.308f, 13.874f, 3.93f, 14.062f, 3.572f, 13.974f)
                lineTo(3.474f, 13.943f)
                curveTo(3.121f, 13.803f, 2.933f, 13.425f, 3.022f, 13.067f)
                lineTo(3.053f, 12.969f)
                close()
                moveTo(7.503f, 5.792f)
                lineTo(6.036f, 9.5f)
                horizontalLineTo(8.964f)
                lineTo(7.503f, 5.792f)
                close()
                moveTo(12.0f, 7.75f)
                curveTo(12.0f, 8.164f, 12.336f, 8.5f, 12.75f, 8.5f)
                horizontalLineTo(18.439f)
                lineTo(17.72f, 9.22f)
                curveTo(17.427f, 9.513f, 17.427f, 9.987f, 17.72f, 10.28f)
                curveTo(18.013f, 10.573f, 18.487f, 10.573f, 18.78f, 10.28f)
                lineTo(20.78f, 8.28f)
                curveTo(21.073f, 7.987f, 21.073f, 7.513f, 20.78f, 7.22f)
                lineTo(18.78f, 5.22f)
                curveTo(18.487f, 4.927f, 18.013f, 4.927f, 17.72f, 5.22f)
                curveTo(17.427f, 5.513f, 17.427f, 5.987f, 17.72f, 6.28f)
                lineTo(18.439f, 7.0f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 7.0f, 12.0f, 7.336f, 12.0f, 7.75f)
                close()
                moveTo(3.0f, 17.25f)
                curveTo(3.0f, 17.664f, 3.336f, 18.0f, 3.75f, 18.0f)
                horizontalLineTo(18.439f)
                lineTo(17.72f, 18.72f)
                curveTo(17.427f, 19.013f, 17.427f, 19.487f, 17.72f, 19.78f)
                curveTo(18.013f, 20.073f, 18.487f, 20.073f, 18.78f, 19.78f)
                lineTo(20.78f, 17.78f)
                curveTo(21.073f, 17.487f, 21.073f, 17.013f, 20.78f, 16.72f)
                lineTo(18.78f, 14.72f)
                curveTo(18.487f, 14.427f, 18.013f, 14.427f, 17.72f, 14.72f)
                curveTo(17.427f, 15.013f, 17.427f, 15.487f, 17.72f, 15.78f)
                lineTo(18.439f, 16.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 16.5f, 3.0f, 16.836f, 3.0f, 17.25f)
                close()
            }
        }
        .build()
        return _textDirectionHorizontalRight!!
    }

@Suppress("ObjectPropertyName")
private var _textDirectionHorizontalRight: ImageVector? = null

@Preview
@Composable
private fun TextDirectionHorizontalRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextDirectionHorizontalRight, contentDescription = null)
    }
}

