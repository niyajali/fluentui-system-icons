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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ShoppingBagTag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShoppingBagTag",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 7f)
            verticalLineTo(5f)
            curveTo(7f, 3.343f, 8.343f, 2f, 10f, 2f)
            curveTo(10.768f, 2f, 11.469f, 2.289f, 12f, 2.764f)
            curveTo(12.531f, 2.289f, 13.232f, 2f, 14f, 2f)
            curveTo(15.657f, 2f, 17f, 3.343f, 17f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(18.5f)
            curveTo(19.328f, 7f, 20f, 7.672f, 20f, 8.5f)
            verticalLineTo(12.818f)
            lineTo(19.031f, 11.864f)
            curveTo(18.869f, 11.704f, 18.691f, 11.565f, 18.5f, 11.447f)
            verticalLineTo(8.5f)
            horizontalLineTo(14.51f)
            verticalLineTo(11.002f)
            lineTo(14.001f, 11.002f)
            curveTo(13.654f, 11.002f, 13.32f, 11.061f, 13.01f, 11.17f)
            verticalLineTo(8.5f)
            horizontalLineTo(5.5f)
            verticalLineTo(18f)
            curveTo(5.5f, 19.381f, 6.619f, 20.5f, 8f, 20.5f)
            horizontalLineTo(13.3f)
            lineTo(14.774f, 22f)
            horizontalLineTo(8f)
            curveTo(5.791f, 22f, 4f, 20.209f, 4f, 18f)
            verticalLineTo(8.5f)
            curveTo(4f, 7.672f, 4.672f, 7f, 5.5f, 7f)
            horizontalLineTo(7f)
            close()
            moveTo(11.5f, 7f)
            verticalLineTo(5f)
            curveTo(11.5f, 4.172f, 10.828f, 3.5f, 10f, 3.5f)
            curveTo(9.172f, 3.5f, 8.5f, 4.172f, 8.5f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(11.5f)
            close()
            moveTo(13f, 7f)
            horizontalLineTo(15.5f)
            verticalLineTo(5f)
            curveTo(15.5f, 4.172f, 14.828f, 3.5f, 14f, 3.5f)
            curveTo(13.535f, 3.5f, 13.12f, 3.712f, 12.844f, 4.044f)
            curveTo(12.945f, 4.344f, 13f, 4.666f, 13f, 5f)
            verticalLineTo(7f)
            close()
            moveTo(12.572f, 18.332f)
            lineTo(16.573f, 22.404f)
            curveTo(17.354f, 23.199f, 18.637f, 23.205f, 19.425f, 22.416f)
            lineTo(22.418f, 19.42f)
            curveTo(23.201f, 18.636f, 23.195f, 17.368f, 22.406f, 16.591f)
            lineTo(18.33f, 12.577f)
            curveTo(17.954f, 12.207f, 17.447f, 12f, 16.92f, 12f)
            lineTo(14.002f, 12.002f)
            curveTo(12.896f, 12.003f, 12f, 12.896f, 12f, 13.998f)
            verticalLineTo(16.935f)
            curveTo(12f, 17.457f, 12.205f, 17.959f, 12.572f, 18.332f)
            close()
            moveTo(15.996f, 15f)
            curveTo(15.996f, 15.552f, 15.549f, 16f, 14.997f, 16f)
            curveTo(14.445f, 16f, 13.998f, 15.552f, 13.998f, 15f)
            curveTo(13.998f, 14.448f, 14.445f, 14f, 14.997f, 14f)
            curveTo(15.549f, 14f, 15.996f, 14.448f, 15.996f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShoppingBagTagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShoppingBagTag, contentDescription = null)
    }
}
