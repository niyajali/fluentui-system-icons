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

public val FluentUi.Filled.DataFunnel: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataFunnel",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.248f, 7.504f)
            curveTo(20.768f, 7.504f, 22f, 6.272f, 22f, 4.752f)
            curveTo(22f, 3.232f, 20.768f, 2f, 19.248f, 2f)
            horizontalLineTo(4.75f)
            curveTo(3.23f, 2f, 1.998f, 3.232f, 1.998f, 4.752f)
            curveTo(1.998f, 6.272f, 3.23f, 7.504f, 4.75f, 7.504f)
            horizontalLineTo(19.248f)
            close()
            moveTo(17.248f, 14.504f)
            curveTo(18.768f, 14.504f, 20f, 13.272f, 20f, 11.752f)
            curveTo(20f, 10.232f, 18.768f, 9f, 17.248f, 9f)
            horizontalLineTo(6.75f)
            curveTo(5.23f, 9f, 3.998f, 10.232f, 3.998f, 11.752f)
            curveTo(3.998f, 13.272f, 5.23f, 14.504f, 6.75f, 14.504f)
            horizontalLineTo(17.248f)
            close()
            moveTo(17f, 18.752f)
            curveTo(17f, 17.232f, 15.768f, 16f, 14.248f, 16f)
            horizontalLineTo(9.75f)
            curveTo(8.23f, 16f, 6.998f, 17.232f, 6.998f, 18.752f)
            curveTo(6.998f, 20.272f, 8.23f, 21.504f, 9.75f, 21.504f)
            horizontalLineTo(14.248f)
            curveTo(15.768f, 21.504f, 17f, 20.272f, 17f, 18.752f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataFunnelPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DataFunnel, contentDescription = null)
    }
}
