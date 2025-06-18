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

public val FluentUi.Filled.PaintBucketBrush: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBucketBrush",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.75f, 1f)
            curveTo(9.164f, 1f, 9.5f, 1.336f, 9.5f, 1.75f)
            verticalLineTo(3.133f)
            curveTo(9.803f, 3.242f, 10.088f, 3.418f, 10.331f, 3.661f)
            lineTo(14.436f, 7.765f)
            curveTo(15.314f, 8.644f, 15.314f, 10.068f, 14.436f, 10.947f)
            lineTo(9.043f, 16.34f)
            curveTo(8.164f, 17.218f, 6.74f, 17.218f, 5.861f, 16.34f)
            lineTo(1.757f, 12.235f)
            curveTo(0.878f, 11.356f, 0.878f, 9.932f, 1.757f, 9.053f)
            lineTo(7.149f, 3.661f)
            curveTo(7.397f, 3.412f, 7.689f, 3.234f, 8f, 3.126f)
            verticalLineTo(1.75f)
            curveTo(8f, 1.336f, 8.336f, 1f, 8.75f, 1f)
            close()
            moveTo(8f, 6.75f)
            verticalLineTo(4.931f)
            lineTo(2.931f, 10f)
            horizontalLineTo(13.261f)
            lineTo(13.375f, 9.886f)
            curveTo(13.668f, 9.593f, 13.668f, 9.119f, 13.375f, 8.826f)
            lineTo(9.5f, 4.951f)
            verticalLineTo(6.75f)
            curveTo(9.5f, 7.164f, 9.164f, 7.5f, 8.75f, 7.5f)
            curveTo(8.336f, 7.5f, 8f, 7.164f, 8f, 6.75f)
            close()
            moveTo(14.008f, 17.054f)
            curveTo(14.029f, 17.2f, 14.108f, 17.399f, 14.355f, 17.646f)
            curveTo(14.603f, 17.894f, 14.801f, 17.972f, 14.947f, 17.994f)
            curveTo(15.099f, 18.016f, 15.276f, 17.99f, 15.496f, 17.89f)
            curveTo(15.971f, 17.674f, 16.441f, 17.217f, 16.917f, 16.741f)
            curveTo(18.383f, 15.275f, 19.564f, 13.795f, 20.279f, 12.613f)
            curveTo(20.64f, 12.017f, 20.861f, 11.533f, 20.953f, 11.187f)
            curveTo(20.973f, 11.114f, 20.985f, 11.055f, 20.992f, 11.009f)
            curveTo(20.946f, 11.016f, 20.887f, 11.028f, 20.815f, 11.048f)
            curveTo(20.468f, 11.141f, 19.984f, 11.361f, 19.388f, 11.722f)
            curveTo(18.206f, 12.438f, 16.726f, 13.619f, 15.261f, 15.084f)
            curveTo(14.784f, 15.561f, 14.328f, 16.03f, 14.111f, 16.506f)
            curveTo(14.012f, 16.725f, 13.985f, 16.902f, 14.008f, 17.054f)
            close()
            moveTo(14.163f, 14.06f)
            lineTo(14.2f, 14.023f)
            curveTo(15.727f, 12.497f, 17.3f, 11.233f, 18.611f, 10.439f)
            curveTo(19.261f, 10.045f, 19.884f, 9.744f, 20.426f, 9.599f)
            curveTo(20.904f, 9.47f, 21.62f, 9.385f, 22.118f, 9.883f)
            curveTo(22.616f, 10.381f, 22.531f, 11.097f, 22.402f, 11.575f)
            curveTo(22.257f, 12.117f, 21.956f, 12.74f, 21.562f, 13.39f)
            curveTo(20.769f, 14.701f, 19.504f, 16.275f, 17.978f, 17.801f)
            lineTo(17.941f, 17.838f)
            curveTo(17.511f, 18.268f, 16.865f, 18.916f, 16.116f, 19.256f)
            curveTo(15.782f, 19.407f, 15.4f, 19.512f, 14.987f, 19.5f)
            curveTo(15.042f, 20.255f, 14.781f, 21.028f, 14.205f, 21.604f)
            curveTo(13.405f, 22.404f, 12.405f, 22.839f, 11.313f, 22.771f)
            curveTo(10.235f, 22.703f, 9.177f, 22.151f, 8.22f, 21.194f)
            curveTo(8.033f, 21.007f, 7.958f, 20.735f, 8.023f, 20.479f)
            curveTo(8.088f, 20.223f, 8.284f, 20.02f, 8.537f, 19.944f)
            curveTo(9.049f, 19.793f, 9.318f, 19.648f, 9.463f, 19.538f)
            curveTo(9.588f, 19.442f, 9.634f, 19.362f, 9.669f, 19.274f)
            curveTo(9.692f, 19.218f, 9.711f, 19.153f, 9.737f, 19.056f)
            lineTo(9.75f, 19.008f)
            curveTo(9.772f, 18.924f, 9.801f, 18.815f, 9.835f, 18.709f)
            curveTo(9.928f, 18.425f, 10.078f, 18.102f, 10.39f, 17.79f)
            curveTo(10.969f, 17.212f, 11.744f, 16.951f, 12.501f, 17.008f)
            curveTo(12.49f, 16.597f, 12.595f, 16.217f, 12.746f, 15.885f)
            curveTo(13.086f, 15.137f, 13.733f, 14.49f, 14.163f, 14.06f)
            close()
            moveTo(11.451f, 18.851f)
            curveTo(11.351f, 18.951f, 11.304f, 19.044f, 11.262f, 19.173f)
            curveTo(11.242f, 19.235f, 11.226f, 19.294f, 11.205f, 19.374f)
            lineTo(11.187f, 19.443f)
            curveTo(11.158f, 19.55f, 11.12f, 19.687f, 11.063f, 19.83f)
            curveTo(10.938f, 20.142f, 10.736f, 20.452f, 10.373f, 20.73f)
            curveTo(10.315f, 20.774f, 10.253f, 20.818f, 10.188f, 20.859f)
            curveTo(10.626f, 21.125f, 11.038f, 21.25f, 11.407f, 21.274f)
            curveTo(12.008f, 21.312f, 12.603f, 21.085f, 13.144f, 20.544f)
            curveTo(13.611f, 20.076f, 13.611f, 19.318f, 13.144f, 18.851f)
            curveTo(12.676f, 18.383f, 11.918f, 18.383f, 11.451f, 18.851f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaintBucketBrushPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PaintBucketBrush, contentDescription = null)
    }
}
