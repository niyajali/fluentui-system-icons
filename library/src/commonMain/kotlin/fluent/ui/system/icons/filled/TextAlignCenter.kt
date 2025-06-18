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

public val FluentUi.Filled.TextAlignCenter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAlignCenter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 6f)
            curveTo(4f, 5.448f, 4.448f, 5f, 5f, 5f)
            horizontalLineTo(19f)
            curveTo(19.552f, 5f, 20f, 5.448f, 20f, 6f)
            curveTo(20f, 6.552f, 19.552f, 7f, 19f, 7f)
            horizontalLineTo(5f)
            curveTo(4.448f, 7f, 4f, 6.552f, 4f, 6f)
            close()
            moveTo(6f, 18f)
            curveTo(6f, 17.448f, 6.448f, 17f, 7f, 17f)
            horizontalLineTo(17f)
            curveTo(17.552f, 17f, 18f, 17.448f, 18f, 18f)
            curveTo(18f, 18.552f, 17.552f, 19f, 17f, 19f)
            horizontalLineTo(7f)
            curveTo(6.448f, 19f, 6f, 18.552f, 6f, 18f)
            close()
            moveTo(3f, 11f)
            curveTo(2.448f, 11f, 2f, 11.448f, 2f, 12f)
            curveTo(2f, 12.552f, 2.448f, 13f, 3f, 13f)
            horizontalLineTo(21f)
            curveTo(21.552f, 13f, 22f, 12.552f, 22f, 12f)
            curveTo(22f, 11.448f, 21.552f, 11f, 21f, 11f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextAlignCenterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextAlignCenter, contentDescription = null)
    }
}
