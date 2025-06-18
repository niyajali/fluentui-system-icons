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

public val FluentUi.Filled.FolderSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(8.129f)
            curveTo(8.328f, 8f, 8.518f, 7.921f, 8.659f, 7.78f)
            lineTo(11.25f, 5.189f)
            lineTo(9.72f, 3.659f)
            curveTo(9.298f, 3.237f, 8.725f, 3f, 8.129f, 3f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            close()
            moveTo(2f, 17.75f)
            verticalLineTo(9.5f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 9.5f, 9.298f, 9.263f, 9.72f, 8.841f)
            lineTo(13.061f, 5.5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5.5f, 22f, 6.955f, 22f, 8.75f)
            verticalLineTo(15f)
            horizontalLineTo(21.978f)
            curveTo(21.725f, 12.197f, 19.369f, 10f, 16.5f, 10f)
            curveTo(13.462f, 10f, 11f, 12.462f, 11f, 15.5f)
            curveTo(11f, 18.538f, 13.462f, 21f, 16.5f, 21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            close()
            moveTo(16.5f, 21f)
            curveTo(16.669f, 21f, 16.835f, 20.992f, 17f, 20.978f)
            verticalLineTo(21f)
            horizontalLineTo(16.5f)
            close()
            moveTo(16.5f, 20f)
            curveTo(17.472f, 20f, 18.372f, 19.692f, 19.107f, 19.168f)
            lineTo(21.72f, 21.78f)
            curveTo(22.013f, 22.073f, 22.487f, 22.073f, 22.78f, 21.78f)
            curveTo(23.073f, 21.487f, 23.073f, 21.013f, 22.78f, 20.72f)
            lineTo(20.168f, 18.107f)
            curveTo(20.692f, 17.372f, 21f, 16.472f, 21f, 15.5f)
            curveTo(21f, 13.015f, 18.985f, 11f, 16.5f, 11f)
            curveTo(14.015f, 11f, 12f, 13.015f, 12f, 15.5f)
            curveTo(12f, 17.985f, 14.015f, 20f, 16.5f, 20f)
            close()
            moveTo(16.5f, 18.5f)
            curveTo(14.843f, 18.5f, 13.5f, 17.157f, 13.5f, 15.5f)
            curveTo(13.5f, 13.843f, 14.843f, 12.5f, 16.5f, 12.5f)
            curveTo(18.157f, 12.5f, 19.5f, 13.843f, 19.5f, 15.5f)
            curveTo(19.5f, 17.157f, 18.157f, 18.5f, 16.5f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FolderSearch, contentDescription = null)
    }
}
