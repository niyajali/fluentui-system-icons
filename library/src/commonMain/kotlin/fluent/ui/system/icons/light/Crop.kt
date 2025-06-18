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
package fluent.ui.system.icons.light

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

public val FluentUi.Light.Crop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Crop",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 2.5f)
            curveTo(8f, 2.224f, 7.776f, 2f, 7.5f, 2f)
            curveTo(7.224f, 2f, 7f, 2.224f, 7f, 2.5f)
            verticalLineTo(7f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 7f, 2f, 7.224f, 2f, 7.5f)
            curveTo(2f, 7.776f, 2.224f, 8f, 2.5f, 8f)
            horizontalLineTo(7f)
            verticalLineTo(20.5f)
            curveTo(7f, 22.985f, 9.015f, 25f, 11.5f, 25f)
            horizontalLineTo(24f)
            verticalLineTo(29.5f)
            curveTo(24f, 29.776f, 24.224f, 30f, 24.5f, 30f)
            curveTo(24.776f, 30f, 25f, 29.776f, 25f, 29.5f)
            verticalLineTo(25f)
            horizontalLineTo(29.5f)
            curveTo(29.776f, 25f, 30f, 24.776f, 30f, 24.5f)
            curveTo(30f, 24.224f, 29.776f, 24f, 29.5f, 24f)
            horizontalLineTo(11.5f)
            curveTo(9.567f, 24f, 8f, 22.433f, 8f, 20.5f)
            verticalLineTo(2.5f)
            close()
            moveTo(20.5f, 8f)
            horizontalLineTo(9.5f)
            verticalLineTo(7f)
            horizontalLineTo(20.5f)
            curveTo(22.985f, 7f, 25f, 9.015f, 25f, 11.5f)
            verticalLineTo(22.5f)
            horizontalLineTo(24f)
            verticalLineTo(11.5f)
            curveTo(24f, 9.567f, 22.433f, 8f, 20.5f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CropPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Crop, contentDescription = null)
    }
}
