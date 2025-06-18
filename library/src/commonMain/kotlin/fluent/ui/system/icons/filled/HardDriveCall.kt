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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.HardDriveCall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HardDriveCall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.441f, 4f)
            curveTo(6.578f, 4f, 5.791f, 4.493f, 5.415f, 5.27f)
            lineTo(2.729f, 10.821f)
            curveTo(3.194f, 10.615f, 3.709f, 10.5f, 4.25f, 10.5f)
            horizontalLineTo(19.413f)
            curveTo(19.821f, 10.169f, 20.339f, 9.988f, 20.873f, 9.999f)
            lineTo(18.585f, 5.27f)
            curveTo(18.209f, 4.493f, 17.422f, 4f, 16.559f, 4f)
            horizontalLineTo(7.441f)
            close()
            moveTo(4.25f, 12f)
            horizontalLineTo(18.509f)
            lineTo(18.262f, 12.625f)
            curveTo(17.947f, 13.422f, 18.124f, 14.331f, 18.715f, 14.953f)
            lineTo(19.31f, 15.578f)
            curveTo(19.192f, 16.247f, 18.882f, 16.785f, 18.362f, 17.222f)
            lineTo(17.524f, 17.019f)
            curveTo(16.692f, 16.817f, 15.818f, 17.118f, 15.286f, 17.789f)
            lineTo(14.486f, 18.799f)
            curveTo(14.435f, 18.864f, 14.387f, 18.931f, 14.344f, 19f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 19f, 2f, 17.993f, 2f, 16.75f)
            verticalLineTo(14.25f)
            curveTo(2f, 13.007f, 3.007f, 12f, 4.25f, 12f)
            close()
            moveTo(19.192f, 12.995f)
            lineTo(19.668f, 11.79f)
            curveTo(19.91f, 11.176f, 20.589f, 10.857f, 21.216f, 11.062f)
            lineTo(21.647f, 11.203f)
            curveTo(22.371f, 11.44f, 22.973f, 12.009f, 22.997f, 12.772f)
            curveTo(23.096f, 15.883f, 20.521f, 20.354f, 17.784f, 21.827f)
            curveTo(17.111f, 22.189f, 16.316f, 21.95f, 15.748f, 21.436f)
            lineTo(15.412f, 21.131f)
            curveTo(14.923f, 20.688f, 14.861f, 19.942f, 15.27f, 19.425f)
            lineTo(16.07f, 18.415f)
            curveTo(16.36f, 18.048f, 16.837f, 17.884f, 17.291f, 17.995f)
            lineTo(18.582f, 18.308f)
            curveTo(19.685f, 17.578f, 20.277f, 16.552f, 20.356f, 15.229f)
            lineTo(19.44f, 14.265f)
            curveTo(19.117f, 13.926f, 19.021f, 13.43f, 19.192f, 12.995f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HardDriveCallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.HardDriveCall, contentDescription = null)
    }
}
