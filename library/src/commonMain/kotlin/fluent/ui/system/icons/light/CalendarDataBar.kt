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

public val FluentIcons.Light.CalendarDataBar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.CalendarDataBar",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 11f)
            verticalLineTo(24.5f)
            curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
            horizontalLineTo(15.5f)
            verticalLineTo(29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(18.5f)
            curveTo(28.653f, 18.5f, 28.317f, 18.551f, 28f, 18.645f)
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
            moveTo(24f, 16f)
            curveTo(22.895f, 16f, 22f, 16.895f, 22f, 18f)
            verticalLineTo(29f)
            curveTo(22f, 30.105f, 22.895f, 31f, 24f, 31f)
            curveTo(25.105f, 31f, 26f, 30.105f, 26f, 29f)
            verticalLineTo(18f)
            curveTo(26f, 16.895f, 25.105f, 16f, 24f, 16f)
            close()
            moveTo(29f, 20f)
            curveTo(27.895f, 20f, 27f, 20.895f, 27f, 22f)
            verticalLineTo(29f)
            curveTo(27f, 30.105f, 27.895f, 31f, 29f, 31f)
            curveTo(30.105f, 31f, 31f, 30.105f, 31f, 29f)
            verticalLineTo(22f)
            curveTo(31f, 20.895f, 30.105f, 20f, 29f, 20f)
            close()
            moveTo(17f, 24f)
            curveTo(17f, 22.895f, 17.895f, 22f, 19f, 22f)
            curveTo(20.105f, 22f, 21f, 22.895f, 21f, 24f)
            verticalLineTo(29f)
            curveTo(21f, 30.105f, 20.105f, 31f, 19f, 31f)
            curveTo(17.895f, 31f, 17f, 30.105f, 17f, 29f)
            verticalLineTo(24f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarDataBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.CalendarDataBar, contentDescription = null)
    }
}
