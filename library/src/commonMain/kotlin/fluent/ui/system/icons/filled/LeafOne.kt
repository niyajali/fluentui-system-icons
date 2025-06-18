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

public val FluentIcons.Filled.LeafOne: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LeafOne",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.037f, 3.048f)
            curveTo(11.717f, 2.6f, 12.64f, 2.674f, 13.238f, 3.272f)
            lineTo(16.949f, 6.984f)
            curveTo(19.682f, 9.717f, 19.682f, 14.148f, 16.949f, 16.881f)
            curveTo(16.802f, 17.028f, 16.65f, 17.167f, 16.494f, 17.299f)
            curveTo(16.103f, 17.626f, 15.685f, 17.905f, 15.248f, 18.134f)
            curveTo(14.462f, 18.546f, 13.613f, 18.799f, 12.75f, 18.891f)
            verticalLineTo(21.25f)
            curveTo(12.75f, 21.664f, 12.414f, 22f, 12f, 22f)
            curveTo(11.586f, 22f, 11.25f, 21.664f, 11.25f, 21.25f)
            verticalLineTo(18.891f)
            curveTo(9.716f, 18.727f, 8.227f, 18.057f, 7.051f, 16.881f)
            curveTo(4.318f, 14.148f, 4.318f, 9.717f, 7.051f, 6.984f)
            lineTo(10.763f, 3.272f)
            curveTo(10.763f, 3.272f, 10.763f, 3.272f, 10.763f, 3.272f)
            curveTo(10.848f, 3.187f, 10.94f, 3.112f, 11.037f, 3.048f)
            close()
            moveTo(12f, 11f)
            curveTo(11.586f, 11f, 11.25f, 11.335f, 11.25f, 11.75f)
            verticalLineTo(17.38f)
            curveTo(11.748f, 17.448f, 12.252f, 17.448f, 12.75f, 17.38f)
            verticalLineTo(11.75f)
            curveTo(12.75f, 11.335f, 12.414f, 11f, 12f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LeafOnePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LeafOne, contentDescription = null)
    }
}
