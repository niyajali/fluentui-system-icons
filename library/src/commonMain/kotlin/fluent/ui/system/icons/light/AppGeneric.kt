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

public val FluentUi.Light.AppGeneric: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.AppGeneric",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(24.5f, 29f)
            curveTo(26.985f, 29f, 29f, 26.985f, 29f, 24.5f)
            verticalLineTo(7.5f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineTo(24.5f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineTo(24.5f)
            close()
            moveTo(4f, 7.5f)
            curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
            horizontalLineTo(24.5f)
            curveTo(26.433f, 4f, 28f, 5.567f, 28f, 7.5f)
            verticalLineTo(10f)
            horizontalLineTo(4f)
            verticalLineTo(7.5f)
            close()
            moveTo(4f, 24.5f)
            verticalLineTo(11f)
            horizontalLineTo(28f)
            verticalLineTo(24.5f)
            curveTo(28f, 26.433f, 26.433f, 28f, 24.5f, 28f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
            close()
            moveTo(9f, 14f)
            curveTo(7.895f, 14f, 7f, 14.895f, 7f, 16f)
            verticalLineTo(23f)
            curveTo(7f, 24.105f, 7.895f, 25f, 9f, 25f)
            horizontalLineTo(12f)
            curveTo(13.105f, 25f, 14f, 24.105f, 14f, 23f)
            verticalLineTo(16f)
            curveTo(14f, 14.895f, 13.105f, 14f, 12f, 14f)
            horizontalLineTo(9f)
            close()
            moveTo(8f, 16f)
            curveTo(8f, 15.448f, 8.448f, 15f, 9f, 15f)
            horizontalLineTo(12f)
            curveTo(12.552f, 15f, 13f, 15.448f, 13f, 16f)
            verticalLineTo(23f)
            curveTo(13f, 23.552f, 12.552f, 24f, 12f, 24f)
            horizontalLineTo(9f)
            curveTo(8.448f, 24f, 8f, 23.552f, 8f, 23f)
            verticalLineTo(16f)
            close()
            moveTo(16f, 15.5f)
            curveTo(16f, 15.224f, 16.224f, 15f, 16.5f, 15f)
            horizontalLineTo(24.5f)
            curveTo(24.776f, 15f, 25f, 15.224f, 25f, 15.5f)
            curveTo(25f, 15.776f, 24.776f, 16f, 24.5f, 16f)
            horizontalLineTo(16.5f)
            curveTo(16.224f, 16f, 16f, 15.776f, 16f, 15.5f)
            close()
            moveTo(16.5f, 19f)
            curveTo(16.224f, 19f, 16f, 19.224f, 16f, 19.5f)
            curveTo(16f, 19.776f, 16.224f, 20f, 16.5f, 20f)
            horizontalLineTo(22.5f)
            curveTo(22.776f, 20f, 23f, 19.776f, 23f, 19.5f)
            curveTo(23f, 19.224f, 22.776f, 19f, 22.5f, 19f)
            horizontalLineTo(16.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppGenericPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.AppGeneric, contentDescription = null)
    }
}
