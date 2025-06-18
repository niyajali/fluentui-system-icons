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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.FlipHorizontal: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipHorizontal",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.837f, 19.547f)
            curveTo(21.652f, 19.83f, 21.337f, 20f, 21f, 20f)
            horizontalLineTo(14f)
            curveTo(13.448f, 20f, 13f, 19.552f, 13f, 19f)
            lineTo(13f, 3f)
            curveTo(13f, 2.527f, 13.332f, 2.118f, 13.795f, 2.021f)
            curveTo(14.259f, 1.924f, 14.726f, 2.166f, 14.916f, 2.599f)
            lineTo(21.916f, 18.599f)
            curveTo(22.051f, 18.909f, 22.022f, 19.265f, 21.837f, 19.547f)
            close()
            moveTo(15f, 7.781f)
            verticalLineTo(18f)
            horizontalLineTo(19.471f)
            lineTo(15f, 7.781f)
            close()
            moveTo(2.5f, 20f)
            curveTo(2.329f, 20f, 2.17f, 19.913f, 2.078f, 19.768f)
            curveTo(1.986f, 19.623f, 1.975f, 19.442f, 2.048f, 19.287f)
            lineTo(10.048f, 2.287f)
            curveTo(10.147f, 2.075f, 10.381f, 1.961f, 10.609f, 2.012f)
            curveTo(10.838f, 2.063f, 11f, 2.266f, 11f, 2.5f)
            lineTo(11f, 19.5f)
            curveTo(11f, 19.776f, 10.776f, 20f, 10.5f, 20f)
            horizontalLineTo(2.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlipHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FlipHorizontal, contentDescription = null)
    }
}
