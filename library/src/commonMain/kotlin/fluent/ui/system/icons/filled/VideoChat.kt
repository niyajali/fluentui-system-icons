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

public val FluentUi.Filled.VideoChat: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoChat",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineTo(11.75f)
            curveTo(13.545f, 5f, 15f, 6.455f, 15f, 8.25f)
            verticalLineTo(15.75f)
            curveTo(15f, 17.271f, 13.956f, 18.547f, 12.545f, 18.902f)
            curveTo(12.841f, 18.159f, 13.003f, 17.349f, 13.003f, 16.501f)
            curveTo(13.003f, 12.911f, 10.092f, 10f, 6.502f, 10f)
            curveTo(4.754f, 10f, 3.168f, 10.689f, 2f, 11.811f)
            verticalLineTo(8.25f)
            close()
            moveTo(19.257f, 17.688f)
            lineTo(16f, 15.439f)
            verticalLineTo(8.562f)
            lineTo(19.257f, 6.313f)
            curveTo(20.418f, 5.511f, 22.002f, 6.342f, 22.002f, 7.753f)
            verticalLineTo(16.248f)
            curveTo(22.002f, 17.659f, 20.418f, 18.49f, 19.257f, 17.688f)
            close()
            moveTo(6.501f, 22.002f)
            curveTo(9.539f, 22.002f, 12.002f, 19.539f, 12.002f, 16.501f)
            curveTo(12.002f, 13.463f, 9.539f, 11f, 6.501f, 11f)
            curveTo(3.463f, 11f, 1f, 13.463f, 1f, 16.501f)
            curveTo(1f, 17.469f, 1.25f, 18.379f, 1.689f, 19.169f)
            lineTo(1.023f, 21.355f)
            curveTo(0.907f, 21.738f, 1.264f, 22.096f, 1.647f, 21.979f)
            lineTo(3.834f, 21.314f)
            curveTo(4.624f, 21.753f, 5.533f, 22.002f, 6.501f, 22.002f)
            close()
            moveTo(4.501f, 16.001f)
            curveTo(4.225f, 16.001f, 4.001f, 15.777f, 4.001f, 15.501f)
            curveTo(4.001f, 15.225f, 4.225f, 15.001f, 4.501f, 15.001f)
            horizontalLineTo(8.502f)
            curveTo(8.778f, 15.001f, 9.002f, 15.225f, 9.002f, 15.501f)
            curveTo(9.002f, 15.777f, 8.778f, 16.001f, 8.502f, 16.001f)
            horizontalLineTo(4.501f)
            close()
            moveTo(6.501f, 18.001f)
            horizontalLineTo(4.501f)
            curveTo(4.225f, 18.001f, 4.001f, 17.778f, 4.001f, 17.501f)
            curveTo(4.001f, 17.225f, 4.225f, 17.001f, 4.501f, 17.001f)
            horizontalLineTo(6.501f)
            curveTo(6.777f, 17.001f, 7.001f, 17.225f, 7.001f, 17.501f)
            curveTo(7.001f, 17.778f, 6.777f, 18.001f, 6.501f, 18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoChat, contentDescription = null)
    }
}
