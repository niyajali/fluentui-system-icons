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

public val FluentUi.Filled.TextColumnTwoLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColumnTwoLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 6f)
            curveTo(21f, 5.448f, 20.552f, 5f, 20f, 5f)
            horizontalLineTo(11f)
            curveTo(10.448f, 5f, 10f, 5.448f, 10f, 6f)
            curveTo(10f, 6.552f, 10.448f, 7f, 11f, 7f)
            horizontalLineTo(20f)
            curveTo(20.552f, 7f, 21f, 6.552f, 21f, 6f)
            close()
            moveTo(8f, 6f)
            curveTo(8f, 5.448f, 7.552f, 5f, 7f, 5f)
            horizontalLineTo(4f)
            curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
            curveTo(3f, 6.552f, 3.448f, 7f, 4f, 7f)
            horizontalLineTo(7f)
            curveTo(7.552f, 7f, 8f, 6.552f, 8f, 6f)
            close()
            moveTo(21f, 10f)
            curveTo(21f, 9.448f, 20.552f, 9f, 20f, 9f)
            horizontalLineTo(11f)
            curveTo(10.448f, 9f, 10f, 9.448f, 10f, 10f)
            curveTo(10f, 10.552f, 10.448f, 11f, 11f, 11f)
            horizontalLineTo(20f)
            curveTo(20.552f, 11f, 21f, 10.552f, 21f, 10f)
            close()
            moveTo(8f, 10f)
            curveTo(8f, 9.448f, 7.552f, 9f, 7f, 9f)
            horizontalLineTo(4f)
            curveTo(3.448f, 9f, 3f, 9.448f, 3f, 10f)
            curveTo(3f, 10.552f, 3.448f, 11f, 4f, 11f)
            horizontalLineTo(7f)
            curveTo(7.552f, 11f, 8f, 10.552f, 8f, 10f)
            close()
            moveTo(21f, 14f)
            curveTo(21f, 13.448f, 20.552f, 13f, 20f, 13f)
            horizontalLineTo(11f)
            curveTo(10.448f, 13f, 10f, 13.448f, 10f, 14f)
            curveTo(10f, 14.552f, 10.448f, 15f, 11f, 15f)
            horizontalLineTo(20f)
            curveTo(20.552f, 15f, 21f, 14.552f, 21f, 14f)
            close()
            moveTo(8f, 14f)
            curveTo(8f, 13.448f, 7.552f, 13f, 7f, 13f)
            horizontalLineTo(4f)
            curveTo(3.448f, 13f, 3f, 13.448f, 3f, 14f)
            curveTo(3f, 14.552f, 3.448f, 15f, 4f, 15f)
            horizontalLineTo(7f)
            curveTo(7.552f, 15f, 8f, 14.552f, 8f, 14f)
            close()
            moveTo(21f, 18f)
            curveTo(21f, 17.448f, 20.552f, 17f, 20f, 17f)
            horizontalLineTo(11f)
            curveTo(10.448f, 17f, 10f, 17.448f, 10f, 18f)
            curveTo(10f, 18.552f, 10.448f, 19f, 11f, 19f)
            horizontalLineTo(20f)
            curveTo(20.552f, 19f, 21f, 18.552f, 21f, 18f)
            close()
            moveTo(8f, 18f)
            curveTo(8f, 17.448f, 7.552f, 17f, 7f, 17f)
            horizontalLineTo(4f)
            curveTo(3.448f, 17f, 3f, 17.448f, 3f, 18f)
            curveTo(3f, 18.552f, 3.448f, 19f, 4f, 19f)
            horizontalLineTo(7f)
            curveTo(7.552f, 19f, 8f, 18.552f, 8f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextColumnTwoLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextColumnTwoLeft, contentDescription = null)
    }
}
