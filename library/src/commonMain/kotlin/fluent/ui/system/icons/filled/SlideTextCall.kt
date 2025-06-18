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

public val FluentUi.Filled.SlideTextCall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideTextCall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineTo(14.148f)
            curveTo(13.874f, 19.28f, 13.978f, 18.441f, 14.486f, 17.799f)
            lineTo(15.286f, 16.789f)
            curveTo(15.818f, 16.118f, 16.692f, 15.817f, 17.524f, 16.019f)
            lineTo(18.362f, 16.222f)
            curveTo(18.882f, 15.785f, 19.192f, 15.248f, 19.31f, 14.578f)
            lineTo(18.715f, 13.953f)
            curveTo(18.124f, 13.331f, 17.947f, 12.423f, 18.262f, 11.625f)
            lineTo(18.738f, 10.421f)
            curveTo(19.174f, 9.315f, 20.395f, 8.741f, 21.525f, 9.111f)
            lineTo(21.956f, 9.252f)
            curveTo(21.971f, 9.257f, 21.985f, 9.262f, 22f, 9.267f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(6f, 8.75f)
            curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 8f, 12f, 8.336f, 12f, 8.75f)
            curveTo(12f, 9.164f, 11.664f, 9.5f, 11.25f, 9.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 9.5f, 6f, 9.164f, 6f, 8.75f)
            close()
            moveTo(6f, 11.75f)
            curveTo(6f, 11.336f, 6.336f, 11f, 6.75f, 11f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 11f, 16f, 11.336f, 16f, 11.75f)
            curveTo(16f, 12.164f, 15.664f, 12.5f, 15.25f, 12.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 12.5f, 6f, 12.164f, 6f, 11.75f)
            close()
            moveTo(6.75f, 15.5f)
            curveTo(6.336f, 15.5f, 6f, 15.164f, 6f, 14.75f)
            curveTo(6f, 14.336f, 6.336f, 14f, 6.75f, 14f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 14f, 14f, 14.336f, 14f, 14.75f)
            curveTo(14f, 15.164f, 13.664f, 15.5f, 13.25f, 15.5f)
            horizontalLineTo(6.75f)
            close()
            moveTo(19.192f, 11.995f)
            lineTo(19.668f, 10.79f)
            curveTo(19.91f, 10.176f, 20.589f, 9.857f, 21.216f, 10.062f)
            lineTo(21.647f, 10.203f)
            curveTo(22.371f, 10.44f, 22.973f, 11.009f, 22.997f, 11.772f)
            curveTo(23.096f, 14.883f, 20.521f, 19.354f, 17.784f, 20.827f)
            curveTo(17.111f, 21.189f, 16.316f, 20.95f, 15.748f, 20.436f)
            lineTo(15.412f, 20.131f)
            curveTo(14.923f, 19.688f, 14.861f, 18.942f, 15.27f, 18.425f)
            lineTo(16.07f, 17.415f)
            curveTo(16.36f, 17.048f, 16.837f, 16.884f, 17.291f, 16.995f)
            lineTo(18.582f, 17.308f)
            curveTo(19.685f, 16.578f, 20.277f, 15.552f, 20.356f, 14.229f)
            lineTo(19.44f, 13.265f)
            curveTo(19.117f, 12.926f, 19.021f, 12.43f, 19.192f, 11.995f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideTextCallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SlideTextCall, contentDescription = null)
    }
}
