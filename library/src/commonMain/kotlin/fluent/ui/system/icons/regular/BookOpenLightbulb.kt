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

public val FluentUi.Regular.BookOpenLightbulb: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookOpenLightbulb",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.9f, 21f)
            lineTo(20.741f, 21.794f)
            curveTo(20.601f, 22.495f, 19.985f, 23f, 19.271f, 23f)
            horizontalLineTo(18.729f)
            curveTo(18.015f, 23f, 17.399f, 22.495f, 17.259f, 21.794f)
            lineTo(17.1f, 21f)
            horizontalLineTo(20.9f)
            close()
            moveTo(10f, 4f)
            curveTo(10.788f, 4f, 11.499f, 4.331f, 12f, 4.862f)
            curveTo(12.501f, 4.331f, 13.212f, 4f, 14f, 4f)
            horizontalLineTo(20.25f)
            curveTo(21.216f, 4f, 22f, 4.784f, 22f, 5.75f)
            verticalLineTo(12f)
            curveTo(21.552f, 11.664f, 21.046f, 11.4f, 20.5f, 11.229f)
            verticalLineTo(5.75f)
            curveTo(20.5f, 5.612f, 20.388f, 5.5f, 20.25f, 5.5f)
            horizontalLineTo(14f)
            curveTo(13.31f, 5.5f, 12.75f, 6.06f, 12.75f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(12.75f, 17.94f, 13.31f, 18.5f, 14f, 18.5f)
            horizontalLineTo(14.672f)
            curveTo(14.98f, 19.032f, 15.382f, 19.502f, 15.856f, 19.886f)
            lineTo(15.88f, 20f)
            horizontalLineTo(14f)
            curveTo(13.212f, 20f, 12.501f, 19.669f, 12f, 19.138f)
            curveTo(11.499f, 19.669f, 10.788f, 20f, 10f, 20f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 20f, 2f, 19.216f, 2f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(2f, 4.784f, 2.783f, 4f, 3.75f, 4f)
            horizontalLineTo(10f)
            close()
            moveTo(19f, 12f)
            curveTo(21.209f, 12f, 23f, 13.791f, 23f, 16f)
            curveTo(23f, 17.381f, 22.3f, 18.598f, 21.236f, 19.316f)
            lineTo(21.1f, 20f)
            horizontalLineTo(16.9f)
            lineTo(16.764f, 19.316f)
            curveTo(15.7f, 18.598f, 15f, 17.381f, 15f, 16f)
            curveTo(15f, 13.791f, 16.791f, 12f, 19f, 12f)
            close()
            moveTo(3.75f, 5.5f)
            curveTo(3.612f, 5.5f, 3.5f, 5.612f, 3.5f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(3.5f, 18.388f, 3.612f, 18.5f, 3.75f, 18.5f)
            horizontalLineTo(10f)
            curveTo(10.69f, 18.5f, 11.25f, 17.94f, 11.25f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(11.25f, 6.06f, 10.69f, 5.5f, 10f, 5.5f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookOpenLightbulbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookOpenLightbulb, contentDescription = null)
    }
}
