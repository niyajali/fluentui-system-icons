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

public val FluentUi.Filled.SplitVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SplitVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.5f, 2.75f)
            curveTo(12.5f, 2.336f, 12.164f, 2f, 11.75f, 2f)
            curveTo(11.336f, 2f, 11f, 2.336f, 11f, 2.75f)
            lineTo(11f, 21.25f)
            curveTo(11f, 21.664f, 11.336f, 22f, 11.75f, 22f)
            curveTo(12.164f, 22f, 12.5f, 21.664f, 12.5f, 21.25f)
            lineTo(12.5f, 2.75f)
            close()
            moveTo(2f, 6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineTo(10f)
            verticalLineTo(20f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(19.25f, 20f)
            horizontalLineTo(13.5f)
            verticalLineTo(4f)
            horizontalLineTo(19.25f)
            curveTo(20.493f, 4f, 21.5f, 5.007f, 21.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21.5f, 18.993f, 20.493f, 20f, 19.25f, 20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SplitVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SplitVertical, contentDescription = null)
    }
}
