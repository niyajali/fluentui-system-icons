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

public val FluentUi.Regular.ArrowCollapseAll: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCollapseAll",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 4.75f)
            curveTo(2f, 4.336f, 2.336f, 4f, 2.75f, 4f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 4f, 22f, 4.336f, 22f, 4.75f)
            curveTo(22f, 5.164f, 21.664f, 5.5f, 21.25f, 5.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 5.5f, 2f, 5.164f, 2f, 4.75f)
            close()
            moveTo(12f, 8.75f)
            curveTo(12f, 8.336f, 12.336f, 8f, 12.75f, 8f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 8f, 22f, 8.336f, 22f, 8.75f)
            curveTo(22f, 9.164f, 21.664f, 9.5f, 21.25f, 9.5f)
            horizontalLineTo(12.75f)
            curveTo(12.336f, 9.5f, 12f, 9.164f, 12f, 8.75f)
            close()
            moveTo(7.28f, 8.22f)
            curveTo(7.14f, 8.079f, 6.949f, 8f, 6.75f, 8f)
            curveTo(6.551f, 8f, 6.36f, 8.079f, 6.22f, 8.22f)
            lineTo(3.22f, 11.22f)
            curveTo(2.927f, 11.513f, 2.927f, 11.987f, 3.22f, 12.28f)
            curveTo(3.513f, 12.573f, 3.987f, 12.573f, 4.28f, 12.28f)
            lineTo(6f, 10.561f)
            verticalLineTo(19.25f)
            curveTo(6f, 19.664f, 6.336f, 20f, 6.75f, 20f)
            curveTo(7.164f, 20f, 7.5f, 19.664f, 7.5f, 19.25f)
            verticalLineTo(10.561f)
            lineTo(9.22f, 12.28f)
            curveTo(9.513f, 12.573f, 9.987f, 12.573f, 10.28f, 12.28f)
            curveTo(10.573f, 11.987f, 10.573f, 11.513f, 10.28f, 11.22f)
            lineTo(7.28f, 8.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowCollapseAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowCollapseAll, contentDescription = null)
    }
}
