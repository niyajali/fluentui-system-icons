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

public val FluentUi.Light.CalendarReply: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.CalendarReply",
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
            curveTo(27.642f, 31f, 31f, 27.642f, 31f, 23.5f)
            curveTo(31f, 19.358f, 27.642f, 16f, 23.5f, 16f)
            curveTo(19.358f, 16f, 16f, 19.358f, 16f, 23.5f)
            curveTo(16f, 27.642f, 19.358f, 31f, 23.5f, 31f)
            close()
            moveTo(22.28f, 20.78f)
            lineTo(21.061f, 22f)
            horizontalLineTo(23.75f)
            curveTo(26.097f, 22f, 28f, 23.903f, 28f, 26.25f)
            verticalLineTo(26.75f)
            curveTo(28f, 27.164f, 27.664f, 27.5f, 27.25f, 27.5f)
            curveTo(26.836f, 27.5f, 26.5f, 27.164f, 26.5f, 26.75f)
            verticalLineTo(26.25f)
            curveTo(26.5f, 24.731f, 25.269f, 23.5f, 23.75f, 23.5f)
            horizontalLineTo(21.061f)
            lineTo(22.28f, 24.72f)
            curveTo(22.573f, 25.013f, 22.573f, 25.487f, 22.28f, 25.78f)
            curveTo(21.987f, 26.073f, 21.513f, 26.073f, 21.22f, 25.78f)
            lineTo(18.72f, 23.28f)
            curveTo(18.427f, 22.987f, 18.427f, 22.513f, 18.72f, 22.22f)
            lineTo(21.22f, 19.72f)
            curveTo(21.513f, 19.427f, 21.987f, 19.427f, 22.28f, 19.72f)
            curveTo(22.573f, 20.013f, 22.573f, 20.487f, 22.28f, 20.78f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarReplyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.CalendarReply, contentDescription = null)
    }
}
