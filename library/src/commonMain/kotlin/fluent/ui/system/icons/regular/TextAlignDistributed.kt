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
 * TextAlignDistributed Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in aligning blocks of text scenarios. Contains variants for Left, Center, Right, Justify, Justify Low, Distributed, and Rotate 90 & 270 scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_align_distributed_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextAlignDistributed icon.
 */
public val FluentIcons.Regular.TextAlignDistributed: ImageVector
    get() {
        if (_textAlignDistributed != null) {
            return _textAlignDistributed!!
        }
        _textAlignDistributed = Builder(name = "TextAlignDistributed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.28f, 7.22f)
                lineTo(4.561f, 6.5f)
                lineTo(21.25f, 6.5f)
                curveTo(21.664f, 6.5f, 22.0f, 6.164f, 22.0f, 5.75f)
                curveTo(22.0f, 5.336f, 21.664f, 5.0f, 21.25f, 5.0f)
                lineTo(4.561f, 5.0f)
                lineTo(5.28f, 4.28f)
                curveTo(5.573f, 3.987f, 5.573f, 3.513f, 5.28f, 3.22f)
                curveTo(4.987f, 2.927f, 4.513f, 2.927f, 4.22f, 3.22f)
                lineTo(2.22f, 5.22f)
                curveTo(1.927f, 5.513f, 1.927f, 5.987f, 2.22f, 6.28f)
                lineTo(4.22f, 8.28f)
                curveTo(4.513f, 8.573f, 4.987f, 8.573f, 5.28f, 8.28f)
                curveTo(5.573f, 7.987f, 5.573f, 7.513f, 5.28f, 7.22f)
                close()
                moveTo(2.75f, 11.5f)
                curveTo(2.336f, 11.5f, 2.0f, 11.836f, 2.0f, 12.25f)
                curveTo(2.0f, 12.664f, 2.336f, 13.0f, 2.75f, 13.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 13.0f, 22.0f, 12.664f, 22.0f, 12.25f)
                curveTo(22.0f, 11.836f, 21.664f, 11.5f, 21.25f, 11.5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 19.5f)
                horizontalLineTo(19.439f)
                lineTo(18.72f, 20.22f)
                curveTo(18.427f, 20.513f, 18.427f, 20.987f, 18.72f, 21.28f)
                curveTo(19.013f, 21.573f, 19.487f, 21.573f, 19.78f, 21.28f)
                lineTo(21.78f, 19.28f)
                curveTo(22.073f, 18.987f, 22.073f, 18.513f, 21.78f, 18.22f)
                lineTo(19.78f, 16.22f)
                curveTo(19.487f, 15.927f, 19.013f, 15.927f, 18.72f, 16.22f)
                curveTo(18.427f, 16.513f, 18.427f, 16.987f, 18.72f, 17.28f)
                lineTo(19.439f, 18.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 18.0f, 2.0f, 18.336f, 2.0f, 18.75f)
                curveTo(2.0f, 19.164f, 2.336f, 19.5f, 2.75f, 19.5f)
                close()
            }
        }
        .build()
        return _textAlignDistributed!!
    }

@Suppress("ObjectPropertyName")
private var _textAlignDistributed: ImageVector? = null

@Preview
@Composable
private fun TextAlignDistributedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextAlignDistributed, contentDescription = "TextAlignDistributed Icon")
    }
}

