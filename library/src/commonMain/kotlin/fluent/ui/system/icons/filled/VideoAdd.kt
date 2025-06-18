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

public val FluentUi.Filled.VideoAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineTo(11.75f)
            curveTo(13.545f, 4f, 15f, 5.455f, 15f, 7.25f)
            verticalLineTo(14.75f)
            curveTo(15f, 16.104f, 14.172f, 17.264f, 12.995f, 17.753f)
            curveTo(12.998f, 17.669f, 13f, 17.585f, 13f, 17.5f)
            curveTo(13f, 13.91f, 10.09f, 11f, 6.5f, 11f)
            curveTo(4.754f, 11f, 3.168f, 11.689f, 2f, 12.81f)
            verticalLineTo(7.25f)
            close()
            moveTo(19.257f, 16.688f)
            lineTo(16f, 14.439f)
            verticalLineTo(7.562f)
            lineTo(19.257f, 5.313f)
            curveTo(20.418f, 4.511f, 22.002f, 5.342f, 22.002f, 6.753f)
            verticalLineTo(15.248f)
            curveTo(22.002f, 16.659f, 20.418f, 17.49f, 19.257f, 16.688f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 14.462f, 9.538f, 12f, 6.5f, 12f)
            curveTo(3.462f, 12f, 1f, 14.462f, 1f, 17.5f)
            curveTo(1f, 20.538f, 3.462f, 23f, 6.5f, 23f)
            curveTo(9.538f, 23f, 12f, 20.538f, 12f, 17.5f)
            close()
            moveTo(7.001f, 18f)
            lineTo(7.001f, 20.503f)
            curveTo(7.001f, 20.78f, 6.777f, 21.003f, 6.501f, 21.003f)
            curveTo(6.225f, 21.003f, 6.001f, 20.78f, 6.001f, 20.503f)
            lineTo(6.001f, 18f)
            horizontalLineTo(3.496f)
            curveTo(3.22f, 18f, 2.996f, 17.776f, 2.996f, 17.5f)
            curveTo(2.996f, 17.224f, 3.22f, 17f, 3.496f, 17f)
            horizontalLineTo(6f)
            lineTo(6f, 14.499f)
            curveTo(6f, 14.223f, 6.224f, 13.999f, 6.5f, 13.999f)
            curveTo(6.776f, 13.999f, 7f, 14.223f, 7f, 14.499f)
            lineTo(7f, 17f)
            horizontalLineTo(9.497f)
            curveTo(9.772f, 17f, 9.996f, 17.224f, 9.996f, 17.5f)
            curveTo(9.996f, 17.776f, 9.772f, 18f, 9.497f, 18f)
            horizontalLineTo(7.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoAdd, contentDescription = null)
    }
}
