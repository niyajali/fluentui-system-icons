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

public val FluentIcons.Regular.Accessibility: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Accessibility",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 5f)
            curveTo(10.5f, 5.641f, 10.902f, 6.188f, 11.468f, 6.403f)
            curveTo(11.817f, 6.488f, 12.182f, 6.488f, 12.531f, 6.403f)
            curveTo(13.097f, 6.189f, 13.5f, 5.641f, 13.5f, 5f)
            curveTo(13.5f, 4.172f, 12.828f, 3.5f, 12f, 3.5f)
            curveTo(11.172f, 3.5f, 10.5f, 4.172f, 10.5f, 5f)
            close()
            moveTo(9.026f, 5.399f)
            curveTo(9.009f, 5.268f, 9f, 5.135f, 9f, 5f)
            curveTo(9f, 3.343f, 10.343f, 2f, 12f, 2f)
            curveTo(13.657f, 2f, 15f, 3.343f, 15f, 5f)
            curveTo(15f, 5.135f, 14.991f, 5.268f, 14.974f, 5.399f)
            lineTo(17.85f, 4.178f)
            curveTo(18.993f, 3.693f, 20.318f, 4.222f, 20.812f, 5.362f)
            curveTo(21.307f, 6.505f, 20.778f, 7.829f, 19.631f, 8.316f)
            lineTo(16.003f, 9.856f)
            verticalLineTo(13.573f)
            lineTo(17.877f, 19.017f)
            curveTo(18.281f, 20.192f, 17.657f, 21.472f, 16.482f, 21.877f)
            curveTo(15.307f, 22.281f, 14.027f, 21.657f, 13.622f, 20.482f)
            lineTo(12f, 15.771f)
            lineTo(10.378f, 20.482f)
            curveTo(9.974f, 21.656f, 8.693f, 22.281f, 7.518f, 21.876f)
            curveTo(6.343f, 21.472f, 5.719f, 20.191f, 6.123f, 19.017f)
            lineTo(8.002f, 13.559f)
            verticalLineTo(9.858f)
            lineTo(4.37f, 8.316f)
            curveTo(3.222f, 7.829f, 2.693f, 6.505f, 3.188f, 5.362f)
            curveTo(3.682f, 4.222f, 5.007f, 3.693f, 6.15f, 4.178f)
            lineTo(9.026f, 5.399f)
            close()
            moveTo(11.022f, 7.837f)
            curveTo(10.857f, 7.792f, 10.694f, 7.736f, 10.535f, 7.669f)
            lineTo(5.564f, 5.559f)
            curveTo(5.179f, 5.395f, 4.731f, 5.575f, 4.565f, 5.958f)
            curveTo(4.401f, 6.337f, 4.575f, 6.774f, 4.956f, 6.935f)
            lineTo(8.741f, 8.542f)
            curveTo(9.203f, 8.738f, 9.502f, 9.191f, 9.502f, 9.693f)
            verticalLineTo(13.601f)
            curveTo(9.502f, 13.74f, 9.479f, 13.877f, 9.434f, 14.008f)
            lineTo(7.542f, 19.505f)
            curveTo(7.407f, 19.896f, 7.615f, 20.323f, 8.007f, 20.458f)
            curveTo(8.398f, 20.593f, 8.825f, 20.385f, 8.96f, 19.993f)
            lineTo(11.068f, 13.87f)
            curveTo(11.374f, 12.982f, 12.627f, 12.986f, 12.932f, 13.87f)
            lineTo(15.04f, 19.993f)
            curveTo(15.175f, 20.385f, 15.602f, 20.593f, 15.994f, 20.458f)
            curveTo(16.385f, 20.323f, 16.593f, 19.897f, 16.458f, 19.505f)
            lineTo(14.571f, 14.022f)
            curveTo(14.526f, 13.891f, 14.502f, 13.753f, 14.502f, 13.615f)
            verticalLineTo(9.691f)
            curveTo(14.502f, 9.189f, 14.802f, 8.736f, 15.264f, 8.54f)
            lineTo(19.045f, 6.935f)
            curveTo(19.425f, 6.774f, 19.6f, 6.337f, 19.435f, 5.958f)
            curveTo(19.269f, 5.575f, 18.821f, 5.395f, 18.436f, 5.559f)
            lineTo(13.465f, 7.669f)
            curveTo(13.306f, 7.736f, 13.143f, 7.793f, 12.977f, 7.837f)
            curveTo(12.671f, 7.943f, 12.342f, 8f, 12f, 8f)
            curveTo(11.658f, 8f, 11.328f, 7.943f, 11.022f, 7.837f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AccessibilityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Accessibility, contentDescription = null)
    }
}
