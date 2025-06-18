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

public val FluentIcons.Regular.DocumentQueue: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentQueue",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.75f, 5f)
            curveTo(8.336f, 5f, 8f, 5.336f, 8f, 5.75f)
            curveTo(8f, 6.164f, 8.336f, 6.5f, 8.75f, 6.5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 6.5f, 11f, 6.164f, 11f, 5.75f)
            curveTo(11f, 5.336f, 10.664f, 5f, 10.25f, 5f)
            horizontalLineTo(8.75f)
            close()
            moveTo(8f, 8.75f)
            curveTo(8f, 8.336f, 8.336f, 8f, 8.75f, 8f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 8f, 11f, 8.336f, 11f, 8.75f)
            curveTo(11f, 9.164f, 10.664f, 9.5f, 10.25f, 9.5f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 9.5f, 8f, 9.164f, 8f, 8.75f)
            close()
            moveTo(8.75f, 11f)
            curveTo(8.336f, 11f, 8f, 11.336f, 8f, 11.75f)
            curveTo(8f, 12.164f, 8.336f, 12.5f, 8.75f, 12.5f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 12.5f, 11f, 12.164f, 11f, 11.75f)
            curveTo(11f, 11.336f, 10.664f, 11f, 10.25f, 11f)
            horizontalLineTo(8.75f)
            close()
            moveTo(5f, 4f)
            curveTo(5f, 2.895f, 5.895f, 2f, 7f, 2f)
            horizontalLineTo(13.232f)
            curveTo(13.763f, 2f, 14.271f, 2.211f, 14.646f, 2.586f)
            lineTo(18.414f, 6.354f)
            curveTo(18.789f, 6.729f, 19f, 7.237f, 19f, 7.768f)
            verticalLineTo(17f)
            curveTo(19f, 18.105f, 18.105f, 19f, 17f, 19f)
            horizontalLineTo(7f)
            curveTo(5.895f, 19f, 5f, 18.105f, 5f, 17f)
            verticalLineTo(4f)
            close()
            moveTo(7f, 3.5f)
            curveTo(6.724f, 3.5f, 6.5f, 3.724f, 6.5f, 4f)
            verticalLineTo(17f)
            curveTo(6.5f, 17.276f, 6.724f, 17.5f, 7f, 17.5f)
            horizontalLineTo(17f)
            curveTo(17.276f, 17.5f, 17.5f, 17.276f, 17.5f, 17f)
            verticalLineTo(8.5f)
            horizontalLineTo(14.25f)
            curveTo(13.283f, 8.5f, 12.5f, 7.716f, 12.5f, 6.75f)
            lineTo(12.5f, 3.5f)
            horizontalLineTo(7f)
            close()
            moveTo(14f, 4.061f)
            lineTo(14f, 6.75f)
            curveTo(14f, 6.888f, 14.112f, 7f, 14.25f, 7f)
            horizontalLineTo(16.939f)
            lineTo(14f, 4.061f)
            close()
            moveTo(3.5f, 15.75f)
            curveTo(3.5f, 15.336f, 3.164f, 15f, 2.75f, 15f)
            curveTo(2.336f, 15f, 2f, 15.336f, 2f, 15.75f)
            verticalLineTo(17.5f)
            curveTo(2f, 19.985f, 4.015f, 22f, 6.5f, 22f)
            horizontalLineTo(17.5f)
            curveTo(19.985f, 22f, 22f, 19.985f, 22f, 17.5f)
            verticalLineTo(15.75f)
            curveTo(22f, 15.336f, 21.664f, 15f, 21.25f, 15f)
            curveTo(20.836f, 15f, 20.5f, 15.336f, 20.5f, 15.75f)
            verticalLineTo(17.5f)
            curveTo(20.5f, 19.157f, 19.157f, 20.5f, 17.5f, 20.5f)
            horizontalLineTo(6.5f)
            curveTo(4.843f, 20.5f, 3.5f, 19.157f, 3.5f, 17.5f)
            verticalLineTo(15.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentQueuePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentQueue, contentDescription = null)
    }
}
