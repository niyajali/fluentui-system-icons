/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.PersonCall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonCall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.383f, 15.5f)
            curveTo(17.132f, 15.045f, 17.049f, 14.513f, 17.152f, 14f)
            horizontalLineTo(6.253f)
            curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.249f)
            verticalLineTo(16.826f)
            curveTo(4.004f, 17.719f, 4.322f, 18.583f, 4.902f, 19.262f)
            curveTo(6.468f, 21.096f, 8.854f, 22.001f, 12f, 22.001f)
            curveTo(12.389f, 22.001f, 12.767f, 21.987f, 13.133f, 21.959f)
            curveTo(12.96f, 21.477f, 12.955f, 20.945f, 13.125f, 20.456f)
            curveTo(12.766f, 20.486f, 12.391f, 20.501f, 12f, 20.501f)
            curveTo(9.262f, 20.501f, 7.296f, 19.755f, 6.043f, 18.288f)
            curveTo(5.695f, 17.88f, 5.504f, 17.362f, 5.504f, 16.826f)
            verticalLineTo(16.249f)
            curveTo(5.504f, 15.835f, 5.839f, 15.5f, 6.253f, 15.5f)
            horizontalLineTo(17.383f)
            close()
            moveTo(12f, 2.005f)
            curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
            curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
            curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
            curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
            close()
            moveTo(12f, 3.505f)
            curveTo(10.067f, 3.505f, 8.5f, 5.072f, 8.5f, 7.005f)
            curveTo(8.5f, 8.938f, 10.067f, 10.505f, 12f, 10.505f)
            curveTo(13.933f, 10.505f, 15.5f, 8.938f, 15.5f, 7.005f)
            curveTo(15.5f, 5.072f, 13.933f, 3.505f, 12f, 3.505f)
            close()
            moveTo(18.192f, 13.995f)
            lineTo(18.668f, 12.79f)
            curveTo(18.91f, 12.176f, 19.589f, 11.857f, 20.216f, 12.062f)
            lineTo(20.647f, 12.203f)
            curveTo(21.371f, 12.44f, 21.973f, 13.009f, 21.997f, 13.772f)
            curveTo(22.096f, 16.883f, 19.521f, 21.354f, 16.784f, 22.827f)
            curveTo(16.111f, 23.189f, 15.316f, 22.95f, 14.748f, 22.436f)
            lineTo(14.412f, 22.131f)
            curveTo(13.923f, 21.688f, 13.861f, 20.942f, 14.27f, 20.425f)
            lineTo(15.07f, 19.415f)
            curveTo(15.36f, 19.048f, 15.837f, 18.884f, 16.291f, 18.995f)
            lineTo(17.582f, 19.308f)
            curveTo(18.685f, 18.578f, 19.277f, 17.552f, 19.356f, 16.229f)
            lineTo(18.44f, 15.265f)
            curveTo(18.117f, 14.926f, 18.021f, 14.43f, 18.192f, 13.995f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonCallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonCall, contentDescription = null)
    }
}
