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

public val FluentIcons.Filled.ChatCursor: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatCursor",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 1f)
            curveTo(14.418f, 1f, 18f, 4.582f, 18f, 9f)
            curveTo(18f, 10.006f, 17.814f, 10.969f, 17.475f, 11.856f)
            lineTo(14.2f, 9.4f)
            curveTo(12.882f, 8.411f, 11f, 9.352f, 11f, 11f)
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
            moveTo(13.6f, 10.2f)
            lineTo(21.6f, 16.2f)
            curveTo(22.369f, 16.777f, 21.961f, 18f, 21f, 18f)
            horizontalLineTo(16.6f)
            curveTo(16.231f, 18f, 15.891f, 18.204f, 15.718f, 18.529f)
            lineTo(13.882f, 21.971f)
            curveTo(13.392f, 22.889f, 12f, 22.541f, 12f, 21.5f)
            verticalLineTo(11f)
            curveTo(12f, 10.948f, 12.004f, 10.898f, 12.011f, 10.85f)
            curveTo(12.028f, 10.733f, 12.064f, 10.626f, 12.115f, 10.529f)
            curveTo(12.387f, 10.02f, 13.081f, 9.81f, 13.6f, 10.2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatCursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChatCursor, contentDescription = null)
    }
}
