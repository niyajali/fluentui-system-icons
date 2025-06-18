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

public val FluentIcons.Regular.CallPause: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CallPause",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.5f, 2.75f)
            curveTo(15.5f, 2.336f, 15.165f, 2f, 14.75f, 2f)
            curveTo(14.336f, 2f, 14f, 2.336f, 14f, 2.75f)
            verticalLineTo(10.25f)
            curveTo(14f, 10.664f, 14.336f, 11f, 14.75f, 11f)
            curveTo(15.165f, 11f, 15.5f, 10.664f, 15.5f, 10.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(19.5f, 2.75f)
            curveTo(19.5f, 2.336f, 19.165f, 2f, 18.75f, 2f)
            curveTo(18.336f, 2f, 18f, 2.336f, 18f, 2.75f)
            verticalLineTo(10.25f)
            curveTo(18f, 10.664f, 18.336f, 11f, 18.75f, 11f)
            curveTo(19.165f, 11f, 19.5f, 10.664f, 19.5f, 10.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(10.427f, 5.629f)
            lineTo(9.526f, 3.623f)
            curveTo(8.959f, 2.363f, 7.546f, 1.719f, 6.224f, 2.117f)
            lineTo(5.057f, 2.469f)
            lineTo(4.851f, 2.538f)
            curveTo(3.697f, 2.96f, 2.818f, 3.923f, 2.509f, 5.121f)
            curveTo(1.792f, 7.893f, 2.569f, 11.197f, 4.784f, 15.034f)
            curveTo(6.996f, 18.865f, 9.465f, 21.189f, 12.219f, 21.958f)
            curveTo(13.488f, 22.312f, 14.85f, 21.974f, 15.806f, 21.069f)
            lineTo(16.693f, 20.229f)
            curveTo(17.693f, 19.282f, 17.838f, 17.741f, 17.032f, 16.623f)
            lineTo(15.751f, 14.848f)
            curveTo(15.062f, 13.894f, 13.842f, 13.483f, 12.717f, 13.828f)
            lineTo(10.707f, 14.442f)
            curveTo(10.65f, 14.459f, 10.517f, 14.413f, 10.274f, 14.198f)
            curveTo(9.927f, 13.89f, 9.519f, 13.342f, 9.068f, 12.561f)
            curveTo(8.447f, 11.486f, 8.178f, 10.713f, 8.222f, 10.316f)
            curveTo(8.229f, 10.257f, 8.257f, 10.202f, 8.3f, 10.161f)
            lineTo(9.795f, 8.767f)
            curveTo(10.656f, 7.964f, 10.91f, 6.702f, 10.427f, 5.629f)
            close()
            moveTo(5.49f, 3.905f)
            lineTo(6.657f, 3.554f)
            curveTo(7.258f, 3.372f, 7.9f, 3.665f, 8.158f, 4.238f)
            lineTo(9.059f, 6.244f)
            curveTo(9.279f, 6.732f, 9.163f, 7.305f, 8.772f, 7.67f)
            lineTo(7.277f, 9.064f)
            curveTo(6.972f, 9.349f, 6.778f, 9.734f, 6.732f, 10.149f)
            curveTo(6.642f, 10.951f, 7f, 11.98f, 7.769f, 13.311f)
            curveTo(8.909f, 15.285f, 9.97f, 16.227f, 11.14f, 15.878f)
            lineTo(13.155f, 15.262f)
            curveTo(13.667f, 15.106f, 14.222f, 15.292f, 14.535f, 15.726f)
            lineTo(15.815f, 17.501f)
            curveTo(16.182f, 18.009f, 16.116f, 18.709f, 15.661f, 19.14f)
            lineTo(14.775f, 19.979f)
            curveTo(14.201f, 20.523f, 13.384f, 20.726f, 12.623f, 20.513f)
            curveTo(10.306f, 19.866f, 8.117f, 17.806f, 6.083f, 14.284f)
            curveTo(4.047f, 10.757f, 3.358f, 7.828f, 3.961f, 5.497f)
            curveTo(4.143f, 4.79f, 4.656f, 4.219f, 5.331f, 3.96f)
            lineTo(5.49f, 3.905f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallPausePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CallPause, contentDescription = null)
    }
}
