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

public val FluentUi.Filled.Wifi3: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wifi3",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.939f, 16.446f)
            curveTo(11.525f, 15.86f, 12.475f, 15.86f, 13.061f, 16.446f)
            curveTo(13.648f, 17.032f, 13.648f, 17.982f, 13.061f, 18.569f)
            curveTo(12.475f, 19.155f, 11.525f, 19.155f, 10.939f, 18.569f)
            curveTo(10.352f, 17.982f, 10.352f, 17.032f, 10.939f, 16.446f)
            close()
            moveTo(8.335f, 13.705f)
            curveTo(10.378f, 11.661f, 13.692f, 11.661f, 15.735f, 13.705f)
            curveTo(16.196f, 14.165f, 16.573f, 14.729f, 16.836f, 15.329f)
            curveTo(17.058f, 15.835f, 16.828f, 16.425f, 16.322f, 16.646f)
            curveTo(15.816f, 16.868f, 15.226f, 16.638f, 15.004f, 16.132f)
            curveTo(14.839f, 15.754f, 14.601f, 15.399f, 14.321f, 15.119f)
            curveTo(13.058f, 13.856f, 11.012f, 13.856f, 9.749f, 15.119f)
            curveTo(9.471f, 15.397f, 9.244f, 15.738f, 9.077f, 16.119f)
            curveTo(8.856f, 16.625f, 8.266f, 16.856f, 7.76f, 16.634f)
            curveTo(7.254f, 16.413f, 7.023f, 15.823f, 7.245f, 15.317f)
            curveTo(7.509f, 14.714f, 7.875f, 14.165f, 8.335f, 13.705f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Wifi3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Wifi3, contentDescription = null)
    }
}
