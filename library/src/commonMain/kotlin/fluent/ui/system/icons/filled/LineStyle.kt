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

public val FluentUi.Filled.LineStyle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineStyle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 5f)
            curveTo(2.448f, 5f, 2f, 5.448f, 2f, 6f)
            curveTo(2f, 6.552f, 2.448f, 7f, 3f, 7f)
            horizontalLineTo(6f)
            curveTo(6.552f, 7f, 7f, 6.552f, 7f, 6f)
            curveTo(7f, 5.448f, 6.552f, 5f, 6f, 5f)
            horizontalLineTo(3f)
            close()
            moveTo(10.5f, 5f)
            curveTo(9.948f, 5f, 9.5f, 5.448f, 9.5f, 6f)
            curveTo(9.5f, 6.552f, 9.948f, 7f, 10.5f, 7f)
            horizontalLineTo(13.5f)
            curveTo(14.052f, 7f, 14.5f, 6.552f, 14.5f, 6f)
            curveTo(14.5f, 5.448f, 14.052f, 5f, 13.5f, 5f)
            horizontalLineTo(10.5f)
            close()
            moveTo(18f, 5f)
            curveTo(17.448f, 5f, 17f, 5.448f, 17f, 6f)
            curveTo(17f, 6.552f, 17.448f, 7f, 18f, 7f)
            horizontalLineTo(21f)
            curveTo(21.552f, 7f, 22f, 6.552f, 22f, 6f)
            curveTo(22f, 5.448f, 21.552f, 5f, 21f, 5f)
            horizontalLineTo(18f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
            horizontalLineTo(21f)
            curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
            curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
            horizontalLineTo(3f)
            curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
            close()
            moveTo(3.5f, 17f)
            curveTo(2.672f, 17f, 2f, 17.672f, 2f, 18.5f)
            curveTo(2f, 19.328f, 2.672f, 20f, 3.5f, 20f)
            horizontalLineTo(20.5f)
            curveTo(21.328f, 20f, 22f, 19.328f, 22f, 18.5f)
            curveTo(22f, 17.672f, 21.328f, 17f, 20.5f, 17f)
            horizontalLineTo(3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LineStylePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LineStyle, contentDescription = null)
    }
}
