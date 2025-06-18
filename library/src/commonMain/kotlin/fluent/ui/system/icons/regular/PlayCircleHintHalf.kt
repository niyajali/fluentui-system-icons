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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.PlayCircleHintHalf: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PlayCircleHintHalf",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3.5f)
            curveTo(11.91f, 3.5f, 11.82f, 3.501f, 11.731f, 3.504f)
            curveTo(7.232f, 3.644f, 3.613f, 7.281f, 3.503f, 11.787f)
            curveTo(3.501f, 11.858f, 3.5f, 11.929f, 3.5f, 12f)
            curveTo(3.5f, 12.089f, 3.501f, 12.177f, 3.504f, 12.266f)
            curveTo(3.568f, 14.358f, 4.389f, 16.261f, 5.702f, 17.708f)
            curveTo(5.945f, 17.977f, 6.206f, 18.229f, 6.481f, 18.465f)
            curveTo(7.916f, 19.691f, 9.764f, 20.448f, 11.787f, 20.497f)
            curveTo(11.858f, 20.499f, 11.929f, 20.5f, 12f, 20.5f)
            curveTo(12.569f, 20.5f, 13.123f, 20.444f, 13.66f, 20.338f)
            curveTo(14.066f, 20.258f, 14.461f, 20.522f, 14.541f, 20.928f)
            curveTo(14.621f, 21.335f, 14.357f, 21.729f, 13.951f, 21.81f)
            curveTo(13.319f, 21.935f, 12.667f, 22f, 12f, 22f)
            curveTo(11.844f, 22f, 11.688f, 21.996f, 11.533f, 21.989f)
            curveTo(9.132f, 21.879f, 6.951f, 20.922f, 5.284f, 19.409f)
            curveTo(4.965f, 19.12f, 4.665f, 18.811f, 4.386f, 18.483f)
            curveTo(2.898f, 16.737f, 2f, 14.474f, 2f, 12f)
            curveTo(2f, 9.327f, 3.049f, 6.898f, 4.758f, 5.104f)
            curveTo(4.88f, 4.976f, 5.006f, 4.851f, 5.135f, 4.729f)
            curveTo(6.926f, 3.037f, 9.342f, 2f, 12f, 2f)
            curveTo(12.667f, 2f, 13.319f, 2.065f, 13.951f, 2.19f)
            curveTo(14.357f, 2.271f, 14.621f, 2.665f, 14.541f, 3.072f)
            curveTo(14.461f, 3.478f, 14.066f, 3.742f, 13.66f, 3.662f)
            curveTo(13.123f, 3.556f, 12.569f, 3.5f, 12f, 3.5f)
            close()
            moveTo(16.516f, 3.891f)
            curveTo(16.747f, 3.547f, 17.212f, 3.454f, 17.557f, 3.685f)
            curveTo(18.647f, 4.415f, 19.585f, 5.353f, 20.315f, 6.443f)
            curveTo(20.546f, 6.788f, 20.453f, 7.253f, 20.109f, 7.484f)
            curveTo(19.765f, 7.714f, 19.299f, 7.622f, 19.069f, 7.278f)
            curveTo(18.448f, 6.351f, 17.649f, 5.552f, 16.722f, 4.931f)
            curveTo(16.378f, 4.701f, 16.286f, 4.235f, 16.516f, 3.891f)
            close()
            moveTo(20.928f, 9.459f)
            curveTo(21.335f, 9.379f, 21.729f, 9.643f, 21.81f, 10.049f)
            curveTo(21.935f, 10.681f, 22f, 11.333f, 22f, 12f)
            curveTo(22f, 12.667f, 21.935f, 13.319f, 21.81f, 13.951f)
            curveTo(21.729f, 14.357f, 21.335f, 14.621f, 20.928f, 14.541f)
            curveTo(20.522f, 14.461f, 20.258f, 14.066f, 20.338f, 13.66f)
            curveTo(20.444f, 13.123f, 20.5f, 12.569f, 20.5f, 12f)
            curveTo(20.5f, 11.431f, 20.444f, 10.877f, 20.338f, 10.34f)
            curveTo(20.258f, 9.934f, 20.522f, 9.539f, 20.928f, 9.459f)
            close()
            moveTo(20.109f, 16.516f)
            curveTo(20.453f, 16.747f, 20.546f, 17.212f, 20.315f, 17.557f)
            curveTo(19.585f, 18.647f, 18.647f, 19.585f, 17.557f, 20.315f)
            curveTo(17.212f, 20.546f, 16.747f, 20.453f, 16.516f, 20.109f)
            curveTo(16.286f, 19.765f, 16.378f, 19.299f, 16.722f, 19.069f)
            curveTo(17.649f, 18.448f, 18.448f, 17.649f, 19.069f, 16.722f)
            curveTo(19.299f, 16.378f, 19.765f, 16.286f, 20.109f, 16.516f)
            close()
            moveTo(10.856f, 8.155f)
            curveTo(10.023f, 7.694f, 9f, 8.296f, 9f, 9.247f)
            verticalLineTo(14.746f)
            curveTo(9f, 15.698f, 10.023f, 16.299f, 10.856f, 15.839f)
            lineTo(16.613f, 12.652f)
            curveTo(16.852f, 12.52f, 17f, 12.269f, 17f, 11.997f)
            curveTo(17f, 11.724f, 16.852f, 11.473f, 16.613f, 11.341f)
            lineTo(10.856f, 8.155f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PlayCircleHintHalfPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PlayCircleHintHalf, contentDescription = null)
    }
}
