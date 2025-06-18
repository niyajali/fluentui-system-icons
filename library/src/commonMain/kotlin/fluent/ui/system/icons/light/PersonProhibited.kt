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

public val FluentIcons.Light.PersonProhibited: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PersonProhibited",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 9f)
            curveTo(9f, 5.134f, 12.134f, 2f, 16f, 2f)
            curveTo(19.866f, 2f, 23f, 5.134f, 23f, 9f)
            curveTo(23f, 12.866f, 19.866f, 16f, 16f, 16f)
            curveTo(12.134f, 16f, 9f, 12.866f, 9f, 9f)
            close()
            moveTo(16f, 3f)
            curveTo(12.686f, 3f, 10f, 5.686f, 10f, 9f)
            curveTo(10f, 12.314f, 12.686f, 15f, 16f, 15f)
            curveTo(19.314f, 15f, 22f, 12.314f, 22f, 9f)
            curveTo(22f, 5.686f, 19.314f, 3f, 16f, 3f)
            close()
            moveTo(16.375f, 18f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 18f, 4f, 19.567f, 4f, 21.5f)
            verticalLineTo(22.167f)
            curveTo(4f, 24.316f, 6.766f, 30f, 16f, 30f)
            curveTo(16.426f, 30f, 16.839f, 29.988f, 17.238f, 29.965f)
            curveTo(16.927f, 29.663f, 16.638f, 29.34f, 16.373f, 28.997f)
            curveTo(16.25f, 28.999f, 16.126f, 29f, 16f, 29f)
            curveTo(7.234f, 29f, 5f, 23.684f, 5f, 22.167f)
            verticalLineTo(21.5f)
            curveTo(5f, 20.119f, 6.119f, 19f, 7.5f, 19f)
            horizontalLineTo(15.704f)
            curveTo(15.906f, 18.651f, 16.13f, 18.317f, 16.375f, 18f)
            close()
            moveTo(23.5f, 31f)
            curveTo(27.642f, 31f, 31f, 27.642f, 31f, 23.5f)
            curveTo(31f, 19.358f, 27.642f, 16f, 23.5f, 16f)
            curveTo(19.358f, 16f, 16f, 19.358f, 16f, 23.5f)
            curveTo(16f, 27.642f, 19.358f, 31f, 23.5f, 31f)
            close()
            moveTo(23.5f, 29f)
            curveTo(22.343f, 29f, 21.268f, 28.642f, 20.382f, 28.032f)
            lineTo(28.032f, 20.382f)
            curveTo(28.642f, 21.268f, 29f, 22.343f, 29f, 23.5f)
            curveTo(29f, 26.538f, 26.538f, 29f, 23.5f, 29f)
            close()
            moveTo(26.618f, 18.968f)
            lineTo(18.968f, 26.618f)
            curveTo(18.358f, 25.732f, 18f, 24.657f, 18f, 23.5f)
            curveTo(18f, 20.462f, 20.462f, 18f, 23.5f, 18f)
            curveTo(24.657f, 18f, 25.732f, 18.358f, 26.618f, 18.968f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.PersonProhibited, contentDescription = null)
    }
}
