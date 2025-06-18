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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.VideoClip: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClip",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 3f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 21f, 22f, 19.545f, 22f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
            horizontalLineTo(5.25f)
            close()
            moveTo(9f, 9.251f)
            curveTo(9f, 8.49f, 9.815f, 8.008f, 10.482f, 8.374f)
            lineTo(15.481f, 11.124f)
            curveTo(16.172f, 11.504f, 16.172f, 12.497f, 15.481f, 12.877f)
            lineTo(10.482f, 15.626f)
            curveTo(9.815f, 15.993f, 9f, 15.511f, 9f, 14.75f)
            verticalLineTo(9.251f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoClipPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoClip, contentDescription = null)
    }
}
