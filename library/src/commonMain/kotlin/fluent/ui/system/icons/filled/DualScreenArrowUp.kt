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

public val FluentIcons.Filled.DualScreenArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 6.5f)
            curveTo(22f, 9.538f, 19.538f, 12f, 16.5f, 12f)
            curveTo(13.462f, 12f, 11f, 9.538f, 11f, 6.5f)
            curveTo(11f, 3.462f, 13.462f, 1f, 16.5f, 1f)
            curveTo(19.538f, 1f, 22f, 3.462f, 22f, 6.5f)
            close()
            moveTo(16f, 4.707f)
            verticalLineTo(9.5f)
            curveTo(16f, 9.776f, 16.224f, 10f, 16.5f, 10f)
            curveTo(16.776f, 10f, 17f, 9.776f, 17f, 9.5f)
            verticalLineTo(4.707f)
            lineTo(18.646f, 6.354f)
            curveTo(18.842f, 6.549f, 19.158f, 6.549f, 19.354f, 6.354f)
            curveTo(19.549f, 6.158f, 19.549f, 5.842f, 19.354f, 5.646f)
            lineTo(16.854f, 3.146f)
            curveTo(16.658f, 2.951f, 16.342f, 2.951f, 16.146f, 3.146f)
            lineTo(13.646f, 5.646f)
            curveTo(13.451f, 5.842f, 13.451f, 6.158f, 13.646f, 6.354f)
            curveTo(13.842f, 6.549f, 14.158f, 6.549f, 14.354f, 6.354f)
            lineTo(16f, 4.707f)
            close()
            moveTo(21.995f, 20.249f)
            lineTo(21.996f, 9.972f)
            curveTo(20.844f, 11.792f, 18.813f, 13f, 16.5f, 13f)
            curveTo(15.1f, 13f, 13.804f, 12.557f, 12.743f, 11.804f)
            lineTo(12.742f, 21.98f)
            curveTo(12.825f, 21.993f, 12.911f, 21.999f, 12.998f, 21.999f)
            horizontalLineTo(20.245f)
            curveTo(21.212f, 21.999f, 21.995f, 21.215f, 21.995f, 20.249f)
            close()
            moveTo(14.739f, 17.5f)
            horizontalLineTo(16.239f)
            lineTo(16.34f, 17.507f)
            curveTo(16.707f, 17.556f, 16.989f, 17.87f, 16.989f, 18.25f)
            curveTo(16.989f, 18.63f, 16.707f, 18.944f, 16.34f, 18.993f)
            lineTo(16.239f, 19f)
            horizontalLineTo(14.739f)
            lineTo(14.637f, 18.993f)
            curveTo(14.271f, 18.944f, 13.989f, 18.63f, 13.989f, 18.25f)
            curveTo(13.989f, 17.87f, 14.271f, 17.556f, 14.637f, 17.507f)
            lineTo(14.739f, 17.5f)
            close()
            moveTo(10f, 6.5f)
            curveTo(10f, 6.332f, 10.006f, 6.166f, 10.019f, 6.002f)
            lineTo(3.75f, 6.001f)
            curveTo(2.783f, 6.001f, 2f, 6.785f, 2f, 7.751f)
            verticalLineTo(20.246f)
            curveTo(2f, 21.213f, 2.783f, 21.996f, 3.75f, 21.996f)
            horizontalLineTo(10.998f)
            curveTo(11.081f, 21.996f, 11.163f, 21.99f, 11.243f, 21.979f)
            lineTo(11.242f, 10.323f)
            curveTo(10.461f, 9.25f, 10f, 7.929f, 10f, 6.5f)
            close()
            moveTo(7.741f, 17.5f)
            horizontalLineTo(9.243f)
            lineTo(9.345f, 17.507f)
            curveTo(9.711f, 17.556f, 9.993f, 17.87f, 9.993f, 18.25f)
            curveTo(9.993f, 18.63f, 9.711f, 18.944f, 9.345f, 18.993f)
            lineTo(9.243f, 19f)
            horizontalLineTo(7.741f)
            lineTo(7.639f, 18.993f)
            curveTo(7.273f, 18.944f, 6.991f, 18.63f, 6.991f, 18.25f)
            curveTo(6.991f, 17.87f, 7.273f, 17.556f, 7.639f, 17.507f)
            lineTo(7.741f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DualScreenArrowUp, contentDescription = null)
    }
}
