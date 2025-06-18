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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.VideoUsb: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoUsb",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 7.25f)
            curveTo(3f, 5.455f, 4.455f, 4f, 6.25f, 4f)
            horizontalLineTo(12.75f)
            curveTo(14.545f, 4f, 16f, 5.455f, 16f, 7.25f)
            verticalLineTo(14.75f)
            curveTo(16f, 16.545f, 14.545f, 18f, 12.75f, 18f)
            horizontalLineTo(8.365f)
            lineTo(8.666f, 17.548f)
            curveTo(8.884f, 17.22f, 9f, 16.834f, 9f, 16.441f)
            verticalLineTo(13f)
            curveTo(9f, 12.26f, 8.598f, 11.613f, 8f, 11.268f)
            verticalLineTo(10f)
            curveTo(8f, 8.895f, 7.105f, 8f, 6f, 8f)
            horizontalLineTo(3f)
            verticalLineTo(7.25f)
            close()
            moveTo(20.257f, 16.688f)
            lineTo(17f, 14.439f)
            verticalLineTo(7.562f)
            lineTo(20.257f, 5.313f)
            curveTo(21.418f, 4.511f, 23.002f, 5.342f, 23.002f, 6.753f)
            verticalLineTo(15.248f)
            curveTo(23.002f, 16.659f, 21.418f, 17.49f, 20.257f, 16.688f)
            close()
            moveTo(2.5f, 19f)
            lineTo(1.163f, 16.955f)
            curveTo(1.057f, 16.792f, 1f, 16.602f, 1f, 16.408f)
            verticalLineTo(13f)
            curveTo(1f, 12.448f, 1.448f, 12f, 2f, 12f)
            verticalLineTo(10f)
            curveTo(2f, 9.448f, 2.448f, 9f, 3f, 9f)
            horizontalLineTo(6f)
            curveTo(6.552f, 9f, 7f, 9.448f, 7f, 10f)
            verticalLineTo(12f)
            curveTo(7.552f, 12f, 8f, 12.448f, 8f, 13f)
            verticalLineTo(16.441f)
            curveTo(8f, 16.638f, 7.942f, 16.83f, 7.833f, 16.994f)
            lineTo(6.5f, 19f)
            verticalLineTo(21f)
            curveTo(6.5f, 21.552f, 6.052f, 22f, 5.5f, 22f)
            horizontalLineTo(3.5f)
            curveTo(2.948f, 22f, 2.5f, 21.552f, 2.5f, 21f)
            verticalLineTo(19f)
            close()
            moveTo(5.5f, 10.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(12f)
            horizontalLineTo(5.5f)
            verticalLineTo(10.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoUsbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoUsb, contentDescription = null)
    }
}
