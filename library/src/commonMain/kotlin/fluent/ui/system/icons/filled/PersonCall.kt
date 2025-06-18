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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.PersonCall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonCall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.715f, 15.953f)
            curveTo(17.215f, 15.427f, 17.012f, 14.696f, 17.152f, 14f)
            horizontalLineTo(6.253f)
            curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.249f)
            verticalLineTo(17.169f)
            curveTo(4.004f, 17.741f, 4.182f, 18.299f, 4.514f, 18.765f)
            curveTo(6.056f, 20.929f, 8.579f, 22.001f, 12f, 22.001f)
            curveTo(12.389f, 22.001f, 12.767f, 21.987f, 13.133f, 21.959f)
            curveTo(12.878f, 21.249f, 12.987f, 20.429f, 13.486f, 19.799f)
            lineTo(14.286f, 18.789f)
            curveTo(14.818f, 18.118f, 15.692f, 17.817f, 16.524f, 18.019f)
            lineTo(17.362f, 18.222f)
            curveTo(17.882f, 17.785f, 18.192f, 17.247f, 18.31f, 16.578f)
            lineTo(17.715f, 15.953f)
            close()
            moveTo(12f, 2.005f)
            curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
            curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
            curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
            curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
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
        Image(imageVector = FluentUi.Filled.PersonCall, contentDescription = null)
    }
}
