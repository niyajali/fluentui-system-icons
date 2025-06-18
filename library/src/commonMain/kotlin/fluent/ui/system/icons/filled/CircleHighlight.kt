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

public val FluentUi.Filled.CircleHighlight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleHighlight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.306f, 2.367f)
            curveTo(8.831f, 2.5f, 8.37f, 2.667f, 7.926f, 2.865f)
            lineTo(11.78f, 6.72f)
            curveTo(12.073f, 7.013f, 12.073f, 7.487f, 11.78f, 7.78f)
            curveTo(11.487f, 8.073f, 11.013f, 8.073f, 10.72f, 7.78f)
            lineTo(6.552f, 3.613f)
            curveTo(6.176f, 3.858f, 5.818f, 4.127f, 5.479f, 4.418f)
            lineTo(9.28f, 8.22f)
            curveTo(9.573f, 8.513f, 9.573f, 8.987f, 9.28f, 9.28f)
            curveTo(8.987f, 9.573f, 8.513f, 9.573f, 8.22f, 9.28f)
            lineTo(4.418f, 5.479f)
            curveTo(4.127f, 5.818f, 3.858f, 6.176f, 3.613f, 6.552f)
            lineTo(7.78f, 10.72f)
            curveTo(8.073f, 11.013f, 8.073f, 11.487f, 7.78f, 11.78f)
            curveTo(7.487f, 12.073f, 7.013f, 12.073f, 6.72f, 11.78f)
            lineTo(2.865f, 7.926f)
            curveTo(2.667f, 8.37f, 2.5f, 8.831f, 2.367f, 9.306f)
            lineTo(6.78f, 13.72f)
            curveTo(7.073f, 14.013f, 7.073f, 14.487f, 6.78f, 14.78f)
            curveTo(6.487f, 15.073f, 6.013f, 15.073f, 5.72f, 14.78f)
            lineTo(2.04f, 11.101f)
            curveTo(2.013f, 11.397f, 2f, 11.697f, 2f, 12f)
            curveTo(2f, 12.333f, 2.016f, 12.663f, 2.048f, 12.988f)
            lineTo(6.53f, 17.47f)
            curveTo(6.823f, 17.763f, 6.823f, 18.237f, 6.53f, 18.53f)
            curveTo(6.237f, 18.823f, 5.763f, 18.823f, 5.47f, 18.53f)
            lineTo(2.753f, 15.814f)
            curveTo(4.252f, 19.445f, 7.828f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 7.828f, 19.445f, 4.252f, 15.814f, 2.753f)
            lineTo(18.53f, 5.47f)
            curveTo(18.823f, 5.763f, 18.823f, 6.237f, 18.53f, 6.53f)
            curveTo(18.237f, 6.823f, 17.763f, 6.823f, 17.47f, 6.53f)
            lineTo(12.988f, 2.048f)
            curveTo(12.663f, 2.016f, 12.333f, 2f, 12f, 2f)
            curveTo(11.697f, 2f, 11.397f, 2.013f, 11.101f, 2.04f)
            lineTo(14.78f, 5.72f)
            curveTo(15.073f, 6.013f, 15.073f, 6.487f, 14.78f, 6.78f)
            curveTo(14.487f, 7.073f, 14.013f, 7.073f, 13.72f, 6.78f)
            lineTo(9.306f, 2.367f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleHighlightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CircleHighlight, contentDescription = null)
    }
}
