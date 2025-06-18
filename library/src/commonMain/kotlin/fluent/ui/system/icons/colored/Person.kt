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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.Person: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Person",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(7.808f, 15.064f),
                end = Offset(10.394f, 23.319f),
            ),
        ) {
            moveTo(17.754f, 14f)
            curveTo(18.996f, 14f, 20.003f, 15.007f, 20.003f, 16.249f)
            verticalLineTo(17.167f)
            curveTo(20.003f, 17.741f, 19.824f, 18.3f, 19.49f, 18.766f)
            curveTo(17.944f, 20.93f, 15.42f, 22.001f, 12f, 22.001f)
            curveTo(8.579f, 22.001f, 6.056f, 20.929f, 4.514f, 18.765f)
            curveTo(4.182f, 18.299f, 4.003f, 17.741f, 4.003f, 17.169f)
            verticalLineTo(16.249f)
            curveTo(4.003f, 15.007f, 5.01f, 14f, 6.252f, 14f)
            horizontalLineTo(17.754f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8),
                ),
                start = Offset(12.003f, 13.047f),
                end = Offset(15.623f, 26.573f),
            ),
        ) {
            moveTo(17.754f, 14f)
            curveTo(18.996f, 14f, 20.003f, 15.007f, 20.003f, 16.249f)
            verticalLineTo(17.167f)
            curveTo(20.003f, 17.741f, 19.824f, 18.3f, 19.49f, 18.766f)
            curveTo(17.944f, 20.93f, 15.42f, 22.001f, 12f, 22.001f)
            curveTo(8.579f, 22.001f, 6.056f, 20.929f, 4.514f, 18.765f)
            curveTo(4.182f, 18.299f, 4.003f, 17.741f, 4.003f, 17.169f)
            verticalLineTo(16.249f)
            curveTo(4.003f, 15.007f, 5.01f, 14f, 6.252f, 14f)
            horizontalLineTo(17.754f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(9.379f, 3.334f),
                end = Offset(14.475f, 11.472f),
            ),
        ) {
            moveTo(12f, 2.005f)
            curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
            curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
            curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
            curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Person, contentDescription = null)
    }
}
