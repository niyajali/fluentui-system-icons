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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.FolderOpen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 3f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineTo(15.162f)
            lineTo(4.045f, 11.621f)
            curveTo(4.804f, 10.306f, 6.207f, 9.496f, 7.725f, 9.496f)
            lineTo(20f, 9.496f)
            verticalLineTo(8.75f)
            curveTo(20f, 6.955f, 18.545f, 5.5f, 16.75f, 5.5f)
            horizontalLineTo(11.561f)
            lineTo(9.72f, 3.659f)
            curveTo(9.298f, 3.237f, 8.725f, 3f, 8.129f, 3f)
            horizontalLineTo(5.25f)
            close()
            moveTo(7.725f, 10.996f)
            lineTo(20.744f, 10.996f)
            curveTo(22.476f, 10.996f, 23.559f, 12.871f, 22.693f, 14.371f)
            lineTo(19.657f, 19.629f)
            curveTo(19.166f, 20.48f, 18.258f, 21.004f, 17.275f, 21.004f)
            horizontalLineTo(4.256f)
            curveTo(2.524f, 21.004f, 1.441f, 19.129f, 2.307f, 17.629f)
            lineTo(5.344f, 12.371f)
            curveTo(5.835f, 11.52f, 6.743f, 10.996f, 7.725f, 10.996f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderOpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FolderOpen, contentDescription = null)
    }
}
