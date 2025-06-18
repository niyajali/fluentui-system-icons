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

public val FluentUi.Filled.PenDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PenDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.891f, 3.048f)
            curveTo(17.288f, 1.65f, 19.554f, 1.65f, 20.952f, 3.047f)
            curveTo(22.349f, 4.445f, 22.349f, 6.71f, 20.952f, 8.108f)
            lineTo(17.907f, 11.153f)
            curveTo(17.454f, 11.053f, 16.983f, 11f, 16.5f, 11f)
            curveTo(12.91f, 11f, 10f, 13.91f, 10f, 17.5f)
            curveTo(10f, 17.984f, 10.053f, 18.455f, 10.153f, 18.908f)
            lineTo(9.002f, 20.059f)
            curveTo(8.595f, 20.466f, 8.084f, 20.752f, 7.525f, 20.885f)
            lineTo(2.924f, 21.98f)
            curveTo(2.67f, 22.041f, 2.404f, 21.965f, 2.22f, 21.781f)
            curveTo(2.036f, 21.597f, 1.96f, 21.33f, 2.02f, 21.077f)
            lineTo(3.116f, 16.476f)
            curveTo(3.249f, 15.917f, 3.535f, 15.405f, 3.941f, 14.999f)
            lineTo(15.891f, 3.048f)
            close()
            moveTo(22f, 17.5f)
            curveTo(22f, 20.538f, 19.538f, 23f, 16.5f, 23f)
            curveTo(13.462f, 23f, 11f, 20.538f, 11f, 17.5f)
            curveTo(11f, 14.462f, 13.462f, 12f, 16.5f, 12f)
            curveTo(19.538f, 12f, 22f, 14.462f, 22f, 17.5f)
            close()
            moveTo(14.854f, 15.146f)
            curveTo(14.658f, 14.951f, 14.342f, 14.951f, 14.146f, 15.146f)
            curveTo(13.951f, 15.342f, 13.951f, 15.658f, 14.146f, 15.854f)
            lineTo(15.793f, 17.5f)
            lineTo(14.146f, 19.146f)
            curveTo(13.951f, 19.342f, 13.951f, 19.658f, 14.146f, 19.854f)
            curveTo(14.342f, 20.049f, 14.658f, 20.049f, 14.854f, 19.854f)
            lineTo(16.5f, 18.207f)
            lineTo(18.146f, 19.854f)
            curveTo(18.342f, 20.049f, 18.658f, 20.049f, 18.854f, 19.854f)
            curveTo(19.049f, 19.658f, 19.049f, 19.342f, 18.854f, 19.146f)
            lineTo(17.207f, 17.5f)
            lineTo(18.854f, 15.854f)
            curveTo(19.049f, 15.658f, 19.049f, 15.342f, 18.854f, 15.146f)
            curveTo(18.658f, 14.951f, 18.342f, 14.951f, 18.146f, 15.146f)
            lineTo(16.5f, 16.793f)
            lineTo(14.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PenDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PenDismiss, contentDescription = null)
    }
}
