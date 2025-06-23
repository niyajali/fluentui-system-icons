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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Light.ShieldError: ImageVector
    get() {
        if (_ShieldError != null) {
            return _ShieldError!!
        }
        _ShieldError = ImageVector.Builder(
            name = "Light.ShieldError",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16f, 8f)
                curveTo(16.276f, 8f, 16.5f, 8.224f, 16.5f, 8.5f)
                verticalLineTo(18.5f)
                curveTo(16.5f, 18.776f, 16.276f, 19f, 16f, 19f)
                curveTo(15.724f, 19f, 15.5f, 18.776f, 15.5f, 18.5f)
                verticalLineTo(8.5f)
                curveTo(15.5f, 8.224f, 15.724f, 8f, 16f, 8f)
                close()
                moveTo(17f, 23f)
                curveTo(17f, 23.552f, 16.552f, 24f, 16f, 24f)
                curveTo(15.448f, 24f, 15f, 23.552f, 15f, 23f)
                curveTo(15f, 22.448f, 15.448f, 22f, 16f, 22f)
                curveTo(16.552f, 22f, 17f, 22.448f, 17f, 23f)
                close()
                moveTo(16.332f, 2.126f)
                curveTo(16.143f, 1.958f, 15.857f, 1.958f, 15.668f, 2.126f)
                curveTo(13.501f, 4.053f, 10.46f, 5.277f, 7.922f, 6.02f)
                curveTo(6.456f, 6.449f, 4.953f, 6.8f, 3.438f, 7.004f)
                curveTo(3.188f, 7.035f, 3f, 7.248f, 3f, 7.5f)
                verticalLineTo(16f)
                curveTo(3f, 19.939f, 5.102f, 23.189f, 7.728f, 25.559f)
                curveTo(10.35f, 27.926f, 13.552f, 29.468f, 15.892f, 29.988f)
                curveTo(15.963f, 30.004f, 16.037f, 30.004f, 16.108f, 29.988f)
                curveTo(18.448f, 29.468f, 21.65f, 27.926f, 24.272f, 25.559f)
                curveTo(26.898f, 23.189f, 29f, 19.939f, 29f, 16f)
                verticalLineTo(7.5f)
                curveTo(29f, 7.248f, 28.806f, 7.035f, 28.558f, 7.003f)
                curveTo(27.044f, 6.799f, 25.542f, 6.449f, 24.078f, 6.02f)
                curveTo(21.54f, 5.277f, 18.499f, 4.053f, 16.332f, 2.126f)
                close()
                moveTo(28f, 16f)
                curveTo(28f, 19.561f, 26.102f, 22.561f, 23.603f, 24.816f)
                curveTo(21.142f, 27.037f, 18.153f, 28.483f, 16f, 28.987f)
                curveTo(13.847f, 28.483f, 10.858f, 27.037f, 8.397f, 24.816f)
                curveTo(5.898f, 22.561f, 4f, 19.561f, 4f, 16f)
                verticalLineTo(7.932f)
                curveTo(4.733f, 7.817f, 6.316f, 7.532f, 8.203f, 6.98f)
                curveTo(10.669f, 6.258f, 13.701f, 5.065f, 16f, 3.159f)
                curveTo(18.299f, 5.065f, 21.331f, 6.258f, 23.797f, 6.98f)
                curveTo(25.684f, 7.532f, 27.267f, 7.817f, 28f, 7.932f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ShieldError!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldError: ImageVector? = null

@Preview
@Composable
private fun ShieldErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.ShieldError, contentDescription = null)
    }
}
