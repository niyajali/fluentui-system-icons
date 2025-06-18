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

public val FluentIcons.Regular.DocumentQueueAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentQueueAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 2f)
            curveTo(5.895f, 2f, 5f, 2.895f, 5f, 4f)
            verticalLineTo(17f)
            curveTo(5f, 18.105f, 5.895f, 19f, 7f, 19f)
            horizontalLineTo(11.174f)
            curveTo(11.06f, 18.518f, 11f, 18.016f, 11f, 17.5f)
            horizontalLineTo(7f)
            curveTo(6.724f, 17.5f, 6.5f, 17.276f, 6.5f, 17f)
            verticalLineTo(4f)
            curveTo(6.5f, 3.724f, 6.724f, 3.5f, 7f, 3.5f)
            horizontalLineTo(12.5f)
            lineTo(12.5f, 6.75f)
            curveTo(12.5f, 7.716f, 13.283f, 8.5f, 14.25f, 8.5f)
            horizontalLineTo(17.5f)
            verticalLineTo(11f)
            curveTo(18.016f, 11f, 18.518f, 11.06f, 19f, 11.174f)
            verticalLineTo(7.768f)
            curveTo(19f, 7.237f, 18.789f, 6.729f, 18.414f, 6.354f)
            lineTo(14.646f, 2.586f)
            curveTo(14.271f, 2.211f, 13.763f, 2f, 13.232f, 2f)
            horizontalLineTo(7f)
            close()
            moveTo(14f, 6.75f)
            lineTo(14f, 4.061f)
            lineTo(16.939f, 7f)
            horizontalLineTo(14.25f)
            curveTo(14.112f, 7f, 14f, 6.888f, 14f, 6.75f)
            close()
            moveTo(6.5f, 20.5f)
            horizontalLineTo(11.732f)
            curveTo(12.019f, 21.051f, 12.383f, 21.556f, 12.81f, 22f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 22f, 2f, 19.985f, 2f, 17.5f)
            verticalLineTo(15.75f)
            curveTo(2f, 15.336f, 2.336f, 15f, 2.75f, 15f)
            curveTo(3.164f, 15f, 3.5f, 15.336f, 3.5f, 15.75f)
            verticalLineTo(17.5f)
            curveTo(3.5f, 19.157f, 4.843f, 20.5f, 6.5f, 20.5f)
            close()
            moveTo(8f, 5.75f)
            curveTo(8f, 5.336f, 8.336f, 5f, 8.75f, 5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 5f, 11f, 5.336f, 11f, 5.75f)
            curveTo(11f, 6.164f, 10.664f, 6.5f, 10.25f, 6.5f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 6.5f, 8f, 6.164f, 8f, 5.75f)
            close()
            moveTo(8.75f, 8f)
            curveTo(8.336f, 8f, 8f, 8.336f, 8f, 8.75f)
            curveTo(8f, 9.164f, 8.336f, 9.5f, 8.75f, 9.5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 9.5f, 11f, 9.164f, 11f, 8.75f)
            curveTo(11f, 8.336f, 10.664f, 8f, 10.25f, 8f)
            horizontalLineTo(8.75f)
            close()
            moveTo(8.75f, 11f)
            curveTo(8.336f, 11f, 8f, 11.336f, 8f, 11.75f)
            curveTo(8f, 12.164f, 8.336f, 12.5f, 8.75f, 12.5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 12.5f, 11f, 12.164f, 11f, 11.75f)
            curveTo(11f, 11.336f, 10.664f, 11f, 10.25f, 11f)
            horizontalLineTo(8.75f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
            curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentQueueAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentQueueAdd, contentDescription = null)
    }
}
