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

public val FluentIcons.Light.ImageReflection: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ImageReflection",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 9f)
            curveTo(23f, 10.105f, 22.105f, 11f, 21f, 11f)
            curveTo(19.895f, 11f, 19f, 10.105f, 19f, 9f)
            curveTo(19f, 7.895f, 19.895f, 7f, 21f, 7f)
            curveTo(22.105f, 7f, 23f, 7.895f, 23f, 9f)
            close()
            moveTo(4f, 6.5f)
            curveTo(4f, 4.015f, 6.015f, 2f, 8.5f, 2f)
            horizontalLineTo(23.5f)
            curveTo(25.985f, 2f, 28f, 4.015f, 28f, 6.5f)
            verticalLineTo(20.5f)
            curveTo(28f, 22.242f, 27.011f, 23.752f, 25.564f, 24.5f)
            curveTo(27.011f, 25.248f, 28f, 26.758f, 28f, 28.5f)
            verticalLineTo(29.5f)
            curveTo(28f, 29.776f, 27.776f, 30f, 27.5f, 30f)
            curveTo(27.224f, 30f, 27f, 29.776f, 27f, 29.5f)
            verticalLineTo(28.5f)
            curveTo(27f, 26.567f, 25.433f, 25f, 23.5f, 25f)
            horizontalLineTo(21.5f)
            curveTo(21.224f, 25f, 21f, 24.776f, 21f, 24.5f)
            curveTo(21f, 24.224f, 21.224f, 24f, 21.5f, 24f)
            horizontalLineTo(23.5f)
            curveTo(24.242f, 24f, 24.93f, 23.769f, 25.496f, 23.375f)
            lineTo(17.061f, 14.939f)
            curveTo(16.475f, 14.354f, 15.525f, 14.354f, 14.939f, 14.939f)
            lineTo(6.504f, 23.375f)
            curveTo(7.07f, 23.769f, 7.758f, 24f, 8.5f, 24f)
            horizontalLineTo(10.5f)
            curveTo(10.776f, 24f, 11f, 24.224f, 11f, 24.5f)
            curveTo(11f, 24.776f, 10.776f, 25f, 10.5f, 25f)
            horizontalLineTo(8.5f)
            curveTo(6.567f, 25f, 5f, 26.567f, 5f, 28.5f)
            verticalLineTo(29.5f)
            curveTo(5f, 29.776f, 4.776f, 30f, 4.5f, 30f)
            curveTo(4.224f, 30f, 4f, 29.776f, 4f, 29.5f)
            verticalLineTo(28.5f)
            curveTo(4f, 26.758f, 4.989f, 25.248f, 6.436f, 24.5f)
            curveTo(4.989f, 23.752f, 4f, 22.242f, 4f, 20.5f)
            verticalLineTo(6.5f)
            close()
            moveTo(5.772f, 22.693f)
            lineTo(14.232f, 14.232f)
            curveTo(15.208f, 13.256f, 16.792f, 13.256f, 17.768f, 14.232f)
            lineTo(26.228f, 22.693f)
            curveTo(26.711f, 22.093f, 27f, 21.33f, 27f, 20.5f)
            verticalLineTo(6.5f)
            curveTo(27f, 4.567f, 25.433f, 3f, 23.5f, 3f)
            horizontalLineTo(8.5f)
            curveTo(6.567f, 3f, 5f, 4.567f, 5f, 6.5f)
            verticalLineTo(20.5f)
            curveTo(5f, 21.33f, 5.289f, 22.093f, 5.772f, 22.693f)
            close()
            moveTo(17.5f, 24f)
            curveTo(17.776f, 24f, 18f, 24.224f, 18f, 24.5f)
            curveTo(18f, 24.776f, 17.776f, 25f, 17.5f, 25f)
            horizontalLineTo(14.5f)
            curveTo(14.224f, 25f, 14f, 24.776f, 14f, 24.5f)
            curveTo(14f, 24.224f, 14.224f, 24f, 14.5f, 24f)
            horizontalLineTo(17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageReflectionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.ImageReflection, contentDescription = null)
    }
}
