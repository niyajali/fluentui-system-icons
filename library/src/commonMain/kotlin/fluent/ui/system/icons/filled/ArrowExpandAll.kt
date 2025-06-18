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

public val FluentUi.Filled.ArrowExpandAll: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExpandAll",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5f)
            curveTo(2f, 4.448f, 2.448f, 4f, 3f, 4f)
            horizontalLineTo(21f)
            curveTo(21.552f, 4f, 22f, 4.448f, 22f, 5f)
            curveTo(22f, 5.552f, 21.552f, 6f, 21f, 6f)
            horizontalLineTo(3f)
            curveTo(2.448f, 6f, 2f, 5.552f, 2f, 5f)
            close()
            moveTo(12f, 9f)
            curveTo(12f, 8.448f, 12.448f, 8f, 13f, 8f)
            horizontalLineTo(21f)
            curveTo(21.552f, 8f, 22f, 8.448f, 22f, 9f)
            curveTo(22f, 9.552f, 21.552f, 10f, 21f, 10f)
            horizontalLineTo(13f)
            curveTo(12.448f, 10f, 12f, 9.552f, 12f, 9f)
            close()
            moveTo(7.707f, 19.707f)
            curveTo(7.317f, 20.098f, 6.683f, 20.098f, 6.293f, 19.707f)
            lineTo(3.293f, 16.707f)
            curveTo(2.902f, 16.317f, 2.902f, 15.683f, 3.293f, 15.293f)
            curveTo(3.683f, 14.902f, 4.317f, 14.902f, 4.707f, 15.293f)
            lineTo(6f, 16.586f)
            verticalLineTo(9f)
            curveTo(6f, 8.448f, 6.448f, 8f, 7f, 8f)
            curveTo(7.552f, 8f, 8f, 8.448f, 8f, 9f)
            verticalLineTo(16.586f)
            lineTo(9.293f, 15.293f)
            curveTo(9.683f, 14.902f, 10.317f, 14.902f, 10.707f, 15.293f)
            curveTo(11.098f, 15.683f, 11.098f, 16.317f, 10.707f, 16.707f)
            lineTo(7.707f, 19.707f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowExpandAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowExpandAll, contentDescription = null)
    }
}
