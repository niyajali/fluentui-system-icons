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

public val FluentIcons.Filled.WifiWarning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WifiWarning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.784f, 10.708f)
            curveTo(17.903f, 10.827f, 18.018f, 10.951f, 18.131f, 11.079f)
            curveTo(17.338f, 10.877f, 16.459f, 11.063f, 15.825f, 11.638f)
            curveTo(13.42f, 9.742f, 9.922f, 9.904f, 7.704f, 12.123f)
            curveTo(7.239f, 12.587f, 6.861f, 13.11f, 6.57f, 13.685f)
            curveTo(6.321f, 14.177f, 5.72f, 14.375f, 5.227f, 14.126f)
            curveTo(4.734f, 13.876f, 4.536f, 13.275f, 4.786f, 12.782f)
            curveTo(5.172f, 12.019f, 5.674f, 11.324f, 6.289f, 10.708f)
            curveTo(9.464f, 7.534f, 14.61f, 7.534f, 17.784f, 10.708f)
            close()
            moveTo(11.955f, 19.003f)
            lineTo(13.173f, 16.566f)
            curveTo(13.139f, 16.523f, 13.101f, 16.481f, 13.061f, 16.441f)
            curveTo(12.475f, 15.855f, 11.525f, 15.855f, 10.939f, 16.441f)
            curveTo(10.352f, 17.027f, 10.352f, 17.978f, 10.939f, 18.564f)
            curveTo(11.22f, 18.846f, 11.586f, 18.992f, 11.955f, 19.003f)
            close()
            moveTo(14.028f, 14.854f)
            lineTo(14.934f, 13.042f)
            curveTo(12.901f, 11.687f, 10.129f, 11.906f, 8.335f, 13.7f)
            curveTo(7.875f, 14.16f, 7.509f, 14.709f, 7.245f, 15.313f)
            curveTo(7.024f, 15.818f, 7.254f, 16.408f, 7.76f, 16.629f)
            curveTo(8.266f, 16.851f, 8.856f, 16.62f, 9.077f, 16.114f)
            curveTo(9.244f, 15.733f, 9.471f, 15.392f, 9.749f, 15.114f)
            curveTo(10.918f, 13.945f, 12.76f, 13.858f, 14.028f, 14.854f)
            close()
            moveTo(20.419f, 8.299f)
            curveTo(20.927f, 8.807f, 21.406f, 9.386f, 21.823f, 9.99f)
            curveTo(22.137f, 10.445f, 22.023f, 11.068f, 21.568f, 11.381f)
            curveTo(21.114f, 11.695f, 20.491f, 11.581f, 20.177f, 11.126f)
            curveTo(19.827f, 10.62f, 19.426f, 10.133f, 19.005f, 9.713f)
            curveTo(15.133f, 5.841f, 8.854f, 5.841f, 4.982f, 9.713f)
            curveTo(4.583f, 10.112f, 4.185f, 10.599f, 3.822f, 11.122f)
            curveTo(3.507f, 11.576f, 2.884f, 11.689f, 2.43f, 11.374f)
            curveTo(1.976f, 11.059f, 1.864f, 10.436f, 2.178f, 9.982f)
            curveTo(2.606f, 9.365f, 3.079f, 8.788f, 3.568f, 8.299f)
            curveTo(8.221f, 3.645f, 15.766f, 3.645f, 20.419f, 8.299f)
            close()
            moveTo(16.157f, 12.83f)
            lineTo(12.16f, 20.828f)
            curveTo(11.661f, 21.826f, 12.387f, 23f, 13.503f, 23f)
            horizontalLineTo(21.497f)
            curveTo(22.613f, 23f, 23.338f, 21.826f, 22.84f, 20.828f)
            lineTo(18.843f, 12.83f)
            curveTo(18.29f, 11.723f, 16.71f, 11.723f, 16.157f, 12.83f)
            close()
            moveTo(18f, 15.496f)
            verticalLineTo(18.497f)
            curveTo(18f, 18.774f, 17.776f, 18.998f, 17.5f, 18.998f)
            curveTo(17.224f, 18.998f, 17f, 18.774f, 17f, 18.497f)
            verticalLineTo(15.496f)
            curveTo(17f, 15.219f, 17.224f, 14.995f, 17.5f, 14.995f)
            curveTo(17.776f, 14.995f, 18f, 15.219f, 18f, 15.496f)
            close()
            moveTo(17.5f, 20.999f)
            curveTo(17.224f, 20.999f, 17f, 20.775f, 17f, 20.499f)
            curveTo(17f, 20.222f, 17.224f, 19.998f, 17.5f, 19.998f)
            curveTo(17.776f, 19.998f, 18f, 20.222f, 18f, 20.499f)
            curveTo(18f, 20.775f, 17.776f, 20.999f, 17.5f, 20.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WifiWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WifiWarning, contentDescription = null)
    }
}
