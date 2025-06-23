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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.CallAdd: ImageVector
    get() {
        if (_CallAdd != null) {
            return _CallAdd!!
        }
        _CallAdd = ImageVector.Builder(
            name = "Regular.CallAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.526f, 3.572f)
                lineTo(10.427f, 5.578f)
                curveTo(10.91f, 6.652f, 10.656f, 7.914f, 9.795f, 8.717f)
                lineTo(8.3f, 10.11f)
                curveTo(8.257f, 10.151f, 8.229f, 10.206f, 8.222f, 10.265f)
                curveTo(8.178f, 10.662f, 8.447f, 11.436f, 9.068f, 12.51f)
                curveTo(9.519f, 13.291f, 9.927f, 13.839f, 10.274f, 14.147f)
                curveTo(10.517f, 14.362f, 10.65f, 14.408f, 10.707f, 14.392f)
                lineTo(12.717f, 13.777f)
                curveTo(13.842f, 13.433f, 15.062f, 13.843f, 15.751f, 14.798f)
                lineTo(17.032f, 16.573f)
                curveTo(17.838f, 17.69f, 17.693f, 19.231f, 16.693f, 20.178f)
                lineTo(15.806f, 21.018f)
                curveTo(14.85f, 21.924f, 13.488f, 22.261f, 12.219f, 21.907f)
                curveTo(9.465f, 21.138f, 6.996f, 18.814f, 4.784f, 14.983f)
                curveTo(2.569f, 11.147f, 1.792f, 7.842f, 2.509f, 5.07f)
                curveTo(2.836f, 3.802f, 3.803f, 2.797f, 5.057f, 2.418f)
                lineTo(6.224f, 2.067f)
                curveTo(7.546f, 1.668f, 8.959f, 2.312f, 9.526f, 3.572f)
                close()
                moveTo(6.657f, 3.503f)
                lineTo(5.49f, 3.855f)
                curveTo(4.737f, 4.081f, 4.158f, 4.685f, 3.961f, 5.446f)
                curveTo(3.358f, 7.777f, 4.047f, 10.706f, 6.083f, 14.233f)
                curveTo(8.117f, 17.755f, 10.306f, 19.816f, 12.623f, 20.462f)
                curveTo(13.384f, 20.675f, 14.201f, 20.472f, 14.775f, 19.929f)
                lineTo(15.661f, 19.089f)
                curveTo(16.116f, 18.659f, 16.182f, 17.958f, 15.815f, 17.45f)
                lineTo(14.535f, 15.675f)
                curveTo(14.222f, 15.241f, 13.667f, 15.055f, 13.155f, 15.211f)
                lineTo(11.14f, 15.828f)
                curveTo(9.97f, 16.176f, 8.909f, 15.235f, 7.769f, 13.26f)
                curveTo(7f, 11.929f, 6.642f, 10.901f, 6.732f, 10.099f)
                curveTo(6.778f, 9.683f, 6.972f, 9.298f, 7.277f, 9.013f)
                lineTo(8.772f, 7.62f)
                curveTo(9.163f, 7.255f, 9.279f, 6.681f, 9.059f, 6.193f)
                lineTo(8.158f, 4.187f)
                curveTo(7.9f, 3.614f, 7.258f, 3.322f, 6.657f, 3.503f)
                close()
                moveTo(17.149f, 2.004f)
                lineTo(17.251f, 1.997f)
                curveTo(17.63f, 1.997f, 17.944f, 2.28f, 17.994f, 2.646f)
                lineTo(18.001f, 2.747f)
                lineTo(18f, 6.001f)
                lineTo(21.252f, 6.002f)
                curveTo(21.632f, 6.002f, 21.946f, 6.284f, 21.996f, 6.65f)
                lineTo(22.002f, 6.752f)
                curveTo(22.002f, 7.132f, 21.72f, 7.446f, 21.354f, 7.495f)
                lineTo(21.252f, 7.502f)
                lineTo(18f, 7.501f)
                lineTo(18.001f, 10.75f)
                curveTo(18.001f, 11.13f, 17.718f, 11.444f, 17.352f, 11.494f)
                lineTo(17.251f, 11.5f)
                curveTo(16.871f, 11.5f, 16.557f, 11.218f, 16.507f, 10.852f)
                lineTo(16.501f, 10.75f)
                lineTo(16.5f, 7.501f)
                lineTo(13.249f, 7.502f)
                curveTo(12.869f, 7.502f, 12.555f, 7.22f, 12.506f, 6.854f)
                lineTo(12.499f, 6.752f)
                curveTo(12.499f, 6.372f, 12.781f, 6.059f, 13.147f, 6.009f)
                lineTo(13.249f, 6.002f)
                lineTo(16.5f, 6.001f)
                lineTo(16.501f, 2.747f)
                curveTo(16.501f, 2.368f, 16.783f, 2.054f, 17.149f, 2.004f)
                lineTo(17.251f, 1.997f)
                lineTo(17.149f, 2.004f)
                close()
            }
        }.build()

        return _CallAdd!!
    }

@Suppress("ObjectPropertyName")
private var _CallAdd: ImageVector? = null

@Preview
@Composable
private fun CallAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CallAdd, contentDescription = null)
    }
}
