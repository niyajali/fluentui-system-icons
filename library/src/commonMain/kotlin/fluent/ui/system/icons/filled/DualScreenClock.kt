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

public val FluentIcons.Filled.DualScreenClock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenClock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.996f, 9.972f)
            lineTo(21.995f, 20.249f)
            curveTo(21.995f, 21.215f, 21.212f, 21.999f, 20.245f, 21.999f)
            horizontalLineTo(12.998f)
            curveTo(12.911f, 21.999f, 12.825f, 21.993f, 12.742f, 21.98f)
            lineTo(12.743f, 11.804f)
            curveTo(13.804f, 12.557f, 15.1f, 13f, 16.5f, 13f)
            curveTo(18.813f, 13f, 20.844f, 11.792f, 21.996f, 9.972f)
            close()
            moveTo(10.019f, 6.002f)
            curveTo(10.006f, 6.166f, 10f, 6.332f, 10f, 6.5f)
            curveTo(10f, 7.929f, 10.461f, 9.25f, 11.242f, 10.323f)
            lineTo(11.243f, 21.979f)
            curveTo(11.163f, 21.99f, 11.081f, 21.996f, 10.998f, 21.996f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 21.996f, 2f, 21.213f, 2f, 20.246f)
            verticalLineTo(7.751f)
            curveTo(2f, 6.785f, 2.783f, 6.001f, 3.75f, 6.001f)
            lineTo(10.019f, 6.002f)
            close()
            moveTo(9.243f, 17.5f)
            horizontalLineTo(7.741f)
            lineTo(7.639f, 17.507f)
            curveTo(7.273f, 17.556f, 6.991f, 17.87f, 6.991f, 18.25f)
            curveTo(6.991f, 18.63f, 7.273f, 18.944f, 7.639f, 18.993f)
            lineTo(7.741f, 19f)
            horizontalLineTo(9.243f)
            lineTo(9.345f, 18.993f)
            curveTo(9.711f, 18.944f, 9.993f, 18.63f, 9.993f, 18.25f)
            curveTo(9.993f, 17.87f, 9.711f, 17.556f, 9.345f, 17.507f)
            lineTo(9.243f, 17.5f)
            close()
            moveTo(16.239f, 17.5f)
            horizontalLineTo(14.739f)
            lineTo(14.637f, 17.507f)
            curveTo(14.271f, 17.556f, 13.989f, 17.87f, 13.989f, 18.25f)
            curveTo(13.989f, 18.63f, 14.271f, 18.944f, 14.637f, 18.993f)
            lineTo(14.739f, 19f)
            horizontalLineTo(16.239f)
            lineTo(16.34f, 18.993f)
            curveTo(16.707f, 18.944f, 16.989f, 18.63f, 16.989f, 18.25f)
            curveTo(16.989f, 17.87f, 16.707f, 17.556f, 16.34f, 17.507f)
            lineTo(16.239f, 17.5f)
            close()
            moveTo(16.498f, 1f)
            curveTo(19.535f, 1f, 21.998f, 3.462f, 21.998f, 6.5f)
            curveTo(21.998f, 9.538f, 19.535f, 12f, 16.498f, 12f)
            curveTo(13.46f, 12f, 10.998f, 9.538f, 10.998f, 6.5f)
            curveTo(10.998f, 3.462f, 13.46f, 1f, 16.498f, 1f)
            close()
            moveTo(15.498f, 3f)
            curveTo(15.222f, 3f, 14.998f, 3.224f, 14.998f, 3.5f)
            verticalLineTo(7.5f)
            curveTo(14.998f, 7.776f, 15.222f, 8f, 15.498f, 8f)
            horizontalLineTo(18.499f)
            curveTo(18.775f, 8f, 18.999f, 7.776f, 18.999f, 7.5f)
            curveTo(18.999f, 7.224f, 18.775f, 7f, 18.499f, 7f)
            horizontalLineTo(15.998f)
            verticalLineTo(3.5f)
            curveTo(15.998f, 3.224f, 15.774f, 3f, 15.498f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DualScreenClock, contentDescription = null)
    }
}
