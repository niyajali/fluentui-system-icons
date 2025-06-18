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

public val FluentIcons.Regular.Gesture: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Gesture",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.75f, 17.5f)
            curveTo(4.164f, 17.5f, 4.5f, 17.836f, 4.5f, 18.25f)
            curveTo(4.5f, 18.664f, 4.164f, 19f, 3.75f, 19f)
            curveTo(3.336f, 19f, 3f, 18.664f, 3f, 18.25f)
            curveTo(3f, 17.836f, 3.336f, 17.5f, 3.75f, 17.5f)
            close()
            moveTo(6.749f, 4.005f)
            horizontalLineTo(17.253f)
            curveTo(17.668f, 4.005f, 18.003f, 4.34f, 18.003f, 4.755f)
            curveTo(18.003f, 5.134f, 17.721f, 5.448f, 17.355f, 5.498f)
            lineTo(17.253f, 5.505f)
            horizontalLineTo(10.751f)
            lineTo(20.524f, 9.301f)
            curveTo(21.095f, 9.523f, 21.163f, 10.282f, 20.685f, 10.614f)
            lineTo(20.589f, 10.671f)
            lineTo(6.101f, 17.928f)
            curveTo(5.73f, 18.114f, 5.28f, 17.964f, 5.094f, 17.593f)
            curveTo(4.924f, 17.254f, 5.036f, 16.847f, 5.341f, 16.639f)
            lineTo(5.429f, 16.587f)
            lineTo(18.405f, 10.087f)
            lineTo(6.477f, 5.454f)
            curveTo(5.737f, 5.166f, 5.902f, 4.103f, 6.644f, 4.011f)
            lineTo(6.749f, 4.005f)
            horizontalLineTo(17.253f)
            horizontalLineTo(6.749f)
            close()
            moveTo(19.75f, 4f)
            curveTo(20.164f, 4f, 20.5f, 4.336f, 20.5f, 4.75f)
            curveTo(20.5f, 5.164f, 20.164f, 5.5f, 19.75f, 5.5f)
            curveTo(19.336f, 5.5f, 19f, 5.164f, 19f, 4.75f)
            curveTo(19f, 4.336f, 19.336f, 4f, 19.75f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GesturePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Gesture, contentDescription = null)
    }
}
