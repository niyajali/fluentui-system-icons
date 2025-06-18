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

public val FluentUi.Regular.EmojiAngry: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EmojiAngry",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2.004f)
            curveTo(17.523f, 2.004f, 22f, 6.481f, 22f, 12.004f)
            curveTo(22f, 17.527f, 17.523f, 22.004f, 12f, 22.004f)
            curveTo(6.477f, 22.004f, 2f, 17.527f, 2f, 12.004f)
            curveTo(2f, 6.481f, 6.477f, 2.004f, 12f, 2.004f)
            close()
            moveTo(12f, 3.504f)
            curveTo(7.306f, 3.504f, 3.5f, 7.309f, 3.5f, 12.004f)
            curveTo(3.5f, 16.698f, 7.306f, 20.504f, 12f, 20.504f)
            curveTo(16.694f, 20.504f, 20.5f, 16.698f, 20.5f, 12.004f)
            curveTo(20.5f, 7.309f, 16.694f, 3.504f, 12f, 3.504f)
            close()
            moveTo(12f, 13.497f)
            curveTo(13.631f, 13.497f, 15.16f, 14.152f, 16.281f, 15.293f)
            curveTo(16.571f, 15.588f, 16.567f, 16.063f, 16.272f, 16.353f)
            curveTo(15.976f, 16.644f, 15.501f, 16.639f, 15.211f, 16.344f)
            curveTo(14.37f, 15.488f, 13.225f, 14.997f, 12f, 14.997f)
            curveTo(10.773f, 14.997f, 9.625f, 15.49f, 8.783f, 16.35f)
            curveTo(8.494f, 16.646f, 8.019f, 16.65f, 7.723f, 16.361f)
            curveTo(7.427f, 16.071f, 7.422f, 15.596f, 7.712f, 15.3f)
            curveTo(8.833f, 14.155f, 10.365f, 13.497f, 12f, 13.497f)
            close()
            moveTo(7.164f, 6.781f)
            curveTo(7.4f, 6.487f, 7.811f, 6.417f, 8.127f, 6.601f)
            lineTo(8.219f, 6.664f)
            lineTo(10.719f, 8.664f)
            curveTo(11.042f, 8.922f, 11.094f, 9.394f, 10.836f, 9.718f)
            curveTo(10.688f, 9.903f, 10.47f, 9.999f, 10.25f, 9.999f)
            curveTo(10.25f, 10.69f, 9.69f, 11.249f, 9f, 11.249f)
            curveTo(8.31f, 11.249f, 7.751f, 10.69f, 7.751f, 10f)
            curveTo(7.751f, 9.474f, 8.076f, 9.023f, 8.537f, 8.839f)
            lineTo(7.281f, 7.835f)
            curveTo(6.958f, 7.576f, 6.906f, 7.104f, 7.164f, 6.781f)
            close()
            moveTo(13.283f, 8.664f)
            lineTo(15.781f, 6.664f)
            curveTo(16.105f, 6.405f, 16.577f, 6.457f, 16.836f, 6.781f)
            curveTo(17.071f, 7.075f, 17.049f, 7.491f, 16.8f, 7.759f)
            lineTo(16.719f, 7.835f)
            lineTo(15.463f, 8.839f)
            curveTo(15.924f, 9.023f, 16.25f, 9.473f, 16.25f, 10f)
            curveTo(16.25f, 10.69f, 15.69f, 11.249f, 15f, 11.249f)
            curveTo(14.354f, 11.249f, 13.822f, 10.757f, 13.758f, 10.127f)
            lineTo(13.751f, 9.998f)
            curveTo(13.532f, 9.999f, 13.314f, 9.903f, 13.166f, 9.718f)
            curveTo(12.93f, 9.424f, 12.952f, 9.007f, 13.201f, 8.739f)
            lineTo(13.283f, 8.664f)
            lineTo(15.781f, 6.664f)
            lineTo(13.283f, 8.664f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiAngryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EmojiAngry, contentDescription = null)
    }
}
