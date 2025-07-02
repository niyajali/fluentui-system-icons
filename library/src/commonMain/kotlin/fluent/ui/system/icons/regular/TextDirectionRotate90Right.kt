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
 * TextDirectionRotate90Right icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, direction, rotate90right
 * - Source: ic_fluent_text_direction_rotate_90_right_24_regular.svg
 * 
 * @return The [ImageVector] for the TextDirectionRotate90Right icon.
 */
public val FluentIcons.Regular.TextDirectionRotate90Right: ImageVector
    get() {
        if (_textDirectionRotate90Right != null) {
            return _textDirectionRotate90Right!!
        }
        _textDirectionRotate90Right = Builder(name = "TextDirectionRotate90Right", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 3.0f)
                curveTo(6.336f, 3.0f, 6.0f, 3.336f, 6.0f, 3.75f)
                verticalLineTo(18.439f)
                lineTo(5.28f, 17.72f)
                curveTo(4.987f, 17.427f, 4.513f, 17.427f, 4.22f, 17.72f)
                curveTo(3.927f, 18.013f, 3.927f, 18.487f, 4.22f, 18.78f)
                lineTo(6.22f, 20.78f)
                curveTo(6.513f, 21.073f, 6.987f, 21.073f, 7.28f, 20.78f)
                lineTo(9.28f, 18.78f)
                curveTo(9.573f, 18.487f, 9.573f, 18.013f, 9.28f, 17.72f)
                curveTo(8.987f, 17.427f, 8.513f, 17.427f, 8.22f, 17.72f)
                lineTo(7.5f, 18.439f)
                verticalLineTo(3.75f)
                curveTo(7.5f, 3.336f, 7.164f, 3.0f, 6.75f, 3.0f)
                close()
                moveTo(11.031f, 3.053f)
                lineTo(20.526f, 6.806f)
                curveTo(21.121f, 7.042f, 21.156f, 7.849f, 20.63f, 8.151f)
                lineTo(20.525f, 8.202f)
                lineTo(11.025f, 11.948f)
                curveTo(10.639f, 12.1f, 10.204f, 11.911f, 10.052f, 11.525f)
                curveTo(9.913f, 11.172f, 10.06f, 10.777f, 10.382f, 10.596f)
                lineTo(10.474f, 10.553f)
                lineTo(13.0f, 9.556f)
                verticalLineTo(5.443f)
                lineTo(10.479f, 4.448f)
                curveTo(10.126f, 4.308f, 9.938f, 3.93f, 10.026f, 3.572f)
                lineTo(10.057f, 3.475f)
                curveTo(10.197f, 3.121f, 10.575f, 2.933f, 10.933f, 3.022f)
                lineTo(11.031f, 3.053f)
                close()
                moveTo(18.208f, 7.503f)
                lineTo(14.5f, 6.036f)
                verticalLineTo(8.964f)
                lineTo(18.208f, 7.503f)
                close()
                moveTo(15.5f, 12.75f)
                curveTo(15.5f, 12.336f, 15.836f, 12.0f, 16.25f, 12.0f)
                curveTo(16.664f, 12.0f, 17.0f, 12.336f, 17.0f, 12.75f)
                verticalLineTo(18.439f)
                lineTo(17.72f, 17.72f)
                curveTo(18.013f, 17.427f, 18.487f, 17.427f, 18.78f, 17.72f)
                curveTo(19.073f, 18.013f, 19.073f, 18.487f, 18.78f, 18.78f)
                lineTo(16.78f, 20.78f)
                curveTo(16.487f, 21.073f, 16.013f, 21.073f, 15.72f, 20.78f)
                lineTo(13.72f, 18.78f)
                curveTo(13.427f, 18.487f, 13.427f, 18.013f, 13.72f, 17.72f)
                curveTo(14.013f, 17.427f, 14.487f, 17.427f, 14.78f, 17.72f)
                lineTo(15.5f, 18.439f)
                verticalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _textDirectionRotate90Right!!
    }

@Suppress("ObjectPropertyName")
private var _textDirectionRotate90Right: ImageVector? = null

@Preview
@Composable
private fun TextDirectionRotate90RightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextDirectionRotate90Right, contentDescription = null)
    }
}

