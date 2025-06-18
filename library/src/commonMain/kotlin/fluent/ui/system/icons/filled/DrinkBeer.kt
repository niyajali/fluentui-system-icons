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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.DrinkBeer: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DrinkBeer",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.25f, 2f)
            curveTo(5.455f, 2f, 4f, 3.455f, 4f, 5.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
            horizontalLineTo(15.25f)
            curveTo(16.493f, 22f, 17.5f, 20.993f, 17.5f, 19.75f)
            verticalLineTo(18f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 18f, 22f, 16.545f, 22f, 14.75f)
            verticalLineTo(9.25f)
            curveTo(22f, 7.455f, 20.545f, 6f, 18.75f, 6f)
            horizontalLineTo(17.5f)
            verticalLineTo(5.25f)
            curveTo(17.5f, 3.455f, 16.045f, 2f, 14.25f, 2f)
            horizontalLineTo(7.25f)
            close()
            moveTo(18.75f, 16.5f)
            horizontalLineTo(17.5f)
            verticalLineTo(7.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 7.5f, 20.5f, 8.283f, 20.5f, 9.25f)
            verticalLineTo(14.75f)
            curveTo(20.5f, 15.717f, 19.716f, 16.5f, 18.75f, 16.5f)
            close()
            moveTo(16f, 6f)
            horizontalLineTo(5.5f)
            verticalLineTo(5.25f)
            curveTo(5.5f, 4.284f, 6.284f, 3.5f, 7.25f, 3.5f)
            horizontalLineTo(14.25f)
            curveTo(15.217f, 3.5f, 16f, 4.284f, 16f, 5.25f)
            verticalLineTo(6f)
            close()
            moveTo(8.5f, 10f)
            verticalLineTo(17f)
            curveTo(8.5f, 17.414f, 8.164f, 17.75f, 7.75f, 17.75f)
            curveTo(7.336f, 17.75f, 7f, 17.414f, 7f, 17f)
            verticalLineTo(10f)
            curveTo(7f, 9.586f, 7.336f, 9.25f, 7.75f, 9.25f)
            curveTo(8.164f, 9.25f, 8.5f, 9.586f, 8.5f, 10f)
            close()
            moveTo(11.5f, 10f)
            verticalLineTo(17f)
            curveTo(11.5f, 17.414f, 11.164f, 17.75f, 10.75f, 17.75f)
            curveTo(10.336f, 17.75f, 10f, 17.414f, 10f, 17f)
            verticalLineTo(10f)
            curveTo(10f, 9.586f, 10.336f, 9.25f, 10.75f, 9.25f)
            curveTo(11.164f, 9.25f, 11.5f, 9.586f, 11.5f, 10f)
            close()
            moveTo(14.5f, 10f)
            verticalLineTo(17f)
            curveTo(14.5f, 17.414f, 14.164f, 17.75f, 13.75f, 17.75f)
            curveTo(13.336f, 17.75f, 13f, 17.414f, 13f, 17f)
            verticalLineTo(10f)
            curveTo(13f, 9.586f, 13.336f, 9.25f, 13.75f, 9.25f)
            curveTo(14.164f, 9.25f, 14.5f, 9.586f, 14.5f, 10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DrinkBeerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DrinkBeer, contentDescription = null)
    }
}
