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

public val FluentUi.Regular.HomeEmpty: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HomeEmpty",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.549f, 2.533f)
            curveTo(11.387f, 1.826f, 12.613f, 1.826f, 13.451f, 2.533f)
            lineTo(20.201f, 8.227f)
            curveTo(20.708f, 8.655f, 21f, 9.284f, 21f, 9.947f)
            verticalLineTo(18.75f)
            curveTo(21f, 19.993f, 19.993f, 21f, 18.75f, 21f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
            verticalLineTo(9.947f)
            curveTo(3f, 9.284f, 3.292f, 8.655f, 3.799f, 8.227f)
            lineTo(10.549f, 2.533f)
            close()
            moveTo(12.484f, 3.679f)
            curveTo(12.204f, 3.443f, 11.796f, 3.443f, 11.516f, 3.679f)
            lineTo(4.766f, 9.374f)
            curveTo(4.597f, 9.516f, 4.5f, 9.726f, 4.5f, 9.947f)
            verticalLineTo(18.75f)
            curveTo(4.5f, 19.164f, 4.836f, 19.5f, 5.25f, 19.5f)
            horizontalLineTo(18.75f)
            curveTo(19.164f, 19.5f, 19.5f, 19.164f, 19.5f, 18.75f)
            verticalLineTo(9.947f)
            curveTo(19.5f, 9.726f, 19.403f, 9.516f, 19.234f, 9.374f)
            lineTo(12.484f, 3.679f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HomeEmptyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HomeEmpty, contentDescription = null)
    }
}
