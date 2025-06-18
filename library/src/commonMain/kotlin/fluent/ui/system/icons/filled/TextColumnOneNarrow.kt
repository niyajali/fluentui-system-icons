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

public val FluentIcons.Filled.TextColumnOneNarrow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColumnOneNarrow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 5f)
            curveTo(8.448f, 5f, 8f, 5.448f, 8f, 6f)
            curveTo(8f, 6.552f, 8.448f, 7f, 9f, 7f)
            horizontalLineTo(15f)
            curveTo(15.552f, 7f, 16f, 6.552f, 16f, 6f)
            curveTo(16f, 5.448f, 15.552f, 5f, 15f, 5f)
            horizontalLineTo(9f)
            close()
            moveTo(9f, 9f)
            curveTo(8.448f, 9f, 8f, 9.448f, 8f, 10f)
            curveTo(8f, 10.552f, 8.448f, 11f, 9f, 11f)
            horizontalLineTo(15f)
            curveTo(15.552f, 11f, 16f, 10.552f, 16f, 10f)
            curveTo(16f, 9.448f, 15.552f, 9f, 15f, 9f)
            horizontalLineTo(9f)
            close()
            moveTo(8f, 14f)
            curveTo(8f, 13.448f, 8.448f, 13f, 9f, 13f)
            horizontalLineTo(15f)
            curveTo(15.552f, 13f, 16f, 13.448f, 16f, 14f)
            curveTo(16f, 14.552f, 15.552f, 15f, 15f, 15f)
            horizontalLineTo(9f)
            curveTo(8.448f, 15f, 8f, 14.552f, 8f, 14f)
            close()
            moveTo(9f, 17f)
            curveTo(8.448f, 17f, 8f, 17.448f, 8f, 18f)
            curveTo(8f, 18.552f, 8.448f, 19f, 9f, 19f)
            horizontalLineTo(15f)
            curveTo(15.552f, 19f, 16f, 18.552f, 16f, 18f)
            curveTo(16f, 17.448f, 15.552f, 17f, 15f, 17f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextColumnOneNarrowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextColumnOneNarrow, contentDescription = null)
    }
}
