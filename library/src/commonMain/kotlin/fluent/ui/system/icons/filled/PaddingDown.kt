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

public val FluentIcons.Filled.PaddingDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaddingDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 3f)
            curveTo(4f, 3.552f, 4.448f, 4f, 5f, 4f)
            horizontalLineTo(19f)
            curveTo(19.552f, 4f, 20f, 3.552f, 20f, 3f)
            curveTo(20f, 2.448f, 19.552f, 2f, 19f, 2f)
            horizontalLineTo(5f)
            curveTo(4.448f, 2f, 4f, 2.448f, 4f, 3f)
            close()
            moveTo(4f, 21f)
            curveTo(4f, 21.552f, 4.448f, 22f, 5f, 22f)
            horizontalLineTo(6.75f)
            curveTo(7.302f, 22f, 7.75f, 21.552f, 7.75f, 21f)
            curveTo(7.75f, 20.448f, 7.302f, 20f, 6.75f, 20f)
            horizontalLineTo(5f)
            curveTo(4.448f, 20f, 4f, 20.448f, 4f, 21f)
            close()
            moveTo(9.25f, 21f)
            curveTo(9.25f, 21.552f, 9.698f, 22f, 10.25f, 22f)
            horizontalLineTo(13.75f)
            curveTo(14.302f, 22f, 14.75f, 21.552f, 14.75f, 21f)
            curveTo(14.75f, 20.448f, 14.302f, 20f, 13.75f, 20f)
            horizontalLineTo(10.25f)
            curveTo(9.698f, 20f, 9.25f, 20.448f, 9.25f, 21f)
            close()
            moveTo(16.25f, 21f)
            curveTo(16.25f, 21.552f, 16.698f, 22f, 17.25f, 22f)
            horizontalLineTo(19f)
            curveTo(19.552f, 22f, 20f, 21.552f, 20f, 21f)
            curveTo(20f, 20.448f, 19.552f, 20f, 19f, 20f)
            horizontalLineTo(17.25f)
            curveTo(16.698f, 20f, 16.25f, 20.448f, 16.25f, 21f)
            close()
            moveTo(17.707f, 13.707f)
            lineTo(12.707f, 18.707f)
            curveTo(12.317f, 19.098f, 11.683f, 19.098f, 11.293f, 18.707f)
            lineTo(6.293f, 13.707f)
            curveTo(5.902f, 13.317f, 5.902f, 12.683f, 6.293f, 12.293f)
            curveTo(6.683f, 11.902f, 7.317f, 11.902f, 7.707f, 12.293f)
            lineTo(11f, 15.586f)
            verticalLineTo(6f)
            curveTo(11f, 5.448f, 11.448f, 5f, 12f, 5f)
            curveTo(12.552f, 5f, 13f, 5.448f, 13f, 6f)
            verticalLineTo(15.586f)
            lineTo(16.293f, 12.293f)
            curveTo(16.683f, 11.902f, 17.317f, 11.902f, 17.707f, 12.293f)
            curveTo(18.098f, 12.683f, 18.098f, 13.317f, 17.707f, 13.707f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaddingDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PaddingDown, contentDescription = null)
    }
}
