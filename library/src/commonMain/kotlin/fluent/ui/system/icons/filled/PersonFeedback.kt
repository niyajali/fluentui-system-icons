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

public val FluentIcons.Filled.PersonFeedback: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonFeedback",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.77f, 12.4f)
            curveTo(14.92f, 12.47f, 15.09f, 12.5f, 15.25f, 12.5f)
            curveTo(15.58f, 12.5f, 15.89f, 12.37f, 16.13f, 12.14f)
            lineTo(18.31f, 10f)
            horizontalLineTo(19.25f)
            curveTo(20.77f, 10f, 22f, 8.77f, 22f, 7.25f)
            verticalLineTo(4.75f)
            curveTo(22f, 3.23f, 20.77f, 2f, 19.25f, 2f)
            horizontalLineTo(14.75f)
            curveTo(13.23f, 2f, 12f, 3.23f, 12f, 4.75f)
            verticalLineTo(7.25f)
            curveTo(12f, 8.51f, 12.85f, 9.57f, 14f, 9.9f)
            verticalLineTo(11.25f)
            curveTo(14f, 11.75f, 14.31f, 12.2f, 14.77f, 12.4f)
            close()
            moveTo(8f, 13.5f)
            curveTo(6.07f, 13.5f, 4.5f, 11.93f, 4.5f, 10f)
            curveTo(4.5f, 8.07f, 6.07f, 6.5f, 8f, 6.5f)
            curveTo(9.93f, 6.5f, 11.5f, 8.07f, 11.5f, 10f)
            curveTo(11.5f, 11.93f, 9.93f, 13.5f, 8f, 13.5f)
            close()
            moveTo(8.001f, 22f)
            curveTo(5.941f, 22f, 4.361f, 21.44f, 3.301f, 20.33f)
            curveTo(1.964f, 18.926f, 1.997f, 17.156f, 2.001f, 16.973f)
            lineTo(2.001f, 16.96f)
            curveTo(2.001f, 15.89f, 2.901f, 15f, 4.001f, 15f)
            horizontalLineTo(12.001f)
            curveTo(13.101f, 15f, 14.001f, 15.9f, 14.001f, 17f)
            lineTo(14.001f, 17.006f)
            curveTo(14.004f, 17.132f, 14.046f, 18.917f, 12.701f, 20.33f)
            curveTo(11.641f, 21.44f, 10.061f, 22f, 8.001f, 22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonFeedbackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonFeedback, contentDescription = null)
    }
}
