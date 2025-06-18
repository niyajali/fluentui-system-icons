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

public val FluentIcons.Regular.AccessibilityError: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AccessibilityError",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.468f, 6.403f)
            curveTo(10.903f, 6.188f, 10.5f, 5.641f, 10.5f, 5f)
            curveTo(10.5f, 4.172f, 11.172f, 3.5f, 12f, 3.5f)
            curveTo(12.829f, 3.5f, 13.5f, 4.172f, 13.5f, 5f)
            curveTo(13.5f, 5.641f, 13.098f, 6.189f, 12.532f, 6.403f)
            curveTo(12.182f, 6.488f, 11.818f, 6.488f, 11.468f, 6.403f)
            close()
            moveTo(9f, 5f)
            curveTo(9f, 5.135f, 9.009f, 5.268f, 9.026f, 5.399f)
            lineTo(6.15f, 4.178f)
            curveTo(5.007f, 3.693f, 3.682f, 4.222f, 3.189f, 5.362f)
            curveTo(2.693f, 6.505f, 3.223f, 7.829f, 4.37f, 8.316f)
            lineTo(8.003f, 9.858f)
            verticalLineTo(13.559f)
            lineTo(6.124f, 19.017f)
            curveTo(5.719f, 20.191f, 6.344f, 21.472f, 7.519f, 21.876f)
            curveTo(8.694f, 22.281f, 9.974f, 21.656f, 10.379f, 20.482f)
            lineTo(10.524f, 20.06f)
            curveTo(10.187f, 19.274f, 10f, 18.409f, 10f, 17.5f)
            curveTo(10f, 17.295f, 10.01f, 17.092f, 10.028f, 16.891f)
            lineTo(8.96f, 19.993f)
            curveTo(8.825f, 20.385f, 8.399f, 20.593f, 8.007f, 20.458f)
            curveTo(7.615f, 20.323f, 7.407f, 19.896f, 7.542f, 19.505f)
            lineTo(9.435f, 14.008f)
            curveTo(9.48f, 13.877f, 9.503f, 13.74f, 9.503f, 13.601f)
            verticalLineTo(9.693f)
            curveTo(9.503f, 9.191f, 9.203f, 8.738f, 8.741f, 8.542f)
            lineTo(4.956f, 6.935f)
            curveTo(4.575f, 6.774f, 4.401f, 6.337f, 4.565f, 5.958f)
            curveTo(4.731f, 5.575f, 5.18f, 5.395f, 5.564f, 5.559f)
            lineTo(10.535f, 7.669f)
            curveTo(10.694f, 7.736f, 10.857f, 7.792f, 11.022f, 7.837f)
            curveTo(11.329f, 7.943f, 11.658f, 8f, 12f, 8f)
            curveTo(12.342f, 8f, 12.671f, 7.943f, 12.978f, 7.837f)
            curveTo(13.143f, 7.793f, 13.306f, 7.736f, 13.465f, 7.669f)
            lineTo(18.437f, 5.559f)
            curveTo(18.821f, 5.395f, 19.269f, 5.575f, 19.435f, 5.958f)
            curveTo(19.6f, 6.337f, 19.425f, 6.774f, 19.045f, 6.935f)
            lineTo(15.264f, 8.54f)
            curveTo(14.803f, 8.736f, 14.503f, 9.189f, 14.503f, 9.691f)
            verticalLineTo(11.313f)
            curveTo(14.981f, 11.158f, 15.483f, 11.058f, 16.003f, 11.019f)
            verticalLineTo(9.856f)
            lineTo(19.631f, 8.316f)
            curveTo(20.778f, 7.829f, 21.307f, 6.505f, 20.812f, 5.362f)
            curveTo(20.318f, 4.222f, 18.993f, 3.693f, 17.85f, 4.178f)
            lineTo(14.974f, 5.399f)
            curveTo(14.991f, 5.268f, 15f, 5.135f, 15f, 5f)
            curveTo(15f, 3.343f, 13.657f, 2f, 12f, 2f)
            curveTo(10.343f, 2f, 9f, 3.343f, 9f, 5f)
            close()
            moveTo(22f, 17.5f)
            curveTo(22f, 20.538f, 19.538f, 23f, 16.5f, 23f)
            curveTo(13.463f, 23f, 11f, 20.538f, 11f, 17.5f)
            curveTo(11f, 14.462f, 13.463f, 12f, 16.5f, 12f)
            curveTo(19.538f, 12f, 22f, 14.462f, 22f, 17.5f)
            close()
            moveTo(16.5f, 14f)
            curveTo(16.224f, 14f, 16f, 14.224f, 16f, 14.5f)
            verticalLineTo(18.5f)
            curveTo(16f, 18.776f, 16.224f, 19f, 16.5f, 19f)
            curveTo(16.776f, 19f, 17f, 18.776f, 17f, 18.5f)
            verticalLineTo(14.5f)
            curveTo(17f, 14.224f, 16.776f, 14f, 16.5f, 14f)
            close()
            moveTo(16.5f, 21.125f)
            curveTo(16.845f, 21.125f, 17.125f, 20.845f, 17.125f, 20.5f)
            curveTo(17.125f, 20.155f, 16.845f, 19.875f, 16.5f, 19.875f)
            curveTo(16.155f, 19.875f, 15.875f, 20.155f, 15.875f, 20.5f)
            curveTo(15.875f, 20.845f, 16.155f, 21.125f, 16.5f, 21.125f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AccessibilityErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AccessibilityError, contentDescription = null)
    }
}
