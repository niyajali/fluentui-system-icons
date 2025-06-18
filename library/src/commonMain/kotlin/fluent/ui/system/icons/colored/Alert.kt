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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.Alert: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Alert",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F),
                ),
                start = Offset(12f, 17.5f),
                end = Offset(12.019f, 20.999f),
            ),
        ) {
            moveTo(15f, 18f)
            curveTo(15f, 19.657f, 13.657f, 21f, 12f, 21f)
            curveTo(10.343f, 21f, 9f, 19.657f, 9f, 18f)
            curveTo(9f, 16.343f, 10.343f, 15f, 12f, 15f)
            curveTo(13.657f, 15f, 15f, 16.343f, 15f, 18f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F),
                ),
                start = Offset(21.027f, 17.995f),
                end = Offset(5.578f, 3.776f),
            ),
        ) {
            moveTo(12f, 2.004f)
            curveTo(16.142f, 2.004f, 19.5f, 5.362f, 19.5f, 9.504f)
            verticalLineTo(13.502f)
            lineTo(20.918f, 16.663f)
            curveTo(20.973f, 16.785f, 21.002f, 16.917f, 21.002f, 17.052f)
            curveTo(21.002f, 17.576f, 20.576f, 18.001f, 20.052f, 18.001f)
            horizontalLineTo(3.952f)
            curveTo(3.818f, 18.001f, 3.686f, 17.973f, 3.564f, 17.919f)
            curveTo(3.085f, 17.704f, 2.871f, 17.142f, 3.085f, 16.663f)
            lineTo(4.5f, 13.503f)
            lineTo(4.5f, 9.491f)
            lineTo(4.505f, 9.241f)
            curveTo(4.644f, 5.21f, 7.956f, 2.004f, 12f, 2.004f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Alert, contentDescription = null)
    }
}
