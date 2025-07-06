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
 * LaptopDismiss Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in not connected, disconnect, or can't find device scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_laptop_dismiss_20_filled.svg)
 * 
 * @return The [ImageVector] for the LaptopDismiss icon.
 */
public val FluentIcons.Filled.LaptopDismiss: ImageVector
    get() {
        if (_laptopDismiss != null) {
            return _laptopDismiss!!
        }
        _laptopDismiss = Builder(name = "LaptopDismiss", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 5.5f)
                curveTo(11.0f, 8.538f, 8.538f, 11.0f, 5.5f, 11.0f)
                curveTo(4.6f, 11.0f, 3.75f, 10.784f, 3.0f, 10.4f)
                verticalLineTo(12.5f)
                curveTo(3.0f, 13.328f, 3.672f, 14.0f, 4.5f, 14.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 14.0f, 17.0f, 13.328f, 17.0f, 12.5f)
                verticalLineTo(6.5f)
                curveTo(17.0f, 5.672f, 16.328f, 5.0f, 15.5f, 5.0f)
                horizontalLineTo(10.978f)
                curveTo(10.992f, 5.165f, 11.0f, 5.331f, 11.0f, 5.5f)
                close()
                moveTo(2.0f, 15.5f)
                curveTo(2.0f, 15.224f, 2.224f, 15.0f, 2.5f, 15.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 15.0f, 18.0f, 15.224f, 18.0f, 15.5f)
                curveTo(18.0f, 15.776f, 17.776f, 16.0f, 17.5f, 16.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 16.0f, 2.0f, 15.776f, 2.0f, 15.5f)
                close()
                moveTo(5.5f, 10.0f)
                curveTo(7.985f, 10.0f, 10.0f, 7.985f, 10.0f, 5.5f)
                curveTo(10.0f, 3.015f, 7.985f, 1.0f, 5.5f, 1.0f)
                curveTo(3.015f, 1.0f, 1.0f, 3.015f, 1.0f, 5.5f)
                curveTo(1.0f, 7.985f, 3.015f, 10.0f, 5.5f, 10.0f)
                close()
                moveTo(7.354f, 3.646f)
                curveTo(7.549f, 3.842f, 7.549f, 4.158f, 7.354f, 4.354f)
                lineTo(6.207f, 5.5f)
                lineTo(7.354f, 6.646f)
                curveTo(7.549f, 6.842f, 7.549f, 7.158f, 7.354f, 7.354f)
                curveTo(7.158f, 7.549f, 6.842f, 7.549f, 6.646f, 7.354f)
                lineTo(5.5f, 6.207f)
                lineTo(4.354f, 7.354f)
                curveTo(4.158f, 7.549f, 3.842f, 7.549f, 3.646f, 7.354f)
                curveTo(3.451f, 7.158f, 3.451f, 6.842f, 3.646f, 6.646f)
                lineTo(4.793f, 5.5f)
                lineTo(3.646f, 4.354f)
                curveTo(3.451f, 4.158f, 3.451f, 3.842f, 3.646f, 3.646f)
                curveTo(3.842f, 3.451f, 4.158f, 3.451f, 4.354f, 3.646f)
                lineTo(5.5f, 4.793f)
                lineTo(6.646f, 3.646f)
                curveTo(6.842f, 3.451f, 7.158f, 3.451f, 7.354f, 3.646f)
                close()
            }
        }
        .build()
        return _laptopDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _laptopDismiss: ImageVector? = null

@Preview
@Composable
private fun LaptopDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LaptopDismiss, contentDescription = "LaptopDismiss Icon")
    }
}

