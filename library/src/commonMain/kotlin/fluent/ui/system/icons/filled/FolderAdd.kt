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

public val FluentUi.Filled.FolderAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 8f)
            verticalLineTo(6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 3f, 9.298f, 3.237f, 9.72f, 3.659f)
            lineTo(11.25f, 5.189f)
            lineTo(8.659f, 7.78f)
            curveTo(8.518f, 7.921f, 8.328f, 8f, 8.129f, 8f)
            horizontalLineTo(2f)
            close()
            moveTo(2f, 9.5f)
            verticalLineTo(17.75f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
            curveTo(11f, 13.91f, 13.91f, 11f, 17.5f, 11f)
            curveTo(19.247f, 11f, 20.832f, 11.689f, 22f, 12.81f)
            verticalLineTo(8.75f)
            curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(13.061f)
            lineTo(9.72f, 8.841f)
            curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
            horizontalLineTo(2f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
            curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FolderAdd, contentDescription = null)
    }
}
