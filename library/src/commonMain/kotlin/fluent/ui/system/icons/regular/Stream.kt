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

public val FluentUi.Regular.Stream: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Stream",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 11f)
            curveTo(9f, 6.858f, 12.358f, 3.5f, 16.5f, 3.5f)
            horizontalLineTo(16.595f)
            curveTo(17.009f, 3.5f, 17.345f, 3.164f, 17.345f, 2.75f)
            curveTo(17.345f, 2.336f, 17.009f, 2f, 16.595f, 2f)
            horizontalLineTo(16.5f)
            curveTo(11.529f, 2f, 7.5f, 6.029f, 7.5f, 11f)
            verticalLineTo(12.25f)
            curveTo(7.5f, 12.94f, 6.94f, 13.5f, 6.25f, 13.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 13.5f, 2f, 13.836f, 2f, 14.25f)
            curveTo(2f, 14.664f, 2.336f, 15f, 2.75f, 15f)
            horizontalLineTo(6.25f)
            curveTo(7.769f, 15f, 9f, 13.769f, 9f, 12.25f)
            verticalLineTo(11f)
            close()
            moveTo(16.75f, 7f)
            curveTo(14.403f, 7f, 12.5f, 8.903f, 12.5f, 11.25f)
            verticalLineTo(12.75f)
            curveTo(12.5f, 15.926f, 9.926f, 18.5f, 6.75f, 18.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 18.5f, 2f, 18.164f, 2f, 17.75f)
            curveTo(2f, 17.336f, 2.336f, 17f, 2.75f, 17f)
            horizontalLineTo(6.75f)
            curveTo(9.097f, 17f, 11f, 15.097f, 11f, 12.75f)
            verticalLineTo(11.25f)
            curveTo(11f, 8.074f, 13.574f, 5.5f, 16.75f, 5.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 5.5f, 22f, 5.836f, 22f, 6.25f)
            curveTo(22f, 6.664f, 21.664f, 7f, 21.25f, 7f)
            horizontalLineTo(16.75f)
            close()
            moveTo(17.25f, 10.5f)
            curveTo(16.56f, 10.5f, 16f, 11.06f, 16f, 11.75f)
            verticalLineTo(13f)
            curveTo(16f, 17.971f, 11.971f, 22f, 7f, 22f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 22f, 6f, 21.664f, 6f, 21.25f)
            curveTo(6f, 20.836f, 6.336f, 20.5f, 6.75f, 20.5f)
            horizontalLineTo(7f)
            curveTo(11.142f, 20.5f, 14.5f, 17.142f, 14.5f, 13f)
            verticalLineTo(11.75f)
            curveTo(14.5f, 10.231f, 15.731f, 9f, 17.25f, 9f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 9f, 22f, 9.336f, 22f, 9.75f)
            curveTo(22f, 10.164f, 21.664f, 10.5f, 21.25f, 10.5f)
            horizontalLineTo(17.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StreamPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Stream, contentDescription = null)
    }
}
