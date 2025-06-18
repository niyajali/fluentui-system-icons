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

public val FluentIcons.Regular.PersonAlert: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonAlert",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.526f, 15.5f)
            curveTo(12.578f, 14.971f, 12.713f, 14.467f, 12.917f, 14f)
            horizontalLineTo(4.253f)
            curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
            verticalLineTo(16.826f)
            curveTo(2.004f, 17.719f, 2.322f, 18.583f, 2.902f, 19.262f)
            curveTo(4.468f, 21.096f, 6.854f, 22.001f, 10f, 22.001f)
            curveTo(10.67f, 22.001f, 11.306f, 21.96f, 11.906f, 21.878f)
            curveTo(11.891f, 21.871f, 11.876f, 21.865f, 11.86f, 21.858f)
            curveTo(11.307f, 21.597f, 10.986f, 21.041f, 10.998f, 20.466f)
            curveTo(10.678f, 20.489f, 10.345f, 20.501f, 10f, 20.501f)
            curveTo(7.262f, 20.501f, 5.296f, 19.755f, 4.043f, 18.288f)
            curveTo(3.695f, 17.88f, 3.504f, 17.362f, 3.504f, 16.826f)
            verticalLineTo(16.249f)
            curveTo(3.504f, 15.835f, 3.839f, 15.5f, 4.253f, 15.5f)
            horizontalLineTo(12.526f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
            close()
            moveTo(10f, 3.505f)
            curveTo(8.067f, 3.505f, 6.5f, 5.072f, 6.5f, 7.005f)
            curveTo(6.5f, 8.938f, 8.067f, 10.505f, 10f, 10.505f)
            curveTo(11.933f, 10.505f, 13.5f, 8.938f, 13.5f, 7.005f)
            curveTo(13.5f, 5.072f, 11.933f, 3.505f, 10f, 3.505f)
            close()
            moveTo(17.503f, 12f)
            curveTo(15.293f, 12f, 13.502f, 13.791f, 13.502f, 16f)
            lineTo(13.502f, 19f)
            lineTo(12.554f, 19.8f)
            curveTo(12.246f, 20.06f, 12.092f, 20.19f, 12.046f, 20.291f)
            curveTo(11.931f, 20.541f, 12.039f, 20.836f, 12.288f, 20.952f)
            curveTo(12.389f, 21f, 12.59f, 21f, 12.993f, 21f)
            horizontalLineTo(22.012f)
            curveTo(22.415f, 21f, 22.616f, 21f, 22.717f, 20.952f)
            curveTo(22.966f, 20.836f, 23.073f, 20.541f, 22.959f, 20.291f)
            curveTo(22.912f, 20.19f, 22.758f, 20.06f, 22.451f, 19.8f)
            lineTo(21.503f, 19f)
            verticalLineTo(16f)
            curveTo(21.503f, 13.791f, 19.712f, 12f, 17.503f, 12f)
            close()
            moveTo(19.003f, 22f)
            curveTo(18.784f, 22.583f, 18.195f, 23f, 17.503f, 23f)
            curveTo(16.81f, 23f, 16.221f, 22.583f, 16.003f, 22f)
            horizontalLineTo(19.003f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonAlertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonAlert, contentDescription = null)
    }
}
