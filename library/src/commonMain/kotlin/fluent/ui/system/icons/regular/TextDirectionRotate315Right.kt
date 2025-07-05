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
 * TextDirectionRotate315Right Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to choose text direction in editor scenarios. Contains directional, rotation and locale specific variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_direction_rotate_315_right_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextDirectionRotate315Right icon.
 */
public val FluentIcons.Regular.TextDirectionRotate315Right: ImageVector
    get() {
        if (_textDirectionRotate315Right != null) {
            return _textDirectionRotate315Right!!
        }
        _textDirectionRotate315Right = Builder(name = "TextDirectionRotate315Right", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 2.75f)
                curveTo(10.5f, 3.164f, 10.836f, 3.5f, 11.25f, 3.5f)
                horizontalLineTo(12.439f)
                lineTo(8.22f, 7.72f)
                curveTo(7.927f, 8.013f, 7.927f, 8.487f, 8.22f, 8.78f)
                curveTo(8.513f, 9.073f, 8.987f, 9.073f, 9.28f, 8.78f)
                lineTo(13.5f, 4.561f)
                verticalLineTo(5.75f)
                curveTo(13.5f, 6.164f, 13.836f, 6.5f, 14.25f, 6.5f)
                curveTo(14.664f, 6.5f, 15.0f, 6.164f, 15.0f, 5.75f)
                verticalLineTo(2.75f)
                curveTo(15.0f, 2.336f, 14.664f, 2.0f, 14.25f, 2.0f)
                horizontalLineTo(11.25f)
                curveTo(10.836f, 2.0f, 10.5f, 2.336f, 10.5f, 2.75f)
                close()
                moveTo(3.071f, 8.072f)
                curveTo(2.785f, 7.937f, 2.444f, 7.996f, 2.22f, 8.22f)
                curveTo(1.996f, 8.444f, 1.937f, 8.785f, 2.072f, 9.071f)
                lineTo(6.572f, 18.57f)
                curveTo(6.75f, 18.944f, 7.197f, 19.104f, 7.571f, 18.927f)
                curveTo(7.945f, 18.749f, 8.105f, 18.302f, 7.928f, 17.928f)
                lineTo(6.708f, 15.353f)
                lineTo(9.353f, 12.708f)
                lineTo(11.929f, 13.928f)
                curveTo(12.303f, 14.105f, 12.75f, 13.945f, 12.927f, 13.571f)
                curveTo(13.105f, 13.197f, 12.945f, 12.75f, 12.571f, 12.572f)
                lineTo(3.071f, 8.072f)
                close()
                moveTo(7.914f, 12.026f)
                lineTo(6.026f, 13.913f)
                lineTo(4.327f, 10.327f)
                lineTo(7.914f, 12.026f)
                close()
                moveTo(18.25f, 9.0f)
                curveTo(17.836f, 9.0f, 17.5f, 9.336f, 17.5f, 9.75f)
                curveTo(17.5f, 10.164f, 17.836f, 10.5f, 18.25f, 10.5f)
                horizontalLineTo(19.439f)
                lineTo(9.22f, 20.72f)
                curveTo(8.927f, 21.013f, 8.927f, 21.487f, 9.22f, 21.78f)
                curveTo(9.513f, 22.073f, 9.987f, 22.073f, 10.28f, 21.78f)
                lineTo(20.5f, 11.561f)
                verticalLineTo(12.75f)
                curveTo(20.5f, 13.164f, 20.836f, 13.5f, 21.25f, 13.5f)
                curveTo(21.664f, 13.5f, 22.0f, 13.164f, 22.0f, 12.75f)
                verticalLineTo(9.75f)
                curveTo(22.0f, 9.336f, 21.664f, 9.0f, 21.25f, 9.0f)
                horizontalLineTo(18.25f)
                close()
            }
        }
        .build()
        return _textDirectionRotate315Right!!
    }

@Suppress("ObjectPropertyName")
private var _textDirectionRotate315Right: ImageVector? = null

@Preview
@Composable
private fun TextDirectionRotate315RightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextDirectionRotate315Right, contentDescription = "TextDirectionRotate315Right Icon")
    }
}

