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

public val FluentUi.Regular.DocumentSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(12.172f)
            curveTo(12.703f, 2f, 13.211f, 2.211f, 13.586f, 2.586f)
            lineTo(19.414f, 8.414f)
            curveTo(19.789f, 8.789f, 20f, 9.297f, 20f, 9.828f)
            verticalLineTo(20f)
            curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
            horizontalLineTo(13.982f)
            curveTo(13.93f, 21.639f, 13.765f, 21.291f, 13.487f, 21.013f)
            lineTo(12.975f, 20.5f)
            horizontalLineTo(18f)
            curveTo(18.276f, 20.5f, 18.5f, 20.276f, 18.5f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
            verticalLineTo(3.5f)
            horizontalLineTo(6f)
            curveTo(5.724f, 3.5f, 5.5f, 3.724f, 5.5f, 4f)
            verticalLineTo(11.091f)
            curveTo(4.969f, 11.188f, 4.466f, 11.362f, 4f, 11.6f)
            verticalLineTo(4f)
            close()
            moveTo(14f, 8.5f)
            horizontalLineTo(17.379f)
            lineTo(13.5f, 4.621f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            close()
            moveTo(6.5f, 21f)
            curveTo(7.472f, 21f, 8.372f, 20.692f, 9.107f, 20.168f)
            lineTo(11.72f, 22.78f)
            curveTo(12.013f, 23.073f, 12.487f, 23.073f, 12.78f, 22.78f)
            curveTo(13.073f, 22.487f, 13.073f, 22.013f, 12.78f, 21.72f)
            lineTo(10.168f, 19.107f)
            curveTo(10.692f, 18.372f, 11f, 17.472f, 11f, 16.5f)
            curveTo(11f, 14.015f, 8.985f, 12f, 6.5f, 12f)
            curveTo(4.015f, 12f, 2f, 14.015f, 2f, 16.5f)
            curveTo(2f, 18.985f, 4.015f, 21f, 6.5f, 21f)
            close()
            moveTo(6.5f, 19.5f)
            curveTo(4.843f, 19.5f, 3.5f, 18.157f, 3.5f, 16.5f)
            curveTo(3.5f, 14.843f, 4.843f, 13.5f, 6.5f, 13.5f)
            curveTo(8.157f, 13.5f, 9.5f, 14.843f, 9.5f, 16.5f)
            curveTo(9.5f, 18.157f, 8.157f, 19.5f, 6.5f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentSearch, contentDescription = null)
    }
}
