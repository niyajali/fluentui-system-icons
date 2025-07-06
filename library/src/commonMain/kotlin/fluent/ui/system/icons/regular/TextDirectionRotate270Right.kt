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
 * TextDirectionRotate270Right Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to choose text direction in editor scenarios. Contains directional, rotation and locale specific variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_direction_rotate_270_right_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextDirectionRotate270Right icon.
 */
public val FluentIcons.Regular.TextDirectionRotate270Right: ImageVector
    get() {
        if (_textDirectionRotate270Right != null) {
            return _textDirectionRotate270Right!!
        }
        _textDirectionRotate270Right = Builder(name = "TextDirectionRotate270Right", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.22f, 5.22f)
                curveTo(4.927f, 5.513f, 4.927f, 5.987f, 5.22f, 6.28f)
                curveTo(5.513f, 6.573f, 5.987f, 6.573f, 6.28f, 6.28f)
                lineTo(7.0f, 5.561f)
                verticalLineTo(9.25f)
                curveTo(7.0f, 9.664f, 7.336f, 10.0f, 7.75f, 10.0f)
                curveTo(8.164f, 10.0f, 8.5f, 9.664f, 8.5f, 9.25f)
                verticalLineTo(5.561f)
                lineTo(9.22f, 6.28f)
                curveTo(9.513f, 6.573f, 9.987f, 6.573f, 10.28f, 6.28f)
                curveTo(10.573f, 5.987f, 10.573f, 5.513f, 10.28f, 5.22f)
                lineTo(8.28f, 3.22f)
                curveTo(7.987f, 2.927f, 7.513f, 2.927f, 7.22f, 3.22f)
                lineTo(5.22f, 5.22f)
                close()
                moveTo(12.969f, 20.947f)
                lineTo(3.474f, 17.194f)
                curveTo(2.879f, 16.958f, 2.844f, 16.151f, 3.37f, 15.849f)
                lineTo(3.475f, 15.798f)
                lineTo(12.975f, 12.052f)
                curveTo(13.361f, 11.9f, 13.796f, 12.089f, 13.948f, 12.474f)
                curveTo(14.087f, 12.828f, 13.94f, 13.223f, 13.618f, 13.404f)
                lineTo(13.526f, 13.447f)
                lineTo(11.0f, 14.444f)
                verticalLineTo(18.557f)
                lineTo(13.521f, 19.552f)
                curveTo(13.874f, 19.692f, 14.062f, 20.069f, 13.974f, 20.428f)
                lineTo(13.943f, 20.525f)
                curveTo(13.803f, 20.878f, 13.425f, 21.067f, 13.067f, 20.978f)
                lineTo(12.969f, 20.947f)
                close()
                moveTo(5.792f, 16.497f)
                lineTo(9.5f, 17.964f)
                verticalLineTo(15.036f)
                lineTo(5.792f, 16.497f)
                close()
                moveTo(14.72f, 6.28f)
                curveTo(14.427f, 5.987f, 14.427f, 5.513f, 14.72f, 5.22f)
                lineTo(16.72f, 3.22f)
                curveTo(17.013f, 2.927f, 17.487f, 2.927f, 17.78f, 3.22f)
                lineTo(19.78f, 5.22f)
                curveTo(20.073f, 5.513f, 20.073f, 5.987f, 19.78f, 6.28f)
                curveTo(19.487f, 6.573f, 19.013f, 6.573f, 18.72f, 6.28f)
                lineTo(18.0f, 5.561f)
                verticalLineTo(20.25f)
                curveTo(18.0f, 20.664f, 17.664f, 21.0f, 17.25f, 21.0f)
                curveTo(16.836f, 21.0f, 16.5f, 20.664f, 16.5f, 20.25f)
                verticalLineTo(5.561f)
                lineTo(15.78f, 6.28f)
                curveTo(15.487f, 6.573f, 15.013f, 6.573f, 14.72f, 6.28f)
                close()
            }
        }
        .build()
        return _textDirectionRotate270Right!!
    }

@Suppress("ObjectPropertyName")
private var _textDirectionRotate270Right: ImageVector? = null

@Preview
@Composable
private fun TextDirectionRotate270RightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextDirectionRotate270Right, contentDescription = "TextDirectionRotate270Right Icon")
    }
}

