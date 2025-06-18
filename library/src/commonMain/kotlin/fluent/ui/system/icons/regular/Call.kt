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

public val FluentIcons.Regular.Call: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Call",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.057f, 2.418f)
            lineTo(8.224f, 2.067f)
            curveTo(9.546f, 1.668f, 10.959f, 2.312f, 11.526f, 3.572f)
            lineTo(12.427f, 5.578f)
            curveTo(12.91f, 6.652f, 12.656f, 7.914f, 11.795f, 8.717f)
            lineTo(10.3f, 10.11f)
            curveTo(10.257f, 10.151f, 10.229f, 10.206f, 10.222f, 10.265f)
            curveTo(10.178f, 10.662f, 10.447f, 11.436f, 11.068f, 12.51f)
            curveTo(11.519f, 13.291f, 11.927f, 13.839f, 12.274f, 14.147f)
            curveTo(12.517f, 14.362f, 12.65f, 14.408f, 12.707f, 14.392f)
            lineTo(14.717f, 13.777f)
            curveTo(15.842f, 13.433f, 17.062f, 13.843f, 17.751f, 14.798f)
            lineTo(19.032f, 16.573f)
            curveTo(19.838f, 17.69f, 19.693f, 19.231f, 18.693f, 20.178f)
            lineTo(17.806f, 21.018f)
            curveTo(16.85f, 21.924f, 15.488f, 22.261f, 14.219f, 21.907f)
            curveTo(11.465f, 21.138f, 8.996f, 18.814f, 6.784f, 14.983f)
            curveTo(4.569f, 11.147f, 3.792f, 7.842f, 4.509f, 5.07f)
            curveTo(4.836f, 3.802f, 5.803f, 2.797f, 7.057f, 2.418f)
            close()
            moveTo(7.49f, 3.855f)
            curveTo(6.737f, 4.081f, 6.158f, 4.685f, 5.961f, 5.446f)
            curveTo(5.358f, 7.777f, 6.047f, 10.706f, 8.083f, 14.233f)
            curveTo(10.117f, 17.755f, 12.306f, 19.816f, 14.623f, 20.462f)
            curveTo(15.384f, 20.675f, 16.201f, 20.472f, 16.775f, 19.929f)
            lineTo(17.661f, 19.089f)
            curveTo(18.116f, 18.659f, 18.182f, 17.958f, 17.815f, 17.45f)
            lineTo(16.535f, 15.675f)
            curveTo(16.222f, 15.241f, 15.667f, 15.055f, 15.155f, 15.211f)
            lineTo(13.14f, 15.828f)
            curveTo(11.97f, 16.176f, 10.909f, 15.235f, 9.769f, 13.26f)
            curveTo(9f, 11.929f, 8.642f, 10.901f, 8.732f, 10.099f)
            curveTo(8.778f, 9.683f, 8.972f, 9.298f, 9.277f, 9.013f)
            lineTo(10.772f, 7.62f)
            curveTo(11.163f, 7.255f, 11.279f, 6.681f, 11.059f, 6.193f)
            lineTo(10.158f, 4.187f)
            curveTo(9.9f, 3.614f, 9.258f, 3.322f, 8.657f, 3.503f)
            lineTo(7.49f, 3.855f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Call, contentDescription = null)
    }
}
