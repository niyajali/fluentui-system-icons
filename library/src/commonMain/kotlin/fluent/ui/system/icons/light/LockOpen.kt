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

public val FluentIcons.Light.LockOpen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.LockOpen",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 20f)
            curveTo(18f, 21.105f, 17.105f, 22f, 16f, 22f)
            curveTo(14.895f, 22f, 14f, 21.105f, 14f, 20f)
            curveTo(14f, 18.895f, 14.895f, 18f, 16f, 18f)
            curveTo(17.105f, 18f, 18f, 18.895f, 18f, 20f)
            close()
            moveTo(21f, 5.5f)
            curveTo(21f, 3.015f, 23.015f, 1f, 25.5f, 1f)
            curveTo(27.985f, 1f, 30f, 3.015f, 30f, 5.5f)
            verticalLineTo(7.5f)
            curveTo(30f, 7.776f, 30.224f, 8f, 30.5f, 8f)
            curveTo(30.776f, 8f, 31f, 7.776f, 31f, 7.5f)
            verticalLineTo(5.5f)
            curveTo(31f, 2.462f, 28.538f, 0f, 25.5f, 0f)
            curveTo(22.462f, 0f, 20f, 2.462f, 20f, 5.5f)
            verticalLineTo(9f)
            horizontalLineTo(8.5f)
            curveTo(6.015f, 9f, 4f, 11.015f, 4f, 13.5f)
            verticalLineTo(25.5f)
            curveTo(4f, 27.985f, 6.015f, 30f, 8.5f, 30f)
            horizontalLineTo(23.5f)
            curveTo(25.985f, 30f, 28f, 27.985f, 28f, 25.5f)
            verticalLineTo(13.5f)
            curveTo(28f, 11.015f, 25.985f, 9f, 23.5f, 9f)
            horizontalLineTo(21f)
            verticalLineTo(5.5f)
            close()
            moveTo(23.5f, 10f)
            curveTo(25.433f, 10f, 27f, 11.567f, 27f, 13.5f)
            verticalLineTo(25.5f)
            curveTo(27f, 27.433f, 25.433f, 29f, 23.5f, 29f)
            horizontalLineTo(8.5f)
            curveTo(6.567f, 29f, 5f, 27.433f, 5f, 25.5f)
            verticalLineTo(13.5f)
            curveTo(5f, 11.567f, 6.567f, 10f, 8.5f, 10f)
            horizontalLineTo(23.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LockOpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.LockOpen, contentDescription = null)
    }
}
