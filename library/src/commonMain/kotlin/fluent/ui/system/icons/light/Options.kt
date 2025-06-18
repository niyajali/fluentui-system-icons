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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Light.Options: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Options",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.5f, 10f)
            horizontalLineTo(16.028f)
            curveTo(16.276f, 12.25f, 18.184f, 14f, 20.5f, 14f)
            curveTo(22.816f, 14f, 24.724f, 12.25f, 24.972f, 10f)
            horizontalLineTo(29.5f)
            curveTo(29.776f, 10f, 30f, 9.776f, 30f, 9.5f)
            curveTo(30f, 9.224f, 29.776f, 9f, 29.5f, 9f)
            horizontalLineTo(24.972f)
            curveTo(24.724f, 6.75f, 22.816f, 5f, 20.5f, 5f)
            curveTo(18.184f, 5f, 16.276f, 6.75f, 16.028f, 9f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 9f, 2f, 9.224f, 2f, 9.5f)
            curveTo(2f, 9.776f, 2.224f, 10f, 2.5f, 10f)
            close()
            moveTo(20.5f, 6f)
            curveTo(22.433f, 6f, 24f, 7.567f, 24f, 9.5f)
            curveTo(24f, 11.433f, 22.433f, 13f, 20.5f, 13f)
            curveTo(18.567f, 13f, 17f, 11.433f, 17f, 9.5f)
            curveTo(17f, 7.567f, 18.567f, 6f, 20.5f, 6f)
            close()
            moveTo(15.972f, 23f)
            curveTo(15.724f, 25.25f, 13.816f, 27f, 11.5f, 27f)
            curveTo(9.184f, 27f, 7.276f, 25.25f, 7.027f, 23f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 23f, 2f, 22.776f, 2f, 22.5f)
            curveTo(2f, 22.224f, 2.224f, 22f, 2.5f, 22f)
            horizontalLineTo(7.027f)
            curveTo(7.276f, 19.75f, 9.184f, 18f, 11.5f, 18f)
            curveTo(13.816f, 18f, 15.724f, 19.75f, 15.972f, 22f)
            horizontalLineTo(29.5f)
            curveTo(29.776f, 22f, 30f, 22.224f, 30f, 22.5f)
            curveTo(30f, 22.776f, 29.776f, 23f, 29.5f, 23f)
            horizontalLineTo(15.972f)
            close()
            moveTo(8f, 22.5f)
            curveTo(8f, 24.433f, 9.567f, 26f, 11.5f, 26f)
            curveTo(13.433f, 26f, 15f, 24.433f, 15f, 22.5f)
            curveTo(15f, 20.567f, 13.433f, 19f, 11.5f, 19f)
            curveTo(9.567f, 19f, 8f, 20.567f, 8f, 22.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OptionsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Options, contentDescription = null)
    }
}
