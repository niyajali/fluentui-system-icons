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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.BoxSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BoxSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.409f, 2.512f)
            curveTo(12.505f, 2.146f, 11.495f, 2.146f, 10.591f, 2.512f)
            lineTo(3.093f, 5.552f)
            curveTo(2.432f, 5.82f, 2f, 6.461f, 2f, 7.174f)
            verticalLineTo(11.6f)
            curveTo(2.466f, 11.362f, 2.969f, 11.188f, 3.5f, 11.091f)
            verticalLineTo(7.749f)
            lineTo(11.25f, 10.763f)
            lineTo(11.25f, 20.775f)
            lineTo(11.487f, 21.013f)
            curveTo(11.704f, 21.229f, 11.852f, 21.488f, 11.931f, 21.762f)
            curveTo(12.432f, 21.772f, 12.935f, 21.68f, 13.409f, 21.488f)
            lineTo(20.907f, 18.448f)
            curveTo(21.568f, 18.181f, 22f, 17.539f, 22f, 16.826f)
            verticalLineTo(7.174f)
            curveTo(22f, 6.461f, 21.568f, 5.82f, 20.907f, 5.552f)
            lineTo(13.409f, 2.512f)
            close()
            moveTo(11.155f, 3.902f)
            curveTo(11.697f, 3.682f, 12.303f, 3.682f, 12.845f, 3.902f)
            lineTo(19.437f, 6.574f)
            lineTo(16.768f, 7.605f)
            lineTo(9.241f, 4.678f)
            lineTo(11.155f, 3.902f)
            close()
            moveTo(7.215f, 5.499f)
            lineTo(14.691f, 8.407f)
            lineTo(12.001f, 9.445f)
            lineTo(4.59f, 6.563f)
            lineTo(7.215f, 5.499f)
            close()
            moveTo(20.344f, 17.058f)
            lineTo(12.845f, 20.098f)
            curveTo(12.814f, 20.111f, 12.782f, 20.123f, 12.75f, 20.134f)
            verticalLineTo(10.764f)
            lineTo(20.5f, 7.772f)
            verticalLineTo(16.826f)
            curveTo(20.5f, 16.928f, 20.438f, 17.02f, 20.344f, 17.058f)
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
        Image(imageVector = FluentUi.Regular.BoxSearch, contentDescription = null)
    }
}
