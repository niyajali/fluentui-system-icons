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

public val FluentUi.Filled.DocumentHeaderFooter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentHeaderFooter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 2f)
            curveTo(18.941f, 2f, 19.916f, 2.925f, 19.995f, 4.096f)
            lineTo(20f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(20f, 20.941f, 19.075f, 21.916f, 17.904f, 21.995f)
            lineTo(17.75f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.059f, 22f, 4.084f, 21.075f, 4.005f, 19.904f)
            lineTo(4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.059f, 4.925f, 2.084f, 6.096f, 2.005f)
            lineTo(6.25f, 2f)
            horizontalLineTo(17.75f)
            close()
            moveTo(7.005f, 6.505f)
            curveTo(7.005f, 7.333f, 7.677f, 8.005f, 8.505f, 8.005f)
            horizontalLineTo(15.505f)
            curveTo(16.334f, 8.005f, 17.005f, 7.333f, 17.005f, 6.505f)
            curveTo(17.005f, 5.676f, 16.334f, 5.004f, 15.505f, 5.004f)
            horizontalLineTo(8.505f)
            curveTo(7.677f, 5.004f, 7.005f, 5.676f, 7.005f, 6.505f)
            close()
            moveTo(7.005f, 17.506f)
            curveTo(7.005f, 18.334f, 7.677f, 19.006f, 8.505f, 19.006f)
            horizontalLineTo(15.505f)
            curveTo(16.334f, 19.006f, 17.005f, 18.334f, 17.005f, 17.506f)
            curveTo(17.005f, 16.677f, 16.334f, 16.006f, 15.505f, 16.006f)
            horizontalLineTo(8.505f)
            curveTo(7.677f, 16.006f, 7.005f, 16.677f, 7.005f, 17.506f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentHeaderFooterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentHeaderFooter, contentDescription = null)
    }
}
