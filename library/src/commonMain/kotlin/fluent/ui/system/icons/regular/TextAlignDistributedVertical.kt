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
 * TextAlignDistributedVertical Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in aligning blocks of text scenarios. Contains variants for Left, Center, Right, Justify, Justify Low, Distributed, and Rotate 90 & 270 scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_align_distributed_vertical_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextAlignDistributedVertical icon.
 */
public val FluentIcons.Regular.TextAlignDistributedVertical: ImageVector
    get() {
        if (_textAlignDistributedVertical != null) {
            return _textAlignDistributedVertical!!
        }
        _textAlignDistributedVertical = Builder(name = "TextAlignDistributedVertical", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.78f, 5.28f)
                lineTo(17.5f, 4.561f)
                lineTo(17.5f, 21.25f)
                curveTo(17.5f, 21.664f, 17.836f, 22.0f, 18.25f, 22.0f)
                curveTo(18.664f, 22.0f, 19.0f, 21.664f, 19.0f, 21.25f)
                verticalLineTo(4.561f)
                lineTo(19.72f, 5.28f)
                curveTo(20.013f, 5.573f, 20.487f, 5.573f, 20.78f, 5.28f)
                curveTo(21.073f, 4.987f, 21.073f, 4.513f, 20.78f, 4.22f)
                lineTo(18.78f, 2.22f)
                curveTo(18.487f, 1.927f, 18.013f, 1.927f, 17.72f, 2.22f)
                lineTo(15.72f, 4.22f)
                curveTo(15.427f, 4.513f, 15.427f, 4.987f, 15.72f, 5.28f)
                curveTo(16.013f, 5.573f, 16.487f, 5.573f, 16.78f, 5.28f)
                close()
                moveTo(6.0f, 19.439f)
                lineTo(6.72f, 18.72f)
                curveTo(7.013f, 18.427f, 7.487f, 18.427f, 7.78f, 18.72f)
                curveTo(8.073f, 19.013f, 8.073f, 19.487f, 7.78f, 19.78f)
                lineTo(5.78f, 21.78f)
                curveTo(5.487f, 22.073f, 5.013f, 22.073f, 4.72f, 21.78f)
                lineTo(2.72f, 19.78f)
                curveTo(2.427f, 19.487f, 2.427f, 19.013f, 2.72f, 18.72f)
                curveTo(3.013f, 18.427f, 3.487f, 18.427f, 3.78f, 18.72f)
                lineTo(4.5f, 19.439f)
                lineTo(4.5f, 2.75f)
                curveTo(4.5f, 2.336f, 4.836f, 2.0f, 5.25f, 2.0f)
                curveTo(5.664f, 2.0f, 6.0f, 2.336f, 6.0f, 2.75f)
                lineTo(6.0f, 19.439f)
                close()
                moveTo(12.5f, 2.75f)
                curveTo(12.5f, 2.336f, 12.164f, 2.0f, 11.75f, 2.0f)
                curveTo(11.336f, 2.0f, 11.0f, 2.336f, 11.0f, 2.75f)
                lineTo(11.0f, 21.25f)
                curveTo(11.0f, 21.664f, 11.336f, 22.0f, 11.75f, 22.0f)
                curveTo(12.164f, 22.0f, 12.5f, 21.664f, 12.5f, 21.25f)
                lineTo(12.5f, 2.75f)
                close()
            }
        }
        .build()
        return _textAlignDistributedVertical!!
    }

@Suppress("ObjectPropertyName")
private var _textAlignDistributedVertical: ImageVector? = null

@Preview
@Composable
private fun TextAlignDistributedVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextAlignDistributedVertical, contentDescription = "TextAlignDistributedVertical Icon")
    }
}

