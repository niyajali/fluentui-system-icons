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
 * LaptopShield Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in security on laptop scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_laptop_shield_20_regular.svg)
 * 
 * @return The [ImageVector] for the LaptopShield icon.
 */
public val FluentIcons.Regular.LaptopShield: ImageVector
    get() {
        if (_laptopShield != null) {
            return _laptopShield!!
        }
        _laptopShield = Builder(name = "LaptopShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 5.895f, 3.895f, 5.0f, 5.0f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 5.0f, 17.0f, 5.895f, 17.0f, 7.0f)
                verticalLineTo(8.907f)
                curveTo(16.826f, 8.773f, 16.652f, 8.614f, 16.478f, 8.427f)
                curveTo(16.341f, 8.281f, 16.178f, 8.17f, 16.0f, 8.098f)
                verticalLineTo(7.0f)
                curveTo(16.0f, 6.448f, 15.552f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 6.0f, 4.0f, 6.448f, 4.0f, 7.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 12.552f, 4.448f, 13.0f, 5.0f, 13.0f)
                horizontalLineTo(11.002f)
                verticalLineTo(13.134f)
                lineTo(11.006f, 13.389f)
                lineTo(11.006f, 13.397f)
                curveTo(11.013f, 13.601f, 11.027f, 13.803f, 11.049f, 14.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 14.0f, 3.0f, 13.105f, 3.0f, 12.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(11.608f, 16.0f)
                curveTo(11.455f, 15.682f, 11.331f, 15.348f, 11.237f, 15.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 15.0f, 2.0f, 15.224f, 2.0f, 15.5f)
                curveTo(2.0f, 15.776f, 2.224f, 16.0f, 2.5f, 16.0f)
                horizontalLineTo(11.608f)
                close()
                moveTo(15.501f, 18.0f)
                curveTo(15.464f, 18.0f, 15.427f, 17.993f, 15.391f, 17.981f)
                curveTo(14.7f, 17.734f, 14.112f, 17.406f, 13.63f, 17.001f)
                lineTo(13.628f, 17.0f)
                curveTo(13.281f, 16.708f, 12.988f, 16.374f, 12.752f, 16.001f)
                lineTo(12.751f, 16.0f)
                curveTo(12.289f, 15.272f, 12.039f, 14.392f, 12.006f, 13.365f)
                lineTo(12.002f, 13.126f)
                verticalLineTo(10.875f)
                curveTo(12.002f, 10.668f, 12.159f, 10.5f, 12.352f, 10.5f)
                curveTo(13.422f, 10.5f, 14.385f, 10.042f, 15.255f, 9.11f)
                curveTo(15.323f, 9.037f, 15.412f, 9.0f, 15.501f, 9.0f)
                curveTo(15.59f, 9.0f, 15.679f, 9.037f, 15.747f, 9.11f)
                curveTo(16.617f, 10.042f, 17.58f, 10.5f, 18.65f, 10.5f)
                curveTo(18.843f, 10.5f, 19.0f, 10.668f, 19.0f, 10.875f)
                verticalLineTo(13.126f)
                lineTo(18.996f, 13.365f)
                curveTo(18.963f, 14.392f, 18.713f, 15.272f, 18.251f, 16.0f)
                lineTo(18.25f, 16.001f)
                curveTo(18.014f, 16.374f, 17.721f, 16.708f, 17.373f, 17.0f)
                lineTo(17.372f, 17.001f)
                curveTo(16.89f, 17.406f, 16.302f, 17.734f, 15.611f, 17.981f)
                curveTo(15.575f, 17.993f, 15.538f, 18.0f, 15.501f, 18.0f)
                close()
            }
        }
        .build()
        return _laptopShield!!
    }

@Suppress("ObjectPropertyName")
private var _laptopShield: ImageVector? = null

@Preview
@Composable
private fun LaptopShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LaptopShield, contentDescription = "LaptopShield Icon")
    }
}

