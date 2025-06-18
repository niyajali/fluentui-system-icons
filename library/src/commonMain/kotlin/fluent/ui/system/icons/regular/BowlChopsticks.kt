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
package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.BowlChopsticks: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BowlChopsticks",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.4f, 2.376f)
            curveTo(6.193f, 2.017f, 5.735f, 1.893f, 5.376f, 2.1f)
            curveTo(5.017f, 2.307f, 4.893f, 2.765f, 5.1f, 3.124f)
            lineTo(9.635f, 11f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11f, 2f, 11.336f, 2f, 11.75f)
            verticalLineTo(12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            verticalLineTo(11.75f)
            curveTo(22f, 11.336f, 21.664f, 11f, 21.25f, 11f)
            horizontalLineTo(15.365f)
            lineTo(10.4f, 2.376f)
            curveTo(10.193f, 2.017f, 9.735f, 1.893f, 9.376f, 2.1f)
            curveTo(9.017f, 2.307f, 8.893f, 2.765f, 9.1f, 3.124f)
            lineTo(13.635f, 11f)
            horizontalLineTo(11.365f)
            lineTo(6.4f, 2.376f)
            close()
            moveTo(4.788f, 16.5f)
            horizontalLineTo(19.212f)
            curveTo(17.711f, 18.902f, 15.042f, 20.5f, 12f, 20.5f)
            curveTo(8.958f, 20.5f, 6.289f, 18.902f, 4.788f, 16.5f)
            close()
            moveTo(4.045f, 15f)
            curveTo(3.749f, 14.215f, 3.565f, 13.376f, 3.514f, 12.5f)
            horizontalLineTo(20.486f)
            curveTo(20.435f, 13.376f, 20.251f, 14.215f, 19.955f, 15f)
            horizontalLineTo(4.045f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BowlChopsticksPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BowlChopsticks, contentDescription = null)
    }
}
