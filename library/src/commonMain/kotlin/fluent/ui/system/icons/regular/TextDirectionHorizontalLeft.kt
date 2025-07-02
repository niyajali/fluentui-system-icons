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
 * TextDirectionHorizontalLeft icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, direction, horizontal, left
 * - Source: ic_fluent_text_direction_horizontal_left_24_regular.svg
 * 
 * @return The [ImageVector] for the TextDirectionHorizontalLeft icon.
 */
public val FluentIcons.Regular.TextDirectionHorizontalLeft: ImageVector
    get() {
        if (_textDirectionHorizontalLeft != null) {
            return _textDirectionHorizontalLeft!!
        }
        _textDirectionHorizontalLeft = Builder(name = "TextDirectionHorizontalLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.947f, 12.969f)
                lineTo(17.194f, 3.474f)
                curveTo(16.958f, 2.879f, 16.151f, 2.844f, 15.849f, 3.37f)
                lineTo(15.799f, 3.475f)
                lineTo(12.052f, 12.975f)
                curveTo(11.9f, 13.361f, 12.089f, 13.796f, 12.475f, 13.948f)
                curveTo(12.828f, 14.087f, 13.223f, 13.94f, 13.404f, 13.618f)
                lineTo(13.448f, 13.526f)
                lineTo(14.444f, 11.0f)
                horizontalLineTo(18.557f)
                lineTo(19.552f, 13.521f)
                curveTo(19.692f, 13.874f, 20.07f, 14.062f, 20.428f, 13.974f)
                lineTo(20.525f, 13.943f)
                curveTo(20.879f, 13.803f, 21.067f, 13.425f, 20.978f, 13.067f)
                lineTo(20.947f, 12.969f)
                close()
                moveTo(16.497f, 5.792f)
                lineTo(17.964f, 9.5f)
                horizontalLineTo(15.036f)
                lineTo(16.497f, 5.792f)
                close()
                moveTo(12.0f, 7.75f)
                curveTo(12.0f, 8.164f, 11.664f, 8.5f, 11.25f, 8.5f)
                horizontalLineTo(5.561f)
                lineTo(6.28f, 9.22f)
                curveTo(6.573f, 9.513f, 6.573f, 9.987f, 6.28f, 10.28f)
                curveTo(5.987f, 10.573f, 5.513f, 10.573f, 5.22f, 10.28f)
                lineTo(3.22f, 8.28f)
                curveTo(2.927f, 7.987f, 2.927f, 7.513f, 3.22f, 7.22f)
                lineTo(5.22f, 5.22f)
                curveTo(5.513f, 4.927f, 5.987f, 4.927f, 6.28f, 5.22f)
                curveTo(6.573f, 5.513f, 6.573f, 5.987f, 6.28f, 6.28f)
                lineTo(5.561f, 7.0f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 7.0f, 12.0f, 7.336f, 12.0f, 7.75f)
                close()
                moveTo(21.0f, 17.25f)
                curveTo(21.0f, 17.664f, 20.664f, 18.0f, 20.25f, 18.0f)
                horizontalLineTo(5.561f)
                lineTo(6.28f, 18.72f)
                curveTo(6.573f, 19.013f, 6.573f, 19.487f, 6.28f, 19.78f)
                curveTo(5.987f, 20.073f, 5.513f, 20.073f, 5.22f, 19.78f)
                lineTo(3.22f, 17.78f)
                curveTo(2.927f, 17.487f, 2.927f, 17.013f, 3.22f, 16.72f)
                lineTo(5.22f, 14.72f)
                curveTo(5.513f, 14.427f, 5.987f, 14.427f, 6.28f, 14.72f)
                curveTo(6.573f, 15.013f, 6.573f, 15.487f, 6.28f, 15.78f)
                lineTo(5.561f, 16.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 16.5f, 21.0f, 16.836f, 21.0f, 17.25f)
                close()
            }
        }
        .build()
        return _textDirectionHorizontalLeft!!
    }

@Suppress("ObjectPropertyName")
private var _textDirectionHorizontalLeft: ImageVector? = null

@Preview
@Composable
private fun TextDirectionHorizontalLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextDirectionHorizontalLeft, contentDescription = null)
    }
}

