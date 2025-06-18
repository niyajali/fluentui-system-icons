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

public val FluentIcons.Light.Calendar3Day: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Calendar3Day",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 9.5f)
            curveTo(10f, 9.224f, 9.776f, 9f, 9.5f, 9f)
            curveTo(9.224f, 9f, 9f, 9.224f, 9f, 9.5f)
            verticalLineTo(22.5f)
            curveTo(9f, 22.776f, 9.224f, 23f, 9.5f, 23f)
            curveTo(9.776f, 23f, 10f, 22.776f, 10f, 22.5f)
            verticalLineTo(9.5f)
            close()
            moveTo(16f, 9f)
            curveTo(16.276f, 9f, 16.5f, 9.224f, 16.5f, 9.5f)
            verticalLineTo(22.5f)
            curveTo(16.5f, 22.776f, 16.276f, 23f, 16f, 23f)
            curveTo(15.724f, 23f, 15.5f, 22.776f, 15.5f, 22.5f)
            verticalLineTo(9.5f)
            curveTo(15.5f, 9.224f, 15.724f, 9f, 16f, 9f)
            close()
            moveTo(23f, 9.5f)
            curveTo(23f, 9.224f, 22.776f, 9f, 22.5f, 9f)
            curveTo(22.224f, 9f, 22f, 9.224f, 22f, 9.5f)
            verticalLineTo(22.5f)
            curveTo(22f, 22.776f, 22.224f, 23f, 22.5f, 23f)
            curveTo(22.776f, 23f, 23f, 22.776f, 23f, 22.5f)
            verticalLineTo(9.5f)
            close()
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(24.5f)
            curveTo(29f, 26.985f, 26.985f, 29f, 24.5f, 29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(7.5f)
            close()
            moveTo(7.5f, 4f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(24.5f)
            curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
            horizontalLineTo(24.5f)
            curveTo(26.433f, 28f, 28f, 26.433f, 28f, 24.5f)
            verticalLineTo(7.5f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            horizontalLineTo(7.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Calendar3DayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Calendar3Day, contentDescription = null)
    }
}
