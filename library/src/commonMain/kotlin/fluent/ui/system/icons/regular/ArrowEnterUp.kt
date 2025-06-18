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

public val FluentUi.Regular.ArrowEnterUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowEnterUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20f, 21.251f)
            curveTo(20f, 21.665f, 19.664f, 22.001f, 19.25f, 22.001f)
            lineTo(12.75f, 22.001f)
            curveTo(10.679f, 22.001f, 9f, 20.322f, 9f, 18.251f)
            lineTo(9f, 4.586f)
            lineTo(5.28f, 8.306f)
            curveTo(5.014f, 8.572f, 4.597f, 8.596f, 4.304f, 8.378f)
            lineTo(4.22f, 8.306f)
            curveTo(3.953f, 8.039f, 3.929f, 7.623f, 4.147f, 7.329f)
            lineTo(4.22f, 7.245f)
            lineTo(9.22f, 2.245f)
            curveTo(9.486f, 1.979f, 9.903f, 1.955f, 10.196f, 2.172f)
            lineTo(10.28f, 2.245f)
            lineTo(15.28f, 7.245f)
            curveTo(15.573f, 7.538f, 15.573f, 8.013f, 15.28f, 8.306f)
            curveTo(15.014f, 8.572f, 14.597f, 8.596f, 14.304f, 8.378f)
            lineTo(14.22f, 8.306f)
            lineTo(10.5f, 4.586f)
            lineTo(10.5f, 18.251f)
            curveTo(10.5f, 19.441f, 11.425f, 20.416f, 12.596f, 20.495f)
            lineTo(12.75f, 20.501f)
            lineTo(19.25f, 20.501f)
            curveTo(19.664f, 20.501f, 20f, 20.836f, 20f, 21.251f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowEnterUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowEnterUp, contentDescription = null)
    }
}
