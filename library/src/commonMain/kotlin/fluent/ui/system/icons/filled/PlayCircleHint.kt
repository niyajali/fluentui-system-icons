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
package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.PlayCircleHint: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PlayCircleHint",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(11.333f, 2f, 10.681f, 2.065f, 10.049f, 2.19f)
            curveTo(9.643f, 2.271f, 9.379f, 2.665f, 9.459f, 3.072f)
            curveTo(9.539f, 3.478f, 9.934f, 3.742f, 10.34f, 3.662f)
            curveTo(10.877f, 3.556f, 11.431f, 3.5f, 12f, 3.5f)
            curveTo(12.569f, 3.5f, 13.123f, 3.556f, 13.66f, 3.662f)
            curveTo(14.066f, 3.742f, 14.461f, 3.478f, 14.541f, 3.072f)
            curveTo(14.621f, 2.665f, 14.357f, 2.271f, 13.951f, 2.19f)
            curveTo(13.319f, 2.065f, 12.667f, 2f, 12f, 2f)
            close()
            moveTo(7.278f, 4.931f)
            curveTo(7.622f, 4.701f, 7.714f, 4.235f, 7.484f, 3.891f)
            curveTo(7.253f, 3.547f, 6.788f, 3.454f, 6.443f, 3.685f)
            curveTo(5.353f, 4.415f, 4.415f, 5.353f, 3.685f, 6.443f)
            curveTo(3.454f, 6.788f, 3.547f, 7.253f, 3.891f, 7.484f)
            curveTo(4.235f, 7.714f, 4.701f, 7.622f, 4.931f, 7.278f)
            curveTo(5.552f, 6.351f, 6.351f, 5.552f, 7.278f, 4.931f)
            close()
            moveTo(17.557f, 3.685f)
            curveTo(17.212f, 3.454f, 16.747f, 3.547f, 16.516f, 3.891f)
            curveTo(16.286f, 4.235f, 16.378f, 4.701f, 16.722f, 4.931f)
            curveTo(17.649f, 5.552f, 18.448f, 6.351f, 19.069f, 7.278f)
            curveTo(19.299f, 7.622f, 19.765f, 7.714f, 20.109f, 7.484f)
            curveTo(20.453f, 7.253f, 20.546f, 6.788f, 20.315f, 6.443f)
            curveTo(19.585f, 5.353f, 18.647f, 4.415f, 17.557f, 3.685f)
            close()
            moveTo(21.81f, 10.049f)
            curveTo(21.729f, 9.643f, 21.335f, 9.379f, 20.928f, 9.459f)
            curveTo(20.522f, 9.539f, 20.258f, 9.934f, 20.338f, 10.34f)
            curveTo(20.444f, 10.877f, 20.5f, 11.431f, 20.5f, 12f)
            curveTo(20.5f, 12.569f, 20.444f, 13.123f, 20.338f, 13.66f)
            curveTo(20.258f, 14.066f, 20.522f, 14.461f, 20.928f, 14.541f)
            curveTo(21.335f, 14.621f, 21.729f, 14.357f, 21.81f, 13.951f)
            curveTo(21.935f, 13.319f, 22f, 12.667f, 22f, 12f)
            curveTo(22f, 11.333f, 21.935f, 10.681f, 21.81f, 10.049f)
            close()
            moveTo(3.662f, 10.34f)
            curveTo(3.742f, 9.934f, 3.478f, 9.539f, 3.072f, 9.459f)
            curveTo(2.665f, 9.379f, 2.271f, 9.643f, 2.19f, 10.049f)
            curveTo(2.065f, 10.681f, 2f, 11.333f, 2f, 12f)
            curveTo(2f, 12.667f, 2.065f, 13.319f, 2.19f, 13.951f)
            curveTo(2.271f, 14.357f, 2.665f, 14.621f, 3.072f, 14.541f)
            curveTo(3.478f, 14.461f, 3.742f, 14.066f, 3.662f, 13.66f)
            curveTo(3.556f, 13.123f, 3.5f, 12.569f, 3.5f, 12f)
            curveTo(3.5f, 11.431f, 3.556f, 10.877f, 3.662f, 10.34f)
            close()
            moveTo(4.931f, 16.722f)
            curveTo(4.701f, 16.378f, 4.235f, 16.286f, 3.891f, 16.516f)
            curveTo(3.547f, 16.747f, 3.454f, 17.212f, 3.685f, 17.557f)
            curveTo(4.415f, 18.647f, 5.353f, 19.585f, 6.443f, 20.315f)
            curveTo(6.788f, 20.546f, 7.253f, 20.453f, 7.484f, 20.109f)
            curveTo(7.714f, 19.765f, 7.622f, 19.299f, 7.278f, 19.069f)
            curveTo(6.351f, 18.448f, 5.552f, 17.649f, 4.931f, 16.722f)
            close()
            moveTo(20.315f, 17.557f)
            curveTo(20.546f, 17.212f, 20.453f, 16.747f, 20.109f, 16.516f)
            curveTo(19.765f, 16.286f, 19.299f, 16.378f, 19.069f, 16.722f)
            curveTo(18.448f, 17.649f, 17.649f, 18.448f, 16.722f, 19.069f)
            curveTo(16.378f, 19.299f, 16.286f, 19.765f, 16.516f, 20.109f)
            curveTo(16.747f, 20.453f, 17.212f, 20.546f, 17.557f, 20.315f)
            curveTo(18.647f, 19.585f, 19.585f, 18.647f, 20.315f, 17.557f)
            close()
            moveTo(10.34f, 20.338f)
            curveTo(9.934f, 20.258f, 9.539f, 20.522f, 9.459f, 20.928f)
            curveTo(9.379f, 21.335f, 9.643f, 21.729f, 10.049f, 21.81f)
            curveTo(10.681f, 21.935f, 11.333f, 22f, 12f, 22f)
            curveTo(12.667f, 22f, 13.319f, 21.935f, 13.951f, 21.81f)
            curveTo(14.357f, 21.729f, 14.621f, 21.335f, 14.541f, 20.928f)
            curveTo(14.461f, 20.522f, 14.066f, 20.258f, 13.66f, 20.338f)
            curveTo(13.123f, 20.444f, 12.569f, 20.5f, 12f, 20.5f)
            curveTo(11.431f, 20.5f, 10.877f, 20.444f, 10.34f, 20.338f)
            close()
            moveTo(19.25f, 12f)
            curveTo(19.25f, 16.004f, 16.004f, 19.25f, 12f, 19.25f)
            curveTo(7.996f, 19.25f, 4.75f, 16.004f, 4.75f, 12f)
            curveTo(4.75f, 7.996f, 7.996f, 4.75f, 12f, 4.75f)
            curveTo(16.004f, 4.75f, 19.25f, 7.996f, 19.25f, 12f)
            close()
            moveTo(10.856f, 8.154f)
            curveTo(10.023f, 7.693f, 9f, 8.295f, 9f, 9.247f)
            verticalLineTo(14.745f)
            curveTo(9f, 15.697f, 10.023f, 16.299f, 10.856f, 15.838f)
            lineTo(16.613f, 12.652f)
            curveTo(16.852f, 12.52f, 17f, 12.269f, 17f, 11.996f)
            curveTo(17f, 11.724f, 16.852f, 11.473f, 16.613f, 11.341f)
            lineTo(10.856f, 8.154f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PlayCircleHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PlayCircleHint, contentDescription = null)
    }
}
