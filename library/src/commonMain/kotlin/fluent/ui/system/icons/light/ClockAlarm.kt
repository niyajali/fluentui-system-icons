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

public val FluentUi.Light.ClockAlarm: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ClockAlarm",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 9.5f)
            curveTo(16f, 9.224f, 15.776f, 9f, 15.5f, 9f)
            curveTo(15.224f, 9f, 15f, 9.224f, 15f, 9.5f)
            verticalLineTo(16.5f)
            curveTo(15f, 16.776f, 15.224f, 17f, 15.5f, 17f)
            horizontalLineTo(20.5f)
            curveTo(20.776f, 17f, 21f, 16.776f, 21f, 16.5f)
            curveTo(21f, 16.224f, 20.776f, 16f, 20.5f, 16f)
            horizontalLineTo(16f)
            verticalLineTo(9.5f)
            close()
            moveTo(3f, 8f)
            curveTo(3f, 5.239f, 5.239f, 3f, 8f, 3f)
            curveTo(9.523f, 3f, 10.886f, 3.681f, 11.803f, 4.754f)
            curveTo(13.11f, 4.267f, 14.524f, 4f, 16f, 4f)
            curveTo(17.476f, 4f, 18.89f, 4.267f, 20.197f, 4.754f)
            curveTo(21.114f, 3.681f, 22.477f, 3f, 24f, 3f)
            curveTo(26.761f, 3f, 29f, 5.239f, 29f, 8f)
            curveTo(29f, 9.523f, 28.319f, 10.886f, 27.246f, 11.803f)
            curveTo(27.733f, 13.11f, 28f, 14.524f, 28f, 16f)
            curveTo(28f, 19.134f, 26.799f, 21.988f, 24.831f, 24.125f)
            curveTo(24.839f, 24.132f, 24.846f, 24.139f, 24.854f, 24.146f)
            lineTo(27.854f, 27.146f)
            curveTo(28.049f, 27.342f, 28.049f, 27.658f, 27.854f, 27.854f)
            curveTo(27.658f, 28.049f, 27.342f, 28.049f, 27.146f, 27.854f)
            lineTo(24.146f, 24.854f)
            curveTo(24.139f, 24.846f, 24.132f, 24.839f, 24.125f, 24.831f)
            curveTo(21.988f, 26.799f, 19.134f, 28f, 16f, 28f)
            curveTo(12.866f, 28f, 10.012f, 26.799f, 7.875f, 24.831f)
            curveTo(7.868f, 24.839f, 7.861f, 24.846f, 7.854f, 24.854f)
            lineTo(4.854f, 27.854f)
            curveTo(4.658f, 28.049f, 4.342f, 28.049f, 4.146f, 27.854f)
            curveTo(3.951f, 27.658f, 3.951f, 27.342f, 4.146f, 27.146f)
            lineTo(7.146f, 24.146f)
            curveTo(7.154f, 24.139f, 7.161f, 24.132f, 7.169f, 24.125f)
            curveTo(5.202f, 21.988f, 4f, 19.134f, 4f, 16f)
            curveTo(4f, 14.524f, 4.267f, 13.11f, 4.754f, 11.803f)
            curveTo(3.681f, 10.886f, 3f, 9.523f, 3f, 8f)
            close()
            moveTo(4f, 8f)
            curveTo(4f, 9.104f, 4.447f, 10.103f, 5.169f, 10.826f)
            curveTo(6.352f, 8.355f, 8.355f, 6.352f, 10.826f, 5.169f)
            curveTo(10.103f, 4.447f, 9.104f, 4f, 8f, 4f)
            curveTo(5.791f, 4f, 4f, 5.791f, 4f, 8f)
            close()
            moveTo(28f, 8f)
            curveTo(28f, 5.791f, 26.209f, 4f, 24f, 4f)
            curveTo(22.896f, 4f, 21.897f, 4.447f, 21.174f, 5.169f)
            curveTo(23.645f, 6.352f, 25.648f, 8.355f, 26.83f, 10.826f)
            curveTo(27.553f, 10.103f, 28f, 9.104f, 28f, 8f)
            close()
            moveTo(16f, 27f)
            curveTo(22.075f, 27f, 27f, 22.075f, 27f, 16f)
            curveTo(27f, 9.925f, 22.075f, 5f, 16f, 5f)
            curveTo(9.925f, 5f, 5f, 9.925f, 5f, 16f)
            curveTo(5f, 22.075f, 9.925f, 27f, 16f, 27f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClockAlarmPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ClockAlarm, contentDescription = null)
    }
}
