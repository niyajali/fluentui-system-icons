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

public val FluentUi.Filled.ReOrderDotsHorizontal: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrderDotsHorizontal",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 16f)
            curveTo(7f, 17.105f, 6.105f, 18f, 5f, 18f)
            curveTo(3.895f, 18f, 3f, 17.105f, 3f, 16f)
            curveTo(3f, 14.895f, 3.895f, 14f, 5f, 14f)
            curveTo(6.105f, 14f, 7f, 14.895f, 7f, 16f)
            close()
            moveTo(7f, 8f)
            curveTo(7f, 9.105f, 6.105f, 10f, 5f, 10f)
            curveTo(3.895f, 10f, 3f, 9.105f, 3f, 8f)
            curveTo(3f, 6.895f, 3.895f, 6f, 5f, 6f)
            curveTo(6.105f, 6f, 7f, 6.895f, 7f, 8f)
            close()
            moveTo(14f, 16f)
            curveTo(14f, 17.105f, 13.105f, 18f, 12f, 18f)
            curveTo(10.895f, 18f, 10f, 17.105f, 10f, 16f)
            curveTo(10f, 14.895f, 10.895f, 14f, 12f, 14f)
            curveTo(13.105f, 14f, 14f, 14.895f, 14f, 16f)
            close()
            moveTo(14f, 8f)
            curveTo(14f, 9.105f, 13.105f, 10f, 12f, 10f)
            curveTo(10.895f, 10f, 10f, 9.105f, 10f, 8f)
            curveTo(10f, 6.895f, 10.895f, 6f, 12f, 6f)
            curveTo(13.105f, 6f, 14f, 6.895f, 14f, 8f)
            close()
            moveTo(21f, 16f)
            curveTo(21f, 17.105f, 20.105f, 18f, 19f, 18f)
            curveTo(17.895f, 18f, 17f, 17.105f, 17f, 16f)
            curveTo(17f, 14.895f, 17.895f, 14f, 19f, 14f)
            curveTo(20.105f, 14f, 21f, 14.895f, 21f, 16f)
            close()
            moveTo(21f, 8f)
            curveTo(21f, 9.105f, 20.105f, 10f, 19f, 10f)
            curveTo(17.895f, 10f, 17f, 9.105f, 17f, 8f)
            curveTo(17f, 6.895f, 17.895f, 6f, 19f, 6f)
            curveTo(20.105f, 6f, 21f, 6.895f, 21f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReOrderDotsHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ReOrderDotsHorizontal, contentDescription = null)
    }
}
