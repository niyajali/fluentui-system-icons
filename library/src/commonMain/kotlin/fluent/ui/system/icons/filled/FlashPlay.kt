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

package fluent.ui.system.icons.filled

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
 * FlashPlay Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in flash scenarios for cameras & in general intelligence for processes (AI).
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_flash_play_20_filled.svg)
 * 
 * @return The [ImageVector] for the FlashPlay icon.
 */
public val FluentIcons.Filled.FlashPlay: ImageVector
    get() {
        if (_flashPlay != null) {
            return _flashPlay!!
        }
        _flashPlay = Builder(name = "FlashPlay", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.213f, 2.0f)
                curveTo(6.739f, 2.0f, 6.322f, 2.314f, 6.192f, 2.771f)
                lineTo(3.942f, 10.644f)
                curveTo(3.748f, 11.323f, 4.258f, 11.998f, 4.963f, 11.998f)
                horizontalLineTo(6.231f)
                lineTo(5.061f, 16.677f)
                curveTo(4.797f, 17.733f, 6.102f, 18.455f, 6.856f, 17.673f)
                lineTo(9.075f, 15.408f)
                curveTo(9.026f, 15.113f, 9.0f, 14.809f, 9.0f, 14.5f)
                curveTo(9.0f, 11.462f, 11.462f, 9.0f, 14.5f, 9.0f)
                curveTo(14.77f, 9.0f, 15.036f, 9.019f, 15.296f, 9.057f)
                lineTo(15.533f, 8.815f)
                lineTo(15.536f, 8.811f)
                curveTo(16.177f, 8.144f, 15.716f, 7.0f, 14.77f, 7.0f)
                horizontalLineTo(12.206f)
                lineTo(13.467f, 3.406f)
                lineTo(13.47f, 3.398f)
                curveTo(13.699f, 2.71f, 13.187f, 2.0f, 12.462f, 2.0f)
                horizontalLineTo(7.213f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(16.713f, 14.063f)
                lineTo(13.743f, 12.413f)
                curveTo(13.41f, 12.227f, 13.0f, 12.469f, 13.0f, 12.85f)
                lineTo(13.0f, 16.15f)
                curveTo(13.0f, 16.531f, 13.41f, 16.772f, 13.743f, 16.587f)
                lineTo(16.713f, 14.937f)
                curveTo(17.056f, 14.747f, 17.056f, 14.253f, 16.713f, 14.063f)
                close()
            }
        }
        .build()
        return _flashPlay!!
    }

@Suppress("ObjectPropertyName")
private var _flashPlay: ImageVector? = null

@Preview
@Composable
private fun FlashPlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FlashPlay, contentDescription = "FlashPlay Icon")
    }
}

