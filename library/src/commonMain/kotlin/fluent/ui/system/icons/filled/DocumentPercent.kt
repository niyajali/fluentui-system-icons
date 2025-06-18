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

public val FluentUi.Filled.DocumentPercent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentPercent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            close()
            moveTo(12f, 8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20f)
            curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
            horizontalLineTo(11.19f)
            curveTo(12.311f, 20.832f, 13f, 19.247f, 13f, 17.5f)
            curveTo(13f, 13.91f, 10.09f, 11f, 6.5f, 11f)
            curveTo(5.614f, 11f, 4.77f, 11.177f, 4f, 11.498f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(12f)
            verticalLineTo(8f)
            close()
            moveTo(9f, 17.5f)
            curveTo(8.172f, 17.5f, 7.5f, 18.172f, 7.5f, 19f)
            curveTo(7.5f, 19.828f, 8.172f, 20.5f, 9f, 20.5f)
            curveTo(9.828f, 20.5f, 10.5f, 19.828f, 10.5f, 19f)
            curveTo(10.5f, 18.172f, 9.828f, 17.5f, 9f, 17.5f)
            close()
            moveTo(9.33f, 14.672f)
            curveTo(9.135f, 14.477f, 8.818f, 14.477f, 8.623f, 14.672f)
            lineTo(3.673f, 19.622f)
            curveTo(3.478f, 19.817f, 3.478f, 20.134f, 3.673f, 20.329f)
            curveTo(3.868f, 20.524f, 4.185f, 20.524f, 4.38f, 20.329f)
            lineTo(9.33f, 15.379f)
            curveTo(9.525f, 15.184f, 9.525f, 14.867f, 9.33f, 14.672f)
            close()
            moveTo(9f, 18.5f)
            curveTo(9.276f, 18.5f, 9.5f, 18.724f, 9.5f, 19f)
            curveTo(9.5f, 19.276f, 9.276f, 19.5f, 9f, 19.5f)
            curveTo(8.724f, 19.5f, 8.5f, 19.276f, 8.5f, 19f)
            curveTo(8.5f, 18.724f, 8.724f, 18.5f, 9f, 18.5f)
            close()
            moveTo(4f, 14.5f)
            curveTo(3.172f, 14.5f, 2.5f, 15.172f, 2.5f, 16f)
            curveTo(2.5f, 16.828f, 3.172f, 17.5f, 4f, 17.5f)
            curveTo(4.828f, 17.5f, 5.5f, 16.828f, 5.5f, 16f)
            curveTo(5.5f, 15.172f, 4.828f, 14.5f, 4f, 14.5f)
            close()
            moveTo(4f, 15.5f)
            curveTo(4.276f, 15.5f, 4.5f, 15.724f, 4.5f, 16f)
            curveTo(4.5f, 16.276f, 4.276f, 16.5f, 4f, 16.5f)
            curveTo(3.724f, 16.5f, 3.5f, 16.276f, 3.5f, 16f)
            curveTo(3.5f, 15.724f, 3.724f, 15.5f, 4f, 15.5f)
            close()
            moveTo(19.5f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 8.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentPercentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentPercent, contentDescription = null)
    }
}
