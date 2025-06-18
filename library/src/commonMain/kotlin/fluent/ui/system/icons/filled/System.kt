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

public val FluentUi.Filled.System: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.System",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.946f, 5f)
            horizontalLineTo(19.054f)
            curveTo(20.678f, 5f, 22f, 6.304f, 22f, 7.92f)
            verticalLineTo(16.08f)
            curveTo(22f, 17.696f, 20.678f, 19f, 19.054f, 19f)
            horizontalLineTo(4.946f)
            curveTo(3.322f, 19f, 2f, 17.696f, 2f, 16.08f)
            verticalLineTo(7.92f)
            curveTo(2f, 6.304f, 3.322f, 5f, 4.946f, 5f)
            close()
            moveTo(4.946f, 7f)
            curveTo(4.421f, 7f, 4f, 7.415f, 4f, 7.92f)
            verticalLineTo(16.08f)
            curveTo(4f, 16.585f, 4.421f, 17f, 4.946f, 17f)
            horizontalLineTo(19.054f)
            curveTo(19.58f, 17f, 20f, 16.585f, 20f, 16.08f)
            verticalLineTo(7.92f)
            curveTo(20f, 7.415f, 19.58f, 7f, 19.054f, 7f)
            horizontalLineTo(4.946f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SystemPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.System, contentDescription = null)
    }
}
