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

public val FluentIcons.Regular.ChatCursor: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatCursor",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 1f)
            curveTo(14.418f, 1f, 18f, 4.582f, 18f, 9f)
            curveTo(18f, 10.006f, 17.814f, 10.969f, 17.475f, 11.856f)
            lineTo(16.638f, 11.228f)
            curveTo(16.873f, 10.528f, 17f, 9.779f, 17f, 9f)
            curveTo(17f, 5.134f, 13.866f, 2f, 10f, 2f)
            curveTo(6.134f, 2f, 3f, 5.134f, 3f, 9f)
            curveTo(3f, 10.217f, 3.311f, 11.388f, 3.894f, 12.425f)
            curveTo(3.94f, 12.508f, 3.962f, 12.603f, 3.957f, 12.697f)
            lineTo(3.943f, 12.791f)
            lineTo(3.187f, 15.812f)
            lineTo(6.211f, 15.058f)
            curveTo(6.273f, 15.043f, 6.337f, 15.04f, 6.399f, 15.048f)
            lineTo(6.49f, 15.069f)
            lineTo(6.577f, 15.108f)
            curveTo(7.614f, 15.69f, 8.784f, 16f, 10f, 16f)
            curveTo(10.34f, 16f, 10.673f, 15.976f, 11f, 15.929f)
            verticalLineTo(16.938f)
            curveTo(10.672f, 16.979f, 10.339f, 17f, 10f, 17f)
            curveTo(8.727f, 17f, 7.496f, 16.702f, 6.387f, 16.139f)
            lineTo(6.266f, 16.075f)
            lineTo(2.621f, 16.985f)
            curveTo(2.311f, 17.063f, 2.026f, 16.837f, 2.001f, 16.544f)
            lineTo(2.001f, 16.462f)
            lineTo(2.015f, 16.379f)
            lineTo(2.925f, 12.735f)
            lineTo(2.862f, 12.615f)
            curveTo(2.407f, 11.719f, 2.124f, 10.742f, 2.033f, 9.728f)
            lineTo(2.007f, 9.346f)
            lineTo(2f, 9f)
            curveTo(2f, 4.582f, 5.582f, 1f, 10f, 1f)
            close()
            moveTo(21.6f, 16.2f)
            curveTo(22.369f, 16.777f, 21.961f, 18f, 21f, 18f)
            horizontalLineTo(16.6f)
            curveTo(16.231f, 18f, 15.891f, 18.204f, 15.718f, 18.529f)
            lineTo(13.882f, 21.971f)
            curveTo(13.392f, 22.889f, 12f, 22.541f, 12f, 21.5f)
            verticalLineTo(11f)
            curveTo(12f, 10.176f, 12.941f, 9.706f, 13.6f, 10.2f)
            lineTo(21.6f, 16.2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatCursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChatCursor, contentDescription = null)
    }
}
