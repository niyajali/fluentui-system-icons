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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ChatWarning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatWarning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 6.5f)
            curveTo(12.414f, 6.5f, 12.75f, 6.836f, 12.75f, 7.25f)
            verticalLineTo(13.5f)
            curveTo(12.75f, 13.914f, 12.414f, 14.25f, 12f, 14.25f)
            curveTo(11.586f, 14.25f, 11.25f, 13.914f, 11.25f, 13.5f)
            verticalLineTo(7.25f)
            curveTo(11.25f, 6.836f, 11.586f, 6.5f, 12f, 6.5f)
            close()
            moveTo(12f, 17.498f)
            curveTo(12.552f, 17.498f, 13f, 17.05f, 13f, 16.498f)
            curveTo(13f, 15.946f, 12.552f, 15.498f, 12f, 15.498f)
            curveTo(11.448f, 15.498f, 11f, 15.946f, 11f, 16.498f)
            curveTo(11f, 17.05f, 11.448f, 17.498f, 12f, 17.498f)
            close()
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(10.382f, 22f, 8.818f, 21.615f, 7.413f, 20.888f)
            lineTo(3.587f, 21.955f)
            curveTo(2.922f, 22.141f, 2.233f, 21.753f, 2.047f, 21.088f)
            curveTo(1.985f, 20.868f, 1.985f, 20.635f, 2.047f, 20.415f)
            lineTo(3.115f, 16.592f)
            curveTo(2.386f, 15.186f, 2f, 13.62f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 13.47f, 3.873f, 14.883f, 4.573f, 16.138f)
            lineTo(4.724f, 16.407f)
            lineTo(3.611f, 20.391f)
            lineTo(7.598f, 19.279f)
            lineTo(7.867f, 19.43f)
            curveTo(9.12f, 20.128f, 10.532f, 20.5f, 12f, 20.5f)
            curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChatWarning, contentDescription = null)
    }
}
