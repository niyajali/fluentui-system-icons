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

public val FluentUi.Filled.LineHorizontal2DashesSolid: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal2DashesSolid",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 7f)
            curveTo(2.448f, 7f, 2f, 7.448f, 2f, 8f)
            curveTo(2f, 8.552f, 2.448f, 9f, 3f, 9f)
            horizontalLineTo(6f)
            curveTo(6.552f, 9f, 7f, 8.552f, 7f, 8f)
            curveTo(7f, 7.448f, 6.552f, 7f, 6f, 7f)
            horizontalLineTo(3f)
            close()
            moveTo(10.5f, 7f)
            curveTo(9.948f, 7f, 9.5f, 7.448f, 9.5f, 8f)
            curveTo(9.5f, 8.552f, 9.948f, 9f, 10.5f, 9f)
            horizontalLineTo(13.5f)
            curveTo(14.052f, 9f, 14.5f, 8.552f, 14.5f, 8f)
            curveTo(14.5f, 7.448f, 14.052f, 7f, 13.5f, 7f)
            horizontalLineTo(10.5f)
            close()
            moveTo(18f, 7f)
            curveTo(17.448f, 7f, 17f, 7.448f, 17f, 8f)
            curveTo(17f, 8.552f, 17.448f, 9f, 18f, 9f)
            horizontalLineTo(21f)
            curveTo(21.552f, 9f, 22f, 8.552f, 22f, 8f)
            curveTo(22f, 7.448f, 21.552f, 7f, 21f, 7f)
            horizontalLineTo(18f)
            close()
            moveTo(3f, 15f)
            curveTo(2.448f, 15f, 2f, 15.448f, 2f, 16f)
            curveTo(2f, 16.552f, 2.448f, 17f, 3f, 17f)
            horizontalLineTo(21f)
            curveTo(21.552f, 17f, 22f, 16.552f, 22f, 16f)
            curveTo(22f, 15.448f, 21.552f, 15f, 21f, 15f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LineHorizontal2DashesSolidPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LineHorizontal2DashesSolid, contentDescription = null)
    }
}
