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

public val FluentUi.Filled.TextColumnOneSemiNarrow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColumnOneSemiNarrow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 5f)
            curveTo(7.448f, 5f, 7f, 5.448f, 7f, 6f)
            curveTo(7f, 6.552f, 7.448f, 7f, 8f, 7f)
            horizontalLineTo(16f)
            curveTo(16.552f, 7f, 17f, 6.552f, 17f, 6f)
            curveTo(17f, 5.448f, 16.552f, 5f, 16f, 5f)
            horizontalLineTo(8f)
            close()
            moveTo(8f, 9f)
            curveTo(7.448f, 9f, 7f, 9.448f, 7f, 10f)
            curveTo(7f, 10.552f, 7.448f, 11f, 8f, 11f)
            horizontalLineTo(16f)
            curveTo(16.552f, 11f, 17f, 10.552f, 17f, 10f)
            curveTo(17f, 9.448f, 16.552f, 9f, 16f, 9f)
            horizontalLineTo(8f)
            close()
            moveTo(7f, 14f)
            curveTo(7f, 13.448f, 7.448f, 13f, 8f, 13f)
            horizontalLineTo(16f)
            curveTo(16.552f, 13f, 17f, 13.448f, 17f, 14f)
            curveTo(17f, 14.552f, 16.552f, 15f, 16f, 15f)
            horizontalLineTo(8f)
            curveTo(7.448f, 15f, 7f, 14.552f, 7f, 14f)
            close()
            moveTo(8f, 17f)
            curveTo(7.448f, 17f, 7f, 17.448f, 7f, 18f)
            curveTo(7f, 18.552f, 7.448f, 19f, 8f, 19f)
            horizontalLineTo(16f)
            curveTo(16.552f, 19f, 17f, 18.552f, 17f, 18f)
            curveTo(17f, 17.448f, 16.552f, 17f, 16f, 17f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextColumnOneSemiNarrowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextColumnOneSemiNarrow, contentDescription = null)
    }
}
