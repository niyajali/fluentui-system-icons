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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Light.PaintBrush: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PaintBrush",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 2f)
            curveTo(6.448f, 2f, 6f, 2.448f, 6f, 3f)
            verticalLineTo(18.5f)
            curveTo(6f, 20.433f, 7.567f, 22f, 9.5f, 22f)
            horizontalLineTo(12f)
            verticalLineTo(26f)
            curveTo(12f, 28.209f, 13.791f, 30f, 16f, 30f)
            curveTo(18.209f, 30f, 20f, 28.209f, 20f, 26f)
            verticalLineTo(22f)
            horizontalLineTo(22.5f)
            curveTo(24.433f, 22f, 26f, 20.433f, 26f, 18.5f)
            verticalLineTo(3f)
            curveTo(26f, 2.448f, 25.552f, 2f, 25f, 2f)
            horizontalLineTo(7f)
            close()
            moveTo(18f, 3f)
            horizontalLineTo(21f)
            verticalLineTo(9.5f)
            curveTo(21f, 9.776f, 21.224f, 10f, 21.5f, 10f)
            curveTo(21.776f, 10f, 22f, 9.776f, 22f, 9.5f)
            verticalLineTo(3f)
            horizontalLineTo(25f)
            verticalLineTo(15f)
            horizontalLineTo(7f)
            verticalLineTo(3f)
            lineTo(17f, 3f)
            verticalLineTo(7.5f)
            curveTo(17f, 7.776f, 17.224f, 8f, 17.5f, 8f)
            curveTo(17.776f, 8f, 18f, 7.776f, 18f, 7.5f)
            verticalLineTo(3f)
            close()
            moveTo(7f, 16f)
            horizontalLineTo(25f)
            verticalLineTo(18.5f)
            curveTo(25f, 19.881f, 23.881f, 21f, 22.5f, 21f)
            horizontalLineTo(20f)
            curveTo(19.448f, 21f, 19f, 21.448f, 19f, 22f)
            verticalLineTo(26f)
            curveTo(19f, 27.657f, 17.657f, 29f, 16f, 29f)
            curveTo(14.343f, 29f, 13f, 27.657f, 13f, 26f)
            verticalLineTo(22f)
            curveTo(13f, 21.448f, 12.552f, 21f, 12f, 21f)
            horizontalLineTo(9.5f)
            curveTo(8.119f, 21f, 7f, 19.881f, 7f, 18.5f)
            verticalLineTo(16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaintBrushPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.PaintBrush, contentDescription = null)
    }
}
