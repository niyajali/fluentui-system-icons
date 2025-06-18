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

public val FluentUi.Regular.PersonLightbulb: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonLightbulb",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.025f, 15.5f)
            curveTo(13.078f, 14.972f, 13.212f, 14.467f, 13.417f, 14f)
            horizontalLineTo(6.253f)
            curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.249f)
            verticalLineTo(16.827f)
            curveTo(4.004f, 17.719f, 4.322f, 18.583f, 4.902f, 19.262f)
            curveTo(6.468f, 21.096f, 8.854f, 22.001f, 12f, 22.001f)
            curveTo(13.175f, 22.001f, 14.245f, 21.875f, 15.205f, 21.621f)
            lineTo(14.91f, 20.148f)
            curveTo(14.06f, 20.383f, 13.091f, 20.501f, 12f, 20.501f)
            curveTo(9.262f, 20.501f, 7.296f, 19.756f, 6.043f, 18.288f)
            curveTo(5.695f, 17.881f, 5.504f, 17.362f, 5.504f, 16.827f)
            verticalLineTo(16.249f)
            curveTo(5.504f, 15.835f, 5.839f, 15.5f, 6.253f, 15.5f)
            horizontalLineTo(13.025f)
            close()
            moveTo(17f, 7.005f)
            curveTo(17f, 4.243f, 14.762f, 2.005f, 12f, 2.005f)
            curveTo(9.239f, 2.005f, 7f, 4.243f, 7f, 7.005f)
            curveTo(7f, 9.766f, 9.239f, 12.005f, 12f, 12.005f)
            curveTo(14.762f, 12.005f, 17f, 9.766f, 17f, 7.005f)
            close()
            moveTo(8.5f, 7.005f)
            curveTo(8.5f, 5.072f, 10.067f, 3.505f, 12f, 3.505f)
            curveTo(13.933f, 3.505f, 15.5f, 5.072f, 15.5f, 7.005f)
            curveTo(15.5f, 8.938f, 13.933f, 10.505f, 12f, 10.505f)
            curveTo(10.067f, 10.505f, 8.5f, 8.938f, 8.5f, 7.005f)
            close()
            moveTo(22f, 16f)
            curveTo(22f, 17.381f, 21.301f, 18.598f, 20.237f, 19.317f)
            lineTo(20.101f, 20f)
            horizontalLineTo(15.901f)
            lineTo(15.764f, 19.317f)
            curveTo(14.7f, 18.598f, 14f, 17.381f, 14f, 16f)
            curveTo(14f, 13.791f, 15.791f, 12f, 18f, 12f)
            curveTo(20.21f, 12f, 22f, 13.791f, 22f, 16f)
            close()
            moveTo(16.101f, 21f)
            lineTo(16.259f, 21.794f)
            curveTo(16.4f, 22.495f, 17.015f, 23f, 17.73f, 23f)
            horizontalLineTo(18.271f)
            curveTo(18.986f, 23f, 19.601f, 22.495f, 19.742f, 21.794f)
            lineTo(19.9f, 21f)
            horizontalLineTo(16.101f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonLightbulbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonLightbulb, contentDescription = null)
    }
}
