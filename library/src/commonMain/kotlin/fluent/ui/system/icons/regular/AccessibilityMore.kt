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

public val FluentUi.Regular.AccessibilityMore: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AccessibilityMore",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.068f, 13.87f)
            lineTo(9.584f, 18.179f)
            curveTo(9.868f, 18.067f, 10.175f, 18f, 10.499f, 18f)
            curveTo(10.742f, 18f, 10.972f, 18.046f, 11.194f, 18.11f)
            lineTo(11.999f, 15.771f)
            lineTo(13.255f, 19.418f)
            curveTo(13.504f, 18.904f, 13.92f, 18.489f, 14.437f, 18.244f)
            lineTo(12.93f, 13.869f)
            curveTo(12.626f, 12.985f, 11.372f, 12.981f, 11.067f, 13.869f)
            lineTo(11.068f, 13.87f)
            close()
            moveTo(20.812f, 5.362f)
            curveTo(20.318f, 4.222f, 18.994f, 3.693f, 17.851f, 4.178f)
            lineTo(14.975f, 5.399f)
            curveTo(14.992f, 5.269f, 15.001f, 5.135f, 15.001f, 5f)
            curveTo(15.001f, 3.343f, 13.658f, 2f, 12.001f, 2f)
            curveTo(10.344f, 2f, 9.001f, 3.343f, 9.001f, 5f)
            curveTo(9.001f, 5.135f, 9.01f, 5.268f, 9.027f, 5.399f)
            lineTo(6.151f, 4.178f)
            curveTo(5.008f, 3.693f, 3.683f, 4.222f, 3.19f, 5.362f)
            curveTo(2.695f, 6.505f, 3.224f, 7.829f, 4.371f, 8.316f)
            lineTo(8.004f, 9.858f)
            verticalLineTo(13.559f)
            lineTo(6.125f, 19.016f)
            curveTo(5.72f, 20.191f, 6.345f, 21.471f, 7.52f, 21.876f)
            curveTo(7.845f, 21.988f, 8.177f, 22.014f, 8.497f, 21.979f)
            curveTo(8.19f, 21.564f, 8.002f, 21.055f, 8.002f, 20.5f)
            curveTo(8.002f, 20.485f, 8.006f, 20.471f, 8.006f, 20.457f)
            curveTo(7.616f, 20.321f, 7.409f, 19.896f, 7.543f, 19.505f)
            lineTo(9.436f, 14.008f)
            curveTo(9.481f, 13.877f, 9.504f, 13.74f, 9.504f, 13.601f)
            verticalLineTo(9.692f)
            curveTo(9.504f, 9.19f, 9.204f, 8.737f, 8.742f, 8.541f)
            lineTo(4.957f, 6.934f)
            curveTo(4.576f, 6.772f, 4.402f, 6.336f, 4.566f, 5.957f)
            curveTo(4.732f, 5.574f, 5.18f, 5.394f, 5.565f, 5.558f)
            lineTo(10.536f, 7.668f)
            curveTo(10.695f, 7.736f, 10.858f, 7.792f, 11.023f, 7.836f)
            curveTo(11.33f, 7.942f, 11.658f, 7.999f, 12.001f, 7.999f)
            curveTo(12.344f, 7.999f, 12.672f, 7.942f, 12.978f, 7.836f)
            curveTo(13.143f, 7.791f, 13.306f, 7.735f, 13.466f, 7.667f)
            lineTo(18.437f, 5.557f)
            curveTo(18.822f, 5.394f, 19.27f, 5.573f, 19.436f, 5.956f)
            curveTo(19.6f, 6.335f, 19.426f, 6.772f, 19.045f, 6.933f)
            lineTo(15.265f, 8.538f)
            curveTo(14.803f, 8.734f, 14.503f, 9.187f, 14.503f, 9.689f)
            verticalLineTo(13.613f)
            curveTo(14.503f, 13.752f, 14.526f, 13.889f, 14.571f, 14.02f)
            lineTo(15.957f, 18.044f)
            curveTo(16.991f, 18.236f, 17.795f, 19.063f, 17.961f, 20.106f)
            curveTo(18.019f, 19.751f, 18.003f, 19.379f, 17.877f, 19.015f)
            lineTo(16.003f, 13.572f)
            verticalLineTo(9.855f)
            lineTo(19.631f, 8.315f)
            curveTo(20.778f, 7.828f, 21.307f, 6.505f, 20.812f, 5.362f)
            close()
            moveTo(12.531f, 6.403f)
            curveTo(12.182f, 6.488f, 11.817f, 6.488f, 11.468f, 6.403f)
            curveTo(10.902f, 6.188f, 10.5f, 5.641f, 10.5f, 5f)
            curveTo(10.5f, 4.172f, 11.172f, 3.5f, 12f, 3.5f)
            curveTo(12.828f, 3.5f, 13.5f, 4.172f, 13.5f, 5f)
            curveTo(13.5f, 5.641f, 13.098f, 6.189f, 12.532f, 6.403f)
            horizontalLineTo(12.531f)
            close()
            moveTo(12f, 20.5f)
            curveTo(12f, 21.328f, 11.328f, 22f, 10.5f, 22f)
            curveTo(9.672f, 22f, 9f, 21.328f, 9f, 20.5f)
            curveTo(9f, 19.672f, 9.672f, 19f, 10.5f, 19f)
            curveTo(11.328f, 19f, 12f, 19.672f, 12f, 20.5f)
            close()
            moveTo(15.5f, 22f)
            curveTo(16.328f, 22f, 17f, 21.328f, 17f, 20.5f)
            curveTo(17f, 19.672f, 16.328f, 19f, 15.5f, 19f)
            curveTo(14.672f, 19f, 14f, 19.672f, 14f, 20.5f)
            curveTo(14f, 21.328f, 14.672f, 22f, 15.5f, 22f)
            close()
            moveTo(20.5f, 22f)
            curveTo(21.328f, 22f, 22f, 21.328f, 22f, 20.5f)
            curveTo(22f, 19.672f, 21.328f, 19f, 20.5f, 19f)
            curveTo(19.672f, 19f, 19f, 19.672f, 19f, 20.5f)
            curveTo(19f, 21.328f, 19.672f, 22f, 20.5f, 22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AccessibilityMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AccessibilityMore, contentDescription = null)
    }
}
