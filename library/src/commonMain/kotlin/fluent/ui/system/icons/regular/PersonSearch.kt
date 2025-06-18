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

public val FluentIcons.Regular.PersonSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.909f, 13.999f)
            lineTo(19.753f, 14f)
            curveTo(20.996f, 14f, 22.003f, 15.007f, 22.003f, 16.25f)
            verticalLineTo(17.155f)
            curveTo(22.003f, 18.249f, 21.526f, 19.288f, 20.696f, 20f)
            curveTo(19.13f, 21.344f, 16.89f, 22.001f, 14f, 22.001f)
            lineTo(13.821f, 22f)
            curveTo(14.055f, 21.53f, 14.063f, 20.976f, 13.847f, 20.499f)
            lineTo(14f, 20.501f)
            curveTo(16.56f, 20.501f, 18.458f, 19.945f, 19.719f, 18.862f)
            curveTo(20.217f, 18.435f, 20.503f, 17.812f, 20.503f, 17.155f)
            verticalLineTo(16.25f)
            curveTo(20.503f, 15.836f, 20.167f, 15.5f, 19.753f, 15.5f)
            lineTo(11.977f, 15.5f)
            curveTo(11.992f, 15.335f, 12f, 15.168f, 12f, 15f)
            curveTo(12f, 14.658f, 11.969f, 14.324f, 11.909f, 13.999f)
            close()
            moveTo(6.5f, 10.5f)
            curveTo(8.985f, 10.5f, 11f, 12.515f, 11f, 15f)
            curveTo(11f, 16.094f, 10.61f, 17.097f, 9.961f, 17.877f)
            lineTo(12.783f, 20.691f)
            curveTo(13.076f, 20.983f, 13.077f, 21.458f, 12.784f, 21.751f)
            curveTo(12.518f, 22.018f, 12.101f, 22.043f, 11.808f, 21.825f)
            lineTo(11.723f, 21.753f)
            lineTo(8.82f, 18.857f)
            curveTo(8.143f, 19.265f, 7.349f, 19.5f, 6.5f, 19.5f)
            curveTo(4.015f, 19.5f, 2f, 17.486f, 2f, 15f)
            curveTo(2f, 12.515f, 4.015f, 10.5f, 6.5f, 10.5f)
            close()
            moveTo(6.5f, 12f)
            curveTo(4.843f, 12f, 3.5f, 13.343f, 3.5f, 15f)
            curveTo(3.5f, 16.657f, 4.843f, 18f, 6.5f, 18f)
            curveTo(8.157f, 18f, 9.5f, 16.657f, 9.5f, 15f)
            curveTo(9.5f, 13.343f, 8.157f, 12f, 6.5f, 12f)
            close()
            moveTo(14f, 2.005f)
            curveTo(16.761f, 2.005f, 19f, 4.243f, 19f, 7.005f)
            curveTo(19f, 9.766f, 16.761f, 12.005f, 14f, 12.005f)
            curveTo(11.239f, 12.005f, 9f, 9.766f, 9f, 7.005f)
            curveTo(9f, 4.243f, 11.239f, 2.005f, 14f, 2.005f)
            close()
            moveTo(14f, 3.505f)
            curveTo(12.067f, 3.505f, 10.5f, 5.072f, 10.5f, 7.005f)
            curveTo(10.5f, 8.938f, 12.067f, 10.505f, 14f, 10.505f)
            curveTo(15.933f, 10.505f, 17.5f, 8.938f, 17.5f, 7.005f)
            curveTo(17.5f, 5.072f, 15.933f, 3.505f, 14f, 3.505f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonSearch, contentDescription = null)
    }
}
