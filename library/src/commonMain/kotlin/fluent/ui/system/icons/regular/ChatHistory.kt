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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ChatHistory: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatHistory",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(9.275f, 2f, 6.804f, 3.09f, 5f, 4.859f)
            verticalLineTo(3.75f)
            curveTo(5f, 3.336f, 4.664f, 3f, 4.25f, 3f)
            curveTo(3.836f, 3f, 3.5f, 3.336f, 3.5f, 3.75f)
            verticalLineTo(7.25f)
            curveTo(3.5f, 7.664f, 3.836f, 8f, 4.25f, 8f)
            horizontalLineTo(7.75f)
            curveTo(8.164f, 8f, 8.5f, 7.664f, 8.5f, 7.25f)
            curveTo(8.5f, 6.836f, 8.164f, 6.5f, 7.75f, 6.5f)
            horizontalLineTo(5.519f)
            curveTo(7.078f, 4.665f, 9.403f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(10.532f, 20.5f, 9.12f, 20.128f, 7.867f, 19.43f)
            lineTo(7.598f, 19.279f)
            lineTo(3.611f, 20.391f)
            lineTo(4.724f, 16.407f)
            lineTo(4.573f, 16.138f)
            curveTo(3.873f, 14.883f, 3.5f, 13.47f, 3.5f, 12f)
            curveTo(3.5f, 11.325f, 3.579f, 10.668f, 3.727f, 10.038f)
            curveTo(3.806f, 9.737f, 3.792f, 9.15f, 3.191f, 9.018f)
            curveTo(2.578f, 8.884f, 2.32f, 9.373f, 2.256f, 9.737f)
            lineTo(2.257f, 9.737f)
            curveTo(2.089f, 10.464f, 2f, 11.222f, 2f, 12f)
            curveTo(2f, 13.62f, 2.386f, 15.186f, 3.115f, 16.592f)
            lineTo(2.047f, 20.415f)
            curveTo(1.985f, 20.635f, 1.985f, 20.868f, 2.047f, 21.088f)
            curveTo(2.233f, 21.753f, 2.922f, 22.141f, 3.587f, 21.955f)
            lineTo(7.413f, 20.888f)
            curveTo(8.818f, 21.615f, 10.382f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            close()
            moveTo(12f, 8.75f)
            curveTo(12f, 8.336f, 11.664f, 8f, 11.25f, 8f)
            curveTo(10.836f, 8f, 10.5f, 8.336f, 10.5f, 8.75f)
            verticalLineTo(13.25f)
            curveTo(10.5f, 13.664f, 10.836f, 14f, 11.25f, 14f)
            horizontalLineTo(14.25f)
            curveTo(14.664f, 14f, 15f, 13.664f, 15f, 13.25f)
            curveTo(15f, 12.836f, 14.664f, 12.5f, 14.25f, 12.5f)
            horizontalLineTo(12f)
            verticalLineTo(8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatHistoryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChatHistory, contentDescription = null)
    }
}
