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

public val FluentUi.Regular.SpeakerEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SpeakerEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.999f, 4.252f)
            curveTo(14.999f, 3.174f, 13.725f, 2.602f, 12.918f, 3.318f)
            lineTo(8.427f, 7.311f)
            curveTo(8.29f, 7.433f, 8.113f, 7.5f, 7.929f, 7.5f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 7.5f, 2f, 8.507f, 2f, 9.75f)
            verticalLineTo(14.247f)
            curveTo(2f, 15.489f, 3.007f, 16.496f, 4.25f, 16.496f)
            horizontalLineTo(7.929f)
            curveTo(8.113f, 16.496f, 8.29f, 16.563f, 8.427f, 16.686f)
            lineTo(11.55f, 19.462f)
            curveTo(11.693f, 18.961f, 11.94f, 18.497f, 12.274f, 18.099f)
            lineTo(9.424f, 15.565f)
            curveTo(9.012f, 15.199f, 8.48f, 14.996f, 7.929f, 14.996f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 14.996f, 3.5f, 14.661f, 3.5f, 14.247f)
            verticalLineTo(9.75f)
            curveTo(3.5f, 9.335f, 3.836f, 9f, 4.25f, 9f)
            horizontalLineTo(7.929f)
            curveTo(8.48f, 9f, 9.012f, 8.798f, 9.424f, 8.431f)
            lineTo(13.499f, 4.809f)
            verticalLineTo(16.855f)
            lineTo(14.999f, 15.355f)
            verticalLineTo(4.252f)
            close()
            moveTo(20.039f, 6.055f)
            curveTo(21.13f, 7.529f, 21.826f, 9.313f, 21.971f, 11.249f)
            curveTo(21.484f, 11.048f, 20.959f, 10.969f, 20.442f, 11.012f)
            curveTo(20.267f, 9.5f, 19.695f, 8.111f, 18.834f, 6.948f)
            curveTo(18.587f, 6.615f, 18.657f, 6.146f, 18.99f, 5.899f)
            curveTo(19.323f, 5.653f, 19.793f, 5.723f, 20.039f, 6.055f)
            close()
            moveTo(18.158f, 8.673f)
            curveTo(18.619f, 9.523f, 18.908f, 10.48f, 18.98f, 11.495f)
            curveTo(18.771f, 11.625f, 18.573f, 11.781f, 18.391f, 11.963f)
            lineTo(17.42f, 12.934f)
            curveTo(17.472f, 12.631f, 17.499f, 12.319f, 17.499f, 12.001f)
            curveTo(17.499f, 11.053f, 17.26f, 10.164f, 16.839f, 9.387f)
            curveTo(16.642f, 9.023f, 16.777f, 8.568f, 17.142f, 8.371f)
            curveTo(17.506f, 8.173f, 17.961f, 8.309f, 18.158f, 8.673f)
            close()
            moveTo(19.098f, 12.67f)
            lineTo(13.196f, 18.571f)
            curveTo(12.852f, 18.915f, 12.608f, 19.346f, 12.49f, 19.818f)
            lineTo(12.033f, 21.649f)
            curveTo(11.834f, 22.445f, 12.555f, 23.166f, 13.351f, 22.967f)
            lineTo(15.181f, 22.509f)
            curveTo(15.653f, 22.391f, 16.085f, 22.147f, 16.429f, 21.803f)
            lineTo(22.331f, 15.902f)
            curveTo(23.223f, 15.009f, 23.223f, 13.562f, 22.331f, 12.67f)
            curveTo(21.438f, 11.777f, 19.991f, 11.777f, 19.098f, 12.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SpeakerEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SpeakerEdit, contentDescription = null)
    }
}
