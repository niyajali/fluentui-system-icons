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

public val FluentUi.Filled.BoxSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BoxSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.409f, 2.512f)
            curveTo(12.505f, 2.146f, 11.495f, 2.146f, 10.591f, 2.512f)
            lineTo(8.401f, 3.4f)
            lineTo(17.993f, 7.13f)
            lineTo(21.367f, 5.827f)
            curveTo(21.231f, 5.714f, 21.077f, 5.621f, 20.907f, 5.552f)
            lineTo(13.409f, 2.512f)
            close()
            moveTo(22f, 7.19f)
            lineTo(12.75f, 10.764f)
            verticalLineTo(21.687f)
            curveTo(12.974f, 21.642f, 13.194f, 21.575f, 13.409f, 21.488f)
            lineTo(20.907f, 18.448f)
            curveTo(21.568f, 18.181f, 22f, 17.539f, 22f, 16.826f)
            verticalLineTo(7.19f)
            close()
            moveTo(11.25f, 10.764f)
            verticalLineTo(20.775f)
            lineTo(9.425f, 18.95f)
            curveTo(9.793f, 18.213f, 10f, 17.381f, 10f, 16.5f)
            curveTo(10f, 13.462f, 7.538f, 11f, 4.5f, 11f)
            curveTo(3.6f, 11f, 2.75f, 11.216f, 2f, 11.6f)
            verticalLineTo(7.19f)
            lineTo(11.25f, 10.764f)
            close()
            moveTo(2.633f, 5.827f)
            lineTo(12f, 9.446f)
            lineTo(15.917f, 7.932f)
            lineTo(6.374f, 4.222f)
            lineTo(3.093f, 5.552f)
            curveTo(2.923f, 5.621f, 2.769f, 5.714f, 2.633f, 5.827f)
            close()
            moveTo(4.5f, 21f)
            curveTo(5.472f, 21f, 6.372f, 20.692f, 7.107f, 20.168f)
            lineTo(9.72f, 22.78f)
            curveTo(10.013f, 23.073f, 10.487f, 23.073f, 10.78f, 22.78f)
            curveTo(11.073f, 22.487f, 11.073f, 22.013f, 10.78f, 21.72f)
            lineTo(8.168f, 19.107f)
            curveTo(8.692f, 18.372f, 9f, 17.472f, 9f, 16.5f)
            curveTo(9f, 14.015f, 6.985f, 12f, 4.5f, 12f)
            curveTo(2.015f, 12f, 0f, 14.015f, 0f, 16.5f)
            curveTo(0f, 18.985f, 2.015f, 21f, 4.5f, 21f)
            close()
            moveTo(4.5f, 19.5f)
            curveTo(2.843f, 19.5f, 1.5f, 18.157f, 1.5f, 16.5f)
            curveTo(1.5f, 14.843f, 2.843f, 13.5f, 4.5f, 13.5f)
            curveTo(6.157f, 13.5f, 7.5f, 14.843f, 7.5f, 16.5f)
            curveTo(7.5f, 18.157f, 6.157f, 19.5f, 4.5f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BoxSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BoxSearch, contentDescription = null)
    }
}
