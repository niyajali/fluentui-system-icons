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

public val FluentUi.Filled.City: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.City",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.75f, 2.746f)
            curveTo(12.75f, 2.332f, 12.414f, 1.996f, 12f, 1.996f)
            curveTo(11.586f, 1.996f, 11.25f, 2.332f, 11.25f, 2.746f)
            verticalLineTo(3.999f)
            horizontalLineTo(9.25f)
            curveTo(8.283f, 3.999f, 7.5f, 4.783f, 7.5f, 5.749f)
            verticalLineTo(7.904f)
            curveTo(9.019f, 7.766f, 10.5f, 8.94f, 10.5f, 10.647f)
            verticalLineTo(21.249f)
            curveTo(10.5f, 21.275f, 10.499f, 21.302f, 10.498f, 21.327f)
            verticalLineTo(21.999f)
            horizontalLineTo(13.498f)
            verticalLineTo(20.749f)
            horizontalLineTo(13.5f)
            verticalLineTo(13.249f)
            curveTo(13.5f, 11.731f, 14.731f, 10.499f, 16.25f, 10.499f)
            horizontalLineTo(16.5f)
            verticalLineTo(5.749f)
            curveTo(16.5f, 4.783f, 15.717f, 3.999f, 14.75f, 3.999f)
            horizontalLineTo(12.75f)
            verticalLineTo(2.746f)
            close()
            moveTo(14.498f, 21.999f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 21.999f, 20.5f, 21.216f, 20.5f, 20.249f)
            verticalLineTo(13.249f)
            curveTo(20.5f, 12.283f, 19.716f, 11.499f, 18.75f, 11.499f)
            horizontalLineTo(16.25f)
            curveTo(15.283f, 11.499f, 14.5f, 12.283f, 14.5f, 13.249f)
            verticalLineTo(20.749f)
            horizontalLineTo(14.498f)
            verticalLineTo(21.999f)
            close()
            moveTo(9.5f, 20.749f)
            horizontalLineTo(9.498f)
            verticalLineTo(21.3f)
            lineTo(9.498f, 21.302f)
            verticalLineTo(21.999f)
            horizontalLineTo(8.755f)
            lineTo(8.75f, 21.999f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 21.999f, 3.5f, 21.216f, 3.5f, 20.249f)
            verticalLineTo(12.289f)
            curveTo(3.5f, 11.7f, 3.797f, 11.15f, 4.289f, 10.826f)
            lineTo(6.789f, 9.185f)
            curveTo(7.953f, 8.42f, 9.5f, 9.255f, 9.5f, 10.647f)
            verticalLineTo(20.749f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.City, contentDescription = null)
    }
}
