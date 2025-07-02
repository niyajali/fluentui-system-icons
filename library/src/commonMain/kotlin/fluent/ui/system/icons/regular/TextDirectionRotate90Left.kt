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
 * TextDirectionRotate90Left icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, direction, rotate90left
 * - Source: ic_fluent_text_direction_rotate_90_left_24_regular.svg
 * 
 * @return The [ImageVector] for the TextDirectionRotate90Left icon.
 */
public val FluentIcons.Regular.TextDirectionRotate90Left: ImageVector
    get() {
        if (_textDirectionRotate90Left != null) {
            return _textDirectionRotate90Left!!
        }
        _textDirectionRotate90Left = Builder(name = "TextDirectionRotate90Left", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 21.0f)
                curveTo(6.336f, 21.0f, 6.0f, 20.664f, 6.0f, 20.25f)
                verticalLineTo(5.561f)
                lineTo(5.28f, 6.28f)
                curveTo(4.987f, 6.573f, 4.513f, 6.573f, 4.22f, 6.28f)
                curveTo(3.927f, 5.987f, 3.927f, 5.513f, 4.22f, 5.22f)
                lineTo(6.22f, 3.22f)
                curveTo(6.513f, 2.927f, 6.987f, 2.927f, 7.28f, 3.22f)
                lineTo(9.28f, 5.22f)
                curveTo(9.573f, 5.513f, 9.573f, 5.987f, 9.28f, 6.28f)
                curveTo(8.987f, 6.573f, 8.513f, 6.573f, 8.22f, 6.28f)
                lineTo(7.5f, 5.561f)
                verticalLineTo(20.25f)
                curveTo(7.5f, 20.664f, 7.164f, 21.0f, 6.75f, 21.0f)
                close()
                moveTo(11.031f, 20.947f)
                lineTo(20.526f, 17.194f)
                curveTo(21.121f, 16.958f, 21.156f, 16.151f, 20.63f, 15.849f)
                lineTo(20.525f, 15.798f)
                lineTo(11.025f, 12.052f)
                curveTo(10.639f, 11.9f, 10.204f, 12.089f, 10.052f, 12.475f)
                curveTo(9.913f, 12.828f, 10.06f, 13.223f, 10.382f, 13.404f)
                lineTo(10.474f, 13.447f)
                lineTo(13.0f, 14.444f)
                verticalLineTo(18.557f)
                lineTo(10.479f, 19.552f)
                curveTo(10.126f, 19.692f, 9.938f, 20.07f, 10.026f, 20.428f)
                lineTo(10.057f, 20.525f)
                curveTo(10.197f, 20.878f, 10.575f, 21.067f, 10.933f, 20.978f)
                lineTo(11.031f, 20.947f)
                close()
                moveTo(18.208f, 16.497f)
                lineTo(14.5f, 17.964f)
                verticalLineTo(15.036f)
                lineTo(18.208f, 16.497f)
                close()
                moveTo(15.5f, 11.25f)
                curveTo(15.5f, 11.664f, 15.836f, 12.0f, 16.25f, 12.0f)
                curveTo(16.664f, 12.0f, 17.0f, 11.664f, 17.0f, 11.25f)
                verticalLineTo(5.561f)
                lineTo(17.72f, 6.28f)
                curveTo(18.013f, 6.573f, 18.487f, 6.573f, 18.78f, 6.28f)
                curveTo(19.073f, 5.987f, 19.073f, 5.513f, 18.78f, 5.22f)
                lineTo(16.78f, 3.22f)
                curveTo(16.487f, 2.927f, 16.013f, 2.927f, 15.72f, 3.22f)
                lineTo(13.72f, 5.22f)
                curveTo(13.427f, 5.513f, 13.427f, 5.987f, 13.72f, 6.28f)
                curveTo(14.013f, 6.573f, 14.487f, 6.573f, 14.78f, 6.28f)
                lineTo(15.5f, 5.561f)
                verticalLineTo(11.25f)
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
        Image(imageVector = FluentIcons.Regular.TextDirectionRotate90Left, contentDescription = null)
    }
}

