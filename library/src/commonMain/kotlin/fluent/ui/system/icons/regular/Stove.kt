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
 * Stove Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a stove being used for cooking or heating.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_stove_20_regular.svg)
 * 
 * @return The [ImageVector] for the Stove icon.
 */
public val FluentIcons.Regular.Stove: ImageVector
    get() {
        if (_stove != null) {
            return _stove!!
        }
        _stove = Builder(name = "Stove", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 15.0f)
                curveTo(14.328f, 15.0f, 15.0f, 15.672f, 15.0f, 16.5f)
                curveTo(15.0f, 17.328f, 14.328f, 18.0f, 13.5f, 18.0f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 18.0f, 5.0f, 17.328f, 5.0f, 16.5f)
                curveTo(5.0f, 15.672f, 5.672f, 15.0f, 6.5f, 15.0f)
                horizontalLineTo(13.5f)
                close()
                moveTo(6.5f, 16.0f)
                curveTo(6.224f, 16.0f, 6.0f, 16.224f, 6.0f, 16.5f)
                curveTo(6.0f, 16.776f, 6.224f, 17.0f, 6.5f, 17.0f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 17.0f, 14.0f, 16.776f, 14.0f, 16.5f)
                curveTo(14.0f, 16.224f, 13.776f, 16.0f, 13.5f, 16.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(17.5f, 7.0f)
                curveTo(18.328f, 7.0f, 19.0f, 7.672f, 19.0f, 8.5f)
                curveTo(19.0f, 9.328f, 18.328f, 10.0f, 17.5f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                curveTo(15.0f, 12.657f, 13.657f, 14.0f, 12.0f, 14.0f)
                horizontalLineTo(8.0f)
                curveTo(6.343f, 14.0f, 5.0f, 12.657f, 5.0f, 11.0f)
                verticalLineTo(8.5f)
                curveTo(5.0f, 7.672f, 5.672f, 7.0f, 6.5f, 7.0f)
                horizontalLineTo(17.5f)
                close()
                moveTo(6.5f, 8.0f)
                curveTo(6.224f, 8.0f, 6.0f, 8.224f, 6.0f, 8.5f)
                verticalLineTo(11.0f)
                curveTo(6.0f, 12.105f, 6.895f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(12.0f)
                curveTo(13.105f, 13.0f, 14.0f, 12.105f, 14.0f, 11.0f)
                verticalLineTo(8.5f)
                curveTo(14.0f, 8.224f, 13.776f, 8.0f, 13.5f, 8.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(14.913f, 8.0f)
                curveTo(14.969f, 8.157f, 15.0f, 8.325f, 15.0f, 8.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 9.0f, 18.0f, 8.776f, 18.0f, 8.5f)
                curveTo(18.0f, 8.224f, 17.776f, 8.0f, 17.5f, 8.0f)
                horizontalLineTo(14.913f)
                close()
                moveTo(5.5f, 2.0f)
                curveTo(5.776f, 2.0f, 6.0f, 2.224f, 6.0f, 2.5f)
                curveTo(6.0f, 2.969f, 6.274f, 3.206f, 6.8f, 3.6f)
                lineTo(6.84f, 3.63f)
                curveTo(7.314f, 3.985f, 8.0f, 4.498f, 8.0f, 5.5f)
                curveTo(8.0f, 5.776f, 7.776f, 6.0f, 7.5f, 6.0f)
                curveTo(7.224f, 6.0f, 7.0f, 5.776f, 7.0f, 5.5f)
                curveTo(7.0f, 5.031f, 6.726f, 4.794f, 6.2f, 4.4f)
                lineTo(6.16f, 4.37f)
                curveTo(5.686f, 4.015f, 5.0f, 3.502f, 5.0f, 2.5f)
                curveTo(5.0f, 2.224f, 5.224f, 2.0f, 5.5f, 2.0f)
                close()
                moveTo(8.5f, 2.0f)
                curveTo(8.776f, 2.0f, 9.0f, 2.224f, 9.0f, 2.5f)
                curveTo(9.0f, 2.969f, 9.274f, 3.206f, 9.8f, 3.6f)
                lineTo(9.84f, 3.63f)
                curveTo(10.314f, 3.985f, 11.0f, 4.498f, 11.0f, 5.5f)
                curveTo(11.0f, 5.776f, 10.776f, 6.0f, 10.5f, 6.0f)
                curveTo(10.224f, 6.0f, 10.0f, 5.776f, 10.0f, 5.5f)
                curveTo(10.0f, 5.031f, 9.726f, 4.794f, 9.2f, 4.4f)
                lineTo(9.16f, 4.37f)
                curveTo(8.686f, 4.015f, 8.0f, 3.502f, 8.0f, 2.5f)
                curveTo(8.0f, 2.224f, 8.224f, 2.0f, 8.5f, 2.0f)
                close()
                moveTo(11.5f, 2.0f)
                curveTo(11.776f, 2.0f, 12.0f, 2.224f, 12.0f, 2.5f)
                curveTo(12.0f, 2.969f, 12.274f, 3.206f, 12.8f, 3.6f)
                lineTo(12.84f, 3.63f)
                curveTo(13.314f, 3.985f, 14.0f, 4.498f, 14.0f, 5.5f)
                curveTo(14.0f, 5.776f, 13.776f, 6.0f, 13.5f, 6.0f)
                curveTo(13.224f, 6.0f, 13.0f, 5.776f, 13.0f, 5.5f)
                curveTo(13.0f, 5.031f, 12.726f, 4.794f, 12.2f, 4.4f)
                lineTo(12.16f, 4.37f)
                curveTo(11.686f, 4.015f, 11.0f, 3.502f, 11.0f, 2.5f)
                curveTo(11.0f, 2.224f, 11.224f, 2.0f, 11.5f, 2.0f)
                close()
            }
        }
        .build()
        return _stove!!
    }

@Suppress("ObjectPropertyName")
private var _stove: ImageVector? = null

@Preview
@Composable
private fun StovePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Stove, contentDescription = "Stove Icon")
    }
}

