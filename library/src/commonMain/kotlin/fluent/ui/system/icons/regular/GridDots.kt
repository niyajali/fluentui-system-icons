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

public val FluentUi.Regular.GridDots: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.GridDots",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 17.5f)
            curveTo(12.828f, 17.5f, 13.5f, 18.172f, 13.5f, 19f)
            curveTo(13.5f, 19.828f, 12.828f, 20.5f, 12f, 20.5f)
            curveTo(11.172f, 20.5f, 10.5f, 19.828f, 10.5f, 19f)
            curveTo(10.5f, 18.172f, 11.172f, 17.5f, 12f, 17.5f)
            close()
            moveTo(19f, 17.5f)
            curveTo(19.828f, 17.5f, 20.5f, 18.172f, 20.5f, 19f)
            curveTo(20.5f, 19.828f, 19.828f, 20.5f, 19f, 20.5f)
            curveTo(18.172f, 20.5f, 17.5f, 19.828f, 17.5f, 19f)
            curveTo(17.5f, 18.172f, 18.172f, 17.5f, 19f, 17.5f)
            close()
            moveTo(5f, 17.5f)
            curveTo(5.828f, 17.5f, 6.5f, 18.172f, 6.5f, 19f)
            curveTo(6.5f, 19.828f, 5.828f, 20.5f, 5f, 20.5f)
            curveTo(4.172f, 20.5f, 3.5f, 19.828f, 3.5f, 19f)
            curveTo(3.5f, 18.172f, 4.172f, 17.5f, 5f, 17.5f)
            close()
            moveTo(12f, 10.5f)
            curveTo(12.828f, 10.5f, 13.5f, 11.172f, 13.5f, 12f)
            curveTo(13.5f, 12.828f, 12.828f, 13.5f, 12f, 13.5f)
            curveTo(11.172f, 13.5f, 10.5f, 12.828f, 10.5f, 12f)
            curveTo(10.5f, 11.172f, 11.172f, 10.5f, 12f, 10.5f)
            close()
            moveTo(19f, 10.5f)
            curveTo(19.828f, 10.5f, 20.5f, 11.172f, 20.5f, 12f)
            curveTo(20.5f, 12.828f, 19.828f, 13.5f, 19f, 13.5f)
            curveTo(18.172f, 13.5f, 17.5f, 12.828f, 17.5f, 12f)
            curveTo(17.5f, 11.172f, 18.172f, 10.5f, 19f, 10.5f)
            close()
            moveTo(5f, 10.5f)
            curveTo(5.828f, 10.5f, 6.5f, 11.172f, 6.5f, 12f)
            curveTo(6.5f, 12.828f, 5.828f, 13.5f, 5f, 13.5f)
            curveTo(4.172f, 13.5f, 3.5f, 12.828f, 3.5f, 12f)
            curveTo(3.5f, 11.172f, 4.172f, 10.5f, 5f, 10.5f)
            close()
            moveTo(12f, 3.5f)
            curveTo(12.828f, 3.5f, 13.5f, 4.172f, 13.5f, 5f)
            curveTo(13.5f, 5.828f, 12.828f, 6.5f, 12f, 6.5f)
            curveTo(11.172f, 6.5f, 10.5f, 5.828f, 10.5f, 5f)
            curveTo(10.5f, 4.172f, 11.172f, 3.5f, 12f, 3.5f)
            close()
            moveTo(19f, 3.5f)
            curveTo(19.828f, 3.5f, 20.5f, 4.172f, 20.5f, 5f)
            curveTo(20.5f, 5.828f, 19.828f, 6.5f, 19f, 6.5f)
            curveTo(18.172f, 6.5f, 17.5f, 5.828f, 17.5f, 5f)
            curveTo(17.5f, 4.172f, 18.172f, 3.5f, 19f, 3.5f)
            close()
            moveTo(5f, 3.5f)
            curveTo(5.828f, 3.5f, 6.5f, 4.172f, 6.5f, 5f)
            curveTo(6.5f, 5.828f, 5.828f, 6.5f, 5f, 6.5f)
            curveTo(4.172f, 6.5f, 3.5f, 5.828f, 3.5f, 5f)
            curveTo(3.5f, 4.172f, 4.172f, 3.5f, 5f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GridDotsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.GridDots, contentDescription = null)
    }
}
