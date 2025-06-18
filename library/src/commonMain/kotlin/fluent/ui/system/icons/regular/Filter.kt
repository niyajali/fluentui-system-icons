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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Filter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Filter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.5f, 16f)
            curveTo(13.914f, 16f, 14.25f, 16.336f, 14.25f, 16.75f)
            curveTo(14.25f, 17.164f, 13.914f, 17.5f, 13.5f, 17.5f)
            horizontalLineTo(10.5f)
            curveTo(10.086f, 17.5f, 9.75f, 17.164f, 9.75f, 16.75f)
            curveTo(9.75f, 16.336f, 10.086f, 16f, 10.5f, 16f)
            horizontalLineTo(13.5f)
            close()
            moveTo(16.5f, 11f)
            curveTo(16.914f, 11f, 17.25f, 11.336f, 17.25f, 11.75f)
            curveTo(17.25f, 12.164f, 16.914f, 12.5f, 16.5f, 12.5f)
            horizontalLineTo(7.5f)
            curveTo(7.086f, 12.5f, 6.75f, 12.164f, 6.75f, 11.75f)
            curveTo(6.75f, 11.336f, 7.086f, 11f, 7.5f, 11f)
            horizontalLineTo(16.5f)
            close()
            moveTo(19.5f, 6f)
            curveTo(19.914f, 6f, 20.25f, 6.336f, 20.25f, 6.75f)
            curveTo(20.25f, 7.164f, 19.914f, 7.5f, 19.5f, 7.5f)
            horizontalLineTo(4.5f)
            curveTo(4.086f, 7.5f, 3.75f, 7.164f, 3.75f, 6.75f)
            curveTo(3.75f, 6.336f, 4.086f, 6f, 4.5f, 6f)
            horizontalLineTo(19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FilterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Filter, contentDescription = null)
    }
}
