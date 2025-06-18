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

public val FluentUi.Filled.ArrowHookUpLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 19f)
            curveTo(7f, 19.552f, 7.448f, 20f, 8f, 20f)
            horizontalLineTo(13f)
            curveTo(15.242f, 20f, 17.011f, 19.222f, 18.218f, 17.977f)
            curveTo(19.414f, 16.744f, 20f, 15.113f, 20f, 13.5f)
            curveTo(20f, 11.887f, 19.414f, 10.256f, 18.218f, 9.023f)
            curveTo(17.011f, 7.778f, 15.242f, 7f, 13f, 7f)
            horizontalLineTo(8.414f)
            lineTo(10.457f, 4.957f)
            curveTo(10.848f, 4.567f, 10.848f, 3.933f, 10.457f, 3.543f)
            curveTo(10.067f, 3.152f, 9.433f, 3.152f, 9.043f, 3.543f)
            lineTo(5.293f, 7.293f)
            curveTo(4.902f, 7.683f, 4.902f, 8.317f, 5.293f, 8.707f)
            lineTo(9.043f, 12.457f)
            curveTo(9.433f, 12.848f, 10.067f, 12.848f, 10.457f, 12.457f)
            curveTo(10.848f, 12.067f, 10.848f, 11.433f, 10.457f, 11.043f)
            lineTo(8.414f, 9f)
            horizontalLineTo(13f)
            curveTo(14.758f, 9f, 15.989f, 9.597f, 16.782f, 10.415f)
            curveTo(17.586f, 11.244f, 18f, 12.363f, 18f, 13.5f)
            curveTo(18f, 14.637f, 17.586f, 15.756f, 16.782f, 16.585f)
            curveTo(15.989f, 17.403f, 14.758f, 18f, 13f, 18f)
            horizontalLineTo(8f)
            curveTo(7.448f, 18f, 7f, 18.448f, 7f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowHookUpLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowHookUpLeft, contentDescription = null)
    }
}
