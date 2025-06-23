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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.FoodCarrot: ImageVector
    get() {
        if (_FoodCarrot != null) {
            return _FoodCarrot!!
        }
        _FoodCarrot = ImageVector.Builder(
            name = "Regular.FoodCarrot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 2.75f)
                curveTo(17.5f, 2.336f, 17.164f, 2f, 16.75f, 2f)
                curveTo(16.336f, 2f, 16f, 2.336f, 16f, 2.75f)
                verticalLineTo(6.764f)
                curveTo(13.974f, 5.408f, 11.134f, 5.884f, 9.708f, 7.98f)
                lineTo(2.355f, 18.786f)
                curveTo(1.799f, 19.604f, 1.906f, 20.697f, 2.61f, 21.394f)
                curveTo(3.325f, 22.101f, 4.449f, 22.198f, 5.277f, 21.625f)
                lineTo(16.066f, 14.155f)
                curveTo(18.123f, 12.731f, 18.578f, 9.978f, 17.243f, 8f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 8f, 22f, 7.664f, 22f, 7.25f)
                curveTo(22f, 6.836f, 21.664f, 6.5f, 21.25f, 6.5f)
                horizontalLineTo(18.56f)
                lineTo(21.781f, 3.28f)
                curveTo(22.073f, 2.988f, 22.074f, 2.513f, 21.781f, 2.22f)
                curveTo(21.488f, 1.927f, 21.013f, 1.927f, 20.72f, 2.22f)
                lineTo(17.5f, 5.439f)
                verticalLineTo(2.75f)
                close()
                moveTo(10.96f, 8.813f)
                curveTo(12.022f, 7.252f, 14.26f, 7.037f, 15.606f, 8.368f)
                curveTo(16.935f, 9.683f, 16.742f, 11.867f, 15.201f, 12.933f)
                lineTo(4.413f, 20.403f)
                curveTo(4.184f, 20.561f, 3.874f, 20.534f, 3.677f, 20.339f)
                curveTo(3.482f, 20.146f, 3.453f, 19.845f, 3.606f, 19.619f)
                lineTo(10.96f, 8.813f)
                close()
            }
        }.build()

        return _FoodCarrot!!
    }

@Suppress("ObjectPropertyName")
private var _FoodCarrot: ImageVector? = null

@Preview
@Composable
private fun FoodCarrotPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FoodCarrot, contentDescription = null)
    }
}
