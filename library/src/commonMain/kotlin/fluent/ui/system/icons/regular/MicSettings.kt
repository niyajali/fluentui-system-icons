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

public val FluentUi.Regular.MicSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MicSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 17.5f)
            curveTo(11f, 18.596f, 11.271f, 19.629f, 11.75f, 20.535f)
            lineTo(11.75f, 21.25f)
            curveTo(11.75f, 21.664f, 11.414f, 22f, 11f, 22f)
            curveTo(10.62f, 22f, 10.307f, 21.718f, 10.257f, 21.352f)
            lineTo(10.25f, 21.25f)
            lineTo(10.25f, 18.982f)
            curveTo(6.833f, 18.732f, 4.123f, 15.938f, 4.004f, 12.486f)
            lineTo(4f, 12.25f)
            verticalLineTo(11.75f)
            curveTo(4f, 11.336f, 4.336f, 11f, 4.75f, 11f)
            curveTo(5.13f, 11f, 5.443f, 11.282f, 5.493f, 11.648f)
            lineTo(5.5f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(5.5f, 15.077f, 7.734f, 17.382f, 10.534f, 17.496f)
            lineTo(10.75f, 17.5f)
            horizontalLineTo(11f)
            close()
            moveTo(15f, 6f)
            verticalLineTo(11.498f)
            curveTo(14.446f, 11.729f, 13.932f, 12.034f, 13.468f, 12.401f)
            curveTo(13.489f, 12.271f, 13.5f, 12.137f, 13.5f, 12f)
            verticalLineTo(6f)
            curveTo(13.5f, 4.619f, 12.381f, 3.5f, 11f, 3.5f)
            curveTo(9.619f, 3.5f, 8.5f, 4.619f, 8.5f, 6f)
            verticalLineTo(12f)
            curveTo(8.5f, 13.381f, 9.619f, 14.5f, 11f, 14.5f)
            curveTo(11.281f, 14.5f, 11.551f, 14.454f, 11.803f, 14.368f)
            curveTo(11.524f, 14.874f, 11.311f, 15.42f, 11.175f, 15.996f)
            curveTo(11.117f, 15.999f, 11.059f, 16f, 11f, 16f)
            curveTo(8.791f, 16f, 7f, 14.209f, 7f, 12f)
            verticalLineTo(6f)
            curveTo(7f, 3.791f, 8.791f, 2f, 11f, 2f)
            curveTo(13.209f, 2f, 15f, 3.791f, 15f, 6f)
            close()
            moveTo(14.278f, 13.975f)
            curveTo(14.593f, 15.066f, 13.939f, 16.199f, 12.837f, 16.472f)
            lineTo(12.253f, 16.616f)
            curveTo(12.208f, 16.904f, 12.185f, 17.199f, 12.185f, 17.5f)
            curveTo(12.185f, 17.815f, 12.21f, 18.123f, 12.259f, 18.423f)
            lineTo(12.799f, 18.553f)
            curveTo(13.911f, 18.821f, 14.573f, 19.966f, 14.249f, 21.064f)
            lineTo(14.062f, 21.695f)
            curveTo(14.501f, 22.08f, 15.002f, 22.394f, 15.546f, 22.617f)
            lineTo(16.04f, 22.098f)
            curveTo(16.828f, 21.268f, 18.151f, 21.269f, 18.939f, 22.098f)
            lineTo(19.438f, 22.623f)
            curveTo(19.981f, 22.403f, 20.481f, 22.093f, 20.92f, 21.71f)
            lineTo(20.722f, 21.024f)
            curveTo(20.408f, 19.934f, 21.062f, 18.801f, 22.163f, 18.528f)
            lineTo(22.747f, 18.383f)
            curveTo(22.792f, 18.096f, 22.816f, 17.801f, 22.816f, 17.5f)
            curveTo(22.816f, 17.185f, 22.79f, 16.876f, 22.741f, 16.576f)
            lineTo(22.202f, 16.446f)
            curveTo(21.089f, 16.178f, 20.428f, 15.033f, 20.752f, 13.936f)
            lineTo(20.938f, 13.305f)
            curveTo(20.499f, 12.919f, 19.999f, 12.606f, 19.454f, 12.383f)
            lineTo(18.961f, 12.902f)
            curveTo(18.172f, 13.731f, 16.85f, 13.731f, 16.062f, 12.901f)
            lineTo(15.563f, 12.377f)
            curveTo(15.019f, 12.597f, 14.519f, 12.907f, 14.08f, 13.289f)
            lineTo(14.278f, 13.975f)
            close()
            moveTo(17.5f, 19f)
            curveTo(16.699f, 19f, 16.05f, 18.328f, 16.05f, 17.5f)
            curveTo(16.05f, 16.671f, 16.699f, 16f, 17.5f, 16f)
            curveTo(18.301f, 16f, 18.95f, 16.671f, 18.95f, 17.5f)
            curveTo(18.95f, 18.328f, 18.301f, 19f, 17.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MicSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MicSettings, contentDescription = null)
    }
}
