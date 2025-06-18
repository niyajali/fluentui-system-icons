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

public val FluentUi.Filled.TextBold: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextBold",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.25f, 5.5f)
            curveTo(9.25f, 4.534f, 8.467f, 3.75f, 7.5f, 3.75f)
            curveTo(6.534f, 3.75f, 5.75f, 4.534f, 5.75f, 5.5f)
            verticalLineTo(9.887f)
            curveTo(5.75f, 13.246f, 8.86f, 15.74f, 12.139f, 15.012f)
            lineTo(13.5f, 14.709f)
            verticalLineTo(18.25f)
            curveTo(13.5f, 19.216f, 14.283f, 20f, 15.25f, 20f)
            curveTo(16.216f, 20f, 17f, 19.216f, 17f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(17f, 4.784f, 16.216f, 4f, 15.25f, 4f)
            curveTo(14.283f, 4f, 13.5f, 4.784f, 13.5f, 5.75f)
            verticalLineTo(11.124f)
            lineTo(11.38f, 11.595f)
            curveTo(10.287f, 11.838f, 9.25f, 11.007f, 9.25f, 9.887f)
            verticalLineTo(5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextBoldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextBold, contentDescription = null)
    }
}
