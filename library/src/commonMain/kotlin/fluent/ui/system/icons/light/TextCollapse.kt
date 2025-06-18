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

public val FluentUi.Light.TextCollapse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TextCollapse",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 4.5f)
            curveTo(2f, 4.224f, 2.224f, 4f, 2.5f, 4f)
            horizontalLineTo(29.5f)
            curveTo(29.776f, 4f, 30f, 4.224f, 30f, 4.5f)
            curveTo(30f, 4.776f, 29.776f, 5f, 29.5f, 5f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 5f, 2f, 4.776f, 2f, 4.5f)
            close()
            moveTo(2f, 26.5f)
            curveTo(2f, 26.224f, 2.224f, 26f, 2.5f, 26f)
            horizontalLineTo(29.5f)
            curveTo(29.776f, 26f, 30f, 26.224f, 30f, 26.5f)
            curveTo(30f, 26.776f, 29.776f, 27f, 29.5f, 27f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 27f, 2f, 26.776f, 2f, 26.5f)
            close()
            moveTo(18.5f, 11f)
            curveTo(18.224f, 11f, 18f, 11.224f, 18f, 11.5f)
            curveTo(18f, 11.776f, 18.224f, 12f, 18.5f, 12f)
            horizontalLineTo(29.5f)
            curveTo(29.776f, 12f, 30f, 11.776f, 30f, 11.5f)
            curveTo(30f, 11.224f, 29.776f, 11f, 29.5f, 11f)
            horizontalLineTo(18.5f)
            close()
            moveTo(18f, 19.5f)
            curveTo(18f, 19.224f, 18.224f, 19f, 18.5f, 19f)
            horizontalLineTo(29.5f)
            curveTo(29.776f, 19f, 30f, 19.224f, 30f, 19.5f)
            curveTo(30f, 19.776f, 29.776f, 20f, 29.5f, 20f)
            horizontalLineTo(18.5f)
            curveTo(18.224f, 20f, 18f, 19.776f, 18f, 19.5f)
            close()
            moveTo(16.5f, 16f)
            curveTo(16.5f, 20.142f, 13.142f, 23.5f, 9f, 23.5f)
            curveTo(4.858f, 23.5f, 1.5f, 20.142f, 1.5f, 16f)
            curveTo(1.5f, 11.858f, 4.858f, 8.5f, 9f, 8.5f)
            curveTo(13.142f, 8.5f, 16.5f, 11.858f, 16.5f, 16f)
            close()
            moveTo(4f, 15.75f)
            curveTo(4f, 16.164f, 4.336f, 16.5f, 4.75f, 16.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 16.5f, 14f, 16.164f, 14f, 15.75f)
            curveTo(14f, 15.336f, 13.664f, 15f, 13.25f, 15f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 15f, 4f, 15.336f, 4f, 15.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextCollapsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.TextCollapse, contentDescription = null)
    }
}
