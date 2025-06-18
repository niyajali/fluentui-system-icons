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

public val FluentUi.Light.Delete: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Delete",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 12.5f)
            curveTo(14f, 12.224f, 13.776f, 12f, 13.5f, 12f)
            curveTo(13.224f, 12f, 13f, 12.224f, 13f, 12.5f)
            verticalLineTo(23.5f)
            curveTo(13f, 23.776f, 13.224f, 24f, 13.5f, 24f)
            curveTo(13.776f, 24f, 14f, 23.776f, 14f, 23.5f)
            verticalLineTo(12.5f)
            close()
            moveTo(18.5f, 12f)
            curveTo(18.776f, 12f, 19f, 12.224f, 19f, 12.5f)
            verticalLineTo(23.5f)
            curveTo(19f, 23.776f, 18.776f, 24f, 18.5f, 24f)
            curveTo(18.224f, 24f, 18f, 23.776f, 18f, 23.5f)
            verticalLineTo(12.5f)
            curveTo(18f, 12.224f, 18.224f, 12f, 18.5f, 12f)
            close()
            moveTo(20.5f, 6.5f)
            verticalLineTo(7f)
            horizontalLineTo(25.494f)
            curveTo(25.497f, 7f, 25.501f, 7f, 25.505f, 7f)
            horizontalLineTo(28.5f)
            curveTo(28.776f, 7f, 29f, 7.224f, 29f, 7.5f)
            curveTo(29f, 7.776f, 28.776f, 8f, 28.5f, 8f)
            horizontalLineTo(25.957f)
            lineTo(24.329f, 25.907f)
            curveTo(24.118f, 28.225f, 22.175f, 30f, 19.847f, 30f)
            horizontalLineTo(12.153f)
            curveTo(9.825f, 30f, 7.882f, 28.225f, 7.671f, 25.907f)
            lineTo(6.043f, 8f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 8f, 3f, 7.776f, 3f, 7.5f)
            curveTo(3f, 7.224f, 3.224f, 7f, 3.5f, 7f)
            horizontalLineTo(6.495f)
            curveTo(6.499f, 7f, 6.502f, 7f, 6.506f, 7f)
            horizontalLineTo(11.5f)
            verticalLineTo(6.5f)
            curveTo(11.5f, 4.015f, 13.515f, 2f, 16f, 2f)
            curveTo(18.485f, 2f, 20.5f, 4.015f, 20.5f, 6.5f)
            close()
            moveTo(12.5f, 6.5f)
            verticalLineTo(7f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.5f)
            curveTo(19.5f, 4.567f, 17.933f, 3f, 16f, 3f)
            curveTo(14.067f, 3f, 12.5f, 4.567f, 12.5f, 6.5f)
            close()
            moveTo(7.048f, 8f)
            lineTo(8.667f, 25.817f)
            curveTo(8.831f, 27.62f, 10.343f, 29f, 12.153f, 29f)
            horizontalLineTo(19.847f)
            curveTo(21.657f, 29f, 23.169f, 27.62f, 23.333f, 25.817f)
            lineTo(24.952f, 8f)
            horizontalLineTo(7.048f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DeletePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Delete, contentDescription = null)
    }
}
