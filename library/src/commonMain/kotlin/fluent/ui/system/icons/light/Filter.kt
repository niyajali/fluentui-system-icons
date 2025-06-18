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

public val FluentUi.Light.Filter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Filter",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 8.5f)
            curveTo(3f, 8.224f, 3.224f, 8f, 3.5f, 8f)
            horizontalLineTo(28.5f)
            curveTo(28.776f, 8f, 29f, 8.224f, 29f, 8.5f)
            curveTo(29f, 8.776f, 28.776f, 9f, 28.5f, 9f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 9f, 3f, 8.776f, 3f, 8.5f)
            close()
            moveTo(7f, 15.5f)
            curveTo(7f, 15.224f, 7.224f, 15f, 7.5f, 15f)
            horizontalLineTo(24.5f)
            curveTo(24.776f, 15f, 25f, 15.224f, 25f, 15.5f)
            curveTo(25f, 15.776f, 24.776f, 16f, 24.5f, 16f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 16f, 7f, 15.776f, 7f, 15.5f)
            close()
            moveTo(11.5f, 22f)
            curveTo(11.224f, 22f, 11f, 22.224f, 11f, 22.5f)
            curveTo(11f, 22.776f, 11.224f, 23f, 11.5f, 23f)
            horizontalLineTo(20.5f)
            curveTo(20.776f, 23f, 21f, 22.776f, 21f, 22.5f)
            curveTo(21f, 22.224f, 20.776f, 22f, 20.5f, 22f)
            horizontalLineTo(11.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FilterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Filter, contentDescription = null)
    }
}
