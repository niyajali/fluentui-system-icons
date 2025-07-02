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
 * DrinkBottle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: drink, bottle
 * - Source: ic_fluent_drink_bottle_20_filled.svg
 * 
 * @return The [ImageVector] for the DrinkBottle icon.
 */
public val FluentIcons.Filled.DrinkBottle: ImageVector
    get() {
        if (_drinkBottle != null) {
            return _drinkBottle!!
        }
        _drinkBottle = Builder(name = "DrinkBottle", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.5f)
                curveTo(7.0f, 4.137f, 7.397f, 4.681f, 7.957f, 4.899f)
                curveTo(7.841f, 5.406f, 7.493f, 5.781f, 6.96f, 6.331f)
                lineTo(6.959f, 6.332f)
                lineTo(6.958f, 6.333f)
                curveTo(6.854f, 6.44f, 6.743f, 6.554f, 6.63f, 6.674f)
                curveTo(5.639f, 7.488f, 5.0f, 8.671f, 5.0f, 10.0f)
                curveTo(5.0f, 10.094f, 5.003f, 10.188f, 5.01f, 10.28f)
                curveTo(5.003f, 10.353f, 5.0f, 10.426f, 5.0f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(5.0f, 16.881f, 6.119f, 18.0f, 7.5f, 18.0f)
                curveTo(7.955f, 18.0f, 8.382f, 17.878f, 8.75f, 17.665f)
                curveTo(9.118f, 17.878f, 9.545f, 18.0f, 10.0f, 18.0f)
                curveTo(10.455f, 18.0f, 10.882f, 17.878f, 11.25f, 17.665f)
                curveTo(11.618f, 17.878f, 12.045f, 18.0f, 12.5f, 18.0f)
                curveTo(13.881f, 18.0f, 15.0f, 16.881f, 15.0f, 15.5f)
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
                close()
                moveTo(6.0f, 15.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.5f)
                curveTo(14.0f, 16.328f, 13.328f, 17.0f, 12.5f, 17.0f)
                curveTo(12.145f, 17.0f, 11.82f, 16.877f, 11.563f, 16.671f)
                curveTo(11.38f, 16.525f, 11.12f, 16.525f, 10.937f, 16.671f)
                curveTo(10.68f, 16.877f, 10.355f, 17.0f, 10.0f, 17.0f)
                curveTo(9.645f, 17.0f, 9.32f, 16.877f, 9.063f, 16.671f)
                curveTo(8.88f, 16.525f, 8.62f, 16.525f, 8.437f, 16.671f)
                curveTo(8.18f, 16.877f, 7.855f, 17.0f, 7.5f, 17.0f)
                curveTo(6.672f, 17.0f, 6.0f, 16.328f, 6.0f, 15.5f)
                close()
                moveTo(8.956f, 5.0f)
                horizontalLineTo(11.046f)
                curveTo(11.211f, 5.864f, 11.79f, 6.434f, 12.323f, 6.959f)
                lineTo(12.365f, 7.0f)
                horizontalLineTo(7.704f)
                lineTo(7.717f, 6.987f)
                curveTo(8.242f, 6.446f, 8.799f, 5.872f, 8.956f, 5.0f)
                close()
                moveTo(11.5f, 4.0f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 4.0f, 8.0f, 3.776f, 8.0f, 3.5f)
                curveTo(8.0f, 3.224f, 8.224f, 3.0f, 8.5f, 3.0f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 3.0f, 12.0f, 3.224f, 12.0f, 3.5f)
                curveTo(12.0f, 3.776f, 11.776f, 4.0f, 11.5f, 4.0f)
                close()
            }
        }
        .build()
        return _drinkBottle!!
    }

@Suppress("ObjectPropertyName")
private var _drinkBottle: ImageVector? = null

@Preview
@Composable
private fun DrinkBottlePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DrinkBottle, contentDescription = null)
    }
}

