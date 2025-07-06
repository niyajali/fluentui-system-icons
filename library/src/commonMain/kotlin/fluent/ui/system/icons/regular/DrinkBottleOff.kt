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
 * DrinkBottleOff Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent plastic free practices.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_drink_bottle_off_20_regular.svg)
 * 
 * @return The [ImageVector] for the DrinkBottleOff icon.
 */
public val FluentIcons.Regular.DrinkBottleOff: ImageVector
    get() {
        if (_drinkBottleOff != null) {
            return _drinkBottleOff!!
        }
        _drinkBottleOff = Builder(name = "DrinkBottleOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.282f, 6.99f)
                lineTo(2.146f, 2.854f)
                curveTo(1.951f, 2.658f, 1.951f, 2.342f, 2.146f, 2.146f)
                curveTo(2.342f, 1.951f, 2.658f, 1.951f, 2.854f, 2.146f)
                lineTo(17.854f, 17.146f)
                curveTo(18.049f, 17.342f, 18.049f, 17.658f, 17.854f, 17.854f)
                curveTo(17.658f, 18.049f, 17.342f, 18.049f, 17.146f, 17.854f)
                lineTo(14.992f, 15.699f)
                curveTo(14.891f, 16.987f, 13.814f, 18.0f, 12.5f, 18.0f)
                curveTo(12.045f, 18.0f, 11.618f, 17.878f, 11.25f, 17.665f)
                curveTo(10.882f, 17.878f, 10.455f, 18.0f, 10.0f, 18.0f)
                curveTo(9.545f, 18.0f, 9.118f, 17.878f, 8.75f, 17.665f)
                curveTo(8.382f, 17.878f, 7.955f, 18.0f, 7.5f, 18.0f)
                curveTo(6.119f, 18.0f, 5.0f, 16.881f, 5.0f, 15.5f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 10.426f, 5.003f, 10.353f, 5.01f, 10.28f)
                curveTo(5.003f, 10.188f, 5.0f, 10.094f, 5.0f, 10.0f)
                curveTo(5.0f, 8.833f, 5.492f, 7.78f, 6.282f, 6.99f)
                close()
                moveTo(13.293f, 14.0f)
                lineTo(7.293f, 8.0f)
                horizontalLineTo(6.718f)
                curveTo(6.261f, 8.572f, 6.0f, 9.263f, 6.0f, 10.0f)
                curveTo(6.0f, 10.083f, 6.003f, 10.165f, 6.01f, 10.246f)
                curveTo(6.012f, 10.277f, 6.012f, 10.308f, 6.009f, 10.339f)
                curveTo(6.003f, 10.392f, 6.0f, 10.445f, 6.0f, 10.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.293f)
                close()
                moveTo(6.0f, 15.0f)
                verticalLineTo(15.5f)
                curveTo(6.0f, 16.328f, 6.672f, 17.0f, 7.5f, 17.0f)
                curveTo(7.855f, 17.0f, 8.18f, 16.877f, 8.437f, 16.671f)
                curveTo(8.62f, 16.525f, 8.88f, 16.525f, 9.063f, 16.671f)
                curveTo(9.32f, 16.877f, 9.645f, 17.0f, 10.0f, 17.0f)
                curveTo(10.355f, 17.0f, 10.68f, 16.877f, 10.937f, 16.671f)
                curveTo(11.12f, 16.525f, 11.38f, 16.525f, 11.563f, 16.671f)
                curveTo(11.82f, 16.877f, 12.145f, 17.0f, 12.5f, 17.0f)
                curveTo(13.328f, 17.0f, 14.0f, 16.328f, 14.0f, 15.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.0f, 10.5f)
                verticalLineTo(11.879f)
                lineTo(15.0f, 12.879f)
                verticalLineTo(10.5f)
                curveTo(15.0f, 10.426f, 14.997f, 10.353f, 14.99f, 10.28f)
                curveTo(14.997f, 10.188f, 15.0f, 10.094f, 15.0f, 10.0f)
                curveTo(15.0f, 9.184f, 14.759f, 8.421f, 14.341f, 7.765f)
                curveTo(14.334f, 7.751f, 14.325f, 7.736f, 14.316f, 7.723f)
                curveTo(13.918f, 7.126f, 13.463f, 6.678f, 13.08f, 6.3f)
                lineTo(13.069f, 6.29f)
                curveTo(12.524f, 5.753f, 12.168f, 5.384f, 12.047f, 4.897f)
                curveTo(12.605f, 4.679f, 13.0f, 4.136f, 13.0f, 3.5f)
                curveTo(13.0f, 2.672f, 12.328f, 2.0f, 11.5f, 2.0f)
                horizontalLineTo(8.5f)
                curveTo(7.672f, 2.0f, 7.0f, 2.672f, 7.0f, 3.5f)
                curveTo(7.0f, 4.137f, 7.397f, 4.681f, 7.957f, 4.899f)
                curveTo(7.904f, 5.13f, 7.804f, 5.333f, 7.659f, 5.538f)
                lineTo(8.375f, 6.254f)
                curveTo(8.646f, 5.9f, 8.866f, 5.499f, 8.956f, 5.0f)
                horizontalLineTo(11.046f)
                curveTo(11.211f, 5.864f, 11.79f, 6.434f, 12.323f, 6.959f)
                lineTo(12.365f, 7.0f)
                horizontalLineTo(9.121f)
                lineTo(10.121f, 8.0f)
                horizontalLineTo(13.285f)
                curveTo(13.345f, 8.078f, 13.404f, 8.16f, 13.462f, 8.244f)
                curveTo(13.467f, 8.254f, 13.473f, 8.263f, 13.479f, 8.273f)
                curveTo(13.812f, 8.785f, 14.0f, 9.374f, 14.0f, 10.0f)
                curveTo(14.0f, 10.083f, 13.997f, 10.165f, 13.99f, 10.246f)
                curveTo(13.988f, 10.277f, 13.988f, 10.308f, 13.991f, 10.339f)
                curveTo(13.997f, 10.392f, 14.0f, 10.445f, 14.0f, 10.5f)
                close()
                moveTo(8.5f, 4.0f)
                curveTo(8.224f, 4.0f, 8.0f, 3.776f, 8.0f, 3.5f)
                curveTo(8.0f, 3.224f, 8.224f, 3.0f, 8.5f, 3.0f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 3.0f, 12.0f, 3.224f, 12.0f, 3.5f)
                curveTo(12.0f, 3.776f, 11.776f, 4.0f, 11.5f, 4.0f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _drinkBottleOff!!
    }

@Suppress("ObjectPropertyName")
private var _drinkBottleOff: ImageVector? = null

@Preview
@Composable
private fun DrinkBottleOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DrinkBottleOff, contentDescription = "DrinkBottleOff Icon")
    }
}

