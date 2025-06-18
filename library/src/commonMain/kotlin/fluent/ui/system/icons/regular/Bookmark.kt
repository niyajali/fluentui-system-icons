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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Bookmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bookmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.191f, 21.855f)
            curveTo(5.695f, 22.212f, 5.003f, 21.857f, 5.003f, 21.246f)
            verticalLineTo(6.25f)
            curveTo(5.003f, 4.455f, 6.458f, 3f, 8.253f, 3f)
            horizontalLineTo(15.751f)
            curveTo(17.546f, 3f, 19.001f, 4.455f, 19.001f, 6.25f)
            verticalLineTo(21.246f)
            curveTo(19.001f, 21.857f, 18.309f, 22.212f, 17.813f, 21.855f)
            lineTo(12.002f, 17.674f)
            lineTo(6.191f, 21.855f)
            close()
            moveTo(17.501f, 6.25f)
            curveTo(17.501f, 5.284f, 16.718f, 4.5f, 15.751f, 4.5f)
            horizontalLineTo(8.253f)
            curveTo(7.286f, 4.5f, 6.503f, 5.284f, 6.503f, 6.25f)
            verticalLineTo(19.782f)
            lineTo(11.564f, 16.141f)
            curveTo(11.826f, 15.953f, 12.179f, 15.953f, 12.44f, 16.141f)
            lineTo(17.501f, 19.782f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Bookmark, contentDescription = null)
    }
}
