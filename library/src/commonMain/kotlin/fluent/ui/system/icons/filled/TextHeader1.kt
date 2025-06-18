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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.TextHeader1: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextHeader1",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.182f, 5.017f)
            curveTo(20.271f, 5.033f, 20.356f, 5.061f, 20.435f, 5.099f)
            curveTo(20.795f, 5.273f, 21.013f, 5.643f, 21f, 6.033f)
            verticalLineTo(18f)
            curveTo(21f, 18.553f, 20.552f, 19f, 20f, 19f)
            curveTo(19.448f, 19f, 19f, 18.553f, 19f, 18f)
            verticalLineTo(9.611f)
            curveTo(18.364f, 10.233f, 17.63f, 10.678f, 16.816f, 10.949f)
            curveTo(16.293f, 11.124f, 15.726f, 10.84f, 15.552f, 10.316f)
            curveTo(15.377f, 9.793f, 15.66f, 9.226f, 16.184f, 9.052f)
            curveTo(17.313f, 8.675f, 18.366f, 7.719f, 19.042f, 5.713f)
            curveTo(19.076f, 5.599f, 19.13f, 5.493f, 19.201f, 5.399f)
            curveTo(19.237f, 5.351f, 19.277f, 5.307f, 19.32f, 5.267f)
            curveTo(19.547f, 5.057f, 19.865f, 4.958f, 20.182f, 5.017f)
            close()
            moveTo(3f, 5f)
            curveTo(3.552f, 5f, 4f, 5.448f, 4f, 6f)
            verticalLineTo(11f)
            horizontalLineTo(10f)
            verticalLineTo(6f)
            curveTo(10f, 5.448f, 10.448f, 5f, 11f, 5f)
            curveTo(11.552f, 5f, 12f, 5.448f, 12f, 6f)
            verticalLineTo(18f)
            curveTo(12f, 18.553f, 11.552f, 19f, 11f, 19f)
            curveTo(10.448f, 19f, 10f, 18.553f, 10f, 18f)
            verticalLineTo(13f)
            horizontalLineTo(4f)
            verticalLineTo(18f)
            curveTo(4f, 18.553f, 3.552f, 19f, 3f, 19f)
            curveTo(2.448f, 19f, 2f, 18.553f, 2f, 18f)
            verticalLineTo(6f)
            curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextHeader1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextHeader1, contentDescription = null)
    }
}
