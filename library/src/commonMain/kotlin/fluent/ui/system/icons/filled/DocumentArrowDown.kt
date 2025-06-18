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

public val FluentUi.Filled.DocumentArrowDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentArrowDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20f)
            curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
            horizontalLineTo(11.19f)
            curveTo(12.311f, 20.832f, 13f, 19.247f, 13f, 17.5f)
            curveTo(13f, 13.91f, 10.09f, 11f, 6.5f, 11f)
            curveTo(5.614f, 11f, 4.77f, 11.177f, 4f, 11.498f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(7f, 14.5f)
            curveTo(7f, 14.224f, 6.776f, 14f, 6.5f, 14f)
            curveTo(6.224f, 14f, 6f, 14.224f, 6f, 14.5f)
            verticalLineTo(19.293f)
            lineTo(4.354f, 17.646f)
            curveTo(4.158f, 17.451f, 3.842f, 17.451f, 3.646f, 17.646f)
            curveTo(3.451f, 17.842f, 3.451f, 18.158f, 3.646f, 18.354f)
            lineTo(6.146f, 20.854f)
            curveTo(6.342f, 21.049f, 6.658f, 21.049f, 6.854f, 20.854f)
            lineTo(9.354f, 18.354f)
            curveTo(9.549f, 18.158f, 9.549f, 17.842f, 9.354f, 17.646f)
            curveTo(9.158f, 17.451f, 8.842f, 17.451f, 8.646f, 17.646f)
            lineTo(7f, 19.293f)
            verticalLineTo(14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentArrowDown, contentDescription = null)
    }
}
