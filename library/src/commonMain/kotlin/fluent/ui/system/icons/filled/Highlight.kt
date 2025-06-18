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

public val FluentIcons.Filled.Highlight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Highlight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 2f)
            curveTo(4.007f, 2f, 3f, 3.007f, 3f, 4.25f)
            verticalLineTo(7.25f)
            curveTo(3f, 8.493f, 4.007f, 9.5f, 5.25f, 9.5f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 9.5f, 21f, 8.493f, 21f, 7.25f)
            verticalLineTo(4.25f)
            curveTo(21f, 3.007f, 19.993f, 2f, 18.75f, 2f)
            horizontalLineTo(5.25f)
            close()
            moveTo(5f, 11.75f)
            verticalLineTo(11f)
            horizontalLineTo(19f)
            verticalLineTo(11.75f)
            curveTo(19f, 12.993f, 17.993f, 14f, 16.75f, 14f)
            horizontalLineTo(7.25f)
            curveTo(6.007f, 14f, 5f, 12.993f, 5f, 11.75f)
            close()
            moveTo(7.503f, 15.5f)
            horizontalLineTo(16.501f)
            lineTo(16.502f, 16.788f)
            curveTo(16.502f, 17.603f, 16.062f, 18.349f, 15.36f, 18.746f)
            lineTo(15.206f, 18.826f)
            lineTo(8.571f, 21.932f)
            curveTo(8.105f, 22.15f, 7.574f, 21.845f, 7.51f, 21.354f)
            lineTo(7.503f, 21.253f)
            lineTo(7.503f, 15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HighlightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Highlight, contentDescription = null)
    }
}
