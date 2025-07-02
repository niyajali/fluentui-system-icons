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
 * TextDirectionRotate45Right icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, direction, rotate45right
 * - Source: ic_fluent_text_direction_rotate_45_right_24_regular.svg
 * 
 * @return The [ImageVector] for the TextDirectionRotate45Right icon.
 */
public val FluentIcons.Regular.TextDirectionRotate45Right: ImageVector
    get() {
        if (_textDirectionRotate45Right != null) {
            return _textDirectionRotate45Right!!
        }
        _textDirectionRotate45Right = Builder(name = "TextDirectionRotate45Right", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.25f, 10.5f)
                curveTo(20.836f, 10.5f, 20.5f, 10.836f, 20.5f, 11.25f)
                verticalLineTo(12.439f)
                lineTo(16.28f, 8.22f)
                curveTo(15.987f, 7.927f, 15.513f, 7.927f, 15.22f, 8.22f)
                curveTo(14.927f, 8.513f, 14.927f, 8.987f, 15.22f, 9.28f)
                lineTo(19.439f, 13.5f)
                horizontalLineTo(18.25f)
                curveTo(17.836f, 13.5f, 17.5f, 13.836f, 17.5f, 14.25f)
                curveTo(17.5f, 14.664f, 17.836f, 15.0f, 18.25f, 15.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 15.0f, 22.0f, 14.664f, 22.0f, 14.25f)
                verticalLineTo(11.25f)
                curveTo(22.0f, 10.836f, 21.664f, 10.5f, 21.25f, 10.5f)
                close()
                moveTo(15.928f, 3.071f)
                curveTo(16.063f, 2.785f, 16.004f, 2.444f, 15.78f, 2.22f)
                curveTo(15.556f, 1.996f, 15.215f, 1.937f, 14.929f, 2.072f)
                lineTo(5.43f, 6.572f)
                curveTo(5.056f, 6.75f, 4.896f, 7.197f, 5.074f, 7.571f)
                curveTo(5.251f, 7.945f, 5.698f, 8.105f, 6.072f, 7.928f)
                lineTo(8.647f, 6.708f)
                lineTo(11.292f, 9.353f)
                lineTo(10.072f, 11.929f)
                curveTo(9.895f, 12.303f, 10.055f, 12.75f, 10.429f, 12.927f)
                curveTo(10.803f, 13.105f, 11.25f, 12.945f, 11.428f, 12.571f)
                lineTo(15.928f, 3.071f)
                close()
                moveTo(11.974f, 7.914f)
                lineTo(10.087f, 6.026f)
                lineTo(13.673f, 4.327f)
                lineTo(11.974f, 7.914f)
                close()
                moveTo(15.0f, 18.25f)
                curveTo(15.0f, 17.836f, 14.664f, 17.5f, 14.25f, 17.5f)
                curveTo(13.836f, 17.5f, 13.5f, 17.836f, 13.5f, 18.25f)
                verticalLineTo(19.439f)
                lineTo(3.28f, 9.22f)
                curveTo(2.987f, 8.927f, 2.513f, 8.927f, 2.22f, 9.22f)
                curveTo(1.927f, 9.513f, 1.927f, 9.987f, 2.22f, 10.28f)
                lineTo(12.439f, 20.5f)
                horizontalLineTo(11.25f)
                curveTo(10.836f, 20.5f, 10.5f, 20.836f, 10.5f, 21.25f)
                curveTo(10.5f, 21.664f, 10.836f, 22.0f, 11.25f, 22.0f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 22.0f, 15.0f, 21.664f, 15.0f, 21.25f)
                verticalLineTo(18.25f)
                close()
            }
        }
        .build()
        return _textDirectionRotate45Right!!
    }

@Suppress("ObjectPropertyName")
private var _textDirectionRotate45Right: ImageVector? = null

@Preview
@Composable
private fun TextDirectionRotate45RightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextDirectionRotate45Right, contentDescription = null)
    }
}

