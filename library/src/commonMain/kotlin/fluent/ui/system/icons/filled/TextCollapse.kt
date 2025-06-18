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

public val FluentIcons.Filled.TextCollapse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextCollapse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 4f)
            curveTo(6f, 4.552f, 6.448f, 5f, 7f, 5f)
            horizontalLineTo(21f)
            curveTo(21.552f, 5f, 22f, 4.552f, 22f, 4f)
            curveTo(22f, 3.448f, 21.552f, 3f, 21f, 3f)
            horizontalLineTo(7f)
            curveTo(6.448f, 3f, 6f, 3.448f, 6f, 4f)
            close()
            moveTo(13f, 9f)
            curveTo(13f, 9.552f, 13.448f, 10f, 14f, 10f)
            horizontalLineTo(21f)
            curveTo(21.552f, 10f, 22f, 9.552f, 22f, 9f)
            curveTo(22f, 8.448f, 21.552f, 8f, 21f, 8f)
            horizontalLineTo(14f)
            curveTo(13.448f, 8f, 13f, 8.448f, 13f, 9f)
            close()
            moveTo(7f, 18f)
            horizontalLineTo(21f)
            curveTo(21.552f, 18f, 22f, 18.448f, 22f, 19f)
            curveTo(22f, 19.552f, 21.552f, 20f, 21f, 20f)
            horizontalLineTo(7f)
            curveTo(6.448f, 20f, 6f, 19.552f, 6f, 19f)
            curveTo(6f, 18.448f, 6.448f, 18f, 7f, 18f)
            close()
            moveTo(13f, 14f)
            curveTo(13f, 14.552f, 13.448f, 15f, 14f, 15f)
            horizontalLineTo(21f)
            curveTo(21.552f, 15f, 22f, 14.552f, 22f, 14f)
            curveTo(22f, 13.448f, 21.552f, 13f, 21f, 13f)
            horizontalLineTo(14f)
            curveTo(13.448f, 13f, 13f, 13.448f, 13f, 14f)
            close()
            moveTo(11f, 11.5f)
            curveTo(11f, 9.015f, 8.985f, 7f, 6.5f, 7f)
            curveTo(4.015f, 7f, 2f, 9.015f, 2f, 11.5f)
            curveTo(2f, 13.985f, 4.015f, 16f, 6.5f, 16f)
            curveTo(8.985f, 16f, 11f, 13.985f, 11f, 11.5f)
            close()
            moveTo(9f, 11.5f)
            curveTo(9f, 11.776f, 8.776f, 12f, 8.5f, 12f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 12f, 4f, 11.776f, 4f, 11.5f)
            curveTo(4f, 11.224f, 4.224f, 11f, 4.5f, 11f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 11f, 9f, 11.224f, 9f, 11.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextCollapsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextCollapse, contentDescription = null)
    }
}
