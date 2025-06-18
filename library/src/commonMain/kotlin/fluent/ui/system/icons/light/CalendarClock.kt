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

public val FluentIcons.Light.CalendarClock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.CalendarClock",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 11f)
            verticalLineTo(24.5f)
            curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
            horizontalLineTo(15.704f)
            curveTo(15.906f, 28.349f, 16.13f, 28.683f, 16.375f, 29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(16.375f)
            curveTo(28.683f, 16.13f, 28.349f, 15.906f, 28f, 15.704f)
            verticalLineTo(11f)
            horizontalLineTo(4f)
            close()
            moveTo(7.5f, 4f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(10f)
            horizontalLineTo(28f)
            verticalLineTo(7.5f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            horizontalLineTo(7.5f)
            close()
            moveTo(23.5f, 31f)
            curveTo(19.358f, 31f, 16f, 27.642f, 16f, 23.5f)
            curveTo(16f, 19.358f, 19.358f, 16f, 23.5f, 16f)
            curveTo(27.642f, 16f, 31f, 19.358f, 31f, 23.5f)
            curveTo(31f, 27.642f, 27.642f, 31f, 23.5f, 31f)
            close()
            moveTo(23.25f, 18.5f)
            curveTo(22.836f, 18.5f, 22.5f, 18.836f, 22.5f, 19.25f)
            verticalLineTo(23.75f)
            curveTo(22.5f, 24.164f, 22.836f, 24.5f, 23.25f, 24.5f)
            horizontalLineTo(26.75f)
            curveTo(27.164f, 24.5f, 27.5f, 24.164f, 27.5f, 23.75f)
            curveTo(27.5f, 23.336f, 27.164f, 23f, 26.75f, 23f)
            horizontalLineTo(24f)
            verticalLineTo(19.25f)
            curveTo(24f, 18.836f, 23.664f, 18.5f, 23.25f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.CalendarClock, contentDescription = null)
    }
}
