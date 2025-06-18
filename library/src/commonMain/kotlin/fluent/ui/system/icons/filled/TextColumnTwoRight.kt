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

public val FluentUi.Filled.TextColumnTwoRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColumnTwoRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6f)
            curveTo(3f, 5.448f, 3.448f, 5f, 4f, 5f)
            horizontalLineTo(13f)
            curveTo(13.552f, 5f, 14f, 5.448f, 14f, 6f)
            curveTo(14f, 6.552f, 13.552f, 7f, 13f, 7f)
            horizontalLineTo(4f)
            curveTo(3.448f, 7f, 3f, 6.552f, 3f, 6f)
            close()
            moveTo(16f, 6f)
            curveTo(16f, 5.448f, 16.448f, 5f, 17f, 5f)
            horizontalLineTo(20f)
            curveTo(20.552f, 5f, 21f, 5.448f, 21f, 6f)
            curveTo(21f, 6.552f, 20.552f, 7f, 20f, 7f)
            horizontalLineTo(17f)
            curveTo(16.448f, 7f, 16f, 6.552f, 16f, 6f)
            close()
            moveTo(3f, 10f)
            curveTo(3f, 9.448f, 3.448f, 9f, 4f, 9f)
            horizontalLineTo(13f)
            curveTo(13.552f, 9f, 14f, 9.448f, 14f, 10f)
            curveTo(14f, 10.552f, 13.552f, 11f, 13f, 11f)
            horizontalLineTo(4f)
            curveTo(3.448f, 11f, 3f, 10.552f, 3f, 10f)
            close()
            moveTo(16f, 10f)
            curveTo(16f, 9.448f, 16.448f, 9f, 17f, 9f)
            horizontalLineTo(20f)
            curveTo(20.552f, 9f, 21f, 9.448f, 21f, 10f)
            curveTo(21f, 10.552f, 20.552f, 11f, 20f, 11f)
            horizontalLineTo(17f)
            curveTo(16.448f, 11f, 16f, 10.552f, 16f, 10f)
            close()
            moveTo(3f, 14f)
            curveTo(3f, 13.448f, 3.448f, 13f, 4f, 13f)
            horizontalLineTo(13f)
            curveTo(13.552f, 13f, 14f, 13.448f, 14f, 14f)
            curveTo(14f, 14.552f, 13.552f, 15f, 13f, 15f)
            horizontalLineTo(4f)
            curveTo(3.448f, 15f, 3f, 14.552f, 3f, 14f)
            close()
            moveTo(16f, 14f)
            curveTo(16f, 13.448f, 16.448f, 13f, 17f, 13f)
            horizontalLineTo(20f)
            curveTo(20.552f, 13f, 21f, 13.448f, 21f, 14f)
            curveTo(21f, 14.552f, 20.552f, 15f, 20f, 15f)
            horizontalLineTo(17f)
            curveTo(16.448f, 15f, 16f, 14.552f, 16f, 14f)
            close()
            moveTo(3f, 18f)
            curveTo(3f, 17.448f, 3.448f, 17f, 4f, 17f)
            horizontalLineTo(13f)
            curveTo(13.552f, 17f, 14f, 17.448f, 14f, 18f)
            curveTo(14f, 18.552f, 13.552f, 19f, 13f, 19f)
            horizontalLineTo(4f)
            curveTo(3.448f, 19f, 3f, 18.552f, 3f, 18f)
            close()
            moveTo(16f, 18f)
            curveTo(16f, 17.448f, 16.448f, 17f, 17f, 17f)
            horizontalLineTo(20f)
            curveTo(20.552f, 17f, 21f, 17.448f, 21f, 18f)
            curveTo(21f, 18.552f, 20.552f, 19f, 20f, 19f)
            horizontalLineTo(17f)
            curveTo(16.448f, 19f, 16f, 18.552f, 16f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextColumnTwoRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextColumnTwoRight, contentDescription = null)
    }
}
