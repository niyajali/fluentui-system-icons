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

public val FluentUi.Filled.DocumentToolbox: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentToolbox",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20.5f)
            curveTo(20f, 21.328f, 19.328f, 22f, 18.5f, 22f)
            horizontalLineTo(13f)
            verticalLineTo(16.999f)
            curveTo(13f, 15.894f, 12.105f, 15f, 11f, 15f)
            horizontalLineTo(10f)
            verticalLineTo(14f)
            curveTo(10f, 12.896f, 9.105f, 12f, 8f, 12f)
            lineTo(5f, 12f)
            curveTo(4.636f, 12f, 4.294f, 12.097f, 4f, 12.268f)
            verticalLineTo(3.5f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(4f, 16f)
            verticalLineTo(14.5f)
            curveTo(4f, 13.672f, 4.672f, 13f, 5.5f, 13f)
            horizontalLineTo(7.5f)
            curveTo(8.328f, 13f, 9f, 13.672f, 9f, 14.5f)
            verticalLineTo(16f)
            horizontalLineTo(10.5f)
            curveTo(11.328f, 16f, 12f, 16.672f, 12f, 17.5f)
            lineTo(12f, 19f)
            horizontalLineTo(9f)
            verticalLineTo(18.5f)
            curveTo(9f, 18.224f, 8.776f, 18f, 8.5f, 18f)
            curveTo(8.224f, 18f, 8f, 18.224f, 8f, 18.5f)
            verticalLineTo(19f)
            horizontalLineTo(5f)
            verticalLineTo(18.5f)
            curveTo(5f, 18.224f, 4.776f, 18f, 4.5f, 18f)
            curveTo(4.224f, 18f, 4f, 18.224f, 4f, 18.5f)
            verticalLineTo(19f)
            horizontalLineTo(1f)
            verticalLineTo(17.5f)
            curveTo(1f, 16.672f, 1.672f, 16f, 2.5f, 16f)
            horizontalLineTo(4f)
            close()
            moveTo(5f, 14.5f)
            verticalLineTo(16f)
            horizontalLineTo(8f)
            verticalLineTo(14.5f)
            curveTo(8f, 14.224f, 7.776f, 14f, 7.5f, 14f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 14f, 5f, 14.224f, 5f, 14.5f)
            close()
            moveTo(9f, 20f)
            horizontalLineTo(12f)
            lineTo(12f, 21.5f)
            curveTo(12f, 22.328f, 11.328f, 23f, 10.5f, 23f)
            horizontalLineTo(2.5f)
            curveTo(1.672f, 23f, 1f, 22.328f, 1f, 21.5f)
            verticalLineTo(20f)
            horizontalLineTo(4f)
            verticalLineTo(20.5f)
            curveTo(4f, 20.776f, 4.224f, 21f, 4.5f, 21f)
            curveTo(4.776f, 21f, 5f, 20.776f, 5f, 20.5f)
            verticalLineTo(20f)
            horizontalLineTo(8f)
            verticalLineTo(20.5f)
            curveTo(8f, 20.776f, 8.224f, 21f, 8.5f, 21f)
            curveTo(8.776f, 21f, 9f, 20.776f, 9f, 20.5f)
            verticalLineTo(20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentToolbox, contentDescription = null)
    }
}
