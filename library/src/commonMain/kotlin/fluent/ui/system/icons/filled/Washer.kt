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

public val FluentUi.Filled.Washer: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Washer",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.25f, 13.75f)
            curveTo(8.25f, 11.679f, 9.929f, 10f, 12f, 10f)
            curveTo(13.853f, 10f, 15.392f, 11.344f, 15.696f, 13.111f)
            curveTo(15.53f, 13.263f, 15.333f, 13.408f, 15.058f, 13.527f)
            curveTo(14.524f, 13.758f, 13.642f, 13.895f, 12.121f, 13.515f)
            curveTo(10.424f, 13.091f, 9.28f, 13.343f, 8.48f, 13.839f)
            curveTo(8.402f, 13.888f, 8.328f, 13.938f, 8.258f, 13.99f)
            curveTo(8.253f, 13.91f, 8.25f, 13.83f, 8.25f, 13.75f)
            close()
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(8f, 7.25f)
            curveTo(7.448f, 7.25f, 7f, 6.802f, 7f, 6.25f)
            curveTo(7f, 5.698f, 7.448f, 5.25f, 8f, 5.25f)
            curveTo(8.552f, 5.25f, 9f, 5.698f, 9f, 6.25f)
            curveTo(9f, 6.802f, 8.552f, 7.25f, 8f, 7.25f)
            close()
            moveTo(12f, 6.25f)
            curveTo(12f, 5.836f, 12.336f, 5.5f, 12.75f, 5.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 5.5f, 17f, 5.836f, 17f, 6.25f)
            curveTo(17f, 6.664f, 16.664f, 7f, 16.25f, 7f)
            horizontalLineTo(12.75f)
            curveTo(12.336f, 7f, 12f, 6.664f, 12f, 6.25f)
            close()
            moveTo(12f, 8.5f)
            curveTo(14.899f, 8.5f, 17.25f, 10.851f, 17.25f, 13.75f)
            curveTo(17.25f, 16.649f, 14.899f, 19f, 12f, 19f)
            curveTo(9.101f, 19f, 6.75f, 16.649f, 6.75f, 13.75f)
            curveTo(6.75f, 10.851f, 9.101f, 8.5f, 12f, 8.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WasherPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Washer, contentDescription = null)
    }
}
