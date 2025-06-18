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

public val FluentIcons.Filled.PersonAlertOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonAlertOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.939f, 14.061f)
            curveTo(11.92f, 14.041f, 11.9f, 14.021f, 11.882f, 14f)
            horizontalLineTo(4.253f)
            curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
            verticalLineTo(17.169f)
            curveTo(2.004f, 17.741f, 2.182f, 18.299f, 2.514f, 18.765f)
            curveTo(4.056f, 20.929f, 6.579f, 22.001f, 10f, 22.001f)
            curveTo(10.67f, 22.001f, 11.305f, 21.96f, 11.906f, 21.878f)
            curveTo(11.891f, 21.871f, 11.875f, 21.865f, 11.86f, 21.858f)
            curveTo(11.115f, 21.507f, 10.792f, 20.622f, 11.135f, 19.874f)
            curveTo(11.248f, 19.629f, 11.431f, 19.455f, 11.516f, 19.376f)
            curveTo(11.618f, 19.28f, 11.751f, 19.168f, 11.89f, 19.051f)
            lineTo(12.501f, 18.535f)
            lineTo(12.501f, 16f)
            curveTo(12.501f, 15.577f, 12.553f, 15.166f, 12.652f, 14.774f)
            lineTo(11.939f, 14.061f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
            close()
            moveTo(13.502f, 16f)
            curveTo(13.502f, 15.47f, 13.606f, 14.963f, 13.793f, 14.5f)
            lineTo(12.646f, 13.354f)
            curveTo(12.451f, 13.158f, 12.451f, 12.842f, 12.646f, 12.646f)
            curveTo(12.842f, 12.451f, 13.158f, 12.451f, 13.354f, 12.646f)
            lineTo(22.354f, 21.646f)
            curveTo(22.549f, 21.842f, 22.549f, 22.158f, 22.354f, 22.354f)
            curveTo(22.158f, 22.549f, 21.842f, 22.549f, 21.646f, 22.354f)
            lineTo(20.293f, 21f)
            horizontalLineTo(12.993f)
            curveTo(12.59f, 21f, 12.389f, 21f, 12.288f, 20.952f)
            curveTo(12.039f, 20.836f, 11.931f, 20.541f, 12.046f, 20.291f)
            curveTo(12.092f, 20.19f, 12.246f, 20.06f, 12.554f, 19.8f)
            lineTo(13.502f, 19f)
            lineTo(13.502f, 16f)
            close()
            moveTo(21.503f, 18f)
            verticalLineTo(16f)
            curveTo(21.503f, 13.791f, 19.712f, 12f, 17.503f, 12f)
            curveTo(16.556f, 12f, 15.686f, 12.329f, 15f, 12.879f)
            lineTo(21.5f, 19.379f)
            verticalLineTo(18f)
            horizontalLineTo(21.503f)
            close()
            moveTo(17.503f, 23f)
            curveTo(18.195f, 23f, 18.784f, 22.583f, 19.003f, 22f)
            horizontalLineTo(16.003f)
            curveTo(16.221f, 22.583f, 16.81f, 23f, 17.503f, 23f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonAlertOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonAlertOff, contentDescription = null)
    }
}
