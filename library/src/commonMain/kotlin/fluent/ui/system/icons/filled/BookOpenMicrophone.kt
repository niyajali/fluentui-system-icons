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

public val FluentIcons.Filled.BookOpenMicrophone: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookOpenMicrophone",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineTo(18f)
            curveTo(2f, 19.105f, 2.895f, 20f, 4f, 20f)
            horizontalLineTo(10f)
            curveTo(10.768f, 20f, 11.469f, 19.711f, 12f, 19.236f)
            curveTo(12.472f, 19.659f, 13.08f, 19.934f, 13.75f, 19.99f)
            curveTo(13.51f, 19.619f, 13.32f, 19.216f, 13.191f, 18.789f)
            curveTo(13.067f, 18.377f, 13f, 17.944f, 13f, 17.5f)
            curveTo(13f, 17.406f, 13.009f, 17.314f, 13.025f, 17.224f)
            curveTo(13.009f, 17.152f, 13f, 17.077f, 13f, 17f)
            verticalLineTo(7f)
            curveTo(13f, 6.448f, 13.448f, 6f, 14f, 6f)
            horizontalLineTo(20f)
            verticalLineTo(11.334f)
            curveTo(20.53f, 11.587f, 20.974f, 11.966f, 21.305f, 12.415f)
            curveTo(21.747f, 13.014f, 22f, 13.75f, 22f, 14.5f)
            verticalLineTo(6f)
            curveTo(22f, 4.895f, 21.105f, 4f, 20f, 4f)
            horizontalLineTo(14f)
            curveTo(13.232f, 4f, 12.531f, 4.289f, 12f, 4.764f)
            curveTo(11.469f, 4.289f, 10.768f, 4f, 10f, 4f)
            horizontalLineTo(4f)
            close()
            moveTo(11f, 7f)
            verticalLineTo(17f)
            curveTo(11f, 17.552f, 10.552f, 18f, 10f, 18f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            horizontalLineTo(10f)
            curveTo(10.552f, 6f, 11f, 6.448f, 11f, 7f)
            close()
            moveTo(22f, 17.5f)
            curveTo(22f, 18.511f, 21.477f, 19.355f, 20.663f, 19.888f)
            curveTo(20.068f, 20.277f, 19.316f, 20.5f, 18.5f, 20.5f)
            curveTo(17.766f, 20.5f, 17.084f, 20.32f, 16.521f, 20f)
            curveTo(16.214f, 19.825f, 15.942f, 19.609f, 15.716f, 19.358f)
            curveTo(15.488f, 19.105f, 15.307f, 18.817f, 15.185f, 18.5f)
            curveTo(15.149f, 18.407f, 15.118f, 18.313f, 15.092f, 18.215f)
            curveTo(15.073f, 18.145f, 15.057f, 18.073f, 15.044f, 18f)
            curveTo(15.015f, 17.839f, 15f, 17.672f, 15f, 17.5f)
            curveTo(15f, 17.224f, 14.776f, 17f, 14.5f, 17f)
            curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
            curveTo(14f, 17.669f, 14.012f, 17.836f, 14.037f, 18f)
            curveTo(14.062f, 18.17f, 14.099f, 18.337f, 14.149f, 18.5f)
            curveTo(14.185f, 18.62f, 14.227f, 18.737f, 14.275f, 18.853f)
            curveTo(14.45f, 19.27f, 14.703f, 19.657f, 15.018f, 20f)
            curveTo(15.744f, 20.789f, 16.801f, 21.34f, 18f, 21.472f)
            verticalLineTo(22.5f)
            curveTo(18f, 22.776f, 18.224f, 23f, 18.5f, 23f)
            curveTo(18.776f, 23f, 19f, 22.776f, 19f, 22.5f)
            verticalLineTo(21.472f)
            curveTo(21.25f, 21.224f, 23f, 19.5f, 23f, 17.5f)
            curveTo(23f, 17.224f, 22.776f, 17f, 22.5f, 17f)
            curveTo(22.224f, 17f, 22f, 17.224f, 22f, 17.5f)
            close()
            moveTo(16.504f, 18.5f)
            curveTo(16.389f, 18.344f, 16.291f, 18.176f, 16.214f, 18f)
            curveTo(16.075f, 17.684f, 16f, 17.342f, 16f, 17f)
            verticalLineTo(14.5f)
            curveTo(16f, 13.246f, 17f, 12f, 18.5f, 12f)
            curveTo(19.086f, 12f, 19.596f, 12.192f, 20f, 12.5f)
            curveTo(20.192f, 12.646f, 20.359f, 12.818f, 20.5f, 13.009f)
            curveTo(20.821f, 13.443f, 21f, 13.972f, 21f, 14.5f)
            verticalLineTo(17f)
            curveTo(21f, 18.246f, 20f, 19.5f, 18.5f, 19.5f)
            curveTo(17.638f, 19.5f, 16.941f, 19.088f, 16.504f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookOpenMicrophonePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BookOpenMicrophone, contentDescription = null)
    }
}
