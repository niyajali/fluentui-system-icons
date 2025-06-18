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

public val FluentUi.Filled.FolderLightning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderLightning",
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
            horizontalLineTo(15.971f)
            lineTo(16.22f, 20f)
            horizontalLineTo(14.497f)
            curveTo(13.398f, 20f, 12.672f, 18.857f, 13.14f, 17.862f)
            lineTo(15.96f, 11.862f)
            curveTo(16.207f, 11.336f, 16.736f, 11f, 17.317f, 11f)
            horizontalLineTo(22f)
            verticalLineTo(8.75f)
            curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(13.061f)
            lineTo(9.72f, 8.841f)
            curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
            horizontalLineTo(2f)
            close()
            moveTo(17.318f, 12f)
            horizontalLineTo(22.145f)
            curveTo(22.528f, 12f, 22.768f, 12.412f, 22.581f, 12.745f)
            lineTo(20.75f, 16f)
            horizontalLineTo(22.246f)
            curveTo(22.891f, 16f, 23.235f, 16.759f, 22.81f, 17.244f)
            lineTo(17.987f, 22.752f)
            curveTo(17.482f, 23.328f, 16.544f, 22.837f, 16.729f, 22.094f)
            lineTo(17.5f, 19f)
            horizontalLineTo(14.498f)
            curveTo(14.131f, 19f, 13.889f, 18.619f, 14.045f, 18.287f)
            lineTo(16.865f, 12.287f)
            curveTo(16.948f, 12.112f, 17.124f, 12f, 17.318f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FolderLightning, contentDescription = null)
    }
}
