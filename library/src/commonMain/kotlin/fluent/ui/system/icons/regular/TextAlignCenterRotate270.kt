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
 * TextAlignCenterRotate270 Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in aligning blocks of text scenarios. Contains variants for Left, Center, Right, Justify, Justify Low, Distributed, and Rotate 90 & 270 scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_align_center_rotate_270_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextAlignCenterRotate270 icon.
 */
public val FluentIcons.Regular.TextAlignCenterRotate270: ImageVector
    get() {
        if (_textAlignCenterRotate270 != null) {
            return _textAlignCenterRotate270!!
        }
        _textAlignCenterRotate270 = Builder(name = "TextAlignCenterRotate270", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.75f, 20.0f)
                curveTo(5.336f, 20.0f, 5.0f, 19.664f, 5.0f, 19.25f)
                verticalLineTo(4.75f)
                curveTo(5.0f, 4.336f, 5.336f, 4.0f, 5.75f, 4.0f)
                curveTo(6.164f, 4.0f, 6.5f, 4.336f, 6.5f, 4.75f)
                verticalLineTo(19.25f)
                curveTo(6.5f, 19.664f, 6.164f, 20.0f, 5.75f, 20.0f)
                close()
                moveTo(18.75f, 18.0f)
                curveTo(18.336f, 18.0f, 18.0f, 17.664f, 18.0f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(18.0f, 6.336f, 18.336f, 6.0f, 18.75f, 6.0f)
                curveTo(19.164f, 6.0f, 19.5f, 6.336f, 19.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(19.5f, 17.664f, 19.164f, 18.0f, 18.75f, 18.0f)
                close()
                moveTo(11.5f, 21.25f)
                curveTo(11.5f, 21.664f, 11.836f, 22.0f, 12.25f, 22.0f)
                curveTo(12.664f, 22.0f, 13.0f, 21.664f, 13.0f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(13.0f, 2.336f, 12.664f, 2.0f, 12.25f, 2.0f)
                curveTo(11.836f, 2.0f, 11.5f, 2.336f, 11.5f, 2.75f)
                verticalLineTo(21.25f)
                close()
            }
        }
        .build()
        return _textAlignCenterRotate270!!
    }

@Suppress("ObjectPropertyName")
private var _textAlignCenterRotate270: ImageVector? = null

@Preview
@Composable
private fun TextAlignCenterRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextAlignCenterRotate270, contentDescription = "TextAlignCenterRotate270 Icon")
    }
}

