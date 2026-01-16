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

package fluent.ui.system.icons.light

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
 * DismissSquare Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon
 * - Description: Used in scenarios where UI is closed, dismissed, or removed.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_dismiss_square_32_light.svg)
 * 
 * @return The [ImageVector] for the DismissSquare icon.
 */
public val FluentIcons.Light.DismissSquare: ImageVector
    get() {
        if (_dismissSquare != null) {
            return _dismissSquare!!
        }
        _dismissSquare = Builder(name = "DismissSquare", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.5f, 3.0f)
                curveTo(26.985f, 3.0f, 29.0f, 5.015f, 29.0f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(29.0f, 26.985f, 26.985f, 29.0f, 24.5f, 29.0f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 29.0f, 3.0f, 26.985f, 3.0f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 5.015f, 5.015f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(24.5f)
                close()
                moveTo(7.5f, 4.0f)
                curveTo(5.567f, 4.0f, 4.0f, 5.567f, 4.0f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(4.0f, 26.433f, 5.567f, 28.0f, 7.5f, 28.0f)
                horizontalLineTo(24.5f)
                curveTo(26.433f, 28.0f, 28.0f, 26.433f, 28.0f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(28.0f, 5.567f, 26.433f, 4.0f, 24.5f, 4.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(21.146f, 10.146f)
                curveTo(21.342f, 9.951f, 21.658f, 9.951f, 21.854f, 10.146f)
                curveTo(22.049f, 10.342f, 22.049f, 10.658f, 21.854f, 10.854f)
                lineTo(16.707f, 16.0f)
                lineTo(21.854f, 21.146f)
                curveTo(22.049f, 21.342f, 22.049f, 21.658f, 21.854f, 21.854f)
                curveTo(21.658f, 22.049f, 21.342f, 22.049f, 21.146f, 21.854f)
                lineTo(16.0f, 16.707f)
                lineTo(10.854f, 21.854f)
                curveTo(10.658f, 22.049f, 10.342f, 22.049f, 10.146f, 21.854f)
                curveTo(9.951f, 21.658f, 9.951f, 21.342f, 10.146f, 21.146f)
                lineTo(15.293f, 16.0f)
                lineTo(10.146f, 10.854f)
                curveTo(9.951f, 10.658f, 9.951f, 10.342f, 10.146f, 10.146f)
                curveTo(10.342f, 9.951f, 10.658f, 9.951f, 10.854f, 10.146f)
                lineTo(16.0f, 15.293f)
                lineTo(21.146f, 10.146f)
                close()
            }
        }
        .build()
        return _dismissSquare!!
    }

@Suppress("ObjectPropertyName")
private var _dismissSquare: ImageVector? = null

@Preview
@Composable
private fun DismissSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.DismissSquare, contentDescription = "DismissSquare Icon")
    }
}

