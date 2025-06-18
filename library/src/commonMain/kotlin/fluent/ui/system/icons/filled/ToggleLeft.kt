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

public val FluentUi.Filled.ToggleLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ToggleLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17f, 7f)
            curveTo(19.761f, 7f, 22f, 9.239f, 22f, 12f)
            curveTo(22f, 14.761f, 19.761f, 17f, 17f, 17f)
            horizontalLineTo(7f)
            curveTo(4.239f, 17f, 2f, 14.761f, 2f, 12f)
            curveTo(2f, 9.239f, 4.239f, 7f, 7f, 7f)
            horizontalLineTo(17f)
            close()
            moveTo(7.25f, 14.5f)
            curveTo(8.631f, 14.5f, 9.75f, 13.381f, 9.75f, 12f)
            curveTo(9.75f, 10.619f, 8.631f, 9.5f, 7.25f, 9.5f)
            curveTo(5.869f, 9.5f, 4.75f, 10.619f, 4.75f, 12f)
            curveTo(4.75f, 13.381f, 5.869f, 14.5f, 7.25f, 14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ToggleLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ToggleLeft, contentDescription = null)
    }
}
