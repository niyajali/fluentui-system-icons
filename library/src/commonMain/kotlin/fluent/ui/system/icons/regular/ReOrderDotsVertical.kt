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
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ReOrderDotsVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ReOrderDotsVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.5f, 17f)
            curveTo(16.328f, 17f, 17f, 17.672f, 17f, 18.5f)
            curveTo(17f, 19.328f, 16.328f, 20f, 15.5f, 20f)
            curveTo(14.672f, 20f, 14f, 19.328f, 14f, 18.5f)
            curveTo(14f, 17.672f, 14.672f, 17f, 15.5f, 17f)
            close()
            moveTo(8.5f, 17f)
            curveTo(9.328f, 17f, 10f, 17.672f, 10f, 18.5f)
            curveTo(10f, 19.328f, 9.328f, 20f, 8.5f, 20f)
            curveTo(7.672f, 20f, 7f, 19.328f, 7f, 18.5f)
            curveTo(7f, 17.672f, 7.672f, 17f, 8.5f, 17f)
            close()
            moveTo(15.5f, 10f)
            curveTo(16.328f, 10f, 17f, 10.672f, 17f, 11.5f)
            curveTo(17f, 12.328f, 16.328f, 13f, 15.5f, 13f)
            curveTo(14.672f, 13f, 14f, 12.328f, 14f, 11.5f)
            curveTo(14f, 10.672f, 14.672f, 10f, 15.5f, 10f)
            close()
            moveTo(8.5f, 10f)
            curveTo(9.328f, 10f, 10f, 10.672f, 10f, 11.5f)
            curveTo(10f, 12.328f, 9.328f, 13f, 8.5f, 13f)
            curveTo(7.672f, 13f, 7f, 12.328f, 7f, 11.5f)
            curveTo(7f, 10.672f, 7.672f, 10f, 8.5f, 10f)
            close()
            moveTo(15.5f, 3f)
            curveTo(16.328f, 3f, 17f, 3.672f, 17f, 4.5f)
            curveTo(17f, 5.328f, 16.328f, 6f, 15.5f, 6f)
            curveTo(14.672f, 6f, 14f, 5.328f, 14f, 4.5f)
            curveTo(14f, 3.672f, 14.672f, 3f, 15.5f, 3f)
            close()
            moveTo(8.5f, 3f)
            curveTo(9.328f, 3f, 10f, 3.672f, 10f, 4.5f)
            curveTo(10f, 5.328f, 9.328f, 6f, 8.5f, 6f)
            curveTo(7.672f, 6f, 7f, 5.328f, 7f, 4.5f)
            curveTo(7f, 3.672f, 7.672f, 3f, 8.5f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReOrderDotsVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ReOrderDotsVertical, contentDescription = null)
    }
}
