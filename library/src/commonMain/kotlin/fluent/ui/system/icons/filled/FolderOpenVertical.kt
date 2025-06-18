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

public val FluentUi.Filled.FolderOpenVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpenVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 5.25f)
            curveTo(21f, 3.455f, 19.545f, 2f, 17.75f, 2f)
            horizontalLineTo(8.839f)
            lineTo(12.38f, 4.045f)
            curveTo(13.695f, 4.804f, 14.505f, 6.207f, 14.505f, 7.725f)
            lineTo(14.505f, 20f)
            horizontalLineTo(15.25f)
            curveTo(17.045f, 20f, 18.5f, 18.545f, 18.5f, 16.75f)
            verticalLineTo(11.561f)
            lineTo(20.341f, 9.72f)
            curveTo(20.763f, 9.298f, 21f, 8.725f, 21f, 8.129f)
            verticalLineTo(5.25f)
            close()
            moveTo(13.005f, 7.725f)
            lineTo(13.005f, 20.744f)
            curveTo(13.005f, 22.476f, 11.13f, 23.559f, 9.63f, 22.693f)
            lineTo(4.371f, 19.657f)
            curveTo(3.52f, 19.166f, 2.996f, 18.258f, 2.996f, 17.275f)
            verticalLineTo(4.256f)
            curveTo(2.996f, 2.524f, 4.871f, 1.441f, 6.371f, 2.307f)
            lineTo(11.63f, 5.344f)
            curveTo(12.481f, 5.835f, 13.005f, 6.743f, 13.005f, 7.725f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderOpenVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FolderOpenVertical, contentDescription = null)
    }
}
