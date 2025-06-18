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

public val FluentUi.Filled.SearchVisual: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SearchVisual",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.5f)
            curveTo(3f, 4.567f, 4.567f, 3f, 6.5f, 3f)
            horizontalLineTo(9f)
            curveTo(9.552f, 3f, 10f, 3.448f, 10f, 4f)
            curveTo(10f, 4.552f, 9.552f, 5f, 9f, 5f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 5f, 5f, 5.672f, 5f, 6.5f)
            verticalLineTo(9f)
            curveTo(5f, 9.552f, 4.552f, 10f, 4f, 10f)
            curveTo(3.448f, 10f, 3f, 9.552f, 3f, 9f)
            verticalLineTo(6.5f)
            close()
            moveTo(21f, 17.5f)
            curveTo(21f, 19.433f, 19.433f, 21f, 17.5f, 21f)
            horizontalLineTo(15f)
            curveTo(14.448f, 21f, 14f, 20.552f, 14f, 20f)
            curveTo(14f, 19.448f, 14.448f, 19f, 15f, 19f)
            lineTo(17.5f, 19f)
            curveTo(18.328f, 19f, 19f, 18.328f, 19f, 17.5f)
            verticalLineTo(15f)
            curveTo(19f, 14.448f, 19.448f, 14f, 20f, 14f)
            curveTo(20.552f, 14f, 21f, 14.448f, 21f, 15f)
            verticalLineTo(17.5f)
            close()
            moveTo(21f, 6.5f)
            curveTo(21f, 4.567f, 19.433f, 3f, 17.5f, 3f)
            horizontalLineTo(15f)
            curveTo(14.448f, 3f, 14f, 3.448f, 14f, 4f)
            curveTo(14f, 4.552f, 14.448f, 5f, 15f, 5f)
            horizontalLineTo(17.5f)
            curveTo(18.328f, 5f, 19f, 5.672f, 19f, 6.5f)
            verticalLineTo(9f)
            curveTo(19f, 9.552f, 19.448f, 10f, 20f, 10f)
            curveTo(20.552f, 10f, 21f, 9.552f, 21f, 9f)
            verticalLineTo(6.5f)
            close()
            moveTo(6.5f, 21f)
            curveTo(4.567f, 21f, 3f, 19.433f, 3f, 17.5f)
            verticalLineTo(15f)
            curveTo(3f, 14.448f, 3.448f, 14f, 4f, 14f)
            curveTo(4.552f, 14f, 5f, 14.448f, 5f, 15f)
            lineTo(5f, 17.5f)
            curveTo(5f, 18.328f, 5.672f, 19f, 6.5f, 19f)
            horizontalLineTo(9f)
            curveTo(9.552f, 19f, 10f, 19.448f, 10f, 20f)
            curveTo(10f, 20.552f, 9.552f, 21f, 9f, 21f)
            horizontalLineTo(6.5f)
            close()
            moveTo(12f, 15f)
            curveTo(13.657f, 15f, 15f, 13.657f, 15f, 12f)
            curveTo(15f, 10.343f, 13.657f, 9f, 12f, 9f)
            curveTo(10.343f, 9f, 9f, 10.343f, 9f, 12f)
            curveTo(9f, 13.657f, 10.343f, 15f, 12f, 15f)
            close()
            moveTo(7.5f, 8.75f)
            curveTo(8.19f, 8.75f, 8.75f, 8.19f, 8.75f, 7.5f)
            curveTo(8.75f, 6.81f, 8.19f, 6.25f, 7.5f, 6.25f)
            curveTo(6.81f, 6.25f, 6.25f, 6.81f, 6.25f, 7.5f)
            curveTo(6.25f, 8.19f, 6.81f, 8.75f, 7.5f, 8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SearchVisualPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SearchVisual, contentDescription = null)
    }
}
