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
 * TextHeader1 Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Global readiness notes universal enough to not need locale specific variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_header_1_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextHeader1 icon.
 */
public val FluentIcons.Regular.TextHeader1: ImageVector
    get() {
        if (_textHeader1 != null) {
            return _textHeader1!!
        }
        _textHeader1 = Builder(name = "TextHeader1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.59f, 5.082f)
                curveTo(19.526f, 5.049f, 19.456f, 5.025f, 19.382f, 5.012f)
                curveTo(19.292f, 4.996f, 19.202f, 4.996f, 19.116f, 5.012f)
                curveTo(18.991f, 5.035f, 18.876f, 5.088f, 18.781f, 5.165f)
                curveTo(18.664f, 5.258f, 18.576f, 5.386f, 18.532f, 5.532f)
                curveTo(17.843f, 7.583f, 16.475f, 8.941f, 15.364f, 9.607f)
                curveTo(15.009f, 9.82f, 14.894f, 10.281f, 15.107f, 10.636f)
                curveTo(15.32f, 10.991f, 15.781f, 11.106f, 16.136f, 10.893f)
                curveTo(16.91f, 10.429f, 17.759f, 9.713f, 18.5f, 8.747f)
                verticalLineTo(18.25f)
                curveTo(18.5f, 18.664f, 18.836f, 19.0f, 19.25f, 19.0f)
                curveTo(19.664f, 19.0f, 20.0f, 18.664f, 20.0f, 18.25f)
                verticalLineTo(5.772f)
                curveTo(20.004f, 5.628f, 19.966f, 5.487f, 19.894f, 5.366f)
                curveTo(19.823f, 5.247f, 19.719f, 5.147f, 19.59f, 5.082f)
                close()
                moveTo(3.5f, 5.75f)
                curveTo(3.5f, 5.336f, 3.164f, 5.0f, 2.75f, 5.0f)
                curveTo(2.336f, 5.0f, 2.0f, 5.336f, 2.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(2.0f, 18.664f, 2.336f, 19.0f, 2.75f, 19.0f)
                curveTo(3.164f, 19.0f, 3.5f, 18.664f, 3.5f, 18.25f)
                verticalLineTo(12.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.25f)
                curveTo(10.0f, 18.664f, 10.336f, 19.0f, 10.75f, 19.0f)
                curveTo(11.164f, 19.0f, 11.5f, 18.664f, 11.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(11.5f, 5.336f, 11.164f, 5.0f, 10.75f, 5.0f)
                curveTo(10.336f, 5.0f, 10.0f, 5.336f, 10.0f, 5.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(5.75f)
                close()
            }
        }
        .build()
        return _textHeader1!!
    }

@Suppress("ObjectPropertyName")
private var _textHeader1: ImageVector? = null

@Preview
@Composable
private fun TextHeader1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextHeader1, contentDescription = "TextHeader1 Icon")
    }
}

