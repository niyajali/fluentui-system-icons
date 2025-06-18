/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.Food: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Food",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.743f, 2.816f)
            curveTo(3.777f, 2.339f, 4.175f, 2f, 4.62f, 2f)
            curveTo(5.106f, 2f, 5.5f, 2.394f, 5.5f, 2.88f)
            verticalLineTo(7.374f)
            curveTo(5.5f, 7.719f, 5.78f, 7.999f, 6.125f, 7.999f)
            curveTo(6.47f, 7.999f, 6.75f, 7.719f, 6.75f, 7.374f)
            verticalLineTo(2.75f)
            curveTo(6.75f, 2.336f, 7.086f, 2f, 7.5f, 2f)
            curveTo(7.914f, 2f, 8.25f, 2.336f, 8.25f, 2.75f)
            verticalLineTo(7.374f)
            curveTo(8.25f, 7.719f, 8.53f, 7.999f, 8.875f, 7.999f)
            curveTo(9.22f, 7.999f, 9.5f, 7.719f, 9.5f, 7.374f)
            verticalLineTo(2.88f)
            curveTo(9.5f, 2.394f, 9.894f, 2f, 10.38f, 2f)
            curveTo(10.825f, 2f, 11.223f, 2.339f, 11.257f, 2.816f)
            curveTo(11.3f, 3.428f, 11.5f, 6.37f, 11.5f, 8f)
            curveTo(11.5f, 9.35f, 10.83f, 10.544f, 9.808f, 11.267f)
            curveTo(9.592f, 11.42f, 9.54f, 11.582f, 9.545f, 11.664f)
            curveTo(9.668f, 13.542f, 10f, 18.681f, 10f, 19.497f)
            curveTo(10f, 20.878f, 8.881f, 21.997f, 7.5f, 21.997f)
            curveTo(6.119f, 21.997f, 5f, 20.878f, 5f, 19.497f)
            curveTo(5f, 18.681f, 5.332f, 13.542f, 5.455f, 11.664f)
            curveTo(5.46f, 11.582f, 5.408f, 11.42f, 5.192f, 11.267f)
            curveTo(4.17f, 10.544f, 3.5f, 9.35f, 3.5f, 8f)
            curveTo(3.5f, 6.37f, 3.701f, 3.428f, 3.743f, 2.816f)
            close()
            moveTo(13f, 7.75f)
            curveTo(13f, 4.574f, 15.574f, 2f, 18.75f, 2f)
            curveTo(19.164f, 2f, 19.5f, 2.336f, 19.5f, 2.75f)
            verticalLineTo(11.25f)
            curveTo(19.5f, 11.568f, 19.606f, 13.145f, 19.725f, 14.892f)
            lineTo(19.73f, 14.974f)
            curveTo(19.859f, 16.883f, 20f, 18.958f, 20f, 19.497f)
            curveTo(20f, 20.878f, 18.881f, 21.997f, 17.5f, 21.997f)
            curveTo(16.119f, 21.997f, 15f, 20.878f, 15f, 19.497f)
            curveTo(15f, 18.983f, 15.128f, 16.885f, 15.252f, 14.963f)
            curveTo(15.314f, 13.992f, 15.377f, 13.051f, 15.424f, 12.352f)
            lineTo(15.447f, 12f)
            horizontalLineTo(14.75f)
            curveTo(13.783f, 12f, 13f, 11.217f, 13f, 10.25f)
            verticalLineTo(7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FoodPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Food, contentDescription = null)
    }
}
